package com.ltts.DemoSpringEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("web.xml");
                    student s= (student) context.getBean("student1");
                    System.out.println(s);
    }
}
