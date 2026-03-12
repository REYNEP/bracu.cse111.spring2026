public class Teacher{
  public String name;
  public String initial;
  public Course [] list = new Course [3];
  public int count;
  
  public Teacher(String n, String i){
    name = n;
    initial = i;
    System.out.println("A new teacher has been created");
  }
  
  public void printDetail(){ 
    System.out.println("Name: "+name);
    System.out.println("Initial: "+initial);
    System.out.println("List of courses: ");
    for(int i = 0; i<count; i++){
      System.out.println(list[i].cName);
    }
  }
  public void addCourse(Course c){
    if(count<3){
      list[count++] = c;
    }
  }
                         
    
    
  }
  