package newpack1;
interface car
{
	void color();
	void seats();
}
interface bike extends car
{
	void speed();
	void tyre();
}

public class Interface_mulilevel_Inheritence implements bike {

	@Override
	public void color() {
		// TODO Auto-generated method stub
		String color = "blue";
		System.out.println("color is " +color);
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		int speed = 100;
		System.out.println("Speed is "+speed+"kmph");
	}

	@Override
	public void tyre() {
		// TODO Auto-generated method stub
		int tyre= 4;
		System.out.println("number of tyre "+tyre);
	}

	

	@Override
	public void seats() {
		// TODO Auto-generated method stub
		int seats= 4;
		System.out.println("number of seats "+seats);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Interface_mulilevel_Inheritence  in1 = new Interface_mulilevel_Inheritence();
		in1.color();
		in1.seats();
		in1.tyre();
		in1.seats();

		
	}

}
