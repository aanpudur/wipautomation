package com.wip.training.excercise5;

/*
 * create a circle class with given radius and calculate area & perimeter & getRadious
 */

public class Circle {
  int radius;
  double pie = 3.14;
  
  public Circle(int a){
   radius = a; 
   
  }
  
  public double area(){

  return pie * radius * radius;
  

  }
  
  public double perimeter(){
   return  2 * pie * radius;
    
    
  }

}
