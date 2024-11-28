package com.min.app01.pkg03_component;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Mainclass {

  public static void main(String[] args) {

    AbstractApplicationContext ctx= new AnnotationConfigApplicationContext("com.min.app01.pkg03_component");
    // 패키지에 자바 Annotation으로 만든 bean이 존재하면 사용하겠다는 뜻 
    Contact contact =ctx.getBean("contact",Contact.class);
    System.out.println(contact.getMobile());
    System.out.println(contact.getEmail());

    Person person=ctx.getBean("p",Person.class);
    System.out.println(person.getName());
    System.out.println(person.getContact().getMobile());
    System.out.println(person.getContact().getEmail());
    ctx.close();
  }

}
