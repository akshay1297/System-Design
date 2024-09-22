package behavioral.strategy.navigator;

public class RoadRoute implements RouteStrategy{
    private String destination;

    public RoadRoute(String destination) {
        this.destination = destination;
    }

    @Override
    public void buildRoute() {
        System.out.println("Road route between A and B.");
    }
}
