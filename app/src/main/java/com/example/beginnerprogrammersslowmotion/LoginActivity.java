package com.example.beginnerprogrammersslowmotion;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ActionMode;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class LoginActivity extends AppCompatActivity {

    Firebase mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportFragmentManager().beginTransaction().add(R.id.container, new LoginFragment(),null).commit();
    }

    public void touchMePlaya(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment, null).addToBackStack(null).commit();

    }

//    @Override
//    protected void onStart(){
//        super.onStart();
//        mRef = new Firebase("https://project-5471953970192268570.firebaseio.com/");
//
//        mRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                String text = dataSnapshot.getValue(String.class);
//                mTextFieldCondition.setText(text);
//
//
//            }
//
//            @Override
//            public void onCancelled(FirebaseError firebaseError) {
//
//            }
//        });
//
//                mButtonSign_up_btn.setOnClickListener
//    }
}
