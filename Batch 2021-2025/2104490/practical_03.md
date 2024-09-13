
# Android User Interface Design

### Practical 3: Study of Various XML Files Needed for Interface Design

In Android development, XML is used to define the user interface (UI) layouts and resources. This practical covers the different types of XML files involved in UI design.

## 1. **Layout XML Files**

These files define the structure and appearance of the UI. Stored in the `res/layout/` directory.

Example: **activity_main.xml**
```xml
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World" />

    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Click Me" />
</LinearLayout>
```

Common Layout Types:
- **LinearLayout**: Aligns child elements in one direction (horizontal/vertical).
- **RelativeLayout**: Positions elements relative to each other.
- **ConstraintLayout**: More flexible positioning.
- **FrameLayout**: Designed for stacking elements.

## 2. **Values XML Files**

These files store resources like strings, colors, dimensions, and styles. Stored in the `res/values/` directory.

### Example Files:

**strings.xml**:
```xml
<resources>
    <string name="app_name">MyApp</string>
    <string name="hello_world">Hello World</string>
</resources>
```

**colors.xml**:
```xml
<resources>
    <color name="primaryColor">#6200EE</color>
    <color name="primaryDarkColor">#3700B3</color>
    <color name="accentColor">#03DAC5</color>
</resources>
```

**dimens.xml**:
```xml
<resources>
    <dimen name="margin_small">8dp</dimen>
    <dimen name="text_size_large">18sp</dimen>
</resources>
```

**styles.xml**:
```xml
<resources>
    <style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
        <item name="colorPrimary">@color/primaryColor</item>
        <item name="colorPrimaryDark">@color/primaryDarkColor</item>
        <item name="colorAccent">@color/accentColor</item>
    </style>
</resources>
```

## 3. **AndroidManifest.xml**

Defines essential app information like the app name, components, and permissions.

Example:
```xml
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.example.myapp">
    <application
        android:allowBackup="true"
        android:label="@string/app_name"
        android:theme="@style/AppTheme">
        <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>
</manifest>
```

## 4. **Drawable XML Files**

Stored in `res/drawable/`, these files define graphical elements like shapes, gradients, or state-based drawables.

### Example Files:

**shape.xml**:
```xml
<shape xmlns:android="http://schemas.android.com/apk/res/android">
    <solid android:color="#FF0000" />
    <corners android:radius="10dp" />
</shape>
```

**selector.xml**:
```xml
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:state_pressed="true" android:drawable="@color/colorPrimaryDark" />
    <item android:drawable="@color/colorPrimary" />
</selector>
```

## 5. **Menu XML Files**

Defines options menus or context menus. Stored in `res/menu/`.

Example:
```xml
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:id="@+id/action_settings"
        android:title="@string/action_settings"
        android:showAsAction="never" />
</menu>
```
