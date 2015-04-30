package questions;
import java.lang.StringBuilder;



public class Strarr 
{
	public static void main(String[] args) 
	{
		
		String wellworded = "abcde";
		//int len = wellworded.length();
		char[] a = new char[10];
		Strarr s = new Strarr();
		
		int i;
		
		for(i=0; i<wellworded.length(); i++)
		{
			a[i]=wellworded.charAt(i);
			
		}
		int c =0, d=1;
		s.validwords(a, c, d);
		
	}
	
		
		public void validwords(char[] a, int i, int j)
		{
			if(j>4)
			{
				return;
			}
			else
				{
				
					for(;i<a.length;i++)
					{
						for(j=i+1;j<a.length;j++)
						{
							String s = new StringBuilder().append(a[i]).append(a[j]).toString();
							System.out.println(s);
							
							
							
						}
						
						
					}
					
					
					
					
					
				
				
				 
				}

		}
}
		
	

	

