package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Department {
   private String DepName;
   private int currentSem;

   public String getDepName() {
      return DepName;
   }

   public void setDepName(String depName) {
      DepName = depName;
   }

   public int getCurrentSem() {
      return currentSem;
   }

   public void setCurrentSem(int currentSem) {
      this.currentSem = currentSem;
   }
   public void display(){
      System.out.println("The Department information will be displayed here!");
   }
}
