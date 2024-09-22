package behavioral.chainOfResponsibility.logger;

public class ErrorLogger extends Logger {
    @Override
    protected boolean canHandle(LogLevel logLevel) {
        return logLevel == LogLevel.ERROR;
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("Error: " + message);
    }
}
