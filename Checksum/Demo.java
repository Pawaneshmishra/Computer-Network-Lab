import java.util.Scanner;
import java.io.*;

public class Demo 
{ 
	public static void main(String[] args)
	{ 
		Scanner reader = new Scanner(System.in);
		PrintStream stream = new PrintStream(System.out);

		char[] a = new char[20], b = new char[20];
		char[] sum = new char[20], complement = new char[20];
		int i;
		
		System.out.print("Enter first binary string\n");
		a = reader.next().toCharArray();

		System.out.print("Enter second binary string\n");
		b = reader.next().toCharArray();

		if(a.length==b.length)
		{
			char carry = '0';
			int length = a.length;

			for(i=length-1; i>=0; i--)
			{
				if(a[i]=='0' && b[i]=='0' && carry=='0')
				{
					sum[i]='0';
					carry='0';
				}

				else if(a[i]=='0' && b[i]=='0' && carry=='1')
				{
					sum[i]='1';
					carry='0';
				}

				else if(a[i]=='0' && b[i]=='1' && carry=='0')
				{
					sum[i]='1';
					carry='0';
				}

				else if(a[i]=='0' && b[i]=='1' && carry=='1')
				{
					sum[i]='0';
					carry='1';
				}

				else if(a[i]=='1' && b[i]=='0' && carry=='0')
				{
					sum[i]='1';
					carry='0';
				}
				
				else if(a[i]=='1' && b[i]=='0' && carry=='1')
				{
					sum[i]='0';
					carry='1';
				}

				else if(a[i]=='1' && b[i]=='1' && carry=='0')
				{
					sum[i]='0';
					carry='1';
				}

				else if(a[i]=='1' && b[i]=='1' && carry=='1')
				{
					sum[i]='1';
					carry='1';
				}

				else break;
			}
			System.out.printf("Sum=%c",carry);
			stream.println(sum);
            stream.flush();

			for(i=0; i<length; i++)
			{
				if(sum[i]=='0') complement[i]='1';
				else complement[i]='0';
			}

			if(carry=='1') carry='0';
        	else carry='1';

			System.out.printf("Checksum=%c",carry);
			stream.println(complement);
			stream.flush();

			if(carry=='1') 
			{
				System.out.println("Error has occured");
				System.exit(0);
			}

			for(i=0; i<complement.length; i++)
			{
				if(complement[i]=='1')
				{
					System.out.println("Error has occured");
					System.exit(0);
				}
			}
		}

		else System.out.println("\nWrong input strings");
		
	} 
}