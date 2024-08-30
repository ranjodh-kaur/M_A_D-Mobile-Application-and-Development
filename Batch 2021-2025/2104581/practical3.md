## Practical 3 :- Android User Interface Design: To study various XML files needed for interface design
When designing the user interface (UI) for an Android application, several XML files are typically used. These files define the layout, styles, strings, dimensions, and other aspects of the UI. Here's an overview of the most common XML files:

### 1. **Layout Files**
Layout files define the structure and appearance of the UI components in an activity or fragment.

- **activity_main.xml**: Defines the main layout for an activity.
- **fragment_example.xml**: Defines the layout for a fragment.

Common layout elements include:
- **LinearLayout**: Arranges its children in a single column or row.
- **RelativeLayout**: Positions its children relative to each other or to the parent.
- **ConstraintLayout**: Offers more flexibility and is recommended for complex layouts.
- **FrameLayout**: Designed to block out an area on the screen to display a single item.

Example of a simple layout file (activity_main.xml):
```xml
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello, World!" />

    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Click Me" />
</LinearLayout>
```

### 2. **Resource Files**
These files store various types of resources used in the app, such as strings, colors, dimensions, and styles.

- **strings.xml**: Stores all the string resources used in the app.
- **colors.xml**: Defines the color resources.
- **dimens.xml**: Specifies dimension resources like padding and margins.
- **styles.xml**: Contains style definitions to maintain a consistent look and feel.

Example of strings.xml:
```xml
<resources>
    <string name="app_name">MyApp</string>
    <string name="hello_world">Hello, World!</string>
    <string name="button_click_me">Click Me</string>
</resources>
```

### 3. **Manifest File**
The **AndroidManifest.xml** file provides essential information about the app to the Android system, including activities, permissions, services, and broadcast receivers.

Example of AndroidManifest.xml:
```xml
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.example.myapp">

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
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

### 4. **Drawable Resources**
Drawable resources are graphics that can be drawn to the screen. These can be defined as XML files (e.g., shapes, colors, state lists) or as image files (e.g., PNG, JPEG).

Example of a shape drawable (res/drawable/rounded_button.xml):
```xml
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle">
    <corners android:radius="8dp" />
    <solid android:color="@color/colorPrimary" />
    <padding android:left="16dp" android:top="8dp" android:right="16dp" android:bottom="8dp" />
</shape>
```

### 5. **Menu Resources**
Menu resource files define the contents of app menus.

Example of a menu resource (res/menu/menu_main.xml):
```xml
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item
        android:id="@+id/action_settings"
        android:title="@string/action_settings"
        android:orderInCategory="100"
        android:showAsAction="never" />
</menu>
```

### 6. **Values Resources**
In addition to strings, colors, and dimensions, the values folder can contain other types of resources:

- **bools.xml**: Stores boolean resources.
- **integers.xml**: Stores integer resources.
- **arrays.xml**: Defines array resources.

Example of arrays.xml:
```xml
<resources>
    <string-array name="planets_array">
        <item>Mercury</item>
        <item>Venus</item>
        <item>Earth</item>
        <item>Mars</item>
    </string-array>
</resources>
```

These XML files collectively define the visual and interactive aspects of an Android application's user interface. Understanding and effectively utilizing these files is crucial for creating well-structured and maintainable Android apps.
