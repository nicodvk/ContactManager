package com.ndevynck.contactmanager;

import com.ndevynck.eiwd306.Provider;
import com.ndevynck.eiwd306.classes.Person;
import com.squareup.picasso.Picasso;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

public class DetailActivity extends Activity {
	
	TextView firstname, lastname, sex, street, town, zipcode, telephone, description;
	ListView abilities;
	ImageView avatar;
	
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
		telephone = (TextView)findViewById(R.id.Telephone);
		description = (TextView)findViewById(R.id.Description);
		abilities = (ListView)findViewById(R.id.DetailAbilitiesLV);
		avatar = (ImageView)findViewById(R.id.Avatar);
		
		//We set person's values to controls
		lastname.setText(p.getLastname());
		firstname.setText(p.getFirstname());
		street.setText(p.getAddress().getStreet());
		zipcode.setText(p.getAddress().getZipCode());
		town.setText(p.getAddress().getLocality());
		telephone.setText("Téléphone : " + p.getPhoneNumber());
		description.setText("Description : \n" + p.getDescription());
		if(p.isMale())
			sex.setText("Homme");
		else
			sex.setText("Femme");
		
		Picasso.with(getApplicationContext()).load(p.getAvatar()).resize(150, 150).centerCrop().into(avatar);
		
		AbilityAdapter adapter = new AbilityAdapter(this, R.layout.abilities_template, p.getAbilities());
		abilities.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.detail, menu);
		return true;
	}
}
