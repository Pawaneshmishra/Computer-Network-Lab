import java.net.*;
import java.util.*;

public class HostnameResolve 
{
	public static void main(String[] args){ 
		String HostName; 
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter The host name: "); 
		HostName = input.nextLine(); 
		try { 
			InetAddress address = InetAddress.getByName(HostName);
			System.out.println("IP address: " + address.getHostAddress());
		} 
		catch (UnknownHostException ex) {
		     System.out.println("Could not find " + HostName); 
		}
	}
}