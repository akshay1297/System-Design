package behavioral.strategy.navigator;


// A user can select multiple routes method (Road, By train, By Bus, By walk ....) dynamically.
// If we have a single Navigator class which implements all the routing method then code will be inefficient and hard to maintain.
/*
Solution :
We can separate each route method into different classes and use one class (Context) to dynamically use these objects.
- RouteStrategy - Interface
    - Road
    - Walk
    - PublicTransport
- NavigatorContext
    - reference - RouteStrategy
-  ClientCode - User
    - Uses NavigatorContext
 */
public class User {
        public static void main(String[] args){
            NavigatorContext navigatorContext = new NavigatorContext(new PublicTransport("Delhi"));
        navigatorContext.getRoute();

        NavigatorContext navigatorContext1 = new NavigatorContext(new RoadRoute("Delhi"));
        navigatorContext1.getRoute();

        NavigatorContext navigatorContext2 = new NavigatorContext(new WalkRoute("Delhi"));
        navigatorContext2.getRoute();


    }

}
