**PRACTICAL:1**

**To study design aspects of development environment like Android, iOS.**

_ANDROID STUDIO_

Android is an open source and Linux-based Operating System for mobile devices such as smartphones and tablet computers. Android was developed by the *Open Handset Alliance*, led by Google, and other companies. 

![Screenshot of the Android Stuido app, displaying a new projects source code.](https://github.com/bhav1/M_A_D/blob/master/bhav1.jpg)

**ANDROID STUDIO**

To start coding an Android App, you need an Android development environment. Android Studio is an IDE dedicated to creating and maintaining Android apps Fortunately, Alex did a great job explaining the ins and outs of how it works. As a designer, you’re going to want to get comfortable working in the following files:

**colors.xml**

Much like Sass variables or CSS Custom Properties, you’re going to want to abstract as much of your code as possible. Regardless of coding language or medium, this kind of practice helps keep your code consistent, flexible, and easy to maintain.

In Android, colors.xml is used to specify all your app’s color values. For example, a color called sunset would described like this: #FA5A41.

After turning their palette into something Android-friendly, we can now use it in the various pieces that make up the app. Access the contents of _colors.xml_ by first typing _@color/_, then the color’s name:

<View>

 android:id="@+id/background"

android:background="@color/grayLight"

<!-- Other  view  code -->

/>

**dimens.xml**

We want to abstract our measurements, much like with our color values. In Android, _dimens.xml_ is where we place that code.

Density-independent pixels

Android has a unit called density-independent pixels (_dp_). It’s a technical solution that plays to the strengths of their many devices having different display sizes and densities. Unlike declaring a regular static pixel value, a device pixel declaration tells the Android operating system to draw the pixels making up a UI proportionately based on a device’s reported display properties.


**Scale-independent pixels**

Scale-independent pixels (_sp_) are much like density-independent pixels, only they are used for type. The main difference is that they scale along with a user’s font size preference. This is great for helping to make your app accessible for those who benefit from a larger type size.

**Abstraction**

The client’s design system used a suite of standardized spacing values (10px, 20px, 30px, etc.). Since Sketch pixels don’t directly translate to Android density-independent pixels, the trick is to abstract these Sketch measurements and codify them as a series of distances:

<dimen name="spacing_tiny">2dp</dimen>

<dimen name="spacing_smallest">4dp</dimen>

<dimen name="spacing_smaller">8dp</dimen>

<dimen name="spacing_small">10dp</dimen>

<dimen name="spacing_medium">12dp</dimen>


**Start from the top**

There’s a trick in web design where you consistently apply spacing to only the top or bottom of all your interface elements. The idea is it makes a consistent appearance easier, as you don’t have to constantly undo and redo your margin declarations and wreck the cascade. Personally, I prefer applying spacing from the top, as an infinite vertically-scrolling canvas means there’s always going to be more room below.

**styles.xml**

Styling components in Android is a highly declarative process. There isn’t a real cascade, like what you’d get with CSS, meaning that you’re going to spend a lot of time re-describing things like color and fonts between different interface components.

<style name="InputLabel" parent="Label">

 <item name="android:fontFamily">@font/lato_bold</item>

<item name="android:textColor"> @color/sunset</item>

<item name="android:textAllCaps">true</item>

<item name="android:textSize">18sp</item>

</style>

This collection of styling instructions can then be via a declaration of _style_:

<TextView
android:id="@+id/labelName"
android:layout_marginTop="@dimen/spacing_small"
style="@style/InputLabel"
<!--Other view code-->
/>

**strings.xml**

strings.xml is used to contain the content of your app. If you’re picking up on a pattern here, it’s that this is yet another centralizing file that controls things. Strings are declared in a fashion similar to colors and measurement: Login as an admin.

They are declared by typing _android:text=""_, then _@string/_ inside the double quotes, then the string’s name:

<Button

android:id="@+id/button_login_as_admin"

android:layout_marginTop="@dimen/spacing_largest"

android:text="@string/login_as_admin"

style="@style/ButtonPrimary

<!--Other view code -->

/>

**Commenting and prefixing**

Keeping your app code organized helps you quickly locate things and avoid writing duplicate code. This is especially important as the scope of your app grows.

As more code is added to the repo, what we can do is liberally apply comments to help break up the walls of code. I personally like to use multiline comments to separate the larger sections, to more quickly identify what’s what when scrolling through the page.

**Get a phone**

Sketch and Android Studio can’t directly communicate, meaning that there’s the opportunity for drift to occur between your design files and the actual implementation. Android studio has two tools to help combat this: a Design view and a virtual device emulator.

Design view and emulated Android devices 

The Design view gives you an in-pane preview of the code you’re writing for a specific view. It’s good for a quick check, to see if the layout you coded appears properly. However, I’ve found that when it comes to reviewing fine details, Android Studio simply can’t hack it. 

**Physical hardware**

As the saying goes, nothing beats the real thing. On a decent computer, the build time for compiling to an emulator or a physical device was basically the same.

**Wrapping up**

The client met their deadline, and thanks to Alex’s help, I got to learn some new skills. Excellent all around! If you’re a designer finding yourself undertaking a similar challenge, hopefully this advice can help you out as well.

 

**IOS**

IOS is a mobile operating system for Apple-manufactured devices. iOS runs on the iPhone, iPad, iPod Touch and Apple TV.IOS is best known for serving as the underlying software that allows iPhone users to interact with their phones using gestures such as swiping, tapping and pinching. These finger actions are typically performed on multitouch capacitive touch screen displays, which provide fast response and accept inputs from multiple fingers.

![Related image](https://github.com/bhav1/M_A_D/blob/master/bhav2.jpg)

**The iPhone X safe area**

The iPhone X requires some special attention from designers. The width of the screen is the same as on the iPhone 6, 7 and 8, but it’s also 145pt taller. When designing apps for the iPhone X you have to be aware of the safe zone and layout margins to ensure your app user interface doesn’t get clipped by the device’s sensors or corners.

**Automatically applied effects

App icons assets are generally added to the application package as plain, squared PNG files in various dimensions. When rendered on a device, iOS applies various effects to app icons.

**Rounded Corners**

The old simple radii values for rounded corners are gone. Since iOS 7, app icons have been using the shape of a superellipse. When designing app icons for iOS, I recommend to use the official app icon templates provided by Apple.

**Border stroke (in some situations)**

If the app icon you are using has a white background, a 1 pixel gray border stroke will be applied to make it easier to recognize the edges of the icon. This is only done in the settings app (if your application is listed there) and the AppStore.

**Legacy effects (iOS 6 and previous versions)**

On older iOS versions, these effects are applied automatically: rounded corners (not the same shape as iOS 7+ icons are using), drop shadows on the home screen and a gloss effect that can be disabled.

**Keyboards**

There are various keyboard types available to provide the best possible keyboard for a specific text input. While it is possible to build your own completely custom keyboard, default keyboards cannot be customized in style or size.

 

Grid system![https://ivomynttinen.com/content/3-blog/20150928-ios-design-guidelines/app-icon-grid.jpg](https://github.com/bhav1/M_A_D/blob/master/bhav3.jpg)

Apple developed a golden ratio grid system that can be used to size and align elements on your icon correctly. Nevertheless, even Apple designers are not following the grid system very strictly with the native apps’ icons. Feel free to break the rules if your icon simply works better without aligning all elements strictly to the grid.

**Typography**

The default system font on all iOS versions previous iOS 9 is Helvetica Neue. With the release of iOS 9, Apple introduced a brand new font called San Francisco, which replaced Helvetica Neue as the default font. San Francisco comes in two shapes: „SF UI Display“ and „SF UI Text“, while „Display“ is primarly used for UI components, „Text“ features a wider letter spacing and should be used for longer texts. You can download the San Francisco fonts here if you are a member of Apple’s Developer program. In addition to the default font, many alternative font faces are available to use. You can find a complete list of pre-installed typefaces here.

**Toolbar**

A toolbar contains a set of actions for managing or manipulating the content of the current view. On the iPhone, it will always appear aligned at the bottom edge of the screen, while on the iPad, it can also be displayed aligned at the top of the screen.

Similarly to the navigation bar, the background fill of toolbars can be modified, is translucent and blurs the underlaying content by default.

**Search Bar**

Search bars come in two different styles by default: prominent and minimal. Both versions do have the same functionality.

As long as no text was entered by the user, a placeholder text is shown inside the bar, and, optionally, a bookmarks icon that can be used to access recent or saved searches.

Once a search term is entered, the placeholder disappears, and a clear button to delete the entered value appears on the right edge.

**Table View**

Table views are used to display small to large amounts of list style information in a single or multiple columns and with the option to divide several rows into separate sections or to group them.

There are two basic table view types that should be used, depending on the type of data you are presenting.

**Alerts**

The purpose of alerts is to inform the user about critical information and optionally to force the user to make a decision about some action.

An alert view does always contain a title text, which should not be longer than one line and one (for pure informational alerts, e.g., „OK“) or two (for alerts that require a decision, e.g., „Send“ and „Cancel“) buttons.

**Modals**

Modals are a useful view for tasks that require multiple commands or inputs by the user. They appear on top of everything else, and, while open, block interaction with any other interactive elements underneath.

The typical modal usually provides:

a title to describe the task;

a button to close the modal without saving or performing any other actions;

a button to save or submit any entered information
