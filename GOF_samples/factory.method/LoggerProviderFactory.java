package patterns.factory.method;

/**
 *
 */

interface ILogger {
    void LogMessage(String message);

    void LogError(String message);

    void LogVerboseInformation(String message);
}

class Log4NetLogger implements ILogger {
    @Override
    public void LogMessage(String message) {
        System.out.println(String.format("{0}: {1}", "Log4Net", message));
    }

    @Override
    public void LogError(String message) {

    }

    @Override
    public void LogVerboseInformation(String message) {

    }
}

class EnterpriseLogger implements ILogger {

    @Override
    public void LogMessage(String message) {

    }

    @Override
    public void LogError(String message) {

    }

    @Override
    public void LogVerboseInformation(String message) {

    }
}


public class LoggerProviderFactory {
    public static ILogger GetLoggingProvider(LoggingProviders logProviders) {
        switch (logProviders) {
            case Enterprise:
                return new EnterpriseLogger();
            case Log4Net:
                return new Log4NetLogger();
            default:
                return new EnterpriseLogger();
        }
    }

    private static LoggingProviders GetTypeOfLoggingProviderFromConfigFile() {
        return LoggingProviders.Log4Net;
    }

    public static void main(String [] args) {
        LoggingProviders providerType = GetTypeOfLoggingProviderFromConfigFile();
        ILogger logger = LoggerProviderFactory.GetLoggingProvider(providerType);
        logger.LogMessage("Hello Factory Method Design Pattern.");
// Вывод: [Log4Net: Hello Factory Method Design Pattern]
    }
}

enum LoggingProviders {
    Log4Net, Enterprise
}
