package com.ndevynck.contactmanager;

import com.ndevynck.eiwd306.Provider;
import com.ndevynck.eiwd306.classes.Person;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class DetailActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		setTitle("");
		
		int personId = getIntent().getIntExtra("Person_id", 0);
		
		TextView lastname = (TextView)findViewById(R.id.DetailLastnameTV);
		TextView firstname = (TextView)findViewById(R.id.DetailFirstnameTV);
		TextView sex = (TextView)findViewById(R.id.DetailSexTV);
		TextView street = (TextView)findViewById(R.id.DetailStreetTV);
		TextView zipcode = (TextView)findViewById(R.id.DetailZipcodeTV);
		TextView town = (TextView)findViewById(R.id.DetailTownTV);
		ListView abilities = (ListView)findViewById(R.id.DetailAbilitiesLV);
		
		Person p = Provider.getPersonById(personId);
	
		lastname.setText(p.getLastname());
		firstname.setText(p.getFirstname());
		street.setText(p.getAddress().getStreet());
		zipcode.setText(p.getAddress().getZipCode());
		town.setText(p.getAddress().getLocality());
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, p.getAbilities());
		abilities.setAdapter(adapter);
		
		if(p.isMale())
			sex.setText("Homme");
		else
			sex.setText("Femme");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.detail, menu);
		return true;
	}

}
