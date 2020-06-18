
abstract class Shape{

  abstract void draw();
}

class Circle extends Shape{

  void draw(){
    System.out.println("Drawing a circle");
  }
}
class Rectangle extends Shape{
  void draw(){
    System.out.println("Drawing the rectangle");
  }
}

class TestAbstract{
  public static void main(String[] args){
    Shape c1 =new Circle();
    c1.draw();
    Shape r1 =new Rectangle();
    r1.draw();
   
   

    
  }



}