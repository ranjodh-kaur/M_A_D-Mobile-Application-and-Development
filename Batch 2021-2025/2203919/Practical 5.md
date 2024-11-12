## PRACTICAL 5 : Apps Interactivity in Android: To incorporate element of interactivity using Android Fragment and Intent Class.
###   i. Intent class(Implicit and Explicit)

### **XML Layout File (`activity_main.xml`)**
```xml
<ScrollView
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#f0f0f0"
    android:padding="16dp">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:gravity="center_horizontal">

        <!-- Title -->
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Registration Form"
            android:textSize="24sp"
            android:textColor="#6200EA"
            android:layout_marginBottom="24dp"
            android:textStyle="bold"/>

        <!-- Name Input -->
        <EditText
            android:id="@+id/editTextName"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Enter your Name"
            android:inputType="textPersonName"
            android:padding="12dp"
            android:layout_marginBottom="16dp"
            android:backgroundTint="#6200EA"
            android:textColor="#000000"
            android:textColorHint="#808080"/>

        <!-- Email Input -->
        <EditText
            android:id="@+id/editTextEmail"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Enter your Email"
            android:inputType="textEmailAddress"
            android:padding="12dp"
            android:layout_marginBottom="16dp"
            android:backgroundTint="#6200EA"
            android:textColor="#000000"
            android:textColorHint="#808080"/>

        <!-- Roll No Input -->
        <EditText
            android:id="@+id/editTextRollNo"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Enter your Roll No"
            android:inputType="text"
            android:padding="12dp"
            android:layout_marginBottom="16dp"
            android:backgroundTint="#6200EA"
            android:textColor="#000000"
            android:textColorHint="#808080"/>

        <!-- College Name Input -->
        <EditText
            android:id="@+id/editTextCollegeName"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Enter your College Name"
            android:inputType="text"
            android:padding="12dp"
            android:layout_marginBottom="16dp"
            android:backgroundTint="#6200EA"
            android:textColor="#000000"
            android:textColorHint="#808080"/>

        <!-- Phone Number Input -->
        <EditText
            android:id="@+id/phnnumber"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Enter your Phone Number"
            android:inputType="phone"
            android:padding="12dp"
            android:layout_marginBottom="16dp"
            android:backgroundTint="#6200EA"
            android:textColor="#000000"
            android:textColorHint="#808080"/>

        <!-- Gender Selection -->
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Select Gender"
            android:textSize="16sp"
            android:textColor="#6200EA"
            android:layout_marginTop="16dp"
            android:layout_marginBottom="8dp"/>

        <RadioGroup
            android:id="@+id/radioGroupGender"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            android:layout_gravity="center_horizontal">

            <RadioButton
                android:id="@+id/radioButtonMale"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Male"
                android:textColor="#6200EA"/>

            <RadioButton
                android:id="@+id/radioButtonFemale"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Female"
                android:textColor="#6200EA"/>

            <RadioButton
                android:id="@+id/radioButtonOther"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Other"
                android:textColor="#6200EA"/>
        </RadioGroup>

        <!-- Register Button -->
        <Button
            android:id="@+id/buttonRegister"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Register"
            android:textColor="#FFFFFF"
            android:backgroundTint="#6200EA"
            android:layout_marginTop="24dp"
            android:padding="12dp"/>

        <!-- Share Information Button -->
        <Button
            android:id="@+id/buttonShare"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Share Registration Info"
            android:textColor="#FFFFFF"
            android:backgroundTint="#6200EA"
            android:layout_marginTop="16dp"
            android:padding="12dp"/>
    </LinearLayout>
</ScrollView>
```
### **XML Layout File (`second.xml`)**
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center"
    android:padding="24dp"
    android:background="#f0f0f0">

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:paddingTop="40dp"
        android:text="Your response has been submitted."
        android:textColor="@android:color/holo_orange_dark"
        android:textSize="24sp"
        android:textStyle="bold" />
