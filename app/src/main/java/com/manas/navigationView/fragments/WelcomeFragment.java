package com.manas.navigationView.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.manas.navigationView.R;

public class WelcomeFragment extends Fragment {

    private Button login,signup;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View v1=inflater.inflate(R.layout.welcome_fragment,container,false);

       login=v1.findViewById(R.id.login_btn);
       login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
               transaction.add(R.id.fragment_container,new LoginFragment());
               transaction.commit();
           }
       });
       signup=v1.findViewById(R.id.signup_btn);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.add(R.id.fragment_container,new signupFragment());
                transaction.commit();

            }
        });

        return v1;
    }
}
