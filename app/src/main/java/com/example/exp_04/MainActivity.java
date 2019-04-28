package com.example.exp_04;

import android.preference.PreferenceActivity;
import android.preference.PreferenceCategory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addPreferencesFromResource(R.xml.preference);
    }
}
