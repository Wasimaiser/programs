import java.util.Iterator;
import java.util.Scanner;

public class StringDuplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		char temp;
		String dChar = sc.next();
		for (int i = 0; i < dChar.length(); i++) {
			for (int j =0; j < dChar.length(); j++) {
				if(i!=j) {
				if(dChar.charAt(i)==dChar.charAt(j)) {
					temp=dChar.charAt(i);
					System.out.println("Duplicate :"+temp);
					
					break;
				}
				}
			}
		}
	}
}
