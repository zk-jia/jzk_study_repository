package test.runable;

public class Runable01 implements Runnable{

    public void run() {
        for(int i=0;i<2000;i++){
            System.out.println("run方法在-----------执行多线程第"+i+"次");
        }
    }

    public static void main(String[] args) {

        // 创建Runable接口的实现类对象
        Runable01 runable01 = new Runable01();

        // 创建线程对象，通过线程对象开启我们的线程，代理
        new Thread(runable01).start();
    }
}
