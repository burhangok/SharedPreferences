package com.teknodate.apartmanyonetimi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    public EditText revenueBox , costBox;

    public Button clcBtn;

    private SessionManager session;

    //Global Değişkenler


    public String renevue,cost;
    public  Intent resultIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        revenueBox=findViewById(R.id.revenue);
        costBox=findViewById(R.id.cost);
        clcBtn=findViewById(R.id.clcBtn);


        session = new SessionManager(getApplicationContext());
         resultIntent = null;

        clcBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               renevue=revenueBox.getText()+"";
               cost=costBox.getText().toString();


                   try {

                      session.createEconomySession(Integer.parseInt(renevue),Integer.parseInt(cost));


                   resultIntent=new Intent(MainActivity.this,YonetimEkrani.class);

                      startActivity(resultIntent);

                   } catch (Exception e) {

                   }







           }
       });

    }
}
