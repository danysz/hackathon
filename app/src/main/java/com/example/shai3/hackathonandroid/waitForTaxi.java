package com.example.shai3.hackathonandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shai3.hackathonandroid.moudle.Taxi;

import java.util.ArrayList;

import static com.example.shai3.hackathonandroid.OrderTexi.DEST_EXTRA_KEY;
import static com.example.shai3.hackathonandroid.OrderTexi.PASSENGER_COUNT_EXTRA_KEY;
import static com.example.shai3.hackathonandroid.OrderTexi.USER_LOCTION_EXTRA_KEY;

public class waitForTaxi extends AppCompatActivity {
    TextView loctionDisplay;
    TextView destDisplay;
    TextView timeUntilYouDriveDisplay;
    TextView passengerCountDisplay;
    ImageView freeSeatDisplay;
    String loction;
    String dest;
    int timeUntilYouDrive = 0;
    int passengerCount;
    int freeSeat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wait_for_taxi);
        checkExstras();
        setData();

    }

    private void setData() {
        freeSeatDisplay = findViewById(R.id.freeSeat);
        loctionDisplay = findViewById(R.id.myLoction);
        destDisplay = findViewById(R.id.dest);
        timeUntilYouDriveDisplay = findViewById(R.id.time);
        passengerCountDisplay = findViewById(R.id.passengerCount);

        loctionDisplay.setText(String.format(getString(R.string.my_location_format), loction));
        destDisplay.setText(String.format(getString(R.string.my_destination_format), dest));
        timeUntilYouDriveDisplay.setText(String.format(getString(R.string.time_for_arrival_format), String.valueOf(timeUntilYouDrive)));
        if(passengerCount >= 10){
            passengerCountDisplay.setText("נכון לכרגע, המונית הקרובה בתפוצה מלאה");
        }else{
            passengerCountDisplay.setText(String.format(getString(R.string.passengers_number_format), String.valueOf(passengerCount)));
        }

        freeSeat = 10 - passengerCount;
        freeSeatDisplay.setBackground(getDrawable(R.drawable.seat+freeSeat ));
    }

    private void checkExstras() {
        if (getIntent().getExtras() == null) {
            return;
        }
        loction = getIntent().getStringExtra(USER_LOCTION_EXTRA_KEY);
        dest = getIntent().getStringExtra(DEST_EXTRA_KEY);
        passengerCount = getIntent().getIntExtra(PASSENGER_COUNT_EXTRA_KEY, 0);

    }

}
