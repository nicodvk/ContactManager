package com.ndevynck.contactmanager;

import java.util.List;
import com.ndevynck.eiwd306.Provider;
import com.ndevynck.eiwd306.classes.Person;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ListView;

public class SearchActivity extends Activity {
	
	ListView listview;
	
	@SuppressLint("CutPasteId")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
    	setContentView(R.layout.activity_search);
    	setTitle("Bienvenue " + getIntent().getStringExtra("Pseudo"));
	
		List<Person> person = Provider.getAllPeople();
		final EditText searchForm = (EditText)findViewById(R.id.searchET);
		
		PersonAdapter adapter = new PersonAdapter(this, R.layout.person_template, person);
		listview = (ListView)findViewById(R.id.PersonLV);
		listview.setAdapter(adapter);
		
		searchForm.addTextChangedListener(new TextWatcher() {
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				List<Person> person = Provider.searchPerson(searchForm.getText().toString(), "");
				
				PersonAdapter adapter = new PersonAdapter(SearchActivity.this, R.layout.person_template, person);
				listview.setAdapter(adapter);
			}
			
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {	
			}
			
			@Override
			public void afterTextChanged(Editable s) {
			}
		});
		
		listview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				
				Person p = (Person) arg0.getItemAtPosition(arg2);
			
				Intent intent = new Intent(SearchActivity.this, DetailActivity.class).putExtra("Person_id", p.getId());
				
				startActivity(intent);
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
