package creational.singleton.volatileKeyword_mostOptimized;

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


    }
}

/*
Issue with Double-checked locking method that "volatile" keyword resolves ?

1. Caching issue
2. Instructions reordering issue


Object Creation in Java ?
When you create a new object, the process typically involves three steps:
Allocate memory: Memory is allocated for the new object.
Initialize the object: The constructor is invoked to initialize the object.
Assign the reference: The reference to the object is assigned to the variable (in this case, instance).

Instruction Reordering:
In some cases, due to performance optimizations, the JVM or CPU might reorder instructions. This means that steps 2 and 3 could happen out of order. For example:
The reference to the instance might be assigned before the object is fully initialized.
So, in this case, another thread might see a partially constructed object before it is fully initialized.


Scenario:
1. Thread1 creates a Singleton instance and assigns it to the instance variable.
2. he value of instance (which now points to a fully initialized object) may be cached in Thread1's local cache (specific to its CPU core).
Meanwhile, Thread2 checks if (instance == null) and might read the value of instance from its own cache.
3. If the instance variable in Thread2’s cache hasn’t been updated yet (because the change from Thread1 hasn’t been propagated to main memory and back to other caches), Thread2 might still see instance == null.
4. As a result, Thread2 could potentially re-enter the synchronized block and try to create another instance of the Singleton, or worse, access a partially constructed object.
--
If Thread1 writes the reference to the instance variable and the write is not flushed to main memory (due to caching), Thread2 may still read the stale value of instance as null from its own cache.


--
Solution :
Volatile prevents caching: When a variable is declared volatile, it forces threads to always read the value of the variable from main memory instead of their local CPU cache.


What is "Volatile" keyword ?
- ensure visiblity & ordering of instructions.

1. Visibility Guarantee
    - When a variable is declared volatile, any thread that writes to the variable immediately flushes its value to the main memory.
    - When another thread reads a volatile variable, it always reads the most up-to-date value from the main memory,
      not a cached version from the thread's local cache.
2. No Caching
    - Normally, variables in Java can be cached by threads, meaning the thread might read from a local copy of the variable instead of the latest value in the main memory.
      Declaring a variable as volatile prevents such caching. Each read and write operation will be performed directly on the main memory.
3. Happens-Before Guarantee
    - Writes to a volatile variable have a happens-before relationship with subsequent reads of that variable by any thread.
    - This means changes made by one thread to a volatile variable are visible to other threads before any subsequent read operation.
4. No Reordering
    - The volatile keyword also prevents instruction reordering by the Java compiler or the CPU. This is crucial in multi-threaded programs
      where reordering could lead to inconsistent or unexpected results.
    - In short, it ensures memory ordering: operations on a volatile variable will be executed in the order they are
      written in the code, without reordering around it.
 */
