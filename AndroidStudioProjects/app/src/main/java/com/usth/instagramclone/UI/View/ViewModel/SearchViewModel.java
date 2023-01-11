package com.usth.instagramclone.UI.View.ViewModel;

import java.util.List;

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
