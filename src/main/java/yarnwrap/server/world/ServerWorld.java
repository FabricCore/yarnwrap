package yarnwrap.server.world;
public class ServerWorld { public net.minecraft.server.world.ServerWorld wrapperContained; public ServerWorld(net.minecraft.server.world.ServerWorld wrapperContained) { this.wrapperContained = wrapperContained; }

// public int idleTimeout() { return wrapperContained.idleTimeout; }
// public void idleTimeout(int value) { wrapperContained.idleTimeout = value; }
// public yarnwrap.world.tick.WorldTickScheduler blockTickScheduler() { return new yarnwrap.world.tick.WorldTickScheduler(wrapperContained.blockTickScheduler); }
// public void blockTickScheduler(yarnwrap.world.tick.WorldTickScheduler value) { wrapperContained.blockTickScheduler = value.wrapperContained; }
// public it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet syncedBlockEventQueue() { return wrapperContained.syncedBlockEventQueue; }
// public void syncedBlockEventQueue(it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet value) { wrapperContained.syncedBlockEventQueue = value; }
// public yarnwrap.world.tick.WorldTickScheduler fluidTickScheduler() { return new yarnwrap.world.tick.WorldTickScheduler(wrapperContained.fluidTickScheduler); }
// public void fluidTickScheduler(yarnwrap.world.tick.WorldTickScheduler value) { wrapperContained.fluidTickScheduler = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public boolean inBlockTick() { return wrapperContained.inBlockTick; }
// public void inBlockTick(boolean value) { wrapperContained.inBlockTick = value; }
// public yarnwrap.world.dimension.PortalForcer portalForcer() { return new yarnwrap.world.dimension.PortalForcer(wrapperContained.portalForcer); }
// public void portalForcer(yarnwrap.world.dimension.PortalForcer value) { wrapperContained.portalForcer = value.wrapperContained; }
public boolean savingDisabled() { return wrapperContained.savingDisabled; }
public void savingDisabled(boolean value) { wrapperContained.savingDisabled = value; }
// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public void server(yarnwrap.server.MinecraftServer value) { wrapperContained.server = value.wrapperContained; }
// public java.util.List players() { return wrapperContained.players; }
// public void players(java.util.List value) { wrapperContained.players = value; }
// public yarnwrap.village.raid.RaidManager raidManager() { return new yarnwrap.village.raid.RaidManager(wrapperContained.raidManager); }
// public void raidManager(yarnwrap.village.raid.RaidManager value) { wrapperContained.raidManager = value.wrapperContained; }
// public yarnwrap.world.gen.StructureAccessor structureAccessor() { return new yarnwrap.world.gen.StructureAccessor(wrapperContained.structureAccessor); }
// public void structureAccessor(yarnwrap.world.gen.StructureAccessor value) { wrapperContained.structureAccessor = value.wrapperContained; }
// public yarnwrap.world.level.ServerWorldProperties worldProperties() { return new yarnwrap.world.level.ServerWorldProperties(wrapperContained.worldProperties); }
// public void worldProperties(yarnwrap.world.level.ServerWorldProperties value) { wrapperContained.worldProperties = value.wrapperContained; }
// public yarnwrap.server.world.ServerChunkManager chunkManager() { return new yarnwrap.server.world.ServerChunkManager(wrapperContained.chunkManager); }
// public void chunkManager(yarnwrap.server.world.ServerChunkManager value) { wrapperContained.chunkManager = value.wrapperContained; }
// public java.util.List spawners() { return wrapperContained.spawners; }
// public void spawners(java.util.List value) { wrapperContained.spawners = value; }
// public yarnwrap.entity.boss.dragon.EnderDragonFight enderDragonFight() { return new yarnwrap.entity.boss.dragon.EnderDragonFight(wrapperContained.enderDragonFight); }
// public void enderDragonFight(yarnwrap.entity.boss.dragon.EnderDragonFight value) { wrapperContained.enderDragonFight = value.wrapperContained; }
// public boolean shouldTickTime() { return wrapperContained.shouldTickTime; }
// public void shouldTickTime(boolean value) { wrapperContained.shouldTickTime = value; }
public yarnwrap.util.math.BlockPos END_SPAWN_POS() { return new yarnwrap.util.math.BlockPos(wrapperContained.END_SPAWN_POS); }
// public void END_SPAWN_POS(yarnwrap.util.math.BlockPos value) { wrapperContained.END_SPAWN_POS = value.wrapperContained; }
// public java.util.Set loadedMobs() { return wrapperContained.loadedMobs; }
// public void loadedMobs(java.util.Set value) { wrapperContained.loadedMobs = value; }
// public it.unimi.dsi.fastutil.ints.Int2ObjectMap dragonParts() { return wrapperContained.dragonParts; }
// public void dragonParts(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.dragonParts = value; }
// public yarnwrap.world.EntityList entityList() { return new yarnwrap.world.EntityList(wrapperContained.entityList); }
// public void entityList(yarnwrap.world.EntityList value) { wrapperContained.entityList = value.wrapperContained; }
// public yarnwrap.server.world.ServerEntityManager entityManager() { return new yarnwrap.server.world.ServerEntityManager(wrapperContained.entityManager); }
// public void entityManager(yarnwrap.server.world.ServerEntityManager value) { wrapperContained.entityManager = value.wrapperContained; }
// public yarnwrap.server.world.SleepManager sleepManager() { return new yarnwrap.server.world.SleepManager(wrapperContained.sleepManager); }
// public void sleepManager(yarnwrap.server.world.SleepManager value) { wrapperContained.sleepManager = value.wrapperContained; }
// public int SERVER_IDLE_COOLDOWN() { return wrapperContained.SERVER_IDLE_COOLDOWN; }
// public void SERVER_IDLE_COOLDOWN(int value) { wrapperContained.SERVER_IDLE_COOLDOWN = value; }
// public int MAX_TICKS() { return wrapperContained.MAX_TICKS; }
// public void MAX_TICKS(int value) { wrapperContained.MAX_TICKS = value; }
// public java.util.List blockEventQueue() { return wrapperContained.blockEventQueue; }
// public void blockEventQueue(java.util.List value) { wrapperContained.blockEventQueue = value; }
// public yarnwrap.world.StructureLocator structureLocator() { return new yarnwrap.world.StructureLocator(wrapperContained.structureLocator); }
// public void structureLocator(yarnwrap.world.StructureLocator value) { wrapperContained.structureLocator = value.wrapperContained; }
// public boolean duringListenerUpdate() { return wrapperContained.duringListenerUpdate; }
// public void duringListenerUpdate(boolean value) { wrapperContained.duringListenerUpdate = value; }
// public yarnwrap.world.event.listener.GameEventDispatchManager gameEventDispatchManager() { return new yarnwrap.world.event.listener.GameEventDispatchManager(wrapperContained.gameEventDispatchManager); }
// public void gameEventDispatchManager(yarnwrap.world.event.listener.GameEventDispatchManager value) { wrapperContained.gameEventDispatchManager = value.wrapperContained; }
// public yarnwrap.util.math.intprovider.IntProvider CLEAR_THUNDER_WEATHER_DURATION_PROVIDER() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.CLEAR_THUNDER_WEATHER_DURATION_PROVIDER); }
// public void CLEAR_THUNDER_WEATHER_DURATION_PROVIDER(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.CLEAR_THUNDER_WEATHER_DURATION_PROVIDER = value.wrapperContained; }
public yarnwrap.util.math.intprovider.IntProvider CLEAR_WEATHER_DURATION_PROVIDER() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.CLEAR_WEATHER_DURATION_PROVIDER); }
// public void CLEAR_WEATHER_DURATION_PROVIDER(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.CLEAR_WEATHER_DURATION_PROVIDER = value.wrapperContained; }
public yarnwrap.util.math.intprovider.IntProvider RAIN_WEATHER_DURATION_PROVIDER() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.RAIN_WEATHER_DURATION_PROVIDER); }
// public void RAIN_WEATHER_DURATION_PROVIDER(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.RAIN_WEATHER_DURATION_PROVIDER = value.wrapperContained; }
public yarnwrap.util.math.intprovider.IntProvider THUNDER_WEATHER_DURATION_PROVIDER() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.THUNDER_WEATHER_DURATION_PROVIDER); }
// public void THUNDER_WEATHER_DURATION_PROVIDER(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.THUNDER_WEATHER_DURATION_PROVIDER = value.wrapperContained; }
// public yarnwrap.util.math.random.RandomSequencesState randomSequences() { return new yarnwrap.util.math.random.RandomSequencesState(wrapperContained.randomSequences); }
// public void randomSequences(yarnwrap.util.math.random.RandomSequencesState value) { wrapperContained.randomSequences = value.wrapperContained; }
// public int spawnChunkRadius() { return wrapperContained.spawnChunkRadius; }
// public void spawnChunkRadius(int value) { wrapperContained.spawnChunkRadius = value; }
// public yarnwrap.entity.ai.pathing.PathNodeTypeCache pathNodeTypeCache() { return new yarnwrap.entity.ai.pathing.PathNodeTypeCache(wrapperContained.pathNodeTypeCache); }
// public void pathNodeTypeCache(yarnwrap.entity.ai.pathing.PathNodeTypeCache value) { wrapperContained.pathNodeTypeCache = value.wrapperContained; }
// public ServerWorld(yarnwrap.server.MinecraftServer server,java.util.concurrent.Executor workerExecutor,Object session,yarnwrap.world.level.ServerWorldProperties properties,yarnwrap.registry.RegistryKey worldKey,yarnwrap.world.dimension.DimensionOptions dimensionOptions,yarnwrap.server.WorldGenerationProgressListener worldGenerationProgressListener,boolean debugWorld,long seed,java.util.List spawners,boolean shouldTickTime,yarnwrap.util.math.random.RandomSequencesState randomSequencesState) { this.wrapperContained = new net.minecraft.server.world.ServerWorld(server.wrapperContained,workerExecutor,session,properties.wrapperContained,worldKey.wrapperContained,dimensionOptions.wrapperContained,worldGenerationProgressListener.wrapperContained,debugWorld,seed,spawners,shouldTickTime,randomSequencesState.wrapperContained); }
public boolean spawnParticles(yarnwrap.server.network.ServerPlayerEntity viewer,yarnwrap.particle.ParticleEffect particle,boolean force,double x,double y,double z,int count,double deltaX,double deltaY,double deltaZ,double speed) { return wrapperContained.spawnParticles(viewer.wrapperContained,particle.wrapperContained,force,x,y,z,count,deltaX,deltaY,deltaZ,speed); }
// public void tickFluid(yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.Fluid fluid) { wrapperContained.tickFluid(pos.wrapperContained,fluid.wrapperContained); }
public yarnwrap.world.dimension.PortalForcer getPortalForcer() { return new yarnwrap.world.dimension.PortalForcer(wrapperContained.getPortalForcer()); }
// public boolean processBlockEvent(yarnwrap.server.world.BlockEvent event) { return wrapperContained.processBlockEvent(event.wrapperContained); }
// public boolean addEntity(yarnwrap.entity.Entity entity) { return wrapperContained.addEntity(entity.wrapperContained); }
public void save(yarnwrap.util.ProgressListener progressListener,boolean flush,boolean savingDisabled) { wrapperContained.save(progressListener.wrapperContained,flush,savingDisabled); }
public boolean isInBlockTick() { return wrapperContained.isInBlockTick(); }
public yarnwrap.structure.StructureTemplateManager getStructureTemplateManager() { return new yarnwrap.structure.StructureTemplateManager(wrapperContained.getStructureTemplateManager()); }
// public void saveLevel() { wrapperContained.saveLevel(); }
// public void tickBlock(yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block block) { wrapperContained.tickBlock(pos.wrapperContained,block.wrapperContained); }
public yarnwrap.entity.Entity getEntity(java.util.UUID uuid) { return new yarnwrap.entity.Entity(wrapperContained.getEntity(uuid)); }
// public boolean sendToPlayerIfNearby(yarnwrap.server.network.ServerPlayerEntity player,boolean force,double x,double y,double z,yarnwrap.network.packet.Packet packet) { return wrapperContained.sendToPlayerIfNearby(player.wrapperContained,force,x,y,z,packet.wrapperContained); }
// public void processSyncedBlockEvents() { wrapperContained.processSyncedBlockEvents(); }
public void resetWeather() { wrapperContained.resetWeather(); }
public void resetIdleTimeout() { wrapperContained.resetIdleTimeout(); }
public int spawnParticles(yarnwrap.particle.ParticleEffect particle,double x,double y,double z,int count,double deltaX,double deltaY,double deltaZ,double speed) { return wrapperContained.spawnParticles(particle.wrapperContained,x,y,z,count,deltaX,deltaY,deltaZ,speed); }
public yarnwrap.world.PersistentStateManager getPersistentStateManager() { return new yarnwrap.world.PersistentStateManager(wrapperContained.getPersistentStateManager()); }
public it.unimi.dsi.fastutil.longs.LongSet getForcedChunks() { return wrapperContained.getForcedChunks(); }
public boolean setChunkForced(int x,int z,boolean forced) { return wrapperContained.setChunkForced(x,z,forced); }
public java.util.List getEntitiesByType(yarnwrap.util.TypeFilter filter,java.util.function.Predicate predicate) { return wrapperContained.getEntitiesByType(filter.wrapperContained,predicate); }
// public boolean method_18199(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_18199(entity.wrapperContained); }
public void tickChunk(yarnwrap.world.chunk.WorldChunk chunk,int randomTickSpeed) { wrapperContained.tickChunk(chunk.wrapperContained,randomTickSpeed); }
// public yarnwrap.util.math.BlockPos getLightningPos(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.getLightningPos(pos.wrapperContained)); }
public void onPlayerConnected(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.onPlayerConnected(player.wrapperContained); }
public void onPlayerRespawned(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.onPlayerRespawned(player.wrapperContained); }
public void tickEntity(yarnwrap.entity.Entity entity) { wrapperContained.tickEntity(entity.wrapperContained); }
// public void tickPassenger(yarnwrap.entity.Entity vehicle,yarnwrap.entity.Entity passenger) { wrapperContained.tickPassenger(vehicle.wrapperContained,passenger.wrapperContained); }
public void unloadEntities(yarnwrap.world.chunk.WorldChunk chunk) { wrapperContained.unloadEntities(chunk.wrapperContained); }
public void tick(java.util.function.BooleanSupplier shouldKeepTicking) { wrapperContained.tick(shouldKeepTicking); }
public java.util.List getPlayers(java.util.function.Predicate predicate) { return wrapperContained.getPlayers(predicate); }
public boolean tryLoadEntity(yarnwrap.entity.Entity entity) { return wrapperContained.tryLoadEntity(entity.wrapperContained); }
public void onDimensionChanged(yarnwrap.entity.Entity entity) { wrapperContained.onDimensionChanged(entity.wrapperContained); }
// public void removePlayer(yarnwrap.server.network.ServerPlayerEntity player,Object reason) { wrapperContained.removePlayer(player.wrapperContained,reason); }
// public void addPlayer(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.addPlayer(player.wrapperContained); }
// public void method_18773(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.method_18773(player.wrapperContained); }
public java.util.List getAliveEnderDragons() { return wrapperContained.getAliveEnderDragons(); }
public yarnwrap.server.network.ServerPlayerEntity getRandomAlivePlayer() { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.getRandomAlivePlayer()); }
public yarnwrap.world.poi.PointOfInterestStorage getPointOfInterestStorage() { return new yarnwrap.world.poi.PointOfInterestStorage(wrapperContained.getPointOfInterestStorage()); }
public yarnwrap.village.raid.RaidManager getRaidManager() { return new yarnwrap.village.raid.RaidManager(wrapperContained.getRaidManager()); }
public void handleInteraction(yarnwrap.entity.EntityInteraction interaction,yarnwrap.entity.Entity entity,yarnwrap.entity.InteractionObserver observer) { wrapperContained.handleInteraction(interaction.wrapperContained,entity.wrapperContained,observer.wrapperContained); }
public boolean isNearOccupiedPointOfInterest(yarnwrap.util.math.BlockPos pos,int maxDistance) { return wrapperContained.isNearOccupiedPointOfInterest(pos.wrapperContained,maxDistance); }
public int getOccupiedPointOfInterestDistance(yarnwrap.util.math.ChunkSectionPos pos) { return wrapperContained.getOccupiedPointOfInterestDistance(pos.wrapperContained); }
public boolean isNearOccupiedPointOfInterest(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isNearOccupiedPointOfInterest(pos.wrapperContained); }
public yarnwrap.village.raid.Raid getRaidAt(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.village.raid.Raid(wrapperContained.getRaidAt(pos.wrapperContained)); }
public boolean hasRaidAt(yarnwrap.util.math.BlockPos pos) { return wrapperContained.hasRaidAt(pos.wrapperContained); }
// public void method_19535(yarnwrap.util.math.BlockPos newPoiType) { wrapperContained.method_19535(newPoiType.wrapperContained); }
// public void method_19536(yarnwrap.util.math.BlockPos oldPoiType) { wrapperContained.method_19536(oldPoiType.wrapperContained); }
public boolean isNearOccupiedPointOfInterest(yarnwrap.util.math.ChunkSectionPos sectionPos) { return wrapperContained.isNearOccupiedPointOfInterest(sectionPos.wrapperContained); }
// public void dumpEntities(java.io.Writer writer,java.lang.Iterable entities) { wrapperContained.dumpEntities(writer,entities); }
// public void dump(java.nio.file.Path path) { wrapperContained.dump(path); }
// public void dumpBlockEntities(java.io.Writer writer) { wrapperContained.dumpBlockEntities(writer); }
public void clearUpdatesInArea(yarnwrap.util.math.BlockBox box) { wrapperContained.clearUpdatesInArea(box.wrapperContained); }
// public boolean method_23659(yarnwrap.util.math.BlockBox event) { return wrapperContained.method_23659(event.wrapperContained); }
// public void wakeSleepingPlayers() { wrapperContained.wakeSleepingPlayers(); }
public yarnwrap.world.gen.StructureAccessor getStructureAccessor() { return new yarnwrap.world.gen.StructureAccessor(wrapperContained.getStructureAccessor()); }
public java.lang.Iterable iterateEntities() { return wrapperContained.iterateEntities(); }
public void setWeather(int clearDuration,int rainDuration,boolean raining,boolean thundering) { wrapperContained.setWeather(clearDuration,rainDuration,raining,thundering); }
public boolean isFlat() { return wrapperContained.isFlat(); }
public yarnwrap.entity.boss.dragon.EnderDragonFight getEnderDragonFight() { return new yarnwrap.entity.boss.dragon.EnderDragonFight(wrapperContained.getEnderDragonFight()); }
public void setTimeOfDay(long timeOfDay) { wrapperContained.setTimeOfDay(timeOfDay); }
public void tickSpawners(boolean spawnMonsters,boolean spawnAnimals) { wrapperContained.tickSpawners(spawnMonsters,spawnAnimals); }
// public void tickTime() { wrapperContained.tickTime(); }
public boolean spawnNewEntityAndPassengers(yarnwrap.entity.Entity entity) { return wrapperContained.spawnNewEntityAndPassengers(entity.wrapperContained); }
public java.lang.String getDebugString() { return wrapperContained.getDebugString(); }
// public java.lang.String getTopFive(java.lang.Iterable items,java.util.function.Function classifier) { return wrapperContained.getTopFive(items,classifier); }
// public java.util.Optional getLightningRodPos(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getLightningRodPos(pos.wrapperContained); }
// public void method_31420(yarnwrap.world.tick.TickManager entity) { wrapperContained.method_31420(entity.wrapperContained); }
// public boolean method_31421(yarnwrap.registry.entry.RegistryEntry poiType) { return wrapperContained.method_31421(poiType.wrapperContained); }
public void loadEntities(java.util.stream.Stream entities) { wrapperContained.loadEntities(entities); }
public yarnwrap.entity.Entity getDragonPart(int id) { return new yarnwrap.entity.Entity(wrapperContained.getDragonPart(id)); }
public void addEntities(java.util.stream.Stream entities) { wrapperContained.addEntities(entities); }
// public boolean shouldCancelSpawn(yarnwrap.entity.Entity entity) { return wrapperContained.shouldCancelSpawn(entity.wrapperContained); }
// public java.lang.String method_31431(yarnwrap.entity.Entity entity) { return wrapperContained.method_31431(entity.wrapperContained); }
public int getLogicalHeight() { return wrapperContained.getLogicalHeight(); }
// public void sendSleepingStatus() { wrapperContained.sendSleepingStatus(); }
public boolean isSleepingEnabled() { return wrapperContained.isSleepingEnabled(); }
// public yarnwrap.util.math.BlockPos method_34679(yarnwrap.util.math.BlockPos innerPos) { return new yarnwrap.util.math.BlockPos(wrapperContained.method_34679(innerPos.wrapperContained)); }
// public boolean method_34680(yarnwrap.util.math.BlockPos innerPos) { return wrapperContained.method_34680(innerPos.wrapperContained); }
public boolean isChunkLoaded(long chunkPos) { return wrapperContained.isChunkLoaded(chunkPos); }
// public boolean isTickingFutureReady(long chunkPos) { return wrapperContained.isTickingFutureReady(chunkPos); }
public boolean shouldTickEntity(yarnwrap.util.math.BlockPos pos) { return wrapperContained.shouldTickEntity(pos.wrapperContained); }
public void disableTickSchedulers(yarnwrap.world.chunk.WorldChunk chunk) { wrapperContained.disableTickSchedulers(chunk.wrapperContained); }
// public void tickWeather() { wrapperContained.tickWeather(); }
public void cacheStructures(yarnwrap.world.chunk.Chunk chunk) { wrapperContained.cacheStructures(chunk.wrapperContained); }
public boolean shouldTick(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.shouldTick(pos.wrapperContained); }
public boolean shouldTick(yarnwrap.util.math.BlockPos pos) { return wrapperContained.shouldTick(pos.wrapperContained); }
public com.mojang.datafixers.util.Pair locateBiome(java.util.function.Predicate predicate,yarnwrap.util.math.BlockPos pos,int radius,int horizontalBlockCheckInterval,int verticalBlockCheckInterval) { return wrapperContained.locateBiome(predicate,pos.wrapperContained,radius,horizontalBlockCheckInterval,verticalBlockCheckInterval); }
public void collectEntitiesByType(yarnwrap.util.TypeFilter filter,java.util.function.Predicate predicate,java.util.List result) { wrapperContained.collectEntitiesByType(filter.wrapperContained,predicate,result); }
public void collectEntitiesByType(yarnwrap.util.TypeFilter filter,java.util.function.Predicate predicate,java.util.List result,int limit) { wrapperContained.collectEntitiesByType(filter.wrapperContained,predicate,result,limit); }
public java.util.List getPlayers(java.util.function.Predicate predicate,int limit) { return wrapperContained.getPlayers(predicate,limit); }
// public Object method_47541(java.util.function.Predicate entity) { return wrapperContained.method_47541(entity); }
public yarnwrap.util.math.random.Random getOrCreateRandom(yarnwrap.util.Identifier id) { return new yarnwrap.util.math.random.Random(wrapperContained.getOrCreateRandom(id.wrapperContained)); }
public void setEnderDragonFight(yarnwrap.entity.boss.dragon.EnderDragonFight enderDragonFight) { wrapperContained.setEnderDragonFight(enderDragonFight.wrapperContained); }
public yarnwrap.util.math.random.RandomSequencesState getRandomSequences() { return new yarnwrap.util.math.random.RandomSequencesState(wrapperContained.getRandomSequences()); }
public void tickIceAndSnow(yarnwrap.util.math.BlockPos pos) { wrapperContained.tickIceAndSnow(pos.wrapperContained); }
public yarnwrap.entity.ai.pathing.PathNodeTypeCache getPathNodeTypeCache() { return new yarnwrap.entity.ai.pathing.PathNodeTypeCache(wrapperContained.getPathNodeTypeCache()); }
public void updateSleepingPlayers() { wrapperContained.updateSleepingPlayers(); }
public yarnwrap.util.math.BlockPos locateStructure(yarnwrap.registry.tag.TagKey structureTag,yarnwrap.util.math.BlockPos pos,int radius,boolean skipReferencedStructures) { return new yarnwrap.util.math.BlockPos(wrapperContained.locateStructure(structureTag.wrapperContained,pos.wrapperContained,radius,skipReferencedStructures)); }
public void setSpawnPos(yarnwrap.util.math.BlockPos pos,float angle) { wrapperContained.setSpawnPos(pos.wrapperContained,angle); }

}