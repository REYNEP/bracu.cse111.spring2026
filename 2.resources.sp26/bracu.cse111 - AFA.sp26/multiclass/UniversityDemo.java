public class UniversityDemo { 
public static void main(String[] args) {
Student s1 = new Student("Alice", 101); 
Student s2 = new Student("Bob", 102); 
Student s3 = new Student("Charlie", 103); 
Student s4 = new Student("neil", 100); 
Department cs = new Department("Computer Science", 2); 
Department ee = new Department("Electrical Engineering",3); 
cs.addStudent(s1); 
cs.addStudent(s2);
cs.addStudent(s4); // can't add anymore student
ee.addStudent(s3); 
cs.displayStudents(); // output
}
}
//Department: Computer Science 
//Student Name: Alice, ID: 101 
//Student Name: Bob, ID: 102