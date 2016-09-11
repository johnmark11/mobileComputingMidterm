package com.example.androidstudio.moraldej;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MainActivity extends AppCompatActivity {

    private EditText un;
    private EditText ps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        un = (EditText) findViewById(R.id.username);
        ps = (EditText) findViewById(R.id.password);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0)
            {
                if(un.getText().toString().equals("admin") && ps.getText().toString().equals("test")){
                    Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                    startActivity(intent);
                    //correcct password
                }else{

                }



            }
        });

    }
}

