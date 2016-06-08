package com.zonsim.myjni;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloJNI extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hello_jni);
		
		TextView textView = (TextView) findViewById(R.id.textView);
		
		textView.setText(stringFromJNI());
	}
	
	
	public native String stringFromJNI();
	
//	public native String unimplementedStringFromJNI();
	
	static {
		System.loadLibrary("hello");
	}
	
}
