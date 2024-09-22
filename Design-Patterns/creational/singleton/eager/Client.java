package creational.singleton.eager;

/*
Eager :
 -  Instance is created while loading class
 -  Get accessed directly through class area
 */
 class Client {
    public static void main(String[] args){
        DBConnection dbConnection = DBConnection.getInstance();

    }
}
