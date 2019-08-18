package com.example.hello.futurehome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView doormain,roofmain,fanmain,lampmain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Deklarasi Card
        doormain = (CardView) findViewById(R.id.door_main);
        roofmain = (CardView) findViewById(R.id.roof_main);
        fanmain = (CardView) findViewById(R.id.fan_main);
        lampmain = (CardView) findViewById(R.id.lamp_main);

        //Tambah clicklistener ke Card
        doormain.setOnClickListener(this);
        roofmain.setOnClickListener(this);
        fanmain.setOnClickListener(this);
        lampmain.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()) {
            case R.id.door_main:
                i = new Intent(this, DoorActivity.class);
                startActivity(i);
                break;
            case R.id.roof_main:
                i = new Intent(this, RoofActivity.class);
                startActivity(i);
                break;
            case R.id.fan_main:
                i = new Intent(this, FanActivity.class);
                startActivity(i);
                break;
            case R.id.lamp_main:
                i = new Intent(this, LampActivity.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }
}
