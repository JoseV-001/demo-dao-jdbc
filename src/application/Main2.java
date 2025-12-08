package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entites.Department;

import java.sql.SQLOutput;

public class Main2 {

    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n=== TEST 1: department insert ====");
        Department newDepartment = new Department(null,"Administration");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted ! New id = " + newDepartment.getId());




    }

}
