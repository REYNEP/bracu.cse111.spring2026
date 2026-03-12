class CarTester{ 
  
  public static void main(String[] args){  
    
    Car c1 = new Car( "Toyota Cross", "White" );
    Car c2 = new Car( "Nissan X-Trail", "Red" );
    Car c3 = new Car( "Toyota Supra", "Blue" );
    
    int[] arr1 = new int[5];
    int[] arr2 = {54,34,34,23};
    
    Car[] cArr1 = new Car[5];
    Car[] cArr2 = { c1, c2, c3, null, null };
    
    for( int i=0; i<cArr2.length; i++ ){
      Car c = cArr2[ i ];
      if( c!=null ) c.showCar();
      else System.out.println("Empty Slot");
    }

  }
  
}