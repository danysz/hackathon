package com.example.shai3.hackathonandroid.ui;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import com.example.shai3.hackathonandroid.R;
        import com.example.shai3.hackathonandroid.moudle.Taxi;

        import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Taxi> taxies = new ArrayList<Taxi>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


}

