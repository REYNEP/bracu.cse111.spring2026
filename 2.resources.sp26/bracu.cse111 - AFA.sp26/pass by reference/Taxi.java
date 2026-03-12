public class Taxi{
  public String color;
  public String area;
  
  public Taxi(String a, String c){
    color =c;
    area = a;
  }
  public void compareTaxi(Taxi t){
    if(this.color.equals(t.color)){
      System.out.println("same same!");
    }
     System.out.println(this);
  }
}