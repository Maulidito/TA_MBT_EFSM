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

@GraphWalker(value = "random(reached_edge(e_Save_AddProfile)&&reached_edge(e_Delete_ProfileDetail))")
// @GraphWalker(value ="weighted_random(reached_edge(e_Save_AddProfile)&&reached_edge(e_Delete_ProfileDetail))")
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

    }

    @Edge()
    public void e_Back_ProfileDetail() {

    }

    @Edge()
    public void e_Click_LinkedProfile() {

    }

    @Edge()
    public void e_Click_ProfileDetail() {

<<<<<<< HEAD
=======
        Home_Test.clickAnElementByXpath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");
>>>>>>> dc44e637561d21f3858ca91b910a7797659f3e33
    }

    @Vertex()
    public void v_Profile_Detail() {

<<<<<<< HEAD
=======
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
>>>>>>> dc44e637561d21f3858ca91b910a7797659f3e33
    }

    @Edge()
    public void e_Save_AddProfile() {

    }

    @Edge()
    public void e_Click_AddProfile() {

    }

    @Edge()
    public void e_Back_LinkedProfile() {

    }

    @Edge()
    public void e_Back_AddProfile() {

    }

    @Vertex()
    public void v_AddProfile() {

    }

    @Edge()
    public void e_Save_ProfileDetail() {

    }
}