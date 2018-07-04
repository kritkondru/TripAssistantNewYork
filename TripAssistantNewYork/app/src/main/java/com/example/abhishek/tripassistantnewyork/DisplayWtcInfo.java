package com.example.abhishek.tripassistantnewyork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayWtcInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_wtc_info);
        Intent intent = getIntent();
        String message = intent.getStringExtra("name");
        EditText editTextMulti=(EditText) findViewById(R.id.editText);
        editTextMulti.setEnabled(false);
        editTextMulti.setKeyListener(null);

        TextView stayairpnbtext=(TextView)findViewById(R.id.textView6);
        stayairpnbtext.setMovementMethod(LinkMovementMethod.getInstance());

        TextView staypricelinetext=(TextView)findViewById(R.id.textView7);
        staypricelinetext.setMovementMethod(LinkMovementMethod.getInstance());

        TextView staywtcthirdtext=(TextView)findViewById(R.id.textView8);
        staywtcthirdtext.setMovementMethod(LinkMovementMethod.getInstance());

        TextView restwtcfirsttext=(TextView)findViewById(R.id.textView11);
        restwtcfirsttext.setMovementMethod(LinkMovementMethod.getInstance());

        TextView restwtcsecondtext=(TextView)findViewById(R.id.textView13);
        restwtcsecondtext.setMovementMethod(LinkMovementMethod.getInstance());

        TextView restwtcthirdtext=(TextView)findViewById(R.id.textView14);
        restwtcthirdtext.setMovementMethod(LinkMovementMethod.getInstance());

        // Capture the layout's TextView and set the string as its text
        //TextView textView = findViewById(R.id.textView);
        //textView.setText(message);
    }
}
