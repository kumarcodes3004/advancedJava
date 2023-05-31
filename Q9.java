
public class Q9{
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
         NumberThread numObj=new NumberThread();
         StringThread strObj=new StringThread();
         
         numObj.start();
         Thread.sleep(10000);
         System.out.println();
         strObj.start();
	}
}
