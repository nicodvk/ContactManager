package com.ndevynck.contactmanager;

import java.util.List;

import com.ndevynck.eiwd306.classes.Person;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class PersonAdapter extends ArrayAdapter<Person>{

	Activity activity;
	TextView lastname, firstname;
	View view;
	public PersonAdapter(Activity context, int resource, List<Person> objects) {
		super(context, resource, objects);
		this.activity = context;
	}
	
	public View getView(int position, View convertView, ViewGroup parent) {
		final Person currentPerson = getItem(position);
		
		view = activity.getLayoutInflater().inflate(R.layout.person_template, null);
		
		lastname = (TextView) view.findViewById(R.id.LastnameTV);
		firstname = (TextView) view.findViewById(R.id.FirstnameTV);
		
		lastname.setText(currentPerson.getLastname());
		firstname.setText(currentPerson.getFirstname());
		
		return view;
	}
}
