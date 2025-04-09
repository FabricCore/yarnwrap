package yarnwrap.world.tick;
public class WorldTickScheduler { public net.minecraft.world.tick.WorldTickScheduler wrapperContained; public WorldTickScheduler(net.minecraft.world.tick.WorldTickScheduler wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Comparator COMPARATOR() { return wrapperContained.COMPARATOR; }
// public java.util.function.LongPredicate tickingFutureReadyPredicate() { return wrapperContained.tickingFutureReadyPredicate; }
// public java.util.function.Supplier profilerGetter() { return wrapperContained.profilerGetter; }
// public it.unimi.dsi.fastutil.longs.Long2ObjectMap chunkTickSchedulers() { return wrapperContained.chunkTickSchedulers; }
// public it.unimi.dsi.fastutil.longs.Long2LongMap nextTriggerTickByChunkPos() { return wrapperContained.nextTriggerTickByChunkPos; }
// public java.util.Queue tickableChunkTickSchedulers() { return wrapperContained.tickableChunkTickSchedulers; }
// public java.util.Queue tickableTicks() { return wrapperContained.tickableTicks; }
// public java.util.List tickedTicks() { return wrapperContained.tickedTicks; }
// public java.util.Set copiedTickableTicksList() { return wrapperContained.copiedTickableTicksList; }
// public java.util.function.BiConsumer queuedTickConsumer() { return wrapperContained.queuedTickConsumer; }
// public boolean isTickableTicksCountUnder(int maxTicks) { return wrapperContained.isTickableTicksCountUnder(maxTicks); }
// public void collectTickableChunkTickSchedulers(long time) { wrapperContained.collectTickableChunkTickSchedulers(time); }
// public void addTickableTicks(long time,int maxTicks) { wrapperContained.addTickableTicks(time,maxTicks); }
// public void collectTickableTicks(long time,int maxTicks,yarnwrap.util.profiler.Profiler profiler) { wrapperContained.collectTickableTicks(time,maxTicks,profiler.wrapperContained); }
public void tick(long time,int maxTicks,java.util.function.BiConsumer ticker) { wrapperContained.tick(time,maxTicks,ticker); }
public void removeChunkTickScheduler(yarnwrap.util.math.ChunkPos pos) { wrapperContained.removeChunkTickScheduler(pos.wrapperContained); }
public void addChunkTickScheduler(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.tick.ChunkTickScheduler scheduler) { wrapperContained.addChunkTickScheduler(pos.wrapperContained,scheduler.wrapperContained); }
public void clearNextTicks(yarnwrap.util.math.BlockBox box) { wrapperContained.clearNextTicks(box.wrapperContained); }
// public void visitChunks(yarnwrap.util.math.BlockBox box,Object visitor) { wrapperContained.visitChunks(box.wrapperContained,visitor); }
public void scheduleTicks(yarnwrap.util.math.BlockBox box,yarnwrap.util.math.Vec3i offset) { wrapperContained.scheduleTicks(box.wrapperContained,offset.wrapperContained); }
// public void addTickableTicks(java.util.Queue tickableChunkTickSchedulers,yarnwrap.world.tick.ChunkTickScheduler chunkTickScheduler,long tick,int maxTicks) { wrapperContained.addTickableTicks(tickableChunkTickSchedulers,chunkTickScheduler.wrapperContained,tick,maxTicks); }
// public void tick(java.util.function.BiConsumer ticker) { wrapperContained.tick(ticker); }
// public void delayAllTicks() { wrapperContained.delayAllTicks(); }
// public void schedule(yarnwrap.world.tick.OrderedTick tick) { wrapperContained.schedule(tick.wrapperContained); }
// public void clear() { wrapperContained.clear(); }
// public void addTickableTick(yarnwrap.world.tick.OrderedTick tick) { wrapperContained.addTickableTick(tick.wrapperContained); }
// public void copyTickableTicksList() { wrapperContained.copyTickableTicksList(); }
public void scheduleTicks(yarnwrap.world.tick.WorldTickScheduler scheduler,yarnwrap.util.math.BlockBox box,yarnwrap.util.math.Vec3i offset) { wrapperContained.scheduleTicks(scheduler.wrapperContained,box.wrapperContained,offset.wrapperContained); }

}