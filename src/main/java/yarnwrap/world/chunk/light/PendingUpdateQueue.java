package yarnwrap.world.chunk.light;
public class PendingUpdateQueue { public net.minecraft.world.chunk.light.PendingUpdateQueue wrapperContained; public PendingUpdateQueue(net.minecraft.world.chunk.light.PendingUpdateQueue wrapperContained) { this.wrapperContained = wrapperContained; }

// public int levelCount() { return wrapperContained.levelCount; }
// public void levelCount(int value) { wrapperContained.levelCount = value; }
// public static int levelCount() { return net.minecraft.world.chunk.light.PendingUpdateQueue.levelCount; }
// public static void levelCount(int value, ) { net.minecraft.world.chunk.light.PendingUpdateQueue.levelCount = value; }

// public it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet[] pendingIdUpdatesByLevel() { return wrapperContained.pendingIdUpdatesByLevel; }
// public void pendingIdUpdatesByLevel(it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet[] value) { wrapperContained.pendingIdUpdatesByLevel = value; }
// public static it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet[] pendingIdUpdatesByLevel() { return net.minecraft.world.chunk.light.PendingUpdateQueue.pendingIdUpdatesByLevel; }
// public static void pendingIdUpdatesByLevel(it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet[] value, ) { net.minecraft.world.chunk.light.PendingUpdateQueue.pendingIdUpdatesByLevel = value; }

// public int minPendingLevel() { return wrapperContained.minPendingLevel; }
// public void minPendingLevel(int value) { wrapperContained.minPendingLevel = value; }
// public static int minPendingLevel() { return net.minecraft.world.chunk.light.PendingUpdateQueue.minPendingLevel; }
// public static void minPendingLevel(int value, ) { net.minecraft.world.chunk.light.PendingUpdateQueue.minPendingLevel = value; }

public PendingUpdateQueue(int levelCount,int expectedLevelSize) { this.wrapperContained = new net.minecraft.world.chunk.light.PendingUpdateQueue(levelCount,expectedLevelSize); }
public long dequeue() { return wrapperContained.dequeue(); }
// public static long dequeue() { return net.minecraft.world.chunk.light.PendingUpdateQueue.dequeue(); }
// public void increaseMinPendingLevel(int maxLevel) { wrapperContained.increaseMinPendingLevel(maxLevel); }
// public static void increaseMinPendingLevel(int maxLevel, ) { net.minecraft.world.chunk.light.PendingUpdateQueue.increaseMinPendingLevel(maxLevel); }
public void enqueue(long id,int level) { wrapperContained.enqueue(id,level); }
// public static void enqueue(long id,int level, ) { net.minecraft.world.chunk.light.PendingUpdateQueue.enqueue(id,level); }
public void remove(long id,int level,int levelCount) { wrapperContained.remove(id,level,levelCount); }
// public static void remove(long id,int level,int levelCount, ) { net.minecraft.world.chunk.light.PendingUpdateQueue.remove(id,level,levelCount); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.world.chunk.light.PendingUpdateQueue.isEmpty(); }

}