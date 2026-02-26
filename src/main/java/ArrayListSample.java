import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayListSample {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		
		System.out.println("Fruits in the list: " + fruits);
		System.out.println("First fruit: " + fruits.get(0));
		System.out.println("Total fruits: " + fruits.size());
		fruits.remove(1);
		System.out.println("Fruits after removal: " + fruits);
		for(String fruit : fruits) {
			System.out.println("Fruit: " + fruit);
		}
		
		for(int i = 0; i < fruits.size(); i++) {
			System.out.println("Fruit at index " + i + ": " + fruits.get(i));
		}
		System.out.println("IF element present" + fruits.contains("Guava"));
		
		int[] Marks	= {85, 90, 78, 92, 88};
		List<int[]> marksList = Arrays.asList(Marks);
		System.out.println("Marks List: " + marksList);
		System.out.println("First Mark: " + marksList.get(0)[0]);
	}
}