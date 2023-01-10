package com.usth.instagramclone.Activities;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


import android.support.v7.app.AppCompatActivity;

import com.usth.instagramclone.API.MyAPI;

public class ApiClient {
    private static final String BASE_URL = "https://graph.facebook.com/";
    private static MyAPI myApi;

    public static MyAPI getMyApi() {
        if (myApi == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            myApi = retrofit.create(MyAPI.class);
        }
        return myApi;
    }
}