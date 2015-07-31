
package com.ikmr.banbara23.java_gof_designpattern.No01_factory_method;

/**
 * このクラスはMyClassB2とペアで使う必要がある、とする
 */
public class MyClassA2 extends MyClassA {
    @Override
    public String getName() {
        return "Tanaka";
    }

    @Override
    public int getAge() {
        return 29;
    }

    @Override
    public MyClassB createMyClassB() {
        return new MyClassB2();
    }
}
