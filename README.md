# Appium_Basic_Calculator_Automation
### A basic calculator app is automated by testing its basic functionalites using Appium on an emulated device powered by Android Studio.
Here the following tasks are done:
- A basic Calculator app extracted from [Calculator App](https://play.google.com/store/apps/details?id=com.google.android.calculator) is automated by extracting its apk.
- Basic operations like add,subtract,multiplication and divide functionality is checked whether it is giving correct result or not using Appium.

### Technology: </br>
- Tool: Selenium Webdriver
- IDE: Intellij, Android Studio
- Build tool: Gradle
- Language: Java
- Test_Runner: Appium

### Prerequisites</br>
- Install Android Studio latest version
- Install Appium 1.17.1
- Install jdk 8 or any LTS version
- Configure **ANDROID_HOME**, **JAVA_HOME** and **GRADLE_HOME**
- Stable internet connection

### Project Run

#### Appium
- Turn on **Developer Options** on your android phone
- Connect your android phone with USB cable/ Create an emulated virtual device via Android Studio and run it.
- Open cmd and give ```adb devices``` command to get uuid.
- Open Appium and start server. Then open inspector tool.
- In the **JSON Representation** section, paste the following desired capabilities after adding your uuid and version:

```
  "deviceName": "My Device",
  "platformName": "Android",
  "uuid": Enter your uuid here,
  "platformVersion": Enter your android version,
  "appPackage": "com.google.android.calculator",
  "appActivity": "com.android.calculator2.Calculator"

```
- Click **Start Server**.

#### Java IDE

- Clone the repo.
- Enter the uuid in the [Setup Class](https://github.com/NibrazKhan/Appium_Basic_Calculator_Automation/blob/main/src/test/java/Base/Setup.java)

#### Run the Automation Script by the following command:
 ```
 gradle clean test 
 ```
- The following report is generated:
![report](https://user-images.githubusercontent.com/55280106/186763326-6264457c-a8c3-490a-8951-47b17badccb5.png)

- After automation to view allure report , give the following commands:
 ```
allure generate allure-results --clean -o allure-report
allure serve allure-results
 ```
**Here is the Allure report overview:**

![Allure_report_Overview](https://user-images.githubusercontent.com/55280106/186886614-66fc174a-b049-431b-be17-03c166d902fe.png)

**Below the suites run are shown via Allure :**

![allure_report_suites](https://user-images.githubusercontent.com/55280106/186886659-ade87d2a-ef77-44cc-a541-50a8c669a7a0.png)

**Screenshot of the overall project run in appium**

![appium interface screenshot](https://user-images.githubusercontent.com/55280106/186886682-e71db3b6-1110-480b-bccc-c7fed0eb02e3.png)

- Watch the Project video and test run:

https://user-images.githubusercontent.com/55280106/186763386-348819af-7857-4b2c-8418-fbb9d5ac5da1.mov

