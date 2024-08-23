// XML file
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    tools:context=".MainActivity"
    android:background="@color/colorAccent"
    >

    <TextView android:id="@+id/txtDisplay"
        android:layout_width="match_parent"
        android:layout_height="90dp"
        android:maxLength="15"
        android:paddingLeft="10sp"
        android:fontFamily="cursive"
        android:textAppearance="@android:style/TextAppearance.DeviceDefault.Large"
        android:textSize="40sp" />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        android:layout_below="@+id/txtDisplay"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true"
        android:background="@color/colorPrimary">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:background="@color/colorPrimaryDark">

        <Button
            android:id="@+id/btnSeven"
            android:layout_width="90dp"
            android:layout_height="90dp"
            android:text="7"
            android:textSize="30dp"/>

        <Button
            android:id="@+id/btnEight"
            android:layout_width="90dp"
            android:layout_height="90dp"
            android:text="8"
            android:textSize="30dp"/>

        <Button
            android:id="@+id/btnNine"
            android:layout_width="90dp"
            android:layout_height="90dp"
            android:text="9"
            android:textSize="30dp"/>

        <Button
            android:id="@+id/btnDivide"
            android:layout_width="100dp"
            android:layout_height="80dp"
            android:text="/"
            android:layout_marginLeft="5dp"
            android:background="@drawable/mybutton"
            android:textSize="30dp"/>

    </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            android:background="@color/colorPrimaryDark">

            <Button
                android:id="@+id/btnFour"
                android:layout_width="90dp"
                android:layout_height="90dp"
                android:text="4"
                android:textSize="30dp"/>

            <Button
                android:id="@+id/btnFive"
                android:layout_width="90dp"
                android:layout_height="90dp"
                android:text="5"
                android:textSize="30dp"/>

            <Button
                android:id="@+id/btnSix"
                android:layout_width="90dp"
                android:layout_height="90dp"
                android:text="6"
                android:textSize="30dp"/>

            <Button
                android:id="@+id/btnMultiply"
                android:layout_width="100dp"
                android:layout_height="80dp"
                android:text="*"
                android:textSize="30dp"
                android:layout_marginLeft="5dp"
                android:background="@drawable/mybutton"/>

        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            android:background="@color/colorPrimaryDark">

            <Button
                android:id="@+id/btnOne"
                android:layout_width="90dp"
                android:layout_height="90dp"
                android:text="1"
                android:textSize="30dp"/>

            <Button
                android:id="@+id/btnTwo"
                android:layout_width="90dp"
                android:layout_height="90dp"
                android:text="2"
                android:textSize="30dp"/>

            <Button
                android:id="@+id/btnThree"
                android:layout_width="90dp"
                android:layout_height="90dp"
                android:text="3"
                android:textSize="30dp"/>


            <Button
                android:id="@+id/btnSub"
                android:layout_width="100dp"
                android:layout_height="80dp"
                android:text="-"
                android:textSize="30dp"
                android:layout_marginLeft="5dp"
                android:background="@drawable/mybutton"/>

        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            android:background="@color/colorPrimaryDark">

            <Button
                android:id="@+id/btnZero"
                android:layout_width="90dp"
                android:layout_height="90dp"
                android:text="0"
                android:textSize="30dp"
                />

            <Button
                android:id="@+id/btnDot"
                android:layout_width="90dp"
                android:layout_height="90dp"
                android:text="."
                android:textSize="30dp"/>

            <Button
                android:id="@+id/btnEqual"
                android:layout_width="90dp"
                android:layout_height="90dp"
                android:text="="
                android:textSize="30dp"/>

            <Button
                android:id="@+id/btnAdd"
                android:layout_width="100dp"
                android:layout_height="80dp"
                android:text="+"
                android:textSize="30dp"
                android:layout_marginLeft="5dp"
                android:background="@drawable/mybutton"/>

        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal">

            <Button
                android:id="@+id/btnClear"
                android:layout_width="match_parent"
                android:layout_height="50dp"
                android:text="Clear All"
                android:textStyle="bold"
                android:textSize="20sp"
                android:fontFamily="casual"
                />
        </LinearLayout>
    </LinearLayout>

</RelativeLayout>

// JAVA file
package main.ravirajpurohit414.com.pandeycalculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private double num1, num2, answer;
    private char op;
    private boolean hasDot; //Variable to know whether Dot(.) is pressed.



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Context context = getApplicationContext();
        CharSequence text = "Help Yourself!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btnOne = (Button) findViewById(R.id.btnOne);
        final Button btnTwo = (Button) findViewById(R.id.btnTwo);
        final Button btnThree = (Button) findViewById(R.id.btnThree);
        final Button btnFour = (Button) findViewById(R.id.btnFour);
        final Button btnFive = (Button) findViewById(R.id.btnFive);
        final Button btnSix = (Button) findViewById(R.id.btnSix);
        final Button btnSeven = (Button) findViewById(R.id.btnSeven);
        final Button btnEight = (Button) findViewById(R.id.btnEight);
        final Button btnNine = (Button) findViewById(R.id.btnNine);
        final Button btnZero = (Button) findViewById(R.id.btnZero);
        final Button btnAdd = (Button) findViewById(R.id.btnAdd);
        final Button btnSub = (Button) findViewById(R.id.btnSub);
        final Button btnMultiply = (Button) findViewById(R.id.btnMultiply);
        final Button btnDivide = (Button) findViewById(R.id.btnDivide);
        final Button btnDot = (Button) findViewById(R.id.btnDot);
        final Button btnEqual = (Button) findViewById(R.id.btnEqual);
        final Button btnClear = (Button) findViewById(R.id.btnClear);
        final TextView txtDisplay = (TextView) findViewById(R.id.txtDisplay);

        btnOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txtDisplay.append("1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                txtDisplay.append("2");
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                txtDisplay.append("3");
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                txtDisplay.append("4");
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                txtDisplay.append("5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                txtDisplay.append("6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                txtDisplay.append("7");
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                txtDisplay.append("8");
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                txtDisplay.append("9");
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                txtDisplay.append("0");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                //if Dot(.) is pressed then set hasDot to true to restrict
                if(hasDot==false) {
                    txtDisplay.append("."); hasDot = true; }
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                num1 = Double.parseDouble(txtDisplay.getText().toString());
                op = '+';
                txtDisplay.setText("");
                hasDot = false; //set hasDot to false to use in the next operand.
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                num1 = Double.parseDouble(txtDisplay.getText().toString());
                op = '-';
                txtDisplay.setText("");
                hasDot = false; //set hasDot to false to use in the next operand.
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                num1 = Double.parseDouble(txtDisplay.getText().toString());
                op = '*';
                txtDisplay.setText("");
                hasDot = false; //set hasDot to false to use in the next operand.
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                num1 = Double.parseDouble(txtDisplay.getText().toString());
                op = '/';
                txtDisplay.setText("");
                hasDot = false; //set hasDot to false to use in the next operand.
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                num2 = Double.parseDouble(txtDisplay.getText().toString());
                switch (op) {
                    case '+':
                        answer = num1 + num2;
                        break;
                    case '-':
                        answer = num1 - num2;
                        break;

                    case '*':
                        answer = num1 * num2;
                        break;

                    case '/':
                        answer = num1 / num2;
                        break;

                    default:
                        break;
                }

                DecimalFormat d = new DecimalFormat();
                String ans = d.format(answer);
                txtDisplay.setText(ans);
                hasDot = false; //set hasDot to false to use in new calculation.
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                txtDisplay.setText("");
                hasDot = false; //set hasDot to false to use in new calculation.
            }
        });
    }
}
