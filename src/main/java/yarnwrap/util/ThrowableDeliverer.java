package yarnwrap.util;
public class ThrowableDeliverer { public net.minecraft.util.ThrowableDeliverer wrapperContained; public ThrowableDeliverer(net.minecraft.util.ThrowableDeliverer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Throwable throwable() { return wrapperContained.throwable; }
// public void throwable(java.lang.Throwable value) { wrapperContained.throwable = value; }
// public static java.lang.Throwable throwable() { return net.minecraft.util.ThrowableDeliverer.throwable; }
// public static void throwable(java.lang.Throwable value, ) { net.minecraft.util.ThrowableDeliverer.throwable = value; }

// public void deliver() { wrapperContained.deliver(); }
// public static void deliver() { net.minecraft.util.ThrowableDeliverer.deliver(); }
public void add(java.lang.Throwable throwable) { wrapperContained.add(throwable); }
// public static void add(java.lang.Throwable throwable, ) { net.minecraft.util.ThrowableDeliverer.add(throwable); }

}