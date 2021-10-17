package rmiHello;

import java.rmi.*;

/**
 * @author Pawnesh Mishra
 *
 */
public interface Hello extends Remote {
	public String msg(String input) throws RemoteException;
}
