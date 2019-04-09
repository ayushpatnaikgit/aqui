package com.felhr.serialportexample;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;


public class SharedPreference {
    public static final String FAVORITES = "Database";
    public static final String PREFS_NAME = "DATA";


    public void saveFavorites(Context context, List<ModelClass> favorites) {
        Editor editor = context.getSharedPreferences(PREFS_NAME, 0).edit();
        editor.putString(FAVORITES, new Gson().toJson(favorites));

        Log.d("SharedPreference","size: "+favorites.size()+" "+new Gson().toJson((Object) favorites));
        editor.apply();
    }

    public void addFavorite(Context context, ModelClass quotes) {

        List<ModelClass> favorites = getFavorites(context);
        if (favorites == null) {
            favorites = new ArrayList();
        }
        favorites.add(quotes);
        saveFavorites(context, favorites);
    }



    public ArrayList<ModelClass> getFavorites(Context context) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_NAME, 0);
        if (!settings.contains(FAVORITES)) {
            Log.d("GetFavourites", settings.toString()+" null");
            return null;
        }
        else
            return new Gson().fromJson(settings.getString(FAVORITES,null), new TypeToken<ArrayList<ModelClass>>(){}.getType());

    }
}
