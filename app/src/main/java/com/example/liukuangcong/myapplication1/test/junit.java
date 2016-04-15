package com.example.liukuangcong.myapplication1.test;

import android.annotation.TargetApi;
import android.os.Build;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.liukuangcong.myapplication1.MainActivity;
import com.example.liukuangcong.myapplication1.R;

/**
 * Created by liukuangcong on 4/15/16.
 */
public class junit extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public junit(){
        super(MainActivity.class);
        }
    @TargetApi(Build.VERSION_CODES.CUPCAKE)
    public void test_first()
    {
        mainActivity = getActivity();

        TextView textView=(TextView)mainActivity.findViewById(R.id.t3);
        String tester=textView.getText().toString();
        int num1=Integer.parseInt(tester);

        TextView textView2=(TextView)mainActivity.findViewById(R.id.t2);
        String tester2=textView2.getText().toString();
        int num2=Integer.parseInt(tester2);

        int num3=num2-num1;

        assertEquals(1, num3);
        }

}
