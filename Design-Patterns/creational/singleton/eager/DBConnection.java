package creational.singleton.eager;

 class DBConnection {
    private static  DBConnection dbConnection = new DBConnection();

    private DBConnection(){

    }
    public static DBConnection getInstance(){
        System.out.println("Eager - DbConnection object is created !");
             return dbConnection;
    }
}
