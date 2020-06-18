//in method overriding the the subclass is implemented 

class Vehicle{
  void run(){
    System.out.println("The superclass is running ");
  }
}
class Car extends Vehicle{
  void run(){
    System.out.println("The subclass is running ");
  }
}
class TestMethodOverriding{
  public static void main(String[] args){
    Car car = new Car();
    car.run();
  }
}

