package creational.builder.customizedComputer;

public class Client {
    public static void main(String[] args){
        Computer computer = new Computer.ComputerBuilder().setCpu("CPU").setGraphicCard("GraphicCard").build();

        System.out.println(computer);
    }
}
