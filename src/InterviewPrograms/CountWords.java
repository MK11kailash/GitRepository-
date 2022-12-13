package InterviewPrograms;

public class CountWords {
	
	public static void main(String[] args) {
//	Program: write a program to count number of words in the sentence
		int count=1;
		String str= "Hey this is java program"; 
		for(int i=0; i<str.length();i++) {  
		if(str.charAt(i)== ' ') {
		count++;		
		}
	    }
		System.out.println(count);	
	    }
        }
