package newpack1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_Account_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the account number and name:");
	
	Map<Integer, String> m1 = new HashMap<Integer,String>();
	m1.put(sc.nextInt(), sc.next());
	m1.put(sc.nextInt(), sc.next());
	m1.put(sc.nextInt(), sc.next());
	m1.put(sc.nextInt(), sc.next());
	m1.put(sc.nextInt(), sc.next());
	sc.close();
	
	for(Map.Entry<Integer, String> e1 :m1.entrySet())
	{
		System.out.println("Account number:" +e1.getKey()+ 
				"    Account name : "+e1.getValue());
		
	}
	
	
	}

}
