package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entites.Department;

import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n=== TEST 1: department insert ====");
        Department newDepartment = new Department(null, "Administration");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted ! New id = " + newDepartment.getId());


        System.out.println("\n=== TEST 2: department findById ====");
        Department department = departmentDao.findById(1);
        System.out.println(department);


        System.out.println("\n=== TEST 3: department update ====");
        department = departmentDao.findById(7);
        department.setName("Chipset");
        departmentDao.update(department);
        System.out.println("Update Completed");

        System.out.println("\n=== TEST 4: department findAll ====");
        List<Department> list = departmentDao.findAll();
        for (Department obj :list){
            System.out.println(obj);
        }


    }

}
