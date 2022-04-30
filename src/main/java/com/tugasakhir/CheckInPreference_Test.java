package com.tugasakhir;

import com.oracle.truffle.regex.tregex.util.Exceptions;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.BeforeExecution;
import org.graphwalker.java.annotation.Edge;
import org.graphwalker.java.annotation.GraphWalker;
import org.graphwalker.java.annotation.Vertex;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

//@GraphWalker(value = "quick_random(vertex_coverage(100))")
public class CheckInPreference_Test extends ExecutionContext implements CheckInPreference {

    @Vertex()
    public void v_CheckInPreference() {
    };

    @Edge()
    public void e_Close_AddProfile() {
        // ! BLOM KELAR
    };

    @Edge()
    public void e_Back_Profile() {
        // Home_Test.getDriver().findElementByAccessibilityId("Navigate up").click();
    };

    @Edge()
    public void e_Click_AddProfile() {
        // Home_Test.getDriver().findElement(By.id("com.telkom.tracencare:id/tv_add_dependent")).click();
    };

    @Vertex()
    public void v_AddProfile() {
        // // ? fill citizenship
        // Home_Test.getDriver().findElement(By.id("com.telkom.tracencare:id/et_jenis_identitas")).click();
        // Home_Test.getWait()
        // .until(ExpectedConditions.visibilityOfElementLocated(By.id("com.telkom.tracencare:id/tv_wni")));
        // Home_Test.getDriver().findElement(By.id("com.telkom.tracencare:id/tv_wni")).click();
        // // ?

        // // ?Fill full name
        // Home_Test.getDriver().findElement(By.id("com.telkom.tracencare:id/et_full_name")).sendKeys("TESTING");
        // // ?

        // // ?Fill NIK
        // Home_Test.getDriver().findElement(By.id("com.telkom.tracencare:id/et_NIK")).sendKeys("3276030607000009");
        // // ?

        // // ?Fill birthDate
        // Home_Test.getDriver().findElement(By.id("com.telkom.tracencare:id/et_tanggal_lahir")).click();
        // // ?

    };

}