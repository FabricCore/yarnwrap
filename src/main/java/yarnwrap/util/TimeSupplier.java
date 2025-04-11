package yarnwrap.util;
public class TimeSupplier { public net.minecraft.util.TimeSupplier wrapperContained; public TimeSupplier(net.minecraft.util.TimeSupplier wrapperContained) { this.wrapperContained = wrapperContained; }

public long get(java.util.concurrent.TimeUnit timeUnit) { return wrapperContained.get(timeUnit); }

}