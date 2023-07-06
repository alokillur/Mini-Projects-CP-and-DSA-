import java.util.Scanner;

public class Cypher
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the String:"); //ALOK
		String str=sc.nextLine();
		System.out.print("Enter the Key:"); //5 ----> FQTP
		int key=sc.nextInt();
		System.out.println("Enter choice \n1:ENCODE\n2:DECODE");
		int choice=sc.nextInt();
		if(choice==1)
			encode(str,key);
		else {
			decode(str, key);
		}
	}
	public static void encode(String str,int key)
	{
		if(key>26)
		{
			key=key%26;
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
				char ch=(str.charAt(i));
				if(ch==' ') {
					sb.append(" ");
				}
				else {
					char ch1=(char) (ch+key);
					sb.append(ch1);
				}	
		}
		System.out.println(sb.toString());
	}
	public static void decode(String str,int key)
	{
		if(key>26)
		{
			key=key%26;
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{

			char ch=(str.charAt(i));
			if(ch==' ') {
				sb.append(" ");
			}
			else {
				char ch1=(char) (ch-key);
				sb.append(ch1);
			}	
		}
		System.out.println(sb.toString());
	}
}
