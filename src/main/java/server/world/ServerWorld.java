package yarnwrap.server.world;
public class ServerWorld { public net.minecraft.server.world.ServerWorld wrapperContained; public ServerWorld(net.minecraft.server.world.ServerWorld wrapperContained) { this.wrapperContained = wrapperContained; }

// public int idleTimeout() { return wrapperContained.idleTimeout; }
// public yarnwrap.world.tick.WorldTickScheduler blockTickScheduler() { return new yarnwrap.world.tick.WorldTickScheduler(wrapperContained.blockTickScheduler); }
// public it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet syncedBlockEventQueue() { return wrapperContained.syncedBlockEventQueue; }
// public yarnwrap.world.tick.WorldTickScheduler fluidTickScheduler() { return new yarnwrap.world.tick.WorldTickScheduler(wrapperContained.fluidTickScheduler); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public boolean inBlockTick() { return wrapperContained.inBlockTick; }
// public yarnwrap.world.dimension.PortalForcer portalForcer() { return new yarnwrap.world.dimension.PortalForcer(wrapperContained.portalForcer); }
public boolean savingDisabled() { return wrapperContained.savingDisabled; }
// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public java.util.List players() { return wrapperContained.players; }
// public yarnwrap.village.raid.RaidManager raidManager() { return new yarnwrap.village.raid.RaidManager(wrapperContained.raidManager); }
// public yarnwrap.world.gen.StructureAccessor structureAccessor() { return new yarnwrap.world.gen.StructureAccessor(wrapperContained.structureAccessor); }
// public yarnwrap.world.level.ServerWorldProperties worldProperties() { return new yarnwrap.world.level.ServerWorldProperties(wrapperContained.worldProperties); }
// public yarnwrap.server.world.ServerChunkManager chunkManager() { return new yarnwrap.server.world.ServerChunkManager(wrapperContained.chunkManager); }
// public java.util.List spawners() { return wrapperContained.spawners; }
// public yarnwrap.entity.boss.dragon.EnderDragonFight enderDragonFight() { return new yarnwrap.entity.boss.dragon.EnderDragonFight(wrapperContained.enderDragonFight); }
// public boolean shouldTickTime() { return wrapperContained.shouldTickTime; }
public yarnwrap.util.math.BlockPos END_SPAWN_POS() { return new yarnwrap.util.math.BlockPos(wrapperContained.END_SPAWN_POS); }
// public java.util.Set loadedMobs() { return wrapperContained.loadedMobs; }
// public it.unimi.dsi.fastutil.ints.Int2ObjectMap dragonParts() { return wrapperContained.dragonParts; }
// public yarnwrap.world.EntityList entityList() { return new yarnwrap.world.EntityList(wrapperContained.entityList); }
// public yarnwrap.server.world.ServerEntityManager entityManager() { return new yarnwrap.server.world.ServerEntityManager(wrapperContained.entityManager); }
// public yarnwrap.server.world.SleepManager sleepManager() { return new yarnwrap.server.world.SleepManager(wrapperContained.sleepManager); }
// public int SERVER_IDLE_COOLDOWN() { return wrapperContained.SERVER_IDLE_COOLDOWN; }
// public int MAX_TICKS() { return wrapperContained.MAX_TICKS; }
// public java.util.List blockEventQueue() { return wrapperContained.blockEventQueue; }
// public yarnwrap.world.StructureLocator structureLocator() { return new yarnwrap.world.StructureLocator(wrapperContained.structureLocator); }
// public boolean duringListenerUpdate() { return wrapperContained.duringListenerUpdate; }
// public yarnwrap.world.event.listener.GameEventDispatchManager gameEventDispatchManager() { return new yarnwrap.world.event.listener.GameEventDispatchManager(wrapperContained.gameEventDispatchManager); }
// public yarnwrap.util.math.intprovider.IntProvider CLEAR_THUNDER_WEATHER_DURATION_PROVIDER() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.CLEAR_THUNDER_WEATHER_DURATION_PROVIDER); }
public yarnwrap.util.math.intprovider.IntProvider CLEAR_WEATHER_DURATION_PROVIDER() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.CLEAR_WEATHER_DURATION_PROVIDER); }
public yarnwrap.util.math.intprovider.IntProvider RAIN_WEATHER_DURATION_PROVIDER() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.RAIN_WEATHER_DURATION_PROVIDER); }
public yarnwrap.util.math.intprovider.IntProvider THUNDER_WEATHER_DURATION_PROVIDER() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.THUNDER_WEATHER_DURATION_PROVIDER); }
// public yarnwrap.util.math.random.RandomSequencesState randomSequences() { return new yarnwrap.util.math.random.RandomSequencesState(wrapperContained.randomSequences); }
// public int spawnChunkRadius() { return wrapperContained.spawnChunkRadius; }
// public yarnwrap.entity.ai.pathing.PathNodeTypeCache pathNodeTypeCache() { return new yarnwrap.entity.ai.pathing.PathNodeTypeCache(wrapperContained.pathNodeTypeCache); }
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
public boolean isNearOccupiedPointOfInterest(yarnwrap.util.math.ChunkSectionPos sectionPos) { return wrapperContained.isNearOccupiedPointOfInterest(sectionPos.wrapperContained); }
// public void dumpEntities(java.io.Writer writer,java.lang.Iterable entities) { wrapperContained.dumpEntities(writer,entities); }
// public void dump(java.nio.file.Path path) { wrapperContained.dump(path); }
// public void dumpBlockEntities(java.io.Writer writer) { wrapperContained.dumpBlockEntities(writer); }
public void clearUpdatesInArea(yarnwrap.util.math.BlockBox box) { wrapperContained.clearUpdatesInArea(box.wrapperContained); }
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
public void loadEntities(java.util.stream.Stream entities) { wrapperContained.loadEntities(entities); }
public yarnwrap.entity.Entity getDragonPart(int id) { return new yarnwrap.entity.Entity(wrapperContained.getDragonPart(id)); }
public void addEntities(java.util.stream.Stream entities) { wrapperContained.addEntities(entities); }
// public boolean shouldCancelSpawn(yarnwrap.entity.Entity entity) { return wrapperContained.shouldCancelSpawn(entity.wrapperContained); }
public int getLogicalHeight() { return wrapperContained.getLogicalHeight(); }
// public void sendSleepingStatus() { wrapperContained.sendSleepingStatus(); }
public boolean isSleepingEnabled() { return wrapperContained.isSleepingEnabled(); }
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
public yarnwrap.util.math.random.Random getOrCreateRandom(yarnwrap.util.Identifier id) { return new yarnwrap.util.math.random.Random(wrapperContained.getOrCreateRandom(id.wrapperContained)); }
public void setEnderDragonFight(yarnwrap.entity.boss.dragon.EnderDragonFight enderDragonFight) { wrapperContained.setEnderDragonFight(enderDragonFight.wrapperContained); }
public yarnwrap.util.math.random.RandomSequencesState getRandomSequences() { return new yarnwrap.util.math.random.RandomSequencesState(wrapperContained.getRandomSequences()); }
public void tickIceAndSnow(yarnwrap.util.math.BlockPos pos) { wrapperContained.tickIceAndSnow(pos.wrapperContained); }
public yarnwrap.entity.ai.pathing.PathNodeTypeCache getPathNodeTypeCache() { return new yarnwrap.entity.ai.pathing.PathNodeTypeCache(wrapperContained.getPathNodeTypeCache()); }
public void updateSleepingPlayers() { wrapperContained.updateSleepingPlayers(); }
public yarnwrap.util.math.BlockPos locateStructure(yarnwrap.registry.tag.TagKey structureTag,yarnwrap.util.math.BlockPos pos,int radius,boolean skipReferencedStructures) { return new yarnwrap.util.math.BlockPos(wrapperContained.locateStructure(structureTag.wrapperContained,pos.wrapperContained,radius,skipReferencedStructures)); }
public void setSpawnPos(yarnwrap.util.math.BlockPos pos,float angle) { wrapperContained.setSpawnPos(pos.wrapperContained,angle); }

}