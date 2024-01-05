import java.util.Scanner;

public class InputNumber 
{
	public static void main(String[] args) 
		{
	Scanner sc=new Scanner(System.in);
	String k="";
	System.out.println("Enter the Number");
	 String inputNo=sc.next();
	 int fact,rev = 0;
	 for(int j=inputNo.length()-1;j>=0;j--)
	 {
		 k=k+inputNo.charAt(j);
	 }
	 System.out.println(k);
		System.out.println("Enter the Number");
	 int num=sc.nextInt();
	 while(num!=0)
	 {
		 fact=num%10;
		 rev=rev*10+fact;
		 num=num/10;
	 }
	 System.out.println(rev);
	 
	 
		}
}
