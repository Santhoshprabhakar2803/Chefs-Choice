package com.example.app_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class APP_4 extends AppCompatActivity {
    Button button;
    EditText editText;
    AutoCompleteTextView autoCompleteTextView;
    String[] location = {"Vadapalani","Arumbakkam","Anna nagar","Aynavaram","Avadi","Omr","Vellore","Hosur"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_4);
        button = (Button)findViewById(R.id.b1);
        editText = (EditText)findViewById(R.id.et1) ;
        autoCompleteTextView = (AutoCompleteTextView)findViewById(R.id.ac1);

        //getting value from App 3 to App 4
        Intent intent1 = getIntent();
        String editTextValue = intent1.getStringExtra("editTextValue");
        editText.setText(editTextValue);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,location);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(adapter);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input1 = editText.getText().toString().trim();
                editText.setText(input1);
                if (input1.isEmpty()) {
                    editText.setError("This field is mandatory");
                } else {
                    Toast.makeText(getApplicationContext(),"Thanks for Login "+editText.getText().toString(),Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplicationContext(),APP_5.class);
                    startActivity(intent);
                }
            }
        });
    }
}