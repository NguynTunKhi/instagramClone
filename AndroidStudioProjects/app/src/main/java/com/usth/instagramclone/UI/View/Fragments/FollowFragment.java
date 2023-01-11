package com.usth.instagramclone.UI.View.Fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.usth.instagramclone.R;
import com.usth.instagramclone.Data.Model.User;
import com.usth.instagramclone.databinding.FragmentFollowBinding;
import com.usth.instagramclone.UI.View.Adapter.UserAdapterFollow;
import com.usth.instagramclone.UI.ViewModel.FollowViewModel;

import java.util.Arrays;
import java.util.List;

@AndroidEntryPoint
public class FollowFragment extends Fragment {
    private FragmentFollowBinding binding;
    private FollowViewModel viewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(FollowViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_follow, container, false);
        binding.setFollowFragment(this);

        FollowFragmentArgs bundle = FollowFragmentArgs.fromBundle(getArguments());
        List<User> users = Arrays.asList(bundle.getUsers());

        UserAdapterFollow userAdapter = new UserAdapterFollow(requireContext(), users, viewModel);
        binding.setUserAdapter(userAdapter);

        if (users.size() == 0) binding.frgFollowLblMsgNothingInHere.setVisibility(View.VISIBLE);

        return binding.getRoot();
    }
}