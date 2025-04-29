package yarnwrap.util.thread;
public class MessageListener { public net.minecraft.util.thread.MessageListener wrapperContained; public MessageListener(net.minecraft.util.thread.MessageListener wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.util.thread.MessageListener.getName(); }
public void send(java.lang.Object message) { wrapperContained.send(message); }
// public static void send(java.lang.Object message, ) { net.minecraft.util.thread.MessageListener.send(message); }
// public yarnwrap.util.thread.MessageListener create(java.lang.String name,java.util.function.Consumer action) { return new yarnwrap.util.thread.MessageListener(wrapperContained.create(name,action)); }
// public static yarnwrap.util.thread.MessageListener create(java.lang.String name,java.util.function.Consumer action, ) { return new yarnwrap.util.thread.MessageListener(net.minecraft.util.thread.MessageListener.create(name,action)); }
public java.util.concurrent.CompletableFuture ask(java.util.function.Function messageProvider) { return wrapperContained.ask(messageProvider); }
// public static java.util.concurrent.CompletableFuture ask(java.util.function.Function messageProvider, ) { return net.minecraft.util.thread.MessageListener.ask(messageProvider); }
public java.util.concurrent.CompletableFuture askFallible(java.util.function.Function messageProvider) { return wrapperContained.askFallible(messageProvider); }
// public static java.util.concurrent.CompletableFuture askFallible(java.util.function.Function messageProvider, ) { return net.minecraft.util.thread.MessageListener.askFallible(messageProvider); }

}