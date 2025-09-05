import factory.method.concrete.creator.RoadLogistics;
import factory.method.concrete.creator.SeaLogistics;
import factory.method.creator.Logistics;

public class FactoryMethodDesignPatternApp {

    private static Logistics logistics;

    public static void main(String[] args) {


        // Abstraction from actual products, only depend on factory methods
        // Follows Open/Closed principle
        configure("road");
        logistics.planDelivery();

        configure("sea");
        logistics.planDelivery();

    }

    private static void configure(String road) {
        switch (road) {
            case "road": logistics = new RoadLogistics(); break;
            case "sea": logistics = new SeaLogistics(); break;
            default: System.exit(1);
        }
    }

}
