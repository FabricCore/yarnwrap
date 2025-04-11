package yarnwrap.server.world;
public class ServerEntityManager { public net.minecraft.server.world.ServerEntityManager wrapperContained; public ServerEntityManager(net.minecraft.server.world.ServerEntityManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.Set entityUuids() { return wrapperContained.entityUuids; }
// public void entityUuids(java.util.Set value) { wrapperContained.entityUuids = value; }
// public yarnwrap.world.entity.EntityHandler handler() { return new yarnwrap.world.entity.EntityHandler(wrapperContained.handler); }
// public void handler(yarnwrap.world.entity.EntityHandler value) { wrapperContained.handler = value.wrapperContained; }
// public yarnwrap.world.storage.ChunkDataAccess dataAccess() { return new yarnwrap.world.storage.ChunkDataAccess(wrapperContained.dataAccess); }
// public void dataAccess(yarnwrap.world.storage.ChunkDataAccess value) { wrapperContained.dataAccess = value.wrapperContained; }
// public yarnwrap.world.entity.EntityIndex index() { return new yarnwrap.world.entity.EntityIndex(wrapperContained.index); }
// public void index(yarnwrap.world.entity.EntityIndex value) { wrapperContained.index = value.wrapperContained; }
// public yarnwrap.world.entity.SectionedEntityCache cache() { return new yarnwrap.world.entity.SectionedEntityCache(wrapperContained.cache); }
// public void cache(yarnwrap.world.entity.SectionedEntityCache value) { wrapperContained.cache = value.wrapperContained; }
// public yarnwrap.world.entity.EntityLookup lookup() { return new yarnwrap.world.entity.EntityLookup(wrapperContained.lookup); }
// public void lookup(yarnwrap.world.entity.EntityLookup value) { wrapperContained.lookup = value.wrapperContained; }
// public it.unimi.dsi.fastutil.longs.Long2ObjectMap trackingStatuses() { return wrapperContained.trackingStatuses; }
// public void trackingStatuses(it.unimi.dsi.fastutil.longs.Long2ObjectMap value) { wrapperContained.trackingStatuses = value; }
// public it.unimi.dsi.fastutil.longs.Long2ObjectMap managedStatuses() { return wrapperContained.managedStatuses; }
// public void managedStatuses(it.unimi.dsi.fastutil.longs.Long2ObjectMap value) { wrapperContained.managedStatuses = value; }
// public it.unimi.dsi.fastutil.longs.LongSet pendingUnloads() { return wrapperContained.pendingUnloads; }
// public void pendingUnloads(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.pendingUnloads = value; }
// public java.util.Queue loadingQueue() { return wrapperContained.loadingQueue; }
// public void loadingQueue(java.util.Queue value) { wrapperContained.loadingQueue = value; }
public ServerEntityManager(java.lang.Class entityClass,yarnwrap.world.entity.EntityHandler handler,yarnwrap.world.storage.ChunkDataAccess dataAccess) { this.wrapperContained = new net.minecraft.server.world.ServerEntityManager(entityClass,handler.wrapperContained,dataAccess.wrapperContained); }
public void tick() { wrapperContained.tick(); }
// public void readIfFresh(long chunkPos) { wrapperContained.readIfFresh(chunkPos); }
// public void entityLeftSection(long sectionPos,yarnwrap.world.entity.EntityTrackingSection section) { wrapperContained.entityLeftSection(sectionPos,section.wrapperContained); }
// public boolean trySave(long chunkPos,java.util.function.Consumer action) { return wrapperContained.trySave(chunkPos,action); }
// public void method_31813(yarnwrap.util.CsvWriter chunkPos) { wrapperContained.method_31813(chunkPos.wrapperContained); }
// public void method_31814(yarnwrap.util.CsvWriter sectionPos) { wrapperContained.method_31814(sectionPos.wrapperContained); }
public void updateTrackingStatus(yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.server.world.ChunkLevelType levelType) { wrapperContained.updateTrackingStatus(chunkPos.wrapperContained,levelType.wrapperContained); }
public void updateTrackingStatus(yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.world.entity.EntityTrackingStatus trackingStatus) { wrapperContained.updateTrackingStatus(chunkPos.wrapperContained,trackingStatus.wrapperContained); }
// public java.lang.Void method_31817(yarnwrap.util.math.ChunkPos throwable) { return wrapperContained.method_31817(throwable.wrapperContained); }
public boolean addEntity(yarnwrap.world.entity.EntityLike entity) { return wrapperContained.addEntity(entity.wrapperContained); }
// public boolean addEntity(yarnwrap.world.entity.EntityLike entity,boolean existing) { return wrapperContained.addEntity(entity.wrapperContained,existing); }
// public java.util.stream.Stream method_31821(yarnwrap.world.entity.EntityTrackingSection section) { return wrapperContained.method_31821(section.wrapperContained); }
// public void method_31825(yarnwrap.world.entity.EntityTrackingStatus group) { wrapperContained.method_31825(group.wrapperContained); }
// public void dump(java.io.Writer writer) { wrapperContained.dump(writer); }
public boolean has(java.util.UUID uuid) { return wrapperContained.has(uuid); }
public void loadEntities(java.util.stream.Stream entities) { wrapperContained.loadEntities(entities); }
public void save() { wrapperContained.save(); }
// public void scheduleRead(long chunkPos) { wrapperContained.scheduleRead(chunkPos); }
// public boolean addEntityUuid(yarnwrap.world.entity.EntityLike entity) { return wrapperContained.addEntityUuid(entity.wrapperContained); }
// public yarnwrap.world.entity.EntityTrackingStatus getNeededLoadStatus(yarnwrap.world.entity.EntityLike entity,yarnwrap.world.entity.EntityTrackingStatus current) { return new yarnwrap.world.entity.EntityTrackingStatus(wrapperContained.getNeededLoadStatus(entity.wrapperContained,current.wrapperContained)); }
public void addEntities(java.util.stream.Stream entities) { wrapperContained.addEntities(entities); }
public void flush() { wrapperContained.flush(); }
// public boolean unload(long chunkPos) { return wrapperContained.unload(chunkPos); }
// public void startTicking(yarnwrap.world.entity.EntityLike entity) { wrapperContained.startTicking(entity.wrapperContained); }
public yarnwrap.world.entity.EntityLookup getLookup() { return new yarnwrap.world.entity.EntityLookup(wrapperContained.getLookup()); }
// public boolean method_31842(long pos) { return wrapperContained.method_31842(pos); }
// public void stopTicking(yarnwrap.world.entity.EntityLike entity) { wrapperContained.stopTicking(entity.wrapperContained); }
public java.lang.String getDebugString() { return wrapperContained.getDebugString(); }
// public void method_31846(long pos) { wrapperContained.method_31846(pos); }
// public void startTracking(yarnwrap.world.entity.EntityLike entity) { wrapperContained.startTracking(entity.wrapperContained); }
// public boolean method_31849(long pos) { return wrapperContained.method_31849(pos); }
// public void stopTracking(yarnwrap.world.entity.EntityLike entity) { wrapperContained.stopTracking(entity.wrapperContained); }
// public void unloadChunks() { wrapperContained.unloadChunks(); }
// public void unload(yarnwrap.world.entity.EntityLike entity) { wrapperContained.unload(entity.wrapperContained); }
// public void loadChunks() { wrapperContained.loadChunks(); }
// public void method_31854(yarnwrap.world.entity.EntityLike entity) { wrapperContained.method_31854(entity.wrapperContained); }
// public it.unimi.dsi.fastutil.longs.LongSet getLoadedChunks() { return wrapperContained.getLoadedChunks(); }
// public void method_31856(yarnwrap.world.entity.EntityLike entity) { wrapperContained.method_31856(entity.wrapperContained); }
// public void method_31857(yarnwrap.world.entity.EntityLike entity) { wrapperContained.method_31857(entity.wrapperContained); }
// public void method_31858(yarnwrap.world.entity.EntityLike entity) { wrapperContained.method_31858(entity.wrapperContained); }
// public boolean method_31859(yarnwrap.world.entity.EntityLike entity) { return wrapperContained.method_31859(entity.wrapperContained); }
// public boolean method_31860(yarnwrap.world.entity.EntityLike entity) { return wrapperContained.method_31860(entity.wrapperContained); }
// public boolean method_31861(yarnwrap.world.entity.EntityLike entity) { return wrapperContained.method_31861(entity.wrapperContained); }
// public boolean method_31862(yarnwrap.world.entity.EntityLike entity) { return wrapperContained.method_31862(entity.wrapperContained); }
// public void method_31863(yarnwrap.world.entity.EntityLike entity) { wrapperContained.method_31863(entity.wrapperContained); }
// public void method_31864(yarnwrap.world.entity.EntityLike entity) { wrapperContained.method_31864(entity.wrapperContained); }
public boolean isLoaded(long chunkPos) { return wrapperContained.isLoaded(chunkPos); }
public boolean shouldTick(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.shouldTick(pos.wrapperContained); }
public boolean shouldTick(yarnwrap.util.math.BlockPos pos) { return wrapperContained.shouldTick(pos.wrapperContained); }
public int getIndexSize() { return wrapperContained.getIndexSize(); }

}