import java.util.*;
public class Lists {
	public static void main(String[] args)
	{
		List<Integer> L1 = new ArrayList();
		L1.add(1);
		L1.add(2);
		System.out.println(L1);
		List<String> Ls = new ArrayList<>(Arrays.asList("Bharath", "Nav"));
//		System.out.println(Ls);
		Ls.add("Ramu");
		Ls.add(1, "Vik");
		for(int i = 0; i < Ls.size(); i++)
		{
			System.out.println(Ls.get(i));
		}
		for(Integer I1 : L1)
		{
			System.out.println(I1);
		}
		Iterator<String> it = Ls.iterator();
		while (it.hasNext()) {
		    System.out.println(it.next());
		}
		L1.forEach(Item -> System.out.println(Item));
		
	}
}
