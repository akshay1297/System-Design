package structural.proxy.employeeTable;

public class EmployeeDaoProxy implements EmployeeDao{

    EmployeeDao employeeDao;
    public EmployeeDaoProxy(){
               employeeDao = new EmployeeDaoImpl();
            }


    @Override
    public void create(String client) {
        if(client.equalsIgnoreCase("ADMIN") || client.equalsIgnoreCase("USER")){
            employeeDao.create(client);
            return;
        }

        throw new RuntimeException("ACCESS DENIED !!");
    }

    @Override
    public void delete(String client) {
            if(client.equalsIgnoreCase("ADMIN")){
                employeeDao.delete(client);
            }

        throw new RuntimeException("ACCESS DENIED !!");

    }

    @Override
    public EmployeeDao get(String client) {
        if(client.equalsIgnoreCase("ADMIN") || client.equalsIgnoreCase("USER")){
           return employeeDao.get(client);
        }
        return null;
    }
}
