# Practical 2: Android Development Environment: To setup Android studio2 and study its basic components.

**1. Install Android Studio**

**System Requirements:**

- Windows: 64-bit version of Windows 8.1 or later
- macOS: macOS High Sierra (10.13) or later
- Linux: GNOME or KDE desktop

**Download and Install:**

- Go to the Android Studio download page.
- Click on the "Download Android Studio" button.
- Follow the installation instructions specific to your operating system.

  - **Windows:**

- Launch the .exe file you downloaded.
- Follow the setup wizard to install Android Studio and the Android SDK.

  - **macOS:**

- Open the .dmg file you downloaded.
- Drag and drop Android Studio into the Applications folder.
- Open Android Studio from the Applications folder and follow the setup wizard.

  - **Linux:**

- Extract the .tar.gz file you downloaded.
- Open a terminal and navigate to the extracted directory.
- Run studio.sh using ./studio.sh command.

**2. Setting Up Android Studio**

- Start Android Studio: Open Android Studio and follow the setup wizard.
- Install SDK Components: Android Studio will prompt you to install the Android SDK, which is essential for building and testing your apps.
- Configure Emulator: Install an Android Virtual Device (AVD) for running and testing your apps if you don't have a physical device.

**3. Basic Components of Android Studio**

  - **1. Welcome Screen:**

    - Quick Start: Create a new project, open an existing one, or check out a project from version control.
    - Recent Projects: Quickly access your recent projects.

  - **2. Project Structure:**

    - Project View: Displays the files and directories of your project.
    - Android View: A simplified view focused on the files and directories relevant to Android development.

  - **3. Editor Window:**

    - Main area where you write your code.
    - Tabs for different files.
    - Split view to work on multiple files simultaneously.

  - **4. Tool Windows:**

    - Project: Navigate your project files.
    - Logcat: View log messages from your app.
    - Build: Monitor the build process and view build results.
    - Terminal: Access a built-in terminal for running command-line tools.

  - **5. Toolbar:**

    - Run/Debug: Buttons to run or debug your app.
    - AVD Manager: Manage your virtual devices.
    - SDK Manager: Manage your SDK components.

  - **6. Code Editor:**

    - Syntax Highlighting: Different colors for different types of code.
    - Code Completion: Suggestions to complete your code.
    - Linting: Warnings and errors in your code.
    - Refactoring Tools: Easily rename variables, extract methods, and more.

  - **7. Layout Editor:**

    - Design View: Visual representation of your app's layout.
    - Text View: XML code for your layout.
    - Palette: Drag and drop UI components.
    - Component Tree: Hierarchical view of your layout.

**4. Creating a Simple Project**

**Start a New Project:**
  - Click "Start a new Android Studio project" from the welcome screen.
  - Choose a template (e.g., Empty Activity).
  - Configure your project name, package name, save location, language (Java/Kotlin), and minimum SDK.

**Explore the Project Structure:**

 - Open the app folder to see the java (source code) and res (resources) directories.

**Run Your App:**

  - Click the green "Run" button in the toolbar.
  - Select a device (emulator or connected device).
  - Your app will build and run on the selected device.

**5. Studying the Components**
  - Activities: Java or Kotlin classes that represent a single screen.
  - Layouts: XML files that define the UI of an activity.
  - Resources: Images, strings, colors, etc., used in your app.
  - Manifests: Configuration file for app settings and permissions.
