package yarnwrap.util.thread;
public class GroupAssigningThreadFactory { public net.minecraft.util.thread.GroupAssigningThreadFactory wrapperContained; public GroupAssigningThreadFactory(net.minecraft.util.thread.GroupAssigningThreadFactory wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.util.thread.GroupAssigningThreadFactory.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.util.thread.GroupAssigningThreadFactory.LOGGER = value; }

// public java.lang.ThreadGroup group() { return wrapperContained.group; }
// public void group(java.lang.ThreadGroup value) { wrapperContained.group = value; }
// public static java.lang.ThreadGroup group() { return net.minecraft.util.thread.GroupAssigningThreadFactory.group; }
// public static void group(java.lang.ThreadGroup value, ) { net.minecraft.util.thread.GroupAssigningThreadFactory.group = value; }

// public java.util.concurrent.atomic.AtomicInteger nextIndex() { return wrapperContained.nextIndex; }
// public void nextIndex(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.nextIndex = value; }
// public static java.util.concurrent.atomic.AtomicInteger nextIndex() { return net.minecraft.util.thread.GroupAssigningThreadFactory.nextIndex; }
// public static void nextIndex(java.util.concurrent.atomic.AtomicInteger value, ) { net.minecraft.util.thread.GroupAssigningThreadFactory.nextIndex = value; }

// public java.lang.String prefix() { return wrapperContained.prefix; }
// public void prefix(java.lang.String value) { wrapperContained.prefix = value; }
// public static java.lang.String prefix() { return net.minecraft.util.thread.GroupAssigningThreadFactory.prefix; }
// public static void prefix(java.lang.String value, ) { net.minecraft.util.thread.GroupAssigningThreadFactory.prefix = value; }

public GroupAssigningThreadFactory(java.lang.String name) { this.wrapperContained = new net.minecraft.util.thread.GroupAssigningThreadFactory(name); }
// public void method_34995(java.lang.Runnable thread,java.lang.Thread throwable) { wrapperContained.method_34995(thread,throwable); }
// public static void method_34995(java.lang.Runnable thread,java.lang.Thread throwable, ) { net.minecraft.util.thread.GroupAssigningThreadFactory.method_34995(thread,throwable); }
public java.lang.Thread newThread(java.lang.Runnable r) { return wrapperContained.newThread(r); }
// public static java.lang.Thread newThread(java.lang.Runnable r, ) { return net.minecraft.util.thread.GroupAssigningThreadFactory.newThread(r); }

}