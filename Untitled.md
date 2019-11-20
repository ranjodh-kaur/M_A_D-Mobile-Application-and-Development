## Practical 5: Design a simple to-do list using SQLite.

## activity_main.xml

      <&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;
&lt;RelativeLayout xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;
xmlns:app=&quot;http://schemas.android.com/apk/res-auto&quot;
xmlns:tools=&quot;http://schemas.android.com/tools&quot;
android:layout_width=&quot;match_parent&quot;
android:layout_height=&quot;match_parent&quot;
tools:context=&quot;ty.practical5.MainActivity&quot;&gt;
&lt;ListView
android:id=&quot;@+id/lvData&quot;
android:layout_width=&quot;wrap_content&quot;
android:layout_height=&quot;wrap_content&quot;
android:layout_above=&quot;@+id/btnAdd&quot;
android:layout_alignParentLeft=&quot;true&quot;
android:layout_alignParentStart=&quot;true&quot;
android:layout_alignParentTop=&quot;true&quot; /&gt;
&lt;EditText
android:id=&quot;@+id/txtItem&quot;
android:layout_width=&quot;wrap_content&quot;
android:layout_height=&quot;wrap_content&quot;
android:layout_alignParentBottom=&quot;true&quot;
android:layout_alignParentLeft=&quot;true&quot;
android:layout_alignParentStart=&quot;true&quot;
android:layout_alignTop=&quot;@+id/btnAdd&quot;
android:layout_toLeftOf=&quot;@+id/btnAdd&quot;
android:layout_toStartOf=&quot;@+id/btnAdd&quot;
android:hint=&quot;Enter a New Item&quot;
android:inputType=&quot;textMultiLine&quot;
/&gt;

&lt;Button
android:id=&quot;@+id/btnAdd&quot;
android:layout_width=&quot;wrap_content&quot;
android:layout_height=&quot;wrap_content&quot;
android:layout_alignParentBottom=&quot;true&quot;
android:layout_alignParentEnd=&quot;true&quot;
android:layout_alignParentRight=&quot;true&quot;
android:onClick=&quot;AddItem&quot;
android:text=&quot;Add Item&quot; /&gt;
&lt;/RelativeLayout&gt;
activity_task_details.xml
&lt;?xml version=&quot;1.0&quot; encoding=&quot;utf-8&quot;?&gt;
&lt;RelativeLayout xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;
xmlns:app=&quot;http://schemas.android.com/apk/res-auto&quot;
xmlns:tools=&quot;http://schemas.android.com/tools&quot;
android:layout_width=&quot;match_parent&quot;
android:layout_height=&quot;match_parent&quot;
tools:context=&quot;ty.practical5.TaskDetails&quot;&gt;
&lt;Button
android:id=&quot;@+id/btnUpdate&quot;
PREPARED BY SARVEPREET SINGH =&gt; ssarvepreet@gmail.com
android:layout_width=&quot;wrap_content&quot;
android:layout_height=&quot;wrap_content&quot;
android:layout_alignParentStart=&quot;true&quot;
android:layout_below=&quot;@+id/txtData&quot;
android:layout_marginStart=&quot;48dp&quot;
android:layout_marginTop=&quot;50dp&quot;
android:onClick=&quot;Update&quot;
android:text=&quot;Update&quot; /&gt;
&lt;Button
android:id=&quot;@+id/btnDelete&quot;

android:layout_width=&quot;wrap_content&quot;
android:layout_height=&quot;wrap_content&quot;
android:layout_alignEnd=&quot;@+id/txtData&quot;
android:layout_alignTop=&quot;@+id/btnUpdate&quot;
android:layout_marginEnd=&quot;13dp&quot;
android:onClick=&quot;Delete&quot;
android:text=&quot;Delete&quot; /&gt;
&lt;EditText
android:id=&quot;@+id/txtData&quot;
android:layout_width=&quot;wrap_content&quot;
android:layout_height=&quot;wrap_content&quot;
android:layout_alignParentTop=&quot;true&quot;
android:layout_alignStart=&quot;@+id/btnUpdate&quot;
android:layout_marginStart=&quot;19dp&quot;
android:layout_marginTop=&quot;57dp&quot;
android:ems=&quot;10&quot;
android:inputType=&quot;textMultiLine&quot; /&gt;
&lt;/RelativeLayout&gt;


## toDoDatabaseHelper.java
    import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
