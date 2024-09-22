package creational.singleton.lazy;



 class Client {
    public static void main(String[] args){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                DBConnection db1 = DBConnection.getInstance();
                System.out.println("Thread 1: " + db1);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                DBConnection db2 = DBConnection.getInstance();
                System.out.println("Thread 2: " + db2);
            }
        });

        // Start all threads
        thread1.start();
        thread2.start();

        // see both new objects are created because its not thread safe

    }
}
