package com.yudha.myticket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GetStartedAct extends AppCompatActivity {

    Button btn_sign_in,btn_new_account_create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        btn_sign_in=findViewById(R.id.btn_sign_in);
        btn_new_account_create=findViewById(R.id.btn_new_account_create);


        btn_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gosignin=new Intent(GetStartedAct.this,SignInAct.class);
                startActivity(gosignin);
                finish();
            }
        });
        btn_new_account_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gosignin=new Intent(GetStartedAct.this,RegisterOneAct.class);
                startActivity(gosignin);
                finish();
            }
        });
    }
}
