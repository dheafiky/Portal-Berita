package com.berita.dhea.berita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kedua);
    }
    public void sendMessage (View view){
        Intent intent = new Intent (this, kedua.class);
        startActivity(intent);


    }
}
