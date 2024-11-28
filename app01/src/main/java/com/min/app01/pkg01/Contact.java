package com.min.app01.pkg01;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contact {
  private String mobile;
  private String email;
  /* singleton patter: Contact 인스턴스를 하나만 사용하는 패턴*/
}
