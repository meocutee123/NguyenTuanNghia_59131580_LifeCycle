package com.gmail.nguyentuannghia_59131580_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        Toast.makeText(getApplicationContext(), "OnCreate", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life Cycle","OnStart called!");
        SimpleDateFormat spDF = new SimpleDateFormat("HH:mm:ss");
        String strDate = spDF.format(new Date());
        textView.setText(strDate);
        Toast.makeText(getApplicationContext(), "OnStart", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Life Cycle","OnResume called!");
        Toast.makeText(getApplicationContext(), "OnResume", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Life Cycle","OnStop called!");
        Toast.makeText(getApplicationContext(), "OnStop", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Life Cycle","OnRestart called!");
        Toast.makeText(getApplicationContext(), "OnRestart", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life Cycle","OnDestroy called!");
        Toast.makeText(getApplicationContext(), "OnDestroy", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Life Cycle","OnPause called!");
        Toast.makeText(getApplicationContext(), "OnPause", Toast.LENGTH_SHORT).show();


    }
}
