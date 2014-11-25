package com.example.TakaApp2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akirachix on 11/20/14.
 */
public class QuantityPage extends ActionBarActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {

	/**
	 * Declaration of variables
	 */
	private Spinner spinnerQuantities;
	private Button btnOk;
	TextView tvQuantityAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transact_page);

		/**
		 * Initialization of variables
		 * finding them by their id
		 */
		spinnerQuantities = (Spinner)findViewById(R.id.spinnerQuantities);
		btnOk = (Button)findViewById(R.id.btnQuantityPageOk);
		tvQuantityAmount = (TextView)findViewById(R.id.tvQuantityAmount);

		/**
		 * Setting listeners for spinner and button
		 */
		spinnerQuantities.setOnItemSelectedListener(this);
		btnOk.setOnClickListener(this);

		/**
		 * Add the items to the drop down spinner
		 */
		List<String>items = new ArrayList<String>();
		items.add("kg");
		items.add("grams");
		items.add("kilograms");

		/**
		 * designing the spinner using and array adapter
		 */
		ArrayAdapter<CharSequence> adapter =
				ArrayAdapter.createFromResource(this,R.array.quantity_array,android.R.layout.simple_spinner_dropdown_item);

		/**
		 * Set the adapter to the spinner
		 */
		spinnerQuantities.setAdapter(adapter);
    }

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.btnQuantityPageOk:
				break;

			default:
				break;
		}

	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
		/**
		 * When item is selected
 		 */
		Toast.makeText(parent.getContext(),
				"On Item Select: \n" +parent.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show();
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		/**
		 * When nothing is selected
		 */
	}
}
