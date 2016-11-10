package com.example.vadim.pro_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    EditText etFName;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        etFName = (EditText) findViewById(R.id.etFName);
    }

    @Override
    public void onClick(View view) {
        if (etFName.getText().toString().equals("")) {
            Toast.makeText(this, "Введіть повідомлення", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(this, Main3Activity.class);
            intent.putExtra("name", etFName.getText().toString());
            startActivity(intent);
        }
    }
}
