# Simple-Calculator-App-Automation_Appium


## Technology: </br>
- Tool: Selenium Webdriver
- IDE: Intellij, Android Studio
- Build tool: Gradle
- Language: Java
- Test_Runner: Appium

## Prerequisites</br>
- Install Android Studio latest version
- Install Appium 1.22.3
- Install jdk 11 or any LTS version
- Configure **ANDROID_HOME**, **JAVA_HOME** and **GRADLE_HOME**
- Stable internet connection

## Scenario
Automate any series for calculator app. Pass the series as a parameter to test method.  
For an example:  

100/10*5-10+60  
or  
50+10-20*2+10/2  

pseudocode for test function can be look like:  

public void doSeries(){  
calcuateSeries("100/10*5-10+60");  
}  

## How to run this project:
- Clone this project
- Open Android Studio and Open the APK file
- Hit this command in cmd for checking the connectivity of device : adb devices
- Open Appium Server with this command:  
  ```Appium```  
- Open Appium Inspector
- Set desired capabilites:  
  {  
    "platformName": "Android",  
    "appium:platformVersion": "14",  
    "appium:appPackage": "com.google.android.calculator",  
    "appium:appActivity": "com.android.calculator2.Calculator",  
    "appium:app": "F:\\Apk\\calculator.apk"  
  }  
- Open Intellij Idea
- Hit this command into the terminal:  
  ```gradle clean test```  
- To generating Allure Report hit these these commands:  
  ```allure generate allure-results --clean -output``` and     
  ```allure serve allure-results```

## Allure Report
https://drive.google.com/file/d/1kjGPzGuLQemvTouRxRTPfoaHW1oESTzO/view?usp=drive_link
https://drive.google.com/file/d/1XDZbDfbaq0gByfNA8Le-fEiumMSSlfJe/view?usp=drive_link

## Automation Output Video
https://drive.google.com/file/d/1vdNo8zKze1mD8ig-SgMOS-hsqKaHaKgh/view?usp=drive_link
