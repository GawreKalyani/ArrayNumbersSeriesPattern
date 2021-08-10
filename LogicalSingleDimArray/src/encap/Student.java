package encap;

public class Student {
	//Variables
	private int age;
	private String name;
	
	//Constructor
	Student(int age,String name){
		if(age>0)
		{
			this.age=age;
		}
		else
		{
			this.age=0;
		}
		this.name=name;
	}
	
	//Getter
		public int getAge(){
			//System.out.println(""+age);
			return age;
		}
		public String getName(){
			//System.out.println(""+name);
			return name;
		}

	
	//setter
	public void setAge(int age) {
		if(age>0)
		{
			this.age=age;
		}
		else
		{
			this.age=0;
		}
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	//General Method
	void display()
	{
		System.out.println("Age: "+age);
		System.out.println("Name:  "+name);
	}
	
	
	
	
	
	
	
	
	
}
