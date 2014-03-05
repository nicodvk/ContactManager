package com.ndevynck.contactmanager;

import android.annotation.SuppressLint;
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

public class SearchActivity extends Activity {
	
	Button btn;
	EditText firstnameET, lastnameET;
	String lastname, firstname;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
    	setContentView(R.layout.activity_search);
    	setTitle("Interface de recherche");
    	
		lastnameET = (EditText)findViewById(R.id.lastnameSET);
		firstnameET = (EditText)findViewById(R.id.firstnameSET);
    	
    	if(getIntent().getStringExtra("Pseudo") != null)
    		Toast.makeText(getApplicationContext(), "Bienvenue " + getIntent().getStringExtra("Pseudo"), Toast.LENGTH_SHORT).show();
		
    	btn = (Button)findViewById(R.id.searchBtn);
    	
    	btn.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {		
				if (lastnameET.getText().toString().length() == 1)
					lastname = lastnameET.getText().toString().toUpperCase();
				else if (lastnameET.getText().toString().length() > 1)
					lastname = lastnameET.getText().toString().substring(0, 1).toUpperCase() + lastnameET.getText().toString().substring(1).toLowerCase();
				else
					lastname = "";
				
				if (firstnameET.getText().toString().length() == 1)
					firstname = firstnameET.getText().toString().toUpperCase();
				else if (firstnameET.getText().toString().length() > 1)
					firstname = firstnameET.getText().toString().substring(0, 1).toUpperCase() + firstnameET.getText().toString().substring(1).toLowerCase();
				else 
					firstname = "";
				
				Intent intent = new Intent(SearchActivity.this, ResultActivity.class)
								.putExtra("lastname", lastname)
								.putExtra("firstname", firstname);
				
				startActivity(intent);
			}
    	});
    	
		final InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
    	
    	lastnameET.setOnFocusChangeListener(new View.OnFocusChangeListener() {
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				if(!hasFocus) {
					imm.hideSoftInputFromWindow(lastnameET.getWindowToken(), 0);
				}
			}
		});	
		
    	firstnameET.setOnFocusChangeListener(new View.OnFocusChangeListener() {
			public void onFocusChange(View v, boolean hasFocus) {
				if(!hasFocus) {
					imm.hideSoftInputFromWindow(firstnameET.getWindowToken(), 0);
				}
			}
		});	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.search, menu);
		return true;
	}

}
