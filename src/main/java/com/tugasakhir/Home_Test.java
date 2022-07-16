package com.tugasakhir;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.AfterElement;
import org.graphwalker.java.annotation.AfterExecution;
import org.graphwalker.java.annotation.BeforeExecution;
import org.graphwalker.java.annotation.Edge;
import org.graphwalker.java.annotation.GraphWalker;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.MobileBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Implements the GraphWalker model: src/main/resources/SmallTest.json
 * <p/>
 * The interface SmallTest, that SomeSmallTest implements, is generated by
 * running: mvn graphwalker:generate-sources
 * also: mvn compile
 */

// @GraphWalker(value = "a_star(reached_vertex(v_eHAC))", start = "v_Home")
// @GraphWalker(value = "a_star(reached_vertex(v_Vaccine))", start = "v_Home")
@GraphWalker(value = "a_star(reached_vertex(v_Settings))", start = "v_Home")
public class Home_Test extends ExecutionContext implements Home {

  static public AndroidDriver<MobileElement> driver;
  static public WebDriverWait wait;
  String headerXpathItemButton = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout";
  static Dimension dimension;
  static TouchAction touch;
  static int step;

  @AfterElement
  public void count_step() {
    step++;
    System.out.println("====================== STEP " + step + "======================");
  }

  @Override
  public void v_Home() {
    System.out.println("Running: v_NewVertex");
  }

  @Override
  public void v_Vaccine() {
    // TODO Auto-generated method stub

  }

  // @Override
  public void v_Covid19TestResult() {
    // TODO Auto-generated method stub

  }

  @Override
  public void v_eHAC() {
    // TODO Auto-generated method stub

  }

  // @Override
  public void v_TravelRegulations() {

    // TODO Auto-generated method stub

  }

  // @Override
  public void v_Telemedicine() {
    // TODO Auto-generated method stub

  }

  // @Override
  public void v_HealthcareFacility() {
    // TODO Auto-generated method stub

  }

  // @Override
  public void v_Covid19Statistic() {
    // TODO Auto-generated method stub

  }

  // @Override
  public void v_FindHospital() {
    // TODO Auto-generated method stub

  }

  // @Override
  public void v_ScanQRCode() {
    // TODO Auto-generated method stub

  }

  // @Override
  public void v_Notification() {
    // TODO Auto-generated method stub

  }

  @Override
  public void e_Click_Vaccine() {
    // TODO Auto-generated method stub

  }

  // @Override
  public void e_Click_Covid19TestResult() {
    // TODO Auto-generated method stub

  }

  @Override
  public void e_Click_eHAC() {
    // TODO Auto-generated method stub

  }

  // @Override
  public void e_Click_TravelRegulations() {
    // TODO Auto-generated method stub

  }

  // @Override
  public void e_Click_Telemedicine() {
    // TODO Auto-generated method stub

  }

  // @Override
  public void e_Click_HealthcareFacility() {
    // TODO Auto-generated method stub

  }

  // @Override
  public void e_Click_Covid19Statistic() {
    // TODO Auto-generated method stub

  }

  // @Override
  public void e_Click_FindHospital() {
    // TODO Auto-generated method stub

  }

  // @Override
  public void e_Click_ScanQRCode() {
    // TODO Auto-generated method stub

  }

  // @Override
  public void e_Click_Notifications() {
    // TODO Auto-generated method stub

  }

  // @Override
  public void e_Back_FindHospital() {
    // TODO Auto-generated method stub

  }

  // @Override
  public void e_Back_Covid19Statistic() {
    // TODO Auto-generated method stub

  }

  // @Override
  public void e_Back_HealthcareFacility() {
    // TODO Auto-generated method stub

  }

  // @Override
  public void e_Back_Telemedicine() {
    // TODO Auto-generated method stub

  }

  // @Override
  public void e_Back_TravelRegulations() {
    // TODO Auto-generated method stub

  }

  @Override
  public void e_Back_eHAC() {
    // TODO Auto-generated method stub

  }

  // @Override
  public void e_Back_Covid19TestResult() {
    // TODO Auto-generated method stub

  }

  @Override
  public void e_Back_Vaccine() {
    // TODO Auto-generated method stub

  }

  // @Override
  public void e_Back_Notifications() {
    // TODO Auto-generated method stub

  }

  // @Override
  public void e_Back_ScanQRCode() {
    // TODO Auto-generated method stub

  }

  // @Override
  public void e_Back_CheckInPreference() {

  }

  // @Override
  public void e_Click_CheckInPreference() {

  }

  // @Override
  public void v_CheckInPreference() {

  }

  @Override
  public void e_Back_Settings() {

  };

  @Override
  public void v_Settings() {
  };

  @Override
  public void e_Click_Settings() {

  };

  public class configurationDevice {
    // Locations
    // lat -6.402484
    // lang 106.794243

    // gennymotion
    String deviceName = "emulator_device";
    String deviceVersion = "8.1";
    String udid = "192.168.43.107:5555";

    // avd
    // String deviceName = "Pixel_API_26";
    // String deviceVersion = "8.0";
  }

  private class appConfiguration {
    final String appPackage = "com.telkom.tracencare";
    final String activity = "com.telkom.tracencare.ui.MainActivity";
  }

  static public AndroidDriver<MobileElement> getDriver() {
    return driver;
  }

  static public WebDriverWait getWait() {
    return wait;
  }

  static public int getDimensionHeight() {
    return dimension.height;
  }

  static public int getDimensionWidth() {
    return dimension.width;
  }

  static public TouchAction getTouch() {
    return touch;
  }

  static public void clickAnElementByXpath(String xpathText) {

  }

  static public void

      clickAnElementByTextContains(String text) {

  }

  static public void clickAnElementById(String idText) {

  }

  static public void clickAnElementByResourceId(String idText) {

  }

  static public void clickAnElementByAccessbilityId(String accessId) {

  }

  static public void sleepBeforeActivity() {
    // try {

    // Thread.sleep(3000);
    // } catch (InterruptedException e) {
    // // TODO: handle exception
    // }

  }

  @BeforeExecution
  public void setup() {

  }

  @AfterExecution
  public void tearDown() {

    System.out.println("TEST DONE");
    System.out.println("THE TEST HAVE " + step + " STEP");
  }

}
