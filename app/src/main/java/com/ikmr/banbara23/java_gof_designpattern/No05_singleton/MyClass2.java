
package com.ikmr.banbara23.java_gof_designpattern.No05_singleton;

/**
 * シングルトンの定石パターン
 */
public class MyClass2 {
    static MyClass2 uniqueInstance;

    public MyClass2() {
    }

    static MyClass2 getInstance() {
        // nullチェック１回目
        if (uniqueInstance == null) {
            // 同時にnullチェックされる事をsynchronizedで制御する
            synchronized (MyClass2.class) {
                // nullチェック2回目
                if (uniqueInstance == null) {
                    uniqueInstance = new MyClass2();
                }
            }
        }
        return uniqueInstance;
    }
}
