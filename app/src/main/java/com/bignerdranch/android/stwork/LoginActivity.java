package com.bignerdranch.android.stwork;

/**
 * Created by ASUS on 2017/5/22.
 */

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;

import android.os.Bundle;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText et_name;
    private EditText et_pw;
    private Button register;
    private Button password;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        et_name = (EditText) findViewById(R.id.s_ename);
        et_pw = (EditText) findViewById(R.id.s_epw);
        register=(Button)findViewById(R.id.s_zc);
        password = (Button) findViewById(R.id.s_forgetpw);
        register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(i);
            }
        });

        password.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginActivity.this,SetActivity.class);
                startActivity(i);
            }
        });
    }


    public void login(View v) {
        String name = et_name.getText().toString().trim();
        String pw = et_pw.getText().toString().trim();

        if (TextUtils.isEmpty(name) || TextUtils.isEmpty(pw)) {
            Toast.makeText(LoginActivity.this, "用户名或密码不能为空", Toast.LENGTH_LONG).show();
        } else {
            //进行登录的逻辑，用服务器
        }
    }



}



