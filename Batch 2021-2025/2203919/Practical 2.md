### Practical 2 :- Android Development Environment: Setting Up Android Studio and Understanding Basic Components

---

#### **1. Setting Up Android Studio**

1. **Download and Install:**
   - Visit the [Android Studio website](https://developer.android.com/studio).
   - Download the installer for your operating system (Windows, macOS, or Linux).
   - Run the installer and follow the prompts to install Android Studio.

2. **Initial Setup:**
   - Launch Android Studio after installation.
   - Select "Start a new Android Studio project" or "Import an existing project" if you have one.
   - Follow the setup wizard to configure the IDE, including downloading the Android SDK and setting up an emulator.

3. **SDK Setup:**
   - Go to `File` > `Settings` (or `Android Studio` > `Preferences` on macOS).
   - Navigate to `Appearance & Behavior` > `System Settings` > `Android SDK`.
   - Ensure the latest SDK tools and platforms are installed.

4. **Emulator Setup:**
   - Open `AVD Manager` from the toolbar.
   - Create a new virtual device by selecting a device model and system image.
   - Follow the steps to configure and launch the emulator.

---

#### **2. Understanding Basic Components**

1. **Project Structure:**
   - **`app` Folder**: Contains your application code and resources.
     - **`java` Folder**: Contains Java or Kotlin source files.
     - **`res` Folder**: Contains resources like layouts, strings, and images.
     - **`AndroidManifest.xml`**: Declares application components and permissions.

2. **Gradle Build System:**
   - **`build.gradle` Files**: Manage project dependencies and build settings.
     - **Project-level `build.gradle`**: Configures global settings and repositories.
     - **Module-level `build.gradle`**: Manages dependencies and build configurations for the app module.

3. **Code Editor:**
   - **Editor Tabs**: Allows you to work with multiple files simultaneously.
   - **Code Assistance**: Features like code completion, linting, and error highlighting.

4. **Layout Editor:**
   - **Design Tab**: Visual editor for designing UI layouts using drag-and-drop.
   - **Code Tab**: Shows the XML code for the layout, which can be edited directly.

5. **Emulator:**
   - **Virtual Device**: Simulates an Android device for testing your application.
   - **Control Features**: Allows interaction with the app as if it were on a physical device.

6. **Logcat:**
   - **Log Output**: Displays runtime log messages for debugging.
   - **Filters**: Allows you to filter logs by level or tag.

7. **Run/Debug Configuration:**
   - **Run Button**: Launches the app on the emulator or connected device.
   - **Debug Button**: Starts the app in debug mode, allowing you to set breakpoints and inspect variables.

---

