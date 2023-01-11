package com.usth.instagramclone.UI.ViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.usth.instagramclone.Data.Model.User;
import com.usth.instagramclone.Data.Repository.UserRepository;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class SearchViewModel extends ViewModel {
    private UserRepository uRepo;
    private MutableLiveData<List<User>> users;

    @Inject
    public SearchViewModel(UserRepository uRepo) {
        this.uRepo = uRepo;

        this.users = uRepo.getUsers();
    }

    public MutableLiveData<List<User>> getUsers() {
        return users;
    }

    public void filterUsersByName(String user_name) {
        uRepo.filterUsersByName(user_name);
    }
}
