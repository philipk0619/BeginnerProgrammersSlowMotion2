package com.example.beginnerprogrammersslowmotion;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.client.Firebase;


/**
 * Created by Philip on 6/12/2016.
 */
public class ForgotPasswordFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.forgot_password_fragment, container, false);

        return view;

//        var ref = new Firebase("project-5471953970192268570.firebaseio.com");
//
//        ref.resetPassword({
//                email: "philipkao81@gmail.com"
//        }, function(error) {
//            if error
//        }

    }
}
