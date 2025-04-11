package yarnwrap.network.message;
public class MessageChainTaskQueue { public net.minecraft.network.message.MessageChainTaskQueue wrapperContained; public MessageChainTaskQueue(net.minecraft.network.message.MessageChainTaskQueue wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.concurrent.CompletableFuture current() { return wrapperContained.current; }
// public void current(java.util.concurrent.CompletableFuture value) { wrapperContained.current = value; }
// public java.util.concurrent.Executor executor() { return wrapperContained.executor; }
// public void executor(java.util.concurrent.Executor value) { wrapperContained.executor = value; }
// public boolean closed() { return wrapperContained.closed; }
// public void closed(boolean value) { wrapperContained.closed = value; }
public MessageChainTaskQueue(java.util.concurrent.Executor executor) { this.wrapperContained = new net.minecraft.network.message.MessageChainTaskQueue(executor); }
// public void method_44903(java.util.function.Consumer object) { wrapperContained.method_44903(object); }
// public java.lang.Void method_44904(java.lang.Throwable throwable) { return wrapperContained.method_44904(throwable); }
// public java.lang.Object method_54440(java.lang.Object a,java.lang.Object b) { return wrapperContained.method_54440(a,b); }

}