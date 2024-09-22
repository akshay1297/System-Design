package structural.proxy.employeeTable;

public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void create(String client) {
        System.out.println("Table is created for " + client);
    }

    @Override
    public void delete(String client) {
        System.out.println("Table is deleted for " + client);
    }

    @Override
    public EmployeeDao get(String client) {
        return new EmployeeDaoImpl();
    }
}
