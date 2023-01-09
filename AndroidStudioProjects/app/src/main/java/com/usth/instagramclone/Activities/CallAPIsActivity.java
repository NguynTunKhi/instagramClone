package com.usth.instagramclone.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.usth.instagramclone.Model.Post;
import com.usth.instagramclone.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class CallAPIsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_apis);
    }
    public class ApiClient {
        private static final String BASE_URL = "https://api.example.com/";
        private MyApi myApi;

        public MyApi getMyApi() {
            if (myApi == null) {
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                myApi = retrofit.create(MyApi.class);
            }
            return myApi;
        }
    }
    public interface MyApi {
        @GET("posts")
        Call<List<Post>> getPosts();
    }


}

