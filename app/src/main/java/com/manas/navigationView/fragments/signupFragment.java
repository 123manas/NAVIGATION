package com.manas.navigationView.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.manas.navigationView.R;

public class signupFragment extends Fragment
{
    public boolean checks=false;
    private EditText fname,lname,dob,mail,password,confirmPassword;
    private Button signup;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v1=inflater.inflate(R.layout.signup_fragment,container,false);

        fname=v1.findViewById(R.id.fnameEt);
        lname=v1.findViewById(R.id.lnameEt);
        dob=v1.findViewById(R.id.dobEt);
        mail=v1.findViewById(R.id.emailEt);
        password=v1.findViewById(R.id.passwordEt);
        confirmPassword=v1.findViewById(R.id.cnfpasswordEt);

        signup=v1.findViewById(R.id.signupBt);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstname=fname.getText().toString();
                String lastname=lname.getText().toString();
                String dateofbirth=dob.getText().toString();
                String mailid=mail.getText().toString();
                String passwordcheck=password.getText().toString();
                String cnfpasswordcheck=confirmPassword.getText().toString();

                if(firstname.length() <5){
                    Toast.makeText(getActivity(),"field length atleast 5",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(lastname.length()<5){
                    Toast.makeText(getActivity(),"field length atleast 5",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(dateofbirth.length() !=10){
                    Toast.makeText(getActivity(),"field format dd/mm/yyyy",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(!(mailid.endsWith("@gmail.com"))){
                    Toast.makeText(getActivity(),"field should ends with @gmail.com",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(passwordcheck.length() <6){
                    Toast.makeText(getActivity(),"field length atleast 6",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(!(passwordcheck.equals(cnfpasswordcheck))){
                    Toast.makeText(getActivity(),"password and confirm password should same",Toast.LENGTH_SHORT).show();
                    return;
                }
                else{
                    Toast.makeText(getActivity(),"successfully signed up",Toast.LENGTH_SHORT).show();
                    checks=true;
                    return;
                }
            }
        });
        return v1;
    }
}
