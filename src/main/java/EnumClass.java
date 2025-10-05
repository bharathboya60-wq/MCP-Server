
public class EnumClass {
	public static void main(String[] args)
	{
		Enum Name = Enum.Bharath;
		System.out.println(Name);
		
		//iterating through enum constants
		
		for(Enum e: Enum.values())
		{
			System.out.println(e);
		}
		
		System.out.println(Enum.values().length);
		
		methods ms = methods.Success;
		methods Fail = methods.Error;
		
		System.out.println(ms.getcode());
		System.out.println(Fail.getcode());
		
		
		str s1 = str.valueOf("name");
		System.out.println(s1.getvalue());
		
		
		
		
	}
}
