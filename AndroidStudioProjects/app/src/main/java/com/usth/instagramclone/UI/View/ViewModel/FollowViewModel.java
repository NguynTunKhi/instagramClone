package com.usth.instagramclone.UI.View.ViewModel;

@HiltViewModel
public class FollowViewModel extends ViewModel {
    private UserRepository uRepo;

    @Inject
    public FollowViewModel(UserRepository uRepo) {
        this.uRepo = uRepo;
    }

    public void follow(int user_id) {
        uRepo.follow(user_id);
    }

    public void unfollow(int user_id) {
        uRepo.unfollow(user_id);
    }
}

