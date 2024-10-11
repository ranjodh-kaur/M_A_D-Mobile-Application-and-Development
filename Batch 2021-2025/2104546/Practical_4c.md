# Develop a program to implement relative layout to display Login and sign up form.
## code
### Login
```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center"
    android:background="#0053bf"
    android:padding="16dp" >

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@drawable/rounded_background"
        android:padding="20dp">

        <!-- Login Title -->
        <TextView
            android:id="@+id/main"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Login"
            android:textColor="#000000"
            android:textSize="40dp"
            android:textStyle="bold"
            android:layout_centerHorizontal="true"
            android:paddingBottom="20dp" />

        <!-- Email EditText -->
        <EditText
            android:id="@+id/editTextEmail"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Email"
            android:inputType="textEmailAddress"
            android:padding="12dp"
            android:backgroundTint="#cccccc"
            android:textColorHint="#000000"
            android:layout_below="@id/main"
            android:layout_marginBottom="16dp"
            android:background="@drawable/rounded_background" />

        <!-- Password EditText -->
        <EditText
            android:id="@+id/editTextPassword"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Password"
            android:inputType="textPassword"
            android:padding="12dp"
            android:backgroundTint="#cccccc"
            android:textColorHint="#000000"
            android:layout_below="@id/editTextEmail"
            android:layout_marginBottom="8dp"
            android:background="@drawable/rounded_background" />

        <!-- Forgot Password TextView -->
        <TextView
            android:id="@+id/textViewForgotPassword"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Forgot password?"
            android:textColor="#000000"
            android:layout_below="@id/editTextPassword"
            android:layout_centerHorizontal="true"
            android:layout_marginBottom="16dp" />

        <!-- Login Button -->
        <Button
            android:id="@+id/buttonLogin"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Login"
            android:textStyle="bold"
            android:textColor="#FFFFFF"
            android:background="@drawable/button_facebook_background"
            android:padding="12dp"
            android:layout_below="@id/textViewForgotPassword"
            android:layout_marginBottom="24dp" />

        <!-- Signup Text -->
        <RelativeLayout
            android:id="@+id/signupLayout"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_below="@id/buttonLogin"
            android:layout_centerHorizontal="true"
            android:layout_marginBottom="16dp">

            <TextView
                android:id="@+id/textViewNoAccount"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Don’t have an account?"
                android:textColor="#000000" />

            <TextView
                android:id="@+id/textViewSignup"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Signup"
                android:textColor="#1F70E5"
                android:textStyle="bold"
                android:layout_toEndOf="@id/textViewNoAccount"
                android:layout_marginStart="4dp"
                android:padding="4dp" />
        </RelativeLayout>

        <!-- OR Divider -->
        <TextView
            android:id="@+id/textViewOr"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Or"
            android:textColor="#000000"
            android:textSize="20sp"
            android:layout_below="@id/signupLayout"
            android:layout_centerHorizontal="true"
            android:layout_marginBottom="16dp" />

        <!-- Facebook Login Button -->
        <RelativeLayout
            android:id="@+id/facebookLoginButton"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:background="@drawable/button_facebook_background"
            android:padding="12dp"
            android:layout_below="@id/textViewOr"
            android:layout_marginBottom="16dp">

            <ImageView
                android:id="@+id/facebookLogo"
                android:layout_width="24dp"
                android:layout_height="24dp"
                android:src="@drawable/facebook_logo"
                android:layout_alignParentStart="true"
                android:layout_centerVertical="true"
                android:layout_marginEnd="8dp" />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Login with Facebook"
                android:textColor="#FFFFFF"
                android:textSize="16sp"
                android:layout_toEndOf="@id/facebookLogo"
                android:layout_centerVertical="true" />
        </RelativeLayout>

        <!-- Google Login Button -->
        <RelativeLayout
            android:id="@+id/googleLoginButton"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:background="@drawable/rounded_background"
            android:backgroundTint="#d8dce3"
            android:padding="12dp"
            android:layout_below="@id/facebookLoginButton"
            android:layout_marginBottom="16dp">

            <ImageView
                android:id="@+id/googleLogo"
                android:layout_width="24dp"
                android:layout_height="24dp"
                android:src="@drawable/google_logo"
                android:layout_alignParentStart="true"
                android:layout_centerVertical="true"
                android:layout_marginEnd="8dp" />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Login with Google"
                android:textColor="#000000"
                android:textSize="16sp"
                android:layout_toEndOf="@id/googleLogo"
                android:layout_centerVertical="true" />
        </RelativeLayout>

    </RelativeLayout>

</RelativeLayout>
```
### SignUp
```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center"
    android:background="#0053bf"
    android:padding="16dp">

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@drawable/rounded_background"
        android:padding="20dp">

        <!-- Signup Title -->
        <TextView
            android:id="@+id/main"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Signup"
            android:textColor="#000000"
            android:textSize="40dp"
            android:textStyle="bold"
            android:layout_centerHorizontal="true"
            android:paddingBottom="20dp" />

        <!-- Email EditText -->
        <EditText
            android:id="@+id/editTextEmail"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Email"
            android:inputType="textEmailAddress"
            android:padding="12dp"
            android:backgroundTint="#cccccc"
            android:textColorHint="#000000"
            android:layout_below="@id/main"
            android:layout_marginBottom="16dp"
            android:background="@drawable/rounded_background" />

        <!-- Create Password EditText -->
        <EditText
            android:id="@+id/editTextPassword"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Create Password"
            android:inputType="textPassword"
            android:padding="12dp"
            android:backgroundTint="#cccccc"
            android:textColorHint="#000000"
            android:layout_below="@id/editTextEmail"
            android:layout_marginBottom="8dp"
            android:background="@drawable/rounded_background" />

        <!-- Confirm Password EditText -->
        <EditText
            android:id="@+id/editTextPasswordconfirm"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Confirm Password"
            android:inputType="textPassword"
            android:padding="12dp"
            android:backgroundTint="#cccccc"
            android:textColorHint="#000000"
            android:layout_below="@id/editTextPassword"
            android:layout_marginBottom="8dp"
            android:background="@drawable/rounded_background" />

        <!-- Sign Up Button -->
        <RelativeLayout
            android:id="@+id/buttonSignUp"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:background="@drawable/button_facebook_background"
            android:padding="12dp"
            android:layout_below="@id/editTextPasswordconfirm"
            android:layout_marginBottom="16dp">

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="SignUp"
                android:textColor="#FFFFFF"
                android:textSize="16sp"
                android:layout_centerHorizontal="true" />
        </RelativeLayout>

        <!-- Already Have an Account Text -->
        <RelativeLayout
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_below="@id/buttonSignUp"
            android:layout_centerHorizontal="true"
            android:layout_marginBottom="16dp">

            <TextView
                android:id="@+id/textViewNoAccount"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Already have an account?"
                android:textColor="#000000" />

            <TextView
                android:id="@+id/textViewLogin"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Login"
                android:textColor="#1F70E5"
                android:textStyle="bold"
                android:layout_toEndOf="@id/textViewNoAccount"
                android:layout_marginStart="4dp"
                android:padding="4dp" />
        </RelativeLayout>

        <!-- OR Divider -->
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Or"
            android:textColor="#000000"
            android:textSize="20sp"
            android:layout_below="@id/textViewNoAccount"
            android:layout_centerHorizontal="true"
            android:layout_marginBottom="16dp" />

        <!-- Facebook Login Button -->
        <RelativeLayout
            android:id="@+id/facebookLoginButton"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:background="@drawable/button_facebook_background"
            android:padding="12dp"
            android:layout_below="@id/textViewOr"
            android:layout_marginBottom="16dp">

            <ImageView
                android:layout_width="24dp"
                android:layout_height="24dp"
                android:src="@drawable/facebook_logo"
                android:layout_alignParentStart="true"
                android:layout_centerVertical="true"
                android:layout_marginEnd="8dp" />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Login with Facebook"
                android:textColor="#FFFFFF"
                android:textSize="16sp"
                android:layout_toEndOf="@id/facebookLogo"
                android:layout_centerVertical="true" />
        </RelativeLayout>

        <!-- Google Login Button -->
        <RelativeLayout
            android:id="@+id/googleLoginButton"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:background="@drawable/rounded_background"
            android:backgroundTint="#d8dce3"
            android:padding="12dp"
            android:layout_below="@id/facebookLoginButton"
            android:layout_marginBottom="16dp">

            <ImageView
                android:layout_width="24dp"
                android:layout_height="24dp"
                android:src="@drawable/google_logo"
                android:layout_alignParentStart="true"
                android:layout_centerVertical="true"
                android:layout_marginEnd="8dp" />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Login with Google"
                android:textColor="#000000"
                android:textSize="16sp"
                android:layout_toEndOf="@id/googleLogo"
                android:layout_centerVertical="true" />
        </RelativeLayout>

    </RelativeLayout>

</RelativeLayout>
```

## Output
![WhatsApp Image 2024-09-29 at 01 22 58_94174e55](https://github.com/user-attachments/assets/3b72dcc6-6dd4-432d-b4b3-9f92778d7553)  ![WhatsApp Image 2024-09-29 at 01 33 41_a2a3bf75](https://github.com/user-attachments/assets/dc7ac3c2-ea15-4b83-91ef-0746cf3c89d7)
