package newpack1;

import java.util.Date;

public class String_date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Date d1 = new Date();//d1+(1000*60*60*24*1)//present time
	System.out.println(d1 );
	Date d2 = new Date(d1.getTime()+(1000*60*60*24*1));//future time
	System.out.println(d2);
	Date d3 = new Date(d1.getTime()+(1000*60*60*24*-1));//past time
	System.out.println(d3);
	
	String format1 = d3.toString();
			
			
			
	String month = format1.substring(4, 7);
//	System.out.println(month);
	String date = format1.substring(8, 10);
//	System.out.println(date);
	String year = format1.substring(format1.length()-4);
//	System.out.println(year);
	System.out.println("date is");
	String format2 = date.concat("-").concat(month).concat("-").concat(year);
	System.out.println(format2);
	
	
	
	}

}
