package com.example.project.Model;

public class Booked_Appointment {
    int id;
    int appoId;
    int userId;
    String status;
    String DoctorCommnet;

    public Booked_Appointment(int id, int appoId, int userId, String status, String doctorCommnet) {
        this.id = id;
        this.appoId = appoId;
        this.userId = userId;
        this.status = status;
        DoctorCommnet = doctorCommnet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAppoId() {
        return appoId;
    }

    public void setAppoId(int appoId) {
        this.appoId = appoId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDoctorCommnet() {
        return DoctorCommnet;
    }

    public void setDoctorCommnet(String doctorCommnet) {
        DoctorCommnet = doctorCommnet;
    }
}
