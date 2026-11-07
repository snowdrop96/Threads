
class MyThread1 extends Thread{

    MyThread1(String name){
        super(name);
    }
    @Override
    public void run() {

        System.out.println("task2 started.....");
        for(int i=1; i<=100; i++){
            System.out.print("2" + " ");

        }
        System.out.println("task2 completed.....");
        System.out.println(Thread.currentThread().getName());
    }
}

class MyRun implements Runnable{
    @Override
    public void run() {

        System.out.println("task1 started.....");
        for(int i=1; i<=10000; i++){
            System.out.print("1" + " ");

        }
        System.out.println("task1 completed.....");
        System.out.println(Thread.currentThread().getName());
    }
}

public class ThreadClassDemo {

    public static void main(String[] args) throws InterruptedException {
         MyRun task = new MyRun();
         Thread thread1 = new Thread(task, "Thread_MyRun");

         thread1.setDaemon(true);
         thread1.start();
         thread1.join(100); // main thread will wait bcz main is calling
//         thread1.setPriority(1);

//         MyThread1 thread2 = new MyThread1("Thread_MyThread1");
//         thread2.start();
//         thread2.setPriority(10);

//        Thread mainThread = Thread.currentThread();

        System.out.println("task0 started.....");
        for(int i=1; i<=100; i++){
            System.out.print("0" + " ");
        }
        System.out.println("task0 completed.....");
        System.out.println(Thread.currentThread().getName());


    }
}
