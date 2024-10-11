# Develop a program to implement linear layout to display send message and registration form (vertical and horizontal).
## code
```xml
<?xml version="1.0" encoding="utf-8"?>
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingTop="40dp">

    <!-- Title TextView -->
    <TextView
        android:layout_width="420dp"
        android:layout_height="wrap_content"
        android:layout_gravity="top|center_horizontal"
        android:background="#6200EE"
        android:padding="8dp"
        android:text="LinearLayout"
        android:textAlignment="center"
        android:textColor="#FFFFFF"
        android:textSize="30dp"
        android:textStyle="bold" />

    <!-- Separate LinearLayout Content -->
    <LinearLayout
        android:id="@+id/main"
        android:layout_width="match_parent"
        android:layout_height="397dp"
        android:layout_marginTop="30dp"
        android:layout_marginBottom="90sp"
        android:orientation="vertical">

        <!-- "To" Field -->
        <TextView
            android:layout_width="match_parent"
            android:layout_height="55dp"
            android:padding="10dp"
            android:text="To"
            android:textColor="#000000"
            android:textSize="16sp" />

        <View
            android:layout_width="match_parent"
            android:layout_height="1dp"
            android:background="#000000" />

        <TextView
            android:layout_width="match_parent"
            android:layout_height="50dp"
            android:padding="10dp"
            android:text="Subject"
            android:textColor="#000000"
            android:textSize="16sp" />

        <View
            android:layout_width="match_parent"
            android:layout_height="1dp"
            android:background="#000000" />
        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:padding="10dp"
            android:text="Message"
            android:textColor="#000000"
            android:textSize="16sp" />
        <View
            android:layout_width="match_parent"
            android:layout_height="1dp"
            android:background="#000000" />

    </LinearLayout>

    <!-- Send Button positioned at the bottom right corner -->
    <Button
        android:layout_width="120dp"
        android:layout_height="50dp"
        android:layout_gravity="bottom|end"
        android:background="#6200EE"
        android:padding="10dp"
        android:text="Send"
        android:textColor="#FFFFFF"
        android:layout_margin="16dp" />

</FrameLayout>
```
## Output
![WhatsApp Image 2024-09-28 at 16 53 34_43f8d68d](https://github.com/user-attachments/assets/ee88d7e2-519f-4395-91bc-28e7215e83e3)

## code
```xml
<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingTop="60dp"
    android:paddingLeft="25dp"
    android:paddingRight="25dp"
    android:background="#FFA500">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:id="@+id/main"
        android:paddingLeft="90dp"
        android:background="@drawable/rounded_background">

        <!-- Title Section -->
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Registration Form"
            android:textSize="24sp"
            android:textStyle="bold"
            android:textColor="#000000"
            android:layout_gravity="center" />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Fill out the form carefully for registration"
            android:textSize="14sp"
            android:textColor="#777777"
            android:layout_gravity="center"
            android:layout_marginBottom="16dp" />

        <!-- Student Name Section -->
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Student Name"
            android:textSize="16sp"
            android:textColor="#000000"
            android:paddingLeft="15dp"
            android:layout_marginTop="10dp" />

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            android:weightSum="2"
            android:layout_marginBottom="16dp">

            <EditText
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:hint="First Name"
                android:paddingLeft="15dp"
                android:background="@android:drawable/editbox_background"
                android:layout_marginEnd="8dp"/>

            <EditText
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:hint="Last Name"
                android:paddingLeft="15dp"
                android:background="@android:drawable/editbox_background"/>
        </LinearLayout>

        <!-- Gender Section -->
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Gender"
            android:textSize="16sp"
            android:paddingLeft="15dp"
            android:textColor="#000000" />

        <Spinner
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginBottom="16dp"
            android:paddingLeft="15dp"
            android:entries="@array/gender_array"
            android:background="@android:drawable/editbox_dropdown_light_frame"/>

        <!-- Student Email Section -->
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Student E-mail"
            android:paddingLeft="15dp"
            android:textSize="16sp"
            android:textColor="#000000" />

        <EditText
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="ex: myname@example.com"
            android:inputType="textEmailAddress"
            android:paddingLeft="15dp"
            android:layout_marginBottom="16dp"
            android:background="@android:drawable/editbox_background" />

        <!-- Student ID Section -->
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Student ID"
            android:paddingLeft="15dp"
            android:textSize="16sp"
            android:textColor="#000000" />

        <EditText
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Enter Student ID"
            android:paddingLeft="15dp"
            android:layout_marginBottom="16dp"
            android:background="@android:drawable/editbox_background" />

        <!-- List of Classes Section -->
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="List of Classes"
            android:paddingLeft="15dp"
            android:textSize="16sp"
            android:textColor="#000000" />

        <Spinner
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginBottom="16dp"
            android:paddingLeft="15dp"
            android:entries="@array/class_list"
            android:background="@android:drawable/editbox_dropdown_light_frame"/>

        <!-- Submit Button -->
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Submit"
            android:textColor="#FFFFFF"
            android:background="#008000"
            android:layout_gravity="center"
            android:paddingLeft="15dp"
            android:layout_marginTop="16dp"/>

    </LinearLayout>
</ScrollView>
```
## Output 
![WhatsApp Image 2024-09-28 at 18 24 23_78faaa67](https://github.com/user-attachments/assets/6ea31316-a364-4f5b-9e19-ca529add3d19)
