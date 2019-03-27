package com.example.loginactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AramaYap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arama_yap);

        final EditText numara = (EditText)findViewById(R.id.editText_numara);
        Button b = (Button)findViewById(R.id.btn_ara);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel: "+numara.getText().toString()));
                startActivity(i);
            }
        });
    }
}
