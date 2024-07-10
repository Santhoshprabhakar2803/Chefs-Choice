package com.example.app_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import java.util.*;
import android.widget.Toast;

public class App_3 extends AppCompatActivity {
    Button button,button1;
    EditText editText,editText1;
    AutoCompleteTextView t1;

    String emailPattern = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    String[] location = {"Vadapalani","Arumbakkam","Anna nagar","Aynavaram","Avadi","Omr","Vellore","Hosur"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_3);
        editText = (EditText) findViewById(R.id.et1);
        editText1 = (EditText)findViewById(R.id.et2);


        button = (Button) findViewById(R.id.b1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString().trim();
                if (input.isEmpty()) {
                    editText.setError("This field is mandatory");
                } else {
                    Toast.makeText(getApplicationContext(), "Thanks for Sign Up " + editText.getText().toString(), Toast.LENGTH_LONG).show();
                    // passing values to App 4
                    String editTextValue = editText.getText().toString();
                    Intent intent1 = new Intent(App_3.this, APP_4.class);
                    intent1.putExtra("editTextValue",editTextValue);
                    // done
                    startActivity(intent1);

                }
            }
        });



        button1 = (Button) findViewById(R.id.b3);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,location);
        t1 = (AutoCompleteTextView) findViewById(R.id.ac1);
        t1.setThreshold(1);
        t1.setAdapter(adapter);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText1.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Email Required",Toast.LENGTH_LONG).show();
                } else {
                    if (editText1.getText().toString().trim().matches(emailPattern)){
                        Toast.makeText(getApplicationContext(),"Email Verified ",Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(),"Email not Verified ",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });






    }
}
