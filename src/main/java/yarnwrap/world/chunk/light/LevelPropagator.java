package yarnwrap.world.chunk.light;
public class LevelPropagator { public net.minecraft.world.chunk.light.LevelPropagator wrapperContained; public LevelPropagator(net.minecraft.world.chunk.light.LevelPropagator wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean hasPendingUpdates() { return wrapperContained.hasPendingUpdates; }
// public void hasPendingUpdates(boolean value) { wrapperContained.hasPendingUpdates = value; }
// public int levelCount() { return wrapperContained.levelCount; }
// public void levelCount(int value) { wrapperContained.levelCount = value; }
// public it.unimi.dsi.fastutil.longs.Long2ByteMap pendingUpdates() { return wrapperContained.pendingUpdates; }
// public void pendingUpdates(it.unimi.dsi.fastutil.longs.Long2ByteMap value) { wrapperContained.pendingUpdates = value; }
// public int MAX_LEVEL() { return wrapperContained.MAX_LEVEL; }
// public void MAX_LEVEL(int value) { wrapperContained.MAX_LEVEL = value; }
// public yarnwrap.world.chunk.light.PendingUpdateQueue pendingUpdateQueue() { return new yarnwrap.world.chunk.light.PendingUpdateQueue(wrapperContained.pendingUpdateQueue); }
// public void pendingUpdateQueue(yarnwrap.world.chunk.light.PendingUpdateQueue value) { wrapperContained.pendingUpdateQueue = value.wrapperContained; }
// public void updateLevel(long sourceId,long id,int level,boolean decrease) { wrapperContained.updateLevel(sourceId,id,level,decrease); }
// public int getLevel(long id) { return wrapperContained.getLevel(id); }
// public void updateLevel(long sourceId,long id,int level,int currentLevel,int decrease) { wrapperContained.updateLevel(sourceId,id,level,currentLevel,decrease); }
// public void removePendingUpdate(long id) { wrapperContained.removePendingUpdate(id); }
// public void propagateLevel(long sourceId,long targetId,int level,boolean decrease) { wrapperContained.propagateLevel(sourceId,targetId,level,decrease); }
// public void setLevel(long id,int level) { wrapperContained.setLevel(id,level); }
// public int recalculateLevel(long id,long excludedId,int maxLevel) { return wrapperContained.recalculateLevel(id,excludedId,maxLevel); }
// public void propagateLevel(long id,int level,boolean decrease) { wrapperContained.propagateLevel(id,level,decrease); }
// public int getPropagatedLevel(long sourceId,long targetId,int level) { return wrapperContained.getPropagatedLevel(sourceId,targetId,level); }
// // public boolean hasPendingUpdates() { return wrapperContained.hasPendingUpdates(); }
// public void resetLevel(long id) { wrapperContained.resetLevel(id); }
// public int applyPendingUpdates(int maxSteps) { return wrapperContained.applyPendingUpdates(maxSteps); }
// public boolean isMarker(long id) { return wrapperContained.isMarker(id); }
public void removePendingUpdateIf(java.util.function.LongPredicate predicate) { wrapperContained.removePendingUpdateIf(predicate); }
public int getPendingUpdateCount() { return wrapperContained.getPendingUpdateCount(); }
// public int calculateLevel(int a,int b) { return wrapperContained.calculateLevel(a,b); }

}