## Screen Orientation
  - There are two possible orientations - Portrait and Landscape
  - In order to prevent android from changing orientation from one to other in accordance to the holding of the device, 
	we need to add the following attribute/value to the <activity> tag:
	``` android:screenOrientation="portrait" ```
	This way you make the orientation of your app fixed. This however is not the recommended practice.
  -	The Hacky Way to achieve the change in screen orientation is as below:
		
		1. Add ``` android:configChanges="orientation|screenSize|keyboardHidden" ``` attribute to the <activity> tag
		2. Override onConfigurationChanged() method in the corresponding Activity class
