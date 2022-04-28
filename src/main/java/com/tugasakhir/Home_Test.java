package com.tugasakhir;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.AfterExecution;
import org.graphwalker.java.annotation.BeforeExecution;

import org.graphwalker.java.annotation.GraphWalker;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Implements the GraphWalker model: src/main/resources/SmallTest.json
 * <p/>
 * The interface SmallTest, that SomeSmallTest implements, is generated by
 * running: mvn graphwalker:generate-sources
 * also: mvn compile
 */
@GraphWalker(value = "weighted_random(vertex_coverage(100))", start = "v_Home")
// @GraphWalker(value = "a_star(reached_vertex(v_eHAC))", start = "v_Home")
public class Home_Test extends ExecutionContext implements Home {

  static public AndroidDriver<MobileElement> driver;
  static public WebDriverWait wait;
  String headerXpathItemButton = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout";

  @Override
  public void v_Home() {
    System.out.println("Running: v_NewVertex");
  }

  @Override
  public void v_Vaccine() {
    // TODO Auto-generated method stub

  }

  @Override
  public void v_Covid19TestResult() {
    // TODO Auto-generated method stub

  }

  @Override
  public void v_eHAC() {
    // TODO Auto-generated method stub

  }

  @Override
  public void v_TravelRegulations() {

    // TODO Auto-generated method stub

  }

  @Override
  public void v_Telemedicine() {
    // TODO Auto-generated method stub

  }

  @Override
  public void v_HealthcareFacility() {
    // TODO Auto-generated method stub

  }

  @Override
  public void v_Covid19Statistic() {
    // TODO Auto-generated method stub

  }

  @Override
  public void v_FindHospital() {
    // TODO Auto-generated method stub

  }

  @Override
  public void v_ScanQRCode() {
    // TODO Auto-generated method stub

  }

  @Override
  public void v_Notification() {
    // TODO Auto-generated method stub

  }

  @Override
  public void e_Click_Vaccine() {
    // TODO Auto-generated method stub
    // driver.findElement(By.xpath(
    // headerXpathItemButton + "[1]"))
    // .click();
    
    driver.findElementByAndroidUIAutomator("text(\"COVID-19 Vaccine\")").click();

  }

  @Override
  public void e_Click_Covid19TestResult() {
    // TODO Auto-generated method stub
    driver.findElement(By.xpath(
        headerXpathItemButton + "[2]"))
        .click();
  }

  @Override
  public void e_Click_eHAC() {
    // TODO Auto-generated method stub
    // driver.findElement(By.xpath(
    // headerXpathItemButton + "[3]"))
    // .click();

    driver.findElementByAndroidUIAutomator("text(\"EHAC\")").click();
  }

  @Override
  public void e_Click_TravelRegulations() {
    // TODO Auto-generated method stub
    driver.findElement(By.xpath(
        headerXpathItemButton + "[4]"))
        .click();
  }

  @Override
  public void e_Click_Telemedicine() {
    // TODO Auto-generated method stub
    driver.findElement(By.xpath(
        headerXpathItemButton + "[5]"))
        .click();
  }

  @Override
  public void e_Click_HealthcareFacility() {
    // TODO Auto-generated method stub
    driver.findElement(By.xpath(
        headerXpathItemButton + "[6]"))
        .click();
  }

  @Override
  public void e_Click_Covid19Statistic() {
    // TODO Auto-generated method stub
    driver.findElement(By.xpath(
        headerXpathItemButton + "[7]"))
        .click();
  }

  @Override
  public void e_Click_FindHospital() {
    // TODO Auto-generated method stub

    driver.findElement(By.xpath(
        headerXpathItemButton + "[8]"))
        .click();
  }

