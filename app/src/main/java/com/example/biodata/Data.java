package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Data extends AppCompatActivity {

    private EditText surname_edt,name_edt,fname_edt,mothername_edt,bsname_edt,dob_edt,birth_edt,edu_edt;
    Button submit_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        binding();

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(surname_edt.getText().toString().length()<=0){
                    surname_edt.setError("Enter Surname");
                }
                else if(name_edt.getText().toString().length()<=0){
                    name_edt.setError("Enter Name");
                }
                else if(fname_edt.getText().toString().length()<=0){
                    fname_edt.setError("Enter Father Name");
                }
                else if(mothername_edt.getText().toString().length()<=0){
                    mothername_edt.setError("Enter Mother Name");
                }
                else if(bsname_edt.getText().toString().length()<=0){
                    bsname_edt.setError("Enter Brother/Sister Name");
                }
                else if(dob_edt.getText().toString().length()<=0){
                    dob_edt.setError("Enter Date Of Birth Name");
                }
                else if(birth_edt.getText().toString().length()<=0){
                    birth_edt.setError("Enter Place Of Birth Name");
                }
                else if(edu_edt.getText().toString().length()<=0){
                    edu_edt.setError("Enter Education");
                }


                else{
                    String surname = surname_edt.getText().toString();
                    String name = name_edt.getText().toString();
                    String fname = fname_edt.getText().toString();
                    String mother = mothername_edt.getText().toString();
                    String bsname = bsname_edt.getText().toString();
                    String dob = dob_edt.getText().toString();
                    String birth = birth_edt.getText().toString();
                    String edu = edu_edt.getText().toString();


                    //Toast.makeText(Data.this, surname+"\n"+name+"\n"+fname+"\n"+mother, Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Data.this, MainActivity.class);
                    intent.putExtra("n1", surname);
                    intent.putExtra("n2", name);
                    intent.putExtra("n3", fname);
                    intent.putExtra("n4", mother);
                    intent.putExtra("n5", bsname);
                    intent.putExtra("n6", dob);
                    intent.putExtra("n7", birth);
                    intent.putExtra("n8", edu);
                    startActivity(intent);
                }
            }
        });
    }

    private void binding() {

        surname_edt = findViewById(R.id.surname_edt);
        name_edt = findViewById(R.id.name_edt);
        fname_edt = findViewById(R.id.fname_edt);
        mothername_edt = findViewById(R.id.mothername_edt);
        bsname_edt = findViewById(R.id.bsname_edt);
        dob_edt = findViewById(R.id.dob_edt);
        birth_edt = findViewById(R.id.birth_edt);
        edu_edt = findViewById(R.id.edu_edt);
        submit_btn = findViewById(R.id.submit_btn);
    }
}