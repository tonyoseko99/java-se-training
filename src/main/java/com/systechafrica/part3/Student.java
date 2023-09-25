package com.systechafrica.part3;

public class Student {
    String id;
    String name;
    String regNo;
    String email;

    @Override
    public String toString() {
        return "Student [email=" + email + ", id=" + id + ", name=" + name + ", regNo=" + regNo + "]";
    }

    public Student(String id, String name, String regNo, String email) {
        this.id = id;
        this.name = name;
        this.regNo = regNo;
        this.email = email;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRegNo() {
        return regNo;
    }
    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
}
