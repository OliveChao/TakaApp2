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
public class ServicePage extends ActionBarActivity implements AdapterView.OnItemClickListener {
    //Declaration of variables
    private ListView lvInputPage;
    private ArrayAdapter<String> stringArrayAdapter;
    String[]items = {"Quantity","Transaction History"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_page);

        //Initialization of variables
        //find list view by id
        lvInputPage = (ListView)findViewById(R.id.lvInputPage);

        //Add array of items to the list view using an array adapter
        ArrayList<String>itemList = new ArrayList<String>();
        itemList.addAll(Arrays.asList(items));

        //Designing the list view
        stringArrayAdapter = new ArrayAdapter<String>(this,R.layout.list_style,itemList);

        //Setting an item on click listener
        lvInputPage.setAdapter(stringArrayAdapter);
        lvInputPage.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //switch case
        switch (view.getId()){
            case 0:
                startActivity(new Intent(getApplicationContext(),QuantityPage.class));
                break;
            case 1:
                startActivity(new Intent(getApplicationContext(),TransactionHistory.class));
                break;
        }
    }
}
