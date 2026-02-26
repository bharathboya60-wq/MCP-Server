
public class Basics {

	public static void main(String[] args) {
		int Number = 15;
		String Name = "Bharath";
		boolean IsJavaFun = true;
		char Grade = 'A';
		double DecimalNumber = 10.5;
		
		System.out.println("Integer: " + Number);
		
		int[] Numbers = {10, 20, 30, 40, 50};
		System.out.println("Array Element at index 2: " + Numbers[2]);
		
		String Names[] = new String[10];
		Names[0] = "Bharath";
		System.out.println("Array Element at index 0: " + Names[0]);
		
		for(int i = 0; i < Numbers.length; i++) {
			System.out.println("Element at index " + i + ": " + Numbers[i]);
		}
		
		for(int i: Numbers) {
			System.out.println("Element: " + i);
		}
		
		 int numbers[] = {2,5,8,10, 15};
	     System.out.println(numbers[0]);
	     System.out.println(numbers[4]);
	     int count = 0;
	     for(int i = numbers.length-1;i<=0;i--)
	     {
	         count = count + numbers[i];
	         System.out.println(numbers[i]);

	}
	}
}
