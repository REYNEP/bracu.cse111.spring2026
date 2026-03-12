public class BracuStudent{
  public String sName;
  private String loc;
  public boolean pass;
  
  public void setLocation(String l){
    loc = l;
  }
  public String getLocation(){
    return loc;
  }
  
  public BracuStudent(String n, String l){
    sName = n;
    loc = l;
  }
}
    
  