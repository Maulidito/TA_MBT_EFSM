package com.tugasakhir;

import java.util.Random;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.AfterElement;
import org.graphwalker.java.annotation.BeforeExecution;
import org.graphwalker.java.annotation.Edge;
import org.graphwalker.java.annotation.GraphWalker;
import org.graphwalker.java.annotation.Vertex;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

//@GraphWalker(value = "random(reached_edge(e_Save_AddProfile)&&reached_edge(e_Delete_ProfileDetail))")
//@GraphWalker(value = "weighted_random(reached_edge(e_Save_AddProfile)&&reached_edge(e_Delete_ProfileDetail))")
public class LinkedProfile_Test extends ExecutionContext implements LinkedProfile {

    @AfterElement
    public void count_step() {
        Home_Test.step++;
        System.out.println("====================== STEP " + Home_Test.step + "======================");
    }

    @Vertex()
    public void v_LinkedProfile() {
    }

    @Vertex()
    public void v_Settings() {
    }

    @Edge()
    public void e_Delete_ProfileDetail() {
        Home_Test.clickAnElementById("com.telkom.tracencare:id/btn_delete");
    }

    @Edge()
    public void e_Back_ProfileDetail() {
        Home_Test.clickAnElementByAccessbilityId("Navigate up");
    }

    @Edge()
    public void e_Click_LinkedProfile() {
        Home_Test.clickAnElementById("com.telkom.tracencare:id/cl_dependent_profile");
    }

    @Edge()
    public void e_Click_ProfileDetail() {

        Home_Test.clickAnElementByXpath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");
    }

    @Vertex()
    public void v_Profile_Detail() {

        // ? Click Full Name
        Home_Test.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("com.telkom.tracencare:id/et_full_name")));
        Home_Test.getDriver().findElement(By.id("com.telkom.tracencare:id/et_full_name")).sendKeys("TESTING");

        // ?
        // ? Click Identity
        // Home_Test.getWait()
        //         .until(ExpectedConditions
        //                 .visibilityOfElementLocated(By.id("com.telkom.tracencare:id/et_identity_number")));
        // Home_Test.getDriver().findElement(By.id("com.telkom.tracencare:id/et_identity_number"))
        //         .sendKeys("TESTING" + new Random().nextInt(100));
        // ?
    }

    @Edge()
    public void e_Save_AddProfile() {
        Home_Test.clickAnElementById("com.telkom.tracencare:id/btn_save");
    }

    @Edge()
    public void e_Click_AddProfile() {
        Home_Test.clickAnElementById("com.telkom.tracencare:id/btn_add_dependent");
    }

    @Edge()
    public void e_Back_LinkedProfile() {
        Home_Test.clickAnElementByAccessbilityId("Navigate up");
    }

    @Edge()
    public void e_Back_AddProfile() {
        Home_Test.clickAnElementByAccessbilityId("Navigate up");
    }

    @Vertex()
    public void v_AddProfile() {

        // ? Click Citizenship
        Home_Test.clickAnElementById("com.telkom.tracencare:id/et_jenis_identitas");
        Home_Test.clickAnElementById("com.telkom.tracencare:id/tv_wna");

        // ?

        // ? Click Full Name
        Home_Test.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("com.telkom.tracencare:id/et_full_name")));
        Home_Test.getDriver().findElement(By.id("com.telkom.tracencare:id/et_full_name")).sendKeys("TESTING");

        // ?

        // ? Click Identity Type

        Home_Test.clickAnElementById("com.telkom.tracencare:id/et_identity_type");
        Home_Test.clickAnElementById("com.telkom.tracencare:id/tv_wna");

        // ?

        // ? Click Identity
        Home_Test.getWait()
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.id("com.telkom.tracencare:id/et_identity_number")));
        Home_Test.getDriver().findElement(By.id("com.telkom.tracencare:id/et_identity_number"))
                .sendKeys("TESTING" + new Random().nextInt(100));
        // ?

        // ? Click BirthDate
        Home_Test.clickAnElementById("com.telkom.tracencare:id/et_tanggal_lahir");
        Home_Test.clickAnElementById("com.telkom.tracencare:id/md_button_positive");

        // ?

        // ?Click Relationship
        Home_Test.clickAnElementById("com.telkom.tracencare:id/et_relationship");
        Home_Test.clickAnElementByXpath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[8]");
        Home_Test.clickAnElementByXpath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.Button[1]");

    }

    @Edge()
    public void e_Save_ProfileDetail() {
        Home_Test.clickAnElementById("com.telkom.tracencare:id/btn_save");
    }
}