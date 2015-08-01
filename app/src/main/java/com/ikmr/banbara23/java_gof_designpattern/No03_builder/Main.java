
package com.ikmr.banbara23.java_gof_designpattern.No03_builder;

/**
 * ディレクタクラスを呼び出すサンプル
 */
public class Main {
    public Main() {
        MyBuilder builder = new MyBuilder();

        // フルネームを持つMyClassを作成
        MyDirectorA myDirectorA = new MyDirectorA();
        MyClass myClass1 = myDirectorA.createMyClass(builder);

        MyDirectorB myDirectorB = new MyDirectorB();
        MyClass myClass2 = myDirectorB.createMyClass(builder);
    }
}
