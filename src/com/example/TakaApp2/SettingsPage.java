package com.example.TakaApp2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Olive Chao on 11/20/14.
 */
public class SettingsPage extends ActionBarActivity implements AdapterView.OnItemClickListener {

	/**
	 * Declaration of variables
	 * @param savedInstanceState
	 */
	private ListView listViewSettings;
	private ArrayAdapter<String> stringArrayAdapter;
	String []items = {"Change PIN","Choose language","Update app"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings_page);

		/**
		 * Initialization of variables
		 */
		listViewSettings = (ListView)findViewById(R.id.listViewSettings);

		//Adding the array of data to the list view using an arrayAdapter
		ArrayList<String> itemList = new ArrayList<String>();
		itemList.addAll(Arrays.asList(items));

		//Designing the list view
		stringArrayAdapter = new ArrayAdapter<String>(this,R.layout.list_style,itemList);

		//Setting an on item click listener
		listViewSettings.setAdapter(stringArrayAdapter);
		listViewSettings.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		switch (view.getId()){
			case 0:
				startActivity(new Intent(getApplicationContext(),ServicePage.class));
				break;
			case 1:
				startActivity(new Intent(getApplicationContext(),ServicePage.class));
				break;
			case 2:
				startActivity(new Intent(getApplicationContext(),ServicePage.class));
				break;
			default:
				break;
		}
	}
}
