package creational.singleton.lazy;


 class DBConnection {
    private static DBConnection dbConnection = null;

    private DBConnection(){

    }
    public static DBConnection getInstance() {
        if (dbConnection == null) {
            System.out.println("Lazy - DbConnection object is created !");
            dbConnection = new DBConnection();
        } else {
            System.out.println("Lazy - DbConnection object already created !");
        }
        return dbConnection;
    }

}
