package yarnwrap.world.entity;
public class SectionedEntityCache { public net.minecraft.world.entity.SectionedEntityCache wrapperContained; public SectionedEntityCache(net.minecraft.world.entity.SectionedEntityCache wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Class entityClass() { return wrapperContained.entityClass; }
// public it.unimi.dsi.fastutil.longs.Long2ObjectFunction posToStatus() { return wrapperContained.posToStatus; }
// public it.unimi.dsi.fastutil.longs.Long2ObjectMap trackingSections() { return wrapperContained.trackingSections; }
// public it.unimi.dsi.fastutil.longs.LongSortedSet trackedPositions() { return wrapperContained.trackedPositions; }
public it.unimi.dsi.fastutil.longs.LongSet getChunkPositions() { return wrapperContained.getChunkPositions(); }
// public it.unimi.dsi.fastutil.longs.LongSortedSet getSections(int chunkX,int chunkZ) { return wrapperContained.getSections(chunkX,chunkZ); }
public java.util.stream.LongStream getSections(long chunkPos) { return wrapperContained.getSections(chunkPos); }
public void forEachIntersects(yarnwrap.util.TypeFilter filter,yarnwrap.util.math.Box box,yarnwrap.util.function.LazyIterationConsumer consumer) { wrapperContained.forEachIntersects(filter.wrapperContained,box.wrapperContained,consumer.wrapperContained); }
public void forEachInBox(yarnwrap.util.math.Box box,yarnwrap.util.function.LazyIterationConsumer consumer) { wrapperContained.forEachInBox(box.wrapperContained,consumer.wrapperContained); }
public int sectionCount() { return wrapperContained.sectionCount(); }
public java.util.stream.Stream getTrackingSections(long chunkPos) { return wrapperContained.getTrackingSections(chunkPos); }
public void forEachIntersects(yarnwrap.util.math.Box box,yarnwrap.util.function.LazyIterationConsumer consumer) { wrapperContained.forEachIntersects(box.wrapperContained,consumer.wrapperContained); }
public yarnwrap.world.entity.EntityTrackingSection getTrackingSection(long sectionPos) { return new yarnwrap.world.entity.EntityTrackingSection(wrapperContained.getTrackingSection(sectionPos)); }
public yarnwrap.world.entity.EntityTrackingSection findTrackingSection(long sectionPos) { return new yarnwrap.world.entity.EntityTrackingSection(wrapperContained.findTrackingSection(sectionPos)); }
public void removeSection(long sectionPos) { wrapperContained.removeSection(sectionPos); }
// public long chunkPosFromSectionPos(long sectionPos) { return wrapperContained.chunkPosFromSectionPos(sectionPos); }
// public yarnwrap.world.entity.EntityTrackingSection addSection(long sectionPos) { return new yarnwrap.world.entity.EntityTrackingSection(wrapperContained.addSection(sectionPos)); }

}