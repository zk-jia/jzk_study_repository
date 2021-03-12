package test.thread;

public class Thread01 extends Thread{

// 创建线程方法：继承Thread类，重写run()方法
    @Override
    public void run() {
        for(int i=0;i<2000;i++){

            System.out.println("run方法在-----------执行多线程第"+i+"次");
        }


    }

    public static void main(String[] args) {
        Thread01 thread01 = new Thread01();
        thread01.start();

        for(int i=0;i<2000;i++){

            System.out.println("run方法在执行多线程第"+i+"次");
        }
    }
}
