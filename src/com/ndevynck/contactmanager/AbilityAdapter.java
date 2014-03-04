package com.ndevynck.contactmanager;

import java.util.List;

import com.ndevynck.eiwd306.classes.Person;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class AbilityAdapter extends ArrayAdapter<String>{

	Activity activity;
	TextView ability;
	View view;
	@SuppressWarnings("unchecked")
	public AbilityAdapter(Activity context, int resource, List<String> objects) {
		super(context, resource, objects);
		this.activity = context;
	}
	
	public View getView(int position, View convertView, ViewGroup parent) {
		final String currentAbility = getItem(position);
		
		view = activity.getLayoutInflater().inflate(R.layout.abilities_template, null);
		ability = (TextView) view.findViewById(R.id.Ability);
		ability.setText(currentAbility.toString());
		
		return view;
	}

}
