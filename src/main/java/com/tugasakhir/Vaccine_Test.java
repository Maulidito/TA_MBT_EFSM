package com.tugasakhir;

import java.time.Duration;
import java.util.Random;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.AfterElement;
import org.graphwalker.java.annotation.BeforeExecution;
import org.graphwalker.java.annotation.Edge;
import org.graphwalker.java.annotation.GraphWalker;
import org.graphwalker.java.annotation.Vertex;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

//@GraphWalker(value = "weighted_random(reached_edge(e_Click_ConvertMyCertificate_Success)&&reached_edge(e_Delete_ConvertCertificateDetail))")
// @GraphWalker(value = "random(reached_edge(e_Click_ConvertMyCertificate_Success)&&reached_edge(e_Delete_ConvertCertificateDetail))")
public class Vaccine_Test extends ExecutionContext implements Vaccine {

        @AfterElement
        public void count_step() {
                Home_Test.step++;
                System.out.println("====================== STEP " + Home_Test.step + "======================");
        }

        @Override
        public void e_Back_ConvertCertificateDetail() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");

        };

        @Override
        public void e_Back_VaccineCertificate() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[1]");

        };

        @Override
        public void e_Delete_ConvertCertificateDetail() {

        };

        @Override
        public void v_List_Vaccine() {
        };

        // @Override
        // public void v_VaccineTicket_Detail() {

        // };

        @Override
        public void v_Form_ConvertCertificate_Identify() {

        };

<<<<<<< HEAD
        @Override
        public void e_Click_VaccineTicket() {
=======
        // @Override
        // public void e_Click_VaccineTicket() {
        //         Home_Test.clickAnElementById("com.telkom.tracencare:id/ll_vaccine_ticket");
>>>>>>> dc44e637561d21f3858ca91b910a7797659f3e33

        // };

        @Override
        public void e_Click_ConvertMyCertificate_Success() {

        };

        @Override
        public void e_Back_ConvertMyCertificate_Confirmation() {

        };

        @Override
        public void e_Close_ConvertMyCertificate_Success() {

        };

<<<<<<< HEAD
        @Override
        public void e_Back_SearchVaccineLocation() {
=======
        // @Override
        // public void e_Back_SearchVaccineLocation() {
        //         Home_Test.clickAnElementByXpath(
        //                         "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
>>>>>>> dc44e637561d21f3858ca91b910a7797659f3e33

        // };

        @Override
        public void v_ConvertCertificate_Detail() {
        };

        // @Override
        // public void e_Click_VaccineTicketDetail() {

        //         Home_Test.clickAnElementById("com.telkom.tracencare:id/cl_vaccine_history_patient");
        // };

        @Override
        public void v_Form_ConvertCertificate_Success() {
        };

        // @Override
        // public void e_Click_VaccineLocation() {

        //         Home_Test.clickAnElementById("com.telkom.tracencare:id/ll_vaccine_location");
        // };

        // @Override
        // public void e_Click_ModifyLocation() {

        //         Home_Test.clickAnElementByXpath(
        //                         "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button");
        // };

        // @Override
        // public void v_VaccineTicket() {
        // };

        // @Override
        // public void v_Search_VaccineLocation() {
        // };

        @Override
        public void e_Back_ListVaccine() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.Button[1]");

        };

        @Override
        public void v_Form_ConvertCertificate_Destination() {

        };

        @Override
        public void e_Back_ConvertMyCertificate_Identify() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");

        };

        @Override
        public void e_Click_ConvertCertificateDetail() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.ListView/android.view.View[2]/android.view.View");

        };

        // @Override
        // public void e_Back_VaccineTicketDetail() {
        //         Home_Test.clickAnElementByAccessbilityId("Navigate up");
        // };

        @Override
        public void v_Home_Vaccine() {
        };

        // @Override
        // public void e_Back_VaccineLocation() {
        //         Home_Test.clickAnElementByXpath(
        //                         "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");

        // };

<<<<<<< HEAD
        @Override
        public void v_VaccineLocation() {
=======
        // @Override
        // public void v_VaccineLocation() {
        //         Home_Test.clickAnElementByXpath(
        //                         "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button[1]");

        //         // ?wait modal
        //         Home_Test.clickAnElementByXpath(
        //                         "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.widget.ListView/android.view.View[1]/android.view.View");

        //         // ?

        //         Home_Test.clickAnElementByXpath(
        //                         "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button[2]");

        //         // ?wait modal
        //         Home_Test.clickAnElementByXpath(
        //                         "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.widget.ListView/android.view.View[1]");

        //         // ?
>>>>>>> dc44e637561d21f3858ca91b910a7797659f3e33

        // };

        @Override
        public void e_Back_ConvertMyCertificate_Destination() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");

        };

        @Override
        public void e_Click_ConvertMyCertificate_Destination() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.ListView/android.view.View/android.view.View");

        };

        @Override
        public void v_VaccineCertificate() {
        };

        @Override
        public void e_Click_VaccineCertificate() {
                Home_Test.clickAnElementById("com.telkom.tracencare:id/ll_vaccine_certificate");

        };

        @Override
        public void e_Click_ConvertMyCertificate_Identify() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");

        };

        // @Override
        // public void e_Back_VaccineTicket() {

        //         Home_Test.clickAnElementByAccessbilityId("Navigate up");

        // };

        @Override
        public void e_Click_ListVaccine() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View");

        };

        @Override
        public void e_Click_ConvertMyCertificate_Confirmation() {
                Home_Test.clickAnElementByXpath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.Button");

        };

        // @Override
        // public void e_Click_SearchVaccineLocation() {
        //         Home_Test.clickAnElementByXpath(
        //                         "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button");

        // };

        @Override
        public void v_Form_ConvertCertificate_Confirmation() {

        };

}
