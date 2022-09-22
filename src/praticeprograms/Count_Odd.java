package praticeprograms;

public class Count_Odd {

	public static void main(String[] args) {
		
		int cnt=0;
		for(int i=25;i>=10;i--)
		{
			if(i%2==0)
			{
				continue;
			}
			else
			{
				cnt++;
			}
		}
		System.out.println(cnt);

		
	}

}
