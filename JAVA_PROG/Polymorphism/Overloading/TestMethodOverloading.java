
// Method overloading by parameter differnce 
class Operator{

 void add(int a,int b){
    int ans = a+b;
    System.out.println("The answer for  2 operands is "+ans);

  }
   void add(int a,int b, int c){
    int ans = a+b+c;
    System.out.println("The answer for the 3 operands is "+ans);

  }
}
class TestMethodOverloading{
public static void main(String[] args){
  Operator a = new Operator();
  a.add(2,4);
  a.add(2,4,5);
}
}