package factory.method.creator;

import factory.method.product.Transport;

/**
 * Creator with factory method
 *
 * @author Saivarma Akarapu
 */
public abstract class Logistics {

    // Factory method
    public abstract Transport createTransport();

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }

}
