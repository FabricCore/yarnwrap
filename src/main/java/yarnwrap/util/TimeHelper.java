package yarnwrap.util;
public class TimeHelper { public net.minecraft.util.TimeHelper wrapperContained; public TimeHelper(net.minecraft.util.TimeHelper wrapperContained) { this.wrapperContained = wrapperContained; }

public long SECOND_IN_NANOS() { return wrapperContained.SECOND_IN_NANOS; }
// public void SECOND_IN_NANOS(long value) { wrapperContained.SECOND_IN_NANOS = value; }
public long MILLI_IN_NANOS() { return wrapperContained.MILLI_IN_NANOS; }
// public void MILLI_IN_NANOS(long value) { wrapperContained.MILLI_IN_NANOS = value; }
public long SECOND_IN_MILLIS() { return wrapperContained.SECOND_IN_MILLIS; }
// public void SECOND_IN_MILLIS(long value) { wrapperContained.SECOND_IN_MILLIS = value; }
public long HOUR_IN_SECONDS() { return wrapperContained.HOUR_IN_SECONDS; }
// public void HOUR_IN_SECONDS(long value) { wrapperContained.HOUR_IN_SECONDS = value; }
public int MINUTE_IN_SECONDS() { return wrapperContained.MINUTE_IN_SECONDS; }
// public void MINUTE_IN_SECONDS(int value) { wrapperContained.MINUTE_IN_SECONDS = value; }
public yarnwrap.util.math.intprovider.UniformIntProvider betweenSeconds(int min,int max) { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.betweenSeconds(min,max)); }

}