</LinearLayout>
```
### *Java File (`MainActivity.java`)*
```java
package com.example.intent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Ensure this points to your registration layout

        // Initialize the buttons and EditTexts
        Button registerButton = findViewById(R.id.buttonRegister);
        Button shareButton = findViewById(R.id.buttonShare);
        final EditText editTextName = findViewById(R.id.editTextName);
        final EditText editTextEmail = findViewById(R.id.editTextEmail);
        final EditText editTextRollNo = findViewById(R.id.editTextRollNo);
        final EditText editTextCollegeName = findViewById(R.id.editTextCollegeName);
        final EditText editTextPhone = findViewById(R.id.phnnumber);
        final RadioButton radioButtonMale = findViewById(R.id.radioButtonMale);
        final RadioButton radioButtonFemale = findViewById(R.id.radioButtonFemale);
        final RadioButton radioButtonOther = findViewById(R.id.radioButtonOther);

        // Set an OnClickListener on the Register button
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the entered name
                String name = editTextName.getText().toString();

                // Create an Intent to open the SecondActivity and pass the name
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("userName", name); // Pass the name to the second activity
                startActivity(intent); // Start the second activity
            }
        });

        // Set an OnClickListener on the Share button
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the entered details
                String name = editTextName.getText().toString();
                String email = editTextEmail.getText().toString();
                String rollNo = editTextRollNo.getText().toString();
                String collegeName = editTextCollegeName.getText().toString();
                String phone = editTextPhone.getText().toString();
                String gender = "Not Specified";

                if (radioButtonMale.isChecked()) {
                    gender = "Male";
                } else if (radioButtonFemale.isChecked()) {
                    gender = "Female";
                } else if (radioButtonOther.isChecked()) {
                    gender = "Other";
                }

                // Create the share text
                String shareBody = "Registration Details:\n" +
                        "Name: " + name + "\n" +
                        "Email: " + email + "\n" +
                        "Roll No: " + rollNo + "\n" +
                        "College Name: " + collegeName + "\n" +
                        "Phone: " + phone + "\n" +
                        "Gender: " + gender;

                // Create an Intent to share the details
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Registration Info");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareBody);

                // Start the share chooser
                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
    }
}
```
### *Java File (`SecondActivity.java`)*
```java
package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second); // Ensure this points to your display layout

        // Initialize the TextView
        TextView textView = findViewById(R.id.textView);

        // Get the name from the Intent
        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");

        // Set the name with a message to the TextView
        if (userName != null && !userName.isEmpty()) {
            textView.setText( userName +", Your response has been submitted.");
        } else {
            textView.setText("Your response has been submitted.");
        }
    }
}
```
<p align="center">
<img src ="https://github.com/natasha-dhingra/M_A_D-Mobile-Application-and-Development/blob/master/Batch%202021-2025/2203919/WhatsApp%20Image%202024-10-27%20at%2021.58.45_63b148ee.jpg" width="200">
<img src="https://github.com/natasha-dhingra/M_A_D-Mobile-Application-and-Development/blob/master/Batch%202021-2025/2203919/WhatsApp%20Image%202024-10-27%20at%2021.58.44_2d04609c.jpg" width="200">
<img src="https://github.com/natasha-dhingra/M_A_D-Mobile-Application-and-Development/blob/master/Batch%202021-2025/2203919/WhatsApp%20Image%202024-10-27%20at%2021.58.44_e2edc1c1.jpg" width="200">
</p>

###   ii. Android fragments 

To demonstrate interactivity with Android Fragments, let’s create a simple app where clicking a button in one fragment updates a `TextView` in another fragment. We'll use two fragments: `FragmentA` and `FragmentB`, both hosted in a single `MainActivity`. The two fragments will communicate through the `MainActivity`.

### Step 1: Create the Project Structure

1. **MainActivity**: Hosts `FragmentA` and `FragmentB`.
2. **FragmentA**: Contains a button that, when clicked, sends a message to `FragmentB`.
3. **FragmentB**: Contains a `TextView` to display the message received from `FragmentA`.

### Step 2: Create Layout Files

#### 1. `activity_main.xml`

This layout holds two containers to host the two fragments.

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <!-- Container for FragmentA -->
    <FrameLayout
        android:id="@+id/container_fragment_a"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_weight="1"/>

    <!-- Container for FragmentB -->
    <FrameLayout
        android:id="@+id/container_fragment_b"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_weight="1"/>
</LinearLayout>
```

#### 2. `fragment_a.xml`

This layout contains a `Button` that will send a message to `FragmentB`.

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center">

    <Button
        android:id="@+id/button_send"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Send Message to FragmentB" />
</LinearLayout>
```

#### 3. `fragment_b.xml`

This layout contains a `TextView` to display the message from `FragmentA`.

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center">

    <TextView
        android:id="@+id/textview_message"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Waiting for message..."
        android:textSize="18sp"/>
</LinearLayout>
```

### Step 3: Create Fragment Classes

#### 1. `FragmentA.java`

This fragment has a button that sends a message to `MainActivity`.

```java
package com.example.myapp;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentA extends Fragment {

    private OnMessageSendListener messageSendListener;

    public interface OnMessageSendListener {
        void onMessageSend(String message);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnMessageSendListener) {
            messageSendListener = (OnMessageSendListener) context;
        } else {
            throw new RuntimeException(context.toString() + " must implement OnMessageSendListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        Button buttonSend = view.findViewById(R.id.button_send);
        buttonSend.setOnClickListener(v -> {
            if (messageSendListener != null) {
                messageSendListener.onMessageSend("Hello from FragmentA!");
            }
        });

        return view;
    }
}
```

#### 2. `FragmentB.java`

This fragment receives and displays the message from `FragmentA`.

```java
package com.example.myapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentB extends Fragment {

    private TextView textViewMessage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        textViewMessage = view.findViewById(R.id.textview_message);
        return view;
    }

    public void updateMessage(String message) {
        if (textViewMessage != null) {
            textViewMessage.setText(message);
        }
    }
}
```

### Step 4: Implement `MainActivity.java`

In `MainActivity`, we initialize `FragmentA` and `FragmentB`. We implement the `OnMessageSendListener` interface in `MainActivity` to handle messages from `FragmentA` and pass them to `FragmentB`.

```java
package com.example.myapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements FragmentA.OnMessageSendListener {

    private FragmentB fragmentB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Load FragmentA
        FragmentA fragmentA = new FragmentA();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container_fragment_a, fragmentA);
        transaction.commit();

        // Load FragmentB
        fragmentB = new FragmentB();
        FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
        transaction2.replace(R.id.container_fragment_b, fragmentB);
        transaction2.commit();
    }

    @Override
    public void onMessageSend(String message) {
        // Send message to FragmentB
        fragmentB.updateMessage(message);
    }
}
```
<p align="center">
<img src ="https://github.com/natasha-dhingra/M_A_D-Mobile-Application-and-Development/blob/master/Batch%202021-2025/2203919/fr2.jpg" width="200">
<img src="https://github.com/natasha-dhingra/M_A_D-Mobile-Application-and-Development/blob/master/Batch%202021-2025/2203919/fr1.jpg" width="200">
</p>
