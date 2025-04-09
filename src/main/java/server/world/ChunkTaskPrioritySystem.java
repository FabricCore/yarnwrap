package yarnwrap.server.world;
public class ChunkTaskPrioritySystem { public net.minecraft.server.world.ChunkTaskPrioritySystem wrapperContained; public ChunkTaskPrioritySystem(net.minecraft.server.world.ChunkTaskPrioritySystem wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.Map queues() { return wrapperContained.queues; }
// public java.util.Set idleActors() { return wrapperContained.idleActors; }
// public yarnwrap.util.thread.TaskExecutor controlActor() { return new yarnwrap.util.thread.TaskExecutor(wrapperContained.controlActor); }
// public void enqueueChunk(yarnwrap.util.thread.MessageListener actor,java.util.function.Function task,long chunkPos,java.util.function.IntSupplier lastLevelUpdatedToProvider,boolean addBlocker) { wrapperContained.enqueueChunk(actor.wrapperContained,task,chunkPos,lastLevelUpdatedToProvider,addBlocker); }
public yarnwrap.util.thread.MessageListener createUnblockingExecutor(yarnwrap.util.thread.MessageListener executor) { return new yarnwrap.util.thread.MessageListener(wrapperContained.createUnblockingExecutor(executor.wrapperContained)); }
// public void removeChunk(yarnwrap.util.thread.MessageListener actor,long chunkPos,java.lang.Runnable callback,boolean clearTask) { wrapperContained.removeChunk(actor.wrapperContained,chunkPos,callback,clearTask); }
public yarnwrap.util.thread.MessageListener createExecutor(yarnwrap.util.thread.MessageListener executor,boolean addBlocker) { return new yarnwrap.util.thread.MessageListener(wrapperContained.createExecutor(executor.wrapperContained,addBlocker)); }
public Object createMessage(java.lang.Runnable task,long pos,java.util.function.IntSupplier lastLevelUpdatedToProvider) { return wrapperContained.createMessage(task,pos,lastLevelUpdatedToProvider); }
public Object createUnblockingMessage(java.lang.Runnable task,long pos,boolean removeTask) { return wrapperContained.createUnblockingMessage(task,pos,removeTask); }
public Object createMessage(yarnwrap.world.chunk.AbstractChunkHolder holder,java.lang.Runnable task) { return wrapperContained.createMessage(holder.wrapperContained,task); }
// public void enqueueExecution(yarnwrap.server.world.LevelPrioritizedQueue queue,yarnwrap.util.thread.MessageListener actor) { wrapperContained.enqueueExecution(queue.wrapperContained,actor.wrapperContained); }
// public yarnwrap.server.world.LevelPrioritizedQueue getQueue(yarnwrap.util.thread.MessageListener actor) { return new yarnwrap.server.world.LevelPrioritizedQueue(wrapperContained.getQueue(actor.wrapperContained)); }
public java.lang.String getDebugString() { return wrapperContained.getDebugString(); }
public Object createTask(yarnwrap.world.chunk.AbstractChunkHolder holder,java.util.function.Function taskFunction) { return wrapperContained.createTask(holder.wrapperContained,taskFunction); }
public Object createTask(java.util.function.Function taskFunction,long pos,java.util.function.IntSupplier lastLevelUpdatedToProvider) { return wrapperContained.createTask(taskFunction,pos,lastLevelUpdatedToProvider); }
public boolean shouldDelayShutdown() { return wrapperContained.shouldDelayShutdown(); }

}