package vitaliy.grab.proxy.gumballmachinev1;

import java.io.Serializable;

/**
 * Oywayten 19.08.2023.
 */

public interface State extends Serializable {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();

    void refill();
}
