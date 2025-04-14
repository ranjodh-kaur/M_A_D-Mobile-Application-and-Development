# Develop a program to implement UI from Text Palette use Linear Layout two Login windows. First is to Login with a Key use [Password(numeric)] and in second UI implement frame Layout to display Phone, Postal address, Time, Date, Number, Number(signed) , Number (decimal), AutoCompleteTextView, MultiAutoCompleteTextView, CheckedTextView, TextInputLayout.
## Login page
### code
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp"
    android:gravity="center"
    android:background="@drawable/border"> <!-- Applying the border drawable -->

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Login"
        android:textSize="24sp"
        android:textColor="#000"
        android:layout_gravity="center" />

    <EditText
        android:id="@+id/editTextPassword"
        android:layout_width="389dp"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:hint="Enter Numeric Password"
        android:inputType="numberPassword"
        android:padding="10dp"
        android:paddingRight="15dp"
        android:textColorHint="#000000" />

    <Button
        android:background="#00A4FE"
        android:backgroundTint="@color/button"
        android:id="@+id/buttonLogin"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Login"
        android:textColor="#FFFFFF"
        android:layout_gravity="center"
        android:layout_marginTop="24dp"
        />
</LinearLayout>
```
### Output 
![WhatsApp Image 2024-09-29 at 15 31 38_2bfc9f5f](https://github.com/user-attachments/assets/71c5f72a-f288-496e-8b07-92f464645690)

## Details page 
### Code 
```xml
<?xml version="1.0" encoding="utf-8"?>
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="16dp"
    android:background="@drawable/border"
    >

    <ScrollView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:padding="10dp">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical">

            <EditText
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Phone"
                android:textColorHint="#000000"
                android:inputType="phone" />

            <EditText
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Postal Address"
                android:textColorHint="#000000"
                android:inputType="textPostalAddress" />

            <EditText
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Date"
                android:textColorHint="#000000"
                android:inputType="date" />

            <EditText
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Time"
                android:textColorHint="#000000"
                android:inputType="time" />

            <EditText
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Number"
                android:textColorHint="#000000"
                android:inputType="number" />

            <EditText
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Number (signed)"
                android:textColorHint="#000000"
                android:inputType="numberSigned" />

            <EditText
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Number (decimal)"
                android:textColorHint="#000000"
                android:inputType="numberDecimal" />

            <AutoCompleteTextView
                android:id="@+id/autoCompleteTextView"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="AutoCompleteTextView"
                android:textColorHint="#000000"
                android:inputType="text"
                />

            <MultiAutoCompleteTextView
                android:id="@+id/multiAutoCompleteTextView"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="MultiAutoCompleteTextView"
                android:textColorHint="#000000"
                android:inputType="text" />

            <CheckedTextView
                android:id="@+id/checkedTextView"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="CheckedTextView"
                android:textColor="#000000"
                android:checkMark="?android:attr/listChoiceIndicatorMultiple"
                android:padding="10dp" />

            <com.google.android.material.textfield.TextInputLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content">

                <com.google.android.material.textfield.TextInputEditText
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:hint="TextInputLayout"
                    android:textColorHint="#000000"/>
            </com.google.android.material.textfield.TextInputLayout>
        </LinearLayout>
    </ScrollView>
</FrameLayout>
```
### Output
![WhatsApp Image 2024-09-29 at 15 31 38_1b70a48f](https://github.com/user-attachments/assets/5bf71ae4-d4e7-4226-9032-51d1c080ca56)
