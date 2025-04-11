package yarnwrap.util.crash;
public class CrashException { public net.minecraft.util.crash.CrashException wrapperContained; public CrashException(net.minecraft.util.crash.CrashException wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.crash.CrashReport report() { return new yarnwrap.util.crash.CrashReport(wrapperContained.report); }
// public void report(yarnwrap.util.crash.CrashReport value) { wrapperContained.report = value.wrapperContained; }
public CrashException(yarnwrap.util.crash.CrashReport report) { this.wrapperContained = new net.minecraft.util.crash.CrashException(report.wrapperContained); }
public yarnwrap.util.crash.CrashReport getReport() { return new yarnwrap.util.crash.CrashReport(wrapperContained.getReport()); }

}