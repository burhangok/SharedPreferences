
package com.teknodate.apartmanyonetimi;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.ConnectivityManager;

import java.util.HashMap;

public class SessionManager {

    SharedPreferences pref;
    Editor editor;
    Context _context;
    int PRIVATE_MODE = 0;

    //User Session Process
    public static final String PREF_NAME = "EconomyInfo";
    public static final String KEY_REVENUE = "revenue";
    public static final String KEY_COST = "cost";






    public SessionManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();

    }


    public void createEconomySession(int revenue, int cost) {
        editor.putString(KEY_REVENUE, revenue+"");
        editor.putString(KEY_COST, cost+"");
        editor.commit();
    }


    public HashMap<String, String> getEconomyDetails() {

        HashMap<String, String> economy = new HashMap<String, String>();

        economy.put(KEY_REVENUE, pref.getString(KEY_REVENUE, null));
        economy.put(KEY_COST, pref.getString(KEY_COST, null));


        // return economy
        return economy;
    }





}