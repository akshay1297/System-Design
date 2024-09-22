package creational.singleton.synchronised;

class DBConnection {
    private static DBConnection dbConnection = null;

    private DBConnection(){

    }

    /*
    Synchronised keyword puts lock on the method and give access to one thread at a time.
     */
     public static synchronized DBConnection getInstance(){
        if(dbConnection == null){
            dbConnection = new DBConnection();
            System.out.println("Synchronised - New DbConnection object is created !");
        }
        else{
            System.out.println("Synchronised -  DbConnection object is already created !");
        }

        return dbConnection;
    }

    /*
    Issue with this method :
     - Majorly Performance :
        1. When you use the synchronized keyword on the getInstance() method, it ensures that only one thread can access the method at a time.
        This guarantees thread safety and prevents multiple threads from creating separate instances of the singleton.
        However, every time a thread calls the getInstance() method, it has to acquire a lock,
        even if the Singleton instance is already created. This introduces unnecessary performance overhead,
        especially in cases where multiple threads are accessing the getInstance() method frequently.
        2. After the Singleton instance is created, there’s no need to synchronize subsequent calls, but with this approach, every call still acquires the lock.
           Acquiring and releasing locks takes time, so this could cause performance bottlenecks in a multi-threaded application where getInstance() is called frequently.
        3. In depth explanation :
        First Call:
            Instance is null: The first thread calls getInstance(), and since dbConnection is null, it proceeds to create the instance,
            while other threads wait for this thread to finish.
            Synchronization is needed here to ensure thread safety, which is fine.

        Subsequent Calls:
            Instance is not null: After the first call, dbConnection is no longer null.
            Problem: Even though no new instance needs to be created, all other threads must still wait to acquire the lock each time they call getInstance().
            This is inefficient because there’s no actual work being done that requires synchronization after the first instance is created. You’re just checking a value (if (dbConnection == null)), which doesn’t need locking.


     */

}
