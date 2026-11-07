// Problem - Java don't support multiple inheritance
// Solution - Runnable Interface
class MyThread extends Thread{ // here we are making thread
    @Override
     public void run(){
        for(int i=1; i<=10; i++){
            System.out.print("1" + " ");
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName());

    }
}


public class MTUsingThread {




    public static void main(String[] args) {
//        MTUsingThread obj = new MTUsingThread();
        MyThread thread1 = new MyThread();
        thread1.start(); // will create new thread

//        obj.display();

        for(int i=1; i<=10; i++){
            System.out.print("0" + " ");

            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(Thread.currentThread().getName());
    }
}
