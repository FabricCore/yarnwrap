package yarnwrap.server.world;
public class ServerEntityManager { public net.minecraft.server.world.ServerEntityManager wrapperContained; public ServerEntityManager(net.minecraft.server.world.ServerEntityManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.Set entityUuids() { return wrapperContained.entityUuids; }
// public yarnwrap.world.entity.EntityHandler handler() { return new yarnwrap.world.entity.EntityHandler(wrapperContained.handler); }
// public yarnwrap.world.storage.ChunkDataAccess dataAccess() { return new yarnwrap.world.storage.ChunkDataAccess(wrapperContained.dataAccess); }
// public yarnwrap.world.entity.EntityIndex index() { return new yarnwrap.world.entity.EntityIndex(wrapperContained.index); }
// public yarnwrap.world.entity.SectionedEntityCache cache() { return new yarnwrap.world.entity.SectionedEntityCache(wrapperContained.cache); }
// public yarnwrap.world.entity.EntityLookup lookup() { return new yarnwrap.world.entity.EntityLookup(wrapperContained.lookup); }
// public it.unimi.dsi.fastutil.longs.Long2ObjectMap trackingStatuses() { return wrapperContained.trackingStatuses; }
// public it.unimi.dsi.fastutil.longs.Long2ObjectMap managedStatuses() { return wrapperContained.managedStatuses; }
// public it.unimi.dsi.fastutil.longs.LongSet pendingUnloads() { return wrapperContained.pendingUnloads; }
// public java.util.Queue loadingQueue() { return wrapperContained.loadingQueue; }
public void tick() { wrapperContained.tick(); }
// public void readIfFresh(long chunkPos) { wrapperContained.readIfFresh(chunkPos); }
// public void entityLeftSection(long sectionPos,yarnwrap.world.entity.EntityTrackingSection section) { wrapperContained.entityLeftSection(sectionPos,section.wrapperContained); }
// public boolean trySave(long chunkPos,java.util.function.Consumer action) { return wrapperContained.trySave(chunkPos,action); }
public void updateTrackingStatus(yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.server.world.ChunkLevelType levelType) { wrapperContained.updateTrackingStatus(chunkPos.wrapperContained,levelType.wrapperContained); }
public void updateTrackingStatus(yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.world.entity.EntityTrackingStatus trackingStatus) { wrapperContained.updateTrackingStatus(chunkPos.wrapperContained,trackingStatus.wrapperContained); }
public boolean addEntity(yarnwrap.world.entity.EntityLike entity) { return wrapperContained.addEntity(entity.wrapperContained); }
// public boolean addEntity(yarnwrap.world.entity.EntityLike entity,boolean existing) { return wrapperContained.addEntity(entity.wrapperContained,existing); }
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
// public void stopTicking(yarnwrap.world.entity.EntityLike entity) { wrapperContained.stopTicking(entity.wrapperContained); }
public java.lang.String getDebugString() { return wrapperContained.getDebugString(); }
// public void startTracking(yarnwrap.world.entity.EntityLike entity) { wrapperContained.startTracking(entity.wrapperContained); }
// public void stopTracking(yarnwrap.world.entity.EntityLike entity) { wrapperContained.stopTracking(entity.wrapperContained); }
// public void unloadChunks() { wrapperContained.unloadChunks(); }
// public void unload(yarnwrap.world.entity.EntityLike entity) { wrapperContained.unload(entity.wrapperContained); }
// public void loadChunks() { wrapperContained.loadChunks(); }
// public it.unimi.dsi.fastutil.longs.LongSet getLoadedChunks() { return wrapperContained.getLoadedChunks(); }
public boolean isLoaded(long chunkPos) { return wrapperContained.isLoaded(chunkPos); }
public boolean shouldTick(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.shouldTick(pos.wrapperContained); }
public boolean shouldTick(yarnwrap.util.math.BlockPos pos) { return wrapperContained.shouldTick(pos.wrapperContained); }
public int getIndexSize() { return wrapperContained.getIndexSize(); }

}