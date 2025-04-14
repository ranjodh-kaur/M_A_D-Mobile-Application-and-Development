# Develop a program to implement UI from Buttons Palette use Constraint Layout i.e Button, ImageButton, TogggleButton, Checkbox, Chip, ChipGroup, Radio Button and Radio Group and FloatingActionButton.
## Code 
```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/colorful_border"
    tools:context=".MainActivity">

    <!-- Profile Title -->
    <TextView
        android:id="@+id/profile_title"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Profile Settings"
        android:textSize="24sp"
        android:textStyle="bold"
        android:textColor="@color/textPrimary"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        android:layout_marginTop="24dp" />

    <!-- Upload Profile Picture (ImageButton) -->

    <!-- Enable Notifications (ToggleButton) -->
    <ImageButton
        android:id="@+id/upload_profile_image"
        android:layout_width="100dp"
        android:layout_height="100dp"
        android:layout_marginTop="8dp"
        android:background="@drawable/imagebutton_border"
        android:padding="4dp"
        android:contentDescription="Upload Profile Picture"
        android:src="@drawable/ic_upload_profile"
        android:scaleType="centerCrop"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/profile_title" />


    <ToggleButton
        android:id="@+id/toggle_notifications"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textOff="Enable Notifications"
        android:textOn="Notifications Enabled"
        android:textColor="@color/textPrimary"
        android:layout_marginTop="16dp"
        android:background="@drawable/toggle_button_background"
        app:layout_constraintTop_toBottomOf="@+id/upload_profile_image"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

    <!-- Dark Mode (CheckBox) -->
    <CheckBox
        android:id="@+id/checkbox_dark_mode"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Enable Dark Mode"
        android:textSize="16sp"
        android:textColor="@color/textPrimary"
        app:layout_constraintTop_toBottomOf="@+id/toggle_notifications"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        android:layout_marginTop="16dp" />

    <!-- Choose Interests (Chips) -->
    <TextView
        android:id="@+id/interests_title"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Select Interests"
        android:textColor="@color/textPrimary"
        android:textStyle="bold"
        android:layout_marginTop="16dp"
        app:layout_constraintTop_toBottomOf="@+id/checkbox_dark_mode"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"/>

    <com.google.android.material.chip.ChipGroup
        android:id="@+id/chipGroup"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="8dp"
        app:layout_constraintTop_toBottomOf="@+id/interests_title"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent">

        <com.google.android.material.chip.Chip
            android:id="@+id/chip_tech"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Technology"
            app:chipIcon="@drawable/ic_chip_tech"
            app:chipIconTint="@color/primaryColor" />

        <com.google.android.material.chip.Chip
            android:id="@+id/chip_music"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Music"
            app:chipIcon="@drawable/ic_chip_music"
            app:chipIconTint="@color/primaryColor" />

        <com.google.android.material.chip.Chip
            android:id="@+id/chip_sports"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Sports"
            app:chipIcon="@drawable/ic_chip_sports"
            app:chipIconTint="@color/primaryColor" />

    </com.google.android.material.chip.ChipGroup>

    <!-- Gender Selection (RadioGroup) -->
    <RadioGroup
        android:id="@+id/radioGroup_gender"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:layout_constraintTop_toBottomOf="@+id/chipGroup"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        android:layout_marginTop="16dp">

        <RadioButton
            android:id="@+id/radio_male"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Male"
            android:textColor="@color/textPrimary" />

        <RadioButton
            android:id="@+id/radio_female"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Female"
            android:textColor="@color/textPrimary" />

        <RadioButton
            android:id="@+id/radio_other"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Other"
            android:textColor="@color/textPrimary" />
    </RadioGroup>

    <!-- Submit Floating Action Button -->
    <com.google.android.material.floatingactionbutton.FloatingActionButton
        android:id="@+id/fab_submit"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@drawable/ic_fab_submit"
        android:contentDescription="Submit"
        app:backgroundTint="@color/primaryColor"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        android:layout_margin="16dp" />

</androidx.constraintlayout.widget.ConstraintLayout>
```
## Output 
![WhatsApp Image 2024-09-29 at 13 43 01_595ed2e7](https://github.com/user-attachments/assets/66e0eda6-531c-4e0b-aec9-fa10b2f27e7a)
