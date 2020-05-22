class Animal{
  void eat(){
    System.out.println("eating...");
  }
}

class Dog extends Animal{        //Single inheritance
  void bark(){
    System.out.println("barking...");

  }

}

class Cat extends Dog{             //Multiple inheritance
  void cry(){
    System.out.println("meow...");
  }
}

class TestInheritance{
  public static void main(String[] args ){
    Dog dog = new Dog();
    dog.bark();
    dog.eat();
    Cat cat = new Cat();
    cat.cry();
    cat.eat();



  }
}