package yarnwrap.util.crash;
public class CrashReport { public net.minecraft.util.crash.CrashReport wrapperContained; public CrashReport(net.minecraft.util.crash.CrashReport wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean hasStackTrace() { return wrapperContained.hasStackTrace; }
// public void hasStackTrace(boolean value) { wrapperContained.hasStackTrace = value; }
// public static boolean hasStackTrace() { return net.minecraft.util.crash.CrashReport.hasStackTrace; }
// public static void hasStackTrace(boolean value, ) { net.minecraft.util.crash.CrashReport.hasStackTrace = value; }

// public java.lang.String message() { return wrapperContained.message; }
// public void message(java.lang.String value) { wrapperContained.message = value; }
// public static java.lang.String message() { return net.minecraft.util.crash.CrashReport.message; }
// public static void message(java.lang.String value, ) { net.minecraft.util.crash.CrashReport.message = value; }

// public java.lang.StackTraceElement[] stackTrace() { return wrapperContained.stackTrace; }
// public void stackTrace(java.lang.StackTraceElement[] value) { wrapperContained.stackTrace = value; }
// public static java.lang.StackTraceElement[] stackTrace() { return net.minecraft.util.crash.CrashReport.stackTrace; }
// public static void stackTrace(java.lang.StackTraceElement[] value, ) { net.minecraft.util.crash.CrashReport.stackTrace = value; }

// public java.util.List otherSections() { return wrapperContained.otherSections; }
// public void otherSections(java.util.List value) { wrapperContained.otherSections = value; }
// public static java.util.List otherSections() { return net.minecraft.util.crash.CrashReport.otherSections; }
// public static void otherSections(java.util.List value, ) { net.minecraft.util.crash.CrashReport.otherSections = value; }

// public java.nio.file.Path file() { return wrapperContained.file; }
// public void file(java.nio.file.Path value) { wrapperContained.file = value; }
// public static java.nio.file.Path file() { return net.minecraft.util.crash.CrashReport.file; }
// public static void file(java.nio.file.Path value, ) { net.minecraft.util.crash.CrashReport.file = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.util.crash.CrashReport.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.util.crash.CrashReport.LOGGER = value; }

// public yarnwrap.util.SystemDetails systemDetailsSection() { return new yarnwrap.util.SystemDetails(wrapperContained.systemDetailsSection); }
// public void systemDetailsSection(yarnwrap.util.SystemDetails value) { wrapperContained.systemDetailsSection = value.wrapperContained; }
// public static yarnwrap.util.SystemDetails systemDetailsSection() { return new yarnwrap.util.SystemDetails(net.minecraft.util.crash.CrashReport.systemDetailsSection); }
// public static void systemDetailsSection(yarnwrap.util.SystemDetails value, ) { net.minecraft.util.crash.CrashReport.systemDetailsSection = value.wrapperContained; }

// public java.lang.Throwable cause() { return wrapperContained.cause; }
// public void cause(java.lang.Throwable value) { wrapperContained.cause = value; }
// public static java.lang.Throwable cause() { return net.minecraft.util.crash.CrashReport.cause; }
// public static void cause(java.lang.Throwable value, ) { net.minecraft.util.crash.CrashReport.cause = value; }

// public java.time.format.DateTimeFormatter DATE_TIME_FORMATTER() { return wrapperContained.DATE_TIME_FORMATTER; }
// public void DATE_TIME_FORMATTER(java.time.format.DateTimeFormatter value) { wrapperContained.DATE_TIME_FORMATTER = value; }
// public static java.time.format.DateTimeFormatter DATE_TIME_FORMATTER() { return net.minecraft.util.crash.CrashReport.DATE_TIME_FORMATTER; }
// public static void DATE_TIME_FORMATTER(java.time.format.DateTimeFormatter value, ) { net.minecraft.util.crash.CrashReport.DATE_TIME_FORMATTER = value; }

public CrashReport(java.lang.String message,java.lang.Throwable cause) { this.wrapperContained = new net.minecraft.util.crash.CrashReport(message,cause); }
// public void initCrashReport() { wrapperContained.initCrashReport(); }
public static void initCrashReport() { net.minecraft.util.crash.CrashReport.initCrashReport(); }
public java.lang.String getStackTrace() { return wrapperContained.getStackTrace(); }
// public static java.lang.String getStackTrace() { return net.minecraft.util.crash.CrashReport.getStackTrace(); }
public void addDetails(java.lang.StringBuilder crashReportBuilder) { wrapperContained.addDetails(crashReportBuilder); }
// public static void addDetails(java.lang.StringBuilder crashReportBuilder, ) { net.minecraft.util.crash.CrashReport.addDetails(crashReportBuilder); }
public yarnwrap.util.crash.CrashReportSection addElement(java.lang.String name,int ignoredStackTraceCallCount) { return new yarnwrap.util.crash.CrashReportSection(wrapperContained.addElement(name,ignoredStackTraceCallCount)); }
// public static yarnwrap.util.crash.CrashReportSection addElement(java.lang.String name,int ignoredStackTraceCallCount, ) { return new yarnwrap.util.crash.CrashReportSection(net.minecraft.util.crash.CrashReport.addElement(name,ignoredStackTraceCallCount)); }
public java.lang.String getCauseAsString() { return wrapperContained.getCauseAsString(); }
// public static java.lang.String getCauseAsString() { return net.minecraft.util.crash.CrashReport.getCauseAsString(); }
// public yarnwrap.util.crash.CrashReport create(java.lang.Throwable cause,java.lang.String title) { return new yarnwrap.util.crash.CrashReport(wrapperContained.create(cause,title)); }
// public static yarnwrap.util.crash.CrashReport create(java.lang.Throwable cause,java.lang.String title, ) { return new yarnwrap.util.crash.CrashReport(net.minecraft.util.crash.CrashReport.create(cause,title)); }
public java.lang.String getMessage() { return wrapperContained.getMessage(); }
// public static java.lang.String getMessage() { return net.minecraft.util.crash.CrashReport.getMessage(); }
public yarnwrap.util.crash.CrashReportSection addElement(java.lang.String name) { return new yarnwrap.util.crash.CrashReportSection(wrapperContained.addElement(name)); }
// public static yarnwrap.util.crash.CrashReportSection addElement(java.lang.String name, ) { return new yarnwrap.util.crash.CrashReportSection(net.minecraft.util.crash.CrashReport.addElement(name)); }
public java.lang.Throwable getCause() { return wrapperContained.getCause(); }
// public static java.lang.Throwable getCause() { return net.minecraft.util.crash.CrashReport.getCause(); }
public yarnwrap.util.SystemDetails getSystemDetailsSection() { return new yarnwrap.util.SystemDetails(wrapperContained.getSystemDetailsSection()); }
// public static yarnwrap.util.SystemDetails getSystemDetailsSection() { return new yarnwrap.util.SystemDetails(net.minecraft.util.crash.CrashReport.getSystemDetailsSection()); }
public boolean writeToFile(java.nio.file.Path path,yarnwrap.util.crash.ReportType type,java.util.List extraInfo) { return wrapperContained.writeToFile(path,type.wrapperContained,extraInfo); }
// public static boolean writeToFile(java.nio.file.Path path,yarnwrap.util.crash.ReportType type,java.util.List extraInfo, ) { return net.minecraft.util.crash.CrashReport.writeToFile(path,type.wrapperContained,extraInfo); }
public java.nio.file.Path getFile() { return wrapperContained.getFile(); }
// public static java.nio.file.Path getFile() { return net.minecraft.util.crash.CrashReport.getFile(); }
public boolean writeToFile(java.nio.file.Path path,yarnwrap.util.crash.ReportType type) { return wrapperContained.writeToFile(path,type.wrapperContained); }
// public static boolean writeToFile(java.nio.file.Path path,yarnwrap.util.crash.ReportType type, ) { return net.minecraft.util.crash.CrashReport.writeToFile(path,type.wrapperContained); }
public java.lang.String asString(yarnwrap.util.crash.ReportType type) { return wrapperContained.asString(type.wrapperContained); }
// public static java.lang.String asString(yarnwrap.util.crash.ReportType type, ) { return net.minecraft.util.crash.CrashReport.asString(type.wrapperContained); }
public java.lang.String asString(yarnwrap.util.crash.ReportType type,java.util.List extraInfo) { return wrapperContained.asString(type.wrapperContained,extraInfo); }
// public static java.lang.String asString(yarnwrap.util.crash.ReportType type,java.util.List extraInfo, ) { return net.minecraft.util.crash.CrashReport.asString(type.wrapperContained,extraInfo); }

}