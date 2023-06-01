package com.example.project.View;

import com.example.project.App;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminDashboard extends Stage {
    private  Scene createPatientScene,updatePatientScene;
    public AdminDashboard() throws IOException {
        FXMLLoader patient = new FXMLLoader(App.class.getResource("View/admin/patient/admin-patient.fxml"));
        Scene patientScene = new Scene(patient.load());
        this.setScene(patientScene);
        this.setTitle("admin-patient");

        FXMLLoader createPatient = new FXMLLoader(App.class.getResource("View/admin/patient/create-patient.fxml"));
         createPatientScene = new Scene(createPatient.load());


    }
    public   void changeToCreatePatient(){
        this.setScene(createPatientScene);
        this.setTitle("Create New Patient");
    }



}
