package com.min.app01.pkg02_bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 나는 bean을 만드는 클래스입니다라는 뜻 
public class AppConfig {
  
  /*메소드 == bean 메소드가 곧 bean 임 */
  /*
   * 메소드구성요소??
   * 1.반환 타입   : bean의 타입을 의미함 <bean class=""> 
   * 2.메소드 이름 : bean의 이름 <bean id="">
   */
 //1.메소드 만들기
 @Bean //나는 bean을 만드는 메소드입니다라는 뜻 
 Contact contact() {
   Contact contact = new Contact(); 
   contact.setMobile("010-1111-1111");
   contact.setEmail("user@min.com");
   return contact;//Setter로 만들기 
 }
@Bean(name="person")// Bean의 이름을 person으로 만드는것 
Person BeanXXX() {// 메소드 이름은 더 이상 bean의 이름이 아니게 된다. 바로 윗줄에서 bean의 이름을 주었기 때문에 
  Person person= new Person();
  person.setName("유저");
  person.setContact(contact());
  return person; // Setter로 만들기 
}

}
