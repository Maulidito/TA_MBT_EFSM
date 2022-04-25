package com.tugasakhir;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.BeforeExecution;
import org.graphwalker.java.annotation.Edge;
import org.graphwalker.java.annotation.GraphWalker;
import org.graphwalker.java.annotation.Vertex;
import org.openqa.selenium.By;

@GraphWalker(value = "quick_random(vertex_coverage(100))")
public class ScanQrCode_Test extends ExecutionContext implements ScanQrCode {

    @Edge()
    public void e_Click_OpenCamera() {
        Home_Test.getDriver().findElement(By.id("com.telkom.tracencare:id/btn_setuju")).click();
    };

    @Vertex()
    public void v_OpenCamera() {
    };

    @Edge()
    public void e_Back_OpenCamera() {
        Home_Test.getDriver().findElement(By.id("com.telkom.tracencare:id/ivCloseScanner")).click();
    };

    @Vertex()
    public void v_ScanQRCode() {
    };

    @Vertex()
    public void v_Home() {
    };

}