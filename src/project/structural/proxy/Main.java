package project.structural.proxy;

import lombok.SneakyThrows;

import static project.structural.proxy.Role.ADMIN;
import static project.structural.proxy.Role.USER;

public class Main {
    @SneakyThrows
    public static void main(String[] args){
        Employee employee = Employee.builder()
                .id(1)
                .name("gaurav")
                .designation("software")
                .build();

        Employee employee2 = Employee.builder()
                .id(2)
                .name("saurav")
                .designation("hardware")
                .build();
        Employee employee3 = Employee.builder()
                .id(3)
                .name("amit")
                .designation("ca")
                .build();

        EmployeeDao employeeDao = new EmployeeDaoProxy();
        employeeDao.addEmployee(ADMIN, employee);
        System.out.println(employeeDao.getEmployee(USER, 1));
        employeeDao.addEmployee(ADMIN, employee2);
        System.out.println(employeeDao.getEmployee(USER, 2));
        employeeDao.deleteEmployee(ADMIN, 1);
        System.out.println(employeeDao.getEmployee(USER, 1));
        employeeDao.addEmployee(ADMIN, employee3);
        System.out.println(employeeDao.getEmployee(USER, 3));


    }
}
