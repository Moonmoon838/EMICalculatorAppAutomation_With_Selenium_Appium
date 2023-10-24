# EMI Calculator App Automation With Selenium and Appium
### This EMI Calculator App is a simple tool that allows users to calculate their Equated Monthly Installments (EMI) for loans with different parameters. It takes into account factors like loan amount, interest rate, period, and the processing fee to provide accurate EMI results. The app has been automated with Selenium Webdriver and Appium.
## Tools and Technology Used
- IntelliJ IDEA
- Selenium Webdriver
- Appium
- Appium Inspector
- Android Studio
- TestNG Framework
- Java
- Gradle
- Allure

## Prerequisites
- JDK
- Gradle
- Appium

## How to run this project
- Clone this repository
- Give the following command for checking the connectivity with the emulator: adb devices
- Open Appium Server with the following command: appium
- Open Appium Inspector
- Set the following desired capabilities in JSON format & click Start Session:
  ![emi calc json](https://github.com/Moonmoon838/EMICalculatorAppAutomation_With_Selenium_Appium/assets/143262452/31524c73-ab19-4016-bc51-11dd4b03e2ab)
  
- Open build.gradle file as a project with IntelliJ IDEA
- Open terminal
- Give this following command: gradle clean test
- For generating Allure Report use these commands: allure generate allure-results --clean -output &
  allure serve allure-results

## Allure Report
![EMI Allure report](https://github.com/Moonmoon838/EMICalculatorAppAutomation_With_Selenium_Appium/assets/143262452/0a18a653-42e9-498c-8731-5635e81fdb8c)

![EMI Allure report2](https://github.com/Moonmoon838/EMICalculatorAppAutomation_With_Selenium_Appium/assets/143262452/51537a6a-6f8c-4fe1-8221-6d54429c1b79)

## Output Video
https://github.com/Moonmoon838/EMICalculatorAppAutomation_With_Selenium_Appium/assets/143262452/119e667b-1dc3-40c7-b993-35e17ce49ca7
