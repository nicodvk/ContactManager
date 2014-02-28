package com.ndevynck.contactmanager;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.ndevynck.androidproject.R;
import com.ndevynck.eiwd306.Provider;

public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

}
