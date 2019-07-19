package io.notification.test;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * This class represents ..
 * <p>
 * Created on 7/19/19 at 4:23 PM
 *
 * @author bj
 */
public class LocalData {
    private boolean isOn;
    String pref_name = "notif_pref";
    String key_notif = "key_notif";
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    public LocalData(Context context) {
        sharedPreferences = context.getSharedPreferences(pref_name, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

    }

    public boolean isOn() {
        return sharedPreferences.getBoolean(key_notif, true);

    }

    public void setOn(boolean on) {
        editor.putBoolean(key_notif, on);
        editor.apply();
    }


}
