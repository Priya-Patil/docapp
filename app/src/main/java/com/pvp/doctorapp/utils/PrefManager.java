package com.teammandroid.dairyapplication.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class PrefManager {
    // Shared Preferences
    SharedPreferences pref;
    // Editor for Shared preferences
    Editor editor;
    // Context
    Context _context;
    // Shared pref mode
    public static int PRIVATE_MODE = 0;
    // Shared preferences file name
    public static final String PREF_NAME = "docapp";
    // All Shared Preferences Keys
    private static final String USER_ID = "u_id";
    private static final String USER_MOBILE = "mobile";
    private static final String ROLE_ID = "role_id";
    private static final String ProfilePath = "ProfilePath";

    private static final String AUTH_BACK = "auth_back";


    public PrefManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void setROLE_ID(int uid) {
        editor.putInt(ROLE_ID, uid);
        editor.commit();
    }

    public int getROLE_ID() {
        return pref.getInt(ROLE_ID, 0);
    }


    //
    public void setUSER_ID(int uid) {
        editor.putInt(USER_ID, uid);
        editor.commit();
    }

    public int getUSER_ID() {
        return pref.getInt(USER_ID, 0);
    }


    //
    public void setUSER_MOBILE(String m) {
        editor.putString(USER_MOBILE, m);
        editor.commit();
    }

    public String getUSER_MOBILE() {
        return pref.getString(USER_MOBILE, null);
    }


     public void setProfilePath(String ProfilePath) {
        editor.putString(ProfilePath, ProfilePath);
        editor.commit();
    }

    public String getProfilePath() {
        return pref.getString(ProfilePath, null);
    }


    //
    public void setAUTH_BACK(int uid) {
        editor.putInt(AUTH_BACK, uid);
        editor.commit();
    }

    public int getAUTH_BACK() {
        return pref.getInt(AUTH_BACK, 0);
    }




}