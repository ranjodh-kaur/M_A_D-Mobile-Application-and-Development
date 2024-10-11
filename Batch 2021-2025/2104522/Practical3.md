<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="#3366FF"
        android:padding="24dp">

        <!-- Card View for Form -->
        <androidx.cardview.widget.CardView
            android:id="@+id/cardView"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_centerInParent="true"
            android:layout_marginTop="60dp"
            app:cardCornerRadius="16dp"
            android:elevation="8dp">

            <RelativeLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:padding="24dp">

                <!-- Title: Login -->
                <TextView
                    android:id="@+id/title"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_centerHorizontal="true"
                    android:layout_marginBottom="24dp"
                    android:text="Login"
                    android:textSize="24sp"
                    android:textStyle="bold" />

                <!-- Email Input -->
                <EditText
                    android:id="@+id/email"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_below="@id/title"
                    android:layout_marginBottom="16dp"
                    android:background="@drawable/edit_text_background"
                    android:hint="Email"
                    android:padding="12dp" />

                <!-- Password Input -->
                <EditText
                    android:id="@+id/password"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_below="@id/email"
                    android:layout_marginBottom="8dp"
                    android:background="@drawable/edit_text_background"
                    android:hint="Password"
                    android:inputType="textPassword"
                    android:padding="12dp" />

                <!-- Forgot Password Link -->

                <!-- Login Button -->

                <TextView
                    android:id="@+id/forgot_password"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_below="@id/password"
                    android:layout_alignParentEnd="true"
                    android:layout_marginTop="25dp"
                    android:layout_marginEnd="121dp"
                    android:layout_marginBottom="16dp"
                    android:text="Forgot password?"
                    android:textColor="@android:color/holo_blue_dark" />

                <Button
                    android:id="@+id/loginButton"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_below="@id/forgot_password"
                    android:layout_marginBottom="16dp"
                    android:backgroundTint="@color/colorblue"
                    android:text="Login"
                    android:textColor="#FFF" />

                <!-- Signup Text -->
                <TextView
                    android:id="@+id/signup"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_below="@id/loginButton"
                    android:layout_centerHorizontal="true"
                    android:layout_marginBottom="16dp"
                    android:text="Don't have an account? Signup"
                    android:textColor="@android:color/holo_blue_dark" />

                <!-- Divider Line -->
                <View
                    android:id="@+id/divider"
                    android:layout_width="match_parent"
                    android:layout_height="1dp"
                    android:layout_below="@id/signup"
                    android:layout_marginTop="16dp"
                    android:layout_marginBottom="16dp"
                    android:background="#CCC" />

                <!-- Login with Facebook Button -->
                <Button
                    android:id="@+id/login_with_facebook"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_below="@id/divider"
                    android:layout_marginBottom="16dp"
                    android:background="#3366FF"
                    android:drawableStart="@drawable/ic_facebook"
                    android:text="Login with Facebook"
                    android:textColor="#FFF" />

                <!-- Login with Google Button -->
                <Button
                    android:id="@+id/login_with_google"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_below="@id/login_with_facebook"
                    android:background="@android:color/white"
                    android:drawableStart="@drawable/ic_google"
                    android:text="Login with Google"
                    android:textColor="@android:color/black" />

                <Button
                    android:id="@+id/login_with_google"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_below="@id/login_with_facebook"
                    android:background="@android:color/white"
                    android:drawableStart="@drawable/ic_google"
                    android:text="Login with Google"
                    android:textColor="@android:color/black" />

            </RelativeLayout>
        </androidx.cardview.widget.CardView>
    </RelativeLayout>



</androidx.constraintlayout.widget.ConstraintLayout>
