package com.ndevynck.contactmanager;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ndevynck.eiwd306.Provider;
import com.ndevynck.eiwd306.classes.User;

public class LoginActivity extends Activity {
	
	EditText login;
	EditText password;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		Button btn = (Button)findViewById(R.id.ConnectBtn);
		btn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				login = (EditText)findViewById(R.id.LoginET);
				password = (EditText)findViewById(R.id.PasswordET);
				
				System.out.println(login.getText().toString() + " " + password.getText().toString());
				
				User user = Provider.login(login.getText().toString(), password.getText().toString());
				if(user != null) {
					Intent intent = new Intent(LoginActivity.this, SearchActivity.class);
					intent.putExtra("Pseudo", user.getPseudo());
					startActivity(intent);
				} else {
					Toast t = Toast.makeText(getApplicationContext(), "Login et/ou mot de passe invalide(s)", Toast.LENGTH_SHORT);
					t.show();
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
