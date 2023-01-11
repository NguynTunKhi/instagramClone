package com.usth.instagramclone.DI;

import android.content.Context;

import com.usth.instagramclone.API.ApiInterface;
import com.usth.instagramclone.API.ApiUtils;
import com.usth.instagramclone.Data.Repository.NotificationRepository;
import com.usth.instagramclone.Data.Repository.PostRepository;
import com.usth.instagramclone.Data.Repository.UserRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class AppModule {
    @Provides
    @Singleton
    public UserRepository provideUserRepository(@ApplicationContext Context context, ApiInterface apiService) {
        return new UserRepository(context, apiService);
    }

    @Provides
    @Singleton
    public PostRepository providePostRepository(ApiInterface apiService) {
        return new PostRepository(apiService);
    }

    @Provides
    @Singleton
    public NotificationRepository provideNotificationRepository(ApiInterface apiService) {
        return new NotificationRepository(apiService);
    }

    @Provides
    @Singleton
    public ApiInterface provideApiInterface() {
        return ApiUtils.getApiService();
    }
}

