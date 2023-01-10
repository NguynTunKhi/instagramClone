package com.usth.instagramclone.Activities;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;




import com.usth.instagramclone.API.MyAPI;

public class ApiClient {
    private static final String BASE_URL = "https://graph.facebook.com/me";
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