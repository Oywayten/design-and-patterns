package vitaliy.grab.proxy.gumballmachinev1;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Oywayten 21.08.2023.
 */

public interface GumballMachineRemote extends Remote {
    int getCount() throws RemoteException;
    String getLocation() throws RemoteException;
    State getState() throws RemoteException;
}
