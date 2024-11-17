## PRACTICAL 7 : Android Services and Threads:To implement the concept of multithreading using Android Service class.

In Android, services allow you to perform long-running operations in the background, even if the app isn’t visible. To implement multithreading in an Android service, you can use a separate thread within the service so that the main UI thread is not blocked.

Below is an example code of an `IntentService` implementation to perform background work in a new thread. `IntentService` is a subclass of `Service` that handles each intent it receives in a worker thread automatically.

### Steps Overview:
1. **Create a Service**: This example uses `IntentService`, which automatically runs tasks in a background thread.
2. **Override `onHandleIntent()`**: This is where you perform your background work.
3. **Start the Service**: Use `startService()` from an activity or another component.

### Example Code

#### 1. `MyIntentService.java`

This service runs in the background and performs a task without blocking the main UI thread. It will print log messages every second for five iterations, simulating a time-consuming task.

```java
import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyIntentService extends IntentService {

    private static final String TAG = "MyIntentService";

    // Constructor that names the worker thread
    public MyIntentService() {
        super("MyIntentService");
    }

    // This method is called on a background thread
    @Override
    protected void onHandleIntent(Intent intent) {
        for (int i = 0; i < 5; i++) {
            Log.d(TAG, "Background task is running: " + i);
            try {
                // Simulate a delay
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Log.d(TAG, "Task completed in MyIntentService");
    }
}
```

#### 2. `MainActivity.java`

In this activity, you can start the `MyIntentService`. When started, it will handle the background task without blocking the UI.

```java
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startServiceButton = findViewById(R.id.startServiceButton);
        startServiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the service
                Intent intent = new Intent(MainActivity.this, MyIntentService.class);
                startService(intent);
            }
        });
    }
}
```

#### 3. `AndroidManifest.xml`

Declare the `MyIntentService` in your Android Manifest so the app knows it exists.

```xml
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.example.myserviceapp">

    <application
        ... >
        <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
        <service android:name=".MyIntentService" />
    </application>

</manifest>
```

#### 4. `activity_main.xml`

A simple layout with a button to start the service.

```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <Button
        android:id="@+id/startServiceButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Start Service"
        android:layout_centerInParent="true" />
</RelativeLayout>
```

### Explanation

- `MyIntentService`: Extends `IntentService`, automatically managing a worker thread for you. The `onHandleIntent` method runs in the background thread, so there’s no need for additional thread management.
- `MainActivity`: Starts `MyIntentService` when the button is clicked.
- `AndroidManifest.xml`: Registers the service.
- `activity_main.xml`: Contains the button to start the service.

### How It Works

When you tap "Start Service," the app launches `MyIntentService`. This service will log a message every second for five seconds, simulating a task. Using `IntentService` keeps the main thread free, preventing UI freezing.
<p align="center">
<img src ="https://github.com/natasha-dhingra/M_A_D-Mobile-Application-and-Development/blob/master/Batch%202021-2025/2203919/prac7.jpg?raw=true" width="200">
<img src="https://github.com/natasha-dhingra/M_A_D-Mobile-Application-and-Development/blob/master/Batch%202021-2025/2203919/Screenshot%202024-11-13%20112035.png?raw=true" width="500" height="100">
</p>
