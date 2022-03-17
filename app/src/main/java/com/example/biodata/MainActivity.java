package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView surname_txt,name_txt,fname_txt,mothername_txt,bsname_txt,dob_txt,birth_txt,edu_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding();

        String surname = getIntent().getStringExtra("n1");
        String name = getIntent().getStringExtra("n2");
        String fname = getIntent().getStringExtra("n3");
        String mothername = getIntent().getStringExtra("n4");
        String bsname = getIntent().getStringExtra("n5");
        String dob = getIntent().getStringExtra("n6");
        String birth = getIntent().getStringExtra("n7");
        String edu = getIntent().getStringExtra("n8");

        surname_txt.setText(surname);
        name_txt.setText(name);
        fname_txt.setText(fname);
        mothername_txt.setText(mothername);
        bsname_txt.setText(bsname);
        dob_txt.setText(dob);
        birth_txt.setText(birth);
        edu_txt.setText(edu);
    }

    private void binding() {
        surname_txt = findViewById(R.id.surname_txt);
        name_txt = findViewById(R.id.name_txt);
        fname_txt = findViewById(R.id.fname_txt);
        mothername_txt = findViewById(R.id.mothername_txt);
        bsname_txt = findViewById(R.id.bsname_txt);
        dob_txt = findViewById(R.id.dob_txt);
        birth_txt = findViewById(R.id.birth_txt);
        edu_txt = findViewById(R.id.edu_txt);
    }
}