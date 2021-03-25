package test.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 自定义注解测试
public class AnnotationDemo01 {

    @MyAnnotation("dad")
    public void MyName(){}

}

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{

    String value() default "";
    int name() default 0;

}

/*
 * Target 注释可以运行得地方 方法 类
 * Retention 注释存在的时间段 runtime>class>source
 * String 参数类型 参数名称只有一个的时候建议使用value 使用的时候可以省略 参数可以使用默认值同时显性表达
 */