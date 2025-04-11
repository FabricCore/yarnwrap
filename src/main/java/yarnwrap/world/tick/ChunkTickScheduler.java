package yarnwrap.world.tick;
public class ChunkTickScheduler { public net.minecraft.world.tick.ChunkTickScheduler wrapperContained; public ChunkTickScheduler(net.minecraft.world.tick.ChunkTickScheduler wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Queue tickQueue() { return wrapperContained.tickQueue; }
// public void tickQueue(java.util.Queue value) { wrapperContained.tickQueue = value; }
// public java.util.List ticks() { return wrapperContained.ticks; }
// public void ticks(java.util.List value) { wrapperContained.ticks = value; }
// public java.util.Set queuedTicks() { return wrapperContained.queuedTicks; }
// public void queuedTicks(java.util.Set value) { wrapperContained.queuedTicks = value; }
// public java.util.function.BiConsumer tickConsumer() { return wrapperContained.tickConsumer; }
// public void tickConsumer(java.util.function.BiConsumer value) { wrapperContained.tickConsumer = value; }
public void disable(long time) { wrapperContained.disable(time); }
public void setTickConsumer(java.util.function.BiConsumer tickConsumer) { wrapperContained.setTickConsumer(tickConsumer); }
public void removeTicksIf(java.util.function.Predicate predicate) { wrapperContained.removeTicksIf(predicate); }
public yarnwrap.world.tick.ChunkTickScheduler create(yarnwrap.nbt.NbtList tickQueue,java.util.function.Function nameToTypeFunction,yarnwrap.util.math.ChunkPos pos) { return new yarnwrap.world.tick.ChunkTickScheduler(wrapperContained.create(tickQueue.wrapperContained,nameToTypeFunction,pos.wrapperContained)); }
public yarnwrap.world.tick.OrderedTick peekNextTick() { return new yarnwrap.world.tick.OrderedTick(wrapperContained.peekNextTick()); }
// public void queueTick(yarnwrap.world.tick.OrderedTick orderedTick) { wrapperContained.queueTick(orderedTick.wrapperContained); }
public yarnwrap.world.tick.OrderedTick pollNextTick() { return new yarnwrap.world.tick.OrderedTick(wrapperContained.pollNextTick()); }
public java.util.stream.Stream getQueueAsStream() { return wrapperContained.getQueueAsStream(); }

}