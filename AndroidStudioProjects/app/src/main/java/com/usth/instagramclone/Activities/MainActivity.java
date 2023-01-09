package com.usth.instagramclone.Activities;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.usth.instagramclone.Fragments.HomeFragment;
import com.usth.instagramclone.Fragments.NotificationsFragment;
import com.usth.instagramclone.Fragments.ProfileFragment;
import com.usth.instagramclone.Fragments.ReelsFragment;
import com.usth.instagramclone.Fragments.SearchFragment;
import com.usth.instagramclone.R;

import android.view.View;
import android.widget.EditText;

import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText emailField;
    private EditText passwordField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }


    private void initialize() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNav);

        loadFragment(new HomeFragment());               //Default is home fragment

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {
                    case R.id.home:
                        return loadFragment(new HomeFragment());
                    case R.id.search:
                        return loadFragment(new SearchFragment());
                    case R.id.reels:
                        return loadFragment(new ReelsFragment());
                    case R.id.notifications:
                        return loadFragment(new NotificationsFragment());
                    case R.id.profile:
                        return loadFragment(new ProfileFragment());
                }

                return false;
            }
        });
    }


    private boolean loadFragment(Fragment fragment){

        if (fragment != null) {
            FragmentManager fm  = getSupportFragmentManager();
            fm.beginTransaction()
                    .replace(R.id.container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }
}
