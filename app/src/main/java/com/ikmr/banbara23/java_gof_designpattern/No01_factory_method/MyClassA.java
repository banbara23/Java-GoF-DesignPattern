
package com.ikmr.banbara23.java_gof_designpattern.No01_factory_method;

/**
 * 人間の属性を返すクラスA 名前、年齢 を返す
 */
public abstract class MyClassA {
    public abstract String getName();

    public abstract int getAge();

    // ファクトリメソッド
    public abstract MyClassB createMyClassB();
}
