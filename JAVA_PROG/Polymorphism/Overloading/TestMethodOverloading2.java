// Method overloading by changing parameter //difference datatype 
class Operator2{

 void add(float a,float b){
    float ans = a+b;
    System.out.println("The answer for  2 float operands is "+ans);

  }
   void add(int a,int b){
    int ans = a+b;
    System.out.println("The answer for the 2 int operands is "+ans);

  }
}
class TestMethodOverloading2{
public static void main(String[] args){
  Operator2 a = new Operator2();
  a.add(2.1,4.2);
  a.add(2,4);
}
}