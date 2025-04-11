package yarnwrap.command;
public class CommandExecutionContext { public net.minecraft.command.CommandExecutionContext wrapperContained; public CommandExecutionContext(net.minecraft.command.CommandExecutionContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_COMMAND_QUEUE_LENGTH() { return wrapperContained.MAX_COMMAND_QUEUE_LENGTH; }
// public void MAX_COMMAND_QUEUE_LENGTH(int value) { wrapperContained.MAX_COMMAND_QUEUE_LENGTH = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public int maxCommandChainLength() { return wrapperContained.maxCommandChainLength; }
// public void maxCommandChainLength(int value) { wrapperContained.maxCommandChainLength = value; }
// public int forkLimit() { return wrapperContained.forkLimit; }
// public void forkLimit(int value) { wrapperContained.forkLimit = value; }
// public yarnwrap.util.profiler.Profiler profiler() { return new yarnwrap.util.profiler.Profiler(wrapperContained.profiler); }
// public void profiler(yarnwrap.util.profiler.Profiler value) { wrapperContained.profiler = value.wrapperContained; }
// public yarnwrap.server.function.Tracer tracer() { return new yarnwrap.server.function.Tracer(wrapperContained.tracer); }
// public void tracer(yarnwrap.server.function.Tracer value) { wrapperContained.tracer = value.wrapperContained; }
// public int commandsRemaining() { return wrapperContained.commandsRemaining; }
// public void commandsRemaining(int value) { wrapperContained.commandsRemaining = value; }
// public boolean queueOverflowed() { return wrapperContained.queueOverflowed; }
// public void queueOverflowed(boolean value) { wrapperContained.queueOverflowed = value; }
// public java.util.Deque commandQueue() { return wrapperContained.commandQueue; }
// public void commandQueue(java.util.Deque value) { wrapperContained.commandQueue = value; }
// public java.util.List pendingCommands() { return wrapperContained.pendingCommands; }
// public void pendingCommands(java.util.List value) { wrapperContained.pendingCommands = value; }
// public int currentDepth() { return wrapperContained.currentDepth; }
// public void currentDepth(int value) { wrapperContained.currentDepth = value; }
public void run() { wrapperContained.run(); }
public void escape(int depth) { wrapperContained.escape(depth); }
public void enqueueCommand(yarnwrap.command.CommandQueueEntry entry) { wrapperContained.enqueueCommand(entry.wrapperContained); }
public void enqueueCommand(yarnwrap.command.CommandExecutionContext context,java.lang.String command,com.mojang.brigadier.context.ContextChain contextChain,yarnwrap.server.command.AbstractServerCommandSource source,yarnwrap.command.ReturnValueConsumer returnValueConsumer) { wrapperContained.enqueueCommand(context.wrapperContained,command,contextChain,source.wrapperContained,returnValueConsumer.wrapperContained); }
public void setTracer(yarnwrap.server.function.Tracer tracer) { wrapperContained.setTracer(tracer.wrapperContained); }
public void enqueueProcedureCall(yarnwrap.command.CommandExecutionContext context,yarnwrap.server.function.Procedure procedure,yarnwrap.server.command.AbstractServerCommandSource source,yarnwrap.command.ReturnValueConsumer returnValueConsumer) { wrapperContained.enqueueProcedureCall(context.wrapperContained,procedure.wrapperContained,source.wrapperContained,returnValueConsumer.wrapperContained); }
public yarnwrap.server.function.Tracer getTracer() { return new yarnwrap.server.function.Tracer(wrapperContained.getTracer()); }
public yarnwrap.util.profiler.Profiler getProfiler() { return new yarnwrap.util.profiler.Profiler(wrapperContained.getProfiler()); }
public int getForkLimit() { return wrapperContained.getForkLimit(); }
public void decrementCommandQuota() { wrapperContained.decrementCommandQuota(); }
// public void markQueueOverflowed() { wrapperContained.markQueueOverflowed(); }
// public yarnwrap.command.Frame frame(yarnwrap.command.CommandExecutionContext context,yarnwrap.command.ReturnValueConsumer returnValueConsumer) { return new yarnwrap.command.Frame(wrapperContained.frame(context.wrapperContained,returnValueConsumer.wrapperContained)); }
public Object getEscapeControl(int depth) { return wrapperContained.getEscapeControl(depth); }
// public void queuePendingCommands() { wrapperContained.queuePendingCommands(); }

}