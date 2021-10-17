package rmiHello;

import java.rmi.*;
import java.rmi.registry.*;

/**
 * @author Pawnesh Mishra
 *
 */
public class HelloServer {
public static void main(String[] args) {
// TODO Auto-generated method stub
try {
	System.out.println("Hello RMI Server is running...");
	Hello skltn = new HelloImpl();
	Registry registry = LocateRegistry.createRegistry(1900);
			
	registry.rebind("Hello", skltn);
			
} catch (RemoteException e) {
	// TODO Auto-generated catch block
	System.out.println("Server is not running.....");
	e.printStackTrace();
		}
	}
}
