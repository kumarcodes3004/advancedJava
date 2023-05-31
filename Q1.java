package q1;
import java.util.*;
class MissedCalls{
	int tel;
	String name;
	MissedCalls(int tel,String name){
		this.tel=tel;
		this.name=name;
	}
	
}
public class Q1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,String> Contacts= new HashMap<Integer,String>();
		ArrayList<MissedCalls> MissList=new ArrayList<MissedCalls>();
		Contacts.put(120, "Suresh");
		Contacts.put(121, "Ramesh");
		Contacts.put(122, "Bhavesh");
		Contacts.forEach((key,value)->{
			System.out.println(key+" "+value);
		});
		System.out.println("1.Add Missed Call\n2.Display Missed Call\n3.Delete the Missed Call\n4.Exit");
		while(true) {
			System.out.println("Enter your Choice:");
			int ch=sc.nextInt();
			System.out.println("Hello! World");
			switch(ch) {
			case 1: System.out.println("Enter the Number:");
					int num=sc.nextInt();
					String name= "";
					if(Contacts.containsKey(num))
						name=Contacts.get(num);
					else
						name="Private Caller";
					MissedCalls m=new MissedCalls(num,name);
					MissList.add(m);
					for(MissedCalls mit:MissList)
						System.out.println(mit.tel+" "+mit.name);
					break;
			case 2: System.out.println("The Missed Call Details are:");
					for(MissedCalls mit:MissList)
						System.out.println(mit.tel+" "+mit.name);
					break;
			case 3: System.out.println("Enter the Number to Delete:");
					int delNum=sc.nextInt();
					MissList.remove(delNum);
					System.out.println("The Missed Call Details are:");
					for(MissedCalls mit:MissList)
					System.out.println(mit.tel+" "+mit.name);
					break;
			case 4:	System.out.println("Thank You!");
					System.exit(0);
					break;					
			}
		}
	}
}
