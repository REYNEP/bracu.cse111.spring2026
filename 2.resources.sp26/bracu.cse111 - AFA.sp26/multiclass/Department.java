public class Department{
  String [] name;
  int [] id;
  String deptname;
  int count =0;
  public Department(String s, int size){
    name = new String [size];
    id = new int [size];
    deptname = s;
  }
  public void addStudent(Student s){
    if(count<name.length){
      name[count] = s.name;
      id[count]= s.id;
      count++;
    }
  }
  public void displayStudents(){
     System.out.println(deptname);
    for (int i = 0; i<count; i++){
      System.out.println(name[i] +" - " + id[i]);
    }
  }
}