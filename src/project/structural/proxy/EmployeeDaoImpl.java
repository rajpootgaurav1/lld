package project.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDaoImpl implements EmployeeDao {
    Map<Integer, Employee> employeeMap = new HashMap<>();

    @Override
    public Employee getEmployee(Role role, int id) {
        return employeeMap.get(id);
    }

    @Override
    public void addEmployee(Role role, Employee employee) {
        employeeMap.put(employee.getId(), employee);
    }

    @Override
    public void deleteEmployee(Role role, int id) {
        employeeMap.remove(id);
    }
}
