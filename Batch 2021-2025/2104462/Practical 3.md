# PRACTIACL 3
## TITLE: Android User Interface Design: To study various XML files needed for interface design.

**1. Basics of User Interface:**
   - In Android, the UI is defined using a hierarchy of View and ViewGroup objects.
   - A ViewGroup is an invisible container that organizes child views (other widgets) to create different parts of the UI.
   - One layout can be nested inside another layout. For example
     <?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <Button android:id="@+id/button1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button" />

    <TextView android:id="@+id/textView1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Sample Text"
        android:layout_marginTop="15dp"
        android:textSize="30dp" />

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <EditText android:id="@+id/editTextName"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:hint="First Name" />

        <EditText android:id="@+id/editTextLastName"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:hint="Last Name" />
    </RelativeLayout>
</LinearLayout>
  -  In this example, we have a LinearLayout containing a Button, a TextView, and a nested RelativeLayout with two EditText fields.

**2. Different XML Files Used in Android:**

  - Layout XML Files: These define the actual UI of our application. Layouts include LinearLayout, RelativeLayout, AbsoluteLayout, TableLayout, and FrameLayout.
  - Other XML files are used for various purposes, such as styling, themes, constants, permissions, icons, and activities.
