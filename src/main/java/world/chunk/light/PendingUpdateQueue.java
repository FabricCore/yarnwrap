package yarnwrap.world.chunk.light;
public class PendingUpdateQueue { public net.minecraft.world.chunk.light.PendingUpdateQueue wrapperContained; public PendingUpdateQueue(net.minecraft.world.chunk.light.PendingUpdateQueue wrapperContained) { this.wrapperContained = wrapperContained; }

// public int levelCount() { return wrapperContained.levelCount; }
// public it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet[] pendingIdUpdatesByLevel() { return wrapperContained.pendingIdUpdatesByLevel; }
// public int minPendingLevel() { return wrapperContained.minPendingLevel; }
public long dequeue() { return wrapperContained.dequeue(); }
// public void increaseMinPendingLevel(int maxLevel) { wrapperContained.increaseMinPendingLevel(maxLevel); }
public void enqueue(long id,int level) { wrapperContained.enqueue(id,level); }
public void remove(long id,int level,int levelCount) { wrapperContained.remove(id,level,levelCount); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }

}