package test.reflection;

// 获取Class的方式
public class ReflectionDemo01 {

    public static void main(String[] args) throws ClassNotFoundException {

        Person person = new Student();
        // 通过对象获得
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());

        // 通过forname获得
        Class c2 = Class.forName("test.reflection.Student");
        System.out.println(c2.hashCode());

        // 通过Class类名获取
        Class c3 = Student.class;
        System.out.println(c3.hashCode());

        // 使用包装类属性
        Class c4 = Integer.TYPE;
        System.out.println(c4.hashCode());

        // 获取父类类型
        Class c5 = c1.getSuperclass();
        System.out.println(c5.hashCode());



        // eg: 类、接口、数组、枚举、注解、基本数据类型
        int[] a = new int[10];
        int[] b = new int[100];
        System.out.println(a.getClass().hashCode());
        System.out.println(b.getClass().hashCode());

    }

}

class Person{
    String name;

    public String getName() {
        return name;
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person{

    public Student() {
        this.name = "学生";
    }
}

class Teacher extends Person{

    public Teacher() {
        this.name = "老师";
    }
}

/*
 * Class 本身也是一个类
 * Class 对象只能由系统创建对象
 * Class 一个类对应一个Class实例
 * Class 对象对应一个加载到JVM中的的一个.class文件
 * 元素类型与维度是一样 对应的class就是一样的
 */