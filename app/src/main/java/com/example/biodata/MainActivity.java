package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView fullname_txt,dob_txt,birth_txt,edu_txt,height_txt,num_txt,blood_txt,gender_txt,fname_txt,occ_txt,add_txt,fnum_txt,mothername_txt,brothername_txt,sistername_txt,village_txt,taluka_txt,district_txt,h1_txt,h2_txt,h3_txt,age_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding();

        String fullname = getIntent().getStringExtra("n1");
        String dob = getIntent().getStringExtra("n2");
        String birth = getIntent().getStringExtra("n3");
        String edu = getIntent().getStringExtra("n4");
        String height = getIntent().getStringExtra("n5");
        String num = getIntent().getStringExtra("n6");
        String blood = getIntent().getStringExtra("n7");
        String gender = getIntent().getStringExtra("n8");
        String fname = getIntent().getStringExtra("n10");
        String occ = getIntent().getStringExtra("n11");
        String add = getIntent().getStringExtra("n12");
        String fnum = getIntent().getStringExtra("n13");
        String mothername = getIntent().getStringExtra("n14");
        String brothername = getIntent().getStringExtra("n15");
        String sistername = getIntent().getStringExtra("n16");
        String village = getIntent().getStringExtra("n17");
        String taluka = getIntent().getStringExtra("n18");
        String district = getIntent().getStringExtra("n19");
        String h1 = getIntent().getStringExtra("n20");
        String h2 = getIntent().getStringExtra("n21");
        String h3 = getIntent().getStringExtra("n22");
        String age = getIntent().getStringExtra("n23");


        fullname_txt.setText(fullname);
        dob_txt.setText(dob);
        fname_txt.setText(fname);
        birth_txt.setText(birth);
        edu_txt.setText(edu);
        gender_txt.setText(gender);
        height_txt.setText(height);
        occ_txt.setText(occ);
        num_txt.setText(num);
        blood_txt.setText(blood);
        add_txt.setText(add);
        fnum_txt.setText(fnum);
        mothername_txt.setText(mothername);
        brothername_txt.setText(brothername);
        sistername_txt.setText(sistername);
        village_txt.setText(village);
        taluka_txt.setText(taluka);
        district_txt.setText(district);
        h1_txt.setText(h1);
        h2_txt.setText(h2);
        h3_txt.setText(h3);
        age_txt.setText(age);


        num_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String no = "tel:"+num;
                Intent i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse(no));
                startActivity(i);
            }
        });

        fnum_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String no = "tel:"+fnum;
                Intent i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse(no));
                startActivity(i);
            }
        });

    }

    private void binding() {
        fullname_txt = findViewById(R.id.fullname_txt);
        dob_txt = findViewById(R.id.dob_txt);
        fname_txt = findViewById(R.id.fname_txt);
        birth_txt = findViewById(R.id.birth_txt);
        edu_txt = findViewById(R.id.edu_txt);
        gender_txt = findViewById(R.id.gender_txt);
        h1_txt = findViewById(R.id.h1_txt);
        h2_txt = findViewById(R.id.h2_txt);
        h3_txt = findViewById(R.id.h3_txt);
        age_txt = findViewById(R.id.age_txt);
        height_txt = findViewById(R.id.height_txt);
        occ_txt = findViewById(R.id.occ_txt);
        num_txt = findViewById(R.id.num_txt);
        blood_txt = findViewById(R.id.blood_txt);
        add_txt = findViewById(R.id.add_txt);
        fnum_txt = findViewById(R.id.fnum_txt);
        mothername_txt = findViewById(R.id.mothername_txt);
        brothername_txt = findViewById(R.id.brothername_txt);
        sistername_txt = findViewById(R.id.sistername_txt);
        village_txt = findViewById(R.id.village_txt);
        taluka_txt = findViewById(R.id.taluka_txt);
        district_txt = findViewById(R.id.district_txt);
    }
}