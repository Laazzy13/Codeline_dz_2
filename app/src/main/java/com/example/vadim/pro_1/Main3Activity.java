package com.example.vadim.pro_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends Activity {

    TextView tvView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tvView = (TextView) findViewById(R.id.tvView);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("name");

        tvView.setText("Ваше повідомлення: " + Name);
    }
}
