class Counter{
  int count = 0;//Since this class variable is not static a                   memory location is allocated for every                     object created for this class 
  Counter(){
    count++;
    System.out.println(count);
  }
  public static void main(String[] args){

    Counter c1 = new Counter();
    Counter c2 = new Counter();
    Counter c3 = new Counter();


  }
}