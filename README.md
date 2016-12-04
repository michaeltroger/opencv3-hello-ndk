# OpenCV 3.1 NDK Starter Project for Android Studio 2

OpenCV 3 Hello NDK is a simple sample application in which the OpenCV 3 API is accessed via native C++ code. 
Unlike most other starter projects, this configuration doesn't need any absolute paths to be set for compiling and is therefore quite flexible.

- Tested with Android Studio 2.2.2.
- The OpenCV 3.1 C++ library is included

Other OpenCV versions:
- The configuration works also for OpenCV 3.0 - just exchange the library's files in the distribution folder.
- For using OpenCV 2.4.11 only a few additional things have to be changed:
  - exchange the library's files in the distribution folder
  - change in the app's build.gradle `abiFilters 'x86', 'x86_64', 'armeabi', 'armeabi-v7a', 'arm64-v8a'` to `abiFilters 'x86', 'armeabi', 'armeabi-v7a'`
  - change `libopencv_java3.so` to `libopencv_java.so` in the CMakeLists.txt
  - change `System.loadLibrary("opencv_java3");` to `System.loadLibrary("opencv_java");` in the MyActivity

Credits:
This code builds on code from the Android Open Source Project:
https://github.com/googlesamples/android-ndk/tree/master/hello-libs
