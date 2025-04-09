package yarnwrap.util.crash;
public class CrashReport { public net.minecraft.util.crash.CrashReport wrapperContained; public CrashReport(net.minecraft.util.crash.CrashReport wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean hasStackTrace() { return wrapperContained.hasStackTrace; }
// public java.lang.String message() { return wrapperContained.message; }
// public java.lang.StackTraceElement[] stackTrace() { return wrapperContained.stackTrace; }
// public java.util.List otherSections() { return wrapperContained.otherSections; }
// public java.nio.file.Path file() { return wrapperContained.file; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.util.SystemDetails systemDetailsSection() { return new yarnwrap.util.SystemDetails(wrapperContained.systemDetailsSection); }
// public java.lang.Throwable cause() { return wrapperContained.cause; }
// public java.time.format.DateTimeFormatter DATE_TIME_FORMATTER() { return wrapperContained.DATE_TIME_FORMATTER; }
public void initCrashReport() { wrapperContained.initCrashReport(); }
public java.lang.String getStackTrace() { return wrapperContained.getStackTrace(); }
public void addDetails(java.lang.StringBuilder crashReportBuilder) { wrapperContained.addDetails(crashReportBuilder); }
public yarnwrap.util.crash.CrashReportSection addElement(java.lang.String name,int ignoredStackTraceCallCount) { return new yarnwrap.util.crash.CrashReportSection(wrapperContained.addElement(name,ignoredStackTraceCallCount)); }
public java.lang.String getCauseAsString() { return wrapperContained.getCauseAsString(); }
public yarnwrap.util.crash.CrashReport create(java.lang.Throwable cause,java.lang.String title) { return new yarnwrap.util.crash.CrashReport(wrapperContained.create(cause,title)); }
public java.lang.String getMessage() { return wrapperContained.getMessage(); }
public yarnwrap.util.crash.CrashReportSection addElement(java.lang.String name) { return new yarnwrap.util.crash.CrashReportSection(wrapperContained.addElement(name)); }
public java.lang.Throwable getCause() { return wrapperContained.getCause(); }
public yarnwrap.util.SystemDetails getSystemDetailsSection() { return new yarnwrap.util.SystemDetails(wrapperContained.getSystemDetailsSection()); }
public boolean writeToFile(java.nio.file.Path path,yarnwrap.util.crash.ReportType type,java.util.List extraInfo) { return wrapperContained.writeToFile(path,type.wrapperContained,extraInfo); }
public java.nio.file.Path getFile() { return wrapperContained.getFile(); }
public boolean writeToFile(java.nio.file.Path path,yarnwrap.util.crash.ReportType type) { return wrapperContained.writeToFile(path,type.wrapperContained); }
public java.lang.String asString(yarnwrap.util.crash.ReportType type) { return wrapperContained.asString(type.wrapperContained); }
public java.lang.String asString(yarnwrap.util.crash.ReportType type,java.util.List extraInfo) { return wrapperContained.asString(type.wrapperContained,extraInfo); }

}