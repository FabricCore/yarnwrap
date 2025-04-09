package yarnwrap.util.crash;
public class CrashReportSection { public net.minecraft.util.crash.CrashReportSection wrapperContained; public CrashReportSection(net.minecraft.util.crash.CrashReportSection wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List elements() { return wrapperContained.elements; }
// public java.lang.String title() { return wrapperContained.title; }
// public java.lang.StackTraceElement[] stackTrace() { return wrapperContained.stackTrace; }
public void addStackTrace(java.lang.StringBuilder crashReportBuilder) { wrapperContained.addStackTrace(crashReportBuilder); }
public java.lang.StackTraceElement[] getStackTrace() { return wrapperContained.getStackTrace(); }
public yarnwrap.util.crash.CrashReportSection add(java.lang.String name,yarnwrap.util.crash.CrashCallable callable) { return new yarnwrap.util.crash.CrashReportSection(wrapperContained.add(name,callable.wrapperContained)); }
public yarnwrap.util.crash.CrashReportSection add(java.lang.String name,java.lang.Object detail) { return new yarnwrap.util.crash.CrashReportSection(wrapperContained.add(name,detail)); }
public int initStackTrace(int ignoredCallCount) { return wrapperContained.initStackTrace(ignoredCallCount); }
public void trimStackTraceEnd(int callCount) { wrapperContained.trimStackTraceEnd(callCount); }
public java.lang.String createPositionString(yarnwrap.world.HeightLimitView world,int x,int y,int z) { return wrapperContained.createPositionString(world.wrapperContained,x,y,z); }
public java.lang.String createPositionString(yarnwrap.world.HeightLimitView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.createPositionString(world.wrapperContained,pos.wrapperContained); }
public java.lang.String createPositionString(yarnwrap.world.HeightLimitView world,double x,double y,double z) { return wrapperContained.createPositionString(world.wrapperContained,x,y,z); }
public boolean shouldGenerateStackTrace(java.lang.StackTraceElement prev,java.lang.StackTraceElement next) { return wrapperContained.shouldGenerateStackTrace(prev,next); }
public void add(java.lang.String name,java.lang.Throwable throwable) { wrapperContained.add(name,throwable); }
public void addBlockInfo(yarnwrap.util.crash.CrashReportSection element,yarnwrap.world.HeightLimitView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.addBlockInfo(element.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained); }

}