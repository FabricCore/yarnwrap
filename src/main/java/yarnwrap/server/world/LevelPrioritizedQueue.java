package yarnwrap.server.world;
public class LevelPrioritizedQueue { public net.minecraft.server.world.LevelPrioritizedQueue wrapperContained; public LevelPrioritizedQueue(net.minecraft.server.world.LevelPrioritizedQueue wrapperContained) { this.wrapperContained = wrapperContained; }

public int LEVEL_COUNT() { return wrapperContained.LEVEL_COUNT; }
// public void LEVEL_COUNT(int value) { wrapperContained.LEVEL_COUNT = value; }
// public java.util.List levelToPosToElements() { return wrapperContained.levelToPosToElements; }
// public void levelToPosToElements(java.util.List value) { wrapperContained.levelToPosToElements = value; }
// public int firstNonEmptyLevel() { return wrapperContained.firstNonEmptyLevel; }
// public void firstNonEmptyLevel(int value) { wrapperContained.firstNonEmptyLevel = value; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public it.unimi.dsi.fastutil.longs.LongSet blockingChunks() { return wrapperContained.blockingChunks; }
// public void blockingChunks(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.blockingChunks = value; }
// public int maxBlocking() { return wrapperContained.maxBlocking; }
// public void maxBlocking(int value) { wrapperContained.maxBlocking = value; }
public LevelPrioritizedQueue(java.lang.String name,int maxSize) { this.wrapperContained = new net.minecraft.server.world.LevelPrioritizedQueue(name,maxSize); }
// public void updateLevel(int fromLevel,yarnwrap.util.math.ChunkPos pos,int toLevel) { wrapperContained.updateLevel(fromLevel,pos.wrapperContained,toLevel); }
// public void add(java.util.Optional element,long pos,int level) { wrapperContained.add(element,pos,level); }
public java.util.stream.Stream poll() { return wrapperContained.poll(); }
// public java.lang.Runnable createBlockingAdder(long pos) { return wrapperContained.createBlockingAdder(pos); }
// public void remove(long pos,boolean removeElement) { wrapperContained.remove(pos,removeElement); }
// public it.unimi.dsi.fastutil.longs.LongSet getBlockingChunks() { return wrapperContained.getBlockingChunks(); }
public boolean hasQueuedElement() { return wrapperContained.hasQueuedElement(); }

}