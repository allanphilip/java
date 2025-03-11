package newpack1;

public class This_LocalGlobal {
	
	String name ;
	int age;
	String title;
	
	void details(String name , int age ,String title)
	{
		this.name=name;
		this.age=age;
		this.title=title;
		System.out.println("name is " +name);
		System.out.println("age is " +age);
		System.out.println("title is "+title);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_LocalGlobal t1 =new This_LocalGlobal();
		t1.details("Max", 30, "Dev");
		System.out.println(t1.name);
		
		
		
	}

}
