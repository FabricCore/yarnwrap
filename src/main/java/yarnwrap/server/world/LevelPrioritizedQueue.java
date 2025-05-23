package yarnwrap.server.world;
public class LevelPrioritizedQueue { public net.minecraft.server.world.LevelPrioritizedQueue wrapperContained; public LevelPrioritizedQueue(net.minecraft.server.world.LevelPrioritizedQueue wrapperContained) { this.wrapperContained = wrapperContained; }

// public int LEVEL_COUNT() { return wrapperContained.LEVEL_COUNT; }
// public void LEVEL_COUNT(int value) { wrapperContained.LEVEL_COUNT = value; }
public static int LEVEL_COUNT() { return net.minecraft.server.world.LevelPrioritizedQueue.LEVEL_COUNT; }
// public static void LEVEL_COUNT(int value, ) { net.minecraft.server.world.LevelPrioritizedQueue.LEVEL_COUNT = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.server.world.LevelPrioritizedQueue.name; }
// public static void name(java.lang.String value, ) { net.minecraft.server.world.LevelPrioritizedQueue.name = value; }

// public java.util.List values() { return wrapperContained.values; }
// public void values(java.util.List value) { wrapperContained.values = value; }
// public static java.util.List values() { return net.minecraft.server.world.LevelPrioritizedQueue.values; }
// public static void values(java.util.List value, ) { net.minecraft.server.world.LevelPrioritizedQueue.values = value; }

// public int topPriority() { return wrapperContained.topPriority; }
// public void topPriority(int value) { wrapperContained.topPriority = value; }
// public static int topPriority() { return net.minecraft.server.world.LevelPrioritizedQueue.topPriority; }
// public static void topPriority(int value, ) { net.minecraft.server.world.LevelPrioritizedQueue.topPriority = value; }

public LevelPrioritizedQueue(java.lang.String name) { this.wrapperContained = new net.minecraft.server.world.LevelPrioritizedQueue(name); }
// public it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap method_17271(int level) { return wrapperContained.method_17271(level); }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap method_17271(int level, ) { return net.minecraft.server.world.LevelPrioritizedQueue.method_17271(level); }
// public void updateLevel(int fromLevel,yarnwrap.util.math.ChunkPos pos,int toLevel) { wrapperContained.updateLevel(fromLevel,pos.wrapperContained,toLevel); }
// public static void updateLevel(int fromLevel,yarnwrap.util.math.ChunkPos pos,int toLevel, ) { net.minecraft.server.world.LevelPrioritizedQueue.updateLevel(fromLevel,pos.wrapperContained,toLevel); }
// public java.util.List method_17273(long chunkPos) { return wrapperContained.method_17273(chunkPos); }
// public static java.util.List method_17273(long chunkPos, ) { return net.minecraft.server.world.LevelPrioritizedQueue.method_17273(chunkPos); }
// public void add(java.lang.Runnable task,long pos,int level) { wrapperContained.add(task,pos,level); }
// public static void add(java.lang.Runnable task,long pos,int level, ) { net.minecraft.server.world.LevelPrioritizedQueue.add(task,pos,level); }
// public java.util.List method_17277(long chunkPos) { return wrapperContained.method_17277(chunkPos); }
// public static java.util.List method_17277(long chunkPos, ) { return net.minecraft.server.world.LevelPrioritizedQueue.method_17277(chunkPos); }
public Object poll() { return wrapperContained.poll(); }
// public static Object poll() { return net.minecraft.server.world.LevelPrioritizedQueue.poll(); }
// public void remove(long pos,boolean removeElement) { wrapperContained.remove(pos,removeElement); }
// public static void remove(long pos,boolean removeElement, ) { net.minecraft.server.world.LevelPrioritizedQueue.remove(pos,removeElement); }
public boolean hasQueuedElement() { return wrapperContained.hasQueuedElement(); }
// public static boolean hasQueuedElement() { return net.minecraft.server.world.LevelPrioritizedQueue.hasQueuedElement(); }

}