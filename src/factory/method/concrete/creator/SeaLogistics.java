package factory.method.concrete.creator;

import factory.method.concrete.product.Ship;
import factory.method.creator.Logistics;
import factory.method.product.Transport;

/**
 * Concrete creator: Sea Logistics
 *
 * @author Saivarma Akarapu
 */
public class SeaLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Ship();
    }

}
