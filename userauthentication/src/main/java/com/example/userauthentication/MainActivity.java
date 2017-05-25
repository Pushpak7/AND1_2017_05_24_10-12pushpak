package com.example.userauthentication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnOkay=(Button)findViewById(R.id.btnLogin);
        btnOkay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                EditText editUserName= (EditText) findViewById(R.id.edtUsername);
                String txtUserName =editUserName.getText().toString();


                EditText editPassWord= (EditText) findViewById(R.id.edtPassword);
                String txtPassWord =editPassWord.getText().toString();
                TextView txtstatus= (TextView) findViewById(R.id.txtStatus);
                if (txtUserName.equalsIgnoreCase("codekul") && txtPassWord.equalsIgnoreCase("codekul")){
                    txtstatus.setText("authenticate");
                }
                else {
                    txtstatus.setText("do not authenticate");
                }



            }
        });

    }

}
