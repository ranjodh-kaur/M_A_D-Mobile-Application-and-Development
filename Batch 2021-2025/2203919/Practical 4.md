## PRACTICAL 4 : Android User Interface Design: To implement different type of layouts like relative, grid, linear and table.
* ### Develop a program to implement constraint layout to display Hello World on screen.

Here’s how you can create an Android application that uses ConstraintLayout to display "Hello World" on the screen. Below are the XML layout file and the Java file for the activity.

### **XML Layout File (`activity_main.xml`)**

```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:id="@+id/helloWorldTextView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        android:textSize="24sp"
        android:textColor="@android:color/black"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"/>
</androidx.constraintlayout.widget.ConstraintLayout>
```

### **Java File (`MainActivity.java`)**

```java
package com.example.helloworldapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Links this activity to activity_main.xml
    }
}
```

This setup will display "Hello World!" centered on the screen using a ConstraintLayout.
<p align="center">
    <img src="https://github.com/natasha-dhingra/M_A_D-Mobile-Application-and-Development/blob/master/Batch%202021-2025/2203919/WhatsApp%20Image%202024-08-30%20at%2012.00.13_bd7c567d.jpg?raw=true" alt="My Image" width="300" height="300"/>
</p>

* ###   Develop a program to implement linear layout to display send message and registration form (vertical and horizontal)

### **1. Vertical Linear Layout (Send Message Form)**

**XML Layout (`activity_send_message.xml`):**

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp">

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="To" />

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Subject"
        android:layout_marginTop="8dp" />

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Message"
        android:layout_marginTop="8dp" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="SEND"
        android:layout_gravity="end"
        android:layout_marginTop="16dp" />
</LinearLayout>
```

**Java Activity File (`SendMessageActivity.java`):**

```java
package com.example.linearlayoutapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class SendMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message); // Links to activity_send_message.xml
    }
}
```
