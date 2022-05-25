package com.example.luyentapdatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.luyentapdatabinding.databinding.ActivityMainBinding;
import com.example.luyentapdatabinding.model.Users;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding= DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);
        Users users=new Users("Alo", "aloalo");
        binding.setUsers(users);
    }
}