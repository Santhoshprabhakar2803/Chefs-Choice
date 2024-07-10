package com.example.app_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class APP_SMS extends AppCompatActivity {
    private EditText otpEditText;
    private String generatedOTP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app__sms);


                otpEditText = findViewById(R.id.otpEditText);

                // Generate OTP when the activity starts
                generatedOTP = generateOTP();
                Toast.makeText(this, "Generated OTP: " + generatedOTP, Toast.LENGTH_SHORT).show();

                Button verifyOTPButton = findViewById(R.id.verifyOTPButton);
                verifyOTPButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String enteredOTP = otpEditText.getText().toString().trim();

                        if (enteredOTP.equals(generatedOTP)) {
                            // OTP matched, payment successful
                            Toast.makeText(com.example.app_1.APP_SMS.this, "Ordered successful!", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(),APP_EXIT.class);
                            startActivity(intent);

                        } else {
                            // OTP not matched, payment failed
                            Toast.makeText(com.example.app_1.APP_SMS.this, "Invalid OTP. Your Order has been failed!", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }

            // Method to generate a random OTP
            private String generateOTP() {
                Random random = new Random();
                int otp = 1000 + random.nextInt(9000);
                return String.valueOf(otp);
            }
        }

