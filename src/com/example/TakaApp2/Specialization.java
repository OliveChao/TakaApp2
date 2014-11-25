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
 * @author OLive Chao Thu,Nov 20th 2014
 */

public class Specialization extends ActionBarActivity implements AdapterView.OnItemClickListener {
    /**
     * Called when the activity is first created.
     * Declaration of variables
     */
    private ListView lvProfession;
    private ArrayAdapter<String> stringArrayAdapter;
    String []items = {"Recycler","Collector"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specialization);

        //Initialization of variables
        //find listView by id
        lvProfession = (ListView)findViewById(R.id.lvServicePage);

        //Adding the array of data to the list view using an arrayAdapter
        ArrayList<String>itemList = new ArrayList<String>();
        itemList.addAll(Arrays.asList(items));

        //Designing the list view
        stringArrayAdapter = new ArrayAdapter<String>(this,R.layout.list_style,itemList);

        //Setting an on item click listener
        lvProfession.setAdapter(stringArrayAdapter);
        lvProfession.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //switch case
        switch (position){
            case 0:
                startActivity(new Intent(getApplicationContext(),ServicePage.class));
                break;
            case 1:
                startActivity(new Intent(getApplicationContext(),ServicePage.class));
                break;
			default:
				break;
        }
    }
}
