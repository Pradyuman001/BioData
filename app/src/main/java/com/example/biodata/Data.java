package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Data extends AppCompatActivity {

    private EditText fullname_edt,dob_edt,birth_edt,edu_edt,height_edt,num_edt,blood_edt,fname_edt,occ_edt,add_edt,fnum_edt,mothername_edt,brothername_edt,sistername_edt,village_edt,taluka_edt,district_edt,email_edt;
    Button submit_btn;
    RadioGroup radio_group;
    RadioButton male_rd_btn,female_rd_btn;
    CheckBox read_chk,music_chk,dance_chk;
    String gender,reading,music,dancing;
    SeekBar age_seek;
    TextView age1_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        binding();

        read_chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(b==true){

                    reading="Reading";
                }

                else {

                    reading = " ";

                }
            }
        });

        music_chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(b==true){

                    music = "Music";

                }

                else {

                    music = " ";
                }
            }
        });

        dance_chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(b==true){

                    dancing = "Dancing";
                }

                else {

                    dancing = " ";
                }
            }
        });

        age_seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                age1_txt.setText(""+i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(fullname_edt.getText().toString().length()<=0){
                    fullname_edt.setError("Enter Full Name");
                }
                else if(dob_edt.getText().toString().length()<=0){
                    dob_edt.setError("Enter Date Of Birth");
                }
                else if(birth_edt.getText().toString().length()<=0){
                    birth_edt.setError("Enter Place Of Birth");
                }
                else if(edu_edt.getText().toString().length()<=0){
                    edu_edt.setError("Enter Education");
                }
                else if(email_edt.getText().toString().length()<=0){
                    email_edt.setError("Enter Email Address");
                }
                else if(height_edt.getText().toString().length()<=0){
                    height_edt.setError("Enter Height");
                }
                else if(num_edt.getText().toString().length()<=0){
                    num_edt.setError("Enter Mobile Number");
                }
                else if(blood_edt.getText().toString().length()<=0){
                    blood_edt.setError("Enter Blood Group");
                }

                else if(age1_txt.getText().toString().length()==0){
                    age1_txt.setError("Enter Age");
                }
                else if(fname_edt.getText().toString().length()<=0){
                    fname_edt.setError("Enter Father Name");
                }
                else if(occ_edt.getText().toString().length()<=0){
                    occ_edt.setError("Enter Father's Occupation");
                }
                else if(add_edt.getText().toString().length()<=0){
                    add_edt.setError("Enter Address");
                }
                else if(fnum_edt.getText().toString().length()<=0){
                    fnum_edt.setError("Enter Father's Mobile No.");
                }
                else if(mothername_edt.getText().toString().length()<=0){
                    mothername_edt.setError("Enter Mother Name");
                }
                else if(village_edt.getText().toString().length()<=0){
                    village_edt.setError("Enter Village Name");
                }
                else if(taluka_edt.getText().toString().length()<=0){
                    taluka_edt.setError("Enter Taluka Name");
                }
                else if(district_edt.getText().toString().length()<=0){
                    district_edt.setError("Enter District Name");
                }



                else{
                    String fullname = fullname_edt.getText().toString();
                    String dob = dob_edt.getText().toString();
                    String birth = birth_edt.getText().toString();
                    String edu = edu_edt.getText().toString();
                    String height = height_edt.getText().toString();
                    String num = num_edt.getText().toString();
                    String blood = blood_edt.getText().toString();
                    String fname = fname_edt.getText().toString();
                    String occ = occ_edt.getText().toString();
                    String add = add_edt.getText().toString();
                    String fnum = fnum_edt.getText().toString();
                    String mothername = mothername_edt.getText().toString();
                    String brothername = brothername_edt.getText().toString();
                    String sistername = sistername_edt.getText().toString();
                    String village = village_edt.getText().toString();
                    String taluka = taluka_edt.getText().toString();
                    String district = district_edt.getText().toString();
                    String age = age1_txt.getText().toString();
                    String email = email_edt.getText().toString();

                    if(radio_group.getCheckedRadioButtonId() == R.id.male_rd_btn){
                        gender = "Male";
                    }
                    else if(radio_group.getCheckedRadioButtonId() == R.id.female_rd_btn){
                        gender = "Female";
                    }

                    //Toast.makeText(Data.this, surname+"\n"+name+"\n"+fname+"\n"+mother, Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Data.this, MainActivity.class);

                    intent.putExtra("n1", fullname);
                    intent.putExtra("n2", dob);
                    intent.putExtra("n3", birth);
                    intent.putExtra("n4", edu);
                    intent.putExtra("n5", height);
                    intent.putExtra("n6", num);
                    intent.putExtra("n7", blood);
                    intent.putExtra("n8", gender);
                    intent.putExtra("n10", fname);
                    intent.putExtra("n11", occ);
                    intent.putExtra("n12", add);
                    intent.putExtra("n13", fnum);
                    intent.putExtra("n14", mothername);
                    intent.putExtra("n15", brothername);
                    intent.putExtra("n16", sistername);
                    intent.putExtra("n17", village);
                    intent.putExtra("n18", taluka);
                    intent.putExtra("n19", district);
                    intent.putExtra("n20", reading);
                    intent.putExtra("n21", music);
                    intent.putExtra("n22", dancing);
                    intent.putExtra("n23", age);
                    intent.putExtra("n25", email);


                    startActivity(intent);
                }


            }
        });
    }

    private void binding() {

        fullname_edt = findViewById(R.id.fullname_edt);
        dob_edt = findViewById(R.id.dob_edt);
        fname_edt = findViewById(R.id.fname_edt);
        birth_edt = findViewById(R.id.birth_edt);
        edu_edt = findViewById(R.id.edu_edt);
        height_edt = findViewById(R.id.height_edt);
        num_edt = findViewById(R.id.num_edt);
        blood_edt = findViewById(R.id.blood_edt);
        occ_edt = findViewById(R.id.occ_edt);
        add_edt = findViewById(R.id.add_edt);
        fnum_edt = findViewById(R.id.fnum_edt);
        mothername_edt = findViewById(R.id.mothername_edt);
        brothername_edt = findViewById(R.id.brothername_edt);
        sistername_edt = findViewById(R.id.sistername_edt);
        village_edt = findViewById(R.id.village_edt);
        taluka_edt = findViewById(R.id.taluka_edt);
        district_edt = findViewById(R.id.district_edt);
        email_edt = findViewById(R.id.email_edt);


        age1_txt = findViewById(R.id.age1_txt);



        radio_group = findViewById(R.id.radio_group);
        male_rd_btn = findViewById(R.id.male_rd_btn);
        female_rd_btn = findViewById(R.id.female_rd_btn);
        read_chk = findViewById(R.id.read_chk);
        music_chk = findViewById(R.id.music_chk);
        dance_chk = findViewById(R.id.dance_chk);
        submit_btn = findViewById(R.id.submit_btn);
        submit_btn = findViewById(R.id.submit_btn);
        age_seek = findViewById(R.id.age_seek);

    }
}