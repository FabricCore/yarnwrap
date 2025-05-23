package yarnwrap.world.tick;
public class ChunkTickScheduler { public net.minecraft.world.tick.ChunkTickScheduler wrapperContained; public ChunkTickScheduler(net.minecraft.world.tick.ChunkTickScheduler wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Queue tickQueue() { return wrapperContained.tickQueue; }
// public void tickQueue(java.util.Queue value) { wrapperContained.tickQueue = value; }
// public static java.util.Queue tickQueue() { return net.minecraft.world.tick.ChunkTickScheduler.tickQueue; }
// public static void tickQueue(java.util.Queue value, ) { net.minecraft.world.tick.ChunkTickScheduler.tickQueue = value; }

// public java.util.List ticks() { return wrapperContained.ticks; }
// public void ticks(java.util.List value) { wrapperContained.ticks = value; }
// public static java.util.List ticks() { return net.minecraft.world.tick.ChunkTickScheduler.ticks; }
// public static void ticks(java.util.List value, ) { net.minecraft.world.tick.ChunkTickScheduler.ticks = value; }

// public java.util.Set queuedTicks() { return wrapperContained.queuedTicks; }
// public void queuedTicks(java.util.Set value) { wrapperContained.queuedTicks = value; }
// public static java.util.Set queuedTicks() { return net.minecraft.world.tick.ChunkTickScheduler.queuedTicks; }
// public static void queuedTicks(java.util.Set value, ) { net.minecraft.world.tick.ChunkTickScheduler.queuedTicks = value; }

// public java.util.function.BiConsumer tickConsumer() { return wrapperContained.tickConsumer; }
// public void tickConsumer(java.util.function.BiConsumer value) { wrapperContained.tickConsumer = value; }
// public static java.util.function.BiConsumer tickConsumer() { return net.minecraft.world.tick.ChunkTickScheduler.tickConsumer; }
// public static void tickConsumer(java.util.function.BiConsumer value, ) { net.minecraft.world.tick.ChunkTickScheduler.tickConsumer = value; }

public ChunkTickScheduler(java.util.List ticks) { this.wrapperContained = new net.minecraft.world.tick.ChunkTickScheduler(ticks); }
public void disable(long time) { wrapperContained.disable(time); }
// public static void disable(long time, ) { net.minecraft.world.tick.ChunkTickScheduler.disable(time); }
public void setTickConsumer(java.util.function.BiConsumer tickConsumer) { wrapperContained.setTickConsumer(tickConsumer); }
// public static void setTickConsumer(java.util.function.BiConsumer tickConsumer, ) { net.minecraft.world.tick.ChunkTickScheduler.setTickConsumer(tickConsumer); }
public void removeTicksIf(java.util.function.Predicate predicate) { wrapperContained.removeTicksIf(predicate); }
// public static void removeTicksIf(java.util.function.Predicate predicate, ) { net.minecraft.world.tick.ChunkTickScheduler.removeTicksIf(predicate); }
public yarnwrap.world.tick.OrderedTick peekNextTick() { return new yarnwrap.world.tick.OrderedTick(wrapperContained.peekNextTick()); }
// public static yarnwrap.world.tick.OrderedTick peekNextTick() { return new yarnwrap.world.tick.OrderedTick(net.minecraft.world.tick.ChunkTickScheduler.peekNextTick()); }
// public void queueTick(yarnwrap.world.tick.OrderedTick orderedTick) { wrapperContained.queueTick(orderedTick.wrapperContained); }
// public static void queueTick(yarnwrap.world.tick.OrderedTick orderedTick, ) { net.minecraft.world.tick.ChunkTickScheduler.queueTick(orderedTick.wrapperContained); }
public yarnwrap.world.tick.OrderedTick pollNextTick() { return new yarnwrap.world.tick.OrderedTick(wrapperContained.pollNextTick()); }
// public static yarnwrap.world.tick.OrderedTick pollNextTick() { return new yarnwrap.world.tick.OrderedTick(net.minecraft.world.tick.ChunkTickScheduler.pollNextTick()); }
public java.util.stream.Stream getQueueAsStream() { return wrapperContained.getQueueAsStream(); }
// public static java.util.stream.Stream getQueueAsStream() { return net.minecraft.world.tick.ChunkTickScheduler.getQueueAsStream(); }

}