  @Override
  public void e_Click_ScanQRCode() {
    // TODO Auto-generated method stub
    String btn_id = "com.telkom.tracencare:id/btn_nav_scan_checkin";
    // String btn_id_agree =
    // "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[8]/android.view.ViewGroup/android.widget.TextView";
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(btn_id)));
    driver.findElement(By.id(btn_id)).click();
    // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(btn_id_agree)));

    // driver.findElement(By.xpath(btn_id_agree)).click();

  }

  @Override
  public void e_Click_Notifications() {
    // TODO Auto-generated method stub
    driver.findElement(By.id("com.telkom.tracencare:id/iv_notification")).click();

  }

  @Override
  public void e_Back_FindHospital() {
    // TODO Auto-generated method stub

    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]")));

    driver.navigate().back();

  }

  @Override
  public void e_Back_Covid19Statistic() {
    // TODO Auto-generated method stub
    driver.findElementByAccessibilityId("Navigate up").click();

  }

  @Override
  public void e_Back_HealthcareFacility() {
    // TODO Auto-generated method stub
    driver.findElementByAccessibilityId("Navigate up").click();

  }

  @Override
  public void e_Back_Telemedicine() {
    // TODO Auto-generated method stub
    driver.findElementByAccessibilityId("Navigate up").click();
  }

  @Override
  public void e_Back_TravelRegulations() {
    // TODO Auto-generated method stub
    String id = "com.telkom.tracencare:id/iv_back";
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
    driver.findElement(By.id(id)).click();
  }

  @Override
  public void e_Back_eHAC() {
    // TODO Auto-generated method stub
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.telkom.tracencare:id/iv_back")));
    driver.findElement(By.id("com.telkom.tracencare:id/iv_back")).click();

  }

  @Override
  public void e_Back_Covid19TestResult() {
    // TODO Auto-generated method stub
    driver.findElement(By.xpath(
        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"))
        .click();

  }

  @Override
  public void e_Back_Vaccine() {
    // TODO Auto-generated method stub
    driver.findElement(By.id("com.telkom.tracencare:id/iv_back")).click();

  }

  @Override
  public void e_Back_Notifications() {
    // TODO Auto-generated method stub
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.telkom.tracencare:id/iv_back")));
    driver.findElement(By.id("com.telkom.tracencare:id/iv_back")).click();

  }

  @Override
  public void e_Back_ScanQRCode() {
    // TODO Auto-generated method stub

    driver.findElement(By.id("com.telkom.tracencare:id/iv_close")).click();
  }

  @Override
  public void e_Back_CheckInPreference() {
    driver.findElementByAccessibilityId("Navigate up").click();
  }

  @Override
  public void e_Click_CheckInPreference() {
    String id = "com.telkom.tracencare:id/btn_nav_scan_settings_checkin";
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
    driver.findElement(By.id(id)).click();
  }

  @Override
  public void v_CheckInPreference() {

  }

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

  static public void clickAnElementByXpath(String linkText) {

    // UiObject settingsButton = mDevice.findObject(new
    // UiSelector().text("Settings"));
    // settingsButton.clickAndWaitForNewWindow();

    try {
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(linkText)));
      driver.findElement(By.xpath(linkText)).click();
    } catch (StaleElementReferenceException e) {
      driver.findElementByAndroidUIAutomator("text(\"back\")").click();
      // TODO: handle exception
    } catch (org.openqa.selenium.TimeoutException e) {
      // TODO: handle exception
      driver.findElement(By.xpath(linkText)).click();
    }

  }

  @BeforeExecution
  public void setup() {
    configurationDevice device = new configurationDevice();
    appConfiguration appConf = new appConfiguration();
    File classpathRoot = new File(System.getProperty("user.dir"));
    File appDir = new File(classpathRoot, "src/main/apk");
    File app = new File(appDir, "peduliLindungi.apk");
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device.deviceName);
    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, device.deviceVersion);
    // capabilities.setCapability(MobileCapabilityType.UDID, device.udid);
    // capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

    // capabilities.setCapability("app", app.getAbsolutePath());
    capabilities.setCapability("appPackage", appConf.appPackage);
    capabilities.setCapability("appActivity", appConf.activity);
    // capabilities.setCapability("avdArgs", "netfast");
    capabilities.setCapability("noReset", "true");
    // capabilities.setCapability("autoWebview", "true");
    capabilities.setCapability("autoLaunch", "false");
    capabilities.setCapability("fullReset", "false");
    capabilities.setCapability("unicodeKeyboard", "false");
    capabilities.setCapability("resetKeyboard", "false");
    capabilities.setCapability(MobileCapabilityType.TAKES_SCREENSHOT, "false");

    try {
      System.out.println("get ready for init driver");
      driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

      driver.launchApp();
      System.out.println("Check driver =>" + driver);
    } catch (MalformedURLException e) {
      System.out.println("error in driver section");
      e.printStackTrace();
    } catch (Exception e) {
      System.out.println("error in driver section Execption => " + e.toString());
    }
    wait = new WebDriverWait(driver, 10);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterExecution
  public void tearDown() {
    driver.quit();
    System.out.println("TEST DONE");
  }

}
