package yarnwrap.util;
public class ThrowableDeliverer { public net.minecraft.util.ThrowableDeliverer wrapperContained; public ThrowableDeliverer(net.minecraft.util.ThrowableDeliverer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Throwable throwable() { return wrapperContained.throwable; }
// public void throwable(java.lang.Throwable value) { wrapperContained.throwable = value; }
// public void deliver() { wrapperContained.deliver(); }
public void add(java.lang.Throwable throwable) { wrapperContained.add(throwable); }

}