package com.libraryprojects.logutil;

import android.util.Log;

/**
 * Created by anand-trisys on 20/8/17.
 */

public class LogDebug
{
    public static final String TAG="MY APP";
    public static void d(String msg){
        Log.d(TAG,msg);
    }
}
