# Practical 11: Develop an application for working with menus and screen navigation.

## Main_Menu.xml

      <?xml version="1.0" encoding="utf-8"?>
      <menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item
        android:id="@+id/item1"
        android:title="FYCS" />
    <item
        android:id="@+id/item2"
        android:title="SYCS" />
    <item
        android:id="@+id/item3"
        android:title="TYCS" />
    </menu>


## MainActivity.java
    package com.example.myapplication;

    import androidx.appcompat.app.AppCompatActivity;

    import android.os.Bundle;
    import android.content.Intent;
    import android.view.Menu;
    import android.view.MenuInflater;
    import android.view.MenuItem;



    public class MainActivity extends AppCompatActivity 
    {

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) 
    {
        //return super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);

        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) 
    {
        switch(item.getItemId())
        {
            case R.id.item1:
                startActivity(new Intent(MainActivity.this, FYCS.class));
                return true;
            case R.id.item2:
                startActivity(new Intent(MainActivity.this, SYCS.class));
                return true;
            case R.id.item3:
                startActivity(new Intent(MainActivity.this, TYCS.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    }

## Output 

<p align="center">
    
<img src="https://github.com/rsshivani/M_A_D/blob/master/screen.png?raw=true"  height="400"/>
</p>   

