package com.usth.instagramclone.localdb;

import com.usth.instagramclone.Data.Model.User;

public class Session {
    public static User ACTIVE_USER;

    public static boolean followingListContains(int user_id) {
        for (User u : ACTIVE_USER.getFollowing()) {
            if (u.getUser_id() == user_id) return true;
        }

        return false;
    }
}
