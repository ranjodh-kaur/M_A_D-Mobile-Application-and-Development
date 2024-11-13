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
<img src="https://github.com/natasha-dhingra/M_A_D-Mobile-Application-and-Development/blob/master/Batch%202021-2025/2203919/registration.jpg?raw=true" width="300" height="500   >
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

### iv. Develop a program to implement table layout to display calculator.
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
<p align="center">
<img src ="https://github.com/natasha-dhingra/M_A_D-Mobile-Application-and-Development/blob/master/Batch%202021-2025/2203919/a.jpg" width="200">
</p>


### v. Develop a program to implement frame Layout to display Text View, Plain Text, Password, Password(numeric) , Email, Phone, Postal address, Multiline Text, Time, Date, Number, Number(signed) , Number (decimal), AutoCompleteTextView, MultiAutoCompleteTextView, CheckedTextView, TextInputLayout.

**XML Layout (`views.xml`):**
```xml
<?xml version="1.0" encoding="utf-8"?>
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:padding="16dp">
    <!-- TextView -->
    <TextView
        android:id="@+id/textView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="This is a TextView"
        android:textSize="18sp"
        android:layout_marginBottom="16dp" />
    <!-- Plain Text -->
    <EditText
        android:id="@+id/plainText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Plain Text"
        android:layout_marginTop="60dp" />
    <!-- Password -->
    <EditText
        android:id="@+id/passwordText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="textPassword"
        android:hint="Password"
        android:layout_marginTop="100dp" />
    <!-- Password Numeric -->
    <EditText
        android:id="@+id/passwordNumericText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="numberPassword"
        android:hint="Numeric Password"
        android:layout_marginTop="140dp" />
    <!-- Email -->
    <EditText
        android:id="@+id/emailText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="textEmailAddress"
        android:hint="Email Address"
        android:layout_marginTop="180dp" />
    <!-- Phone -->
    <EditText
        android:id="@+id/phoneText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="phone"
        android:hint="Phone Number"
        android:layout_marginTop="220dp" />
    <!-- Postal Address -->
    <EditText
        android:id="@+id/postalAddressText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="textPostalAddress"
        android:hint="Postal Address"
        android:layout_marginTop="260dp" />
    <!-- Multiline Text -->
    <EditText
        android:id="@+id/multilineText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="textMultiLine"
        android:hint="Multiline Text"
        android:lines="3"
        android:gravity="top"
        android:layout_marginTop="300dp" />
    <!-- Time -->
    <EditText
        android:id="@+id/timeText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="time"
        android:hint="Time"
        android:layout_marginTop="380dp" />
    <!-- Date -->
    <EditText
        android:id="@+id/dateText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="date"
        android:hint="Date"
        android:layout_marginTop="420dp" />
    <!-- Number -->
    <EditText
        android:id="@+id/numberText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="number"
        android:hint="Number"
        android:layout_marginTop="460dp" />
    <!-- Number (signed) -->
    <EditText
        android:id="@+id/numberSignedText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="numberSigned"
        android:hint="Number (Signed)"
        android:layout_marginTop="500dp" />
    <!-- Number (decimal) -->
    <EditText
        android:id="@+id/numberDecimalText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="numberDecimal"
        android:hint="Number (Decimal)"
        android:layout_marginTop="540dp" />
    <!-- AutoCompleteTextView -->
    <AutoCompleteTextView
        android:id="@+id/autoCompleteTextView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="AutoCompleteTextView"
        android:layout_marginTop="580dp" />
    <!-- MultiAutoCompleteTextView -->
    <MultiAutoCompleteTextView
        android:id="@+id/multiAutoCompleteTextView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="MultiAutoCompleteTextView"
        android:layout_marginTop="620dp" />
    <!-- CheckedTextView -->
    <CheckedTextView
        android:id="@+id/checkedTextView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:checkMark="?android:attr/listChoiceIndicatorSingle"
        android:text="Checked TextView"
        android:checked="true"
        android:layout_marginTop="660dp" />
    <com.google.android.material.textfield.TextInputLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="TextInputLayout"
        android:layout_marginTop="700dp">
        <com.google.android.material.textfield.TextInputEditText
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="TextInputEditText" />
    </com.google.android.material.textfield.TextInputLayout>
</FrameLayout>
```
<p align="center">
<img src ="https://github.com/natasha-dhingra/M_A_D-Mobile-Application-and-Development/blob/master/Batch%202021-2025/2203919/WhatsApp%20Image%202024-10-27%20at%2021.50.13_6bb6858e.jpg" width="200">
</p>

