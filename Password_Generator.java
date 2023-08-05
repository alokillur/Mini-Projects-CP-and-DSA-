package ai001;

import java.util.Random;
import java.util.Scanner;
public class Password_Generator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		char symb[]= {'!','@','#','$','%','^','&','*','(',')','{','}','[',']',':',';','<','>','?','/'};
		System.out.println("Enter the number of DIGITS Required in your Password:");
		int d=sc.nextInt();
		System.out.println("Enter the number of LETTERS Required in your Password:");
		int l=sc.nextInt();
		System.out.println("Enter the number of SYMBOLS Required in your Password:");
		int s=sc.nextInt();
		
		int total=d+l+s;
		int count=0;
		int count1 = 0,count2=0,count3=0;
		Random random=new Random();
		while(count!=total) {
			int pick=random.nextInt(10)%3;
			if(pick==1 && count1<d) {
				sb.append(random.nextInt(9));
				count1++;
				count++;
				System.out.println(sb.toString());
			}
			else if(pick==0 && count3<s) {
				int z=random.nextInt(20);
				sb.append(symb[z]);
				count3++;
				count++;
				System.out.println(sb.toString());
			}
			else if(pick==2 && count2<l) {
				sb.append((char)(Math.random()*26+65));
				count2++;
				count++;
				System.out.println(sb.toString());
			}
		}
		System.out.print("Password Generated:"+" ");
		System.out.println(sb.toString());
	}
}
