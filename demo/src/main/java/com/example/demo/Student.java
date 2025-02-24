package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
   private String name;
   private int id;
   private String faculty;
   @Autowired
   private Department d; //the Student component is dependent on the department component
   // in the beans(Spring Framework) so to instantiate it we use @Autowire

   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getId() {
      return id;
   }
   public void setId(int id) {
      this.id = id;
   }
   public String getFaculty() {
      return faculty;
   }
   public void setFaculty(String faculty) {
      this.faculty = faculty;
   }

  public void show() {
   System.out.println("name: " + getName());
   System.out.println("id: " + getId());
   System.out.println("faculty: " + getFaculty());
   System.out.println("Hello!");
   d.display(); //autowire displays the fields of this method without having to create an object
     // in the main application class i.e. DemoApplication, it is invoked from the Student class
}

}

