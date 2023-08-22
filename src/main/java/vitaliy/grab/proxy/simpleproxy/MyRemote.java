package vitaliy.grab.proxy.simpleproxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Oywayten 21.08.2023.
 */

public interface MyRemote extends Remote {
    String sayHello() throws RemoteException;
}
