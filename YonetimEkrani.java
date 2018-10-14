package com.teknodate.apartmanyonetimi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.HashMap;

public class YonetimEkrani extends AppCompatActivity {


    public String getRev, getCost ;
    public  int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonetim_ekrani);

        SessionManager session = new SessionManager(getApplicationContext());


        try {

            if (session != null) {
                HashMap<String, String> economy = session.getEconomyDetails();

               getRev=economy.get(SessionManager.KEY_REVENUE);
               getCost=economy.get(SessionManager.KEY_COST);

               result=Integer.parseInt(getRev)-Integer.parseInt(getCost);

                Toast.makeText(this, result+"", Toast.LENGTH_SHORT).show();

            }


        } catch (Exception e) {

        }


    }
}
