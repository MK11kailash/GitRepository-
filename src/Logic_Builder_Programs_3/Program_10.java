package Logic_Builder_Programs_3;

import java.util.Arrays;
import java.util.List;

import javax.swing.JList;

public class Program_10 {

	public static void main(String[] args) { 
		
// 10) write a program to print all number from 1-100 just don’t print numbers like 10,20,30,40….100
		
		List<Integer>skip = Arrays.asList(10,20,30,40,50,60,70,80,90,100);
		
		for(int i=1; i<100; i++) {	
		if(skip.contains(i)){	
		continue;
		}
		System.out.println(i);
		}
	    }
        }


	
	

