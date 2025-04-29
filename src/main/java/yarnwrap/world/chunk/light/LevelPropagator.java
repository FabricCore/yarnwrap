package yarnwrap.world.chunk.light;
public class LevelPropagator { public net.minecraft.world.chunk.light.LevelPropagator wrapperContained; public LevelPropagator(net.minecraft.world.chunk.light.LevelPropagator wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean hasPendingUpdates() { return wrapperContained.hasPendingUpdates; }
// public void hasPendingUpdates(boolean value) { wrapperContained.hasPendingUpdates = value; }
// public static boolean hasPendingUpdates() { return net.minecraft.world.chunk.light.LevelPropagator.hasPendingUpdates; }
// public static void hasPendingUpdates(boolean value, ) { net.minecraft.world.chunk.light.LevelPropagator.hasPendingUpdates = value; }

// public int levelCount() { return wrapperContained.levelCount; }
// public void levelCount(int value) { wrapperContained.levelCount = value; }
// public static int levelCount() { return net.minecraft.world.chunk.light.LevelPropagator.levelCount; }
// public static void levelCount(int value, ) { net.minecraft.world.chunk.light.LevelPropagator.levelCount = value; }

// public it.unimi.dsi.fastutil.longs.Long2ByteMap pendingUpdates() { return wrapperContained.pendingUpdates; }
// public void pendingUpdates(it.unimi.dsi.fastutil.longs.Long2ByteMap value) { wrapperContained.pendingUpdates = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ByteMap pendingUpdates() { return net.minecraft.world.chunk.light.LevelPropagator.pendingUpdates; }
// public static void pendingUpdates(it.unimi.dsi.fastutil.longs.Long2ByteMap value, ) { net.minecraft.world.chunk.light.LevelPropagator.pendingUpdates = value; }

// public int MAX_LEVEL() { return wrapperContained.MAX_LEVEL; }
// public void MAX_LEVEL(int value) { wrapperContained.MAX_LEVEL = value; }
// public static int MAX_LEVEL() { return net.minecraft.world.chunk.light.LevelPropagator.MAX_LEVEL; }
// public static void MAX_LEVEL(int value, ) { net.minecraft.world.chunk.light.LevelPropagator.MAX_LEVEL = value; }

// public yarnwrap.world.chunk.light.PendingUpdateQueue pendingUpdateQueue() { return new yarnwrap.world.chunk.light.PendingUpdateQueue(wrapperContained.pendingUpdateQueue); }
// public void pendingUpdateQueue(yarnwrap.world.chunk.light.PendingUpdateQueue value) { wrapperContained.pendingUpdateQueue = value.wrapperContained; }
// public static yarnwrap.world.chunk.light.PendingUpdateQueue pendingUpdateQueue() { return new yarnwrap.world.chunk.light.PendingUpdateQueue(net.minecraft.world.chunk.light.LevelPropagator.pendingUpdateQueue); }
// public static void pendingUpdateQueue(yarnwrap.world.chunk.light.PendingUpdateQueue value, ) { net.minecraft.world.chunk.light.LevelPropagator.pendingUpdateQueue = value.wrapperContained; }

// public LevelPropagator(int levelCount,int expectedLevelSize,int expectedTotalSize) { this.wrapperContained = new net.minecraft.world.chunk.light.LevelPropagator(levelCount,expectedLevelSize,expectedTotalSize); }
// public void updateLevel(long sourceId,long id,int level,boolean decrease) { wrapperContained.updateLevel(sourceId,id,level,decrease); }
// public static void updateLevel(long sourceId,long id,int level,boolean decrease, ) { net.minecraft.world.chunk.light.LevelPropagator.updateLevel(sourceId,id,level,decrease); }
// public int getLevel(long id) { return wrapperContained.getLevel(id); }
// public static int getLevel(long id, ) { return net.minecraft.world.chunk.light.LevelPropagator.getLevel(id); }
// public void updateLevel(long sourceId,long id,int level,int currentLevel,int decrease) { wrapperContained.updateLevel(sourceId,id,level,currentLevel,decrease); }
// public static void updateLevel(long sourceId,long id,int level,int currentLevel,int decrease, ) { net.minecraft.world.chunk.light.LevelPropagator.updateLevel(sourceId,id,level,currentLevel,decrease); }
// public void removePendingUpdate(long id) { wrapperContained.removePendingUpdate(id); }
// public static void removePendingUpdate(long id, ) { net.minecraft.world.chunk.light.LevelPropagator.removePendingUpdate(id); }
// public void propagateLevel(long sourceId,long targetId,int level,boolean decrease) { wrapperContained.propagateLevel(sourceId,targetId,level,decrease); }
// public static void propagateLevel(long sourceId,long targetId,int level,boolean decrease, ) { net.minecraft.world.chunk.light.LevelPropagator.propagateLevel(sourceId,targetId,level,decrease); }
// public void setLevel(long id,int level) { wrapperContained.setLevel(id,level); }
// public static void setLevel(long id,int level, ) { net.minecraft.world.chunk.light.LevelPropagator.setLevel(id,level); }
// public int recalculateLevel(long id,long excludedId,int maxLevel) { return wrapperContained.recalculateLevel(id,excludedId,maxLevel); }
// public static int recalculateLevel(long id,long excludedId,int maxLevel, ) { return net.minecraft.world.chunk.light.LevelPropagator.recalculateLevel(id,excludedId,maxLevel); }
// public void propagateLevel(long id,int level,boolean decrease) { wrapperContained.propagateLevel(id,level,decrease); }
// public static void propagateLevel(long id,int level,boolean decrease, ) { net.minecraft.world.chunk.light.LevelPropagator.propagateLevel(id,level,decrease); }
// public int getPropagatedLevel(long sourceId,long targetId,int level) { return wrapperContained.getPropagatedLevel(sourceId,targetId,level); }
// public static int getPropagatedLevel(long sourceId,long targetId,int level, ) { return net.minecraft.world.chunk.light.LevelPropagator.getPropagatedLevel(sourceId,targetId,level); }
// // public boolean hasPendingUpdates() { return wrapperContained.hasPendingUpdates(); }
// // public static boolean hasPendingUpdates() { return net.minecraft.world.chunk.light.LevelPropagator.hasPendingUpdates(); }
// public void resetLevel(long id) { wrapperContained.resetLevel(id); }
// public static void resetLevel(long id, ) { net.minecraft.world.chunk.light.LevelPropagator.resetLevel(id); }
// public int applyPendingUpdates(int maxSteps) { return wrapperContained.applyPendingUpdates(maxSteps); }
// public static int applyPendingUpdates(int maxSteps, ) { return net.minecraft.world.chunk.light.LevelPropagator.applyPendingUpdates(maxSteps); }
// public boolean isMarker(long id) { return wrapperContained.isMarker(id); }
// public static boolean isMarker(long id, ) { return net.minecraft.world.chunk.light.LevelPropagator.isMarker(id); }
public void removePendingUpdateIf(java.util.function.LongPredicate predicate) { wrapperContained.removePendingUpdateIf(predicate); }
// public static void removePendingUpdateIf(java.util.function.LongPredicate predicate, ) { net.minecraft.world.chunk.light.LevelPropagator.removePendingUpdateIf(predicate); }
public int getPendingUpdateCount() { return wrapperContained.getPendingUpdateCount(); }
// public static int getPendingUpdateCount() { return net.minecraft.world.chunk.light.LevelPropagator.getPendingUpdateCount(); }
// public int calculateLevel(int a,int b) { return wrapperContained.calculateLevel(a,b); }
// public static int calculateLevel(int a,int b, ) { return net.minecraft.world.chunk.light.LevelPropagator.calculateLevel(a,b); }

}