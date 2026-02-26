package Practices;

import java.util.Arrays;
import java.util.Collections;


public class ManipulateArrays {

	public static void main(String[] args) {
		
		String[] Days = {"Monday", "Tuesday", "Wednesday", "Thursday","Friday","Saturday","Sunday"};
		
		Arrays.stream(Days).map(Day->Day.substring(0, 4)).forEach(Day -> System.out.println(Day));
		
		for(int i=0; i< Days.length; i++) {
			Days[i] = Days[i].substring(0, 3);
		}
		
		for(String day: Days) {
		System.out.println(day);
	}
}
}
