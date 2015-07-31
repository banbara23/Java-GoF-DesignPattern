
package com.ikmr.banbara23.java_gof_designpattern.No02_abstract_factory;

import android.util.Log;

/**
 * 
 */
public class MyMain {

    public MyMain() {
        // 引数を渡して適切なファクトリオブジェクトを入手する
        MyFactory myFactory = MyFactory.getFactory("Suzuki");

        if (myFactory == null) {
            return;
        }

        MyClassA myClassA = myFactory.createMyClassA();
        MyClassB myClassB = myFactory.createMyClassB();

        // 入手したのがMyClassA1なのかA2なのか知らないまま使う事ができる
        Log.d("MyMain", myClassA.getAge() + " " + myClassA.getName());

        // 入手したのがMyClassB1なのかB2なのか知らないまま使う事ができる
        Log.d("MyMain", myClassB.getDate() + " " + myClassB.getVendor());
    }
}
