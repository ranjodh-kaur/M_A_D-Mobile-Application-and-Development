## PRACTICAL 4 : Android User Interface Design: To implement different type of layouts like relative, grid, linear and table.
###   i. Develop a program to implement constraint layout to display Hello World on screen.

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

### ii.  Develop a program to implement linear layout to display send message and registration form (vertical and horizontal)

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
<p align="center">
<img src="https://github.com/natasha-dhingra/M_A_D-Mobile-Application-and-Development/blob/master/Batch%202021-2025/2203919/vertical.jpg?raw=true" width="300" height="300">
</p>

### **2. Horizontal Linear Layout (Registration Form)**
**XML Layout (`activity_registration.xml`):**

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="35dp"
    android:background="@color/orange">

<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp"
    android:background="@color/white"

    >


    <TextView
        android:id="@+id/tv1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:text="Registration Form"
        android:textSize="25dp"
        android:textStyle="bold"
        android:textColor="@color/black"/>

    <TextView
        android:id="@+id/tv2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:textStyle="bold"
        android:textSize="12dp"
        android:layout_marginTop="8dp"
        android:text="Fill out the form carefully for registration"
        android:textColor="@color/black"
         />

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="vertical">

        <TextView
            android:id="@+id/tv3"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:padding="8dp"
            android:text="Student Name"
            android:textSize="14dp"
            android:textStyle="bold"
            tools:ignore="TextSizeCheck"
            android:textColor="@color/black"/>

    </LinearLayout>

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="horizontal">


        <EditText
            android:id="@+id/ed1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:ems="10"
            android:inputType="text"
            android:layout_marginRight="16dp"
            android:textColor="@color/black"/>

        <EditText
            android:id="@+id/ed2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:ems="10"
            android:inputType="text"
            android:layout_marginLeft="16dp"
            android:textColor="@color/black"/>

    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <TextView
            android:id="@+id/tv4"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="  First Name"
            android:gravity="left"
            android:textStyle="bold"
            android:textColor="@color/black"
            android:layout_marginRight="16dp"/>


        <TextView
            android:id="@+id/tv5"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="  Last Name"
            android:textStyle="bold"
            android:textColor="@color/black"
            android:layout_marginLeft="16dp"/>/>
    </LinearLayout>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:paddingTop="16dp">

        <TextView
            android:id="@+id/tv6"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:padding="8dp"
            android:text="Gender"
            android:textSize="14dp"
            android:textStyle="bold"
            android:textColor="@color/black"
            android:layout_marginRight="16dp"/>

        <TextView
            android:id="@+id/tv7"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:padding="8dp"
            android:text="Student Email"
            android:textSize="14dp"
            android:textStyle="bold"
            android:textColor="@color/black"
            android:layout_marginLeft="16dp"/>

    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <Spinner
            android:id="@+id/spinner"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:layout_marginRight="16dp"
            android:spinnerMode="dropdown"
            android:textColor="@color/black"
           />

        <EditText
            android:id="@+id/ed3"
            android:layout_width="118dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:ems="10"
            android:inputType="textEmailAddress"
            android:layout_marginLeft="16dp"
            android:textColor="@color/black"/>
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <TextView
            android:id="@+id/tv8"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="example@example.com"
            android:gravity="right"
            />
    </LinearLayout>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:paddingTop="16dp">

        <TextView
            android:id="@+id/tv9"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:padding="8dp"
            android:text="Student Id"
            android:textSize="14dp"
            android:textStyle="bold"
            android:textColor="@color/black"
            android:layout_marginRight="16dp"/>

        <TextView
            android:id="@+id/tv10"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:padding="8dp"
            android:text="List of classes"
            android:textSize="14dp"
            android:textStyle="bold"
            android:textColor="@color/black"
            android:layout_marginLeft="16dp"/>

    </LinearLayout>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">


        <EditText
            android:id="@+id/ed4"
            android:layout_width="120dp"
            android:layout_height="wrap_content"
            android:textColor="@color/black"
            android:layout_weight="1"
            android:ems="10"
            android:inputType="text"
            android:text="" />

        <Spinner
            android:id="@+id/spinner1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:layout_marginLeft="30dp"
            />
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:paddingTop="16dp">

        <Button
            android:id="@+id/button"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center"
            android:text="Submit" />
    </LinearLayout>

</LinearLayout>
</LinearLayout>
```
<p align="center">
<img src="https://github.com/natasha-dhingra/M_A_D-Mobile-Application-and-Development/blob/master/Batch%202021-2025/2203919/registration.jpg" width="300" >
</p>

### iii. Develop a program to implement relative layout to display Login and sign up form.

**XML Layout (`sign up.xml`):**
```xml

