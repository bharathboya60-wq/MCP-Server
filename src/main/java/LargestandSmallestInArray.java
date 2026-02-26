
public class LargestandSmallestInArray {
	public static void main(String args[]) {
		int Number[] = {5,1,56,799,373,100,23987,74, -6789};
//		int Numbers[10];
		int smallest=Number[0];
		int Largest = Number[0];
		for(int i=1;i<Number.length;i++)
		{
			if(smallest>Number[i])
			{
				smallest = Number[i];
			}
			
			if(Largest<Number[i])
			{
				Largest = Number[i];
			}
			
		}
		System.out.println("Largest is "+ Largest);
		System.out.println("Smallest is "+ smallest);	
	}
}
