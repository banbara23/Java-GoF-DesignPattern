
package com.ikmr.banbara23.java_gof_designpattern.No03_builder;

/**
 * ディレクタクラス <br/>
 * ビルダクラスのメソッドを生成手順にそって呼び出す機能をもつビルダクラス運用専門のクラス
 */
public class MyDirectorB {
    public MyClass createMyClass(MyBuilder builder) {

        // 以下、呼ぶ順番が決まっていると仮定する
        builder.addFirstName();
        builder.addLastName();

        return builder.getMyClass();
    }
}
