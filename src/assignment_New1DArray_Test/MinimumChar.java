package assignment_New1DArray_Test;
import java.util.*;

import com.array.FindFrequency;

public class MinimumChar {
	
	public static void frequency(char ch[])
	{
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			boolean isvisited=false;
			for(int k=i-1;k>=0;k--)
			{
				if(ch[i]==ch[k])
				{
					isvisited=true;
					break;
				}
			}
			if(isvisited==false)
			{
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						count++;
					}
				}
				if(count==1)
				{
					System.out.println(ch[i]+" "+count);
				}
			}
		}

	}
	
	public static void main(String[]args)
	{
		MinimumChar m=new MinimumChar();
		char ch1[]= {'a','b','b','c','c','b'};
		
		//f.frequency(a);
		MinimumChar.frequency(ch1);
	}

}
