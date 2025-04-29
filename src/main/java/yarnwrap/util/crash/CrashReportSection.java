package yarnwrap.util.crash;
public class CrashReportSection { public net.minecraft.util.crash.CrashReportSection wrapperContained; public CrashReportSection(net.minecraft.util.crash.CrashReportSection wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List elements() { return wrapperContained.elements; }
// public void elements(java.util.List value) { wrapperContained.elements = value; }
// public static java.util.List elements() { return net.minecraft.util.crash.CrashReportSection.elements; }
// public static void elements(java.util.List value, ) { net.minecraft.util.crash.CrashReportSection.elements = value; }

// public java.lang.String title() { return wrapperContained.title; }
// public void title(java.lang.String value) { wrapperContained.title = value; }
// public static java.lang.String title() { return net.minecraft.util.crash.CrashReportSection.title; }
// public static void title(java.lang.String value, ) { net.minecraft.util.crash.CrashReportSection.title = value; }

// public java.lang.StackTraceElement[] stackTrace() { return wrapperContained.stackTrace; }
// public void stackTrace(java.lang.StackTraceElement[] value) { wrapperContained.stackTrace = value; }
// public static java.lang.StackTraceElement[] stackTrace() { return net.minecraft.util.crash.CrashReportSection.stackTrace; }
// public static void stackTrace(java.lang.StackTraceElement[] value, ) { net.minecraft.util.crash.CrashReportSection.stackTrace = value; }

public CrashReportSection(java.lang.String title) { this.wrapperContained = new net.minecraft.util.crash.CrashReportSection(title); }
public void addStackTrace(java.lang.StringBuilder crashReportBuilder) { wrapperContained.addStackTrace(crashReportBuilder); }
// public static void addStackTrace(java.lang.StringBuilder crashReportBuilder, ) { net.minecraft.util.crash.CrashReportSection.addStackTrace(crashReportBuilder); }
public java.lang.StackTraceElement[] getStackTrace() { return wrapperContained.getStackTrace(); }
// public static java.lang.StackTraceElement[] getStackTrace() { return net.minecraft.util.crash.CrashReportSection.getStackTrace(); }
public yarnwrap.util.crash.CrashReportSection add(java.lang.String name,yarnwrap.util.crash.CrashCallable callable) { return new yarnwrap.util.crash.CrashReportSection(wrapperContained.add(name,callable.wrapperContained)); }
// public static yarnwrap.util.crash.CrashReportSection add(java.lang.String name,yarnwrap.util.crash.CrashCallable callable, ) { return new yarnwrap.util.crash.CrashReportSection(net.minecraft.util.crash.CrashReportSection.add(name,callable.wrapperContained)); }
public yarnwrap.util.crash.CrashReportSection add(java.lang.String name,java.lang.Object detail) { return new yarnwrap.util.crash.CrashReportSection(wrapperContained.add(name,detail)); }
// public static yarnwrap.util.crash.CrashReportSection add(java.lang.String name,java.lang.Object detail, ) { return new yarnwrap.util.crash.CrashReportSection(net.minecraft.util.crash.CrashReportSection.add(name,detail)); }
public int initStackTrace(int ignoredCallCount) { return wrapperContained.initStackTrace(ignoredCallCount); }
// public static int initStackTrace(int ignoredCallCount, ) { return net.minecraft.util.crash.CrashReportSection.initStackTrace(ignoredCallCount); }
public void trimStackTraceEnd(int callCount) { wrapperContained.trimStackTraceEnd(callCount); }
// public static void trimStackTraceEnd(int callCount, ) { net.minecraft.util.crash.CrashReportSection.trimStackTraceEnd(callCount); }
// public java.lang.String createPositionString(yarnwrap.world.HeightLimitView world,int x,int y,int z) { return wrapperContained.createPositionString(world.wrapperContained,x,y,z); }
// public static java.lang.String createPositionString(yarnwrap.world.HeightLimitView world,int x,int y,int z, ) { return net.minecraft.util.crash.CrashReportSection.createPositionString(world.wrapperContained,x,y,z); }
// public java.lang.String createPositionString(yarnwrap.world.HeightLimitView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.createPositionString(world.wrapperContained,pos.wrapperContained); }
// public static java.lang.String createPositionString(yarnwrap.world.HeightLimitView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.util.crash.CrashReportSection.createPositionString(world.wrapperContained,pos.wrapperContained); }
// public java.lang.String createPositionString(yarnwrap.world.HeightLimitView world,double x,double y,double z) { return wrapperContained.createPositionString(world.wrapperContained,x,y,z); }
// public static java.lang.String createPositionString(yarnwrap.world.HeightLimitView world,double x,double y,double z, ) { return net.minecraft.util.crash.CrashReportSection.createPositionString(world.wrapperContained,x,y,z); }
public boolean shouldGenerateStackTrace(java.lang.StackTraceElement prev,java.lang.StackTraceElement next) { return wrapperContained.shouldGenerateStackTrace(prev,next); }
// public static boolean shouldGenerateStackTrace(java.lang.StackTraceElement prev,java.lang.StackTraceElement next, ) { return net.minecraft.util.crash.CrashReportSection.shouldGenerateStackTrace(prev,next); }
public void add(java.lang.String name,java.lang.Throwable throwable) { wrapperContained.add(name,throwable); }
// public static void add(java.lang.String name,java.lang.Throwable throwable, ) { net.minecraft.util.crash.CrashReportSection.add(name,throwable); }
// public void addBlockInfo(yarnwrap.util.crash.CrashReportSection element,yarnwrap.world.HeightLimitView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.addBlockInfo(element.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void addBlockInfo(yarnwrap.util.crash.CrashReportSection element,yarnwrap.world.HeightLimitView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.util.crash.CrashReportSection.addBlockInfo(element.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained); }

}