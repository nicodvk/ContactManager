package com.ndevynck.contactmanager;

import com.ndevynck.eiwd306.Provider;
import com.ndevynck.eiwd306.classes.Person;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class DetailActivity extends Activity {
	
	TextView firstname, lastname, sex, street, town, zipcode;
	ListView abilities;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		setTitle("Descriptif de la personne");
		
		int personId = getIntent().getIntExtra("Person_id", 0);
		Person p = Provider.getPersonById(personId);
		//We get all controls from the view
		lastname = (TextView)findViewById(R.id.DetailLastnameTV);
		firstname = (TextView)findViewById(R.id.DetailFirstnameTV);
		sex = (TextView)findViewById(R.id.DetailSexTV);
		street = (TextView)findViewById(R.id.DetailStreetTV);
		zipcode = (TextView)findViewById(R.id.DetailZipcodeTV);
		town = (TextView)findViewById(R.id.DetailTownTV);
		abilities = (ListView)findViewById(R.id.DetailAbilitiesLV);
		
		//We set person's values to controls
		lastname.setText(p.getLastname());
		firstname.setText(p.getFirstname());
		street.setText(p.getAddress().getStreet());
		zipcode.setText(p.getAddress().getZipCode());
		town.setText(p.getAddress().getLocality());
		if(p.isMale())
			sex.setText("Homme");
		else
			sex.setText("Femme");
		
//		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.abilities_template, p.getAbilities());
		AbilityAdapter adapter = new AbilityAdapter(this, R.layout.abilities_template, p.getAbilities());
		abilities.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.detail, menu);
		return true;
	}
}
