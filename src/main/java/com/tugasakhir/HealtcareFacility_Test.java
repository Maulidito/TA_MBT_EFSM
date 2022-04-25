package com.tugasakhir;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.BeforeExecution;
import org.graphwalker.java.annotation.Edge;
import org.graphwalker.java.annotation.GraphWalker;
import org.graphwalker.java.annotation.Vertex;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

@GraphWalker(value = "quick_random(vertex_coverage(100))")
public class HealtcareFacility_Test extends ExecutionContext implements HealtcareFacility {

    @Vertex()
    public void v_ListLabAntigen() {
    };

    @Edge()
    public void e_Click_ListLabPCR() {
        Home_Test.getDriver().findElement(By.id("com.telkom.tracencare:id/tv_lab_pcr")).click();
    };

    @Edge()
    public void e_Back_ListFacility() {
        // Home_Test.getDriver().findElement(By.id("com.telkom.tracencare:id/close")).click();
        // !Error in App
    };

    @Edge()
    public void e_Back_ListLabPCR() {

        Home_Test.getDriver().findElement(By.id("com.telkom.tracencare:id/close")).click();
        ;
    };

    @Vertex()
    public void v_ListFacility() {
    };

    @Vertex()
    public void v_ListLabPCR() {
    };

    @Edge()
    public void e_Back_ListLabAntigen() {
        Home_Test.getDriver().findElement(By.id("com.telkom.tracencare:id/close")).click();
    };

    @Edge()
    public void e_Click_ListLabAntigen() {
        Home_Test.getDriver().findElement(By.id("com.telkom.tracencare:id/tv_lab_antigen")).click();
    };

    @Edge()
    public void e_Click_ListFacility() {
        // Home_Test.getDriver().findElement(By.id("com.telkom.tracencare:id/tv_faskes")).click();
        // !Error in APP

    };

    @Vertex()
    public void v_HealthcareFacility() {
    };

}