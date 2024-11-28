package com.min.app01.ex02;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor //Calculator()
@AllArgsConstructor // Claculator(String,adder,sbtractor,multiplier,m~~)
@Getter
@Setter
public class Calculator {
   private String brand;
   private Adder module1;
   private Subtractor module2;
   private Multiplier module3;
   private Divider module4;
}
