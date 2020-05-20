import java.util.Scanner;
import java.applet.*;
import java.awt.*;

class Auto{
  public static void main(String[] args){
 
  
    Car car = new Car();
    Scanner in = new Scanner(System.in);
    System.out.print("Car Brand: ");
    car.brandName = in.next();
    String s= new HelloWorldApplet();
    s.paint();
    
    System.out.println("Chassis number : ");
   car.chassisNumber = in.nextInt();
    System.out.println("Welcome "+car.brandName+"("+car.chassisNumber+")");




  }


}
class HelloWorldApplet extends Applet {
   public void paint (Graphics g) {
      g.drawString ("Hello World", 25, 50);
   }
}

class Car{
  String brandName;
  int chassisNumber;
  public void startEng(){
    System.out.println("Starting...");
  }
  
  
  public void accelerating(){
    System.out.println("Accelerate...");
  }
  public void stop(){
    System.out.println("Stop...");
  }
}