### vi.Develop a program to implement UI from Buttons Palette use Constraint Layout i.e Button, ImageButton, TogggleButton, Checkbox, Chip, ChipGroup, Radio Button and Radio Group and FloatingActionButton.
**XML Layout (`button.xml`):**
```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    >
    <!-- Regular Button -->
    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintBottom_toTopOf="@+id/imageButton"
        />
    <!-- ImageButton -->
    <ImageButton
        android:id="@+id/imageButton"
        android:layout_width="178dp"
        android:layout_height="160dp"
        android:contentDescription="Image Button"
        android:src="@drawable/ph"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/button"
        />
    <!-- ToggleButton -->
    <ToggleButton
        android:id="@+id/toggleButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textOn="On"
        android:textOff="Off"
        app:layout_constraintTop_toBottomOf="@+id/imageButton"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        />
    <!-- Checkbox -->
    <CheckBox
        android:id="@+id/checkBox"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Check Me"
        app:layout_constraintTop_toBottomOf="@+id/toggleButton"
        app:layout_constraintStart_toStartOf="parent"
        />
    <!-- ChipGroup with Chips -->
    <com.google.android.material.chip.ChipGroup
        android:id="@+id/chipGroup"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:layout_constraintTop_toBottomOf="@+id/checkBox"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:singleLine="true">
        <com.google.android.material.chip.Chip
            android:id="@+id/chip1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Chip 1" />
        <com.google.android.material.chip.Chip
            android:id="@+id/chip2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Chip 2" />
        <com.google.android.material.chip.Chip
            android:id="@+id/chip3"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Chip 3" />
    </com.google.android.material.chip.ChipGroup>
    <!-- RadioGroup with RadioButtons -->
    <RadioGroup
        android:id="@+id/radioGroup"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        app:layout_constraintTop_toBottomOf="@+id/chipGroup"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent">

        <RadioButton
            android:id="@+id/radioButton1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Option 1" />

        <RadioButton
            android:id="@+id/radioButton2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Option 2" />
    </RadioGroup>
    <!-- Floating Action Button -->
    <com.google.android.material.floatingactionbutton.FloatingActionButton
        android:id="@+id/floatingActionButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@android:drawable/ic_dialog_email"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:backgroundTint="@color/design_default_color_primary" />
</androidx.constraintlayout.widget.ConstraintLayout>
```
<p align="center">
<img src ="https://github.com/natasha-dhingra/M_A_D-Mobile-Application-and-Development/blob/master/Batch%202021-2025/2203919/WhatsApp%20Image%202024-10-27%20at%2021.41.49_43dbd297.jpg" width="200">
</p>

### vii. Develop a program to implement UI from Widgets Palette use Relative Layout i.e Progress Bar, SeekBar , RatingBar and Switch.
To develop an Android app that implements a UI using **RelativeLayout** with the widgets **ProgressBar**, **SeekBar**, **RatingBar**, and **Switch**, follow these steps:

### Step 1: Create a New Android Project

1. Open **Android Studio**.
2. Create a new project with **Empty Activity**.
3. Set the **Language** to **Java** (or **Kotlin**, but here I'll use Java).

### Step 2: Modify `activity_main.xml`

This file will contain the layout code using **RelativeLayout** to place the widgets (ProgressBar, SeekBar, RatingBar, and Switch).

#### `res/layout/activity_main.xml`

```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="16dp">

    <!-- ProgressBar -->
    <ProgressBar
        android:id="@+id/progressBar"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="30dp"
        android:indeterminate="true" />

    <!-- SeekBar -->
    <SeekBar
        android:id="@+id/seekBar"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@id/progressBar"
        android:layout_marginTop="40dp"
        android:max="100" />

    <!-- RatingBar -->
    <RatingBar
        android:id="@+id/ratingBar"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/seekBar"
        android:layout_marginTop="40dp"
        android:numStars="5"
        android:stepSize="0.5"
        android:rating="3.0" />

    <!-- Switch -->
    <Switch
        android:id="@+id/switch1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/ratingBar"
        android:layout_marginTop="40dp"
        android:text="Enable Feature"
        android:checked="false" />
        
</RelativeLayout>
```
### Step 3: Modify `MainActivity.java`

In this step, you will interact with these widgets programmatically (like updating the progress or responding to user inputs).

#### `src/com/example/yourapp/MainActivity.java`

```java
package com.example.yourapp;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private SeekBar seekBar;
    private RatingBar ratingBar;
    private Switch switch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the widgets
        progressBar = findViewById(R.id.progressBar);
        seekBar = findViewById(R.id.seekBar);
        ratingBar = findViewById(R.id.ratingBar);
        switch1 = findViewById(R.id.switch1);

        // SeekBar Listener
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Show the current progress value in a toast
                Toast.makeText(MainActivity.this, "SeekBar Progress: " + progress, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Optional: Code to handle when user starts tracking the SeekBar
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Optional: Code to handle when user stops tracking the SeekBar
            }
        });

        // RatingBar Listener
        ratingBar.setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> {
            // Show the rating value in a toast
            Toast.makeText(MainActivity.this, "Rating: " + rating, Toast.LENGTH_SHORT).show();
        });

        // Switch Listener
        switch1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            // Show a toast when the switch is toggled
            String message = isChecked ? "Feature Enabled" : "Feature Disabled";
            Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
        });

        // Simulating ProgressBar update
        new Thread(() -> {
            try {
                for (int i = 0; i <= 100; i++) {
                    // Simulate work being done in background
                    Thread.sleep(50);
                    progressBar.setProgress(i); // Update ProgressBar
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
```
<p align="center">
<img src ="https://github.com/natasha-dhingra/M_A_D-Mobile-Application-and-Development/blob/master/Batch%202021-2025/2203919/prac4.jpg" width="200">
<img src ="https://github.com/natasha-dhingra/M_A_D-Mobile-Application-and-Development/blob/master/Batch%202021-2025/2203919/prac4.1.jpg" width="200">
</p>

