package com.usth.instagramclone.UI.View.ViewModel;

import java.util.List;

@HiltViewModel
public class PostDetailsViewModel extends ViewModel {
    private PostRepository pRepo;

    private MutableLiveData<Post> post;
    private MutableLiveData<List<Post>> postsSaved;
    private MutableLiveData<String> message;
    private MutableLiveData<Boolean> status;

    @Inject
    public PostDetailsViewModel(PostRepository pRepo) {
        this.pRepo = pRepo;

        post = pRepo.getPost();
        postsSaved = pRepo.getPostsSaved();
        message = pRepo.getMessage();
        status = pRepo.getStatus();
    }

    public MutableLiveData<Post> getPost() {
        return post;
    }

    public MutableLiveData<List<Post>> getPostsSaved() {
        return postsSaved;
    }

    public MutableLiveData<String> getMessage() {
        return message;
    }

    public MutableLiveData<Boolean> getStatus() {
        return status;
    }

    public void getPostDetailsById(int post_id) {
        pRepo.getPostDetailsById(post_id);
    }

    public void updatePost(Post post) {
        pRepo.updatePost(post);
    }

    public void deletePost(int post_id) {
        pRepo.deletePost(post_id);
    }

    public void like(int post_id) {
        pRepo.like(post_id);
    }

    public void unlike(int post_id) {
        pRepo.unlike(post_id);
    }

    public void getSavedPosts() {
        pRepo.getSavedPosts();
    }

    public void save(int post_id) {
        pRepo.save(post_id);
    }

    public void unsave(int post_id) {
        pRepo.unsave(post_id);
    }

    public void shareComment(String comment_text, int comment_post) {
        pRepo.shareComment(comment_text, comment_post);
    }

    public void updateComment(Comment comment) {
        pRepo.updateComment(comment);
    }

    public void deleteComment(Comment comment) {
        pRepo.deleteComment(comment);
    }
}
