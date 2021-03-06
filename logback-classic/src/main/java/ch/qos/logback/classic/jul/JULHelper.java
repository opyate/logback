package ch.qos.logback.classic.jul;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;

public class JULHelper {


  static public final boolean isRegularNonRootLogger(java.util.logging.Logger julLogger) {
    if (julLogger == null)
      return false;
    return !julLogger.getName().equals("");
  }

  static public final boolean isRoot(java.util.logging.Logger julLogger) {
    if (julLogger == null)
      return false;
    return julLogger.getName().equals("");
  }

  static public java.util.logging.Level asJULLevel(Level lbLevel) {
    switch (lbLevel.levelInt) {
      case Level.TRACE_INT:
        return java.util.logging.Level.FINEST;
      case Level.DEBUG_INT:
        return java.util.logging.Level.FINE;
      case Level.INFO_INT:
        return java.util.logging.Level.INFO;
      case Level.WARN_INT:
        return java.util.logging.Level.WARNING;
      case Level.ERROR_INT:
        return java.util.logging.Level.SEVERE;
      default:
        throw new IllegalArgumentException("Unexpected level [" + lbLevel + "]");
    }
  }

  static public String asJULLoggerName(String loggerName) {
    if (Logger.ROOT_LOGGER_NAME.equals(loggerName))
      return "";
    else
      return loggerName;
  }

  static public java.util.logging.Logger asJULLogger(String loggerName) {
    String julLoggerName = asJULLoggerName(loggerName);
    return java.util.logging.Logger.getLogger(julLoggerName);
  }

  static public java.util.logging.Logger asJULLogger(Logger logger) {
    return asJULLogger(logger.getName());
  }

}


