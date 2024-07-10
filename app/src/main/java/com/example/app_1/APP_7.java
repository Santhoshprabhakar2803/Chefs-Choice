package com.example.app_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.app_1.CartItem;
import com.example.app_1.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class APP_7 extends AppCompatActivity {

    Button b10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_7);

        b10 = (Button) findViewById(R.id.bb);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent100 = new Intent(getApplicationContext(),APP_14CONF.class);
                Toast.makeText(getApplicationContext(),"YOU ARE REDIRECTING TO PAYMENT..",Toast.LENGTH_LONG).show();
                startActivity(intent100);
            }
        });


        // Get the TextView reference
        TextView tvDateAndTime = findViewById(R.id.time);

        // Get current date and time
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm a", Locale.getDefault());
        String dateTime = dateFormat.format(calendar.getTime());

        // Set the current date and time to the TextView
        tvDateAndTime.setText(dateTime);


        Log.d("MainActivity", "textView1: " + CartItem.class);

        LinearLayout container = findViewById(R.id.container);

        double grandTotal = 0; // Variable to store the grand total

        Intent intent = getIntent();
        if (intent != null) {
            List<CartItem> cartItems = intent.getParcelableArrayListExtra("cartItems");
            if (cartItems != null) {
                for (CartItem item : cartItems) {
                    // Create TextViews dynamically
                    TextView itemNameTextView = new TextView(this);
                    itemNameTextView.setText("Item: " + item.getItemName());
                    container.addView(itemNameTextView);

                    TextView quantityTextView = new TextView(this);
                    quantityTextView.setText("Quantity: " + item.getQuantity());
                    container.addView(quantityTextView);

                    TextView priceTextView = new TextView(this);
                    priceTextView.setText("Price: " + item.getPrice());
                    container.addView(priceTextView);

                    double totalPrice = parsePrice(item.getPrice()) * item.getQuantity(); // Calculate total price for the item
                    grandTotal += totalPrice; // Add total price to grand total

                    TextView totalPriceTextView = new TextView(this);
                    totalPriceTextView.setText("Total Price: " + totalPrice);
                    container.addView(totalPriceTextView);

                    // Add spacing between items
                    TextView divider = new TextView(this);
                    divider.setLayoutParams(new LinearLayout.LayoutParams(
                            ViewGroup.LayoutParams.MATCH_PARENT,
                            5
                    ));
                    divider.setBackgroundColor(Color.GREEN);
                    container.addView(divider);
                }
            }
        }

        // Display grand total
        TextView grandTotalTextView = new TextView(this);
        grandTotalTextView.setText("Grand Total: " + grandTotal);
        container.addView(grandTotalTextView);
    }

    private double parsePrice(String price) {
        // Remove any non-numeric characters from the price string
        String numericPrice = price.replaceAll("[^\\d.]+", "");
        // Parse the numeric string into a double value
        return Double.parseDouble(numericPrice);
    }


}
