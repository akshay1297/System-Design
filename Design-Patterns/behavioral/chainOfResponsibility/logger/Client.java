package behavioral.chainOfResponsibility.logger;

public class Client {

    public static void main(String[] args){
        Logger loggerChain = LogManager.getChainOfLoggers();
        loggerChain.logMessage("This is an info message", LogLevel.INFO);
        loggerChain.logMessage("This is a debug message", LogLevel.DEBUG);
        loggerChain.logMessage("This is an error message", LogLevel.ERROR);
    }

}
