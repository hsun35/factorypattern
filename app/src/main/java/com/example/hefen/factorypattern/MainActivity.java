package com.example.hefen.factorypattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.hefen.factorypattern.util.URLFactory;
import com.example.hefen.factorypattern.util.URLService;

public class MainActivity extends AppCompatActivity {
    Button btn_primary, btn_secondary, btn_tertiary;
    TextView textView_url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_primary = findViewById(R.id.button2);
        btn_secondary = findViewById(R.id.button);
        btn_tertiary = findViewById(R.id.button3);
        textView_url = findViewById(R.id.textView);

        btn_primary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                URLService urlService = URLFactory.createURL("primary");
                /*if (urlService == null) {
                    Log.i("mylog", "null urlservice");
                }*/
                textView_url.setText(urlService.getURL());
            }
        });

        btn_secondary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                URLService urlService = URLFactory.createURL("secondary");
                textView_url.setText(urlService.getURL());
            }
        });

        btn_tertiary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                URLService urlService = URLFactory.createURL("tertiary");
                textView_url.setText(urlService.getURL());
            }
        });
    }
}
