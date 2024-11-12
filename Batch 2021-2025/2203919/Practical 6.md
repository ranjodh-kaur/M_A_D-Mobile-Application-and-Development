Using SQLite in an Android app is a great way to implement persistent data storage. Below is a simple example to demonstrate how to set up a SQLite database in an Android app, including creating, inserting, retrieving, and displaying data.

### Overview

1. **Create Database**: Define a helper class that extends `SQLiteOpenHelper`.
2. **Perform Database Operations**: Insert and retrieve data from the database.
3. **Display Data**: Show retrieved data in a `TextView`.

### Step 1: Create Database Helper Class

The `DatabaseHelper` class manages database creation and version management. It also provides methods to insert and retrieve data.

```java
package com.example.myapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Student.db";
    private static final String TABLE_NAME = "student_table";
    private static final String COL_1 = "ID";
    private static final String COL_2 = "NAME";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String name) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, name);
        long result = db.insert(TABLE_NAME, null, contentValues);
        return result != -1;  // Returns true if data is inserted successfully
    }

    public Cursor getAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.rawQuery("SELECT * FROM " + TABLE_NAME, null);
    }
}
```

### Explanation

1. **Database and Table Setup**: The database is created with one table, `student_table`, containing columns for `ID` (auto-incremented) and `NAME`.
2. **`onCreate()`**: Creates the table if it doesn’t exist.
3. **`insertData()`**: Inserts a new row with a `name` into the table.
4. **`getAllData()`**: Retrieves all data from the table.

### Step 2: MainActivity to Interact with Database

`MainActivity` will insert data and display all records.

```java
package com.example.myapp;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper myDb;
    EditText editName;
    Button btnAddData;
    TextView textViewData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDb = new DatabaseHelper(this);

        editName = findViewById(R.id.editText_name);
        btnAddData = findViewById(R.id.button_add);
        textViewData = findViewById(R.id.textView_data);

        btnAddData.setOnClickListener(v -> {
            String name = editName.getText().toString();
            if (!name.isEmpty()) {
                boolean isInserted = myDb.insertData(name);
                if (isInserted) {
                    Toast.makeText(MainActivity.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                    displayData();
                } else {
                    Toast.makeText(MainActivity.this, "Data Insertion Failed", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(MainActivity.this, "Enter a Name", Toast.LENGTH_SHORT).show();
            }
        });

        displayData();
    }

    private void displayData() {
        Cursor cursor = myDb.getAllData();
        if (cursor.getCount() == 0) {
            textViewData.setText("No Data Found");
            return;
        }

        StringBuilder buffer = new StringBuilder();
        while (cursor.moveToNext()) {
            buffer.append("ID: ").append(cursor.getString(0)).append("\n");
            buffer.append("Name: ").append(cursor.getString(1)).append("\n\n");
        }

        textViewData.setText(buffer.toString());
    }
}
```

### Explanation

1. **Initialization**: Connects to the database via `DatabaseHelper`.
2. **Inserting Data**: When the "Add Data" button is clicked, it inserts the entered name into the database using `insertData()`.
3. **Displaying Data**: The `displayData()` method retrieves all records from the database and shows them in `textViewData`.

### Step 3: Create Layout Files

#### 1. `activity_main.xml`

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="16dp">
    <EditText
        android:id="@+id/editText_name"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter Name" />
    <Button
        android:id="@+id/button_add"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Add Data" />
    <TextView
        android:id="@+id/textView_data"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="No Data Available"
        android:paddingTop="16dp"
        android:textSize="16sp"/>
</LinearLayout>
```
### How It Works

1. **Add Data**: Enter a name in the `EditText`, click the "Add Data" button, and it will insert the name into the SQLite database.
2. **Display Data**: `displayData()` retrieves all names in the database and displays them in the `TextView`.

This example demonstrates basic SQLite CRUD operations (Create and Read) in Android using Java.
