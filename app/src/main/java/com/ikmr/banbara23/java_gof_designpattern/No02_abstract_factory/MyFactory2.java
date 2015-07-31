
package com.ikmr.banbara23.java_gof_designpattern.No02_abstract_factory;

/**
 * タナカさんのファクトリクラス
 */
public class MyFactory2 extends MyFactory {
    @Override
    public MyClassA createMyClassA() {
        return new MyClassA2();
    }

    @Override
    public MyClassB createMyClassB() {
        return new MyClassB2();
    }
}
