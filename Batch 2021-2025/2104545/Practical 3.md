## PRACTICAL 3. To study various XML Files needed for interface design
#### In Android User Interface (UI) design, XML (Extensible Markup Language) files are crucial for defining the layout and appearance of the app's user interface. Here's an explanation of the various XML files you might encounter:

### 1. *Layout XML Files (activity_main.xml, fragment_example.xml)*
   - Purpose: These files define the structure and layout of UI components (like buttons, text fields, and images) on the screen.
   - Components:
     - *ViewGroups:* Containers like LinearLayout, RelativeLayout, ConstraintLayout, etc., that define how child views are arranged.
     - *Views:* Individual UI elements like Button, TextView, ImageView, etc.

### 2. *Resource XML Files*
   - Drawable XML Files (drawable/icon.xml, drawable/background.xml)
     - *Purpose:* Used to define custom shapes, gradients, and states for UI elements. They can be used to create drawable resources like icons or backgrounds.
     - *Components:*
       - <shape>: Defines the shape and appearance of the drawable.
       - <selector>: Used to create state-based drawables (e.g., changing the button color when pressed).
   - *Values XML Files (values/strings.xml, values/colors.xml, values/styles.xml)*
     - Purpose: Store common values used across the app, such as strings, colors, and styles.
     - Components:
       - <string>: Defines text strings.
       - <color>: Defines color resources.
       - <style>: Defines a collection of attributes for consistent UI design.

### 3. *Manifest XML File (AndroidManifest.xml)*
   - Purpose: Describes essential information about the app, including its components, permissions, and hardware features.
   - Components:
     - <activity>: Declares an activity in the app.
     - <permission>: Specifies permissions required by the app.
     - <intent-filter>: Defines how an activity responds to different intents.

### 4. *Menu XML Files (menu/menu_main.xml)*
   - Purpose: Define the structure of menus in the app, such as options menus, context menus, or popup menus.
   - Components:
     - <menu>: The root element that can contain multiple <item> elements.
     - <item>: Represents individual menu items with attributes like title, icon, and id.

### 5. *Navigation XML Files (navigation/nav_graph.xml)*
   - Purpose: Used to define navigation flow within an app using the Navigation component.
   - Components:
     - <navigation>: The root element that defines the navigation graph.
     - <fragment>: Represents individual fragments and their navigation actions.

### 6. *Animator XML Files (animator/fade_in.xml, animator/slide_out.xml)*
   - Purpose: Define animations for UI transitions or interactions.
   - Components:
     - <objectAnimator>: Defines property animations for views.

### 7. *Layout XML Files for Different Configurations (layout/activity_main.xml, layout-land/activity_main.xml)*
   - Purpose: Define different layouts for different screen sizes or orientations (e.g., portrait vs. landscape).
   - Components: Similar to standard layout files but tailored for specific configurations.
