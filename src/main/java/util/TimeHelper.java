package yarnwrap.util;
public class TimeHelper { public net.minecraft.util.TimeHelper wrapperContained; public TimeHelper(net.minecraft.util.TimeHelper wrapperContained) { this.wrapperContained = wrapperContained; }

public long SECOND_IN_NANOS() { return wrapperContained.SECOND_IN_NANOS; }
public long MILLI_IN_NANOS() { return wrapperContained.MILLI_IN_NANOS; }
public long SECOND_IN_MILLIS() { return wrapperContained.SECOND_IN_MILLIS; }
public long HOUR_IN_SECONDS() { return wrapperContained.HOUR_IN_SECONDS; }
public int MINUTE_IN_SECONDS() { return wrapperContained.MINUTE_IN_SECONDS; }
public yarnwrap.util.math.intprovider.UniformIntProvider betweenSeconds(int min,int max) { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.betweenSeconds(min,max)); }

}