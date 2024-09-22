package structural.bridge.bridgeSolutionImprovement;


public class Square extends Shape {

    @Override
    public void draw() {
        if(this.colorImplementor != null){
            System.out.println("Square shape is colored with " + this.colorImplementor.colorShape());

        }
        else{
            System.out.println("Square shape.");

        }


    }
}
