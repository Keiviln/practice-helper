
package com.dfxy.practisehelper;

import com.dfxy.practisehelper.R;

import android.os.Bundle;
import android.preference.PreferenceActivity;


public class Settings extends PreferenceActivity {

    @SuppressWarnings("deprecation")
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        addPreferencesFromResource(R.xml.preferences);
    }
}
