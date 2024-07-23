package assess;

public class ThreadingExample {

    public static void main(String[] args) {
        // Synchronous Execution using synchronized block
        System.out.println("Synchronous Execution with synchronized:");
        synchronousMethod();

        // Asynchronous Execution without synchronized block
        System.out.println("\nAsynchronous Execution without synchronized:");
        asynchronousMethod();
    }

    // Synchronous method using synchronized block
    public static void synchronousMethod() {
        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");
        Task task3 = new Task("Task 3");

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        thread1.start();
        try {
            thread1.join(); // Wait for task1 to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();
        try {
            thread2.join(); // Wait for task2 to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread3.start();
        try {
            thread3.join(); // Wait for task3 to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Asynchronous method without synchronized block
    public static void asynchronousMethod() {
        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");
        Task task3 = new Task("Task 3");

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join(); // Wait for task1 to complete
            thread2.join(); // Wait for task2 to complete
            thread3.join(); // Wait for task3 to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Task class implementing Runnable with synchronized block
    static class Task implements Runnable {
        private String name;
        private static final Object lock = new Object();

        public Task(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            synchronized (lock) {
                System.out.println(name + " started.");
                try {
                    Thread.sleep(1000); // Simulate a task taking some time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(name + " completed.");
            }
        }
    }
}

