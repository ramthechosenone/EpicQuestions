package questions;
import java.util.*;

public class strmanip 
{
	
	public static void main(String[] args) 
	{
		int n = 4;
		int start = 0;
			    
		String wellordered = "abcdefghijklmnopqrstuvwxyz";
		strmanip x = new strmanip();
		x.subbulu(wellordered,n, start);
		
		
				
	}	
		
		
	public void subbulu(String str, int n, int s)
	{
		Hashtable charash = new Hashtable();
	    if(n>str.length())
	    	return;
	    
	    else
	    {
		int start;
	    start = s;
	    String copy;
	    copy = str;
	    
	    
		System.out.println(copy.substring(start,n));
		start = start + 1;
		n = n + 1;
		subbulu(str, n, start);
	    }
		
		}
}

	

