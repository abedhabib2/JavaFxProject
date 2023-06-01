package com.example.project.Controller.Login;

import com.example.project.Model.User;
import com.example.project.View.ViewManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientLogin {



    @FXML
    private PasswordField password;

    @FXML
    private Label status;

    @FXML
    private TextField userName;

    @FXML
    void adminLogin(ActionEvent event) throws IOException {
   ViewManager.openAdminLogin();
   ViewManager.closePatientLogin();
    }

    @FXML
    void patientLogin(ActionEvent event) throws SQLException {

                if(userName.getText().isEmpty()){
                    status.setText("User name is Empty");
                }else if(password.getText().isEmpty()){

                    status.setText("Password is Empty");
                }else{
              String v=User.getPassword(userName.getText());
               if(v.equals("false")){
                status.setText("User name error");
                }else{
                   if(v.equals(password.getText())){
                       status.setText("Done");
                   }else{
                       status.setText("password error");
                   }

            }
        }


    }
    @FXML
    void CreateAccount(ActionEvent event) throws IOException {
        ViewManager.openPatientRegister();
        ViewManager.closePatientLogin();
    }
    public void reset(){
        userName.setText("");
        password.setText("");
    }

}
