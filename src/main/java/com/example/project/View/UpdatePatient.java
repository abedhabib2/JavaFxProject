package com.example.project.View;

import com.example.project.App;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class UpdatePatient extends Stage {
    public UpdatePatient() throws IOException {
        FXMLLoader updatePatient = new FXMLLoader(App.class.getResource("View/admin/patient/update-patient.fxml"));
      Scene  updatePatientScene = new Scene(updatePatient.load());
        this.setScene(updatePatientScene);
        this.setTitle("Update Patient");
    }
}
