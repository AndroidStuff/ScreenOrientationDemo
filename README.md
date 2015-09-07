## Screen Orientation
  - There are two possible orientations - Portrait and Landscape
  - In order to prevent android from changing orientation from one to other in accordance to the holding of the device, 
	we need to add the following attribute/value to the <activity> tag:
	``` android:screenOrientation="portrait" ```
	This way you make the orientation of your app fixed. This however is not the recommended practice.
  -	The Hacky Way to achieve the change in screen orientation is as below:
		
		1. Add ``` android:configChanges="orientation|screenSize|keyboardHidden" ``` attribute to the <activity> tag
		2. Override onConfigurationChanged() method in the corresponding Activity class
  - When we change the screen orientation the activity is destroyed and re-created again in another orientation.
    To retain the state, we save the state values onSaveInstanceState() after the onPause() using Bundle,
    so that these state values can be restored onRestoreInstanceState() upon onCreate().
  - Form data is not erased during orientation change. There is no need to write code to save the view data, they are by default restored back.
    You'll have to take care of instance VARIABLES that carry the state of the application/activity by writing code to preserve and restore it.
  - Better way to handle user change in Screen Orientation is:

    1. Save state in ```bundle``` in the onSaveInstanceState(..)
    2. Restore state in onCreate(..), getting the values back from ```bundle```