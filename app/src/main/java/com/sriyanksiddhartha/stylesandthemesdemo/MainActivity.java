package com.sriyanksiddhartha.stylesandthemesdemo;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/*
* 	Author: Sriyank Siddhartha
*
* 	Module 5: Maintaining Backward Compatibility
*
*		"AFTER" Demo Project
***/
public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	public void openSecondActivity(View view) {

		Intent intent = new Intent(MainActivity.this, SecondActivity.class);

		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
			ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
			startActivity(intent, options.toBundle());
		} else { // Else behave normally
			startActivity(intent);
		}
	}
}
