package yarnwrap.world.chunk.light;
public class LightStorage { public net.minecraft.world.chunk.light.LightStorage wrapperContained; public LightStorage(net.minecraft.world.chunk.light.LightStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.chunk.ChunkToNibbleArrayMap storage() { return new yarnwrap.world.chunk.ChunkToNibbleArrayMap(wrapperContained.storage); }
// public it.unimi.dsi.fastutil.longs.LongSet sectionsToRemove() { return wrapperContained.sectionsToRemove; }
// public it.unimi.dsi.fastutil.longs.LongSet dirtySections() { return wrapperContained.dirtySections; }
// public yarnwrap.world.chunk.ChunkProvider chunkProvider() { return new yarnwrap.world.chunk.ChunkProvider(wrapperContained.chunkProvider); }
// public yarnwrap.world.LightType lightType() { return new yarnwrap.world.LightType(wrapperContained.lightType); }
// public yarnwrap.world.chunk.ChunkToNibbleArrayMap uncachedStorage() { return new yarnwrap.world.chunk.ChunkToNibbleArrayMap(wrapperContained.uncachedStorage); }
// public it.unimi.dsi.fastutil.longs.Long2ObjectMap queuedSections() { return wrapperContained.queuedSections; }
// public it.unimi.dsi.fastutil.longs.LongSet notifySections() { return wrapperContained.notifySections; }
// public it.unimi.dsi.fastutil.longs.LongSet columnsToRetain() { return wrapperContained.columnsToRetain; }
// public it.unimi.dsi.fastutil.longs.Long2ByteMap sectionPropagations() { return wrapperContained.sectionPropagations; }
// public boolean hasLightUpdates() { return wrapperContained.hasLightUpdates; }
// public it.unimi.dsi.fastutil.longs.LongSet enabledColumns() { return wrapperContained.enabledColumns; }
// public yarnwrap.world.chunk.ChunkNibbleArray getLightSection(long sectionPos,boolean cached) { return new yarnwrap.world.chunk.ChunkNibbleArray(wrapperContained.getLightSection(sectionPos,cached)); }
// public void onLoadSection(long sectionPos) { wrapperContained.onLoadSection(sectionPos); }
// public boolean hasSection(long sectionPos) { return wrapperContained.hasSection(sectionPos); }
// public void set(long blockPos,int value) { wrapperContained.set(blockPos,value); }
// public void setSectionStatus(long sectionPos,boolean notReady) { wrapperContained.setSectionStatus(sectionPos,notReady); }
// public void updateLight(yarnwrap.world.chunk.light.ChunkLightProvider lightProvider) { wrapperContained.updateLight(lightProvider.wrapperContained); }
// // public boolean hasLightUpdates() { return wrapperContained.hasLightUpdates(); }
// public yarnwrap.world.chunk.ChunkNibbleArray createSection(long sectionPos) { return new yarnwrap.world.chunk.ChunkNibbleArray(wrapperContained.createSection(sectionPos)); }
// public void notifyChanges() { wrapperContained.notifyChanges(); }
// public void enqueueSectionData(long sectionPos,yarnwrap.world.chunk.ChunkNibbleArray array) { wrapperContained.enqueueSectionData(sectionPos,array.wrapperContained); }
// public yarnwrap.world.chunk.ChunkNibbleArray getLightSection(yarnwrap.world.chunk.ChunkToNibbleArrayMap storage,long sectionPos) { return new yarnwrap.world.chunk.ChunkNibbleArray(wrapperContained.getLightSection(storage.wrapperContained,sectionPos)); }
// public void onUnloadSection(long sectionPos) { wrapperContained.onUnloadSection(sectionPos); }
// public void setColumnEnabled(long columnPos,boolean enabled) { wrapperContained.setColumnEnabled(columnPos,enabled); }
// public int get(long blockPos) { return wrapperContained.get(blockPos); }
// public int getLight(long blockPos) { return wrapperContained.getLight(blockPos); }
public yarnwrap.world.chunk.ChunkNibbleArray getLightSection(long sectionPos) { return new yarnwrap.world.chunk.ChunkNibbleArray(wrapperContained.getLightSection(sectionPos)); }
public void setRetainColumn(long sectionPos,boolean retain) { wrapperContained.setRetainColumn(sectionPos,retain); }
// public void addNotifySections(long id) { wrapperContained.addNotifySections(id); }
// public void setSectionPropagation(long sectionPos,byte flags) { wrapperContained.setSectionPropagation(sectionPos,flags); }
// public boolean isSectionInEnabledColumn(long sectionPos) { return wrapperContained.isSectionInEnabledColumn(sectionPos); }
public Object getStatus(long sectionPos) { return wrapperContained.getStatus(sectionPos); }
// public void queueForUpdate(long sectionPos) { wrapperContained.queueForUpdate(sectionPos); }
// public void queueForRemoval(long sectionPos) { wrapperContained.queueForRemoval(sectionPos); }

}