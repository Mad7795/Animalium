package com.example.muhammad.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FrontActivity extends AppCompatActivity {

    EditText mNAma;
    Button mMasuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);
        mNAma = (EditText) findViewById(R.id.Editext);
        mMasuk = (Button) findViewById(R.id.bTnMsk);
        mMasuk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FrontActivity.this, MainActivity.class);
                i.putExtra("NAMA", mNAma.getText().toString());
                startActivity(i);
                finish();
            }
        });
    }
}
