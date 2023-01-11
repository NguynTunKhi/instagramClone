package com.usth.instagramclone.UI.ViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.usth.instagramclone.Data.Model.Post;
import com.usth.instagramclone.Data.Model.User;
import com.usth.instagramclone.Data.Repository.PostRepository;
import com.usth.instagramclone.Data.Repository.UserRepository;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class ProfileViewModel extends ViewModel {
    private UserRepository uRepo;
    private PostRepository pRepo;
    private MutableLiveData<User> user;
    private MutableLiveData<List<Post>> posts;

    @Inject
    public ProfileViewModel(UserRepository uRepo, PostRepository pRepo) {
        this.uRepo = uRepo;
        this.pRepo = pRepo;

        user = uRepo.getUser();
        posts = pRepo.getPosts();
    }

    public MutableLiveData<User> getUser() {
        return user;
    }

    public MutableLiveData<List<Post>> getPosts() {
        return posts;
    }

    public void getUserDetailsById(int user_id) {
        uRepo.getUserDetailsById(user_id);
    }

    public void getPostsByUserId(int user_id) {
        pRepo.getPostsByUserId(user_id);
    }

    public void follow(int user_id) {
        uRepo.follow(user_id);
    }

    public void unfollow(int user_id) {
        uRepo.unfollow(user_id);
    }
}

