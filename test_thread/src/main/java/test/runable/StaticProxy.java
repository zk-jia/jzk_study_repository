package test.runable;

// 静态代理

public class StaticProxy {
    public static void main(String[] args) {
        new WeddingCompany(new Me()).HappyMarry();
    }
}
interface Marry{
    void HappyMarry();
}

class Me implements Marry{

    public void HappyMarry() {
        System.out.println("结婚了，超不开心");
    }
}

class WeddingCompany implements Marry{

    private  Marry target;

    public WeddingCompany(Marry target){
        this.target = target;
    }


    public void HappyMarry() {
        this.target.HappyMarry();
    }
}


