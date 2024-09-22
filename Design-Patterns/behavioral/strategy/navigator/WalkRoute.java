package behavioral.strategy.navigator;

public class WalkRoute implements RouteStrategy{

    private String destination;

    public WalkRoute(String destination) {
        this.destination = destination;
    }

    @Override
    public void buildRoute() {
        System.out.println("Walk route between A and B.");
    }
}
