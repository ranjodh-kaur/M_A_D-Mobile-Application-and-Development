**Practical 8 :** To implement concept of permission and perform request for permission to access different hardware components of mobile. 

**Permissions :** The purpose of a permission is to protect the privacy of an Android user. Android apps must request permission to access sensitive user data (such as contacts and SMS), as well as certain system features (such as camera and internet). Depending on the feature, the system might grant the permission automatically or might prompt the user to approve the request. 

**Permission approval :** An app must publicize the permissions it requires by including <uses-permission> tags in the app manifest. For example, an app that needs to access location would have this line in the manifest: 
    
**Example:**    <manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.example.harpreet_singh.hardwarepermission2">

    <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />

    <application ...>
        ...
    </application>
</manifest>


**Code:** 

class MainActivity : AppCompatActivity()
{



    val STORAGE_CODE = 1
    val GPS_CODE = 2
    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray)
    {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)



        if (requestCode == STORAGE_CODE)
        {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)
            {
                Toast.makeText(this,"Storage Permission Granted",Toast.LENGTH_SHORT).show()
            }
        }

        if (requestCode == GPS_CODE)
        {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)
            {
                Toast.makeText(this,"GPS Permission Granted",Toast.LENGTH_SHORT).show()
            }
        }


    }

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            storageBtn.setOnClickListener { checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE,STORAGE_CODE) }

            gpsBtn.setOnClickListener { checkPermission(Manifest.permission.ACCESS_COARSE_LOCATION,GPS_CODE) }

        }

    fun checkPermission(permission:String,requestCode: Int)
    {
        if (ContextCompat.checkSelfPermission(this, permission) == PackageManager.PERMISSION_DENIED)
        {
            ActivityCompat.requestPermissions(this, arrayOf(permission),requestCode)
        }else {
            Toast.makeText(this,"Permission already granted",Toast.LENGTH_SHORT).show()
        }
    }
    
**Output 1 :** 
        <br>![Hills](https://raw.githubusercontent.com/harpreetayali/standstorm/master/Screenshot_1574140565.png )
    
   **Output 2 :** 
    
<br>![Hills](https://raw.githubusercontent.com/harpreetayali/standstorm/master/Screenshot_1574140575.png)
    
    