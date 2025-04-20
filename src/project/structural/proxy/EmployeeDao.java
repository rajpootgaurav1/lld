package project.structural.proxy;

public interface EmployeeDao {

    Employee getEmployee(Role role, int id) throws IllegalAccessException;
    void addEmployee(Role role, Employee employee) throws IllegalAccessException;
    void deleteEmployee(Role role, int id) throws IllegalAccessException;
}
