Qashi sdk demo

[![](https://jitpack.io/v/amrrabbie2022/sdkdemo.svg)](https://jitpack.io/#amrrabbie2022/sdkdemo)

this is just simple example to show how to make sdk 


Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.amrrabbie2022:sdkdemo:x.y.z'
	}
	
	
	for using sdk to show custom toast use this code
	
	 val intent = Intent(Intent.ACTION_VIEW)
        intent.component = ComponentName(
            "Your project package name",
            "io.qashi.sdkdemo.ToastActivity"
        )
        startActivity(intent)
	
	and do not forget to add this code to your project mainfest
	
	<activity android:name="io.qashi.sdkdemo.ToastActivity" />
