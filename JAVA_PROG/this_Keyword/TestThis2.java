 
class Student{
  int rollno;
  String name;
  float fee;
  Student(int rollno,String name,float fee){
    this.rollno = rollno; //the this keyword in class methods
    this.name = name;     //this keyword used when the class variable
    this.fee = fee;       //have the same names as the method                                //variables 

  }
  void display(){
    System.out.println(rollno+" "+name+" "+fee);
  }
}

class TestThis2{
  public static void main(String[] args){

    Student s1 = new Student(111,"Abena",5000f);
    Student s2 = new Student(112,"Nkansah",6000f);

    s1.display();
    s2.display();
    
  }
}