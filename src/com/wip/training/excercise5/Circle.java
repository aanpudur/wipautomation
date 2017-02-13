package com.wip.training.excercise5;

/*
 * create a circle class with given radius and calculate area & perimeter & getRadious
 */

public class Circle {
  int radius;
  double pie = 3.14;

//area formulae is π * 2 * 2
  public double area(int rad) {
    return pie * rad * rad;
  }
  
  //perimeter formulae  2 * π * R
  public double peremeter(int rad){
    
    return 2 * pie * rad;
    
    
  }



}
