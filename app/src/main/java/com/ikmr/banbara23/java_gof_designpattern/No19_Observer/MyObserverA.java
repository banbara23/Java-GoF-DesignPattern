
package com.ikmr.banbara23.java_gof_designpattern.No19_Observer;

import android.util.Log;

/**
 * 
 */
public class MyObserverA implements MyObserver {
    @Override
    public void done(int updatedValue) {
        Log.d("MyObserverA", "updatedValue:" + updatedValue);
    }
}
