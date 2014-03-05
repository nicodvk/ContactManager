package com.ndevynck.contactmanager;

import java.util.List;

import com.ndevynck.eiwd306.classes.Person;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

public class PersonAdapter extends ArrayAdapter<Person>{

	Activity activity;
	TextView lastname, firstname, email;
	ImageView avatar;
	View view;
	public PersonAdapter(Activity context, int resource, List<Person> objects) {
		super(context, resource, objects);
		this.activity = context;
	}
	
	public View getView(int position, View convertView, ViewGroup parent) {
		final Person currentPerson = getItem(position);
		
		view = activity.getLayoutInflater().inflate(R.layout.person_template, null);
		
		lastname = (TextView) view.findViewById(R.id.lastname);
		firstname = (TextView) view.findViewById(R.id.firstname);
		email = (TextView) view.findViewById(R.id.email);
		
		lastname.setText(currentPerson.getLastname());
		firstname.setText(currentPerson.getFirstname());
		email.setText(currentPerson.getEmail());
		
		avatar = (ImageView) view.findViewById(R.id.avatarIV); 
		
		Picasso.with(getContext()).load(currentPerson.getAvatar()).resize(50, 50).centerCrop().into(avatar);
		
		return view;
	}
}
