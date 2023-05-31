import java.util.*;
public class StringThread extends Thread{
  Scanner sc=new Scanner(System.in);
  public void run() {
	  String vowel="aeiouAEIOU";
	  System.out.println("Enter a string: ");
	  String s=sc.nextLine();
	  int c=0;
	  for(int i=0;i<s.length();i++) {
		  if(vowel.indexOf(s.charAt(i))!=-1) {
			  c++;
		  }
	  }
	  System.out.println("Number of vowel is: "+c);
  }
}
