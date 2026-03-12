public class Department{
  public String dept;
  public int total;  
  public Department(String d, int t){
    this.dept = d;
    this.total = t;
  }  
  public void info(){
    System.out.println("Name: "+this.dept);
    System.out.println("Total Students: "+this.total);
  }
  public void mergeStudents(Department x){
    this.total+=x.total;
    System.out.println("Students of "+x.dept+" are merged with students of "+this.dept);
  }
  public void addStudents(int [] arr){
    for(int i = 0; i<arr.length; i++){      
      this.total+=arr[i];
      arr[i] = 0;
    }
    
  }
  
  
}

    
  
  
  