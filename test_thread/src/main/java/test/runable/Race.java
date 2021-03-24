package test.runable;

public class Race implements Runnable{

    // 胜利者是谁
    private String winner;

    public void run() {
        for(int step= 0;step<=100;step++){
            System.out.println(Thread.currentThread().getName()+"当前步数是第"+step+"步");
            boolean flag = gameover(step);
            if(flag){
                break;
            }
        }
    }

    private boolean gameover(int steps){
        if(winner!=null){
            System.out.println("胜利者是"+winner);
            return true;
        }
        else {
            if(steps>=100){
                winner = Thread.currentThread().getName();
                System.out.println("winner is "+winner);
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Race race = new Race();
        new Thread(race,"乌龟").start();
        new Thread(race,"兔子").start();
    }
}


/*
 * 对比静态代理模式
 * new T hread()
 */