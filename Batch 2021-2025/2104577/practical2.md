# Practical 2: Android Development Environment: To setup Android studio2 and study its basic components.



Setting up Android Studio and getting familiar with its basic components is a crucial step in Android development. Here’s a step-by-step guide to help you get started:

### Step 1: Download and Install Android Studio

1. **Download Android Studio:**
   - Go to the [official Android Studio download page](https://developer.android.com/studio).
   - Choose your operating system (Windows, macOS, or Linux) and download the installer.

2. **Install Android Studio:**
   - **Windows:** Run the downloaded `.exe` file and follow the installation wizard.
   - **macOS:** Open the downloaded `.dmg` file, drag and drop Android Studio into the Applications folder.
   - **Linux:** Unpack the downloaded `.tar.gz` file, navigate to the `android-studio/bin/` directory, and execute `studio.sh`.

3. **First Run Configuration:**
   - Launch Android Studio.
   - Follow the setup wizard to install the necessary SDKs, libraries, and tools.
   - Choose the standard setup when prompted for the type of setup.

### Step 2: Configure Android Studio

1. **SDK Manager:**
   - Go to `Tools > SDK Manager`.
   - Ensure you have the latest Android SDK (usually recommended) and relevant SDK tools installed.
   - You may also want to install additional SDK platforms and system images if you plan to test on different Android versions.

2. **AVD Manager:**
   - Go to `Tools > AVD Manager`.
   - Create a new virtual device (AVD) for testing your applications.
   - Choose a device definition and system image, then follow the prompts to set up the AVD.

### Step 3: Create a New Project

1. **Start a New Project:**
   - Click on `Start a new Android Studio project` from the welcome screen.
   - Choose a project template, like `Empty Activity` for a basic start.
   - Configure your project by setting the name, package name, save location, language (Java/Kotlin), and minimum SDK.
   - Click `Finish` to create the project.

### Step 4: Understand Basic Components

1. **Project Structure:**
   - **`app/src/main/java/`:** Contains your Java/Kotlin source files.
   - **`app/src/main/res/`:** Contains your resources (layouts, strings, images, etc.).
   - **`AndroidManifest.xml`:** Defines essential information about your app like permissions and activities.

2. **User Interface (UI):**
   - **Activity:** A single screen in your app. Defined by a Java/Kotlin class and a corresponding XML layout file.
   - **Fragment:** A reusable portion of UI in an activity.

3. **Common Files:**
   - **`MainActivity.java`/`MainActivity.kt`:** The main activity of your application.
   - **`activity_main.xml`:** The main layout file associated with `MainActivity`.

4. **Gradle Build System:**
   - **`build.gradle (Project: YourProject)`:** Configuration specific to your project.
   - **`build.gradle (Module: app)`:** Configuration specific to the app module.

### Step 5: Run Your App

1. **Connect a Device:**
   - **Physical Device:** Enable USB debugging on your device and connect it via USB.
   - **Emulator:** Use the AVD Manager to start the emulator.

2. **Run the App:**
   - Click the `Run` button (green play icon) in Android Studio.
   - Select your deployment target (either a connected device or an emulator).
   - Android Studio will build the project and launch the app on the selected device.

