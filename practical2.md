                              Practical -2
**To setup Android studio2 and study its basic components.**

**Step – 1 :**
Head over to this link https://developer.android.com/studio/#downloads to get the Android Studio executable or zip file .

**Step – 2 :**
Click on the download android studio button .

![](https://media.geeksforgeeks.org/wp-content/uploads/DownAS_GFG.png)

Click on the “I have read and agree with the above terms and conditions” checkbox followed by the download button.

![](https://media.geeksforgeeks.org/wp-content/uploads/Screenshot-96-1.png)

Click on Save file button in the appeared prompt box and the file will start downloading .

**Step – 3:**
After the downloading has finished, open the file from downloads and run it .
It will prompt the following dialogue box .

![](https://media.geeksforgeeks.org/wp-content/uploads/as1-1.png)

Click on next .

In the next prompt it’ll ask for a path for installation. Choose a path and hit next.

Note :The installation path should have the required minimum space.

**Step – 4 :**
It will start the installation, and once it is completed, it will be like the image shown below .

![](https://media.geeksforgeeks.org/wp-content/uploads/as3-1.png)

Click on next .

![](https://media.geeksforgeeks.org/wp-content/uploads/as4-1.png)

**Step – 5 :**
Once “Finish” is clicked, it will ask whether the previous settings needs to be impoerted [if android studio had been installed earlier], or not.
It is better to choose the ‘Don’t import Settings option’ .

![](https://media.geeksforgeeks.org/wp-content/uploads/as5-1.png)
Click the OK button.

**Step – 6 :**
This will start the Android Studio.
![](https://media.geeksforgeeks.org/wp-content/uploads/as15.png)
Meanwhile it will be finding the available SDK components .

![](https://media.geeksforgeeks.org/wp-content/uploads/as7-1.png)

**Step – 7:**
After it has found the SDK components, it will redirect to the Welcome dialog box .

![](https://media.geeksforgeeks.org/wp-content/uploads/as8.png)
Click on next .
![](https://media.geeksforgeeks.org/wp-content/uploads/as9.png)
Choose Standard and click on Next.
Now choose the theme, whether Light theme or the Dark one .
The light one is called the IntelliJ theme whereas the dark theme is called Darcula .
Choose as required.
![](https://media.geeksforgeeks.org/wp-content/uploads/as10.png)
Click on the Next button

**Step – 8 :**
Now it is time to download the SDK components .

![](https://media.geeksforgeeks.org/wp-content/uploads/as11.png)
Click on Finish .

![](https://media.geeksforgeeks.org/wp-content/uploads/as12.png)
It has started downloading the components

![](https://media.geeksforgeeks.org/wp-content/uploads/as13.png)

The Android Studio has been successfully configured.
Now it’s time to launch and build apps.

Click on the Finish button to launch it.

**Step – 9 :**
Click on ‘Start new android project’ to build a new app.

![](https://media.geeksforgeeks.org/wp-content/uploads/as14.png)


# Components of an Android Application
There are some necessary building blocks that an Android application consists of. These loosely coupled components are bound by the application manifest file which contains description of each component and how they interact. The manifest file also contains the app’s metadata, its hardware configuration and platform requirements, external libraries and required permissions.

There are the following main components of an android app:-

**1 .Activities-**
Activities are said to be the presentation layer of our applications. The UI of our application is build around one or more extensions of the Activity class. By using Fragments and Views, activities set the layout and display the output and also respond to the users actions.
An activity is implemented as a subclass of class Activity.



 

filter_none
edit
play_arrow

brightness_5
public class MainActivity extends Activity { 
} 

**2.Services-**
These are like invisible workers of our app. These components run at backend, updating your data sources and Activities, triggering Notification and also broadcast Intents. They also perform some tasks when applications are not active. A service can be used as a subclass of class Service:

filter_none
edit
play_arrow

brightness_5
public class ServiceName extends Service { 
} 

**3.Content Providers-**
It is used to manage and persist the application data also typically interact with SQL database. They are also responsible for sharing the data beyond the application boundaries. The Content Providers of a particular application can be configured to allow access from other applications, and the Content Providers exposed by other applications can also be configured.
A content provider should be a sub class of the class ContentProvider.

filter_none
edit
play_arrow

brightness_5
public class contentProviderName extends  ContentProvider { 
   public void onCreate(){} 
} 

**4.Intents-**
It is a powerful inter-application message-passing framework. They are extensively used throughout Android. Intents can be used to start and stop Activities and Services, to broadcast messages system-wide or to an explicit Activity, Service or Broadcast Receiver or to request an action be performed on a particular piece of data.

**5.Broadcast Receivers-**
They are known to be intent listeners as they enable your application to listen the Intents that satisfy the matching criteria specified by us. Broadcast Receivers make our application to react to any received Intent thereby making them perfect for creating event driven applications.

**6.Widgets-**
These are the small visual application components that you can find on the home screen of the devices. They are special variation of Broadcast Receivers that allow us to create dynamic, interactive application components for users to embed on their Home Screen.

**7.Notifications-**
Notifications are the application alerts that are used to draw user’s attention to some particular app event without stealing focus or interrupting the current Activity of the user. They are generally used to grab user’s attention when the application is not visible or active, particularly from within a Service or Broadcast Receiver. Examples: E-mail popups, Messenger popups etc.
