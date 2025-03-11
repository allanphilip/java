package newpack1;

public class Array_Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int rollno[] = new int[4];
	rollno[0] =15;
	rollno[1] = 20;
	rollno[2] = 34;
	rollno[3] = 48;
	int sum = 0;
	double avg = 0;
	
	
	for(int i=0;i<=3;i++)
	{
		sum = sum+rollno[i];
	}
	System.out.println("sum is : " +sum);
	avg = sum/rollno.length;
	System.out.println("average is :" +avg);

	}

}
