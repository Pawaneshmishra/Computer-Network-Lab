package rmiHello;

import java.rmi.*;
import java.rmi.server.*;

/**
 * @author Pawnesh Mishra 
 *
 */
public class HelloImpl extends UnicastRemoteObject implements Hello{
	public HelloImpl() throws RemoteException{
		super();
	}
	
	public String msg(String input) throws RemoteException{
		String str = "Client stub: "+input;
		return str;
	}
}
