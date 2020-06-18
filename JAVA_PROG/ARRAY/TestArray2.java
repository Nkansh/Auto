class TestArray2{

  static void min(int arr[]){ // method that accepts array item as                                   augmant
    int min =arr[0];           //value of min is assigned to the                                   first element of the array
    for(int i =0;i<arr.length;i++){
      if(min >arr[i]){            //first value is compared with the                                other elents of the raay to                                     determine the minimum value
        min = arr[i];
        System.out.println(min);
      }

    }
   
  }
   public static void main(String[] args){

      int  a[] = {33,2,4,5,};
      min(a);
    }


}