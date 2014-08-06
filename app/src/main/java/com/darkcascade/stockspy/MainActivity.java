package com.darkcascade.stockspy;

import android.app.*;
import android.content.Intent;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void list0_click(View v)
    {
        Intent i = new Intent();
        i.setClass(this, DetailActivity.class);

        startActivity(i);
    }
}
