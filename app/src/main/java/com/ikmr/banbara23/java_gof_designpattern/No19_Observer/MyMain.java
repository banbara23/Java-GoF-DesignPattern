
package com.ikmr.banbara23.java_gof_designpattern.No19_Observer;

/**
 * 開始クラス
 */
public class MyMain {

    public void main() {

        MyClass myClass = new MyClass();
        MyObserverA observerA = new MyObserverA();
        MyObserverB observerB = new MyObserverB();

        myClass.addObserver(observerA);
        myClass.addObserver(observerB);

        // 状態変化
        myClass.doIt();
        myClass.doIt();
        myClass.doIt();

    }
}
