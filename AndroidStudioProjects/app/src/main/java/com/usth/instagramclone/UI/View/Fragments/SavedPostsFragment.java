package com.usth.instagramclone.UI.View.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class SavedPostsFragment extends Fragment {
    private FragmentSavedPostsBinding binding;
    private SavedPostsViewModel viewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(SavedPostsViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_saved_posts, container, false);

        binding.frgSavedPostsRecyclerViewSwipeRefresh.setOnRefreshListener(() -> {
            viewModel.getSavedPosts();
            binding.frgSavedPostsRecyclerViewSwipeRefresh.setRefreshing(false);
        });

        // post crud messages
        viewModel.getMessage().observe(getViewLifecycleOwner(), message -> {
            if (!message.isEmpty()) {
                Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show();
            }
        });

        viewModel.getPostsSaved().observe(getViewLifecycleOwner(), savedPosts -> {
            PostAdapterSaved postAdapter = new PostAdapterSaved(requireContext(), (MainActivity) requireActivity(), savedPosts, viewModel);
            binding.setPostAdapter(postAdapter);

            if (savedPosts.size() == 0) binding.frgSavedPostsLblMsgNoPost.setVisibility(View.VISIBLE);
            else binding.frgSavedPostsLblMsgNoPost.setVisibility(View.GONE);
        });

        viewModel.getSavedPosts();

        return binding.getRoot();
    }
