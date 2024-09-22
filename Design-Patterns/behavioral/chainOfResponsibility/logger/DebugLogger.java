package behavioral.chainOfResponsibility.logger;

public class DebugLogger extends  Logger{


    @Override
    protected boolean canHandle(LogLevel logLevel) {
        return logLevel == LogLevel.DEBUG;
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("Debug: " +  message);
    }
}
