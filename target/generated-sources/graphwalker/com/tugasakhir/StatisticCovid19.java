// Generated by GraphWalker (http://www.graphwalker.org)
package com.tugasakhir;

import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model(file = "com/tugasakhir/ModelPeduliLindungi_4.json")
public interface StatisticCovid19 {

    @Edge()
    void e_Click_PickLocationStatisticCovid();

    @Edge()
    void e_Back_PickLocationStatisticCovid();

    @Vertex()
    void v_PickLocation_StatisticCovid();

    @Edge()
    void e_Click_SetLocationStatisticCovid();

    @Vertex()
    void v_Covid19Statistic();
}
