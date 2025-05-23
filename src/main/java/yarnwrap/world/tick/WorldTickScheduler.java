package yarnwrap.world.tick;
public class WorldTickScheduler { public net.minecraft.world.tick.WorldTickScheduler wrapperContained; public WorldTickScheduler(net.minecraft.world.tick.WorldTickScheduler wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Comparator COMPARATOR() { return wrapperContained.COMPARATOR; }
// public void COMPARATOR(java.util.Comparator value) { wrapperContained.COMPARATOR = value; }
// public static java.util.Comparator COMPARATOR() { return net.minecraft.world.tick.WorldTickScheduler.COMPARATOR; }
// public static void COMPARATOR(java.util.Comparator value, ) { net.minecraft.world.tick.WorldTickScheduler.COMPARATOR = value; }

// public java.util.function.LongPredicate tickingFutureReadyPredicate() { return wrapperContained.tickingFutureReadyPredicate; }
// public void tickingFutureReadyPredicate(java.util.function.LongPredicate value) { wrapperContained.tickingFutureReadyPredicate = value; }
// public static java.util.function.LongPredicate tickingFutureReadyPredicate() { return net.minecraft.world.tick.WorldTickScheduler.tickingFutureReadyPredicate; }
// public static void tickingFutureReadyPredicate(java.util.function.LongPredicate value, ) { net.minecraft.world.tick.WorldTickScheduler.tickingFutureReadyPredicate = value; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectMap chunkTickSchedulers() { return wrapperContained.chunkTickSchedulers; }
// public void chunkTickSchedulers(it.unimi.dsi.fastutil.longs.Long2ObjectMap value) { wrapperContained.chunkTickSchedulers = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectMap chunkTickSchedulers() { return net.minecraft.world.tick.WorldTickScheduler.chunkTickSchedulers; }
// public static void chunkTickSchedulers(it.unimi.dsi.fastutil.longs.Long2ObjectMap value, ) { net.minecraft.world.tick.WorldTickScheduler.chunkTickSchedulers = value; }

// public it.unimi.dsi.fastutil.longs.Long2LongMap nextTriggerTickByChunkPos() { return wrapperContained.nextTriggerTickByChunkPos; }
// public void nextTriggerTickByChunkPos(it.unimi.dsi.fastutil.longs.Long2LongMap value) { wrapperContained.nextTriggerTickByChunkPos = value; }
// public static it.unimi.dsi.fastutil.longs.Long2LongMap nextTriggerTickByChunkPos() { return net.minecraft.world.tick.WorldTickScheduler.nextTriggerTickByChunkPos; }
// public static void nextTriggerTickByChunkPos(it.unimi.dsi.fastutil.longs.Long2LongMap value, ) { net.minecraft.world.tick.WorldTickScheduler.nextTriggerTickByChunkPos = value; }

// public java.util.Queue tickableChunkTickSchedulers() { return wrapperContained.tickableChunkTickSchedulers; }
// public void tickableChunkTickSchedulers(java.util.Queue value) { wrapperContained.tickableChunkTickSchedulers = value; }
// public static java.util.Queue tickableChunkTickSchedulers() { return net.minecraft.world.tick.WorldTickScheduler.tickableChunkTickSchedulers; }
// public static void tickableChunkTickSchedulers(java.util.Queue value, ) { net.minecraft.world.tick.WorldTickScheduler.tickableChunkTickSchedulers = value; }

// public java.util.Queue tickableTicks() { return wrapperContained.tickableTicks; }
// public void tickableTicks(java.util.Queue value) { wrapperContained.tickableTicks = value; }
// public static java.util.Queue tickableTicks() { return net.minecraft.world.tick.WorldTickScheduler.tickableTicks; }
// public static void tickableTicks(java.util.Queue value, ) { net.minecraft.world.tick.WorldTickScheduler.tickableTicks = value; }

// public java.util.List tickedTicks() { return wrapperContained.tickedTicks; }
// public void tickedTicks(java.util.List value) { wrapperContained.tickedTicks = value; }
// public static java.util.List tickedTicks() { return net.minecraft.world.tick.WorldTickScheduler.tickedTicks; }
// public static void tickedTicks(java.util.List value, ) { net.minecraft.world.tick.WorldTickScheduler.tickedTicks = value; }

// public java.util.Set copiedTickableTicksList() { return wrapperContained.copiedTickableTicksList; }
// public void copiedTickableTicksList(java.util.Set value) { wrapperContained.copiedTickableTicksList = value; }
// public static java.util.Set copiedTickableTicksList() { return net.minecraft.world.tick.WorldTickScheduler.copiedTickableTicksList; }
// public static void copiedTickableTicksList(java.util.Set value, ) { net.minecraft.world.tick.WorldTickScheduler.copiedTickableTicksList = value; }

// public java.util.function.BiConsumer queuedTickConsumer() { return wrapperContained.queuedTickConsumer; }
// public void queuedTickConsumer(java.util.function.BiConsumer value) { wrapperContained.queuedTickConsumer = value; }
// public static java.util.function.BiConsumer queuedTickConsumer() { return net.minecraft.world.tick.WorldTickScheduler.queuedTickConsumer; }
// public static void queuedTickConsumer(java.util.function.BiConsumer value, ) { net.minecraft.world.tick.WorldTickScheduler.queuedTickConsumer = value; }

public WorldTickScheduler(java.util.function.LongPredicate tickingFutureReadyPredicate) { this.wrapperContained = new net.minecraft.world.tick.WorldTickScheduler(tickingFutureReadyPredicate); }
// public boolean isTickableTicksCountUnder(int maxTicks) { return wrapperContained.isTickableTicksCountUnder(maxTicks); }
// public static boolean isTickableTicksCountUnder(int maxTicks, ) { return net.minecraft.world.tick.WorldTickScheduler.isTickableTicksCountUnder(maxTicks); }
// public void collectTickableChunkTickSchedulers(long time) { wrapperContained.collectTickableChunkTickSchedulers(time); }
// public static void collectTickableChunkTickSchedulers(long time, ) { net.minecraft.world.tick.WorldTickScheduler.collectTickableChunkTickSchedulers(time); }
// public void addTickableTicks(long time,int maxTicks) { wrapperContained.addTickableTicks(time,maxTicks); }
// public static void addTickableTicks(long time,int maxTicks, ) { net.minecraft.world.tick.WorldTickScheduler.addTickableTicks(time,maxTicks); }
// public void collectTickableTicks(long time,int maxTicks,yarnwrap.util.profiler.Profiler profiler) { wrapperContained.collectTickableTicks(time,maxTicks,profiler.wrapperContained); }
// public static void collectTickableTicks(long time,int maxTicks,yarnwrap.util.profiler.Profiler profiler, ) { net.minecraft.world.tick.WorldTickScheduler.collectTickableTicks(time,maxTicks,profiler.wrapperContained); }
public void tick(long time,int maxTicks,java.util.function.BiConsumer ticker) { wrapperContained.tick(time,maxTicks,ticker); }
// public static void tick(long time,int maxTicks,java.util.function.BiConsumer ticker, ) { net.minecraft.world.tick.WorldTickScheduler.tick(time,maxTicks,ticker); }
public void removeChunkTickScheduler(yarnwrap.util.math.ChunkPos pos) { wrapperContained.removeChunkTickScheduler(pos.wrapperContained); }
// public static void removeChunkTickScheduler(yarnwrap.util.math.ChunkPos pos, ) { net.minecraft.world.tick.WorldTickScheduler.removeChunkTickScheduler(pos.wrapperContained); }
public void addChunkTickScheduler(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.tick.ChunkTickScheduler scheduler) { wrapperContained.addChunkTickScheduler(pos.wrapperContained,scheduler.wrapperContained); }
// public static void addChunkTickScheduler(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.tick.ChunkTickScheduler scheduler, ) { net.minecraft.world.tick.WorldTickScheduler.addChunkTickScheduler(pos.wrapperContained,scheduler.wrapperContained); }
public void clearNextTicks(yarnwrap.util.math.BlockBox box) { wrapperContained.clearNextTicks(box.wrapperContained); }
// public static void clearNextTicks(yarnwrap.util.math.BlockBox box, ) { net.minecraft.world.tick.WorldTickScheduler.clearNextTicks(box.wrapperContained); }
// public void visitChunks(yarnwrap.util.math.BlockBox box,Object visitor) { wrapperContained.visitChunks(box.wrapperContained,visitor); }
// public static void visitChunks(yarnwrap.util.math.BlockBox box,Object visitor, ) { net.minecraft.world.tick.WorldTickScheduler.visitChunks(box.wrapperContained,visitor); }
// public boolean method_39382(yarnwrap.util.math.BlockBox tick) { return wrapperContained.method_39382(tick.wrapperContained); }
// public static boolean method_39382(yarnwrap.util.math.BlockBox tick, ) { return net.minecraft.world.tick.WorldTickScheduler.method_39382(tick.wrapperContained); }
public void scheduleTicks(yarnwrap.util.math.BlockBox box,yarnwrap.util.math.Vec3i offset) { wrapperContained.scheduleTicks(box.wrapperContained,offset.wrapperContained); }
// public static void scheduleTicks(yarnwrap.util.math.BlockBox box,yarnwrap.util.math.Vec3i offset, ) { net.minecraft.world.tick.WorldTickScheduler.scheduleTicks(box.wrapperContained,offset.wrapperContained); }
// public int method_39384(yarnwrap.world.tick.ChunkTickScheduler a,yarnwrap.world.tick.ChunkTickScheduler b) { return wrapperContained.method_39384(a.wrapperContained,b.wrapperContained); }
// public static int method_39384(yarnwrap.world.tick.ChunkTickScheduler a,yarnwrap.world.tick.ChunkTickScheduler b, ) { return net.minecraft.world.tick.WorldTickScheduler.method_39384(a.wrapperContained,b.wrapperContained); }
// public void method_39385(yarnwrap.world.tick.ChunkTickScheduler chunkTickScheduler,yarnwrap.world.tick.OrderedTick tick) { wrapperContained.method_39385(chunkTickScheduler.wrapperContained,tick.wrapperContained); }
// public static void method_39385(yarnwrap.world.tick.ChunkTickScheduler chunkTickScheduler,yarnwrap.world.tick.OrderedTick tick, ) { net.minecraft.world.tick.WorldTickScheduler.method_39385(chunkTickScheduler.wrapperContained,tick.wrapperContained); }
// public void method_39387(it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap map) { wrapperContained.method_39387(map); }
// public static void method_39387(it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap map, ) { net.minecraft.world.tick.WorldTickScheduler.method_39387(map); }
// public void addTickableTicks(java.util.Queue tickableChunkTickSchedulers,yarnwrap.world.tick.ChunkTickScheduler chunkTickScheduler,long tick,int maxTicks) { wrapperContained.addTickableTicks(tickableChunkTickSchedulers,chunkTickScheduler.wrapperContained,tick,maxTicks); }
// public static void addTickableTicks(java.util.Queue tickableChunkTickSchedulers,yarnwrap.world.tick.ChunkTickScheduler chunkTickScheduler,long tick,int maxTicks, ) { net.minecraft.world.tick.WorldTickScheduler.addTickableTicks(tickableChunkTickSchedulers,chunkTickScheduler.wrapperContained,tick,maxTicks); }
// public void tick(java.util.function.BiConsumer ticker) { wrapperContained.tick(ticker); }
// public static void tick(java.util.function.BiConsumer ticker, ) { net.minecraft.world.tick.WorldTickScheduler.tick(ticker); }
// public void method_39391(java.util.function.Predicate chunkPos,long chunkTickScheduler) { wrapperContained.method_39391(chunkPos,chunkTickScheduler); }
// public static void method_39391(java.util.function.Predicate chunkPos,long chunkTickScheduler, ) { net.minecraft.world.tick.WorldTickScheduler.method_39391(chunkPos,chunkTickScheduler); }
// public void delayAllTicks() { wrapperContained.delayAllTicks(); }
// public static void delayAllTicks() { net.minecraft.world.tick.WorldTickScheduler.delayAllTicks(); }
// public void schedule(yarnwrap.world.tick.OrderedTick tick) { wrapperContained.schedule(tick.wrapperContained); }
// public static void schedule(yarnwrap.world.tick.OrderedTick tick, ) { net.minecraft.world.tick.WorldTickScheduler.schedule(tick.wrapperContained); }
// public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.world.tick.WorldTickScheduler.clear(); }
// public void addTickableTick(yarnwrap.world.tick.OrderedTick tick) { wrapperContained.addTickableTick(tick.wrapperContained); }
// public static void addTickableTick(yarnwrap.world.tick.OrderedTick tick, ) { net.minecraft.world.tick.WorldTickScheduler.addTickableTick(tick.wrapperContained); }
// public void copyTickableTicksList() { wrapperContained.copyTickableTicksList(); }
// public static void copyTickableTicksList() { net.minecraft.world.tick.WorldTickScheduler.copyTickableTicksList(); }
// public boolean method_48166(yarnwrap.util.math.BlockBox tick) { return wrapperContained.method_48166(tick.wrapperContained); }
// public static boolean method_48166(yarnwrap.util.math.BlockBox tick, ) { return net.minecraft.world.tick.WorldTickScheduler.method_48166(tick.wrapperContained); }
public void scheduleTicks(yarnwrap.world.tick.WorldTickScheduler scheduler,yarnwrap.util.math.BlockBox box,yarnwrap.util.math.Vec3i offset) { wrapperContained.scheduleTicks(scheduler.wrapperContained,box.wrapperContained,offset.wrapperContained); }
// public static void scheduleTicks(yarnwrap.world.tick.WorldTickScheduler scheduler,yarnwrap.util.math.BlockBox box,yarnwrap.util.math.Vec3i offset, ) { net.minecraft.world.tick.WorldTickScheduler.scheduleTicks(scheduler.wrapperContained,box.wrapperContained,offset.wrapperContained); }
// public void method_48168(yarnwrap.util.math.Vec3i tick) { wrapperContained.method_48168(tick.wrapperContained); }
// public static void method_48168(yarnwrap.util.math.Vec3i tick, ) { net.minecraft.world.tick.WorldTickScheduler.method_48168(tick.wrapperContained); }
// public void method_48169(java.util.function.Predicate chunkPos,java.util.List chunkTickScheduler) { wrapperContained.method_48169(chunkPos,chunkTickScheduler); }
// public static void method_48169(java.util.function.Predicate chunkPos,java.util.List chunkTickScheduler, ) { net.minecraft.world.tick.WorldTickScheduler.method_48169(chunkPos,chunkTickScheduler); }

}