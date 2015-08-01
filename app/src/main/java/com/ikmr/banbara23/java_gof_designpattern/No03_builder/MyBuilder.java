
package com.ikmr.banbara23.java_gof_designpattern.No03_builder;

/**
 * MyClassを作成するビルダークラス
 */
public class MyBuilder {
    String name;

    void addFirstName() {
        name += "Tarou";
    }

    void addMiddleName() {
        name += "Steve";
    }

    void addLastName() {
        name += "Tanaka";
    }

    public MyClass getMyClass() {
        MyClass result = new MyClass(name);
        name = "";
        return result;
    }
}
