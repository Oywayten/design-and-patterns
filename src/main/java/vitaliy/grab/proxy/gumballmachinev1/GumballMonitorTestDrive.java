package vitaliy.grab.proxy.gumballmachinev1;

import java.rmi.Naming;

/**
 * Oywayten 22.08.2023.
 */

public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String[] location = {"rmi://localhost/gumballmachine"};
        GumballMonitor[] monitor = new GumballMonitor[location.length];
        for (int i = 0; i < location.length; i++) {
            try {
                GumballMachineRemote machine =
                        (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        for (GumballMonitor gumballMonitor : monitor) {
            gumballMonitor.report();
        }
    }
}
