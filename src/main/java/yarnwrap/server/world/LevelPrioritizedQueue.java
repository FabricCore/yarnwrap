package yarnwrap.server.world;
public class LevelPrioritizedQueue { public net.minecraft.server.world.LevelPrioritizedQueue wrapperContained; public LevelPrioritizedQueue(net.minecraft.server.world.LevelPrioritizedQueue wrapperContained) { this.wrapperContained = wrapperContained; }

// public int LEVEL_COUNT() { return wrapperContained.LEVEL_COUNT; }
// public void LEVEL_COUNT(int value) { wrapperContained.LEVEL_COUNT = value; }
public static int LEVEL_COUNT() { return net.minecraft.server.world.LevelPrioritizedQueue.LEVEL_COUNT; }
// public static void LEVEL_COUNT(int value, ) { net.minecraft.server.world.LevelPrioritizedQueue.LEVEL_COUNT = value; }

// public java.util.List levelToPosToElements() { return wrapperContained.levelToPosToElements; }
// public void levelToPosToElements(java.util.List value) { wrapperContained.levelToPosToElements = value; }
// public static java.util.List levelToPosToElements() { return net.minecraft.server.world.LevelPrioritizedQueue.levelToPosToElements; }
// public static void levelToPosToElements(java.util.List value, ) { net.minecraft.server.world.LevelPrioritizedQueue.levelToPosToElements = value; }

// public int firstNonEmptyLevel() { return wrapperContained.firstNonEmptyLevel; }
// public void firstNonEmptyLevel(int value) { wrapperContained.firstNonEmptyLevel = value; }
// public static int firstNonEmptyLevel() { return net.minecraft.server.world.LevelPrioritizedQueue.firstNonEmptyLevel; }
// public static void firstNonEmptyLevel(int value, ) { net.minecraft.server.world.LevelPrioritizedQueue.firstNonEmptyLevel = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.server.world.LevelPrioritizedQueue.name; }
// public static void name(java.lang.String value, ) { net.minecraft.server.world.LevelPrioritizedQueue.name = value; }

// public it.unimi.dsi.fastutil.longs.LongSet blockingChunks() { return wrapperContained.blockingChunks; }
// public void blockingChunks(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.blockingChunks = value; }
// public static it.unimi.dsi.fastutil.longs.LongSet blockingChunks() { return net.minecraft.server.world.LevelPrioritizedQueue.blockingChunks; }
// public static void blockingChunks(it.unimi.dsi.fastutil.longs.LongSet value, ) { net.minecraft.server.world.LevelPrioritizedQueue.blockingChunks = value; }

// public int maxBlocking() { return wrapperContained.maxBlocking; }
// public void maxBlocking(int value) { wrapperContained.maxBlocking = value; }
// public static int maxBlocking() { return net.minecraft.server.world.LevelPrioritizedQueue.maxBlocking; }
// public static void maxBlocking(int value, ) { net.minecraft.server.world.LevelPrioritizedQueue.maxBlocking = value; }

public LevelPrioritizedQueue(java.lang.String name,int maxSize) { this.wrapperContained = new net.minecraft.server.world.LevelPrioritizedQueue(name,maxSize); }
// public void updateLevel(int fromLevel,yarnwrap.util.math.ChunkPos pos,int toLevel) { wrapperContained.updateLevel(fromLevel,pos.wrapperContained,toLevel); }
// public static void updateLevel(int fromLevel,yarnwrap.util.math.ChunkPos pos,int toLevel, ) { net.minecraft.server.world.LevelPrioritizedQueue.updateLevel(fromLevel,pos.wrapperContained,toLevel); }
// public void add(java.util.Optional element,long pos,int level) { wrapperContained.add(element,pos,level); }
// public static void add(java.util.Optional element,long pos,int level, ) { net.minecraft.server.world.LevelPrioritizedQueue.add(element,pos,level); }
public java.util.stream.Stream poll() { return wrapperContained.poll(); }
// public static java.util.stream.Stream poll() { return net.minecraft.server.world.LevelPrioritizedQueue.poll(); }
// public java.lang.Runnable createBlockingAdder(long pos) { return wrapperContained.createBlockingAdder(pos); }
// public static java.lang.Runnable createBlockingAdder(long pos, ) { return net.minecraft.server.world.LevelPrioritizedQueue.createBlockingAdder(pos); }
// public void remove(long pos,boolean removeElement) { wrapperContained.remove(pos,removeElement); }
// public static void remove(long pos,boolean removeElement, ) { net.minecraft.server.world.LevelPrioritizedQueue.remove(pos,removeElement); }
// public it.unimi.dsi.fastutil.longs.LongSet getBlockingChunks() { return wrapperContained.getBlockingChunks(); }
// public static it.unimi.dsi.fastutil.longs.LongSet getBlockingChunks() { return net.minecraft.server.world.LevelPrioritizedQueue.getBlockingChunks(); }
public boolean hasQueuedElement() { return wrapperContained.hasQueuedElement(); }
// public static boolean hasQueuedElement() { return net.minecraft.server.world.LevelPrioritizedQueue.hasQueuedElement(); }

}