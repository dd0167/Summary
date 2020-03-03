package com.example.summary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rnd=new Random();
    Button btn1;
    Button btn2;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        tv=(TextView) findViewById(R.id.tv);

    }

    public void Click1(View view) {
        tv.setText("Number not found");

    }

    public void Click2(View view) {
        int n=rnd.nextInt(100);
        tv.setText("Number is "+n);
    }
}
