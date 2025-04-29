package yarnwrap.server.world;
public class ChunkTaskPrioritySystem { public net.minecraft.server.world.ChunkTaskPrioritySystem wrapperContained; public ChunkTaskPrioritySystem(net.minecraft.server.world.ChunkTaskPrioritySystem wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.world.ChunkTaskPrioritySystem.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.world.ChunkTaskPrioritySystem.LOGGER = value; }

// public java.util.Map queues() { return wrapperContained.queues; }
// public void queues(java.util.Map value) { wrapperContained.queues = value; }
// public static java.util.Map queues() { return net.minecraft.server.world.ChunkTaskPrioritySystem.queues; }
// public static void queues(java.util.Map value, ) { net.minecraft.server.world.ChunkTaskPrioritySystem.queues = value; }

// public java.util.Set idleActors() { return wrapperContained.idleActors; }
// public void idleActors(java.util.Set value) { wrapperContained.idleActors = value; }
// public static java.util.Set idleActors() { return net.minecraft.server.world.ChunkTaskPrioritySystem.idleActors; }
// public static void idleActors(java.util.Set value, ) { net.minecraft.server.world.ChunkTaskPrioritySystem.idleActors = value; }

// public yarnwrap.util.thread.TaskExecutor controlActor() { return new yarnwrap.util.thread.TaskExecutor(wrapperContained.controlActor); }
// public void controlActor(yarnwrap.util.thread.TaskExecutor value) { wrapperContained.controlActor = value.wrapperContained; }
// public static yarnwrap.util.thread.TaskExecutor controlActor() { return new yarnwrap.util.thread.TaskExecutor(net.minecraft.server.world.ChunkTaskPrioritySystem.controlActor); }
// public static void controlActor(yarnwrap.util.thread.TaskExecutor value, ) { net.minecraft.server.world.ChunkTaskPrioritySystem.controlActor = value.wrapperContained; }

public ChunkTaskPrioritySystem(java.util.List actors,java.util.concurrent.Executor executor,int maxQueues) { this.wrapperContained = new net.minecraft.server.world.ChunkTaskPrioritySystem(actors,executor,maxQueues); }
// public void method_17280(int queue) { wrapperContained.method_17280(queue); }
// public static void method_17280(int queue, ) { net.minecraft.server.world.ChunkTaskPrioritySystem.method_17280(queue); }
// public void enqueueChunk(yarnwrap.util.thread.MessageListener actor,java.util.function.Function task,long chunkPos,java.util.function.IntSupplier lastLevelUpdatedToProvider,boolean addBlocker) { wrapperContained.enqueueChunk(actor.wrapperContained,task,chunkPos,lastLevelUpdatedToProvider,addBlocker); }
// public static void enqueueChunk(yarnwrap.util.thread.MessageListener actor,java.util.function.Function task,long chunkPos,java.util.function.IntSupplier lastLevelUpdatedToProvider,boolean addBlocker, ) { net.minecraft.server.world.ChunkTaskPrioritySystem.enqueueChunk(actor.wrapperContained,task,chunkPos,lastLevelUpdatedToProvider,addBlocker); }
// public yarnwrap.server.world.LevelPrioritizedQueue method_17613(int actor) { return new yarnwrap.server.world.LevelPrioritizedQueue(wrapperContained.method_17613(actor)); }
// public static yarnwrap.server.world.LevelPrioritizedQueue method_17613(int actor, ) { return new yarnwrap.server.world.LevelPrioritizedQueue(net.minecraft.server.world.ChunkTaskPrioritySystem.method_17613(actor)); }
public yarnwrap.util.thread.MessageListener createUnblockingExecutor(yarnwrap.util.thread.MessageListener executor) { return new yarnwrap.util.thread.MessageListener(wrapperContained.createUnblockingExecutor(executor.wrapperContained)); }
// public static yarnwrap.util.thread.MessageListener createUnblockingExecutor(yarnwrap.util.thread.MessageListener executor, ) { return new yarnwrap.util.thread.MessageListener(net.minecraft.server.world.ChunkTaskPrioritySystem.createUnblockingExecutor(executor.wrapperContained)); }
// public void removeChunk(yarnwrap.util.thread.MessageListener actor,long chunkPos,java.lang.Runnable callback,boolean clearTask) { wrapperContained.removeChunk(actor.wrapperContained,chunkPos,callback,clearTask); }
// public static void removeChunk(yarnwrap.util.thread.MessageListener actor,long chunkPos,java.lang.Runnable callback,boolean clearTask, ) { net.minecraft.server.world.ChunkTaskPrioritySystem.removeChunk(actor.wrapperContained,chunkPos,callback,clearTask); }
// public Object method_17617(yarnwrap.util.thread.MessageListener yield) { return wrapperContained.method_17617(yield.wrapperContained); }
// public static Object method_17617(yarnwrap.util.thread.MessageListener yield, ) { return net.minecraft.server.world.ChunkTaskPrioritySystem.method_17617(yield.wrapperContained); }
// public java.util.concurrent.CompletableFuture method_17619(yarnwrap.util.thread.MessageListener executeOrAddBlocking) { return wrapperContained.method_17619(executeOrAddBlocking.wrapperContained); }
// public static java.util.concurrent.CompletableFuture method_17619(yarnwrap.util.thread.MessageListener executeOrAddBlocking, ) { return net.minecraft.server.world.ChunkTaskPrioritySystem.method_17619(executeOrAddBlocking.wrapperContained); }
// public void method_17621(yarnwrap.util.thread.MessageListener message) { wrapperContained.method_17621(message.wrapperContained); }
// public static void method_17621(yarnwrap.util.thread.MessageListener message, ) { net.minecraft.server.world.ChunkTaskPrioritySystem.method_17621(message.wrapperContained); }
public yarnwrap.util.thread.MessageListener createExecutor(yarnwrap.util.thread.MessageListener executor,boolean addBlocker) { return new yarnwrap.util.thread.MessageListener(wrapperContained.createExecutor(executor.wrapperContained,addBlocker)); }
// public static yarnwrap.util.thread.MessageListener createExecutor(yarnwrap.util.thread.MessageListener executor,boolean addBlocker, ) { return new yarnwrap.util.thread.MessageListener(net.minecraft.server.world.ChunkTaskPrioritySystem.createExecutor(executor.wrapperContained,addBlocker)); }
// public Object method_17623(yarnwrap.util.thread.MessageListener yield) { return wrapperContained.method_17623(yield.wrapperContained); }
// public static Object method_17623(yarnwrap.util.thread.MessageListener yield, ) { return net.minecraft.server.world.ChunkTaskPrioritySystem.method_17623(yield.wrapperContained); }
// public void method_17624(yarnwrap.util.thread.MessageListener task) { wrapperContained.method_17624(task.wrapperContained); }
// public static void method_17624(yarnwrap.util.thread.MessageListener task, ) { net.minecraft.server.world.ChunkTaskPrioritySystem.method_17624(task.wrapperContained); }
// public java.util.concurrent.CompletableFuture method_17625(java.lang.Runnable addBlocking) { return wrapperContained.method_17625(addBlocking); }
// public static java.util.concurrent.CompletableFuture method_17625(java.lang.Runnable addBlocking, ) { return net.minecraft.server.world.ChunkTaskPrioritySystem.method_17625(addBlocking); }
// public Object createMessage(java.lang.Runnable task,long pos,java.util.function.IntSupplier lastLevelUpdatedToProvider) { return wrapperContained.createMessage(task,pos,lastLevelUpdatedToProvider); }
// public static Object createMessage(java.lang.Runnable task,long pos,java.util.function.IntSupplier lastLevelUpdatedToProvider, ) { return net.minecraft.server.world.ChunkTaskPrioritySystem.createMessage(task,pos,lastLevelUpdatedToProvider); }
// public Object createUnblockingMessage(java.lang.Runnable task,long pos,boolean removeTask) { return wrapperContained.createUnblockingMessage(task,pos,removeTask); }
// public static Object createUnblockingMessage(java.lang.Runnable task,long pos,boolean removeTask, ) { return net.minecraft.server.world.ChunkTaskPrioritySystem.createUnblockingMessage(task,pos,removeTask); }
// public java.lang.Runnable method_17628(java.lang.Runnable yield) { return wrapperContained.method_17628(yield); }
// public static java.lang.Runnable method_17628(java.lang.Runnable yield, ) { return net.minecraft.server.world.ChunkTaskPrioritySystem.method_17628(yield); }
// public Object createMessage(yarnwrap.world.chunk.AbstractChunkHolder holder,java.lang.Runnable task) { return wrapperContained.createMessage(holder.wrapperContained,task); }
// public static Object createMessage(yarnwrap.world.chunk.AbstractChunkHolder holder,java.lang.Runnable task, ) { return net.minecraft.server.world.ChunkTaskPrioritySystem.createMessage(holder.wrapperContained,task); }
// public void enqueueExecution(yarnwrap.server.world.LevelPrioritizedQueue queue,yarnwrap.util.thread.MessageListener actor) { wrapperContained.enqueueExecution(queue.wrapperContained,actor.wrapperContained); }
// public static void enqueueExecution(yarnwrap.server.world.LevelPrioritizedQueue queue,yarnwrap.util.thread.MessageListener actor, ) { net.minecraft.server.world.ChunkTaskPrioritySystem.enqueueExecution(queue.wrapperContained,actor.wrapperContained); }
// public yarnwrap.server.world.LevelPrioritizedQueue getQueue(yarnwrap.util.thread.MessageListener actor) { return new yarnwrap.server.world.LevelPrioritizedQueue(wrapperContained.getQueue(actor.wrapperContained)); }
// public static yarnwrap.server.world.LevelPrioritizedQueue getQueue(yarnwrap.util.thread.MessageListener actor, ) { return new yarnwrap.server.world.LevelPrioritizedQueue(net.minecraft.server.world.ChunkTaskPrioritySystem.getQueue(actor.wrapperContained)); }
public java.lang.String getDebugString() { return wrapperContained.getDebugString(); }
// public static java.lang.String getDebugString() { return net.minecraft.server.world.ChunkTaskPrioritySystem.getDebugString(); }
// public java.lang.String method_21681(java.lang.Long pos) { return wrapperContained.method_21681(pos); }
// public static java.lang.String method_21681(java.lang.Long pos, ) { return net.minecraft.server.world.ChunkTaskPrioritySystem.method_21681(pos); }
// public java.lang.String method_21682(Object entry) { return wrapperContained.method_21682(entry); }
// public static java.lang.String method_21682(Object entry, ) { return net.minecraft.server.world.ChunkTaskPrioritySystem.method_21682(entry); }
// public Object createTask(yarnwrap.world.chunk.AbstractChunkHolder holder,java.util.function.Function taskFunction) { return wrapperContained.createTask(holder.wrapperContained,taskFunction); }
// public static Object createTask(yarnwrap.world.chunk.AbstractChunkHolder holder,java.util.function.Function taskFunction, ) { return net.minecraft.server.world.ChunkTaskPrioritySystem.createTask(holder.wrapperContained,taskFunction); }
// public Object createTask(java.util.function.Function taskFunction,long pos,java.util.function.IntSupplier lastLevelUpdatedToProvider) { return wrapperContained.createTask(taskFunction,pos,lastLevelUpdatedToProvider); }
// public static Object createTask(java.util.function.Function taskFunction,long pos,java.util.function.IntSupplier lastLevelUpdatedToProvider, ) { return net.minecraft.server.world.ChunkTaskPrioritySystem.createTask(taskFunction,pos,lastLevelUpdatedToProvider); }
public boolean shouldDelayShutdown() { return wrapperContained.shouldDelayShutdown(); }
// public static boolean shouldDelayShutdown() { return net.minecraft.server.world.ChunkTaskPrioritySystem.shouldDelayShutdown(); }

}