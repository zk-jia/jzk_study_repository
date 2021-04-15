package test.reflection;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ReflectionDemo02 {
    static {
        System.out.println("进入main函数");
    }

    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR,-2);
        date = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(date));
    }
}
/*
 * 关于类加载，以及静态代码块
 */