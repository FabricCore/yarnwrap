package yarnwrap.util;
public class ErrorReporter { public net.minecraft.util.ErrorReporter wrapperContained; public ErrorReporter(net.minecraft.util.ErrorReporter wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.ErrorReporter EMPTY() { return new yarnwrap.util.ErrorReporter(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.util.ErrorReporter value) { wrapperContained.EMPTY = value.wrapperContained; }
// public static yarnwrap.util.ErrorReporter EMPTY() { return new yarnwrap.util.ErrorReporter(net.minecraft.util.ErrorReporter.EMPTY); }
// public static void EMPTY(yarnwrap.util.ErrorReporter value, ) { net.minecraft.util.ErrorReporter.EMPTY = value.wrapperContained; }

// public yarnwrap.util.ErrorReporter makeChild(Object context) { return new yarnwrap.util.ErrorReporter(wrapperContained.makeChild(context)); }
// public static yarnwrap.util.ErrorReporter makeChild(Object context, ) { return new yarnwrap.util.ErrorReporter(net.minecraft.util.ErrorReporter.makeChild(context)); }
// public void report(Object error) { wrapperContained.report(error); }
// public static void report(Object error, ) { net.minecraft.util.ErrorReporter.report(error); }

}