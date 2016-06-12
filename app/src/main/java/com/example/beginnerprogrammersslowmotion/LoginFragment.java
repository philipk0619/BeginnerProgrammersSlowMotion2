package com.example.beginnerprogrammersslowmotion;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Philip on 6/12/2016.
 */
public class LoginFragment extends Fragment {
    private TextView forgot_password;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {View view = inflater.inflate(R.layout.login_fragment, container, false);

        forgot_password = (TextView) view.findViewById(R.id.forgot_password);

        forgot_password.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                LoginActivity activity = (LoginActivity)getActivity();
                activity.replacementKillers(new ForgotPasswordFragment());

            }
        });

        return view;



    }

}
