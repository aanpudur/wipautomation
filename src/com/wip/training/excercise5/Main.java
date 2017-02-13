package com.wip.training.excercise5;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    
    Calculator cal1 = new Calculator();
    int add = cal1.add(5, 78);
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
    
    
    
    
    
    Circle circle1 = new Circle();
    Circle circle2 = new Circle();
    Circle circle3 = new Circle();

    //find area using radius
    double area1 = circle1.area(35);
    double area2 = circle2.area(20);
    //cast to int 
    int area3 = (int)circle3.area(89);
    
    //find peremeter using radius
    double perimeter1 = circle1.peremeter(25);
    double perimeter2 = circle2.peremeter(73);
    int perimeter3 = (int)circle3.peremeter(7);
 
 
    
    System.out.println(
        "\nArea:\n\n" + "Circle1 object's circle area is ===> " + area1 
        + "\nCircle2 object's circle area is ===> "+ area2 
        + "\nCircle3 object's circle area is ===>" + area3 + "\n"
        +"\nPerimeter:\n");
    
    System.out.println(
        "Circle1 object's circle peremeter is ===> " + perimeter1
        + "\nCircle2 object's circle perimeter is ===> "+ perimeter2 
        + "\nCircle3 object's circle perimeter is ===>" + perimeter3);

  }

}
