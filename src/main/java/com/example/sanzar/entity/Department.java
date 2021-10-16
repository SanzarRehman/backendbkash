package com.example.sanzar.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long departmentID;
    private String departmentName;
    private String departmentAddresss;
    private String departmentCode;

    public Department(long departmentID, String departmentName, String departmentAddresss, String departmentCode) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.departmentAddresss = departmentAddresss;
        this.departmentCode = departmentCode;
    }

    public Department() {
    }

    @Override
    public String toString() {
        return "Deprartment{" +
                "departmentID=" + departmentID +
                ", departmentName='" + departmentName + '\'' +
                ", departmentAddresss='" + departmentAddresss + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                '}';
    }

    public long getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(long departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAddresss() {
        return departmentAddresss;
    }

    public void setDepartmentAddresss(String departmentAddresss) {
        this.departmentAddresss = departmentAddresss;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }
}
