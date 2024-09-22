package behavioral.strategy.navigator;

public class PublicTransport implements RouteStrategy{

    private String destination;

    public PublicTransport(String destination) {
        this.destination = destination;
    }

    @Override
    public void buildRoute() {
        System.out.println("Public route between A and B.");
    }
}
