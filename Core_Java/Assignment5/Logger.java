public class Logger {
    // Static field to hold the single instance of the Logger class
    private static Logger instance;
    private StringBuilder logMessages;

    // Private constructor to prevent instantiation from outside the class
    private Logger() {
        logMessages = new StringBuilder();
    }

    // Static method to return the single instance of the Logger class
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to add a log message
    public void log(String message) {
        logMessages.append(message).append("\n");
    }

    // Method to get all log messages
    public String getLog() {
        return logMessages.toString();
    }

    // Method to clear all log messages
    public void clearLog() {
        logMessages.setLength(0);
    }
}
