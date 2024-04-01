package SingletonPattern;

public class Television {
    private static Television instance = null;

    private Television() {
    }

    // Method 1: Classic Implementation
    // This method is not thread-safe.

    // public static Television getInstance() {
    // if (instance == null) {
    // instance = new Television();
    // }
    // return instance;
    // }


    // Method 2: Thread-Safe Implementation using Synchoronous
    // This method is thread-safe but has performance issues because after one instance is created, all the threads will have to wait and then check if the instance is null or not, even if it is not null.

    // public static synchronized Television getInstance() {
    // if (instance == null) {
    // instance = new Television();
    // }
    // return instance;
    // }


    // Method 3: Thread-Safe Implementation using Double-Checked Locking
    // This method is thread-safe and has better performance than the previous method because it checks if the instance is null or not only once.
    // After one instance is created, all the threads can check if the instance is null or not without waiting. If multiple threads read the first if condition and find that the instance is null, then only one thread will enter the synchronized block and create the instance. The other threads will wait for the first thread to finish and then check if the instance is null or not. If the instance is not null, then they will return the instance.

    public static Television getInstance() {
        if (instance == null) {
            synchronized (Television.class) {
                if (instance == null) {
                    instance = new Television();
                }
            }
        }
        return instance;
    }



}
