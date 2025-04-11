package yarnwrap.world.chunk.light;
public class PendingUpdateQueue { public net.minecraft.world.chunk.light.PendingUpdateQueue wrapperContained; public PendingUpdateQueue(net.minecraft.world.chunk.light.PendingUpdateQueue wrapperContained) { this.wrapperContained = wrapperContained; }

// public int levelCount() { return wrapperContained.levelCount; }
// public void levelCount(int value) { wrapperContained.levelCount = value; }
// public it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet[] pendingIdUpdatesByLevel() { return wrapperContained.pendingIdUpdatesByLevel; }
// public void pendingIdUpdatesByLevel(it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet[] value) { wrapperContained.pendingIdUpdatesByLevel = value; }
// public int minPendingLevel() { return wrapperContained.minPendingLevel; }
// public void minPendingLevel(int value) { wrapperContained.minPendingLevel = value; }
public long dequeue() { return wrapperContained.dequeue(); }
// public void increaseMinPendingLevel(int maxLevel) { wrapperContained.increaseMinPendingLevel(maxLevel); }
public void enqueue(long id,int level) { wrapperContained.enqueue(id,level); }
public void remove(long id,int level,int levelCount) { wrapperContained.remove(id,level,levelCount); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }

}