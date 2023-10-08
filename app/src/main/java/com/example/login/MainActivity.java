package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, CompoundButton.OnCheckedChangeListener, View.OnClickListener {



    private Button login;
    private CheckBox opration;
    private EditText password,user;
    private RadioGroup sex_Radiogroup;
    private RadioButton sex_man,sex_woman;
    private String sex_word,opration_word;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_layout);
        login=findViewById(R.id.login);
        opration=findViewById(R.id.opration);
        sex_Radiogroup=findViewById(R.id.sex_Radiogroup);
        password=findViewById(R.id.password);
        user=findViewById(R.id.user);
        sex_word=new String();
        opration_word=new String();
        sex_man=findViewById(R.id.man);
        sex_woman=findViewById(R.id.woman);




        login.setOnClickListener(this);
        sex_Radiogroup.setOnCheckedChangeListener(this);
        opration.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int ischeck) {
        if (ischeck==R.id.man){
            sex_word=sex_man.getText().toString();
        }
        else{
            sex_word=sex_woman.getText().toString();
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (b){
            opration_word="已经同意相关协议";
        }
        else{
            opration_word="请同意相关协议";
        }
    }

    @Override
    public void onClick(View view) {
        if (opration_word=="已经同意相关协议"){
            Toast.makeText(this, "登陆成功，请稍等", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "请同意相关协议", Toast.LENGTH_SHORT).show();
        }
    }
}