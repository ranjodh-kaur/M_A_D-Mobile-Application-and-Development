# Persistent data storage

Persistent data storage in Android allows you to store data that persists across app sessions, even after the app is closed or the device is rebooted. There are various options available for storing data persistently in Android, and the choice depends on the type and size of data you need to store. Here are some common methods for persistent data storage in Android:

1. **Shared Preferences:**
   - Shared Preferences are a simple key-value storage mechanism that allows you to store small amounts of primitive data types, such as strings, integers, and booleans.
   - It's commonly used for storing app settings, user preferences, and other lightweight data.
   - Data is stored in an XML file.
   - Example:
     ```java
     SharedPreferences preferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
     SharedPreferences.Editor editor = preferences.edit();
     editor.putString("username", "John");
     editor.apply();
     ```

2. **Internal Storage:**
   - Internal storage is used for storing private data that belongs to your app. Data stored here is not accessible by other apps or users.
   - It's suitable for storing app-specific files, such as databases or configuration files.
   - Use the `FileOutputStream` and `FileInputStream` classes for file I/O.
   - Example:
     ```java
     String data = "This is some data to be stored.";
     try (FileOutputStream fos = openFileOutput("myData.txt", Context.MODE_PRIVATE)) {
         fos.write(data.getBytes());
     } catch (IOException e) {
         e.printStackTrace();
     }
     ```

3. **External Storage:**
   - External storage is used for storing larger files that can be publicly accessed. It includes the device's external storage like an SD card or shared storage.
   - It's suitable for media files, downloads, or files that can be shared.
   - Ensure you have the necessary permissions (e.g., WRITE_EXTERNAL_STORAGE) to write to external storage.
   - Example:
     ```java
     File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "myFile.txt");
     ```

4. **SQLite Database:**
   - Android includes SQLite, a lightweight relational database that is ideal for structured data storage.
   - It's suitable for storing structured data such as user profiles, records, and other relational data.
   - Android provides the `SQLiteOpenHelper` class for managing database creation and version management.
   - Example:
     ```java
     // Create or open a database
     SQLiteDatabase db = dbHelper.getWritableDatabase();
     
     // Execute SQL commands for data manipulation
     ```

5. **Content Providers:**
   - Content Providers allow you to share data between apps securely. While they are often used for inter-app data sharing, you can also use them to store and retrieve data.
   - They provide a consistent API for data access and are suitable for managing and sharing structured data.
   - Example:
     ```java
     ContentResolver resolver = getContentResolver();
     ContentValues values = new ContentValues();
     values.put("key", "value");
     Uri uri = resolver.insert(Uri.parse("content://com.example.myapp.provider/mydata"), values);
     ```

6. **Cloud Storage:**
   - For large-scale or cloud-based data storage, you can use cloud storage services such as Firebase Cloud Firestore, Firebase Realtime Database, AWS S3, or Google Cloud Storage.
   - These services allow you to store and synchronize data in the cloud, making it accessible from multiple devices.

7. **Room Persistence Library (Recommended for SQLite):**
   - Room is a part of Android Architecture Components and provides a higher-level, object-oriented interface to SQLite databases.
   - It simplifies database handling and is recommended for SQLite database operations.
   - Example:
     ```java
     @Dao
     interface UserDao {
         @Query("SELECT * FROM users")
         List<User> getAll();
     }
     ```



# Android Built in SQLite content provider

In Android, a content provider is a component that allows you to share data between different apps or between different parts of your app. While content providers can be used to expose data stored in SQLite databases, they are not "built-in SQLite content providers." Instead, content providers are a higher-level abstraction that allows you to manage and share data, including data stored in SQLite databases.

Here's how you can create and use a content provider to work with SQLite data in Android:

1. **Create a Content Provider Class:**
   You need to create a Java class that extends `ContentProvider` and implement its required methods, such as `query`, `insert`, `update`, and `delete`. In these methods, you define how data is accessed and modified in your SQLite database.

   ```java
   public class MyContentProvider extends ContentProvider {
       // Implement the required methods
   }
   ```

