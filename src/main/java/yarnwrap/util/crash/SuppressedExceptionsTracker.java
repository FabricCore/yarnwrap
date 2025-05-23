package yarnwrap.util.crash;
public class SuppressedExceptionsTracker { public net.minecraft.util.crash.SuppressedExceptionsTracker wrapperContained; public SuppressedExceptionsTracker(net.minecraft.util.crash.SuppressedExceptionsTracker wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_QUEUE_SIZE() { return wrapperContained.MAX_QUEUE_SIZE; }
// public void MAX_QUEUE_SIZE(int value) { wrapperContained.MAX_QUEUE_SIZE = value; }
// public static int MAX_QUEUE_SIZE() { return net.minecraft.util.crash.SuppressedExceptionsTracker.MAX_QUEUE_SIZE; }
// public static void MAX_QUEUE_SIZE(int value, ) { net.minecraft.util.crash.SuppressedExceptionsTracker.MAX_QUEUE_SIZE = value; }

// public java.util.Queue queue() { return wrapperContained.queue; }
// public void queue(java.util.Queue value) { wrapperContained.queue = value; }
// public static java.util.Queue queue() { return net.minecraft.util.crash.SuppressedExceptionsTracker.queue; }
// public static void queue(java.util.Queue value, ) { net.minecraft.util.crash.SuppressedExceptionsTracker.queue = value; }

// public it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap keyToCount() { return wrapperContained.keyToCount; }
// public void keyToCount(it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap value) { wrapperContained.keyToCount = value; }
// public static it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap keyToCount() { return net.minecraft.util.crash.SuppressedExceptionsTracker.keyToCount; }
// public static void keyToCount(it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap value, ) { net.minecraft.util.crash.SuppressedExceptionsTracker.keyToCount = value; }

public java.lang.String collect() { return wrapperContained.collect(); }
// public static java.lang.String collect() { return net.minecraft.util.crash.SuppressedExceptionsTracker.collect(); }
public void onSuppressedException(java.lang.String location,java.lang.Throwable exception) { wrapperContained.onSuppressedException(location,exception); }
// public static void onSuppressedException(java.lang.String location,java.lang.Throwable exception, ) { net.minecraft.util.crash.SuppressedExceptionsTracker.onSuppressedException(location,exception); }
// public long currentTimeMillis() { return wrapperContained.currentTimeMillis(); }
// public static long currentTimeMillis() { return net.minecraft.util.crash.SuppressedExceptionsTracker.currentTimeMillis(); }

}