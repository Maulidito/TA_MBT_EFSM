package com.tugasakhir;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.BeforeExecution;
import org.graphwalker.java.annotation.Edge;
import org.graphwalker.java.annotation.GraphWalker;
import org.graphwalker.java.annotation.Vertex;
import org.openqa.selenium.By;

//@GraphWalker(value = "quick_random(vertex_coverage(100))")
public class StatisticCovid19_Test extends ExecutionContext {// implements StatisticCovid19 {

    @Edge()
    public void e_Click_PickLocationStatisticCovid() {
    };

    @Vertex()
    public void v_Covid19Statistic() {
    };

    @Edge()
    public void e_Back_PickLocationStatisticCovid() {
    };

    @Vertex()
    public void v_PickLocation_StatisticCovid() {
    };

    @Edge()
    public void e_Click_SetLocationStatisticCovid() {
    };

}