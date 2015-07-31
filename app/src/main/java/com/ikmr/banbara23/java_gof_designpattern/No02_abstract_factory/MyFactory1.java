
package com.ikmr.banbara23.java_gof_designpattern.No02_abstract_factory;

/**
 * スズキさんのファクトリクラス
 */
public class MyFactory1 extends MyFactory {
    @Override
    public MyClassA createMyClassA() {
        return new MyClassA1();
    }

    @Override
    public MyClassB createMyClassB() {
        return new MyClassB1();
    }
}
