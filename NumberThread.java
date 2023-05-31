import java.util.*;

public class NumberThread extends Thread{
   Scanner sc=new Scanner(System.in);
   public void run() {
	   System.out.println("Enter number greater than 4 digit");
	   String s=sc.next();
	   ArrayList<String> a=new ArrayList<>();
//	   ArrayList<Integer> a1=new ArrayList<>();
	   a.add("zero"); a.add("one"); a.add("two"); a.add("three"); a.add("four"); a.add("five"); a.add("six");
	   a.add("seven"); a.add("eight"); a.add("nine");
	   if(s.length()>=4) {
		   for(int i=0;i<s.length();i++) {
			   System.out.print(a.get(s.charAt(i)-'0')+" ");
		   }
	   }
	   else {
		   System.out.println("Please enter number greater than 4 digit!");
	   }
   }
}