2. **Declare the Content Provider in the AndroidManifest.xml:**
   You should declare your content provider in the AndroidManifest.xml file to make it accessible to other apps or parts of your app.

   ```xml
   <provider
       android:name="com.example.myapp.MyContentProvider"
       android:authorities="com.example.myapp.provider"
       android:exported="true">
   </provider>
   ```

3. **Implement a Contract Class:**
   To define the data and provide a structured way to access it, you can create a contract class that includes constants for table names, column names, and URIs. This helps ensure consistency when interacting with the content provider.

   ```java
   public class MyContract {
       public static final String AUTHORITY = "com.example.myapp.provider";
       public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY);
       // Define table and column names
   }
   ```

4. **Use URIs to Access Data:**
   In your app or other apps, you can use URIs to interact with the content provider. For example, to query data from the provider:

   ```java
   Uri uri = Uri.withAppendedPath(MyContract.CONTENT_URI, "your_data_path");
   Cursor cursor = getContentResolver().query(uri, null, null, null, null);
   ```

5. **Database Helper:**
   In your content provider, you typically have a database helper class to manage your SQLite database, create tables, and handle database version upgrades.

   ```java
   public class MyDatabaseHelper extends SQLiteOpenHelper {
       // Implement database creation and upgrade logic
   }
   ```

6. **Permissions and Security:**
   You can define permissions to control who can access your content provider. Ensure that you have the necessary permissions and protect sensitive data as needed.

7. **Content Provider Operations:**
   In your content provider, implement the CRUD (Create, Read, Update, Delete) operations to manage the data stored in the SQLite database. These operations are defined in the `ContentProvider` class.

8. **Testing and Debugging:**
   It's essential to thoroughly test your content provider, both for functionality and security. You can use the `ContentResolver` and unit tests to verify that your content provider behaves as expected.

<div style="page-break-after: always;"></div>

# Modifying data using your android application

Modifying data in your Android application typically involves performing CRUD (Create, Read, Update, Delete) operations on the data. The specific steps and code required to modify data will depend on the data storage method you are using, such as SQLite databases, content providers, or cloud-based storage. Here's a general overview of how to modify data in your Android application:

1. **Identify the Data to Modify:**
   Determine which data you want to modify. This could be user settings, database records, files, or any other form of data.

2. **Determine the Data Storage Method:**
   You should know where the data is stored. For example:
   - If you're modifying records in an SQLite database, you'll need to work with a database helper class and SQL operations.
   - If you're updating preferences or settings, you can use the SharedPreferences API.
   - If you're modifying data exposed through a content provider, you'll use a ContentResolver to update the data.
   - If you're working with cloud-based data, you'll use network requests to update data on a remote server.

3. **Update the Data:**

   a. **SQLite Database:**
      - If you're working with an SQLite database, you'll use SQL commands or an ORM (Object-Relational Mapping) library like Room to update records.
      - For example, to update a record in a SQLite database:

      ```java
      ContentValues values = new ContentValues();
      values.put("column_name", "new_value");
      String selection = "id=?";
      String[] selectionArgs = {"1"};
      int rowsUpdated = database.update("table_name", values, selection, selectionArgs);
      ```

   b. **Shared Preferences:**
      - For modifying app settings stored in SharedPreferences:

      ```java
      SharedPreferences preferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
      SharedPreferences.Editor editor = preferences.edit();
      editor.putString("setting_key", "new_value");
      editor.apply();
      ```

   c. **Content Provider:**
      - To update data exposed through a content provider:

      ```java
      Uri uri = Uri.withAppendedPath(MyContract.CONTENT_URI, "your_data_path");
      ContentValues values = new ContentValues();
      values.put("column_name", "new_value");
      int rowsUpdated = getContentResolver().update(uri, values, null, null);
      ```

   d. **Cloud-Based Data:**
      - When working with remote data, you'll typically make network requests to update data on the server. This often involves sending data to a server endpoint that handles the update.

4. **Handle Errors and Validation:**
   Implement error handling and data validation to ensure that the update is successful and that the data is consistent.

