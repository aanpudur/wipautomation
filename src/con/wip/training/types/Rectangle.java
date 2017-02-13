package con.wip.training.types;

public class Rectangle {

  // public Rectangle(int length; int width);

  private int length;
  private int width;

  public Rectangle(int len, int wid) {
    length = len;
    width = wid;
  


  }

  public int area() {

    return length * width;


  }

  public void output() {
    System.out.println("Lenght of the Recrtangle is " + length);
    System.out.println("Width of the Recrtangle is " + width);


  }

}


