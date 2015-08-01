
package com.ikmr.banbara23.java_gof_designpattern.No03_builder;

/**
 * 作りたいオブジェクトクラス
 */
public class MyClass {
    private String name;

    public MyClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
