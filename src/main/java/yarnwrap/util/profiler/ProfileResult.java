package yarnwrap.util.profiler;
public class ProfileResult { public net.minecraft.util.profiler.ProfileResult wrapperContained; public ProfileResult(net.minecraft.util.profiler.ProfileResult wrapperContained) { this.wrapperContained = wrapperContained; }

// public char SPLITTER_CHAR() { return wrapperContained.SPLITTER_CHAR; }
// public void SPLITTER_CHAR(char value) { wrapperContained.SPLITTER_CHAR = value; }
public static char SPLITTER_CHAR() { return net.minecraft.util.profiler.ProfileResult.SPLITTER_CHAR; }
// public static void SPLITTER_CHAR(char value, ) { net.minecraft.util.profiler.ProfileResult.SPLITTER_CHAR = value; }

public java.util.List getTimings(java.lang.String parentPath) { return wrapperContained.getTimings(parentPath); }
// public static java.util.List getTimings(java.lang.String parentPath, ) { return net.minecraft.util.profiler.ProfileResult.getTimings(parentPath); }
public long getStartTime() { return wrapperContained.getStartTime(); }
// public static long getStartTime() { return net.minecraft.util.profiler.ProfileResult.getStartTime(); }
public boolean save(java.nio.file.Path path) { return wrapperContained.save(path); }
// public static boolean save(java.nio.file.Path path, ) { return net.minecraft.util.profiler.ProfileResult.save(path); }
public int getEndTick() { return wrapperContained.getEndTick(); }
// public static int getEndTick() { return net.minecraft.util.profiler.ProfileResult.getEndTick(); }
public long getTimeSpan() { return wrapperContained.getTimeSpan(); }
// public static long getTimeSpan() { return net.minecraft.util.profiler.ProfileResult.getTimeSpan(); }
public int getStartTick() { return wrapperContained.getStartTick(); }
// public static int getStartTick() { return net.minecraft.util.profiler.ProfileResult.getStartTick(); }
public long getEndTime() { return wrapperContained.getEndTime(); }
// public static long getEndTime() { return net.minecraft.util.profiler.ProfileResult.getEndTime(); }
public int getTickSpan() { return wrapperContained.getTickSpan(); }
// public static int getTickSpan() { return net.minecraft.util.profiler.ProfileResult.getTickSpan(); }
// public java.lang.String getHumanReadableName(java.lang.String path) { return wrapperContained.getHumanReadableName(path); }
// public static java.lang.String getHumanReadableName(java.lang.String path, ) { return net.minecraft.util.profiler.ProfileResult.getHumanReadableName(path); }
public java.lang.String getRootTimings() { return wrapperContained.getRootTimings(); }
// public static java.lang.String getRootTimings() { return net.minecraft.util.profiler.ProfileResult.getRootTimings(); }

}