package com.min.app01.pkg03_component;

import org.springframework.stereotype.Component;

import lombok.Getter;

@Component(value="p") // 이 Person 클래스는 p이름의 bean으로 만들어짐  

@Getter
public class Person {
  private String name="유저";
  private Contact contact =new Contact("010-2222-22222","user2@min.com");
}
