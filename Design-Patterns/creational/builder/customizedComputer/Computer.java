package creational.builder.customizedComputer;

public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String graphicCard;
    private String operatingSystem;
    private String powerSupply;
    private String monitor;

    // constructor is private not public
    private Computer(ComputerBuilder computerBuilder) {
        this.cpu = computerBuilder.cpu;
        this.monitor = computerBuilder.monitor;
        this.graphicCard = computerBuilder.graphicCard;
        this.ram = computerBuilder.ram;
        this.storage = computerBuilder.storage;
        this.operatingSystem = computerBuilder.operatingSystem;
        this.powerSupply = computerBuilder.powerSupply;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + cpu + ", RAM=" + ram + ", Storage=" + storage +
                ", Graphic Card=" + graphicCard + ", Operating System=" + operatingSystem +
                ", Power Supply=" + powerSupply + ", Monitor=" + monitor + "]";
    }


    public static class ComputerBuilder {
    private String cpu;
    private String ram;
    private String storage;
    private String graphicCard;
    private String operatingSystem;
    private String powerSupply;
    private String monitor;

    public ComputerBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public ComputerBuilder setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
        return this;
    }

    public ComputerBuilder setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    public ComputerBuilder setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
        return this;
    }

    public ComputerBuilder setMonitor(String monitor) {
        this.monitor = monitor;
        return this;
    }

    public Computer build(){
        return new Computer(this);
    }
}
}
