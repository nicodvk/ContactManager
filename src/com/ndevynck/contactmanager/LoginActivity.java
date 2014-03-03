package com.ndevynck.contactmanager;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ndevynck.eiwd306.Provider;
import com.ndevynck.eiwd306.classes.User;

public class LoginActivity extends Activity {
	
	EditText login, password;
	Button btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		setTitle("Interface de connexion");
		
		final InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
		
		login = (EditText)findViewById(R.id.LoginET);
		password = (EditText)findViewById(R.id.PasswordET);
		
		btn = (Button)findViewById(R.id.ConnectBtn);
		btn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				login = (EditText)findViewById(R.id.LoginET);
				password = (EditText)findViewById(R.id.PasswordET);
				
				User user = Provider.login(login.getText().toString(), password.getText().toString());
				if(user != null) {
					Intent intent = new Intent(LoginActivity.this, SearchActivity.class);
					intent.putExtra("Pseudo", user.getPseudo());

					startActivity(intent);
					finish();
				} else {
					Toast.makeText(getApplicationContext(), "Login et/ou mot de passe invalide(s)", Toast.LENGTH_SHORT).show();
				}
			}
		});

		login.setOnFocusChangeListener(new View.OnFocusChangeListener() {
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				if(!hasFocus) {
					imm.hideSoftInputFromWindow(login.getWindowToken(), 0);
				}
			}
		});	
		
		password.setOnFocusChangeListener(new View.OnFocusChangeListener() {
			public void onFocusChange(View v, boolean hasFocus) {
				if(!hasFocus) {
					imm.hideSoftInputFromWindow(password.getWindowToken(), 0);
				}
			}
		});	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}
}
