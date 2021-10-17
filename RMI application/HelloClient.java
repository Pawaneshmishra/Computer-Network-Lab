package rmiHello;

import java.net.*;
import java.rmi.*;
import java.util.Scanner;

/**
 * @author Pawnesh Mishra
 *
 */
public class HelloClient {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Client RMI stub is running...");
			Hello stb = (Hello)Naming.lookup("rmi://localhost:1900/Hello");
			Scanner scan = new Scanner(System.in);
			String input;
			System.out.print("Enter your message: ");
			
			input = scan.nextLine();
			System.out.println(stb.msg(input));
			
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Stub error...");
			e.printStackTrace();
		}
	}

}
