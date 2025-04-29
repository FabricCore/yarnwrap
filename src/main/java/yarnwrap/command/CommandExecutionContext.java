package yarnwrap.command;
public class CommandExecutionContext { public net.minecraft.command.CommandExecutionContext wrapperContained; public CommandExecutionContext(net.minecraft.command.CommandExecutionContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_COMMAND_QUEUE_LENGTH() { return wrapperContained.MAX_COMMAND_QUEUE_LENGTH; }
// public void MAX_COMMAND_QUEUE_LENGTH(int value) { wrapperContained.MAX_COMMAND_QUEUE_LENGTH = value; }
// public static int MAX_COMMAND_QUEUE_LENGTH() { return net.minecraft.command.CommandExecutionContext.MAX_COMMAND_QUEUE_LENGTH; }
// public static void MAX_COMMAND_QUEUE_LENGTH(int value, ) { net.minecraft.command.CommandExecutionContext.MAX_COMMAND_QUEUE_LENGTH = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.command.CommandExecutionContext.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.command.CommandExecutionContext.LOGGER = value; }

// public int maxCommandChainLength() { return wrapperContained.maxCommandChainLength; }
// public void maxCommandChainLength(int value) { wrapperContained.maxCommandChainLength = value; }
// public static int maxCommandChainLength() { return net.minecraft.command.CommandExecutionContext.maxCommandChainLength; }
// public static void maxCommandChainLength(int value, ) { net.minecraft.command.CommandExecutionContext.maxCommandChainLength = value; }

// public int forkLimit() { return wrapperContained.forkLimit; }
// public void forkLimit(int value) { wrapperContained.forkLimit = value; }
// public static int forkLimit() { return net.minecraft.command.CommandExecutionContext.forkLimit; }
// public static void forkLimit(int value, ) { net.minecraft.command.CommandExecutionContext.forkLimit = value; }

// public yarnwrap.util.profiler.Profiler profiler() { return new yarnwrap.util.profiler.Profiler(wrapperContained.profiler); }
// public void profiler(yarnwrap.util.profiler.Profiler value) { wrapperContained.profiler = value.wrapperContained; }
// public static yarnwrap.util.profiler.Profiler profiler() { return new yarnwrap.util.profiler.Profiler(net.minecraft.command.CommandExecutionContext.profiler); }
// public static void profiler(yarnwrap.util.profiler.Profiler value, ) { net.minecraft.command.CommandExecutionContext.profiler = value.wrapperContained; }

// public yarnwrap.server.function.Tracer tracer() { return new yarnwrap.server.function.Tracer(wrapperContained.tracer); }
// public void tracer(yarnwrap.server.function.Tracer value) { wrapperContained.tracer = value.wrapperContained; }
// public static yarnwrap.server.function.Tracer tracer() { return new yarnwrap.server.function.Tracer(net.minecraft.command.CommandExecutionContext.tracer); }
// public static void tracer(yarnwrap.server.function.Tracer value, ) { net.minecraft.command.CommandExecutionContext.tracer = value.wrapperContained; }

// public int commandsRemaining() { return wrapperContained.commandsRemaining; }
// public void commandsRemaining(int value) { wrapperContained.commandsRemaining = value; }
// public static int commandsRemaining() { return net.minecraft.command.CommandExecutionContext.commandsRemaining; }
// public static void commandsRemaining(int value, ) { net.minecraft.command.CommandExecutionContext.commandsRemaining = value; }

// public boolean queueOverflowed() { return wrapperContained.queueOverflowed; }
// public void queueOverflowed(boolean value) { wrapperContained.queueOverflowed = value; }
// public static boolean queueOverflowed() { return net.minecraft.command.CommandExecutionContext.queueOverflowed; }
// public static void queueOverflowed(boolean value, ) { net.minecraft.command.CommandExecutionContext.queueOverflowed = value; }

// public java.util.Deque commandQueue() { return wrapperContained.commandQueue; }
// public void commandQueue(java.util.Deque value) { wrapperContained.commandQueue = value; }
// public static java.util.Deque commandQueue() { return net.minecraft.command.CommandExecutionContext.commandQueue; }
// public static void commandQueue(java.util.Deque value, ) { net.minecraft.command.CommandExecutionContext.commandQueue = value; }

// public java.util.List pendingCommands() { return wrapperContained.pendingCommands; }
// public void pendingCommands(java.util.List value) { wrapperContained.pendingCommands = value; }
// public static java.util.List pendingCommands() { return net.minecraft.command.CommandExecutionContext.pendingCommands; }
// public static void pendingCommands(java.util.List value, ) { net.minecraft.command.CommandExecutionContext.pendingCommands = value; }

// public int currentDepth() { return wrapperContained.currentDepth; }
// public void currentDepth(int value) { wrapperContained.currentDepth = value; }
// public static int currentDepth() { return net.minecraft.command.CommandExecutionContext.currentDepth; }
// public static void currentDepth(int value, ) { net.minecraft.command.CommandExecutionContext.currentDepth = value; }

public CommandExecutionContext(int maxCommandChainLength,int maxCommandForkCount,yarnwrap.util.profiler.Profiler profiler) { this.wrapperContained = new net.minecraft.command.CommandExecutionContext(maxCommandChainLength,maxCommandForkCount,profiler.wrapperContained); }
public void run() { wrapperContained.run(); }
// public static void run() { net.minecraft.command.CommandExecutionContext.run(); }
public void escape(int depth) { wrapperContained.escape(depth); }
// public static void escape(int depth, ) { net.minecraft.command.CommandExecutionContext.escape(depth); }
public void enqueueCommand(yarnwrap.command.CommandQueueEntry entry) { wrapperContained.enqueueCommand(entry.wrapperContained); }
// public static void enqueueCommand(yarnwrap.command.CommandQueueEntry entry, ) { net.minecraft.command.CommandExecutionContext.enqueueCommand(entry.wrapperContained); }
// public void enqueueCommand(yarnwrap.command.CommandExecutionContext context,java.lang.String command,com.mojang.brigadier.context.ContextChain contextChain,yarnwrap.server.command.AbstractServerCommandSource source,yarnwrap.command.ReturnValueConsumer returnValueConsumer) { wrapperContained.enqueueCommand(context.wrapperContained,command,contextChain,source.wrapperContained,returnValueConsumer.wrapperContained); }
// public static void enqueueCommand(yarnwrap.command.CommandExecutionContext context,java.lang.String command,com.mojang.brigadier.context.ContextChain contextChain,yarnwrap.server.command.AbstractServerCommandSource source,yarnwrap.command.ReturnValueConsumer returnValueConsumer, ) { net.minecraft.command.CommandExecutionContext.enqueueCommand(context.wrapperContained,command,contextChain,source.wrapperContained,returnValueConsumer.wrapperContained); }
public void setTracer(yarnwrap.server.function.Tracer tracer) { wrapperContained.setTracer(tracer.wrapperContained); }
// public static void setTracer(yarnwrap.server.function.Tracer tracer, ) { net.minecraft.command.CommandExecutionContext.setTracer(tracer.wrapperContained); }
// public void enqueueProcedureCall(yarnwrap.command.CommandExecutionContext context,yarnwrap.server.function.Procedure procedure,yarnwrap.server.command.AbstractServerCommandSource source,yarnwrap.command.ReturnValueConsumer returnValueConsumer) { wrapperContained.enqueueProcedureCall(context.wrapperContained,procedure.wrapperContained,source.wrapperContained,returnValueConsumer.wrapperContained); }
// public static void enqueueProcedureCall(yarnwrap.command.CommandExecutionContext context,yarnwrap.server.function.Procedure procedure,yarnwrap.server.command.AbstractServerCommandSource source,yarnwrap.command.ReturnValueConsumer returnValueConsumer, ) { net.minecraft.command.CommandExecutionContext.enqueueProcedureCall(context.wrapperContained,procedure.wrapperContained,source.wrapperContained,returnValueConsumer.wrapperContained); }
public yarnwrap.server.function.Tracer getTracer() { return new yarnwrap.server.function.Tracer(wrapperContained.getTracer()); }
// public static yarnwrap.server.function.Tracer getTracer() { return new yarnwrap.server.function.Tracer(net.minecraft.command.CommandExecutionContext.getTracer()); }
public yarnwrap.util.profiler.Profiler getProfiler() { return new yarnwrap.util.profiler.Profiler(wrapperContained.getProfiler()); }
// public static yarnwrap.util.profiler.Profiler getProfiler() { return new yarnwrap.util.profiler.Profiler(net.minecraft.command.CommandExecutionContext.getProfiler()); }
public int getForkLimit() { return wrapperContained.getForkLimit(); }
// public static int getForkLimit() { return net.minecraft.command.CommandExecutionContext.getForkLimit(); }
public void decrementCommandQuota() { wrapperContained.decrementCommandQuota(); }
// public static void decrementCommandQuota() { net.minecraft.command.CommandExecutionContext.decrementCommandQuota(); }
// public void markQueueOverflowed() { wrapperContained.markQueueOverflowed(); }
// public static void markQueueOverflowed() { net.minecraft.command.CommandExecutionContext.markQueueOverflowed(); }
// public yarnwrap.command.Frame frame(yarnwrap.command.CommandExecutionContext context,yarnwrap.command.ReturnValueConsumer returnValueConsumer) { return new yarnwrap.command.Frame(wrapperContained.frame(context.wrapperContained,returnValueConsumer.wrapperContained)); }
// public static yarnwrap.command.Frame frame(yarnwrap.command.CommandExecutionContext context,yarnwrap.command.ReturnValueConsumer returnValueConsumer, ) { return new yarnwrap.command.Frame(net.minecraft.command.CommandExecutionContext.frame(context.wrapperContained,returnValueConsumer.wrapperContained)); }
public Object getEscapeControl(int depth) { return wrapperContained.getEscapeControl(depth); }
// public static Object getEscapeControl(int depth, ) { return net.minecraft.command.CommandExecutionContext.getEscapeControl(depth); }
// public void queuePendingCommands() { wrapperContained.queuePendingCommands(); }
// public static void queuePendingCommands() { net.minecraft.command.CommandExecutionContext.queuePendingCommands(); }

}