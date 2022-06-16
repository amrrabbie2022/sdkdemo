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
	
	 var c:CustomToast= CustomToast()
                c.showCustomDialog(this,title,body)
	
	and do not forget to add this code to your project activity
	
	import io.qashi.sdkdemo.CustomToast
