package yarnwrap.util.profiler;
public class ScopedProfiler { public net.minecraft.util.profiler.ScopedProfiler wrapperContained; public ScopedProfiler(net.minecraft.util.profiler.ScopedProfiler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.profiler.ScopedProfiler DUMMY() { return new yarnwrap.util.profiler.ScopedProfiler(wrapperContained.DUMMY); }
// public void DUMMY(yarnwrap.util.profiler.ScopedProfiler value) { wrapperContained.DUMMY = value.wrapperContained; }
public static yarnwrap.util.profiler.ScopedProfiler DUMMY() { return new yarnwrap.util.profiler.ScopedProfiler(net.minecraft.util.profiler.ScopedProfiler.DUMMY); }
// public static void DUMMY(yarnwrap.util.profiler.ScopedProfiler value, ) { net.minecraft.util.profiler.ScopedProfiler.DUMMY = value.wrapperContained; }

// public yarnwrap.util.profiler.Profiler wrapped() { return new yarnwrap.util.profiler.Profiler(wrapperContained.wrapped); }
// public void wrapped(yarnwrap.util.profiler.Profiler value) { wrapperContained.wrapped = value.wrapperContained; }
// public static yarnwrap.util.profiler.Profiler wrapped() { return new yarnwrap.util.profiler.Profiler(net.minecraft.util.profiler.ScopedProfiler.wrapped); }
// public static void wrapped(yarnwrap.util.profiler.Profiler value, ) { net.minecraft.util.profiler.ScopedProfiler.wrapped = value.wrapperContained; }

// public ScopedProfiler(yarnwrap.util.profiler.Profiler wrapped) { this.wrapperContained = new net.minecraft.util.profiler.ScopedProfiler(wrapped.wrapperContained); }
public yarnwrap.util.profiler.ScopedProfiler setColor(int color) { return new yarnwrap.util.profiler.ScopedProfiler(wrapperContained.setColor(color)); }
// public static yarnwrap.util.profiler.ScopedProfiler setColor(int color, ) { return new yarnwrap.util.profiler.ScopedProfiler(net.minecraft.util.profiler.ScopedProfiler.setColor(color)); }
public yarnwrap.util.profiler.ScopedProfiler addValue(long value) { return new yarnwrap.util.profiler.ScopedProfiler(wrapperContained.addValue(value)); }
// public static yarnwrap.util.profiler.ScopedProfiler addValue(long value, ) { return new yarnwrap.util.profiler.ScopedProfiler(net.minecraft.util.profiler.ScopedProfiler.addValue(value)); }
public yarnwrap.util.profiler.ScopedProfiler addLabel(java.lang.String label) { return new yarnwrap.util.profiler.ScopedProfiler(wrapperContained.addLabel(label)); }
// public static yarnwrap.util.profiler.ScopedProfiler addLabel(java.lang.String label, ) { return new yarnwrap.util.profiler.ScopedProfiler(net.minecraft.util.profiler.ScopedProfiler.addLabel(label)); }
public yarnwrap.util.profiler.ScopedProfiler addLabel(java.util.function.Supplier labelSupplier) { return new yarnwrap.util.profiler.ScopedProfiler(wrapperContained.addLabel(labelSupplier)); }
// public static yarnwrap.util.profiler.ScopedProfiler addLabel(java.util.function.Supplier labelSupplier, ) { return new yarnwrap.util.profiler.ScopedProfiler(net.minecraft.util.profiler.ScopedProfiler.addLabel(labelSupplier)); }

}