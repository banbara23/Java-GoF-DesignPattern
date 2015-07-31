
package com.ikmr.banbara23.java_gof_designpattern.No01_factory_method;

/**
 * このクラスはMyClassB1とペアで使う必要がある、とする <br/>
 * createMyClassBでペアクラスを取得できる
 */
public class MyClassA1 extends MyClassA {

    @Override
    public String getName() {
        return "Suzuki";
    }

    @Override
    public int getAge() {
        return 23;
    }

    @Override
    public MyClassB createMyClassB() {
        return new MyClassB1();
    }
}
