
package com.ikmr.banbara23.java_gof_designpattern.No05_singleton;

/**
 * 基本シングルトンパターン
 */
public class MyClass {
    static MyClass uniqueInstance;

    public MyClass() {
    }

    static MyClass getInstance() {

        // この記述だとマルチスレッド環境では同時にオブジェクトを生成してしまう可能性がごくわずかにあり
        // たまたま同時にgetInstance()を呼んでしまい、生成済みシングルトンオブジェクトのnullチェックが間に合わず、
        // どちらのスレッドでも「まだオブジェクトを生成していない」と判断されてしまい、
        // 両方でコンストラクタを呼んで２このオブジェクトを作成する事が起こる
        if (uniqueInstance == null) {
            uniqueInstance = new MyClass();
        }
        return uniqueInstance;

    }
}
