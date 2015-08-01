#Singletonパターン

##目的
あるクラスのオブジェクトを1個だけ作って共有したい

##効果
システムの起動から就労までの間に、そのクラスのオブジェクトが1個しか存在しないことを保証します

##注意
Singletonパターンは本当に１個しかオブジェクトが必要かどうか慎重に検討してから使うべき。  
もし開発途中でそのクラスのオブジェクトが実は２個以上必要である事に気づくと、その時点でSingletonパターンは破綻する。  
特定のクラスを安易に「シングルトンである」と判断しない方がいい。

##メモ

####基本Singletonパターン
```java
public class MyClass {
    static MyClass uniqueInstance;

    public MyClass() {
    }

    static MyClass getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new MyClass();
        }
        return uniqueInstance;

    }
}
```
この記述だとマルチスレッド環境では同時にオブジェクトを生成してしまう可能性がごくわずかにあり  
たまたま同時にgetInstance()を呼んでしまい、生成済みシングルトンオブジェクトのnullチェックが間に合わず、  
どちらのスレッドでも「まだオブジェクトを生成していない」と判断されてしまい、  
両方でコンストラクタを呼んで２このオブジェクトを作成する事が起こる

---

####定石Singletonパターン
```java
public class MyClass2 {
    static MyClass2 uniqueInstance;

    public MyClass2() {
    }

    static MyClass2 getInstance() {
        // nullチェック１回目
        if (uniqueInstance == null) {
            // 同時にnullチェックされる事をsynchronizedで制御する
            synchronized (MyClass2.class) {
                // nullチェック2回目
                if (uniqueInstance == null) {
                    uniqueInstance = new MyClass2();
                }
            }
        }
        return uniqueInstance;
    }
}

```
上記コードでは2回のnullチェックを行っているが、それは、synchronized文の実行は非常に負荷が高いので、シングルトンがすでに生成済みの状態では無駄なsynchronized文を実行しなくてすみようにしている。  
また、１回めのnullチェックの直後で、synchronized文を実行する直前に、別のスレッドによってシングルトンオブジェクトの生成が開始されてしまわないとも限らないので、
たとえ１回めのnullチェックで、シングルトンオブジェクトを未生成だと判断されたとしても、念のためもう１度チェックしている。

synchronizedのカッコの中には「MyClass2.class」とあるが、これは一見クラスファイル名のように見える。  
実はこれはクラスファイル名ではなくて、JavaVMの上でMyClass2クラスの各種属性を保持している特殊なオブジェクト(java.lang.Classクラスのオブジェクト)を示す「class」という名前の一種の定数。  
任意のクラスには「クラス名.class」と書くだけで参照できるClassオブジェクトがJavaVM上で自動的に生成されて定数として保持さている。  
staticメソッドの中でsynchronized文を実行するときは、カッコの中にかける適当なオブジェクトがないので、この隠しオブジェクトをかわりに使うというのが定石となっている。

##構成図
![画像](https://raw.githubusercontent.com/banbara23/Java-GoF-DesignPattern/master/doc/image/5_Singleton.jpg)
