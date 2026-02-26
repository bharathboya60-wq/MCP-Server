package Practices;

public class StarPattern {

	public static void main(String[] args) {
		for(int i = 1;i<6 ;i++) {
			String p= "";
			for(int j =0;j<2*i-1;j++) {
				p = p+ "*"+" ";
			}
			System.out.println(p);
//			System.out.println("\n");
		}
	}

}
