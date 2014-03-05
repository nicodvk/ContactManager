package com.ndevynck.contactmanager;

import java.util.List;

import com.ndevynck.eiwd306.Provider;
import com.ndevynck.eiwd306.classes.Person;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class ResultActivity extends Activity {
	
	ListView listview;
	Intent intent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		setTitle("Résultats de la recherche");
		
		listview = (ListView) findViewById(R.id.ListResults);
		
		intent = getIntent();
		List<Person> person = Provider.searchPerson(intent.getStringExtra("lastname"), intent.getStringExtra("firstname"));
		
		if(!person.isEmpty()) {
			PersonAdapter adapter = new PersonAdapter(ResultActivity.this, R.layout.person_template, person);
			listview.setAdapter(adapter);
			
			listview.setOnItemClickListener(new OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
						long arg3) {
					
					Person p = (Person) arg0.getItemAtPosition(arg2);
				
					intent = new Intent(ResultActivity.this, DetailActivity.class).putExtra("Person_id", p.getId());
					startActivity(intent);
				}
			});
		} else {
			Builder alert = new AlertDialog.Builder(ResultActivity.this)
							.setTitle("Dommage !")
							.setMessage("Aucune personne n'a été trouvée ... ")
							.setPositiveButton("OK", new OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					intent = new Intent(ResultActivity.this, SearchActivity.class);
					startActivity(intent);
					finish();
				}
			});
			alert.show();  
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.result, menu);
		return true;
	}

}
