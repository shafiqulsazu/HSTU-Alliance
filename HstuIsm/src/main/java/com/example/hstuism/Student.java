package com.example.hstuism;




public class Student {
    private String studentId;
    private String studentName;
    private String phone;
    private String batch;
    private String hall;
    private String password;
    private String dist;
    private String faculty;


    // Constructor
    public Student(String studentId, String studentName, String phone, String dist, String password,String hall, String faculty,String batch) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.phone = phone;
        this.dist = dist;
        this.password = password;
        this.hall = hall;
        this.faculty = faculty;
        this.batch = batch;

    }

    // Getters and Setters
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getDistrict() { return dist; }
    public void setDistrict(String dist) { this.dist = dist; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getHall() { return hall; }
    public void setHall(String hall) { this.hall = hall; }

    public String getFaculty() { return faculty; }
    public void setFaculty(String faculty) { this.faculty = faculty; }

    public String getBatch() { return batch; }
    public void setBatch(String batch) { this.batch = batch; }

    // toString method for file storage
    @Override
    public String toString() {
        return studentId + "," + studentName + "," + phone + "," + dist + "," + password + "," + hall + "," + faculty + "," + batch+"\n";
    }



}



