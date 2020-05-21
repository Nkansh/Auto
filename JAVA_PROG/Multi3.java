class Multi3 extends Thread{
  public void run(){
    System.out.println("The thread is running...");
  } 
  public static void main(String[] args){
    Multi3 m1 = new Multi3();
    Thread t1 = new Thread(m1);
    t1.start();

    


  }


}