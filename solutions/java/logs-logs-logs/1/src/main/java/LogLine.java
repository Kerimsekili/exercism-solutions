public class LogLine {
    String logLine;
    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String log = this.logLine.substring(1,4);
        LogLevel level = null;
        switch (log) {
            case "TRC":
                level = LogLevel.TRACE;
                break;
            case "DBG":
                level = LogLevel.DEBUG;
                break;
            case "INF":
                level = LogLevel.INFO;
                break;
            case "WRN":
                level = LogLevel.WARNING;
                break;
            case "ERR":
                level = LogLevel.ERROR;
                break;
            case "FTL":
                level = LogLevel.FATAL;
                break;
            default:
                level = LogLevel.UNKNOWN;
        }
        return level;
    }

    public String getOutputForShortLog() {
        String message = logLine.substring(7);
        LogLevel lvlType = this.getLogLevel();
        return lvlType.getNumber()+":"+message;
    }
}
