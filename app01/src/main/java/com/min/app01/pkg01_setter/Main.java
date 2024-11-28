package com.min.app01.pkg01_setter;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

  public static void main(String[] args) {

    //GenericXmlApplicationContext 클래스
    //XML로 생성된 bean을 관리하는 클래스 
    
    AbstractApplicationContext ctx = new GenericXmlApplicationContext("pkg01_setter/app-context.xml");
    
    Contact c = ctx.getBean("contactBean",Contact.class);   //Contact c = (Contact)ctx.getBean("contactBean");
    System.out.println(c.getMobile());
    System.out.println(c.getEmail());
    
    Person p = ctx.getBean("personBean", Person.class);
    System.out.println(p.getName());
    System.out.println(p.getContact().getMobile());
    System.out.println(p.getContact().getEmail());
    
    ctx.close();
  }

}