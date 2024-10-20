package com.example.hstuism;




public class Profile {

    private String studentName;
    private String faculty;
    private String batch;
    private String dist;
    private String phone;





    // Constructor
    public Profile( String studentName, String phone, String dist, String faculty,String batch) {

        this.studentName = studentName;
        this.phone = phone;
        this.dist = dist;
        this.faculty = faculty;
        this.batch = batch;

    }

    // Getters and Setters


    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getDistrict() { return dist; }
    public void setDistrict(String dist) { this.dist = dist; }


    public String getFaculty() { return faculty; }
    public void setFaculty(String faculty) { this.faculty = faculty; }

    public String getBatch() { return batch; }
    public void setBatch(String batch) { this.batch = batch; }

    // toString method for file storage
    @Override
    public String toString() {
        return  studentName + "," + faculty + "," + batch + "," + dist + "," + phone+"\n";
    }



}



