## Practical 3 :- Android User Interface Design: To study various XML files needed for interface design
When designing Android user interfaces, several XML files play crucial roles in defining the layout, styles, and resources. Here are the primary XML files you'll encounter:

1. **Layout Files (`activity_main.xml` or `fragment.xml`)**:
   - **Purpose**: Define the structure and arrangement of UI components (e.g., TextView, Button, ImageView).
   - **Location**: `res/layout/`
   - **Example**:
     ```xml
     <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
         android:layout_width="match_parent"
         android:layout_height="match_parent"
         android:orientation="vertical">

         <TextView
             android:id="@+id/textView"
             android:layout_width="wrap_content"
             android:layout_height="wrap_content"
             android:text="Hello World!" />

         <Button
             android:id="@+id/button"
             android:layout_width="wrap_content"
             android:layout_height="wrap_content"
             android:text="Click Me" />
     </LinearLayout>
     ```

2. **Resource Files (`strings.xml`, `colors.xml`, `styles.xml`)**:
   - **Purpose**: Store string resources, color values, and style definitions used across your app.
   - **Location**: `res/values/`
   - **Examples**:
     - `strings.xml`:
       ```xml
       <resources>
           <string name="app_name">MyApp</string>
           <string name="hello_world">Hello World!</string>
       </resources>
       ```
     - `colors.xml`:
       ```xml
       <resources>
           <color name="primaryColor">#6200EE</color>
           <color name="primaryDarkColor">#3700B3</color>
       </resources>
       ```
     - `styles.xml`:
       ```xml
       <resources>
           <style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
               <item name="colorPrimary">@color/primaryColor</item>
               <item name="colorPrimaryDark">@color/primaryDarkColor</item>
           </style>
       </resources>
       ```

3. **Manifest File (`AndroidManifest.xml`)**:
   - **Purpose**: Define essential information about your app, such as activities, permissions, and application components.
   - **Location**: Root directory of the project.
   - **Example**:
     ```xml
     <manifest xmlns:android="http://schemas.android.com/apk/res/android"
         package="com.example.myapp">

         <application
             android:allowBackup="true"
             android:icon="@mipmap/ic_launcher"
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

4. **Drawable Files (`drawable.xml`)**:
   - **Purpose**: Define shapes, colors, gradients, and other graphical elements that can be used as backgrounds or icons.
   - **Location**: `res/drawable/`
   - **Example**:
     ```xml
     <shape xmlns:android="http://schemas.android.com/apk/res/android">
         <solid android:color="#FF0000" />
         <corners android:radius="10dp" />
     </shape>
     ```

5. **Menu Files (`menu.xml`)**:
   - **Purpose**: Define the options menu or context menu.
   - **Location**: `res/menu/`
   - **Example**:
     ```xml
     <menu xmlns:android="http://schemas.android.com/apk/res/android">
         <item
             android:id="@+id/action_settings"
             android:title="Settings"
             android:orderInCategory="100"
             android:showAsAction="never" />
     </menu>
     ```

These files work together to create the visual structure, define reusable resources, and manage UI-related elements of your Android app.