5. **Update the UI (if needed):**
   If the data you modified is displayed in the user interface, update the UI to reflect the changes. You might need to refresh a list, reload data, or notify the relevant components.

6. **Testing:**
   Thoroughly test the data modification process to ensure it works as expected and doesn't introduce bugs.

<div style="page-break-after: always;"></div>

# SQLite Creating basic activity

Creating a basic activity that uses SQLite for data storage is a common scenario in Android app development. In this example, I'll show you how to create an Android app with a basic activity that interacts with an SQLite database. We'll create a simple task management app.

Here are the steps to create a basic activity with SQLite integration:

1. **Create a New Android Project:**

   - Open Android Studio.
   - Click on "Start a new Android Studio project" or go to "File" > "New" > "New Project."
   - Follow the project setup wizard to configure your app.

2. **Create the SQLite Database Helper:**

   - Create a new Java class that will serve as your SQLite database helper. This class should extend `SQLiteOpenHelper` and be responsible for creating, upgrading, and managing your database.

   ```java
   public class DatabaseHelper extends SQLiteOpenHelper {
       private static final String DATABASE_NAME = "TaskManager.db";
       private static final int DATABASE_VERSION = 1;

       public DatabaseHelper(Context context) {
           super(context, DATABASE_NAME, null, DATABASE_VERSION);
       }

       @Override
       public void onCreate(SQLiteDatabase db) {
           db.execSQL("CREATE TABLE tasks (_id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT, description TEXT)");
       }

       @Override
       public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
           db.execSQL("DROP TABLE IF EXISTS tasks");
           onCreate(db);
       }
   }
   ```

3. **Create a Model Class:**

   - Create a Java class to represent the data you want to store in the database. In this example, we'll create a simple `Task` class.

   ```java
   public class Task {
       private long id;
       private String title;
       private String description;

       // Getters and setters
   }
   ```

4. **Create a Data Source Class:**

   - Create a class to manage data operations with the database. This class will handle CRUD (Create, Read, Update, Delete) operations.

   ```java
   public class TaskDataSource {
       private SQLiteDatabase database;
       private DatabaseHelper dbHelper;

       public TaskDataSource(Context context) {
           dbHelper = new DatabaseHelper(context);
       }

       public void open() {
           database = dbHelper.getWritableDatabase();
       }

       public void close() {
           dbHelper.close();
       }

       // Implement methods for inserting, updating, deleting, and querying tasks
   }
   ```

5. **Create the Layout XML:**

   - Create the layout XML file for your activity. In this example, we'll create a simple layout with an EditText, a Button to add tasks, and a ListView to display tasks.

6. **Create the Activity Class:**

   - Create an activity class to display the UI and handle user interactions. This class should interact with the `TaskDataSource` to perform database operations.

7. **Run Your App:**

   - Run your app on an emulator or a physical device to see your basic activity in action.

This is a simplified example to get you started with SQLite in Android. You can expand upon this foundation to build a more complex app with additional features, such as task editing, task deletion, and more advanced database operations. Remember to handle database transactions, UI updates, and error handling as needed in your app.

<div style="page-break-after: always;"></div>

# Configuring manifest

Configuring the AndroidManifest.xml file is a crucial part of developing Android applications. The manifest file contains essential information about your app, including permissions, activities, services, and more. Here are the key elements you should configure in your AndroidManifest.xml file:

1. **Package Name:**
   Define the package name for your app. This should be a unique identifier for your app and should match the package name used in your Java/Kotlin source code.

   ```xml
   <manifest xmlns:android="http://schemas.android.com/apk/res/android"
       package="com.example.myapp">
   ```

2. **Application Element:**
   The `<application>` element contains the attributes and child elements that configure your app's behavior. It can include:

   - `android:icon` and `android:label`: Set the app's icon and label.
   - `android:theme`: Specify the app's theme.
   - `android:allowBackup`: Control whether the app data is backed up.
   - `android:supportsRtl`: Indicate support for right-to-left layouts.

   ```xml
   <application
       android:icon="@mipmap/ic_launcher"
       android:label="@string/app_name"
       android:theme="@style/AppTheme"
       android:allowBackup="true"
       android:supportsRtl="true">
   ```

