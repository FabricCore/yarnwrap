package yarnwrap.util.profiler;
public class ProfileResult { public net.minecraft.util.profiler.ProfileResult wrapperContained; public ProfileResult(net.minecraft.util.profiler.ProfileResult wrapperContained) { this.wrapperContained = wrapperContained; }

public char SPLITTER_CHAR() { return wrapperContained.SPLITTER_CHAR; }
public java.util.List getTimings(java.lang.String parentPath) { return wrapperContained.getTimings(parentPath); }
public long getStartTime() { return wrapperContained.getStartTime(); }
public boolean save(java.nio.file.Path path) { return wrapperContained.save(path); }
public int getEndTick() { return wrapperContained.getEndTick(); }
public long getTimeSpan() { return wrapperContained.getTimeSpan(); }
public int getStartTick() { return wrapperContained.getStartTick(); }
public long getEndTime() { return wrapperContained.getEndTime(); }
public int getTickSpan() { return wrapperContained.getTickSpan(); }
// public java.lang.String getHumanReadableName(java.lang.String path) { return wrapperContained.getHumanReadableName(path); }
public java.lang.String getRootTimings() { return wrapperContained.getRootTimings(); }

}