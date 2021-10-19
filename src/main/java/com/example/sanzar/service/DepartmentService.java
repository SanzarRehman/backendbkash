package com.example.sanzar.service;

import com.example.sanzar.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    List<Department> fetchdepartmentlist();

   public Department fetchdeptbyid(Long departmentId);

    Department deletedpet(Long departmentID);

   public Department updatedpt(Long departmentID, Department department);




    Department fetchDepartmentByName(String departmentName);
}
