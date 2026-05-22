package ArrayTest;

public class StringsQuestions {
	
	public void calling() {
		
		this.checkPalindrome();
		
		System.out.println();
		
		this.reverseString();
		
		System.out.println();
		this.checkCharacterfrequency();
		
	}
	
	public void checkPalindrome() {
		
		String name = "DamD";
		
		// to check palindrome
		
		String output = "";
		
		char[] nm = name.toCharArray();
		
		for(int i = nm.length -1; i >=0 ; i--) {
			char ch = nm[i];
			output = output + ch;
		}
		
		if(name.equals(output)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
	
	
	//2nd Quesition  reverse the string
	
	public void reverseString() {
		
		String name = "Dnyanesh";
		String output = "";
		
		
		for(int t = name.length() - 1 ; t >= 0 ; t--) {
			
			char ch = name.charAt(t);
			output = output + ch;
		}
		
		System.out.println(output);
	}
	
	//Question 3
	
	// check the character frequency
	
	public void checkCharacterfrequency() {
		
		String nms = "Programming";
		
		char[] ch = nms.toCharArray();
		int count = 0;
		
//		Take boolean array and make them all false
		boolean[] arr = new boolean[ch.length]; 
		
		
		for(int i = 0; i < ch.length; i++) {
			
			if(arr[i]) {
				continue;
			}
			
			for(int j = 0; j < ch.length; j++) {
				
				if(ch[i] == ch[j]) {
					count++;
					arr[j] = true;
				}
				
			}
		
			
			System.out.println("Count :" + ch[i] +" = "+ count);
			count = 0;
		}
		
		
	}
	
	
	//4th
	
	

}
