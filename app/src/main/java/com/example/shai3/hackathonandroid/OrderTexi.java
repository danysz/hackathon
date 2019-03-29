package com.example.shai3.hackathonandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;


import com.example.shai3.hackathonandroid.moudle.OrderStatus;
import com.example.shai3.hackathonandroid.moudle.Taxi;
import com.example.shai3.hackathonandroid.moudle.User;

import java.util.ArrayList;

public class OrderTexi extends AppCompatActivity {
    private ImageView orderButton;

    public final static String DEST_EXTRA_KEY = "dest";
    public final static String USER_LOCTION_EXTRA_KEY = "location";
    public final static String PASSENGER_COUNT_EXTRA_KEY = "passenger";


    ArrayList<Taxi> taxies = new ArrayList<Taxi>();
    ArrayList<String> places = new ArrayList<String>();
    private ArrayAdapter<CharSequence> spinnerAdapter;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_texi);
        initOrderButton();
        initTaxiesArry();
        spinner = findViewById(R.id.planets_spinner);
        spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        initPlaces(taxies);
        spinnerAdapter.addAll(places);
        spinner.setAdapter(spinnerAdapter);
    }

    private void initOrderButton() {
        orderButton = findViewById(R.id.button2);
        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                OrderStatus orderStatus = new OrderStatus(taxies.get(spinner.getSelectedItemPosition()), new User("krayot") );
                Intent intent = new Intent(OrderTexi.this ,waitForTaxi.class);
                intent.putExtra(DEST_EXTRA_KEY,orderStatus.getTaxi().getDestination());
                intent.putExtra(PASSENGER_COUNT_EXTRA_KEY,orderStatus.getTaxi().getPassengerCount());
                intent.putExtra(USER_LOCTION_EXTRA_KEY,orderStatus.getUser().getLocation());
                startActivity(intent);
            }
        });
    }


    private void initPlaces(ArrayList<Taxi> taxies){
        for (Taxi taxi : taxies) {
            places.add(taxi.getDestination());
        }
    }

    private void initTaxiesArry (){
        taxies.add(new Taxi("Hifa", "Akko"));
        taxies.add(new Taxi("Hifa", "Nhariha"));
        taxies.add(new Taxi("Nhariha", "Hifa"));
    }

}
