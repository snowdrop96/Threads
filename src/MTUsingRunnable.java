class MyRunnable implements Runnable{
    @Override
    public void run() {

        System.out.println("task1 started.....");
        for(int i=1; i<=10; i++){
            System.out.print("1" + " ");

        }
        System.out.println("task1 completed.....");
    }
}

class MyThreadd extends Thread{
    @Override
    public void run() {

        System.out.println("task2 started.....");
        for(int i=1; i<=10; i++){
            System.out.print("2" + " ");

        }
        System.out.println("task2 completed.....");
    }
}

public class MTUsingRunnable {

    public static void main(String[] args) {

        MyRunnable task = new MyRunnable();
        Thread thread1 = new Thread(task);
        thread1.start();

        MyThreadd thread2 = new MyThreadd();
        thread2.start();

//        Thread thread2 = new Thread(task);
//        thread2.start();

        System.out.println("task0 started.....");

        for(int i=1; i<=10; i++){
            System.out.print("0" + " ");

        }

        System.out.println("task0 completed.....");
        System.out.println("Main completed.....");

    }
}