<?xml version="1.0" encoding="utf-8"?>
    <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="16dp">
    <TextView
        android:id="@+id/textView2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Signup"
        android:textStyle="bold"
        android:textSize="25dp"
        android:layout_centerHorizontal="true"
        android:padding="25dp"/>
     <EditText
        android:id="@+id/email"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Email"
        android:inputType="textEmailAddress"
        android:padding="12dp"
        android:layout_below="@id/textView2"
        android:layout_marginTop="20dp"
        />
    <EditText
        android:id="@+id/password"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="textPassword"
        android:layout_below="@+id/email"
        android:hint="Create Password"
        android:layout_marginTop="16dp"
        />
    <EditText
        android:id="@+id/password2"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="textPassword"
        android:layout_below="@+id/password"
        android:hint="Confirm Password"
        android:layout_marginTop="16dp"
        />
    <Button
        android:id="@+id/button"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Sign up"
        android:layout_below="@+id/password2"
        android:layout_marginTop="16dp"
        android:backgroundTint="@android:color/holo_blue_dark"
        android:textColor="@color/white"/>
    <TextView
        android:id="@+id/login"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Already have an account? Login"
        android:layout_below="@+id/button"
        android:layout_centerHorizontal="true"
        android:textSize="18dp"
        android:layout_marginTop="16dp"/>
    <LinearLayout
        android:id="@+id/divider_with_or"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@id/login"
        android:orientation="horizontal"
        android:gravity="center"
        android:layout_marginTop="20dp"
        android:layout_marginBottom="20dp">

        <View
            android:layout_width="0dp"
            android:layout_height="1dp"
            android:layout_weight="1"
            android:background="@android:color/darker_gray"/>

        <TextView
            android:id="@+id/or"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Or"
            android:textSize="18sp"
            android:textColor="@android:color/darker_gray"
            android:layout_marginStart="8dp"
            android:layout_marginEnd="8dp"/>

        <View
            android:layout_width="0dp"
            android:layout_height="1dp"
            android:layout_weight="1"
            android:background="@android:color/darker_gray"/>
    </LinearLayout>
    <LinearLayout
        android:id="@+id/login_facebook_button"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:background="@android:color/holo_blue_dark"
        android:padding="12dp"
        android:gravity="center"
        android:layout_below="@id/divider_with_or"
        android:layout_marginBottom="16dp">
        <ImageView
            android:layout_width="24dp"
            android:layout_height="24dp"
            android:src="@drawable/fb" /> <!-- Facebook icon -->
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Login with Facebook"
            android:layout_marginStart="8dp"
            android:textColor="@android:color/white"
            android:textSize="16sp"/>
    </LinearLayout>
    <LinearLayout
        android:id="@+id/login_google_button"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:backgroundTint="@android:color/white"
        android:padding="12dp"
        android:gravity="center"
        android:layout_below="@id/login_facebook_button">
        <ImageView
            android:layout_width="24dp"
            android:layout_height="24dp"
            android:src="@drawable/goo" /> <!-- Google icon -->
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Login with Google"
            android:layout_marginStart="8dp"
            android:textSize="16sp"/>
    </LinearLayout>
</RelativeLayout>
```

**XML Layout (`login.xml`):**
```xml
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="16dp">
    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Login"
        android:textSize="25dp"
        android:textStyle="bold"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="40dp"/>
    <EditText
        android:id="@+id/email"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Email"
        android:inputType="textEmailAddress"
        android:padding="12dp"
        android:layout_below="@id/textView"
        android:layout_marginTop="30dp"
        />
   <EditText
        android:id="@+id/password"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:ems="10"
        android:inputType="textPassword"
        android:hint="Password"
        android:layout_below="@+id/email"
        android:layout_marginTop="16dp"
        android:padding="12dp"/>
    <TextView
        android:id="@+id/forgot_password"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Forgot password?"
        android:textColor="@android:color/holo_blue_dark"
        android:textSize="20dp"
        android:layout_centerHorizontal="true"
        android:layout_below="@id/password"
        android:layout_marginTop="10dp"/>
    <Button
        android:id="@+id/login_button"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Login"
        android:backgroundTint="@android:color/holo_blue_dark"
        android:textColor="@android:color/white"
        android:layout_below="@id/forgot_password"
        android:layout_marginTop="20dp"/>
    <TextView
        android:id="@+id/sign_up"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Don't have an account? Signup"
        android:textSize="18dp"
        android:layout_centerHorizontal="true"
        android:layout_below="@id/login_button"
        android:layout_marginTop="16dp"/>

    <LinearLayout
        android:id="@+id/divider_with_or"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@id/sign_up"
        android:orientation="horizontal"
        android:gravity="center"
        android:layout_marginTop="20dp"
        android:layout_marginBottom="20dp">
        <View
            android:layout_width="0dp"
            android:layout_height="1dp"
            android:layout_weight="1"
            android:background="@android:color/darker_gray"/>
        <TextView
            android:id="@+id/or"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Or"
            android:textSize="18sp"
            android:textColor="@android:color/darker_gray"
            android:layout_marginStart="8dp"
            android:layout_marginEnd="8dp"/>
        <View
            android:layout_width="0dp"
            android:layout_height="1dp"
            android:layout_weight="1"
            android:background="@android:color/darker_gray"/>
    </LinearLayout>
    <LinearLayout
        android:id="@+id/login_facebook_button"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:background="@android:color/holo_blue_dark"
        android:padding="12dp"
        android:gravity="center"
        android:layout_below="@id/divider_with_or"
        android:layout_marginBottom="16dp">
        <ImageView
            android:layout_width="24dp"
            android:layout_height="24dp"
            android:src="@drawable/fb" /> <!-- Facebook icon -->
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Login with Facebook"
            android:layout_marginStart="8dp"
            android:textColor="@android:color/white"
            android:textSize="16sp"/>
    </LinearLayout>
    <LinearLayout
        android:id="@+id/login_google_button"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:backgroundTint="@android:color/white"
        android:padding="12dp"
        android:gravity="center"
        android:layout_below="@id/login_facebook_button">
        <ImageView
            android:layout_width="24dp"
            android:layout_height="24dp"
            android:src="@drawable/goo" /> <!-- Google icon -->
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Login with Google"
            android:layout_marginStart="8dp"
            android:textSize="16sp"/>
    </LinearLayout>
