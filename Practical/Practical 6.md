# Practical 6: Develop an application for connecting to the internet and sending email. 

## XML Code: 
### Activity_main.xml

    <?xml version="1.0" encoding="utf-8"?> <RelativeLayout xmlns:
    android="http://schemas.android.com/apk/res/android" 
    xmlns:app="http://schemas.android.com/apk/res-auto" xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent" android:layout_height="match_parent" 
    tools:context="ty.practical6.MainActivity">
    <Button android:id="@+id/btnSendEmail" android:layout_width="wrap_content" 
    android:layout_height="wrap_content"           
    android:layout_marginTop="92dp" android:onClick="sendEmail" android:text="Compose Email
    android:layout_alignTop="@+id/txtMessage" android:layout_centerHorizontal="true" />
     <EditText android:id="@+id/txtMessage" android:layout_width="wrap_content"
     android:layout_height="wrap_content" android:ems="10" android:hint="Message" 
     android:inputType="textMultiLine" android:singleLine="true"                         
     android:layout_marginTop="48dp" android:layout_below="@+id/txtSubject"
     android:layout_centerHorizontal="true" />

    <EditText android:id="@+id/txtEmailTo" android:layout_width="wrap_content"
    android:layout_height="wrap_content" android:ems="10" android:hint="To"
    android:inputType="textEmailAddress" android:layout_marginTop="22dp"
    android:layout_alignParentTop="true" android:layout_alignStart="@+id/txtSubject" />

    <EditText android:id="@+id/txtSubject" android:layout_width="wrap_content" 
    android:layout_height="wrap_content" android:layout_alignStart="@+id/txtMessage"
    android:layout_below="@+id/txtEmailTo" android:layout_marginTop="43dp" android:ems="10"
    android:hint="Subject" android:inputType="text" /> 
    </RelativeLayout>


## Source Code: 
### MainActivity.java

    package ty.practical6; 
    import android.content.Intent; 
    import android.net.Uri; 
    import android.os.Bundle; 
    import android.support.v7.app.AppCompatActivity;
    import android.view.View; 
    import android.widget.EditText; 
    import android.widget.Toast;

    public class MainActivity extends AppCompatActivity 
    { @Override 
    protected void onCreate(Bundle savedInstanceState) 
    { 
    super.onCreate(savedInstanceState); 
    setContentView(R.layout.activity_main); 
    }
    public void sendEmail(View v) {
    EditText txtEmailTo = (EditText) findViewById(R.id.txtEmailTo); 
    EditText txtSubject = (EditText) findViewById(R.id.txtSubject); 
    EditText txtMessage = (EditText) findViewById(R.id.txtMessage);
    
    String[] TO = {txtEmailTo.getText().toString()}; 
    String[] CC = {""}; 
    String subject = txtSubject.getText().toString();
    String msg = txtMessage.getText().toString();

    Intent emailIntent = new Intent(Intent.ACTION_SEND);
    
    emailIntent.setData(Uri.parse("mailto:")); 
    emailIntent.setType("text/plain"); 
    emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);

    emailIntent.putExtra(Intent.EXTRA_CC, CC); 
    emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject); 
    emailIntent.putExtra(Intent.EXTRA_TEXT, msg);

    try 
    { 
    startActivity(Intent.createChooser(emailIntent, "Send mail...")); 
    finish(); 
    }
    catch (android.content.ActivityNotFoundException ex) 
       { 
    Toast.makeText(MainActivity.this, "No email client app installed.", Toast.LENGTH_SHORT).show(); 
    }
    } 
    }
    
On clicking COMPOSE EMAIL button a list of apps will be displayed select a relevant email client app e.g. Gmail and the contents given as input here will be passed to Gmail app’s email compose screen.

# Output:
<p align="center">
<img src="https://github.com/saksham148/M_A_D/blob/master/o6.PNG?raw=true" />
</p>