3. **Activity Elements:**
   Inside the `<application>` element, define the activities that make up your app. Each `<activity>` element should include attributes like `android:name`, `android:label`, and `android:theme`. The `android:name` attribute should point to the Java or Kotlin class that represents the activity.

   ```xml
   <activity
       android:name=".MainActivity"
       android:label="@string/app_name"
       android:theme="@style/AppTheme">
   ```

4. **Intent Filters:**
   Use `<intent-filter>` elements within `<activity>` elements to define how your app responds to specific actions. For example, if you want your app to be launched when the user selects a particular type of file, you'd specify an intent filter for that action.

   ```xml
   <intent-filter>
       <action android:name="android.intent.action.MAIN" />
       <category android:name="android.intent.category.LAUNCHER" />
   </intent-filter>
   ```

5. **Permissions:**
   Declare any permissions your app needs. Android apps request permissions to access device resources and data. Specify the necessary permissions in the `<uses-permission>` element.

   ```xml
   <uses-permission android:name="android.permission.CAMERA" />
   <uses-permission android:name="android.permission.INTERNET" />
   ```

6. **Content Providers, Services, and Broadcast Receivers:**
   If your app uses content providers, services, or broadcast receivers, you should declare them in your manifest file with the appropriate elements.

   - Content Providers: `<provider>`
   - Services: `<service>`
   - Broadcast Receivers: `<receiver>`

7. **Metadata and Application Components:**
   You can add metadata and configure application components, such as application themes and backup settings, in your manifest file.

8. **Build Configurations:**
   If your app relies on build configurations, such as different application IDs for debug and release builds, you can configure them in the manifest.

   ```xml
   <application>
       <!-- Build Type Specific Application ID -->
       <meta-data
           android:name="com.example.myapp.ApplicationId"
           android:value="${applicationId}" />
   </application>
   ```

9. **Custom Permissions:**
   If your app defines custom permissions, declare them in your manifest to control access to your app's components.

   ```xml
   <permission
       android:name="com.example.myapp.permission.CUSTOM_PERMISSION"
       android:protectionLevel="signature" />
   ```

10. **Version Information:**
    Specify the minimum and target API levels your app supports.

   ```xml
   <uses-sdk
       android:minSdkVersion="16"
       android:targetSdkVersion="30" />
   ```

11. **Application Icons and Labels:**
    Configure the app's icon and label in the manifest file, or reference them from resources.

Once you've configured your AndroidManifest.xml file, it plays a crucial role in defining how your app behaves and interacts with the Android system. Make sure to keep the manifest file up to date as you develop and enhance your Android application.

______________

Configuring your AndroidManifest.xml file for an app that uses SQLite involves specifying permissions and other declarations required to access and manipulate the SQLite database. Here's how to configure the manifest for an SQLite-based app:

1. **Specify Permissions:**

   If your app interacts with an SQLite database, you'll typically need to declare certain permissions in your manifest to ensure that the app has the necessary access rights. Here are some common permissions:

   - **Write External Storage (if your app uses an external SQLite database file):**
     ```xml
     <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
     ```

   - **Internet (if your app interacts with an online database):**
     ```xml
     <uses-permission android:name="android.permission.INTERNET" />
     ```

   - **Access Network State (if your app checks for network connectivity):**
     ```xml
     <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
     ```

2. **Declare Your Database Helper:**

   If you have a custom SQLiteOpenHelper class that manages your database, you can declare it in the manifest to allow other components of your app to access the database. This declaration can be useful when you're working with a Content Provider:

   ```xml
   <provider
       android:name="your.package.name.YourDatabaseHelper"
       android:authorities="com.example.myapp.provider"
       android:exported="false">
   </provider>
   ```

   In this example, replace `your.package.name` with the actual package name of your app.

