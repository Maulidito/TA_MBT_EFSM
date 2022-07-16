package com.tugasakhir;

import java.time.Duration;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.AfterElement;
import org.graphwalker.java.annotation.BeforeExecution;
import org.graphwalker.java.annotation.Edge;
import org.graphwalker.java.annotation.GraphWalker;
import org.graphwalker.java.annotation.Vertex;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

//@GraphWalker(value = "random(reached_edge(e_Delete_DetailMyEHAC))")
//@GraphWalker(value = "weighted_random(reached_edge(e_Delete_DetailMyEHAC))")
public class EHAC_Test extends ExecutionContext implements EHAC {

        @AfterElement
        public void count_step() {
                Home_Test.step++;
                System.out.println("====================== STEP " + Home_Test.step + "======================");
                Home_Test.sleepBeforeActivity();
        }

        @Vertex()
        public void v_Ship_ResultEligibility_eHAC() {
        };

        @Edge()
        public void e_Back_ShipResultEligibilityEHAC() {

        };

        @Edge()
        public void e_Back_DetailMyEHAC() {

        };

        @Vertex()
        public void v_Air_ResultEligibility_eHAC() {
        };

        @Vertex()
        public void v_Air_FlightNumber_eHAC() {

        };

        @Vertex()
        public void v_Land_PersonalData_eHAC() {
        };

        @Edge()
        public void e_Close_LandSuccessEHAC() {

        };

        @Edge()
        public void e_Click_CreateEHAC() {

        };

        @Edge()
        public void e_Back_CreateEHAC() {

        };

        @Vertex()
        public void v_Detail_My_eHAC() {
        };

        @Edge()
        public void e_Back_AirCheckEligibilityEHAC() {

        };

        @Vertex()
        public void v_Air_ManualInput_eHAC() {

        };

        @Vertex()
        public void v_Ship_PersonalData_eHAC() {
        };

        @Edge()
        public void e_Click_TravelEHAC() {

        };

        @Vertex()
        public void v_Create_eHAC() {
        };

        @Vertex()
        public void v_Air_CheckEligibility_eHAC() {
        };

        @Vertex()
        public void v_Air_Date_eHAC() {

        };

        @Edge()
        public void e_Click_ShipCheckEligibilityEHAC() {

        };

        @Vertex()
        public void v_Ship_ShipDetail_eHAC() {

        };

        @Edge()
        public void e_Click_ShipConfirmationEHAC() {

        };

        @Vertex()
        public void v_Land_Success_eHAC() {
        };

        @Edge()
        public void e_Click_DetailMyEHAC() {

        };

        @Edge()
        public void e_Click_LandDateEHAC() {

        };

        @Vertex()
        public void v_Air_ManualFlightInfo_eHAC() {

        };

        @Edge()
        public void e_Click_AirManualInputEHAC() {

        };

        @Edge()
        public void e_Click_AirConfirmationEHAC() {

        };

        @Edge()
        public void e_Back_LandConfirmationEHAC() {

        };

        @Edge()
        public void e_Back_AirFlightNumberEHAC() {

        };

        @Edge()
        public void e_Back_LandResultEligibilityEHAC() {

        };

        @Vertex()
        public void v_Ship_Confirmation_eHAC() {
        };

        @Edge()
        public void e_Click_ShipSuccessEHAC() {

        };

        @Edge()
        public void e_Close_LandResultEligibilityEHAC() {

        };

        @Edge()
        public void e_Back_AirPersonalDataEHAC() {

        };

        @Edge()
        public void e_Back_MyEHAC() {

        };

        @Vertex()
        public void v_Ship_Success_eHAC() {
        };

        @Edge()
        public void e_Back_ShipConfirmationEHAC() {

        };

        @Edge()
        public void e_Click_ShipResultEligibilityEHAC() {

        };

        @Vertex()
        public void v_Land_LandDetail_eHAC() {

        };

        @Edge()
        public void e_Back_LandDetailEHAC() {

        };

        @Edge()
        public void e_Close_AirSuccsessEHAC() {

        };

        @Edge()
        public void e_Close_ShipResultEligibilityEHAC() {

        };

        @Edge()
        public void e_Click_LandConfirmationEHAC() {

        };

        @Vertex()
        public void v_Air_PersonalData_eHAC() {
        };

        @Edge()
        public void e_Click_ShipPersonalDataEHAC() {

        };

        @Vertex()
        public void v_Air_Success_eHAC() {
        };

        @Edge()
        public void e_Close_ShipSuccessEHAC() {

        };

        @Edge()
        public void e_Click_LandDetailEHAC() {

        };

        @Edge()
        public void e_Back_LandDateEHAC() {

        };

        @Vertex()
        public void v_Ship_CheckEligibility_eHAC() {
        };

        @Vertex()
        public void v_eHAC() {
        };

        @Vertex()
        public void v_Land_Date_eHAC() {
        };

