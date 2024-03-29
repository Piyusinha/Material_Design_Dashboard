package com.piyu.uidashboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
     Button btn_profile,btn_education,btn_health,btn_goals,btn_finance,btn_comfort;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_profile=(Button)findViewById(R.id.buttonprofile);
        btn_education=(Button)findViewById(R.id.buttoneducation);
        btn_health=(Button)findViewById(R.id.buttonhealth);
        btn_goals=(Button)findViewById(R.id.buttongoals);
        btn_comfort=(Button)findViewById(R.id.buttoncomfort);
        btn_finance=(Button)findViewById(R.id.buttonfinance);
        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Profile",Toast.LENGTH_SHORT).show();
            }
        });
        btn_finance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"FINANCE",Toast.LENGTH_SHORT).show();
            }
        });
        btn_goals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"GOALS",Toast.LENGTH_SHORT).show();
            }
        });
        btn_comfort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"COMFORT",Toast.LENGTH_SHORT).show();
            }
        });
        btn_health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"HEALTH",Toast.LENGTH_SHORT).show();
                Log.d(TAG, "onClick: health ");
            }
        });
        btn_education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"EDUCATION",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