3. **Define the Application Class (Optional):**

   If your app requires some initialization related to the SQLite database (e.g., opening the database), you might consider creating a custom Application class. You can then specify this custom class in the manifest:

   ```xml
   <application
       android:name="your.package.name.YourApplicationClass"
       <!-- other attributes -->
   >
       <!-- Activities, services, providers, etc. -->
   </application>
   ```

   In `YourApplicationClass`, you can override the `onCreate` method to perform database-related setup.

   ```java
   public class YourApplicationClass extends Application {
       @Override
       public void onCreate() {
           super.onCreate();
           // Perform SQLite database-related initialization here
       }
   }
   ```

4. **Handle Database Version Updates:**

   If your app's SQLite database structure evolves over time, you need to increment the database version number in your `SQLiteOpenHelper` class when you make changes to the database schema. This is not a manifest change but an important practice for managing database updates.

   ```java
   private static final int DATABASE_VERSION = 2; // Increment for database updates
   ```

By following these steps, you can configure your AndroidManifest.xml file to ensure that your app has the necessary permissions and declarations for working with SQLite databases. It's essential to properly manage database versions, access rights, and database-related tasks within your app for a smooth user experience.

<div style="page-break-after: always;"></div>

# Packaging and managing SQLite with android app

When packaging and managing SQLite within your Android app, you need to consider how to create and manage the database, how to perform CRUD (Create, Read, Update, Delete) operations, and how to ensure proper version control. Here's a step-by-step guide on how to package and manage SQLite in your Android app:

1. **Create a Database Helper:**

   The first step is to create a database helper class that extends `SQLiteOpenHelper`. This class will be responsible for managing your database, including creating and upgrading it.

   ```java
   public class DatabaseHelper extends SQLiteOpenHelper {
       private static final String DATABASE_NAME = "MyDatabase.db";
       private static final int DATABASE_VERSION = 1;

       public DatabaseHelper(Context context) {
           super(context, DATABASE_NAME, null, DATABASE_VERSION);
       }

       @Override
       public void onCreate(SQLiteDatabase db) {
           // Create tables and define the database schema
           db.execSQL("CREATE TABLE tasks (_id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT, description TEXT)");
       }

       @Override
       public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
           // Handle database upgrades (e.g., modify table structure)
       }
   }
   ```

2. **Initialize the Database:**

   In your app's code, initialize the database by creating an instance of your `DatabaseHelper` class. You can do this in your application's `onCreate` method or in an appropriate place based on your app's structure.

   ```java
   DatabaseHelper databaseHelper = new DatabaseHelper(this);
   SQLiteDatabase database = databaseHelper.getWritableDatabase();
   ```

3. **CRUD Operations:**

   Implement methods to perform CRUD operations on your database. For example, here's how to insert a new record into the database:

   ```java
   ContentValues values = new ContentValues();
   values.put("title", "Task Title");
   values.put("description", "Task Description");
   long newRowId = database.insert("tasks", null, values);
   ```

   Similarly, you can implement methods for querying, updating, and deleting data.

4. **Version Control:**

   When you make changes to your database schema, such as adding a new table or modifying existing ones, it's essential to increment the `DATABASE_VERSION` in your `DatabaseHelper` class. In the `onUpgrade` method, handle database version upgrades by executing SQL commands to alter the schema.

   ```java
   @Override
   public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
       // Handle database upgrades (e.g., modify table structure)
       if (oldVersion < 2) {
           db.execSQL("ALTER TABLE tasks ADD COLUMN due_date INTEGER");
       }
   }
   ```

5. **Error Handling:**

   Implement error handling for database operations. This includes handling exceptions that might occur during database interactions.

6. **Closing the Database:**

   Ensure that you close the database when you're done with it, typically in the `onDestroy` method of your activity or when you no longer need the database connection.

   ```java
   database.close();
   ```

7. **Testing:**

   Thoroughly test your database operations to ensure they work as expected. You can use unit tests or instrumented tests for this purpose.

8. **Data Management Best Practices:**

   Consider implementing best practices for data management, such as using transactions for multiple operations and ensuring data consistency.

By following these steps, you can package and manage an SQLite database within your Android app. Properly managed databases are crucial for the smooth functioning of your app, especially when dealing with structured data.