import java.util.*;
import java.text.*;

public class Activity1_Midterms 
{
    
    public static void main(String[] args)throws Exception 
    	{
    	Date date = new Date();
    	Scanner scan = new Scanner(System.in);
    	Calendar calendar = new GregorianCalendar();
    	SimpleDateFormat format = new SimpleDateFormat("M-dd-yyyy");
    	
    	System.out.println("Enter ur birthday: ");
    	String Input_bday = scan.nextLine();
    	Date Bday = format.parse(Input_bday);
    	
    	int current_year = calendar.get(Calendar.YEAR);
    	calendar.setTime(Bday);
    	int byear = calendar.get(Calendar.YEAR);
    	
    	int age = current_year - byear;
    	System.out.println("My age: "+age);
    }
}
