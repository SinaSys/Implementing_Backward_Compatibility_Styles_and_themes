package com.sriyanksiddhartha.stylesandthemesdemo;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Explode;

public class SecondActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);

		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
			Explode enterTransition = new Explode();
			enterTransition.setDuration(1000);
			getWindow().setEnterTransition(enterTransition);
		}
	}
}
