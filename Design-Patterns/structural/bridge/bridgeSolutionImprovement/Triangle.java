package structural.bridge.bridgeSolutionImprovement;


public class Triangle extends Shape {

    @Override
    public void draw() {
        if(this.colorImplementor != null){
            System.out.println("Triangle shape is colored with " + this.colorImplementor.colorShape());

        }
        else{
            System.out.println("Triangle shape.");

        }    }
}
