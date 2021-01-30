package com.abrari.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private boolean isHello = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickHello(View view){
        TextView tv = findViewById(R.id.txtViewMessage);
        EditText editTextHello = findViewById(R.id.editText);
        String yourName = editTextHello.getText().toString();
        if(isHello) {
            tv.setText(String.format("Hello Canada from %s", yourName));
            isHello = false;
        }
        else{
            tv.setText(String.format("Goodbye Canada from %s", yourName));
        }
    }
}