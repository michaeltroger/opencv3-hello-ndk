package com.example.openCv3HelloNdk;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MyActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv = new TextView(this);
        String text = "The area of the rectangle is: " + getArea(10, 30);
        tv.setText(text);
        setContentView(tv);
    }

    public native int getArea(int width, int height);

    static
    {
        System.loadLibrary("opencv_java3");
        System.loadLibrary("native_opencv");
    }

}