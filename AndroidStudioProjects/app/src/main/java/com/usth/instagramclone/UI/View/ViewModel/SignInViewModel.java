package com.usth.instagramclone.UI.View.ViewModel;

@HiltViewModel
public class SignInViewModel extends ViewModel {
    private UserRepository uRepo;
    private MutableLiveData<String> message;
    private MutableLiveData<Boolean> status;

    @Inject
    public SignInViewModel(UserRepository uRepo) {
        this.uRepo = uRepo;

        message = uRepo.getMessage();
        status = uRepo.getStatus();
    }

    public MutableLiveData<String> getMessage() {
        return message;
    }

    public MutableLiveData<Boolean> getStatus() {
        return status;
    }

    public void getLastSessionUser() {
        uRepo.getLastSessionUser();
    }

    public void signIn(String user_name, String user_password) {
        uRepo.signIn(user_name, user_password);
    }
}

