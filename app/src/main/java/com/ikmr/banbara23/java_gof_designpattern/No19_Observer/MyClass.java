
package com.ikmr.banbara23.java_gof_designpattern.No19_Observer;

import java.util.Vector;

/**
 * オブジェクトクラス
 */
public class MyClass {

    int value = 0;
    java.util.Vector observers = new Vector();

    MyObserver observer;

    void addObserver(MyObserver observer) {
        observers.add(observer);
    }

    void doIt() {
        // 状態を変化させます
        value++;

        // オブザーバーオブジェクト全てに通知します
        observer.done(value);
        for (int i = 0; i < observers.size(); i++) {
            MyObserver observer = (MyObserver) observers.get(i);
            observer.done(value);
        }
    }
}
