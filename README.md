# About

> PreferenceActiviry Practices

## 一.截图

![PreferenceFragment](https://github.com/nomenofear/Android_exp_04/blob/master/app/img/img1.png "PreferenceFragment")

## 二.关键代码

> preference.xml

```xml
<?xml version="1.0" encoding="utf-8"?>
<PreferenceScreen xmlns:android="http://schemas.android.com/apk/res/android">
    <PreferenceCategory
        android:title="In-line Preferences">
    <CheckBoxPreference
        android:key="pref_sync"
        android:id="@+id/cb_preference"
        android:title="CheckBoxPreference"
        android:defaultValue="true"
        android:summary="this is a CheckBoxPreference"
        />
    </PreferenceCategory>

    <PreferenceCategory
        android:title="Dialog-based Preferences">
        <EditTextPreference
            android:dialogTitle="EditTextPreference"
            android:key="editTitlePreference"
            android:summary="简要说明"
            
            />
        <ListPreference
            android:key="pref_listoption"
            android:title="ListPreference"
            android:entries="@array/list_preference_options"
            android:entryValues="@array/entry_values"/>

    </PreferenceCategory>

    <PreferenceCategory
        android:title="Launch Preferences">
        <PreferenceScreen
            android:title="Screen Preference"
            android:summary="Show another screen of preference"
            >
            <Preference
                android:key="pref_intent1"
                android:title="Screen Preference"
                />
        </PreferenceScreen>
        <Preference
            android:title="Jump to my website"
            android:summary="Launch an Activity from an intent">
        <intent
            android:action="android.intent.action.VIEW"
            android:data="http://baidu.com" />
        </Preference>
    </PreferenceCategory>

    <PreferenceCategory
        android:title="Preference Attributes">
        <CheckBoxPreference
            android:key="checkbox"
            android:title="Parent CheckBox Preference"
            android:disableDependentsState="false"/>
        <ListPreference
            android:title="First SubOption"
            android:dependency="checkbox"
            android:entries="@array/list_preference_options"
            android:entryValues="@array/entry_values"
            />
        <Preference
            android:title="Second SubOption"
            android:dependency="checkbox"
        />
    </PreferenceCategory>

</PreferenceScreen>
```

> 

> activity_main.xml  layout

```xml
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <ListView
        android:id="@android:id/list"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

    </ListView>

</android.support.constraint.ConstraintLayout>
```

> MainActivity.java

```java
   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addPreferencesFromResource(R.xml.preference);
    }
```





## end
