// Generated by GraphWalker (http://www.graphwalker.org)
package com.tugasakhir;

import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model(file = "com/tugasakhir/ModelPeduliLindungi_4.json")
public interface Home {

    @Edge()
    void e_Back_Notifications();

    @Edge()
    void e_Back_ScanQRCode();

    @Edge()
    void e_Click_eHAC();

    @Vertex()
    void v_Telemedicine();

    @Vertex()
    void v_Covid19TestResult();

    @Vertex()
    void v_eHAC();

    @Edge()
    void e_Back_Telemedicine();

    @Edge()
    void e_Back_Covid19Statistic();

    @Vertex()
    void v_HealthcareFacility();

    @Edge()
    void e_Click_Covid19TestResult();

    @Edge()
    void e_Click_Notifications();

    @Vertex()
    void v_Home();

    @Edge()
    void e_Back_Vaccine();

    @Vertex()
    void v_Notification();

    @Edge()
    void e_Back_FindHospital();

    @Vertex()
    void v_Vaccine();

    @Vertex()
    void v_ScanQRCode();

    @Vertex()
    void v_FindHospital();

    @Edge()
    void e_Click_Vaccine();

    @Edge()
    void e_Click_FindHospital();

    @Vertex()
    void v_TravelRegulations();

    @Edge()
    void e_Click_HealthcareFacility();

    @Edge()
    void e_Click_ScanQRCode();

    @Edge()
    void e_Click_Telemedicine();

    @Edge()
    void e_Back_Covid19TestResult();

    @Edge()
    void e_Back_TravelRegulations();

    @Edge()
    void e_Back_HealthcareFacility();

    @Edge()
    void e_Click_TravelRegulations();

    @Edge()
    void e_Click_Covid19Statistic();

    @Vertex()
    void v_Covid19Statistic();

    @Edge()
    void e_Back_eHAC();
}