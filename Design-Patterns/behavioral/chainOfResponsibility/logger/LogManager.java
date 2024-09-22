package behavioral.chainOfResponsibility.logger;

public class LogManager {
    public static Logger getChainOfLoggers(){
        Logger infoLogger = new InfoLogger();
        Logger debugLogger = new DebugLogger();
        Logger errorLogger = new ErrorLogger();

        errorLogger.setNextLogger(debugLogger).setNextLogger(infoLogger);
        return errorLogger;
    }



}
