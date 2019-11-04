# Practical 3 :To study various XML files needed for interface design.

**1.1 Introduction**
Android is a widely used OS made for smart phones and tablets. It is an open source project led by Google and it is released under
Apache License. This permissive license helped this OS to be widely adopted and allows the manufacturers to freely modify and
customize it.

**1.2 Layout overview**
In Android, layouts can be nested so we can use different layouts for different areas of our interface. However, please ve aware
that it is not advisable to create too complex layouts, because this can affect the overall app performance. We can declare a layout
in two ways:
**• Using XML :** In this case, using an XML file we “describe” how our user interface looks like. We define the elements (views
and sub layouts) that appear in the user interface. 
**• At runtime :**  In this case, we code our layout instantiating our ViewGroup and attaching Views to it.

 All ViewGroup have in common two parameters
called width and height that every View must define. We can specify a numeric value or more often we can use two constants:

**• wrap_content** meaning that the dimension of the view will depend on the actual content
**• fill_parent (or match_parent)** meaning that the view has to become as big as its parent holding it.

**Android provides several standard layout managers :**

• Linear Layout
• Table Layout
• Relative Layout
• Frame Layout
• Grid Layout

# **Linear Layout**
This is the simplest Layout manager. This layout disposes its children vertically or horizontally depending on the orientation
parameter. To define this layout in XML, we can use:

![](https://2f3425ed-a-62cb3a1a-s-sites.googlegroups.com/site/pccphetc2016/learn-android-togetger/androidlayout/Screen%20Shot%202559-06-28%20at%2011.12.17%20AM.png?attachauth=ANoY7cqfwseX30FuoqwplH4BKtH6sUBWV4qkhG1OpsPgtDaRrcdEfeHDMb2HTcRG1EVjiMwqRZ3HgB9z8-JNf7ZFWwLwlemOF4xVglNYr3ZF-0_gk5HfS6N0ydbhCYzeq4QxrQ2MIb4q6WrBpGR6MyZyFz9l08GndFk2cAXbtE0CpIwgsBNZlS6QLVDL9woUMuqOVHEqUQ4OfySAmicY4FLYC1tK98fluTIhFXMXPEKvXY3c87Klh5a9W4yc2IWRsBAmsets7gsNYE3nCRDa3MtFpGmyMhKVKAtRCnwPLpBfDaC6sLQDFkE%3D&attredirects=0)

# **Table Layout**
This is layout manager that disposes its children in a table, grouping them in rows and columns. For example, using the layout
shown below, we create two different rows holding two cells.

**CODE**
<TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
   android:layout_width="fill_parent"
   android:layout_height="fill_parent">
   
   <TableRow
      android:layout_width="fill_parent"
      android:layout_height="fill_parent">
		
      <TextView
         android:text="Time"
         android:layout_width="wrap_content"
         android:layout_height="wrap_content"
         android:layout_column="1" />
			
      <TextClock
         android:layout_width="wrap_content"
         android:layout_height="wrap_content"
         android:id="@+id/textClock"
         android:layout_column="2" />
			
   </TableRow>
   
   <TableRow>
	
      <TextView
         android:text="First Name"
         android:layout_width="wrap_content"
         android:layout_height="wrap_content"
         android:layout_column="1" />
			
      <EditText
         android:width="200px"
         android:layout_width="wrap_content"
         android:layout_height="wrap_content" />
   </TableRow>
   
   <TableRow>
	
      <TextView
         android:text="Last Name"
         android:layout_width="wrap_content"
         android:layout_height="wrap_content"
         android:layout_column="1" />
			
      <EditText
         android:width="100px"
         android:layout_width="wrap_content"
         android:layout_height="wrap_content" />
   </TableRow>
   
   <TableRow
      android:layout_width="fill_parent"
      android:layout_height="fill_parent">
		
      <RatingBar
         android:layout_width="wrap_content"
         android:layout_height="wrap_content"
         android:id="@+id/ratingBar"
         android:layout_column="2" />
   </TableRow>
   
   <TableRow
      android:layout_width="fill_parent"
      android:layout_height="fill_parent"/>
		
   <TableRow
      android:layout_width="fill_parent"
      android:layout_height="fill_parent">
		
      <Button
         android:layout_width="wrap_content"
         android:layout_height="wrap_content"
         android:text="Submit"
         android:id="@+id/button"
         android:layout_column="2" />
   </TableRow>

</TableLayout>

**Example :**

![](http://www.informit.com/content/images/rcex03_9780672336287/elementLinks/th03fig14.jpg)

# **Relative Layout**
There are attributes that control the
position of the View respect to other Views:
**• layout_toLeftof:** the right edge position of this View is to the left of a specific View
**• layout_toRightof:** the left edge position of this View is to the right of a specific View
**• layout_below:** the top edge of this view is below to a specific View
**• layout_above:** the bottom edge of this view is above to a specific View.

![](http://android4beginners.com/wp-content/uploads/2013/06/android_studio_text_tab_hello_world.png)

# **Frame Layout**
FrameLayout is a special layout that we will cover in more detail later. We saw different layout manager that implements
some specific strategies to place views on the UI. FrameLayout is used when we want to display dynamically a view. It is
very useful when we use Fragments.

![](https://miro.medium.com/max/1938/1*CseKKGw2NUw0ubLhcP_sAQ.png)

# **Grid Layout**
This layout manager disposed its views in a grid form, but respect to the TableLayout it is easier to use.
GridLayout divides the screen area into cells. Its children occupy one or more cells.

![](https://i.stack.imgur.com/p4gVs.jpg)








