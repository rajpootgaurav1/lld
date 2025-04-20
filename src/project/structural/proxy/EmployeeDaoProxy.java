package project.structural.proxy;

import lombok.SneakyThrows;

import static project.structural.proxy.Role.ADMIN;
import static project.structural.proxy.Role.USER;

public class EmployeeDaoProxy implements EmployeeDao {
    private final EmployeeDaoImpl employeeDao;

    public EmployeeDaoProxy() {
        employeeDao = new EmployeeDaoImpl();
    }

    @Override
    @SneakyThrows
    public Employee getEmployee(Role role, int id) {
        if (ADMIN.equals(role) || USER.equals(role)) {
            return employeeDao.getEmployee(role, id);

        }
        throw new IllegalAccessException("Access denied");
    }

    @Override
    @SneakyThrows
    public void addEmployee(Role role, Employee employee) {
        if (ADMIN.equals(role)) {
            employeeDao.addEmployee(role, employee);
            return;
        }
        throw new IllegalAccessException("Access denied");
    }

    @Override
    @SneakyThrows
    public void deleteEmployee(Role role, int id) {
        if (ADMIN.equals(role)) {
            employeeDao.deleteEmployee(role, id);
            return;
        }
        throw new IllegalAccessException("Access denied");
    }
}
