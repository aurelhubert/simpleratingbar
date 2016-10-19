
# SimpleRatingBar
A very simple Rating Bar for Android (minSdkVersion=16).

## Demo
<img src="https://raw.githubusercontent.com/aurelhubert/simpleratingbar/master/demo.gif" width="335" height="78" />

## Features
* Set your default & selected drawable
* Manage the rating count
* Manage the drawable size & padding
* Listener event when the value changed (between 0 & max)

## How to?

### Gradle
```groovy
dependencies {
    compile 'com.aurelhubert:simpleratingbar:0.1.2'
}
```
### XML
```xml
<com.aurelhubert.simpleratingbar.SimpleRatingBar
        android:id="@+id/simple_rating_bar"
        android:layout_width="220dp"
        android:layout_height="60dp"
        android:layout_margin="16dp"
        app:drawablePadding="4dp"
        app:maxRating="8"
        app:rating="4"/>
```

### Activity/Fragment
```java
...
simpleRatingBar.setListener(new SimpleRatingBar.SimpleRatingBarListener() {
	@Override
	public void onValueChanged(int value) {
		Log.d(TAG, "onValueChanged: " + value);
	}
});

```

## Contributions
Feel free to create issues / pull requests.

## License
```
SimpleRatingBar library for Android
Copyright (c) 2016 Aurelien Hubert (http://github.com/aurelhubert).

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