        @Edge()
        public void e_Click_MyEHAC() {

        };

        @Edge()
        public void e_Back_AirFlightInfoEHAC() {

        };

        @Edge()
        public void e_Click_AirSuccessEHAC() {

        };

        @Vertex()
        public void v_Travel_eHAC() {
        };

        @Edge()
        public void e_Back_ShipDateEHAC() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button");

        };

        @Edge()
        public void e_Click_AirManualFlightInfoEHAC() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.Button");

        };

        @Vertex()
        public void v_Land_ResultEligibility_eHAC() {
        };

        @Edge()
        public void e_Delete_DetailMyEHAC() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.Button[2]");
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[1] [@text='Yes, Delete']");

        };

        @Edge()
        public void e_Click_AirPersonalDataEHAC() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.Button");

        };

        @Edge()
        public void e_Click_LandSuccessEHAC() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.Button");

                Home_Test.clickAnElementByTextContains("Save");

        };

        @Edge()
        public void e_Back_ShipCheckEligibilityEHAC() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.Button");

        };

        @Vertex()
        public void v_Air_Confirmation_eHAC() {
        };

        @Edge()
        public void e_Back_AirManualFlightInfoEHAC() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");

        };

        @Edge()
        public void e_Click_ShipDetailEHAC() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button");

        };

        @Vertex()
        public void v_Land_CheckEligibility_eHAC() {
        };

        @Edge()
        public void e_Back_TravelEHAC() {

                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button [@text='back']");

        };

        @Edge()
        public void e_Click_AirFlightNumberEHAC() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.widget.Button");

        };

        @Edge()
        public void e_Back_AirManualInputEHAC() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.Button");

        };

        @Edge()
        public void e_Click_AirResultEligibilityEHAC() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[11]/android.view.View/android.widget.Button");
                Home_Test.clickAnElementByTextContains("Save");

                // Home_Test.clickAnElementByXpath(
                // "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[1]
                // [@text='Save']");

        };

        @Edge()
        public void e_Back_SuccessMyEHAC() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]");

        };

        @Edge()
        public void e_Click_AirDateEHAC() {

                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ListView/android.widget.ListView/android.view.View[1]");

        };

        @Edge()
        public void e_Click_ShipDateEHAC() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ListView/android.widget.ListView/android.view.View[3]");

        };

        @Vertex()
        public void v_MyeHac() {
        };

        @Edge()
        public void e_Click_LandPersonalDataEHAC() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Button");

        };

        @Edge()
        public void e_Click_AirFlightInfoEHAC() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button");

        };

        @Edge()
        public void e_Click_LandCheckEligibilityEHAC() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ListView/android.widget.Button");

        };

        @Edge()
        public void e_Back_AirConfirmationEHAC() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.Button");

        };

        @Vertex()
        public void v_Ship_Date_eHAC() {
        };

        @Vertex()
        public void v_Air_FlightInfo_eHAC() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Image");

        };

        @Edge()
        public void e_Back_ShipDetailEHAC() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");

        };

        @Edge()
        public void e_Back_AirResultEligibilityEHAC() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.Button");

        };

        @Edge()
        public void e_Click_AirCheckEligibilityEHAC() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ListView/android.widget.Button");

        };

        @Edge()
        public void e_Back_LandPersonalDataEHAC() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");

        };

        @Edge()
        public void e_Back_ShipPersonalDataEHAC() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");

        };

        @Edge()
        public void e_Back_LandCheckEligibilityEHAC() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.Button");

        };

        @Edge()
        public void e_Back_AirDateEHAC() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button");

        };

        @Edge()
        public void e_Click_LandResultEligibilityEHAC() {

                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[11]/android.view.View/android.widget.Button");

                Home_Test.clickAnElementByTextContains("Save");

                // Home_Test.clickAnElementByXpath(
                // "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.widget.Button[1]
                // [@text='Save']");

        };

        @Vertex()
        public void v_Land_Confirmation_eHAC() {
        };

        @Edge()
        public void e_Close_AirResultEligibilityEHAC() {

                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.widget.Button");

        };

        public void scrollUp() {
                Double widthOffset = 0.5 * Home_Test.getDimensionWidth();
                Double heightOffsetStart = 0.9 * Home_Test.getDimensionHeight();
                Double heightOffsetEnd = 0.1 * Home_Test.getDimensionHeight();
                System.out.println("CHECK DIMENSION = " + widthOffset.intValue() + " W = "
                                + heightOffsetEnd.intValue());

                Home_Test.getTouch()
                                .press(PointOption.point(widthOffset.intValue(),
                                                heightOffsetEnd.intValue()))
                                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                                .moveTo(PointOption.point(widthOffset.intValue(),
                                                heightOffsetStart.intValue()))
                                .release().perform();

                // java.lang.Thread.sleep(3000);

        }

}
