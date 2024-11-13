## PRACTICAL 8 : Android Security and Debugging: To implement concept of permission and perform request for permission to access different hardware components of mobile.

In Android, accessing sensitive hardware components like the camera, microphone, or location requires explicit permission from the user. Since Android 6.0 (API level 23), apps need to request permissions at runtime instead of just declaring them in the manifest.

Here’s a simple guide to implementing and requesting permissions in Android:

### Steps

1. **Declare Permissions in the Manifest**: Specify the permissions you need in `AndroidManifest.xml`.
2. **Check and Request Permissions at Runtime**: In your code, check if the permission is already granted. If not, request it from the user.
3. **Handle the Permission Result**: Process the user's response in `onRequestPermissionsResult`.

Let's create an example where the app requests access to the camera and location.

### Code Implementation

#### Step 1: Declare Permissions in `AndroidManifest.xml`

Add the permissions your app needs:

```xml
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.example.permissionapp">

    <!-- Declare permissions here, outside the <application> tag -->
    <uses-permission android:name="android.permission.CAMERA" />
    <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />

    <application
        android:allowBackup="true"
        android:label="@string/app_name"
        android:supportsRtl="true"
        android:theme="@style/Theme.PermissionApp">
        
        <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>
</manifest>

```

#### Step 2: Request Permissions in Code

In `MainActivity`, check if permissions are granted. If not, request them from the user.

```java
import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    private static final int PERMISSION_REQUEST_CODE = 1;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button requestPermissionButton = findViewById(R.id.requestPermissionButton);
        requestPermissionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAndRequestPermissions();
            }
        });
    }

    private void checkAndRequestPermissions() {
        // Check if camera permission is granted
        boolean cameraPermissionGranted = ContextCompat.checkSelfPermission(
                this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED;

        // Check if location permission is granted
        boolean locationPermissionGranted = ContextCompat.checkSelfPermission(
                this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED;

        if (!cameraPermissionGranted || !locationPermissionGranted) {
            // Request permissions
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.CAMERA, Manifest.permission.ACCESS_FINE_LOCATION},
                    PERMISSION_REQUEST_CODE);
        } else {
            Toast.makeText(this, "Permissions already granted", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == PERMISSION_REQUEST_CODE) {
            if (grantResults.length > 0) {
                boolean cameraPermission = grantResults[0] == PackageManager.PERMISSION_GRANTED;
                boolean locationPermission = grantResults[1] == PackageManager.PERMISSION_GRANTED;

                if (cameraPermission && locationPermission) {
                    Log.d(TAG, "Camera and Location permissions granted");
                    Toast.makeText(this, "Permissions granted", Toast.LENGTH_SHORT).show();
                } else {
                    Log.d(TAG, "Permissions denied");
                    Toast.makeText(this, "Permissions denied", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}
```

#### Step 3: Handle UI (XML Layout)

In `activity_main.xml`, add a button to request permissions:

```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="16dp">

    <Button
        android:id="@+id/requestPermissionButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Request Permissions"
        android:layout_centerInParent="true" />
</RelativeLayout>
```

### Explanation of Code

1. **Checking Permissions**: Before requesting permissions, we check if they're already granted using `ContextCompat.checkSelfPermission`.
2. **Requesting Permissions**: If permissions are not granted, `ActivityCompat.requestPermissions` prompts the user to grant the required permissions.
3. **Handling the Result**: `onRequestPermissionsResult` checks whether the user granted or denied each permission and shows a `Toast` message accordingly.

### Testing and Troubleshooting

- **Grant Permissions**: Run the app on a physical device or emulator with Android 6.0+ to test the permission request flow.
- **Logcat Messages**: Use `Log.d` statements to track permissions statuses in `Logcat`.

This setup helps ensure that your app requests permissions only when necessary and handles users' choices gracefully.

<p align="center">
<img src ="https://github.com/natasha-dhingra/M_A_D-Mobile-Application-and-Development/blob/master/Batch%202021-2025/2203919/prac8.jpg" width="200">
<img src="https://github.com/natasha-dhingra/M_A_D-Mobile-Application-and-Development/blob/master/Batch%202021-2025/2203919/prac8.2.jpg" width="200">
<img src="https://github.com/natasha-dhingra/M_A_D-Mobile-Application-and-Development/blob/master/Batch%202021-2025/2203919/prac8.3.jpg" width="200">
<img src="https://github.com/natasha-dhingra/M_A_D-Mobile-Application-and-Development/blob/master/Batch%202021-2025/2203919/prac8.4.jpg" width="200">
</p>
