package com.usth.instagramclone.API;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import com.usth.instagramclone.Activities.User;


public interface MyAPI {
        @GET("841043837003246?fields=id,username,profile_picture_url&access_token=EAAHLJkkZCZBsYBAAEQn40ee1iAyRu37wMEevAdFVHDgxdafJw2rP5uUVCh5PBgHEkkaUn72VjI4fMZCZA0Cyb54ZAGm6rpSpPplX5nP8LiQJDnqwhKR3HLycPhf7OCc5INsabi49XtuadGTwNtb9jwP2xOkefKTSendKxpuV7LoeaFDLlNJQWTw0Fj9xan7rqpPYpyF6ZCCxLuY8rZCZCViO")
        Call<User> getUser(@Path("user-id") String userId);

}