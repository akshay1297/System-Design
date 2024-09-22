package structural.adapter.roundhole;

public class Client {
    public static void main(String[] args){
        RoundHole hole = new RoundHole(2.2);
        RoundPeg peg = new RoundPeg(1.9);
        System.out.println(hole.fits(peg));

        // above code is only with RoundHole and RoundPeg
        // now if we want to fit SquarePeg ??? - create an adapter class and convert the logic what RoundHole accepts and give that to RoundHole.
        // SquarePeg (width) ->  SquarePegAdapter(converts width to radius | extends RoundPeg) -> RoundHole

        SquarePeg squarePeg = new SquarePeg(1);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        System.out.println(hole.fits(squarePegAdapter));
    }
}
