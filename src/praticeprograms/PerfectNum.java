package praticeprograms;

public class PerfectNum {

	void show()
	{
		for(int i=1;i<=30;i++)
		{
			for(int j=1;j<=30;j++)
			{
				int sq=j*j;
				if(sq==i)
				{
					System.out.println(i);
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		PerfectNum m=new PerfectNum();
		m.show();
	
	}

}
