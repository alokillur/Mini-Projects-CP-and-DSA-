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
		Random random=new Random();
		while(count!=total) {
			int pick=random.nextInt(9)%3;
			if(pick==1) 
				sb.append(random.nextInt(9));
			else if(pick==2) 
				sb.append((char)(Math.random()*26+65));
			else
				sb.append(symb[random.nextInt(20)]);
			count++;
		}
		System.out.println(sb.toString());
	}
}