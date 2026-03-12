public class Phone{
  public String brand = "Nokia";
  public String color = "Blue";
  public int price = 14000;
      
  public void showDetails(){  
    System.out.println("Brand Name: "+ brand);
    System.out.println("Color: "+ color);
    System.out.println("Price: "+ price +" Taka");    
  }
  
  public String increasePrice(int p){
    price+=p;
    return "The price is updated";
  }
  
  public void changeBrandName(String brand){
    brand = brand;
    System.out.println("Brand name is changed to "+brand);
  }
  
  public void changeColor(String color){
    this.color = color; // Red = Red
    System.out.println(this);
  }
}




//Brand Name: Nokia
//Color: Blue
//Price: 14000 Taka
//---------1---------
//The price is updated
//---------2---------
//Brand Name: Nokia
//Color: Blue
//Price: 16000 Taka
//---------4---------
//Brand Name: Nokia
//Color: Blue
//Price: 14000 Taka
//---------5---------
//The price is updated
//---------6---------
//Brand name is changed to Oppo
//---------7---------
//Brand Name: Oppo
//Color: Blue
//Price: 19000 Taka
