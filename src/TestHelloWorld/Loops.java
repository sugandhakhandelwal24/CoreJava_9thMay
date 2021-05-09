package TestHelloWorld;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int index = 5;
		
		/*while (index>0) // this will print the value until the condition is false
		{
			System.out.println(index);
			index = index-1;
		
		}
		
		*/
		
		/*while (index>0) // this will give the result without 3
		{
			if(index!=3) {
			System.out.println(index);
			}
			index--;
		
		}
		
		int index1 = 5;
		
		while(index1>0) // this will break the result when the index is 3
		{
			System.out.println(index1);			
			
			if(index1==3) 
			{
				break;
				
			}
			index1--;
		} */
		
		// ---- DO While ----
		
	/*	int index3 = 1;
		
		do {
		
			System.out.println(index3);
		index3++;
			
		}while (index3<11);
		
		*/
		
		// --- For Loop -----
		
		for (int i=0; i<11; i++)
		{
			System.out.println(i);
		}
		
		for (int i=11; i>0; i--)
		{
			System.out.println(i);
		}
		
		
		int myarray[] = {2, 45, 76, 43,23};
		for (int i=0; i<myarray.length; i++)
		{
			System.out.println(myarray[i]);
		}
		
		
		}
	}


