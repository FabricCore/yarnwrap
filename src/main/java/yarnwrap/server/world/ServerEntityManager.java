package yarnwrap.server.world;
public class ServerEntityManager { public net.minecraft.server.world.ServerEntityManager wrapperContained; public ServerEntityManager(net.minecraft.server.world.ServerEntityManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.world.ServerEntityManager.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.world.ServerEntityManager.LOGGER = value; }

// public java.util.Set entityUuids() { return wrapperContained.entityUuids; }
// public void entityUuids(java.util.Set value) { wrapperContained.entityUuids = value; }
// public static java.util.Set entityUuids() { return net.minecraft.server.world.ServerEntityManager.entityUuids; }
// public static void entityUuids(java.util.Set value, ) { net.minecraft.server.world.ServerEntityManager.entityUuids = value; }

// public yarnwrap.world.entity.EntityHandler handler() { return new yarnwrap.world.entity.EntityHandler(wrapperContained.handler); }
// public void handler(yarnwrap.world.entity.EntityHandler value) { wrapperContained.handler = value.wrapperContained; }
// public static yarnwrap.world.entity.EntityHandler handler() { return new yarnwrap.world.entity.EntityHandler(net.minecraft.server.world.ServerEntityManager.handler); }
// public static void handler(yarnwrap.world.entity.EntityHandler value, ) { net.minecraft.server.world.ServerEntityManager.handler = value.wrapperContained; }

// public yarnwrap.world.storage.ChunkDataAccess dataAccess() { return new yarnwrap.world.storage.ChunkDataAccess(wrapperContained.dataAccess); }
// public void dataAccess(yarnwrap.world.storage.ChunkDataAccess value) { wrapperContained.dataAccess = value.wrapperContained; }
// public static yarnwrap.world.storage.ChunkDataAccess dataAccess() { return new yarnwrap.world.storage.ChunkDataAccess(net.minecraft.server.world.ServerEntityManager.dataAccess); }
// public static void dataAccess(yarnwrap.world.storage.ChunkDataAccess value, ) { net.minecraft.server.world.ServerEntityManager.dataAccess = value.wrapperContained; }

// public yarnwrap.world.entity.EntityIndex index() { return new yarnwrap.world.entity.EntityIndex(wrapperContained.index); }
// public void index(yarnwrap.world.entity.EntityIndex value) { wrapperContained.index = value.wrapperContained; }
// public static yarnwrap.world.entity.EntityIndex index() { return new yarnwrap.world.entity.EntityIndex(net.minecraft.server.world.ServerEntityManager.index); }
// public static void index(yarnwrap.world.entity.EntityIndex value, ) { net.minecraft.server.world.ServerEntityManager.index = value.wrapperContained; }

// public yarnwrap.world.entity.SectionedEntityCache cache() { return new yarnwrap.world.entity.SectionedEntityCache(wrapperContained.cache); }
// public void cache(yarnwrap.world.entity.SectionedEntityCache value) { wrapperContained.cache = value.wrapperContained; }
// public static yarnwrap.world.entity.SectionedEntityCache cache() { return new yarnwrap.world.entity.SectionedEntityCache(net.minecraft.server.world.ServerEntityManager.cache); }
// public static void cache(yarnwrap.world.entity.SectionedEntityCache value, ) { net.minecraft.server.world.ServerEntityManager.cache = value.wrapperContained; }

// public yarnwrap.world.entity.EntityLookup lookup() { return new yarnwrap.world.entity.EntityLookup(wrapperContained.lookup); }
// public void lookup(yarnwrap.world.entity.EntityLookup value) { wrapperContained.lookup = value.wrapperContained; }
// public static yarnwrap.world.entity.EntityLookup lookup() { return new yarnwrap.world.entity.EntityLookup(net.minecraft.server.world.ServerEntityManager.lookup); }
// public static void lookup(yarnwrap.world.entity.EntityLookup value, ) { net.minecraft.server.world.ServerEntityManager.lookup = value.wrapperContained; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectMap trackingStatuses() { return wrapperContained.trackingStatuses; }
// public void trackingStatuses(it.unimi.dsi.fastutil.longs.Long2ObjectMap value) { wrapperContained.trackingStatuses = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectMap trackingStatuses() { return net.minecraft.server.world.ServerEntityManager.trackingStatuses; }
// public static void trackingStatuses(it.unimi.dsi.fastutil.longs.Long2ObjectMap value, ) { net.minecraft.server.world.ServerEntityManager.trackingStatuses = value; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectMap managedStatuses() { return wrapperContained.managedStatuses; }
// public void managedStatuses(it.unimi.dsi.fastutil.longs.Long2ObjectMap value) { wrapperContained.managedStatuses = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectMap managedStatuses() { return net.minecraft.server.world.ServerEntityManager.managedStatuses; }
// public static void managedStatuses(it.unimi.dsi.fastutil.longs.Long2ObjectMap value, ) { net.minecraft.server.world.ServerEntityManager.managedStatuses = value; }

// public it.unimi.dsi.fastutil.longs.LongSet pendingUnloads() { return wrapperContained.pendingUnloads; }
// public void pendingUnloads(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.pendingUnloads = value; }
// public static it.unimi.dsi.fastutil.longs.LongSet pendingUnloads() { return net.minecraft.server.world.ServerEntityManager.pendingUnloads; }
// public static void pendingUnloads(it.unimi.dsi.fastutil.longs.LongSet value, ) { net.minecraft.server.world.ServerEntityManager.pendingUnloads = value; }

// public java.util.Queue loadingQueue() { return wrapperContained.loadingQueue; }
// public void loadingQueue(java.util.Queue value) { wrapperContained.loadingQueue = value; }
// public static java.util.Queue loadingQueue() { return net.minecraft.server.world.ServerEntityManager.loadingQueue; }
// public static void loadingQueue(java.util.Queue value, ) { net.minecraft.server.world.ServerEntityManager.loadingQueue = value; }

public ServerEntityManager(java.lang.Class entityClass,yarnwrap.world.entity.EntityHandler handler,yarnwrap.world.storage.ChunkDataAccess dataAccess) { this.wrapperContained = new net.minecraft.server.world.ServerEntityManager(entityClass,handler.wrapperContained,dataAccess.wrapperContained); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.server.world.ServerEntityManager.tick(); }
// public void readIfFresh(long chunkPos) { wrapperContained.readIfFresh(chunkPos); }
// public static void readIfFresh(long chunkPos, ) { net.minecraft.server.world.ServerEntityManager.readIfFresh(chunkPos); }
// public void entityLeftSection(long sectionPos,yarnwrap.world.entity.EntityTrackingSection section) { wrapperContained.entityLeftSection(sectionPos,section.wrapperContained); }
// public static void entityLeftSection(long sectionPos,yarnwrap.world.entity.EntityTrackingSection section, ) { net.minecraft.server.world.ServerEntityManager.entityLeftSection(sectionPos,section.wrapperContained); }
// public boolean trySave(long chunkPos,java.util.function.Consumer action) { return wrapperContained.trySave(chunkPos,action); }
// public static boolean trySave(long chunkPos,java.util.function.Consumer action, ) { return net.minecraft.server.world.ServerEntityManager.trySave(chunkPos,action); }
// public void method_31813(yarnwrap.util.CsvWriter chunkPos) { wrapperContained.method_31813(chunkPos.wrapperContained); }
// public static void method_31813(yarnwrap.util.CsvWriter chunkPos, ) { net.minecraft.server.world.ServerEntityManager.method_31813(chunkPos.wrapperContained); }
// public void method_31814(yarnwrap.util.CsvWriter sectionPos) { wrapperContained.method_31814(sectionPos.wrapperContained); }
// public static void method_31814(yarnwrap.util.CsvWriter sectionPos, ) { net.minecraft.server.world.ServerEntityManager.method_31814(sectionPos.wrapperContained); }
public void updateTrackingStatus(yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.server.world.ChunkLevelType levelType) { wrapperContained.updateTrackingStatus(chunkPos.wrapperContained,levelType.wrapperContained); }
// public static void updateTrackingStatus(yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.server.world.ChunkLevelType levelType, ) { net.minecraft.server.world.ServerEntityManager.updateTrackingStatus(chunkPos.wrapperContained,levelType.wrapperContained); }
public void updateTrackingStatus(yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.world.entity.EntityTrackingStatus trackingStatus) { wrapperContained.updateTrackingStatus(chunkPos.wrapperContained,trackingStatus.wrapperContained); }
// public static void updateTrackingStatus(yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.world.entity.EntityTrackingStatus trackingStatus, ) { net.minecraft.server.world.ServerEntityManager.updateTrackingStatus(chunkPos.wrapperContained,trackingStatus.wrapperContained); }
// public java.lang.Void method_31817(yarnwrap.util.math.ChunkPos throwable) { return wrapperContained.method_31817(throwable.wrapperContained); }
// public static java.lang.Void method_31817(yarnwrap.util.math.ChunkPos throwable, ) { return net.minecraft.server.world.ServerEntityManager.method_31817(throwable.wrapperContained); }
public boolean addEntity(yarnwrap.world.entity.EntityLike entity) { return wrapperContained.addEntity(entity.wrapperContained); }
// public static boolean addEntity(yarnwrap.world.entity.EntityLike entity, ) { return net.minecraft.server.world.ServerEntityManager.addEntity(entity.wrapperContained); }
// public boolean addEntity(yarnwrap.world.entity.EntityLike entity,boolean existing) { return wrapperContained.addEntity(entity.wrapperContained,existing); }
// public static boolean addEntity(yarnwrap.world.entity.EntityLike entity,boolean existing, ) { return net.minecraft.server.world.ServerEntityManager.addEntity(entity.wrapperContained,existing); }
// public java.util.stream.Stream method_31821(yarnwrap.world.entity.EntityTrackingSection section) { return wrapperContained.method_31821(section.wrapperContained); }
// public static java.util.stream.Stream method_31821(yarnwrap.world.entity.EntityTrackingSection section, ) { return net.minecraft.server.world.ServerEntityManager.method_31821(section.wrapperContained); }
// public void method_31825(yarnwrap.world.entity.EntityTrackingStatus group) { wrapperContained.method_31825(group.wrapperContained); }
// public static void method_31825(yarnwrap.world.entity.EntityTrackingStatus group, ) { net.minecraft.server.world.ServerEntityManager.method_31825(group.wrapperContained); }
// public void dump(java.io.Writer writer) { wrapperContained.dump(writer); }
// public static void dump(java.io.Writer writer, ) { net.minecraft.server.world.ServerEntityManager.dump(writer); }
public boolean has(java.util.UUID uuid) { return wrapperContained.has(uuid); }
// public static boolean has(java.util.UUID uuid, ) { return net.minecraft.server.world.ServerEntityManager.has(uuid); }
public void loadEntities(java.util.stream.Stream entities) { wrapperContained.loadEntities(entities); }
// public static void loadEntities(java.util.stream.Stream entities, ) { net.minecraft.server.world.ServerEntityManager.loadEntities(entities); }
public void save() { wrapperContained.save(); }
// public static void save() { net.minecraft.server.world.ServerEntityManager.save(); }
// public void scheduleRead(long chunkPos) { wrapperContained.scheduleRead(chunkPos); }
// public static void scheduleRead(long chunkPos, ) { net.minecraft.server.world.ServerEntityManager.scheduleRead(chunkPos); }
// public boolean addEntityUuid(yarnwrap.world.entity.EntityLike entity) { return wrapperContained.addEntityUuid(entity.wrapperContained); }
// public static boolean addEntityUuid(yarnwrap.world.entity.EntityLike entity, ) { return net.minecraft.server.world.ServerEntityManager.addEntityUuid(entity.wrapperContained); }
// public yarnwrap.world.entity.EntityTrackingStatus getNeededLoadStatus(yarnwrap.world.entity.EntityLike entity,yarnwrap.world.entity.EntityTrackingStatus current) { return new yarnwrap.world.entity.EntityTrackingStatus(wrapperContained.getNeededLoadStatus(entity.wrapperContained,current.wrapperContained)); }
// public static yarnwrap.world.entity.EntityTrackingStatus getNeededLoadStatus(yarnwrap.world.entity.EntityLike entity,yarnwrap.world.entity.EntityTrackingStatus current, ) { return new yarnwrap.world.entity.EntityTrackingStatus(net.minecraft.server.world.ServerEntityManager.getNeededLoadStatus(entity.wrapperContained,current.wrapperContained)); }
public void addEntities(java.util.stream.Stream entities) { wrapperContained.addEntities(entities); }
// public static void addEntities(java.util.stream.Stream entities, ) { net.minecraft.server.world.ServerEntityManager.addEntities(entities); }
public void flush() { wrapperContained.flush(); }
// public static void flush() { net.minecraft.server.world.ServerEntityManager.flush(); }
// public boolean unload(long chunkPos) { return wrapperContained.unload(chunkPos); }
// public static boolean unload(long chunkPos, ) { return net.minecraft.server.world.ServerEntityManager.unload(chunkPos); }
// public void startTicking(yarnwrap.world.entity.EntityLike entity) { wrapperContained.startTicking(entity.wrapperContained); }
// public static void startTicking(yarnwrap.world.entity.EntityLike entity, ) { net.minecraft.server.world.ServerEntityManager.startTicking(entity.wrapperContained); }
public yarnwrap.world.entity.EntityLookup getLookup() { return new yarnwrap.world.entity.EntityLookup(wrapperContained.getLookup()); }
// public static yarnwrap.world.entity.EntityLookup getLookup() { return new yarnwrap.world.entity.EntityLookup(net.minecraft.server.world.ServerEntityManager.getLookup()); }
// public boolean method_31842(long pos) { return wrapperContained.method_31842(pos); }
// public static boolean method_31842(long pos, ) { return net.minecraft.server.world.ServerEntityManager.method_31842(pos); }
// public void stopTicking(yarnwrap.world.entity.EntityLike entity) { wrapperContained.stopTicking(entity.wrapperContained); }
// public static void stopTicking(yarnwrap.world.entity.EntityLike entity, ) { net.minecraft.server.world.ServerEntityManager.stopTicking(entity.wrapperContained); }
public java.lang.String getDebugString() { return wrapperContained.getDebugString(); }
// public static java.lang.String getDebugString() { return net.minecraft.server.world.ServerEntityManager.getDebugString(); }
// public void method_31846(long pos) { wrapperContained.method_31846(pos); }
// public static void method_31846(long pos, ) { net.minecraft.server.world.ServerEntityManager.method_31846(pos); }
// public void startTracking(yarnwrap.world.entity.EntityLike entity) { wrapperContained.startTracking(entity.wrapperContained); }
// public static void startTracking(yarnwrap.world.entity.EntityLike entity, ) { net.minecraft.server.world.ServerEntityManager.startTracking(entity.wrapperContained); }
// public boolean method_31849(long pos) { return wrapperContained.method_31849(pos); }
// public static boolean method_31849(long pos, ) { return net.minecraft.server.world.ServerEntityManager.method_31849(pos); }
// public void stopTracking(yarnwrap.world.entity.EntityLike entity) { wrapperContained.stopTracking(entity.wrapperContained); }
// public static void stopTracking(yarnwrap.world.entity.EntityLike entity, ) { net.minecraft.server.world.ServerEntityManager.stopTracking(entity.wrapperContained); }
// public void unloadChunks() { wrapperContained.unloadChunks(); }
// public static void unloadChunks() { net.minecraft.server.world.ServerEntityManager.unloadChunks(); }
// public void unload(yarnwrap.world.entity.EntityLike entity) { wrapperContained.unload(entity.wrapperContained); }
// public static void unload(yarnwrap.world.entity.EntityLike entity, ) { net.minecraft.server.world.ServerEntityManager.unload(entity.wrapperContained); }
// public void loadChunks() { wrapperContained.loadChunks(); }
// public static void loadChunks() { net.minecraft.server.world.ServerEntityManager.loadChunks(); }
// public void method_31854(yarnwrap.world.entity.EntityLike entity) { wrapperContained.method_31854(entity.wrapperContained); }
// public static void method_31854(yarnwrap.world.entity.EntityLike entity, ) { net.minecraft.server.world.ServerEntityManager.method_31854(entity.wrapperContained); }
// public it.unimi.dsi.fastutil.longs.LongSet getLoadedChunks() { return wrapperContained.getLoadedChunks(); }
// public static it.unimi.dsi.fastutil.longs.LongSet getLoadedChunks() { return net.minecraft.server.world.ServerEntityManager.getLoadedChunks(); }
// public void method_31856(yarnwrap.world.entity.EntityLike entity) { wrapperContained.method_31856(entity.wrapperContained); }
// public static void method_31856(yarnwrap.world.entity.EntityLike entity, ) { net.minecraft.server.world.ServerEntityManager.method_31856(entity.wrapperContained); }
// public void method_31857(yarnwrap.world.entity.EntityLike entity) { wrapperContained.method_31857(entity.wrapperContained); }
// public static void method_31857(yarnwrap.world.entity.EntityLike entity, ) { net.minecraft.server.world.ServerEntityManager.method_31857(entity.wrapperContained); }
// public void method_31858(yarnwrap.world.entity.EntityLike entity) { wrapperContained.method_31858(entity.wrapperContained); }
// public static void method_31858(yarnwrap.world.entity.EntityLike entity, ) { net.minecraft.server.world.ServerEntityManager.method_31858(entity.wrapperContained); }
// public boolean method_31859(yarnwrap.world.entity.EntityLike entity) { return wrapperContained.method_31859(entity.wrapperContained); }
// public static boolean method_31859(yarnwrap.world.entity.EntityLike entity, ) { return net.minecraft.server.world.ServerEntityManager.method_31859(entity.wrapperContained); }
// public boolean method_31860(yarnwrap.world.entity.EntityLike entity) { return wrapperContained.method_31860(entity.wrapperContained); }
// public static boolean method_31860(yarnwrap.world.entity.EntityLike entity, ) { return net.minecraft.server.world.ServerEntityManager.method_31860(entity.wrapperContained); }
// public boolean method_31861(yarnwrap.world.entity.EntityLike entity) { return wrapperContained.method_31861(entity.wrapperContained); }
// public static boolean method_31861(yarnwrap.world.entity.EntityLike entity, ) { return net.minecraft.server.world.ServerEntityManager.method_31861(entity.wrapperContained); }
// public boolean method_31862(yarnwrap.world.entity.EntityLike entity) { return wrapperContained.method_31862(entity.wrapperContained); }
// public static boolean method_31862(yarnwrap.world.entity.EntityLike entity, ) { return net.minecraft.server.world.ServerEntityManager.method_31862(entity.wrapperContained); }
// public void method_31863(yarnwrap.world.entity.EntityLike entity) { wrapperContained.method_31863(entity.wrapperContained); }
// public static void method_31863(yarnwrap.world.entity.EntityLike entity, ) { net.minecraft.server.world.ServerEntityManager.method_31863(entity.wrapperContained); }
// public void method_31864(yarnwrap.world.entity.EntityLike entity) { wrapperContained.method_31864(entity.wrapperContained); }
// public static void method_31864(yarnwrap.world.entity.EntityLike entity, ) { net.minecraft.server.world.ServerEntityManager.method_31864(entity.wrapperContained); }
public boolean isLoaded(long chunkPos) { return wrapperContained.isLoaded(chunkPos); }
// public static boolean isLoaded(long chunkPos, ) { return net.minecraft.server.world.ServerEntityManager.isLoaded(chunkPos); }
public boolean shouldTick(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.shouldTick(pos.wrapperContained); }
// public static boolean shouldTick(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.server.world.ServerEntityManager.shouldTick(pos.wrapperContained); }
public boolean shouldTick(yarnwrap.util.math.BlockPos pos) { return wrapperContained.shouldTick(pos.wrapperContained); }
// public static boolean shouldTick(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.server.world.ServerEntityManager.shouldTick(pos.wrapperContained); }
public int getIndexSize() { return wrapperContained.getIndexSize(); }
// public static int getIndexSize() { return net.minecraft.server.world.ServerEntityManager.getIndexSize(); }
public boolean shouldTickTest(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.shouldTickTest(pos.wrapperContained); }
// public static boolean shouldTickTest(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.server.world.ServerEntityManager.shouldTickTest(pos.wrapperContained); }

}