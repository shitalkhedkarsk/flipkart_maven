Flipkart Selenium + TestNG Framework

Structure:
src/test/java/base/BaseTest.java
src/test/java/pages/FlipkartPage.java
src/test/java/tests/CameraLensTest.java
testng.xml

How to run:
1. Import this folder as a Java/Maven project in Eclipse or IntelliJ.
2. Add Selenium Java and TestNG dependencies to the project.
3. Run testng.xml as TestNG Suite.

Note:
Flipkart changes its UI/locators frequently. If an element is not found,
inspect the current Flipkart page and update the XPath in FlipkartPage.java.

The current program counts all <img> elements after navigating to Camera Lens.
