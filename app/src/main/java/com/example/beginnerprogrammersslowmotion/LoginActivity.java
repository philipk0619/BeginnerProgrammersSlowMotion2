package com.example.beginnerprogrammersslowmotion;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportFragmentManager().beginTransaction().add(R.id.container, new LoginFragment(),null).commit();
    }

    public void touchMePlaya(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment, null).addToBackStack(null).commit();



    }
}
