package yarnwrap.server.world;
public class LevelPrioritizedQueue { public net.minecraft.server.world.LevelPrioritizedQueue wrapperContained; public LevelPrioritizedQueue(net.minecraft.server.world.LevelPrioritizedQueue wrapperContained) { this.wrapperContained = wrapperContained; }

public int LEVEL_COUNT() { return wrapperContained.LEVEL_COUNT; }
// public java.util.List levelToPosToElements() { return wrapperContained.levelToPosToElements; }
// public int firstNonEmptyLevel() { return wrapperContained.firstNonEmptyLevel; }
// public java.lang.String name() { return wrapperContained.name; }
// public it.unimi.dsi.fastutil.longs.LongSet blockingChunks() { return wrapperContained.blockingChunks; }
// public int maxBlocking() { return wrapperContained.maxBlocking; }
// public void updateLevel(int fromLevel,yarnwrap.util.math.ChunkPos pos,int toLevel) { wrapperContained.updateLevel(fromLevel,pos.wrapperContained,toLevel); }
// public void add(java.util.Optional element,long pos,int level) { wrapperContained.add(element,pos,level); }
public java.util.stream.Stream poll() { return wrapperContained.poll(); }
// public java.lang.Runnable createBlockingAdder(long pos) { return wrapperContained.createBlockingAdder(pos); }
// public void remove(long pos,boolean removeElement) { wrapperContained.remove(pos,removeElement); }
// public it.unimi.dsi.fastutil.longs.LongSet getBlockingChunks() { return wrapperContained.getBlockingChunks(); }
public boolean hasQueuedElement() { return wrapperContained.hasQueuedElement(); }

}