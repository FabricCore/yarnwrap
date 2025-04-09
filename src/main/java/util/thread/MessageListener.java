package yarnwrap.util.thread;
public class MessageListener { public net.minecraft.util.thread.MessageListener wrapperContained; public MessageListener(net.minecraft.util.thread.MessageListener wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String getName() { return wrapperContained.getName(); }
public void send(java.lang.Object message) { wrapperContained.send(message); }
// public yarnwrap.util.thread.MessageListener create(java.lang.String name,java.util.function.Consumer action) { return new yarnwrap.util.thread.MessageListener(wrapperContained.create(name,action)); }
public java.util.concurrent.CompletableFuture ask(java.util.function.Function messageProvider) { return wrapperContained.ask(messageProvider); }
public java.util.concurrent.CompletableFuture askFallible(java.util.function.Function messageProvider) { return wrapperContained.askFallible(messageProvider); }

}