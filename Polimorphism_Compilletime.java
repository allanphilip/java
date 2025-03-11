package newpack1;



public class Polimorphism_Compilletime {
	
	 void add(String a)
	{
		System.out.println("adding two digit");
	}
	 void add(String b , String c)
	{
		System.out.println("adding three digit");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polimorphism_Compilletime p1 = new Polimorphism_Compilletime();
		p1.add("allan");
		p1.add("sam", "philip");
		
	}

}
