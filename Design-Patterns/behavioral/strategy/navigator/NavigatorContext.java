package behavioral.strategy.navigator;

public class NavigatorContext {
    private RouteStrategy routeStrategy;

    public NavigatorContext(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void getRoute(){
        this.routeStrategy.buildRoute();
    }
}
