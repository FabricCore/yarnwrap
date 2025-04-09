package yarnwrap.util.thread;
public class AtomicStack { public net.minecraft.util.thread.AtomicStack wrapperContained; public AtomicStack(net.minecraft.util.thread.AtomicStack wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.concurrent.atomic.AtomicReferenceArray contents() { return wrapperContained.contents; }
// public java.util.concurrent.atomic.AtomicInteger size() { return wrapperContained.size; }
public java.util.List toList() { return wrapperContained.toList(); }
public void push(java.lang.Object value) { wrapperContained.push(value); }

}