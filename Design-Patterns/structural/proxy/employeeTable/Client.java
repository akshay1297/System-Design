package structural.proxy.employeeTable;

public class Client {
    public static void main(String[] args){
        EmployeeDaoProxy employeeDaoProxy = new EmployeeDaoProxy();
        employeeDaoProxy.create("ADMIN");
        employeeDaoProxy.delete("USER");
    }
}
