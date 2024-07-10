package com.example.app_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class APP_6 extends AppCompatActivity {
    TextView textView1, textview2, textview3, textview4, textview5, textview6, textview7, textview8, textview9,textview10,textview11; //qty
    int counter1 = 0, counter2 = 0, counter3 = 0, counter4 = 0, counter5 = 0, counter6 = 0, counter7 = 0, counter8 = 0, counter9 = 0,counter10,counter11;
    TextView item1, item2, item3, item4, item5, item6, item7, item8, item9,item10,item11;
    TextView p1, p2, p3, p4, p5, p6, p7, p8, p9,p10,p11;
    Button veg,nonveg,juice,fastfood,ice,cake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_8);
        // quantity
        textView1 = (TextView) findViewById(R.id.v1);
        textview2 = (TextView) findViewById(R.id.v2);
        textview3 = (TextView) findViewById(R.id.v3);
        textview4 = (TextView) findViewById(R.id.v4);
        textview5 = (TextView) findViewById(R.id.v5);
        textview6 = (TextView) findViewById(R.id.v6);
        textview7 = (TextView) findViewById(R.id.v7);
        textview8 = (TextView) findViewById(R.id.v8);
        textview9 = (TextView) findViewById(R.id.v9);
        textview10 = (TextView) findViewById(R.id.v10);
        textview11 = (TextView) findViewById(R.id.v11);

        //items
        item1 = (TextView) findViewById(R.id.it1);
        item2 = (TextView) findViewById(R.id.tv4);
        item3 = (TextView) findViewById(R.id.it2);
        item4 = (TextView) findViewById(R.id.it3);
        item5 = (TextView) findViewById(R.id.it4);
        item6 = (TextView) findViewById(R.id.it5);
        item7 = (TextView) findViewById(R.id.it6);
        item8 = (TextView) findViewById(R.id.it7);
        item9 = (TextView) findViewById(R.id.it8);
        item10 = (TextView) findViewById(R.id.it9);
        item11 = (TextView) findViewById(R.id.it10);


        //price
        p1 = (TextView) findViewById(R.id.tv100);
        p2 = (TextView) findViewById(R.id.tv3);
        p3 = (TextView) findViewById(R.id.tv5);
        p4 = (TextView) findViewById(R.id.tv6);
        p5 = (TextView) findViewById(R.id.tv7);
        p6 = (TextView) findViewById(R.id.tv8);
        p7 = (TextView) findViewById(R.id.tv9);
        p8 = (TextView) findViewById(R.id.tv10);
        p9 = (TextView) findViewById(R.id.tv11);
        p10 = (TextView) findViewById(R.id.tv12);
        p11 = (TextView) findViewById(R.id.tv13);



        //layer1
        Button buttondecrement1 = (Button) findViewById(R.id.b1);
        buttondecrement1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter1--;
                textView1.setText(String.valueOf(counter1));
            }
        });

        Button buttonincrement1 = (Button) findViewById(R.id.b2);
        buttonincrement1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter1++;
                textView1.setText(String.valueOf(counter1));
            }
        });

        //layer2
        Button buttondecrement2 = (Button) findViewById(R.id.b3);
        buttondecrement2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter2--;
                textview2.setText(String.valueOf(counter2));
            }
        });

        Button buttonincrement2 = (Button) findViewById(R.id.b4);
        buttonincrement2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter2++;
                textview2.setText(String.valueOf(counter2));
            }
        });

        //layer3
        Button buttondecrement3 = (Button) findViewById(R.id.b5);
        buttondecrement3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter3--;
                textview3.setText(String.valueOf(counter3));
            }
        });

        Button buttonincrement3 = (Button) findViewById(R.id.b6);
        buttonincrement3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter3++;
                textview3.setText(String.valueOf(counter3));
            }
        });

        //layer4
        Button buttondecrement4 = (Button) findViewById(R.id.b7);
        buttondecrement4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter4--;
                textview4.setText(String.valueOf(counter4));
            }
        });

        Button buttonincrement4 = (Button) findViewById(R.id.b8);
        buttonincrement4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter4++;
                textview4.setText(String.valueOf(counter4));
            }
        });

        //layer5
        Button buttondecrement5 = (Button) findViewById(R.id.b9);
        buttondecrement5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter5--;
                textview5.setText(String.valueOf(counter5));
            }
        });

        Button buttonincrement5 = (Button) findViewById(R.id.b10);
        buttonincrement5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter5++;
                textview5.setText(String.valueOf(counter5));
            }
        });

        //layer6
        Button buttondecrement6 = (Button) findViewById(R.id.b11);
        buttondecrement6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter6--;
                textview6.setText(String.valueOf(counter6));
            }
        });

        Button buttonincrement6 = (Button) findViewById(R.id.b12);
        buttonincrement6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter6++;
                textview6.setText(String.valueOf(counter6));
            }
        });

        //layer7
        Button buttondecrement7 = (Button) findViewById(R.id.b13);
        buttondecrement7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter7--;
                textview7.setText(String.valueOf(counter7));
            }
        });

        Button buttonincrement7 = (Button) findViewById(R.id.b14);
        buttonincrement7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter7++;
                textview7.setText(String.valueOf(counter7));
            }
        });

        //layer8
        Button buttondecrement8 = (Button) findViewById(R.id.b15);
        buttondecrement8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter8--;
                textview8.setText(String.valueOf(counter8));
            }
        });

        Button buttonincrement8 = (Button) findViewById(R.id.b16);
        buttonincrement8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter8++;
                textview8.setText(String.valueOf(counter8));
            }
        });

        //layer9
        Button buttondecrement9 = (Button) findViewById(R.id.b17);
        buttondecrement9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter9--;
                textview9.setText(String.valueOf(counter9));
            }
        });

        Button buttonincrement9 = (Button) findViewById(R.id.b18);
        buttonincrement9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter9++;
                textview9.setText(String.valueOf(counter9));
            }
        });

        //layer10
        Button buttondecrement10 = (Button) findViewById(R.id.b19);
        buttondecrement10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter10--;
                textview10.setText(String.valueOf(counter10));
            }
        });

        Button buttonincrement10 = (Button) findViewById(R.id.b20);
        buttonincrement10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter10++;
                textview10.setText(String.valueOf(counter10));
            }
        });

        //layer11
        Button buttondecrement11 = (Button) findViewById(R.id.b21);
        buttondecrement11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter11--;
                textview11.setText(String.valueOf(counter11));
            }
        });

        Button buttonincrement11 = (Button) findViewById(R.id.b22);
        buttonincrement11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter11++;
                textview11.setText(String.valueOf(counter11));
            }
        });

        veg  = (Button) findViewById(R.id.veg);
        veg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(),APP_6.class);
                startActivity(intent1);
            }
        });

        nonveg = (Button)findViewById(R.id.nonveg);
        nonveg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(),APP_9NV.class);
                startActivity(intent2);
            }
        });

        juice = (Button)findViewById(R.id.juice);
        juice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getApplicationContext(),APP_10juice.class);
                startActivity(intent3);
            }
        });

        fastfood = (Button)findViewById(R.id.fast);
        fastfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(getApplicationContext(),APP_11FASTFOOD.class);
                startActivity(intent4);
            }
        });
        ice = (Button)findViewById(R.id.ice);
        ice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(getApplicationContext(),APP_12ICE.class);
                startActivity(intent5);
            }
        });

        cake = (Button) findViewById(R.id.cake);
        cake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(getApplicationContext(),APP_13CAKE.class);
                startActivity(intent6);
            }
        });


        //go to cart
        Button gotocart = findViewById(R.id.b211);
        gotocart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotocart1();
            }
        });

    }


    private void gotocart1() {
        Intent intent = new Intent(APP_6.this, APP_7.class);
        ArrayList<CartItem> cartItems = new ArrayList<>();

        // Define arrays to hold TextViews for quantity, items, and prices
        TextView[] qtyTextViews = {textView1, textview2, textview3, textview4, textview5, textview6, textview7, textview8, textview9,textview10,textview11};
        TextView[] itemTextViews = {item1, item2, item3, item4, item5, item6, item7, item8, item9,item10,item11};
        TextView[] priceTextViews = {p1, p2, p3, p4, p5, p6, p7, p8, p9,p10,p11};

        // Loop through TextView arrays and create CartItem objects
        for (int i = 0; i < 11; i++) {
            TextView qtyTextView = qtyTextViews[i];
            TextView itemTextView = itemTextViews[i];
            TextView priceTextView = priceTextViews[i];
            Log.d("MainActivity", "textView" + (i + 1) + ": " + qtyTextView);

            // Validate TextView elements
            if (qtyTextView != null && itemTextView != null && priceTextView != null) {
                String qtyStr = qtyTextView.getText().toString().trim();

                if (!qtyStr.isEmpty()) {
                    try {
                        int qty = Integer.parseInt(qtyStr);
                        if (qty > 0) {
                            String item = itemTextView.getText().toString();
                            String price = priceTextView.getText().toString();
                            cartItems.add(new CartItem(item, price, qty));
                        }
                    } catch (NumberFormatException e) {
                        // Handle invalid quantity value
                        e.printStackTrace();
                    }
                }
            } else {
                Log.e("gotocart1", "TextView element is null for index: " + (i + 1));
            }
        }

        intent.putParcelableArrayListExtra("cartItems", cartItems);
        startActivity(intent);
    }
}



