package q2;
import java.util.*;
class book{
	String title,author,publisher;
	int price;
	book(String title,String author, String publisher,int price){
		this.title=title;
		this.author=author;
		this.publisher=publisher;
		this.price=price;
	}
}
class bookCompare implements Comparator<book>{
	public int compare(book b1,book b2) {
		if(b1.price>b2.price)
			return 1;
		else if(b1.price<b2.price)
			return -1;
		else
			return 0;
	}
}
public class Q2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		book b1=new book("A","AA","AAA",800);
		book b2=new book("B","BB","BBB",400);
		book b3=new book("C","CC","AAA",300);
		book b4=new book("D","DD","AAA",1000);
		book b5=new book("B2","BB","BBB",1500);
		ArrayList<book> bList=new ArrayList<>();
		bList.add(b1);
		bList.add(b2);
		bList.add(b3);
		bList.add(b4);
		bList.add(b5);
		System.out.println("Book List Before Sorting:");
		for(book b:bList)
			System.out.println(b.title+" "+b.author+" "+b.publisher+" "+b.price);
		Collections.sort(bList,new bookCompare());
		System.out.println("Book List After Sorting:");
		for(book b:bList)
			System.out.println(b.title+" "+b.author+" "+b.publisher+" "+b.price);
		System.out.println("<-------------------------------------------------->");
		HashMap<Integer,book> bListUnique=new HashMap<Integer,book>();
		Integer i=100;
		for(book b:bList)
			bListUnique.put(i++, b);
		bListUnique.forEach((key,value)->{
			System.out.println(key+" "+value.title+" "+value.author+" "+value.publisher+" "+value.price);
		});
		System.out.println("<-------------------------------------------------->");
		System.out.println("Enter the Author Name:");
		String auth=sc.next();
		for(book b:bList)
			if(b.author.equals(auth))
				System.out.println(b.title+" "+b.publisher+" "+b.price);
		System.out.println("<-------------------------------------------------->");
		System.out.println("Enter the Base Price:");
		int bp=sc.nextInt();
		ArrayList<book> bpLess=new ArrayList<>();
		for(book b:bList)
			if(b.price>bp)
				bpLess.add(b);
		for(book b:bpLess)
			System.out.println(b.title+" "+b.author+" "+b.publisher+" "+b.price);	
		System.out.println("<-------------------------------------------------->");
		System.out.println("Enter the value to match:");
		String match=sc.next();
		for(book b:bList)
			if(b.title.contains(match))
				System.out.println(b.title+" "+b.author+" "+b.publisher+" "+b.price);
		System.out.println("<-------------------------------------------------->");
		System.out.println("Enter the Publisher:");
		String pub=sc.next();
		for(book b:bList)
			if(b.publisher.equals(pub))
				System.out.println(b.title+" "+b.author+" "+b.publisher+" "+b.price);
		System.out.println("<-------------------------------------------------->");
		System.out.println("Enter the Title:");
		String tit=sc.next();
		for(book b:bList)
		{
			if(b.title.equals(tit))
			{
				System.out.println("Old Publisher is: "+b.publisher);
				System.out.println("Enter New Publisher Name:");
				String newPub= sc.next();
				b.publisher=newPub;
				System.out.println("The New Book Details are:");
				System.out.println(b.title+" "+b.author+" "+b.publisher+" "+b.price);
			}
		}
	}

}
