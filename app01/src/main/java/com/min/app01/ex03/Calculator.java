package com.min.app01.ex03;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;



@Component
@NoArgsConstructor //Calculator()
@AllArgsConstructor // Claculator(String,adder,sbtractor,multiplier,m~~)
@Getter

public class Calculator {
   private String brand="s";
   private Adder module1=new Adder();
   private Subtractor module2=new Subtractor();
   private Multiplier module3=new Multiplier();
   private Divider module4=new Divider();
}
