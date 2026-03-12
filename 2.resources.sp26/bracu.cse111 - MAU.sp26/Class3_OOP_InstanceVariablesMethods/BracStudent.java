public class BracStudent
{
  //access_modifier (public/ private/ default) datatype variable_name;
  public String name = "Unknown";
  public int id;
  public String semester;
  public String [] courses = new String[44];
  
  //acess_modifier return_type method_name(optional parameters)
  //{ work of the method }
  
  public void attendClass()
  {
    System.out.println(name + " is attending the class");
    System.out.println("The student id is "+id);
  }
  public void attendExam()
  {
    System.out.println("A student is attending the exam");
  }
}