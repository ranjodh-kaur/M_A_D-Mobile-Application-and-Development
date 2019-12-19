# Practical 9: To perform debugging and testing of android app using tools like Logcat, Android debug bridge, DDMS.

## Debugging and Testing: 
Debugging is the process of finding and fixing errors (bugs) or unexpected behaviour in our code. 
All code has bugs, from incorrect behaviour in our app, to behaviour that excessively consumes memory or network resources,
to actual app freezing or crashing.

Bugs can result for many reasons:

    • Errors in design or implementation
    • Android framework limitations (or bugs)
    • Missing requirements or assumptions for how the app should work
    • Device limitations (or bugs)
    
Use the debugging, testing, and profiling capabilities in Android Studio to help us reproduce, find, 
and resolve all of these problems. Those capabilities include:

    • Logcat
    • Android Debug Bridge
    • DDMS (Dalvik Debug Monitor Server)

## LOGCAT:
We can use log class to send messages to the Android system log, and view those messages in Android Studio 
in the Logcat pane. The Android SDK includes a useful logging utility class called android.util.Log. 
The class allows us to log messages categorized based severity; each type of logging message has its own message.
Here is a listing of the message types, and their respective method calls, ordered from lowest to highest priority:

    • The Log.v() method is used to log verbose messages.
    • The Log.d() method is used to log debug messages.
    • The Log.i() method is used to log informational messages.
    • The Log.w() method is used to log warnings.
    • The Log.e() method is used to log errors.
    • The Log.wtf() method is used to log events that should never happen 
    (“wtf” being an abbreviation for “What a Terrible Failure”, of course). 
    We can think of this method as the equivalent of Java’s assert method.

![](https://raw.githubusercontent.com/ranjodh-kaur/M_A_D/master/9.1.jpg)

Android Debug Bridge:

Android Debug Bridge (adb) is a versatile command-line tool that lets us communicate with a device.
ADB is a part of Android SDK The adb command facilitates a variety of device actions, such as installing 
and debugging apps, and it provides access to a Unix shell that we can use to run a variety of commands on a device.
It is a client-server program that includes three components:

    • A client, which sends commands. The client runs on development machine. We can invoke a client from a 
      command-line terminal by issuing an adb command.
    • A daemon (adbd), which runs commands on a device. The daemon runs as a background process on each device.
    • A server, which manages communication between the client and the daemon. The server runs as a background
    process on your development machine.
    
## Enable adb debugging:

We have to use USB debugging under Developer Options for using adb with a device. 
We can now connect our device with USB. We can verify that our device is connected by executing adb devices from 
the android_sdk/platform-tools/ directory.

## Setup Android SDK
![](https://raw.githubusercontent.com/ranjodh-kaur/M_A_D/master/9.2.jpg)

## Enable USB debugging:
![](https://raw.githubusercontent.com/ranjodh-kaur/M_A_D/master/9.3.jpg)

## Test ADB connection: 
adb devices

![](https://raw.githubusercontent.com/ranjodh-kaur/M_A_D/master/9.4.jpg)

	Now, we can run ADB commands to use the tool in console for both Debugging and Testing of the application. 
  Further details and guide to the ADB can be seen here.

DDMS (Dalvik Debug Monitor Server):
The DDMS is a debugging tool used in the Android platform. The Dalvik Debug Monitor Service is downloaded as 
part of the Android SDK. Some of the services provided by the DDMS are port forwarding, on-device screen capture, 
on-device thread and heap monitoring, and radio state information. 
It allows developers to spot bugs in applications running on either an emulator or an actual Android device. 
Its feature, known as Emulator Control allows developers to simulate phone states and activities. 
For example, it can simulate different types of networks which can have different network characteristics 
such as speed and latency. 
This debugging tool can be integrated into the Eclipse IDE by adding the ADT (Android Development Tools) plug-in. 
Otherwise, it can be accessed from the command line and will automatically connect to any running emulator.

![](https://raw.githubusercontent.com/ranjodh-kaur/M_A_D/master/9.5.jpg)

	DDMS is deprecated. Its features have been replaced by other new features.
	Instead of this, we use Android Profiler in Android Studio 3.0 and higher to profile
	your app's CPU, memory, and network usage. To perform other debugging tasks, such as sending 
	commands to a connected device to set up port-forwarding, transfer files, or take screenshots, 
	then use the Android Debug Bridge (adb), Android Emulator, Device File Explorer, or Debugger window.
