# Practical 3 :To study various XML files needed for interface design.

XML stands for Extensible Markup Language. XML is a markup language much like HTML used to describe data.  XML tags are not predefined in XML. We must define our own Tags. Xml as itself is well readable both by human and machine. Also, it is scalable and simple to develop. In Android we use xml for designing our layouts because xml is lightweight language so it doesn’t make our layout heavy.
![](https://abhiandroid-8fb4.kxcdn.com/ui/wp-content/uploads/2016/06/Basic-UI-user-interface-ViewGroup-and-View-Diagram.jpg)
<code>
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
 android:orientation="vertical" android:layout_width="match_parent"
 android:layout_height="match_parent">


 <Button
 android:id="@+id/buton1"
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:text="Button"/>

 <TextView
 android:id="@+id/textView1"
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:text="sample Text"
 android:layout_marginTop="15dp"
 android:textSize="30dp"/>

 <RelativeLayout
 android:layout_width="match_parent"
 android:layout_height="match_parent">

 <EditText
 android:id="@+id/editTextName"
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:hint="First Name"
 />

 <EditText
 android:id="@+id/editTextLastName"
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:hint="Last Name"/>

 </RelativeLayout>
</LinearLayout>
</code>

![](https://abhiandroid-8fb4.kxcdn.com/ui/wp-content/uploads/2016/06/XML-UI-in-Android-with-example.jpg)

# Different XML Files Used in Android:


### Layout XML Files: Layout xml files:
are used to define the actual UI(User interface) of our application. It holds all the elements(views) or the tools that we want to use in our application. Like the TextView’s, Button’s and other UI elements.

![](https://abhiandroid-8fb4.kxcdn.com/ui/wp-content/uploads/2016/06/Layout-XML-in-Android-Studio.jpg)

### Manifest xml File(Mainfest.xml): 
This xml is used to define all the components of our application. It includes the names of our application packages, our Activities, receivers, services  and the permissions that our application needs. For Example – Suppose we need to use internet in our app then we need to define Internet permission in this file.

![](https://abhiandroid-8fb4.kxcdn.com/ui/wp-content/uploads/2016/06/AndroidManifest-xml-location-in-Android-Studio.jpg)

### Strings xml File(strings.xml):
This xml file is used to replace the Hard-coded strings with a single string. We define all the strings in this xml file and then access them in our app(Activity or in  Layout XML files) from this file. This file enhance the reusability of the code.
![](https://abhiandroid-8fb4.kxcdn.com/ui/wp-content/uploads/2016/06/strings-xml-location-android-studio.jpg)

### Styles xml File(styles.xml): 
This xml is used to define different styles and looks for the UI(User Interface) of application. We define our custom themes and styles in this file.

![](https://abhiandroid-8fb4.kxcdn.com/ui/wp-content/uploads/2016/06/styles-location-xml-Android-Studio-1.jpg)

### Color xml File (colors.xml): 
This file is used to define the color codes that we used in our app. We simply define the color’s in this file and used them in our app from this file.
![](https://abhiandroid-8fb4.kxcdn.com/ui/wp-content/uploads/2016/06/colors-xml-location-Android-Studio.jpg)