</RelativeLayout>
```
<p align="center">
<img src ="https://github.com/natasha-dhingra/M_A_D-Mobile-Application-and-Development/blob/master/Batch%202021-2025/2203919/signup.jpg" width="200">
<img src="https://github.com/natasha-dhingra/M_A_D-Mobile-Application-and-Development/blob/master/Batch%202021-2025/2203919/login.jpg" width="200">
</p>

### iii. Develop a program to implement relative layout to display Login and sign up form.
**XML Layout (`calculator.xml`):**
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp">
    <TextView
        android:id="@+id/calculation_display"
        android:layout_width="match_parent"
        android:layout_height="100dp"
        android:background="#EEEEEE"
        android:textColor="#000000"
        android:textSize="30sp"
        android:gravity="end|center_vertical"
        android:padding="16dp"
        android:text="0" />
    <TableLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:stretchColumns="*"
        android:layout_gravity="center">
        <TableRow
            android:layout_width="match_parent"
            android:layout_height="wrap_content">
            <Button
                android:layout_width="20dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="AC"
                android:background="#5C6BC0"
                android:textColor="#FFFFFF"
                android:layout_margin="4dp" />
            <Button
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="()"
                android:background="#5C6BC0"
                android:textColor="#FFFFFF"
                android:layout_margin="4dp" />
            <Button
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="%"
                android:background="#5C6BC0"
                android:textColor="#FFFFFF"
                android:layout_margin="4dp" />
        </TableRow>
        <TableRow
            android:layout_width="match_parent"
            android:layout_height="wrap_content">
            <Button
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="7"
                android:background="#9575CD"
                android:textColor="#FFFFFF"
                android:layout_margin="4dp" />
            <Button
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="8"
                android:background="#9575CD"
                android:textColor="#FFFFFF"
                android:layout_margin="4dp" />
            <Button
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="9"
                android:background="#9575CD"
                android:textColor="#FFFFFF"
                android:layout_margin="4dp" />
            <Button
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="/"
                android:background="#3949AB"
                android:textColor="#FFFFFF"
                android:layout_margin="4dp" />
        </TableRow>
        <TableRow
            android:layout_width="match_parent"
            android:layout_height="wrap_content">
            <Button
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="4"
                android:background="#9575CD"
                android:textColor="#FFFFFF"
                android:layout_margin="4dp" />
            <Button
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="5"
                android:background="#9575CD"
                android:textColor="#FFFFFF"
                android:layout_margin="4dp" />
            <Button
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="6"
                android:background="#9575CD"
                android:textColor="#FFFFFF"
                android:layout_margin="4dp" />
            <Button
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="*"
                android:background="#3949AB"
                android:textColor="#FFFFFF"
                android:layout_margin="4dp" />
        </TableRow>
        <TableRow
            android:layout_width="match_parent"
            android:layout_height="wrap_content">
            <Button
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="1"
                android:background="#9575CD"
                android:textColor="#FFFFFF"
                android:layout_margin="4dp" />
            <Button
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="2"
                android:background="#9575CD"
                android:textColor="#FFFFFF"
                android:layout_margin="4dp" />
            <Button
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="3"
                android:background="#9575CD"
                android:textColor="#FFFFFF"
                android:layout_margin="4dp" />
            <Button
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="-"
                android:background="#3949AB"
                android:textColor="#FFFFFF"
                android:layout_margin="4dp" />
        </TableRow>
        <TableRow
            android:layout_width="match_parent"
            android:layout_height="wrap_content">
            <Button
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="."
                android:background="#9575CD"
                android:textColor="#FFFFFF"
                android:layout_margin="4dp" />
            <Button
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="0"
                android:background="#9575CD"
                android:textColor="#FFFFFF"
                android:layout_margin="4dp" />
            <Button
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="="
                android:background="#FF5722"
                android:textColor="#FFFFFF"
                android:layout_margin="4dp" />
            <Button
                android:layout_width="0dp"
                android:layout_height="80dp"
                android:layout_weight="1"
                android:text="+"
                android:background="#3949AB"
                android:textColor="#FFFFFF"
                android:layout_margin="4dp" />
        </TableRow>
    </TableLayout>
</LinearLayout>
```
<img src ="https://github.com/natasha-dhingra/M_A_D-Mobile-Application-and-Development/blob/master/Batch%202021-2025/2203919/signup.jpg" width="200">
