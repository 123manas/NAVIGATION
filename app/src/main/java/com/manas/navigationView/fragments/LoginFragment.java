package com.manas.navigationView.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.manas.navigationView.NavigationActivity;
import com.manas.navigationView.R;

public class LoginFragment extends Fragment {

    public boolean check=false;

    private EditText email,password;
    private Button login;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v1=inflater.inflate(R.layout.login_fragment,container,false);

        email=v1.findViewById(R.id.emailEt);
        password=v1.findViewById(R.id.passwordEt);

        login=v1.findViewById(R.id.loginBt);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mailid=email.getText().toString();
                String pwd=password.getText().toString();

                if(mailid.endsWith("@gmail.com") && pwd.equals("manas")){

                    check=true;

                    Toast.makeText(getActivity(),"sucessfully logged in ",Toast.LENGTH_SHORT).show();

                   /* AlertDialog.Builder builder=new AlertDialog.Builder(IndexActivity.this);
                    builder.setTitle("welcome to signup page");
                    builder.setMessage("you Entered wrong credentials please check again ");
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(IndexActivity.this,"Try Again",Toast.LENGTH_SHORT).show();
                        }
                    });
                    builder.show();*/

                }
                else{
                    check=false;
                    Toast.makeText(getActivity(),"Try Again",Toast.LENGTH_SHORT).show();
                }
            }
        });

        return v1;
    }
}
