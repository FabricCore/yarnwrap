package yarnwrap.world.tick;
public class WorldTickScheduler { public net.minecraft.world.tick.WorldTickScheduler wrapperContained; public WorldTickScheduler(net.minecraft.world.tick.WorldTickScheduler wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Comparator COMPARATOR() { return wrapperContained.COMPARATOR; }
// public void COMPARATOR(java.util.Comparator value) { wrapperContained.COMPARATOR = value; }
// public java.util.function.LongPredicate tickingFutureReadyPredicate() { return wrapperContained.tickingFutureReadyPredicate; }
// public void tickingFutureReadyPredicate(java.util.function.LongPredicate value) { wrapperContained.tickingFutureReadyPredicate = value; }
// public java.util.function.Supplier profilerGetter() { return wrapperContained.profilerGetter; }
// public void profilerGetter(java.util.function.Supplier value) { wrapperContained.profilerGetter = value; }
// public it.unimi.dsi.fastutil.longs.Long2ObjectMap chunkTickSchedulers() { return wrapperContained.chunkTickSchedulers; }
// public void chunkTickSchedulers(it.unimi.dsi.fastutil.longs.Long2ObjectMap value) { wrapperContained.chunkTickSchedulers = value; }
// public it.unimi.dsi.fastutil.longs.Long2LongMap nextTriggerTickByChunkPos() { return wrapperContained.nextTriggerTickByChunkPos; }
// public void nextTriggerTickByChunkPos(it.unimi.dsi.fastutil.longs.Long2LongMap value) { wrapperContained.nextTriggerTickByChunkPos = value; }
// public java.util.Queue tickableChunkTickSchedulers() { return wrapperContained.tickableChunkTickSchedulers; }
// public void tickableChunkTickSchedulers(java.util.Queue value) { wrapperContained.tickableChunkTickSchedulers = value; }
// public java.util.Queue tickableTicks() { return wrapperContained.tickableTicks; }
// public void tickableTicks(java.util.Queue value) { wrapperContained.tickableTicks = value; }
// public java.util.List tickedTicks() { return wrapperContained.tickedTicks; }
// public void tickedTicks(java.util.List value) { wrapperContained.tickedTicks = value; }
// public java.util.Set copiedTickableTicksList() { return wrapperContained.copiedTickableTicksList; }
// public void copiedTickableTicksList(java.util.Set value) { wrapperContained.copiedTickableTicksList = value; }
// public java.util.function.BiConsumer queuedTickConsumer() { return wrapperContained.queuedTickConsumer; }
// public void queuedTickConsumer(java.util.function.BiConsumer value) { wrapperContained.queuedTickConsumer = value; }
public WorldTickScheduler(java.util.function.LongPredicate tickingFutureReadyPredicate,java.util.function.Supplier profilerGetter) { this.wrapperContained = new net.minecraft.world.tick.WorldTickScheduler(tickingFutureReadyPredicate,profilerGetter); }
// public boolean isTickableTicksCountUnder(int maxTicks) { return wrapperContained.isTickableTicksCountUnder(maxTicks); }
// public void collectTickableChunkTickSchedulers(long time) { wrapperContained.collectTickableChunkTickSchedulers(time); }
// public void addTickableTicks(long time,int maxTicks) { wrapperContained.addTickableTicks(time,maxTicks); }
// public void collectTickableTicks(long time,int maxTicks,yarnwrap.util.profiler.Profiler profiler) { wrapperContained.collectTickableTicks(time,maxTicks,profiler.wrapperContained); }
public void tick(long time,int maxTicks,java.util.function.BiConsumer ticker) { wrapperContained.tick(time,maxTicks,ticker); }
public void removeChunkTickScheduler(yarnwrap.util.math.ChunkPos pos) { wrapperContained.removeChunkTickScheduler(pos.wrapperContained); }
public void addChunkTickScheduler(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.tick.ChunkTickScheduler scheduler) { wrapperContained.addChunkTickScheduler(pos.wrapperContained,scheduler.wrapperContained); }
public void clearNextTicks(yarnwrap.util.math.BlockBox box) { wrapperContained.clearNextTicks(box.wrapperContained); }
// public void visitChunks(yarnwrap.util.math.BlockBox box,Object visitor) { wrapperContained.visitChunks(box.wrapperContained,visitor); }
// public boolean method_39382(yarnwrap.util.math.BlockBox tick) { return wrapperContained.method_39382(tick.wrapperContained); }
public void scheduleTicks(yarnwrap.util.math.BlockBox box,yarnwrap.util.math.Vec3i offset) { wrapperContained.scheduleTicks(box.wrapperContained,offset.wrapperContained); }
// public int method_39384(yarnwrap.world.tick.ChunkTickScheduler a,yarnwrap.world.tick.ChunkTickScheduler b) { return wrapperContained.method_39384(a.wrapperContained,b.wrapperContained); }
// public void method_39385(yarnwrap.world.tick.ChunkTickScheduler chunkTickScheduler,yarnwrap.world.tick.OrderedTick tick) { wrapperContained.method_39385(chunkTickScheduler.wrapperContained,tick.wrapperContained); }
// public void method_39387(it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap map) { wrapperContained.method_39387(map); }
// public void addTickableTicks(java.util.Queue tickableChunkTickSchedulers,yarnwrap.world.tick.ChunkTickScheduler chunkTickScheduler,long tick,int maxTicks) { wrapperContained.addTickableTicks(tickableChunkTickSchedulers,chunkTickScheduler.wrapperContained,tick,maxTicks); }
// public void tick(java.util.function.BiConsumer ticker) { wrapperContained.tick(ticker); }
// public void method_39391(java.util.function.Predicate chunkPos,long chunkTickScheduler) { wrapperContained.method_39391(chunkPos,chunkTickScheduler); }
// public void delayAllTicks() { wrapperContained.delayAllTicks(); }
// public void schedule(yarnwrap.world.tick.OrderedTick tick) { wrapperContained.schedule(tick.wrapperContained); }
// public void clear() { wrapperContained.clear(); }
// public void addTickableTick(yarnwrap.world.tick.OrderedTick tick) { wrapperContained.addTickableTick(tick.wrapperContained); }
// public void copyTickableTicksList() { wrapperContained.copyTickableTicksList(); }
// public boolean method_48166(yarnwrap.util.math.BlockBox tick) { return wrapperContained.method_48166(tick.wrapperContained); }
public void scheduleTicks(yarnwrap.world.tick.WorldTickScheduler scheduler,yarnwrap.util.math.BlockBox box,yarnwrap.util.math.Vec3i offset) { wrapperContained.scheduleTicks(scheduler.wrapperContained,box.wrapperContained,offset.wrapperContained); }
// public void method_48168(yarnwrap.util.math.Vec3i tick) { wrapperContained.method_48168(tick.wrapperContained); }
// public void method_48169(java.util.function.Predicate chunkPos,java.util.List chunkTickScheduler) { wrapperContained.method_48169(chunkPos,chunkTickScheduler); }

}