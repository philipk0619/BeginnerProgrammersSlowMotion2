package com.example.beginnerprogrammersslowmotion;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.ButtonBarLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Philip on 6/12/2016.
 */
public class LoginFragment extends Fragment {
    private TextView forgot_password;
    private Button sign_up;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {View view = inflater.inflate(R.layout.login_fragment, container, false);

        forgot_password = (TextView) view.findViewById(R.id.forgot_password);
        sign_up = (Button) view.findViewById(R.id.sign_up);

        forgot_password.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                LoginActivity activity = (LoginActivity)getActivity();
                activity.touchMePlaya(new ForgotPasswordFragment());

            }
        });

       sign_up.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
               LoginActivity activity = (LoginActivity)getActivity();
               activity.touchMePlaya(new SignUpFragment());
           }
       });

        return view;

    }

}
