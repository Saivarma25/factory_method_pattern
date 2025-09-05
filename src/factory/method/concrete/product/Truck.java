package factory.method.concrete.product;

import factory.method.print.Print;
import factory.method.product.Transport;

/**
 * Concrete product: Truck
 *
 * @author Saivarma Akarapu
 */
public class Truck implements Transport {

    @Override
    public void deliver() {
        Print.print("Delivering by land in a truck");
    }

}
