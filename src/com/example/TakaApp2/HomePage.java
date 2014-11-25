package com.example.TakaApp2;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by olive chao on 11/20/14.
 */
public class HomePage extends ActionBarActivity implements View.OnClickListener {

    /**
     * Declaration of variables
     * @param savedInstanceState
     */
    EditText etPin;
    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        /**
         * Initialization of variables
         * Finding them by their id
         */
        etPin = (EditText)findViewById(R.id.etHomePagePin);
        btnOk = (Button)findViewById(R.id.btnHomePageOK);

        //Setting an onClickListener for the button
        btnOk.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnHomePageOK:
                startActivity(new Intent(getApplicationContext(),Specialization.class));
                break;
        }

    }
}
