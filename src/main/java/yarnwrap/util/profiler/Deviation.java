package yarnwrap.util.profiler;
public class Deviation { public net.minecraft.util.profiler.Deviation wrapperContained; public Deviation(net.minecraft.util.profiler.Deviation wrapperContained) { this.wrapperContained = wrapperContained; }

public java.time.Instant instant() { return wrapperContained.instant; }
// public void instant(java.time.Instant value) { wrapperContained.instant = value; }
// public static java.time.Instant instant() { return net.minecraft.util.profiler.Deviation.instant; }
// public static void instant(java.time.Instant value, ) { net.minecraft.util.profiler.Deviation.instant = value; }

public int ticks() { return wrapperContained.ticks; }
// public void ticks(int value) { wrapperContained.ticks = value; }
// public static int ticks() { return net.minecraft.util.profiler.Deviation.ticks; }
// public static void ticks(int value, ) { net.minecraft.util.profiler.Deviation.ticks = value; }

public yarnwrap.util.profiler.ProfileResult result() { return new yarnwrap.util.profiler.ProfileResult(wrapperContained.result); }
// public void result(yarnwrap.util.profiler.ProfileResult value) { wrapperContained.result = value.wrapperContained; }
// public static yarnwrap.util.profiler.ProfileResult result() { return new yarnwrap.util.profiler.ProfileResult(net.minecraft.util.profiler.Deviation.result); }
// public static void result(yarnwrap.util.profiler.ProfileResult value, ) { net.minecraft.util.profiler.Deviation.result = value.wrapperContained; }

public Deviation(java.time.Instant instant,int ticks,yarnwrap.util.profiler.ProfileResult result) { this.wrapperContained = new net.minecraft.util.profiler.Deviation(instant,ticks,result.wrapperContained); }

}