package factory.method.concrete.creator;

import factory.method.concrete.product.Truck;
import factory.method.creator.Logistics;
import factory.method.product.Transport;

/**
 * Concrete creator: Road Logistics
 *
 * @author Saivarma Akarapu
 */
public class RoadLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Truck();
    }

}
