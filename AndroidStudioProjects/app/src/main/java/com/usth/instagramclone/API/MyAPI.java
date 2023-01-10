package com.usth.instagramclone.API;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import com.usth.instagramclone.Activities.User;


public interface MyAPI {
        @GET("841043837003246?fields=id,username,profile_picture_url&access_token=EAAHLJkkZCZBsYBAAPkd6hp9YUxwHciZCkv1ZABkwBkMC4rCzzb78VZAOiRZBZCoU93XSNwNoqZAhlkF88n3ZB0e2xQHKyZBTpSIMJHXxxf1ZAR1BxjpEusinbfgMlEQGoCbzUHFmUYobG5RbUZBjKZASCxsvnY04eAllZCLhCinHYsp7sK2i8RSKePXZAaLLCJx0RLzIdsOKZBxN0UawZCXRZCnLynavy4JwPKyQozquIZD")
        Call<User> getUser(@Path("user-id") String userId);

}