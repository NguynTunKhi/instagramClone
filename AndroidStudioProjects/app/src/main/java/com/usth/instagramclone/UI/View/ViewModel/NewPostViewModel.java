package com.usth.instagramclone.UI.View.ViewModel;

import java.io.File;

@HiltViewModel
public class NewPostViewModel extends ViewModel {
    private PostRepository pRepo;

    private MutableLiveData<String> message;
    private MutableLiveData<Boolean> status;

    @Inject
    public NewPostViewModel(PostRepository pRepo) {
        this.pRepo = pRepo;

        message = pRepo.getMessage();
        status = pRepo.getStatus();
    }

    public MutableLiveData<String> getMessage() {
        return message;
    }

    public MutableLiveData<Boolean> getStatus() {
        return status;
    }

    public void sharePost(File postPhoto, String postDescription) {
        pRepo.sharePost(postPhoto, postDescription);
    }
}

