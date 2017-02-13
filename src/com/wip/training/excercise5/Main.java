package com.wip.training.excercise5;


public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    Calculator cal1 = new Calculator();
    int add = cal1.add(89, 56);
    int substract = cal1.substract(56, 89);
    double div = cal1.division(78, 4);
    int multiply = cal1.multiply(25, 678);
    int modulus = cal1.modulas(25, 2);
    int square =cal1.square(25);
   
    System.out.println("Calculator:\n");
    System.out.println("Output of Addition ===> " + add);
    System.out.println("Output of Substraction ===> " + substract);
    System.out.println("Output of Division ===> " + div);
    System.out.println("Output of Multiplication ===> " + multiply);
    System.out.println("Output of Modulus ===> " + modulus);
    System.out.println("Output of square ===> " + square);
    
     
    Circle circle1 = new Circle(25);
 
    //find area using radius
    double area = circle1.pie * circle1.radius * circle1.radius;
    System.out.println("\nCircle area is===>  " + area);
    
    //find permeter using radius
    double perimeter = 2 * circle1.pie * circle1.radius;
    System.out.println("\nCirccle perimeter is===>  " + perimeter);
    
    

  }

}
