package org.esgi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Scene {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Artist paul = context.getBean(Guitarist.class);

        System.out.println(paul.perform());
    }
}
