package com.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main( String[] args ) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Vehicle vehicle1 = (Vehicle) context.getBean("car");
        vehicle1.drive();

        Vehicle vehicle2 = (Vehicle) context.getBean("truck");
        vehicle2.drive();

        Tire tire = (Tire) context.getBean("tire");
        System.out.println(tire);

    }

}
