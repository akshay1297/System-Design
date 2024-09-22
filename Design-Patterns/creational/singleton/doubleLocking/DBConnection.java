package creational.singleton.doubleLocking;

/*

In double-checked locking, you check whether the Singleton instance is null twice: once before entering the synchronized block, and once inside the synchronized block. This drastically reduces the overhead:

First Check (Before Synchronization): You check if dbConnection is null. If it’s not null, no synchronization is needed, and the method simply returns the instance.
Second Check (Inside Synchronization): If dbConnection is still null after acquiring the lock, then it proceeds to create the instance. This ensures thread safety.
After the instance is created, all subsequent calls to getInstance() will bypass the synchronization block entirely, which eliminates the performance cost of acquiring and releasing locks unnecessarily.
 */


/*
Why second check is required ????
Without double-checked locking: Every call to getInstance() has to acquire a lock, even when the instance is already created,
leading to performance degradation due to unnecessary locking.

With double-checked locking: Only the first call (when the instance is created) incurs the synchronization overhead.
After the instance is created, subsequent calls bypass synchronization entirely, leading to significant performance
gains in multi-threaded environments.

 */
class DBConnection {
    private static DBConnection dbConnection = null;

    private DBConnection(){

    }

    public static DBConnection getInstance(){
        if(dbConnection == null) {
            synchronized(DBConnection.class) {
                if (dbConnection == null) {
                    dbConnection = new DBConnection();
                    System.out.println("Double Locking - New DbConnection object is created !");

                } else {
                    System.out.println("DBConnection - DbConnection object is already created !");

                }
            }
        }

        return dbConnection;
    }
}
