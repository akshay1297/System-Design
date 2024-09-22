package creational.singleton.volatileKeyword_mostOptimized;

class DBConnection {
    private static volatile DBConnection dbConnection = null;

    private DBConnection(){

    }

    public static DBConnection getInstance(){
        if(dbConnection == null) {
            synchronized(DBConnection.class) {
                if (dbConnection == null) {
                    dbConnection = new DBConnection();
                    System.out.println("Double Locking - New DbConnection object is created !");

                } else {
                    System.out.println("DBConnecti`on - DbConnection object is already created !");

                }
            }
        }

        return dbConnection;
    }
}
