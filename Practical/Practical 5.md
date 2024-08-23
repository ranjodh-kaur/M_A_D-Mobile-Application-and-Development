                         PRATICAL NO:5 
AIM: To incorporate element of interactivity using Android Fragment and Intent Class. 

# Android Intent: 
It is the message that is passed between components such as activities, content providers, broadcast receivers, services etc.
It is generally used with startActivity() method to invoke activity, broadcast receivers etc.
The LabeledIntent is the subclass of android.content.Intent class.
Android intents are mainly used to:
o	Start the service
o	Launch an activity
o	Display a web page
o	Display a list of contacts
o	Broadcast a message
o	Dial a phone call etc.

Types of Android Intents
 There are two types of intents in android: 

1.	Implicit Intent:
 Implicit Intent doesn't specify the component. In such case, intent provides information of available components provided by the system that is to be invoked.

Code:
<code>
Intent intent=new Intent(Intent.ACTION_VIEW);  
intent.setData(Uri.parse("http://www.javatpoint.com"));  
startActivity(intent);
</code>

OUTPUT:
![implicit intent](https://static.javatpoint.com/images/androidimages/implicitintentoutput2.png)
  ![](https://static.javatpoint.com/images/androidimages/implicitintentoutput3.png)


2) Explicit Intent
Explicit Intent specifies the component. In such case, intent provides the external class to be invoked.
CODE:
<code>
Intent i = new Intent(getApplicationContext(), ActivityTwo.class);  
startActivity(i);  
</code>

OUTPUT: 
  ![](https://static.javatpoint.com/images/androidimages/explicitintentoutput1.png)
  ![](https://static.javatpoint.com/images/androidimages/explicitintentoutput2.png)

# Android Fragments
Android Fragment is the part of activity, it is also known as sub-activity. There can be more than one fragment in an activity. Fragments represent multiple screen inside one activity.
Android fragment lifecycle is affected by activity lifecycle because fragments are included in activity.
Each fragment has its own life cycle methods that is affected by activity life cycle because fragments are embedded in activity.
 ![](https://static.javatpoint.com/images/androidimages/fragment.png)
