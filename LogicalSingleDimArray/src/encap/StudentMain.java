package encap;

public class StudentMain {
public static void main(String[] args) {
	
	Student s=new Student(22,"Shikha");
	s.setName("ankita");
	s.display();         //Age: 22  Name:ankita
	
	Student s1=new Student(-2,"disha");
	s1.display();
	
	s1.setAge(-44);
	//s1.getAge();
	s1.display();
}
}
