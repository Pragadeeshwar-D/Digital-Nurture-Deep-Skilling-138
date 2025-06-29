import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ErrorWarningLogger {
    private static final Logger logger = LoggerFactory.getLogger(ErrorWarningLogger.class);

    public static void main(String[] args) {
        logger.info("Application started.");

        try {
            simulateError();
        } catch (Exception e) {
            logger.error("An error occurred while processing: {}", e.getMessage());
        }

        simulateWarning();
        logger.info("Application ended.");
    }

    private static void simulateError() throws Exception {
        throw new Exception("Sample simulated exception");
    }

    private static void simulateWarning() {
        logger.warn("This is a sample warning message!");
    }
}