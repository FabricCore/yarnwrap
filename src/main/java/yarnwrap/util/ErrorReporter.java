package yarnwrap.util;
public class ErrorReporter { public net.minecraft.util.ErrorReporter wrapperContained; public ErrorReporter(net.minecraft.util.ErrorReporter wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.ErrorReporter makeChild(java.lang.String name) { return new yarnwrap.util.ErrorReporter(wrapperContained.makeChild(name)); }
public void report(java.lang.String message) { wrapperContained.report(message); }

}