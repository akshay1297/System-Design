package behavioral.chainOfResponsibility.logger;

public abstract class Logger {
    protected Logger nextLogger;

    public Logger setNextLogger(Logger nextLogger){
        this.nextLogger = nextLogger;
        return nextLogger;
    }

   public void logMessage(String message, LogLevel logLevel){
            if(canHandle(logLevel)){
                writeMessage(message);
            }
            else if(nextLogger != null){
                nextLogger.logMessage(message, logLevel);
            }
    }

    protected abstract boolean canHandle(LogLevel logLevel);
    protected abstract void writeMessage(String message);
}
