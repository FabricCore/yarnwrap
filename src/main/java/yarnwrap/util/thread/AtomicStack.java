package yarnwrap.util.thread;
public class AtomicStack { public net.minecraft.util.thread.AtomicStack wrapperContained; public AtomicStack(net.minecraft.util.thread.AtomicStack wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.concurrent.atomic.AtomicReferenceArray contents() { return wrapperContained.contents; }
// public void contents(java.util.concurrent.atomic.AtomicReferenceArray value) { wrapperContained.contents = value; }
// public static java.util.concurrent.atomic.AtomicReferenceArray contents() { return net.minecraft.util.thread.AtomicStack.contents; }
// public static void contents(java.util.concurrent.atomic.AtomicReferenceArray value, ) { net.minecraft.util.thread.AtomicStack.contents = value; }

// public java.util.concurrent.atomic.AtomicInteger size() { return wrapperContained.size; }
// public void size(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.size = value; }
// public static java.util.concurrent.atomic.AtomicInteger size() { return net.minecraft.util.thread.AtomicStack.size; }
// public static void size(java.util.concurrent.atomic.AtomicInteger value, ) { net.minecraft.util.thread.AtomicStack.size = value; }

public AtomicStack(int maxSize) { this.wrapperContained = new net.minecraft.util.thread.AtomicStack(maxSize); }
public java.util.List toList() { return wrapperContained.toList(); }
// public static java.util.List toList() { return net.minecraft.util.thread.AtomicStack.toList(); }
public void push(java.lang.Object value) { wrapperContained.push(value); }
// public static void push(java.lang.Object value, ) { net.minecraft.util.thread.AtomicStack.push(value); }

}