package structural.proxy.employeeTable;

public interface EmployeeDao {
    public void create(String client);
    public void delete(String client);
    public EmployeeDao get(String client);

}
