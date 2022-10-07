package assignment_New1DArray_Test;

public class PerfectSquare {

	public static void main(String[] args) {
		
		int arr[]= {23,43,25,49,12,9,78,66,39,0};

		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				int sq=j*j;
				if(sq==arr[i])
				{
					System.out.println(arr[i]);
					break;
				}
			}
		}
		
	}

}
