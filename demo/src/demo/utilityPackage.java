package demo;

import java.util.Scanner;

import java.util.StringTokenizer;

public class utilityPackage {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String userinput=sc.nextLine();
		userinput=userinput.strip();//remove whitespace
		
		StringTokenizer st=new StringTokenizer(userinput," ");//seperate ech word in string using space
		System.out.println(st);
		
		System.out.println("Vowel count for each word in string:");
		while(st.hasMoreTokens())//check until the encounter the space
		{
			String word=st.nextToken();
			System.out.println("THE PROCESSING WORD:"+word);
			int vowelcount=0;
			for(char c:word.toCharArray())//to convert the word into array
			{
				c = Character.toLowerCase(c);
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
					vowelcount++;

			}
			System.out.println("THE WORD "+word+" HAS "+vowelcount+" VOWELS");
		}
		
		
		
		

	}

}
