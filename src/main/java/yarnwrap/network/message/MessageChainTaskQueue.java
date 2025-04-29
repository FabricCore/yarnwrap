package yarnwrap.network.message;
public class MessageChainTaskQueue { public net.minecraft.network.message.MessageChainTaskQueue wrapperContained; public MessageChainTaskQueue(net.minecraft.network.message.MessageChainTaskQueue wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.network.message.MessageChainTaskQueue.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.network.message.MessageChainTaskQueue.LOGGER = value; }

// public java.util.concurrent.CompletableFuture current() { return wrapperContained.current; }
// public void current(java.util.concurrent.CompletableFuture value) { wrapperContained.current = value; }
// public static java.util.concurrent.CompletableFuture current() { return net.minecraft.network.message.MessageChainTaskQueue.current; }
// public static void current(java.util.concurrent.CompletableFuture value, ) { net.minecraft.network.message.MessageChainTaskQueue.current = value; }

// public java.util.concurrent.Executor executor() { return wrapperContained.executor; }
// public void executor(java.util.concurrent.Executor value) { wrapperContained.executor = value; }
// public static java.util.concurrent.Executor executor() { return net.minecraft.network.message.MessageChainTaskQueue.executor; }
// public static void executor(java.util.concurrent.Executor value, ) { net.minecraft.network.message.MessageChainTaskQueue.executor = value; }

// public boolean closed() { return wrapperContained.closed; }
// public void closed(boolean value) { wrapperContained.closed = value; }
// public static boolean closed() { return net.minecraft.network.message.MessageChainTaskQueue.closed; }
// public static void closed(boolean value, ) { net.minecraft.network.message.MessageChainTaskQueue.closed = value; }

public MessageChainTaskQueue(java.util.concurrent.Executor executor) { this.wrapperContained = new net.minecraft.network.message.MessageChainTaskQueue(executor); }
// public void method_44903(java.util.function.Consumer object) { wrapperContained.method_44903(object); }
// public static void method_44903(java.util.function.Consumer object, ) { net.minecraft.network.message.MessageChainTaskQueue.method_44903(object); }
// public java.lang.Void method_44904(java.lang.Throwable throwable) { return wrapperContained.method_44904(throwable); }
// public static java.lang.Void method_44904(java.lang.Throwable throwable, ) { return net.minecraft.network.message.MessageChainTaskQueue.method_44904(throwable); }
// public java.lang.Object method_54440(java.lang.Object a,java.lang.Object b) { return wrapperContained.method_54440(a,b); }
// public static java.lang.Object method_54440(java.lang.Object a,java.lang.Object b, ) { return net.minecraft.network.message.MessageChainTaskQueue.method_54440(a,b); }

}