package factory.method.concrete.product;

import factory.method.print.Print;
import factory.method.product.Transport;

/**
 * Concrete product: Ship
 *
 * @author Saivarma Akarapu
 */
public class Ship implements Transport {

    @Override
    public void deliver() {
        Print.print("Delivering by sea in a ship");
    }

}
