## Practical 4. Android User Interface Design: To implement different type of layouts like relative, grid, linear and table.

### A) Develop a program to implement constraint layout to display Hello World on screen.

```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/constraintLayout"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#FFEBEE"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World"
        android:textSize="24sp"
        android:textColor="@android:color/black"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
```
![4a](https://github.com/user-attachments/assets/9b70474f-67ef-4a3c-b83e-79b481a6876a)

### B) Develop a program to implement linear layout to display send message and registration form (vertical and horizontal)

```xml
<com.google.android.material.textfield.TextInputLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_marginBottom="10dp"
    app:hintTextColor="@color/your_hint_color"
    app:boxStrokeColor="@color/red"   <!-- This sets the color of the underline -->
    app:boxStrokeErrorColor="@color/red" <!-- This sets the color of the underline when there's an error -->

    <!-- Optional: Customize other styles -->
    app:boxBackgroundMode="outline">
    
    <EditText
        android:id="@+id/toField"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="To"
        android:inputType="textEmailAddress"
        android:padding="10dp" />
    
</com.google.android.material.textfield.TextInputLayout>

```

![4b](https://github.com/user-attachments/assets/21f5c929-a35a-41f5-941f-852237483534)


### C) Develop a program to implement relative layout to display Login and sign up form.

```xml
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#0078FF"> <!-- Light blue background -->

    <!-- Login Form -->
    <LinearLayout
        android:id="@+id/login_layout"
        android:layout_width="157dp"
        android:layout_height="482dp"
        android:layout_alignParentLeft="true"
        android:layout_centerVertical="true"
        android:layout_marginLeft="15dp"
        android:layout_marginTop="50dp"
        android:background="#FFFFFF"
        android:elevation="8dp"
        android:orientation="vertical"
        android:padding="16dp">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center_horizontal"
            android:text="Login"
            android:textColor="#000000"
            android:textSize="24sp"
            android:textStyle="bold" />

        <EditText
            android:id="@+id/editTextEmailLogin"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="16dp"
            android:backgroundTint="#D3D3D3"
            android:hint="Email"
            android:inputType="textEmailAddress"
            android:textColor="#000000"
            android:textColorHint="#A9A9A9" />

        <EditText
            android:id="@+id/editTextPasswordLogin"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="8dp"
            android:backgroundTint="#D3D3D3"
            android:hint="Password"
            android:inputType="textPassword"
            android:textColor="#000000"
            android:textColorHint="#A9A9A9" />

        <TextView
            android:id="@+id/forgotPassword"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center_horizontal"
            android:layout_marginTop="8dp"
            android:text="Forgot password?"
            android:textColor="#0078FF" />

        <Button
            android:id="@+id/buttonLogin"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="16dp"
            android:backgroundTint="#0078FF"
            android:text="Login"
            android:textColor="#FFFFFF" />

        <!-- Social Login Options for Login -->
        <TextView
            android:id="@+id/loginOrSeparator"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center_horizontal"
            android:layout_marginTop="16dp"
            android:text="Or"
            android:textColor="#A9A9A9" />

        <Button
            android:id="@+id/buttonLoginFacebook"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="8dp"
            android:backgroundTint="#4267B2"
            android:drawableStart="@drawable/fb"
            android:text="Continue with Facebook"
            android:textColor="#FFFFFF" />

        <Button
            android:id="@+id/buttonLoginGoogle"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="8dp"
            android:backgroundTint="#DB4437"
            android:drawableStart="@drawable/google"
            android:text="Continue with Google"
            android:textColor="#FFFFFF" />

    </LinearLayout>

    <!-- Signup Form -->
    <LinearLayout
        android:id="@+id/signup_layout"
        android:layout_width="156dp"
        android:layout_height="483dp"
        android:layout_alignParentRight="true"
        android:layout_centerVertical="true"
        android:layout_marginTop="50dp"
        android:layout_marginRight="10dp"
        android:background="#FFFFFF"
        android:elevation="8dp"
        android:orientation="vertical"
        android:padding="16dp">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center_horizontal"
            android:text="Signup"
            android:textColor="#000000"
            android:textSize="24sp"
            android:textStyle="bold" />

        <EditText
            android:id="@+id/editTextEmailSignup"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="16dp"
            android:backgroundTint="#D3D3D3"
            android:hint="Email"
            android:inputType="textEmailAddress"
            android:textColor="#000000"
            android:textColorHint="#A9A9A9" />

        <EditText
            android:id="@+id/editTextPasswordSignup"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="8dp"
            android:backgroundTint="#D3D3D3"
            android:hint="Create password"
            android:inputType="textPassword"
            android:textColor="#000000"
            android:textColorHint="#A9A9A9" />

        <EditText
            android:id="@+id/editTextConfirmPasswordSignup"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="8dp"
            android:backgroundTint="#D3D3D3"
            android:hint="Confirm password"
            android:inputType="textPassword"
            android:textColor="#000000"
            android:textColorHint="#A9A9A9" />

        <Button
            android:id="@+id/buttonSignup"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="16dp"
            android:backgroundTint="#0078FF"
            android:text="Signup"
            android:textColor="#FFFFFF" />

        <!-- Social Signup Options -->
        <TextView
            android:id="@+id/signupOrSeparator"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center_horizontal"
            android:layout_marginTop="16dp"
            android:text="Or"
            android:textColor="#A9A9A9" />

        <Button
            android:id="@+id/buttonSignupFacebook"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="8dp"
            android:backgroundTint="#4267B2"
            android:drawableStart="@drawable/fb"
            android:text="Continue with Facebook"
            android:textColor="#FFFFFF" />

        <Button
            android:id="@+id/buttonSignupGoogle"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="8dp"
            android:backgroundTint="#DB4437"
            android:drawableStart="@drawable/google"
            android:text="Continue with Google"
            android:textColor="#FFFFFF" />
    </LinearLayout>
</RelativeLayout>

```

![4c](https://github.com/user-attachments/assets/4086a621-ce39-4bc5-8987-a4df5a46ea46)

### D) Develop a program to implement table layout to display calculator.

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="8dp"
    android:gravity="center"
    android:background="#f0f0f0">

    <!-- Display Area for Results -->
    <TextView
        android:id="@+id/display"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_marginBottom="8dp"
        android:layout_weight="1"
        android:background="#FFFFFF"
        android:gravity="end|center_vertical"
        android:padding="16dp"
        android:text="0"
        android:textColor="#000000"
        android:textSize="36sp" />

    <!-- TableLayout for Calculator Buttons -->
    <TableLayout
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="3"
        android:shrinkColumns="*"
        android:stretchColumns="*">

        <!-- First Row (AC, (), %, /) -->
        <TableRow
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1">

            <Button
                android:id="@+id/btn_clear"
                android:layout_width="0dp"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:background="#6b6b6b"
                android:text="AC"
                android:textColor="#FFFFFF"
                android:textSize="24sp" />

            <Button
                android:id="@+id/btn_parantheses"
                android:layout_width="0dp"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:background="#6b6b6b"
                android:text="()"
                android:textColor="#FFFFFF"
                android:textSize="24sp" />

            <Button
                android:id="@+id/btn_percentage"
                android:layout_width="0dp"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:background="#6b6b6b"
                android:text="%"
                android:textColor="#FFFFFF"
                android:textSize="24sp" />

            <Button
                android:id="@+id/btn_divide"
                android:layout_width="0dp"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:background="#6b6b6b"
                android:text="/"
                android:textColor="#FFFFFF"
                android:textSize="24sp" />
        </TableRow>

        <!-- Second Row (7, 8, 9, *) -->
        <TableRow
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1">

            <Button
                android:id="@+id/btn_7"
                android:layout_width="0dp"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:background="#cfd8dc"
                android:text="7"
                android:textSize="24sp" />

            <Button
                android:id="@+id/btn_8"
                android:layout_width="0dp"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:background="#cfd8dc"
                android:text="8"
                android:textSize="24sp" />

            <Button
                android:id="@+id/btn_9"
                android:layout_width="0dp"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:background="#cfd8dc"
                android:text="9"
                android:textSize="24sp" />

            <Button
                android:id="@+id/btn_multiply"
                android:layout_width="0dp"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:background="#6b6b6b"
                android:text="*"
                android:textColor="#FFFFFF"
                android:textSize="24sp" />
        </TableRow>

        <!-- Third Row (4, 5, 6, -) -->
        <TableRow
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1">

            <Button
                android:id="@+id/btn_4"
                android:layout_width="0dp"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:background="#cfd8dc"
                android:text="4"
                android:textSize="24sp" />

            <Button
                android:id="@+id/btn_5"
                android:layout_width="0dp"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:background="#cfd8dc"
                android:text="5"
                android:textSize="24sp" />

            <Button
                android:id="@+id/btn_6"
                android:layout_width="0dp"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:background="#cfd8dc"
                android:text="6"
                android:textSize="24sp" />

            <Button
                android:id="@+id/btn_subtract"
                android:layout_width="0dp"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:background="#6b6b6b"
                android:text="-"
                android:textColor="#FFFFFF"
                android:textSize="24sp" />
        </TableRow>

        <!-- Fourth Row (1, 2, 3, +) -->
        <TableRow
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1">

            <Button
                android:id="@+id/btn_1"
                android:layout_width="0dp"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:background="#cfd8dc"
                android:text="1"
                android:textSize="24sp" />

            <Button
                android:id="@+id/btn_2"
                android:layout_width="0dp"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:background="#cfd8dc"
                android:text="2"
                android:textSize="24sp" />

            <Button
                android:id="@+id/btn_3"
                android:layout_width="0dp"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:background="#cfd8dc"
                android:text="3"
                android:textSize="24sp" />

            <Button
                android:id="@+id/btn_add"
                android:layout_width="0dp"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:background="#6b6b6b"
                android:text="+"
                android:textColor="#FFFFFF"
                android:textSize="24sp" />
        </TableRow>

        <!-- Fifth Row (., 0, =, +) -->
        <TableRow
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1">

            <Button
                android:id="@+id/btn_dot"
                android:layout_width="0dp"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:background="#cfd8dc"
                android:text="."
                android:textSize="24sp" />

            <Button
                android:id="@+id/btn_0"
                android:layout_width="0dp"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:background="#cfd8dc"
                android:text="0"
                android:textSize="24sp" />

            <Button
                android:id="@+id/btn_equal"
                android:layout_width="0dp"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:background="#ff5722"
                android:text="="
                android:textColor="#FFFFFF"
                android:textSize="24sp" />

            <Button
                android:id="@+id/btn_plus"
                android:layout_width="0dp"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:background="#6b6b6b"
                android:text="+"
                android:textColor="#FFFFFF"
                android:textSize="24sp" />
        </TableRow>

    </TableLayout>

</LinearLayout>

```

![calculator](https://github.com/user-attachments/assets/b13356fc-cc11-40f6-8097-3d32c3963bdf)

### E) Develop a program to implement UI from Buttons Palette use Constraint Layout i.e Button, ImageButton, TogggleButton, Checkbox, Chip, ChipGroup, Radio Button and Radio Group and FloatingActionButton.

```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <!-- Simple Button -->
    <Button
        android:id="@+id/button_simple"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button"
        android:layout_marginTop="16dp"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

    <!-- ImageButton -->
    <ImageButton
        android:id="@+id/imageButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@android:drawable/ic_menu_camera"
        android:layout_marginTop="16dp"
        android:contentDescription="Image Button"
        app:layout_constraintTop_toBottomOf="@id/button_simple"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

    <!-- ToggleButton -->
    <ToggleButton
        android:id="@+id/toggleButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textOn="ON"
        android:textOff="OFF"
        android:layout_marginTop="16dp"
        app:layout_constraintTop_toBottomOf="@id/imageButton"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

    <!-- CheckBox 1 (First CheckBox) -->
    <CheckBox
        android:id="@+id/checkBox"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Mobile Application"
        android:layout_marginTop="16dp"
        app:layout_constraintTop_toBottomOf="@id/toggleButton"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

    <!-- CheckBox 2 (Second CheckBox below CheckBox 1) -->
    <CheckBox
        android:id="@+id/checkBox1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Cloud Computing"
        android:layout_marginTop="8dp"
        app:layout_constraintTop_toBottomOf="@id/checkBox"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

    <!-- ChipGroup with Chips (Below CheckBox 2) -->
    <com.google.android.material.chip.ChipGroup
        android:id="@+id/chipGroup"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        app:layout_constraintTop_toBottomOf="@id/checkBox1"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent">

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
    </com.google.android.material.chip.ChipGroup>

    <!-- RadioGroup with RadioButtons (Below ChipGroup) -->
    <RadioGroup
        android:id="@+id/radioGroup"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        app:layout_constraintTop_toBottomOf="@id/chipGroup"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        android:orientation="horizontal">

        <RadioButton
            android:id="@+id/radioButton1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Male" />

        <RadioButton
            android:id="@+id/radioButton2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Female" />
    </RadioGroup>

    <!-- FloatingActionButton (At the Bottom Right Corner) -->
    <com.google.android.material.floatingactionbutton.FloatingActionButton
        android:id="@+id/floatingActionButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="16dp"
        android:contentDescription="Floating Action Button"
        app:srcCompat="@android:drawable/ic_dialog_email"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>

```

![buttons](https://github.com/user-attachments/assets/a2937420-0e6e-4882-bd64-78c1214efd13)

### F) Develop a program to implement UI from Text Palette use Linear Layout two Login windows. First is to Login with a Key use [Password(numeric)] and in second UI implement frame Layout to display Phone, Postal address, Time, Date, Number, Number(signed) , Number (decimal), AutoCompleteTextView, MultiAutoCompleteTextView, CheckedTextView, TextInputLayout.




