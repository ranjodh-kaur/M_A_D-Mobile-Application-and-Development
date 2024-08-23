# Unit- 4 [Apps Interactivity in Android]

Topics: 

1. Android Fragment:
2. Fragment Class
3. Fragment Life Cycle
4. Android Intent Class:
5. Intent types
6. Intent Filters
7. Instantiating Intent Object
8. Android Context Class
9. Event Processing:
10. Events, Event Listener
11. Event Handler

### 1. **<u>Android Fragment:</u>**

 In Android, a `Fragment` represents a portion of a user interface or behavior within an `Activity`. It is like a modular section of an activity, and an activity can contain one or more fragments. 

Fragments were introduced to address the challenges of different screen sizes and provide a more modular approach to UI design, especially for devices with larger screens or multiple panes.

![Two versions of the same screen on different screen sizes.](https://developer.android.com/static/images/guide/fragments/fragment-screen-sizes.png)

​                                                                                        **Figure 1**

Consider an app that responds to various screen sizes. On larger screens, you might want the app to display a static navigation drawer and a list in a grid layout. On smaller screens, you might want the app to display a bottom navigation bar and a list in a linear layout.

**Figure 1.** Two versions of the same screen on different screen sizes. On the left, a large screen contains a navigation drawer that is controlled by the activity and a grid list that is controlled by the fragment. On the right, a small screen contains a bottom navigation bar that is controlled by the activity and a linear list that is controlled by the fragment.

**<u>How to use fragment?</u>**

- First of all decide **how many fragments you want to use in an activity**. For example let's we want to use two fragments to handle landscape and portrait modes of the device.
- Next based on number of fragments, **create classes which will extend the *Fragment* class**. The Fragment class has above mentioned callback functions. You can override any of the functions based on your requirements.
- Corresponding to each fragment, you will need to **create layout files in XML file**. These files will have layout for the defined fragments.
- Finally **modify activity file** to define the actual logic of replacing fragments based on your requirement.

## Types of Fragments

Basically fragments are divided as three stages as shown below.

- [Single frame fragments](https://www.tutorialspoint.com/android/android_single_fragments.htm) − Single frame fragments are using for hand hold devices like mobiles, here we can show only one fragment as a view.

- [List fragments](https://www.tutorialspoint.com/android/android_list_fragment.htm) − fragments having special list view is called as list fragment

- [Fragments transaction](https://www.tutorialspoint.com/android/android_fragment_transitions.htm) − Using with fragment transaction. we can move one fragment to another fragment.

  <div style="page-break-after: always;"></div>

### 2. **<u>Fragment Class</u>**

You create fragments by extending **Fragment** class and You can insert a fragment into your activity layout by declaring the fragment in the activity's layout file, as a **<fragment>** element.

**To use fragments, you typically follow these steps:**

- Create a subclass of `Fragment` and override necessary methods (e.g., `onCreateView()` for UI setup).
- In the parent `Activity`, use `FragmentManager` to manage the fragments and begin a `FragmentTransaction`.
- Add the fragment to the activity using the `FragmentTransaction` and commit the transaction.

### Key Concepts and Features:

1. **Lifecycle:** Fragments have their own lifecycle, similar to activities. They go through methods like `onCreate()`, `onStart()`, `onResume()`, `onPause()`, `onStop()`, `onDestroy()`, etc.
2. **User Interface (UI):** Fragments can have their own UI components defined using the `onCreateView()` method, which returns the View associated with the fragment.
3. **Reusability:** Fragments can be reused in multiple activities, making them versatile and promoting code reusability.
4. **Flexibility:** Fragments allow for more flexible UI designs, especially when dealing with different screen sizes (phones, tablets) and orientations (portrait, landscape).
5. **Communication:** Fragments can communicate with the parent activity and other fragments attached to the same activity. This communication is usually done via interfaces.
6. **Back Stack:** Fragments can be added to a back stack, allowing the user to navigate through the fragment transactions using the device's back button.

### Using Fragments:

1. **Creating a Fragment Class:**

2. **Fragment Lifecycle**

3. **UI Layout**

4. **Fragment Transaction**

5. **Communication Between Fragment and Activity**

   

   1. **Creating a Fragment Class:**

   Create a subclass of `Fragment` and override essential methods, especially `onCreateView()` to set up the fragment's UI             *[ie. MyFragment.java].*

   ```java
   public class MyFragment extends Fragment {
   
       @Override
       public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
           // Inflate the layout for this fragment
           return inflater.inflate(R.layout.fragment_my, container, false);
       }
   }
   ```

   2. **Layout for Fragment:**

   ​        A fragment typically has its own layout XML file (e.g., `fragment_my.xml`) that defines its UI components.

   ```html
   <?xml version="1.0" encoding="utf-8"?>
   <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
       android:layout_width="match_parent"
       android:layout_height="match_parent">
   
       <TextView
           android:id="@+id/fragment_id1"
           android:layout_width="wrap_content"
           android:layout_height="52dp"
           android:text="Its fragment Xml layout" />
   </LinearLayout>
   ```

   3. **Adding Fragment to an Activity:**

   To use a fragment in an activity, you typically use the `FragmentManager` and a `FragmentTransaction` in `onCreateView()`to add, replace, or remove fragments in *[activity_main.java].*

   ```java
   MyFragment fragment = new MyFragment();
   FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
   transaction.replace(R.id.fragment_container, fragment);
   transaction.addToBackStack(null);
   transaction.commit();
   ```

   Here, `R.id.fragment_container` is the ID of the container (usually a `FrameLayout` in [activity_main.xml] where the fragment's view will be placed.

   4. **Layout for Main Activity:**

      ```html
          <TextView
              android:id="@+id/textView"
              android:layout_width="wrap_content"
              android:layout_height="wrap_content"
              android:text="Main Activity XML Layout"
              app:layout_constraintBottom_toBottomOf="parent"
              app:layout_constraintEnd_toEndOf="parent"
              app:layout_constraintStart_toStartOf="parent"
              app:layout_constraintTop_toTopOf="parent"
              app:layout_constraintVertical_bias="0.102" />
      
          <FrameLayout
              android:id="@+id/fragment_id"
              android:layout_width="272dp"
              android:layout_height="454dp"
              app:layout_constraintBottom_toBottomOf="parent"
              app:layout_constraintEnd_toEndOf="parent"
              app:layout_constraintHorizontal_bias="0.41"
              app:layout_constraintStart_toStartOf="parent"
              app:layout_constraintTop_toTopOf="parent"
              app:layout_constraintVertical_bias="0.498">
      
          </FrameLayout>
      ```

6. **Communicating Between Fragment and Activity:**

   You can communicate between a fragment and its host activity using interfaces. The fragment defines an interface, and the activity implements it in *MyFragment.java.*

7. **Handling Fragment Lifecycle:**

   Handle fragment lifecycle events within the fragment class in *MyFragment.java*. For example, initialize variables and set up listeners in `onCreateView()`.
   
   <div style="page-break-after: always;"></div>

### 3. <u>Fragment Life Cycle</u>

The lifecycle of a fragment in Android involves a series of callbacks and states that the fragment goes through as it is created, started, resumed, paused, stopped, and destroyed. Below is a lifecycle diagram of a fragment in Android, illustrating the major lifecycle events and their sequence:



![Fragment](https://www.tutorialspoint.com/android/images/fragment.jpg)

Here's a brief explanation of the key lifecycle events:

- **onAttach():** The fragment is associated with an activity.
- **onCreate():** The fragment is being created.
- **onCreateView():** The fragment creates its UI view hierarchy, if it has one.
- **onActivityCreated():** The activity's `onCreate()` method has completed.
- **onStart():** The fragment is visible but not interactive.
- **onResume():** The fragment is visible and active.
- **onPause():** The fragment is partially visible, but the user is interacting with another activity.
- **onStop():** The fragment is not visible.
- **onDestroyView():** The fragment's view hierarchy is being destroyed (e.g., during orientation change).
- **onDestroy():** The fragment is being destroyed.
- **onDetach():** The fragment is being disassociated from the activity.



Here is the Detail list of methods which you can to override in your fragment class −

- **onAttach()**The fragment instance is associated with an activity instance.The fragment and the activity is not fully initialized. Typically you get in this method a reference to the activity which uses the fragment for further initialization work.
- **onCreate()** The system calls this method when creating the fragment. You should initialize essential components of the fragment that you want to retain when the fragment is paused or stopped, then resumed.
- **onCreateView()** The system calls this callback when it's time for the fragment to draw its user interface for the first time. To draw a UI for your fragment, you must return a **View** component from this method that is the root of your fragment's layout. You can return null if the fragment does not provide a UI.
- **onActivityCreated()**The onActivityCreated() is called after the onCreateView() method when the host activity is created. Activity and fragment instance have been created as well as the view hierarchy of the activity. At this point, view can be accessed with the findViewById() method. example. In this method you can instantiate objects which require a Context object
- **onStart()**The onStart() method is called once the fragment gets visible.
- **onResume()**Fragment becomes active.
- **onPause()** The system calls this method as the first indication that the user is leaving the fragment. This is usually where you should commit any changes that should be persisted beyond the current user session.
- **onStop()**Fragment going to be stopped by calling onStop()
- **onDestroyView()**Fragment view will destroy after call this method
- **onDestroy()**onDestroy() called to do final clean up of the fragment's state but Not guaranteed to be called by the Android platform.

------

### **Example 1:** 

- Here's a simple example of using a fragment in an activity [activity_main.java]:

```java
package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		FragmentManager fragmentManager = getSupportFragmentManager();
		FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.fragment_id, new Fragment_activity());
        transaction.commit();
    }
}

_______________________________________________________________________________
                              OR
_______________________________________________________________________________
    
          
package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
@Override
	    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create an instance of the fragment
        Fragment_activity fragment = new Fragment_activity();

        // Begin a fragment transaction
		FragmentTransaction transaction = 	getSupportFragmentManager().beginTransaction();

        // Replace the fragment_container with the fragment
        transaction.add(R.id.fragment_id, fragment);

        // Commit the transaction
        transaction.commit();

    }
}   
```

This will replace the `R.id.fragment_container` with the UI defined in the `MyFragment` class.

- Fragment_activity.java

```java
package com.example.myapplication;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;

public class Fragment_activity extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_activity, container, false);


    }
}
```

- Activity_main.xml

```html
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Main Activity XML Layout"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.102" />

    <FrameLayout
        android:id="@+id/fragment_id"
        android:layout_width="272dp"
        android:layout_height="454dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.41"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.498">

    </FrameLayout>


</androidx.constraintlayout.widget.ConstraintLayout>
```

- Fragment_activity.xml

```html
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:id="@+id/fragment_id1"
        android:layout_width="wrap_content"
        android:layout_height="52dp"
        android:text="Its fragment Xml layout" />
</LinearLayout>			
```

<img src="C:\Users\ranjo\Downloads\Screenshot_2023-10-28-21-22-27-020_com.example.myapplication.jpg" alt="pic" style="zoom:30%;" />



------

------

<div style="page-break-after: always;"></div>

### 4. **<u>Android Intent Class:</u>**

Intent: 

- Intent is to perform an action. 

- Intents **facilitate communication between different components in several ways**.

- The intent is used to 

  - launch an activity

  - start the services
  - broadcast receivers
  - display a web page
  - dial a phone call
    send -messages from one activity to another activity, and so on. 
    It is mostly used to start activity, send broadcast receiver, start services and send message between two activities. 

- In Android, an `Intent` is a messaging object that is used to request an action from another app component, such as an activity, service, or broadcast receiver. It facilitates communication and interaction between different components of an Android application, as well as between applications.

  An `Intent` represents a simple "intent" or purpose, describing what needs to be done without specifying how it should be done. It can be used for a variety of tasks, such as:

  1. **Starting an Activity:**
     An intent can be used to launch a new activity or navigate to an existing one.

  2. **Starting a Service:**
     Intents can initiate the execution of a background service.

  3. **Broadcasting Messages:**
     Intents can be used to broadcast messages or events to interested broadcast receivers.

  4. **Starting an Activity for Result:**
     Intents can start an activity and receive a result back from that activity.

  5. **Opening a Web Page or App:**
     Intents can be used to open a web page or another app on the device.

  `Intent` is composed of two main parts:

  - **Action:** The action is the specific thing that you want to do, such as view, edit, send, etc. It is represented as a string, often defined as constants in the `Intent` class (e.g., `Intent.ACTION_VIEW`, `Intent.ACTION_SEND`).
  - **Data:** The data is the URI or data that the action should be performed upon (e.g., a website URL, a file URI, etc.).

  ### <u>5. Intent types</u>

  In Android, there are two main types of intents:

  1. **Explicit Intent:**

     - Specifies the target component (e.g., activity, service) by its class name.
     - Typically used to start a specific component within the same app.

     ```java
     Intent explicitIntent = new Intent(CurrentActivity.this, TargetActivity.class);
     startActivity(explicitIntent);
     ```

  2. **Implicit Intent:**

     - Does not specify the target component by class name but describes the action to be performed and, optionally, the data involved.
     - The system resolves the appropriate component based on the action and data.
     - Can be used to start components within the same app or components in other apps that can handle the action.

     ```java
     Intent implicitIntent = new Intent(Intent.ACTION_SEND);
     implicitIntent.setType("text/plain");
     implicitIntent.putExtra(Intent.EXTRA_TEXT, "This is some text to share.");
     startActivity(implicitIntent);
     ```


### Where we use Explicit Intent

Explicit intents in Android are used when you know exactly which component (e.g., activity, service) you want to start or communicate with. You specify the target component by its class name. Explicit intents are typically used within your own application to navigate between different components or to trigger specific actions within your app.

Here are some common use cases for explicit intents in Android:

1. **Launching a Specific Activity:**
   You use an explicit intent to start a specific activity within your app.

   ```java
   Intent intent = new Intent(CurrentActivity.this, TargetActivity.class);
   startActivity(intent);
   ```

2. **Navigating to Another Screen in Your App:**
   When the user performs an action that requires navigating to a different screen within your app, you use an explicit intent to launch the appropriate activity.

   ```java
   Intent intent = new Intent(CurrentActivity.this, AnotherActivity.class);
   startActivity(intent);
   ```

3. **Starting a Service:**
   You can use an explicit intent to start a specific service within your app.

   ```java
   Intent intent = new Intent(CurrentActivity.this, MyService.class);
   startService(intent);
   ```

4. **Explicit Broadcast:**
   Sending a broadcast within your app where a specific receiver should receive the broadcast.

   ```java
   Intent intent = new Intent("com.example.MY_ACTION");
   sendBroadcast(intent);
   ```

Explicit intents are precise and allow you to directly target a specific component in your app. They are typically used when you have prior knowledge of the component you want to interact with, such as when moving between different screens or starting a specific service.

### Where we use Implicit Intent

Implicit intents in Android are used when you want to perform an action that can be handled by any app on the device that is registered to handle that specific action. Essentially, you're expressing an intention for something to be done without specifying the exact app or component to perform it. This allows for greater flexibility and allows the user to choose the app to complete the action.

Here are some common use cases where implicit intents are used:

1. **Opening a Web Page:**

   ```java
   Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://example.com"));
   startActivity(intent);
   ```

   This opens a web browser or any app that can handle viewing web pages.

2. **Sending Email:**

   ```java
   Intent intent = new Intent(Intent.ACTION_SENDTO);
   intent.setData(Uri.parse("mailto:recipient@example.com"));
   intent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
   intent.putExtra(Intent.EXTRA_TEXT, "Email body");
   startActivity(intent);
   ```

   This opens the email client or any app that can handle sending emails.

3. **Sharing Text:**

   ```java
   Intent intent = new Intent(Intent.ACTION_SEND);
   intent.setType("text/plain");
   intent.putExtra(Intent.EXTRA_TEXT, "This is some text to share.");
   startActivity(Intent.createChooser(intent, "Share via"));
   ```

   This allows the user to share text through any app that supports sharing.

4. **Making a Phone Call:**

   ```java
   Intent intent = new Intent(Intent.ACTION_DIAL);
   intent.setData(Uri.parse("tel:" + phoneNumber));
   startActivity(intent);
   ```

   This opens the dialer or any app that can handle phone calls.

5. **Opening Maps:**

   ```java
   Intent intent = new Intent(Intent.ACTION_VIEW,
           Uri.parse("geo:0,0?q=latitude,longitude(label)"));
   startActivity(intent);
   ```

   This opens a maps application.

6. **Opening Contacts:**

   ```java
   Intent intent = new Intent(Intent.ACTION_VIEW);
   intent.setData(ContactsContract.Contacts.CONTENT_URI);
   startActivity(intent);
   ```

   This opens the contacts app.

Implicit intents are a powerful mechanism to utilize functionalities across various apps, enhancing the user experience by providing options and freedom to choose how to complete a specific action.



### <u>6. Intent Filters</u>

In Android, an intent filter is a powerful feature that allows components (e.g., activities, services, broadcast receivers) to declare the types of intents they can handle. It's a way for an app component to advertise what types of intents it can respond to and handle.

Intent filters are specified in the AndroidManifest.xml file for each component, enabling other apps and the Android system to determine the capabilities of the app and decide which component to launch when a specific intent is sent.

Here are the key components of an intent filter:

1. **Action:**
   Specifies the general action the component can perform. Examples include `ACTION_SEND` to send data or `ACTION_VIEW` to view data.

2. **Category:**
   Describes additional information about the component's behavior. Common categories include `CATEGORY_DEFAULT`, `CATEGORY_LAUNCHER`, and `CATEGORY_BROWSABLE`.

3. **Data:**
   Specifies the type of data the component can handle. It can be a specific URI scheme (e.g., "http"), a MIME type (e.g., "text/plain"), or a combination.

By specifying intent filters for components in the AndroidManifest.xml file, you make it clear to the system and other apps what actions and data types your app can handle.

### Example of an Intent Filter:

Here's an example of an intent filter defined in an activity's declaration within the AndroidManifest.xml file:

```xml
<activity android:name=".MyActivity">
    <intent-filter>
        <action android:name="android.intent.action.VIEW" />
        <category android:name="android.intent.category.DEFAULT" />
        <category android:name="android.intent.category.BROWSABLE" />
        <data android:scheme="http" />
        <data android:scheme="https" />
    </intent-filter>
</activity>
```

In this example, the activity can handle the `VIEW` action and specifies that it can handle HTTP and HTTPS data schemes. It is also marked as browsable, indicating that it can be invoked from a web browser.

### Use Cases:

- **Launching an Activity for a Specific URL:**
  An activity can have an intent filter to open specific URLs using a web browser.

- **Handling Share Actions:**
  An activity can specify an intent filter to handle share actions, allowing the app to receive content shared from other apps.

- **Viewing Specific File Types:**
  An activity can specify intent filters to handle specific MIME types, allowing it to open certain file types.

Intent filters are a fundamental part of Android app development, enabling seamless interaction between components and facilitating the integration of your app with the Android system and other apps.

<div style="page-break-after: always;"></div>

### <u>7. Instantiating Intent Object</u>

In Android, you can create an `Intent` object to define the action and behavior you want to perform, such as starting an activity, a service, sending a broadcast, etc. The `Intent` class provides various constructors and methods to create and configure intent objects. Here are some common ways to instantiate an `Intent` object:

### 1. **Simple Intent Creation:**

```java
Intent intent = new Intent();
```

This creates a basic `Intent` object without specifying any action or data.

### 2. **Intent with Action:**

```java
Intent intent = new Intent(Intent.ACTION_VIEW);
```

This creates an `Intent` object with a specific action (e.g., `ACTION_VIEW`). You can replace `ACTION_VIEW` with other actions like `ACTION_SEND`, `ACTION_EDIT`, etc.

### 3. **Intent with Action and Data:**

```java
Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.example.com"));
```

This creates an `Intent` with both action (`ACTION_VIEW`) and data (a URL in this example).

### 4. **Explicit Intent:**

```java
Intent intent = new Intent(CurrentActivity.this, TargetActivity.class);
```

This creates an explicit intent to start a specific activity (`TargetActivity`) within your application.

### 5. **Intent with Extras:**

```java
Intent intent = new Intent(CurrentActivity.this, TargetActivity.class);
intent.putExtra("key", "value");
```

This creates an intent with extras (additional data) that can be passed to the target activity.

### 6. **Implicit Intent with Type:**

```java
Intent intent = new Intent(Intent.ACTION_SEND);
intent.setType("text/plain");
```

This creates an implicit intent to send content, specifying the MIME type as plain text.

### 7. **Intent with Package Context:**

```java
Intent intent = new Intent(getApplicationContext(), TargetActivity.class);
```

This creates an intent with the application context to start a specific activity (`TargetActivity`).

After creating the `Intent` object, you can further configure it by setting flags, specifying categories, adding data, etc. For example:

```java
intent.addCategory(Intent.CATEGORY_DEFAULT);
intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
```

Once the `Intent` is configured, you can start the desired component (e.g., activity) by passing it to methods like `startActivity(intent)` or `startService(intent)`.

Remember to specify the appropriate action, data, and components (if using an explicit intent) based on what you intend to achieve with the `Intent`.

### <u>8. Android Context Class</u>

In Android, the `Context` class is a fundamental part of the Android framework and is an essential component for interacting with the Android system and resources. It represents the current state of the application or environment and provides access to application-specific resources and operations. The `Context` class is an abstract class that is extended by various Android components, including `Activity`, `Service`, `Application`, and more.

Here are some important aspects and functionalities related to the `Context` class in Android:

1. **Access to System Services:**
   `Context` provides access to a wide range of system services, such as the system clipboard, location services, notification services, and more. These services can be accessed using the `getSystemService()` method.

   ```java
   LocationManager locationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
   ```

2. **Accessing Resources:**
   `Context` allows access to application-specific resources like strings, layouts, images, and more. Resources can be accessed using methods like `getString()`, `getDrawable()`, `getAssets()`, and others.

   ```java
   String appName = context.getString(R.string.app_name);
   Drawable appIcon = context.getDrawable(R.drawable.ic_app_icon);
   ```

3. **Launching Activities:**
   `Context` is used to start new activities, create intents, and manage navigation within an Android app.

   ```java
   Intent intent = new Intent(context, TargetActivity.class);
   context.startActivity(intent);
   ```

4. **Getting Application Information:**
   `Context` provides information about the application, such as the application's package name, package manager, application info, and more.

   ```java
   String packageName = context.getPackageName();
   ```

5. **Access to SharedPreferences:**
   `Context` allows access to the shared preferences for the application, facilitating data storage.

   ```java
   SharedPreferences preferences = context.getSharedPreferences("my_prefs", Context.MODE_PRIVATE);
   ```

6. **File and Database Access:**
   `Context` provides methods to create and access files and databases specific to the application.

   ```java
   FileInputStream inputStream = context.openFileInput("filename.txt");
   ```

7. **UI-Related Operations:**
   `Context` can be used for UI-related operations, such as inflating layouts and creating views.

   ```java
   LayoutInflater inflater = LayoutInflater.from(context);
   View view = inflater.inflate(R.layout.my_layout, parent, false);
   ```

<div style="page-break-after: always;"></div>

### <u>9. Event Processing</u> 

Event processing in Android involves handling various user interactions and system events within an Android application. These events can originate from user interactions like touches, clicks, and gestures, or from the system, such as notifications and system state changes. Efficient event handling is critical to providing a smooth and responsive user experience in Android apps.

Here's a breakdown of key aspects related to event processing in Android:

### 1. **Event Sources:**

- **User Interface (UI) Events:**
  These events are generated by user interactions with the app's user interface elements, such as buttons, text fields, gestures, etc.

- **System Events:**
  These events are generated by the Android system, like changes in connectivity, battery level, screen orientation, etc.

### 2. **Event Listeners:**

- **OnClickListener:**
  This listener is commonly used to handle click events on UI components like buttons. It's implemented by attaching the listener to the component.

- **OnTouchListener:**
  Allows handling touch events, which are more granular than click events. It can be used to detect touch-down, touch-up, and touch-move events.

- **GestureListener:**
  For handling complex gestures, Android provides a `GestureDetector` class that can detect gestures like swipes, long presses, double taps, etc.

### 3. **Event Handling:**

- **Event Handling in Activities:**
  In an activity, you can handle events directly within the activity class by implementing event listeners and overriding appropriate methods.

- **Event Handling in Fragments:**
  Fragments can handle events similarly to activities, but you should be mindful of the fragment's lifecycle and the hosting activity's lifecycle.

- **Custom Views:**
  Custom views can define their own event handling logic by overriding event-related methods like `onTouchEvent()`.

### 4. **Event Propagation:**

- **Event Bubbling:**
  In the Android view hierarchy, events can propagate up the view hierarchy (towards the root view) until they are consumed or handled.

- **Event Capturing:**
  Android primarily uses event bubbling, where events start from the source view and move towards the root view, allowing parent views to handle the event.

### 5. **Asynchronous Event Handling:**

- **Handler and Looper:**
  Android provides the `Handler` class to handle asynchronous operations and post events or runnables to execute on the UI thread.

- **AsyncTask and Threads:**
  For more complex background operations, you can use `AsyncTask` or plain Java threads to handle events asynchronously.

### 6. **Event Dispatching:**

- **DispatchTouchEvent():**
  In custom views, you can override `dispatchTouchEvent()` to intercept and process touch events before they reach the `onTouchEvent()` method.

### 7. **System-wide Events:**

- **Broadcast Receivers:**
  Android apps can listen for system-wide events or custom events using broadcast receivers. This is often used for receiving notifications or system changes.

- **Services:**
  Background services can continuously listen for certain events or perform periodic tasks.

Effective event processing in Android involves understanding the different types of events, attaching appropriate event listeners, handling events in a responsive manner, and managing event propagation efficiently. Balancing asynchronous event handling and optimizing for the specific needs of your app is essential for a smooth user experience.

<div style="page-break-after: always;"></div>

### <u>10. Events, Event Listener</u>

In Android programming, events and event listeners play a crucial role in allowing the app to respond to user interactions and system actions. Here's an explanation of events and event listeners in Android:

### Events:

An event in Android refers to a specific action or occurrence that happens during the execution of an app. These events can originate from various sources, including user interactions (e.g., touches, clicks) or system actions (e.g., screen rotation, incoming call).

In the context of Android, events can be categorized into:

1. **User Interface (UI) Events:**
   These events are generated by user interactions with UI components like buttons, text fields, etc. Common UI events include clicks, touches, long presses, swipes, etc.

2. **System Events:**
   These events are triggered by the Android system or the device, such as connectivity changes, battery level changes, screen orientation changes, etc.

### Event Listeners:

Event listeners in Android are interfaces or classes that are implemented to respond to specific types of events. They are used to define the behavior or actions that should be taken when a particular event occurs.

For example, if you want to handle a button click event, you would implement the `View.OnClickListener` interface and override its `onClick()` method to define what happens when the button is clicked.

Commonly used event listeners in Android include:

- **OnClickListener:**
  Used to handle click events on UI components (e.g., buttons).

- **OnLongClickListener:**
  Used to handle long-press events on UI components.

- **OnTouchListener:**
  Used to handle touch events, allowing for more granular touch event handling.

### Event Handling:

Event handling in Android involves associating event listeners with UI components and implementing the corresponding event handling code.

1. **Attaching Event Listeners:**
   Event listeners are attached to UI components using the `setOn...Listener()` methods provided by the component.

   ```java
   Button button = findViewById(R.id.button);
   button.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           // Handle button click
       }
   });
   ```

2. **Implementing Event Handling Logic:**
   Inside the event listener, you override the appropriate event handling method (e.g., `onClick()` for `OnClickListener`) to define what actions to perform when the event occurs.

   ```java
   button.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           // Event handling logic for button click
           // ...
       }
   });
   ```

By attaching event listeners to UI components and implementing event handling logic, you enable your app to respond to various user interactions and system events, enhancing the overall user experience. Event listeners are a fundamental aspect of Android development, allowing you to create interactive and responsive applications.

### <u>11. Event Handler</u>

In Android, an event handler is a mechanism that allows you to specify code or logic to be executed in response to specific events, such as user interactions or system actions. Event handlers are used to define how your application should respond when a particular event occurs.

### Key Concepts:

1. **Event:**
   An event is a specific action or occurrence, such as a button click, a touch on the screen, or a system event like a change in connectivity status. Events trigger the execution of associated event handlers.

2. **Event Handler:**
   An event handler is a piece of code or a method that defines what actions should be taken in response to a specific event. It typically contains the logic to be executed when the event occurs.

3. **Event Listener:**
   An event listener is an interface or class that listens for specific events and calls the appropriate event handler when the event occurs.

4. **Event Handling:**
   Event handling involves linking an event to its corresponding event handler. When the event is triggered, the associated event handler is executed.

### Event Handling Process:

1. **Attach an Event Listener:**
   Attach an event listener to the UI component or system object you want to monitor for events.

2. **Define the Event Handler:**
   Implement the event handler to define what actions should be performed when the event occurs.

3. **Link the Event Listener to the Event Handler:**
   Associate the event listener with the event handler so that when the event is detected, the event handler is invoked.

4. **Handle the Event:**
   Inside the event handler, write the logic to respond to the event appropriately.

### Example (Button Click Event Handling):

```java
Button button = findViewById(R.id.button);

// Attach an event listener for button clicks
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        // Event handler for button click
        // Define actions to be performed when the button is clicked
        // ...
    }
});
```

In this example, a click event listener is attached to a button, and when the button is clicked, the event handler defined inside the `onClick()` method is executed.

