
package com.ikmr.banbara23.java_gof_designpattern.No02_abstract_factory;

/**
 * Created by banbara23 on 15/07/31.
 */
public abstract class MyFactory {
    public abstract MyClassA createMyClassA();

    public abstract MyClassB createMyClassB();

    public static MyFactory getFactory(String owner) {
        if (owner.equals("Suzuki")) {
            return new MyFactory1();
        }
        else if (owner.equals("Tanaka")) {
            return new MyFactory2();
        }
        else {
            return null;
        }
    }
}
