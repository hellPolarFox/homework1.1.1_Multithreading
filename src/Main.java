public class Main {
    public static void main(String[] args) {

        ThreadGroup group = new ThreadGroup("MyThreadGroup");

        MyThread thread1 = new MyThread(group, "поток 1");
        Thread thread2 = new MyThread(group, "поток 2");
        Thread thread3 = new MyThread(group, "поток 3");
        Thread thread4 = new MyThread(group, "поток 4");

        System.out.println("Создаю потоки...");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            Thread.sleep(15000);
            group.interrupt();
            System.out.println("Завершаю все потоки...");
        } catch (InterruptedException e) {

        }
    }
}
