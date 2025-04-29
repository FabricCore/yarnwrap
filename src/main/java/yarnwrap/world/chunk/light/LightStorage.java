package yarnwrap.world.chunk.light;
public class LightStorage { public net.minecraft.world.chunk.light.LightStorage wrapperContained; public LightStorage(net.minecraft.world.chunk.light.LightStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.chunk.ChunkToNibbleArrayMap storage() { return new yarnwrap.world.chunk.ChunkToNibbleArrayMap(wrapperContained.storage); }
// public void storage(yarnwrap.world.chunk.ChunkToNibbleArrayMap value) { wrapperContained.storage = value.wrapperContained; }
// public static yarnwrap.world.chunk.ChunkToNibbleArrayMap storage() { return new yarnwrap.world.chunk.ChunkToNibbleArrayMap(net.minecraft.world.chunk.light.LightStorage.storage); }
// public static void storage(yarnwrap.world.chunk.ChunkToNibbleArrayMap value, ) { net.minecraft.world.chunk.light.LightStorage.storage = value.wrapperContained; }

// public it.unimi.dsi.fastutil.longs.LongSet sectionsToRemove() { return wrapperContained.sectionsToRemove; }
// public void sectionsToRemove(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.sectionsToRemove = value; }
// public static it.unimi.dsi.fastutil.longs.LongSet sectionsToRemove() { return net.minecraft.world.chunk.light.LightStorage.sectionsToRemove; }
// public static void sectionsToRemove(it.unimi.dsi.fastutil.longs.LongSet value, ) { net.minecraft.world.chunk.light.LightStorage.sectionsToRemove = value; }

// public it.unimi.dsi.fastutil.longs.LongSet dirtySections() { return wrapperContained.dirtySections; }
// public void dirtySections(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.dirtySections = value; }
// public static it.unimi.dsi.fastutil.longs.LongSet dirtySections() { return net.minecraft.world.chunk.light.LightStorage.dirtySections; }
// public static void dirtySections(it.unimi.dsi.fastutil.longs.LongSet value, ) { net.minecraft.world.chunk.light.LightStorage.dirtySections = value; }

// public yarnwrap.world.chunk.ChunkProvider chunkProvider() { return new yarnwrap.world.chunk.ChunkProvider(wrapperContained.chunkProvider); }
// public void chunkProvider(yarnwrap.world.chunk.ChunkProvider value) { wrapperContained.chunkProvider = value.wrapperContained; }
// public static yarnwrap.world.chunk.ChunkProvider chunkProvider() { return new yarnwrap.world.chunk.ChunkProvider(net.minecraft.world.chunk.light.LightStorage.chunkProvider); }
// public static void chunkProvider(yarnwrap.world.chunk.ChunkProvider value, ) { net.minecraft.world.chunk.light.LightStorage.chunkProvider = value.wrapperContained; }

// public yarnwrap.world.LightType lightType() { return new yarnwrap.world.LightType(wrapperContained.lightType); }
// public void lightType(yarnwrap.world.LightType value) { wrapperContained.lightType = value.wrapperContained; }
// public static yarnwrap.world.LightType lightType() { return new yarnwrap.world.LightType(net.minecraft.world.chunk.light.LightStorage.lightType); }
// public static void lightType(yarnwrap.world.LightType value, ) { net.minecraft.world.chunk.light.LightStorage.lightType = value.wrapperContained; }

// public yarnwrap.world.chunk.ChunkToNibbleArrayMap uncachedStorage() { return new yarnwrap.world.chunk.ChunkToNibbleArrayMap(wrapperContained.uncachedStorage); }
// public void uncachedStorage(yarnwrap.world.chunk.ChunkToNibbleArrayMap value) { wrapperContained.uncachedStorage = value.wrapperContained; }
// public static yarnwrap.world.chunk.ChunkToNibbleArrayMap uncachedStorage() { return new yarnwrap.world.chunk.ChunkToNibbleArrayMap(net.minecraft.world.chunk.light.LightStorage.uncachedStorage); }
// public static void uncachedStorage(yarnwrap.world.chunk.ChunkToNibbleArrayMap value, ) { net.minecraft.world.chunk.light.LightStorage.uncachedStorage = value.wrapperContained; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectMap queuedSections() { return wrapperContained.queuedSections; }
// public void queuedSections(it.unimi.dsi.fastutil.longs.Long2ObjectMap value) { wrapperContained.queuedSections = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectMap queuedSections() { return net.minecraft.world.chunk.light.LightStorage.queuedSections; }
// public static void queuedSections(it.unimi.dsi.fastutil.longs.Long2ObjectMap value, ) { net.minecraft.world.chunk.light.LightStorage.queuedSections = value; }

// public it.unimi.dsi.fastutil.longs.LongSet notifySections() { return wrapperContained.notifySections; }
// public void notifySections(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.notifySections = value; }
// public static it.unimi.dsi.fastutil.longs.LongSet notifySections() { return net.minecraft.world.chunk.light.LightStorage.notifySections; }
// public static void notifySections(it.unimi.dsi.fastutil.longs.LongSet value, ) { net.minecraft.world.chunk.light.LightStorage.notifySections = value; }

// public it.unimi.dsi.fastutil.longs.LongSet columnsToRetain() { return wrapperContained.columnsToRetain; }
// public void columnsToRetain(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.columnsToRetain = value; }
// public static it.unimi.dsi.fastutil.longs.LongSet columnsToRetain() { return net.minecraft.world.chunk.light.LightStorage.columnsToRetain; }
// public static void columnsToRetain(it.unimi.dsi.fastutil.longs.LongSet value, ) { net.minecraft.world.chunk.light.LightStorage.columnsToRetain = value; }

// public it.unimi.dsi.fastutil.longs.Long2ByteMap sectionPropagations() { return wrapperContained.sectionPropagations; }
// public void sectionPropagations(it.unimi.dsi.fastutil.longs.Long2ByteMap value) { wrapperContained.sectionPropagations = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ByteMap sectionPropagations() { return net.minecraft.world.chunk.light.LightStorage.sectionPropagations; }
// public static void sectionPropagations(it.unimi.dsi.fastutil.longs.Long2ByteMap value, ) { net.minecraft.world.chunk.light.LightStorage.sectionPropagations = value; }

// public boolean hasLightUpdates() { return wrapperContained.hasLightUpdates; }
// public void hasLightUpdates(boolean value) { wrapperContained.hasLightUpdates = value; }
// public static boolean hasLightUpdates() { return net.minecraft.world.chunk.light.LightStorage.hasLightUpdates; }
// public static void hasLightUpdates(boolean value, ) { net.minecraft.world.chunk.light.LightStorage.hasLightUpdates = value; }

// public it.unimi.dsi.fastutil.longs.LongSet enabledColumns() { return wrapperContained.enabledColumns; }
// public void enabledColumns(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.enabledColumns = value; }
// public static it.unimi.dsi.fastutil.longs.LongSet enabledColumns() { return net.minecraft.world.chunk.light.LightStorage.enabledColumns; }
// public static void enabledColumns(it.unimi.dsi.fastutil.longs.LongSet value, ) { net.minecraft.world.chunk.light.LightStorage.enabledColumns = value; }

// public LightStorage(yarnwrap.world.LightType lightType,yarnwrap.world.chunk.ChunkProvider chunkProvider,yarnwrap.world.chunk.ChunkToNibbleArrayMap lightData) { this.wrapperContained = new net.minecraft.world.chunk.light.LightStorage(lightType.wrapperContained,chunkProvider.wrapperContained,lightData.wrapperContained); }
// public yarnwrap.world.chunk.ChunkNibbleArray getLightSection(long sectionPos,boolean cached) { return new yarnwrap.world.chunk.ChunkNibbleArray(wrapperContained.getLightSection(sectionPos,cached)); }
// public static yarnwrap.world.chunk.ChunkNibbleArray getLightSection(long sectionPos,boolean cached, ) { return new yarnwrap.world.chunk.ChunkNibbleArray(net.minecraft.world.chunk.light.LightStorage.getLightSection(sectionPos,cached)); }
// public void onLoadSection(long sectionPos) { wrapperContained.onLoadSection(sectionPos); }
// public static void onLoadSection(long sectionPos, ) { net.minecraft.world.chunk.light.LightStorage.onLoadSection(sectionPos); }
// public boolean hasSection(long sectionPos) { return wrapperContained.hasSection(sectionPos); }
// public static boolean hasSection(long sectionPos, ) { return net.minecraft.world.chunk.light.LightStorage.hasSection(sectionPos); }
// public void set(long blockPos,int value) { wrapperContained.set(blockPos,value); }
// public static void set(long blockPos,int value, ) { net.minecraft.world.chunk.light.LightStorage.set(blockPos,value); }
// public void setSectionStatus(long sectionPos,boolean notReady) { wrapperContained.setSectionStatus(sectionPos,notReady); }
// public static void setSectionStatus(long sectionPos,boolean notReady, ) { net.minecraft.world.chunk.light.LightStorage.setSectionStatus(sectionPos,notReady); }
// public void updateLight(yarnwrap.world.chunk.light.ChunkLightProvider lightProvider) { wrapperContained.updateLight(lightProvider.wrapperContained); }
// public static void updateLight(yarnwrap.world.chunk.light.ChunkLightProvider lightProvider, ) { net.minecraft.world.chunk.light.LightStorage.updateLight(lightProvider.wrapperContained); }
// // public boolean hasLightUpdates() { return wrapperContained.hasLightUpdates(); }
// // public static boolean hasLightUpdates() { return net.minecraft.world.chunk.light.LightStorage.hasLightUpdates(); }
// public yarnwrap.world.chunk.ChunkNibbleArray createSection(long sectionPos) { return new yarnwrap.world.chunk.ChunkNibbleArray(wrapperContained.createSection(sectionPos)); }
// public static yarnwrap.world.chunk.ChunkNibbleArray createSection(long sectionPos, ) { return new yarnwrap.world.chunk.ChunkNibbleArray(net.minecraft.world.chunk.light.LightStorage.createSection(sectionPos)); }
// public void notifyChanges() { wrapperContained.notifyChanges(); }
// public static void notifyChanges() { net.minecraft.world.chunk.light.LightStorage.notifyChanges(); }
// public void enqueueSectionData(long sectionPos,yarnwrap.world.chunk.ChunkNibbleArray array) { wrapperContained.enqueueSectionData(sectionPos,array.wrapperContained); }
// public static void enqueueSectionData(long sectionPos,yarnwrap.world.chunk.ChunkNibbleArray array, ) { net.minecraft.world.chunk.light.LightStorage.enqueueSectionData(sectionPos,array.wrapperContained); }
// public yarnwrap.world.chunk.ChunkNibbleArray getLightSection(yarnwrap.world.chunk.ChunkToNibbleArrayMap storage,long sectionPos) { return new yarnwrap.world.chunk.ChunkNibbleArray(wrapperContained.getLightSection(storage.wrapperContained,sectionPos)); }
// public static yarnwrap.world.chunk.ChunkNibbleArray getLightSection(yarnwrap.world.chunk.ChunkToNibbleArrayMap storage,long sectionPos, ) { return new yarnwrap.world.chunk.ChunkNibbleArray(net.minecraft.world.chunk.light.LightStorage.getLightSection(storage.wrapperContained,sectionPos)); }
// public void onUnloadSection(long sectionPos) { wrapperContained.onUnloadSection(sectionPos); }
// public static void onUnloadSection(long sectionPos, ) { net.minecraft.world.chunk.light.LightStorage.onUnloadSection(sectionPos); }
// public void setColumnEnabled(long columnPos,boolean enabled) { wrapperContained.setColumnEnabled(columnPos,enabled); }
// public static void setColumnEnabled(long columnPos,boolean enabled, ) { net.minecraft.world.chunk.light.LightStorage.setColumnEnabled(columnPos,enabled); }
// public int get(long blockPos) { return wrapperContained.get(blockPos); }
// public static int get(long blockPos, ) { return net.minecraft.world.chunk.light.LightStorage.get(blockPos); }
// public int getLight(long blockPos) { return wrapperContained.getLight(blockPos); }
// public static int getLight(long blockPos, ) { return net.minecraft.world.chunk.light.LightStorage.getLight(blockPos); }
public yarnwrap.world.chunk.ChunkNibbleArray getLightSection(long sectionPos) { return new yarnwrap.world.chunk.ChunkNibbleArray(wrapperContained.getLightSection(sectionPos)); }
// public static yarnwrap.world.chunk.ChunkNibbleArray getLightSection(long sectionPos, ) { return new yarnwrap.world.chunk.ChunkNibbleArray(net.minecraft.world.chunk.light.LightStorage.getLightSection(sectionPos)); }
public void setRetainColumn(long sectionPos,boolean retain) { wrapperContained.setRetainColumn(sectionPos,retain); }
// public static void setRetainColumn(long sectionPos,boolean retain, ) { net.minecraft.world.chunk.light.LightStorage.setRetainColumn(sectionPos,retain); }
// public void addNotifySections(long id) { wrapperContained.addNotifySections(id); }
// public static void addNotifySections(long id, ) { net.minecraft.world.chunk.light.LightStorage.addNotifySections(id); }
// public void setSectionPropagation(long sectionPos,byte flags) { wrapperContained.setSectionPropagation(sectionPos,flags); }
// public static void setSectionPropagation(long sectionPos,byte flags, ) { net.minecraft.world.chunk.light.LightStorage.setSectionPropagation(sectionPos,flags); }
// public yarnwrap.world.chunk.ChunkNibbleArray method_51547(long sectionPos) { return new yarnwrap.world.chunk.ChunkNibbleArray(wrapperContained.method_51547(sectionPos)); }
// public static yarnwrap.world.chunk.ChunkNibbleArray method_51547(long sectionPos, ) { return new yarnwrap.world.chunk.ChunkNibbleArray(net.minecraft.world.chunk.light.LightStorage.method_51547(sectionPos)); }
// public boolean isSectionInEnabledColumn(long sectionPos) { return wrapperContained.isSectionInEnabledColumn(sectionPos); }
// public static boolean isSectionInEnabledColumn(long sectionPos, ) { return net.minecraft.world.chunk.light.LightStorage.isSectionInEnabledColumn(sectionPos); }
public Object getStatus(long sectionPos) { return wrapperContained.getStatus(sectionPos); }
// public static Object getStatus(long sectionPos, ) { return net.minecraft.world.chunk.light.LightStorage.getStatus(sectionPos); }
// public void queueForUpdate(long sectionPos) { wrapperContained.queueForUpdate(sectionPos); }
// public static void queueForUpdate(long sectionPos, ) { net.minecraft.world.chunk.light.LightStorage.queueForUpdate(sectionPos); }
// public void queueForRemoval(long sectionPos) { wrapperContained.queueForRemoval(sectionPos); }
// public static void queueForRemoval(long sectionPos, ) { net.minecraft.world.chunk.light.LightStorage.queueForRemoval(sectionPos); }

}