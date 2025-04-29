package yarnwrap.util.thread;
public class FutureQueue { public net.minecraft.util.thread.FutureQueue wrapperContained; public FutureQueue(net.minecraft.util.thread.FutureQueue wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public static org.slf4j.Logger LOGGER() { return net.minecraft.util.thread.FutureQueue.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.util.thread.FutureQueue.LOGGER = value; }

public void append(java.lang.Runnable callback) { wrapperContained.append(callback); }
// public static void append(java.lang.Runnable callback, ) { net.minecraft.util.thread.FutureQueue.append(callback); }
public void append(java.util.concurrent.CompletableFuture future,java.util.function.Consumer callback) { wrapperContained.append(future,callback); }
// public static void append(java.util.concurrent.CompletableFuture future,java.util.function.Consumer callback, ) { net.minecraft.util.thread.FutureQueue.append(future,callback); }
// public yarnwrap.util.thread.FutureQueue immediate(java.util.concurrent.Executor executor) { return new yarnwrap.util.thread.FutureQueue(wrapperContained.immediate(executor)); }
// public static yarnwrap.util.thread.FutureQueue immediate(java.util.concurrent.Executor executor, ) { return new yarnwrap.util.thread.FutureQueue(net.minecraft.util.thread.FutureQueue.immediate(executor)); }
// public void method_54441(java.lang.Runnable current) { wrapperContained.method_54441(current); }
// public static void method_54441(java.lang.Runnable current, ) { net.minecraft.util.thread.FutureQueue.method_54441(current); }

}