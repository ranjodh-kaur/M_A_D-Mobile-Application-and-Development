# Practical 2: Android Development Environment Setup and Basic Components

 **1. Downloading and Installing Android Studio**
   - Download Android Studio : Visit the [official Android Studio download page](https://developer.android.com/studio) and download the latest version for your operating system.
   - Install Android Studio : Run the downloaded installer and follow the on-screen instructions to install Android Studio. Ensure you install the necessary SDK components during the installation process.

 **2. Setting Up Android Studio**
   - Launch Android Studio : Open Android Studio after installation.
   - Welcome Screen : On the welcome screen, you have options to start a new project, open an existing project, or configure settings.
   - Create a New Project : Select "Start a new Android Studio project."
   - Configure Your Project : Provide the project name, package name, save location, language (Java/Kotlin), and minimum API level.
   - Select Activity Template : Choose an activity template, like "Empty Activity," for simplicity.
   - Finish Setup : Click "Finish" to complete the setup and open your new project.

**3. Understanding Basic Components of Android Studio**
   - Project Structure : The main components of your project will include:
     - Java/Kotlin Files : Located in the `app/src/main/java` directory. These files contain your app’s source code.
     - XML Layout Files : Located in the `app/src/main/res/layout` directory. These files define the UI of your app.
     - AndroidManifest.xml : Located in the `app/src/main` directory. This file contains essential information about your app, including its components and permissions.
   - Android Studio Layout :
     - Toolbar : Provides quick access to frequently used actions and tools.
     - Project Explorer : Located on the left side, it shows the structure of your project.
     - Editor Window : The central area where you write and edit your code.
     - Logcat : Located at the bottom, it displays system messages, including log messages from your app.
     - Emulator/Device Manager : Allows you to create and manage virtual devices to test your app.

**4. Creating and Running a Basic App**
   - Create a Simple App :
     - Open `activity_main.xml` and add some UI elements like a `TextView` or `Button`.
     - Open `MainActivity.java` or `MainActivity.kt` and write some basic code to handle UI interactions.
   - Run the App :
     - Click the "Run" button on the toolbar.
     - Choose a virtual device or connect a physical device via USB.
     - Android Studio will build and install the app on the selected device.

