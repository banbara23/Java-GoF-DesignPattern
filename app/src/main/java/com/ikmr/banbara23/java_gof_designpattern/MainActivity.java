
package com.ikmr.banbara23.java_gof_designpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.ikmr.banbara23.java_gof_designpattern.No01_factory_method.MyClassA;
import com.ikmr.banbara23.java_gof_designpattern.No01_factory_method.MyClassA1;
import com.ikmr.banbara23.java_gof_designpattern.No01_factory_method.MyClassA2;
import com.ikmr.banbara23.java_gof_designpattern.No01_factory_method.MyClassB;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ファクトリメソッドパターン
        factoryMethodPattern();

    }

    /**
     * ファクトリメソッドパターン <br>
     * AとBがペアにして使う事がはっきり決定されている場合に使うパターン<br>
     * 単体で使う場合がある場合には向いてない
     */
    private void factoryMethodPattern() {
        // スーパークラスを使用している所に注目
        MyClassA myClassA1 = new MyClassA1();
        Log.d("MainActivity", myClassA1.getName() + myClassA1.getAge());

        MyClassB myClassB1 = myClassA1.createMyClassB(); // ファクトリメソッド（ペアとなるオブジェクトを生成してくれるメソッド）
        Log.d("MainActivity", myClassB1.getAddress() + myClassB1.getFloor());

        MyClassA myClassA2 = new MyClassA2();
        Log.d("MainActivity", myClassA2.getName() + myClassA2.getAge());

        MyClassB myClassB2 = myClassA2.createMyClassB(); // ファクトリメソッド（MyClassB1か2のどちらかを判定する必要がない）
        Log.d("MainActivity", myClassB2.getAddress() + myClassB2.getFloor());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