public class toDoDatabaseHelper extends SQLiteOpenHelper {
private static final String DATABASE_NAME = &quot;todoList.db&quot;;
private static final int DATABASE_VERSION = 1;
public toDoDatabaseHelper(Context context) {

super(context, DATABASE_NAME, null, DATABASE_VERSION);
}
@Override
public void onCreate(SQLiteDatabase db) {
String query = &quot;CREATE TABLE ToDo (task TEXT)&quot;;
db.execSQL(query);
}
@Override
public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
db.execSQL(&quot;DROP TABLE IF EXISTS ToDo&quot;);
onCreate(db);
}
public void addTask(String item){
ContentValues values = new ContentValues();
values.put(&quot;task&quot;, item);
SQLiteDatabase db = getWritableDatabase();
db.insert(&quot;ToDo&quot;, null, values);
db.close();
}
//Delete a product from the database
public void deleteTask(String item){
SQLiteDatabase db = this.getWritableDatabase();
db.execSQL(&quot;DELETE FROM ToDo where task=&#39;&quot;+item+&quot;&#39;&quot;);
}
public void updateTask(String oldvalue, String newvalue){
try {
SQLiteDatabase db = this.getWritableDatabase();
ContentValues contentValues = new ContentValues();
contentValues.put(&quot;task&quot;, newvalue);
db.update(&quot;ToDo&quot;, contentValues, &quot;task=&#39;&quot;+oldvalue +&quot;&#39;&quot;, null);

db.close();
} catch (Exception e) {
e.printStackTrace();
}
}
public ArrayList&lt;String&gt; getAllTasks() {
ArrayList&lt;String&gt; contactList = new ArrayList&lt;String&gt;();
String selectQuery = &quot;SELECT * FROM ToDo&quot;;
SQLiteDatabase db = this.getWritableDatabase();
Cursor cursor = db.rawQuery(selectQuery, null);
if (cursor.moveToFirst()) {
do {
contactList.add(cursor.getString(0));
} while (cursor.moveToNext());
}
return contactList;
}
public ArrayList&lt;String&gt; getTaskByItem(int item) {
ArrayList&lt;String&gt; contactList = new ArrayList&lt;String&gt;();
String selectQuery = &quot;SELECT * FROM ToDo where task=&quot; +item;
SQLiteDatabase db = this.getWritableDatabase();
Cursor cursor = db.rawQuery(selectQuery, null);
if (cursor.moveToFirst()) {
contactList.add(cursor.getString(1));
}
return contactList;
}
}
PREPARED BY SARVEPREET SINGH =&gt; ssarvepreet@gmail.com 
MainActivity.java


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
private ArrayList&lt;String&gt; items;
private ArrayAdapter&lt;String&gt; itemsAdapter;
private ListView lvData;
private toDoDatabaseHelper dbAccess;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
dbAccess = new toDoDatabaseHelper(this);
lvData = (ListView) findViewById(R.id.lvData);
items = new ArrayList&lt;String&gt;();
readItems();
itemsAdapter = new ArrayAdapter&lt;String&gt;(this,
android.R.layout.simple_list_item_1, items);
lvData.setAdapter(itemsAdapter);
lvData.setOnItemClickListener(new AdapterView.OnItemClickListener() {
@Override
public void onItemClick(AdapterView&lt;?&gt; parent, View view, int position,
long id) {
Intent intent = new Intent(MainActivity.this, TaskDetails.class);
intent.putExtra(&quot;data&quot;,

lvData.getItemAtPosition(position).toString());
startActivity(intent);
// Refresh the adapter
refreshListView();
}
});
}
public void AddItem(View v) {
EditText txtItem = (EditText) findViewById(R.id.txtItem);
String itemText = txtItem.getText().toString();
itemsAdapter.add(itemText);
txtItem.setText(&quot;&quot;);
dbAccess.addTask(itemText);
}
public void readItems() {
try {
items = new ArrayList&lt;String&gt;(dbAccess.getAllTasks());
} catch (Exception e) {
items = new ArrayList&lt;String&gt;();
}
}

public void refreshListView() {
itemsAdapter.notifyDataSetChanged();
}
}
TaskDetails.java
package ty.practical5;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
public class TaskDetails extends AppCompatActivity {
private toDoDatabaseHelper dbAccess;
String oldvalue=&quot;&quot;;
EditText txtData;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_task_details);
//code to enable the back button
getSupportActionBar().setDisplayShowHomeEnabled(true);
getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//code to fetch the selected list item data in the previous activity
dbAccess = new toDoDatabaseHelper(this);
Intent intent = getIntent();
oldvalue = intent.getStringExtra(&quot;data&quot;);
txtData = (EditText) findViewById(R.id.txtData);
txtData.setText(intent.getStringExtra(&quot;data&quot;));
}
//code for delete button to delete the task
protected void Delete(View v) {
dbAccess.deleteTask(txtData.getText().toString());
Intent intent = new Intent(TaskDetails.this,MainActivity.class) ;
intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
startActivity(intent);
finish();
}
//code for delete button to update the task
protected void Update(View v) {

dbAccess.updateTask(oldvalue, txtData.getText().toString());
Intent intent = new Intent(TaskDetails.this,MainActivity.class) ;
intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
startActivity(intent);
finish();
}
//code to close the current activity and move to the previous
@Override
public boolean onOptionsItemSelected(MenuItem item) {
finish();
return super.onOptionsItemSelected(item);
}
}
## Output 

<p align="center">
    
<img src="https://raw.githubusercontent.com/Sarvepreetsingh/M_A_D/master/sc.png"  />
</p>   

