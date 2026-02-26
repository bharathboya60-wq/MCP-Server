package Practices;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class CountOfWords {

	public static void main(String[] args) {
		String Sentence = "Hello Ramu Hello Ramu Hello Ramu Hello Ramu Ramu rey rev is" ;
		
		String[] words = Sentence.split(" ");
		
		String[] NoDup = Arrays.stream(words)
                .distinct()
                .toArray(String[]::new);
		
		for(int i = 0; i<NoDup.length;i++) {
			int count = 0;
			for(int j=0;j<words.length;j++) {
				if(NoDup[i].equals(words[j])) {
					count=count+1;
				}
			}
			System.out.println(NoDup[i]+ " Repeated for "+ count+ " times");
			
		}
		
		
		Map<String, Integer> WordsCount = new HashMap<String, Integer>();
		for(int i=0;i<words.length;i++) {
			int count =1;
			if(!WordsCount.containsKey(words[i])) {
				WordsCount.put(words[i], count);
			}
			else {
				WordsCount.put(words[i], WordsCount.get(words[i])+1);
			}
			
		}
		
		for(String wd : WordsCount.keySet()) {
			System.out.println(wd + " repeated " + WordsCount.get(wd));
		}
		
		
		

	}

}
