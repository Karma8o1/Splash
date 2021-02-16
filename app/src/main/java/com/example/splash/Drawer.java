package com.example.splash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Drawer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);

    }
    public void message()
    {
        Button search = (Button) findViewById(R.id.message);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SMS = new Intent(Drawer.this,Message.class);
                startActivity(SMS);
            }
        });
    }
    public void mail()
    {
        Button search = (Button) findViewById(R.id.email);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mail = new Intent(Drawer.this,Mail.class);
                startActivity(mail);
            }
        });
    }

    public void search()
    {
        Button search = (Button) findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent search = new Intent(Drawer.this,Search.class);
                startActivity(search);
            }
        });

    }

    public void exit()
    {
        Button exit = (Button)findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }
}