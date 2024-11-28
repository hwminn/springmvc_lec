package com.min.app01.pkg03_component;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Component //이 Contact클래스는 bean으로 만들어짐 이름은 contact  [디폴트 형식의 생성자를 사용하는 것임]

@NoArgsConstructor //Contact()생성자 
@AllArgsConstructor //Contact 생성자 Contact(String, String)
@Getter
public class Contact {
  private String mobile="010-1111-1111";
  private String email="user@min.com";
}
