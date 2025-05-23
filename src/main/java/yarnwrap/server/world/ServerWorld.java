package yarnwrap.server.world;
public class ServerWorld { public net.minecraft.server.world.ServerWorld wrapperContained; public ServerWorld(net.minecraft.server.world.ServerWorld wrapperContained) { this.wrapperContained = wrapperContained; }

// public int idleTimeout() { return wrapperContained.idleTimeout; }
// public void idleTimeout(int value) { wrapperContained.idleTimeout = value; }
// public static int idleTimeout() { return net.minecraft.server.world.ServerWorld.idleTimeout; }
// public static void idleTimeout(int value, ) { net.minecraft.server.world.ServerWorld.idleTimeout = value; }

// public yarnwrap.world.tick.WorldTickScheduler blockTickScheduler() { return new yarnwrap.world.tick.WorldTickScheduler(wrapperContained.blockTickScheduler); }
// public void blockTickScheduler(yarnwrap.world.tick.WorldTickScheduler value) { wrapperContained.blockTickScheduler = value.wrapperContained; }
// public static yarnwrap.world.tick.WorldTickScheduler blockTickScheduler() { return new yarnwrap.world.tick.WorldTickScheduler(net.minecraft.server.world.ServerWorld.blockTickScheduler); }
// public static void blockTickScheduler(yarnwrap.world.tick.WorldTickScheduler value, ) { net.minecraft.server.world.ServerWorld.blockTickScheduler = value.wrapperContained; }

// public it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet syncedBlockEventQueue() { return wrapperContained.syncedBlockEventQueue; }
// public void syncedBlockEventQueue(it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet value) { wrapperContained.syncedBlockEventQueue = value; }
// public static it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet syncedBlockEventQueue() { return net.minecraft.server.world.ServerWorld.syncedBlockEventQueue; }
// public static void syncedBlockEventQueue(it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet value, ) { net.minecraft.server.world.ServerWorld.syncedBlockEventQueue = value; }

// public yarnwrap.world.tick.WorldTickScheduler fluidTickScheduler() { return new yarnwrap.world.tick.WorldTickScheduler(wrapperContained.fluidTickScheduler); }
// public void fluidTickScheduler(yarnwrap.world.tick.WorldTickScheduler value) { wrapperContained.fluidTickScheduler = value.wrapperContained; }
// public static yarnwrap.world.tick.WorldTickScheduler fluidTickScheduler() { return new yarnwrap.world.tick.WorldTickScheduler(net.minecraft.server.world.ServerWorld.fluidTickScheduler); }
// public static void fluidTickScheduler(yarnwrap.world.tick.WorldTickScheduler value, ) { net.minecraft.server.world.ServerWorld.fluidTickScheduler = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.world.ServerWorld.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.world.ServerWorld.LOGGER = value; }

// public boolean inBlockTick() { return wrapperContained.inBlockTick; }
// public void inBlockTick(boolean value) { wrapperContained.inBlockTick = value; }
// public static boolean inBlockTick() { return net.minecraft.server.world.ServerWorld.inBlockTick; }
// public static void inBlockTick(boolean value, ) { net.minecraft.server.world.ServerWorld.inBlockTick = value; }

// public yarnwrap.world.dimension.PortalForcer portalForcer() { return new yarnwrap.world.dimension.PortalForcer(wrapperContained.portalForcer); }
// public void portalForcer(yarnwrap.world.dimension.PortalForcer value) { wrapperContained.portalForcer = value.wrapperContained; }
// public static yarnwrap.world.dimension.PortalForcer portalForcer() { return new yarnwrap.world.dimension.PortalForcer(net.minecraft.server.world.ServerWorld.portalForcer); }
// public static void portalForcer(yarnwrap.world.dimension.PortalForcer value, ) { net.minecraft.server.world.ServerWorld.portalForcer = value.wrapperContained; }

public boolean savingDisabled() { return wrapperContained.savingDisabled; }
public void savingDisabled(boolean value) { wrapperContained.savingDisabled = value; }
// public static boolean savingDisabled() { return net.minecraft.server.world.ServerWorld.savingDisabled; }
// public static void savingDisabled(boolean value, ) { net.minecraft.server.world.ServerWorld.savingDisabled = value; }

// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public void server(yarnwrap.server.MinecraftServer value) { wrapperContained.server = value.wrapperContained; }
// public static yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(net.minecraft.server.world.ServerWorld.server); }
// public static void server(yarnwrap.server.MinecraftServer value, ) { net.minecraft.server.world.ServerWorld.server = value.wrapperContained; }

// public java.util.List players() { return wrapperContained.players; }
// public void players(java.util.List value) { wrapperContained.players = value; }
// public static java.util.List players() { return net.minecraft.server.world.ServerWorld.players; }
// public static void players(java.util.List value, ) { net.minecraft.server.world.ServerWorld.players = value; }

// public yarnwrap.village.raid.RaidManager raidManager() { return new yarnwrap.village.raid.RaidManager(wrapperContained.raidManager); }
// public void raidManager(yarnwrap.village.raid.RaidManager value) { wrapperContained.raidManager = value.wrapperContained; }
// public static yarnwrap.village.raid.RaidManager raidManager() { return new yarnwrap.village.raid.RaidManager(net.minecraft.server.world.ServerWorld.raidManager); }
// public static void raidManager(yarnwrap.village.raid.RaidManager value, ) { net.minecraft.server.world.ServerWorld.raidManager = value.wrapperContained; }

// public yarnwrap.world.gen.StructureAccessor structureAccessor() { return new yarnwrap.world.gen.StructureAccessor(wrapperContained.structureAccessor); }
// public void structureAccessor(yarnwrap.world.gen.StructureAccessor value) { wrapperContained.structureAccessor = value.wrapperContained; }
// public static yarnwrap.world.gen.StructureAccessor structureAccessor() { return new yarnwrap.world.gen.StructureAccessor(net.minecraft.server.world.ServerWorld.structureAccessor); }
// public static void structureAccessor(yarnwrap.world.gen.StructureAccessor value, ) { net.minecraft.server.world.ServerWorld.structureAccessor = value.wrapperContained; }

// public yarnwrap.world.level.ServerWorldProperties worldProperties() { return new yarnwrap.world.level.ServerWorldProperties(wrapperContained.worldProperties); }
// public void worldProperties(yarnwrap.world.level.ServerWorldProperties value) { wrapperContained.worldProperties = value.wrapperContained; }
// public static yarnwrap.world.level.ServerWorldProperties worldProperties() { return new yarnwrap.world.level.ServerWorldProperties(net.minecraft.server.world.ServerWorld.worldProperties); }
// public static void worldProperties(yarnwrap.world.level.ServerWorldProperties value, ) { net.minecraft.server.world.ServerWorld.worldProperties = value.wrapperContained; }

// public yarnwrap.server.world.ServerChunkManager chunkManager() { return new yarnwrap.server.world.ServerChunkManager(wrapperContained.chunkManager); }
// public void chunkManager(yarnwrap.server.world.ServerChunkManager value) { wrapperContained.chunkManager = value.wrapperContained; }
// public static yarnwrap.server.world.ServerChunkManager chunkManager() { return new yarnwrap.server.world.ServerChunkManager(net.minecraft.server.world.ServerWorld.chunkManager); }
// public static void chunkManager(yarnwrap.server.world.ServerChunkManager value, ) { net.minecraft.server.world.ServerWorld.chunkManager = value.wrapperContained; }

// public java.util.List spawners() { return wrapperContained.spawners; }
// public void spawners(java.util.List value) { wrapperContained.spawners = value; }
// public static java.util.List spawners() { return net.minecraft.server.world.ServerWorld.spawners; }
// public static void spawners(java.util.List value, ) { net.minecraft.server.world.ServerWorld.spawners = value; }

// public yarnwrap.entity.boss.dragon.EnderDragonFight enderDragonFight() { return new yarnwrap.entity.boss.dragon.EnderDragonFight(wrapperContained.enderDragonFight); }
// public void enderDragonFight(yarnwrap.entity.boss.dragon.EnderDragonFight value) { wrapperContained.enderDragonFight = value.wrapperContained; }
// public static yarnwrap.entity.boss.dragon.EnderDragonFight enderDragonFight() { return new yarnwrap.entity.boss.dragon.EnderDragonFight(net.minecraft.server.world.ServerWorld.enderDragonFight); }
// public static void enderDragonFight(yarnwrap.entity.boss.dragon.EnderDragonFight value, ) { net.minecraft.server.world.ServerWorld.enderDragonFight = value.wrapperContained; }

// public boolean shouldTickTime() { return wrapperContained.shouldTickTime; }
// public void shouldTickTime(boolean value) { wrapperContained.shouldTickTime = value; }
// public static boolean shouldTickTime() { return net.minecraft.server.world.ServerWorld.shouldTickTime; }
// public static void shouldTickTime(boolean value, ) { net.minecraft.server.world.ServerWorld.shouldTickTime = value; }

// public yarnwrap.util.math.BlockPos END_SPAWN_POS() { return new yarnwrap.util.math.BlockPos(wrapperContained.END_SPAWN_POS); }
// public void END_SPAWN_POS(yarnwrap.util.math.BlockPos value) { wrapperContained.END_SPAWN_POS = value.wrapperContained; }
public static yarnwrap.util.math.BlockPos END_SPAWN_POS() { return new yarnwrap.util.math.BlockPos(net.minecraft.server.world.ServerWorld.END_SPAWN_POS); }
// public static void END_SPAWN_POS(yarnwrap.util.math.BlockPos value, ) { net.minecraft.server.world.ServerWorld.END_SPAWN_POS = value.wrapperContained; }

// public java.util.Set loadedMobs() { return wrapperContained.loadedMobs; }
// public void loadedMobs(java.util.Set value) { wrapperContained.loadedMobs = value; }
// public static java.util.Set loadedMobs() { return net.minecraft.server.world.ServerWorld.loadedMobs; }
// public static void loadedMobs(java.util.Set value, ) { net.minecraft.server.world.ServerWorld.loadedMobs = value; }

// public it.unimi.dsi.fastutil.ints.Int2ObjectMap enderDragonParts() { return wrapperContained.enderDragonParts; }
// public void enderDragonParts(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.enderDragonParts = value; }
// public static it.unimi.dsi.fastutil.ints.Int2ObjectMap enderDragonParts() { return net.minecraft.server.world.ServerWorld.enderDragonParts; }
// public static void enderDragonParts(it.unimi.dsi.fastutil.ints.Int2ObjectMap value, ) { net.minecraft.server.world.ServerWorld.enderDragonParts = value; }

// public yarnwrap.world.EntityList entityList() { return new yarnwrap.world.EntityList(wrapperContained.entityList); }
// public void entityList(yarnwrap.world.EntityList value) { wrapperContained.entityList = value.wrapperContained; }
// public static yarnwrap.world.EntityList entityList() { return new yarnwrap.world.EntityList(net.minecraft.server.world.ServerWorld.entityList); }
// public static void entityList(yarnwrap.world.EntityList value, ) { net.minecraft.server.world.ServerWorld.entityList = value.wrapperContained; }

// public yarnwrap.server.world.ServerEntityManager entityManager() { return new yarnwrap.server.world.ServerEntityManager(wrapperContained.entityManager); }
// public void entityManager(yarnwrap.server.world.ServerEntityManager value) { wrapperContained.entityManager = value.wrapperContained; }
// public static yarnwrap.server.world.ServerEntityManager entityManager() { return new yarnwrap.server.world.ServerEntityManager(net.minecraft.server.world.ServerWorld.entityManager); }
// public static void entityManager(yarnwrap.server.world.ServerEntityManager value, ) { net.minecraft.server.world.ServerWorld.entityManager = value.wrapperContained; }

// public yarnwrap.server.world.SleepManager sleepManager() { return new yarnwrap.server.world.SleepManager(wrapperContained.sleepManager); }
// public void sleepManager(yarnwrap.server.world.SleepManager value) { wrapperContained.sleepManager = value.wrapperContained; }
// public static yarnwrap.server.world.SleepManager sleepManager() { return new yarnwrap.server.world.SleepManager(net.minecraft.server.world.ServerWorld.sleepManager); }
// public static void sleepManager(yarnwrap.server.world.SleepManager value, ) { net.minecraft.server.world.ServerWorld.sleepManager = value.wrapperContained; }

// public int SERVER_IDLE_COOLDOWN() { return wrapperContained.SERVER_IDLE_COOLDOWN; }
// public void SERVER_IDLE_COOLDOWN(int value) { wrapperContained.SERVER_IDLE_COOLDOWN = value; }
// public static int SERVER_IDLE_COOLDOWN() { return net.minecraft.server.world.ServerWorld.SERVER_IDLE_COOLDOWN; }
// public static void SERVER_IDLE_COOLDOWN(int value, ) { net.minecraft.server.world.ServerWorld.SERVER_IDLE_COOLDOWN = value; }

// public int MAX_TICKS() { return wrapperContained.MAX_TICKS; }
// public void MAX_TICKS(int value) { wrapperContained.MAX_TICKS = value; }
// public static int MAX_TICKS() { return net.minecraft.server.world.ServerWorld.MAX_TICKS; }
// public static void MAX_TICKS(int value, ) { net.minecraft.server.world.ServerWorld.MAX_TICKS = value; }

// public java.util.List blockEventQueue() { return wrapperContained.blockEventQueue; }
// public void blockEventQueue(java.util.List value) { wrapperContained.blockEventQueue = value; }
// public static java.util.List blockEventQueue() { return net.minecraft.server.world.ServerWorld.blockEventQueue; }
// public static void blockEventQueue(java.util.List value, ) { net.minecraft.server.world.ServerWorld.blockEventQueue = value; }

// public yarnwrap.world.StructureLocator structureLocator() { return new yarnwrap.world.StructureLocator(wrapperContained.structureLocator); }
// public void structureLocator(yarnwrap.world.StructureLocator value) { wrapperContained.structureLocator = value.wrapperContained; }
// public static yarnwrap.world.StructureLocator structureLocator() { return new yarnwrap.world.StructureLocator(net.minecraft.server.world.ServerWorld.structureLocator); }
// public static void structureLocator(yarnwrap.world.StructureLocator value, ) { net.minecraft.server.world.ServerWorld.structureLocator = value.wrapperContained; }

// public boolean duringListenerUpdate() { return wrapperContained.duringListenerUpdate; }
// public void duringListenerUpdate(boolean value) { wrapperContained.duringListenerUpdate = value; }
// public static boolean duringListenerUpdate() { return net.minecraft.server.world.ServerWorld.duringListenerUpdate; }
// public static void duringListenerUpdate(boolean value, ) { net.minecraft.server.world.ServerWorld.duringListenerUpdate = value; }

// public yarnwrap.world.event.listener.GameEventDispatchManager gameEventDispatchManager() { return new yarnwrap.world.event.listener.GameEventDispatchManager(wrapperContained.gameEventDispatchManager); }
// public void gameEventDispatchManager(yarnwrap.world.event.listener.GameEventDispatchManager value) { wrapperContained.gameEventDispatchManager = value.wrapperContained; }
// public static yarnwrap.world.event.listener.GameEventDispatchManager gameEventDispatchManager() { return new yarnwrap.world.event.listener.GameEventDispatchManager(net.minecraft.server.world.ServerWorld.gameEventDispatchManager); }
// public static void gameEventDispatchManager(yarnwrap.world.event.listener.GameEventDispatchManager value, ) { net.minecraft.server.world.ServerWorld.gameEventDispatchManager = value.wrapperContained; }

// public yarnwrap.util.math.intprovider.IntProvider CLEAR_THUNDER_WEATHER_DURATION_PROVIDER() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.CLEAR_THUNDER_WEATHER_DURATION_PROVIDER); }
// public void CLEAR_THUNDER_WEATHER_DURATION_PROVIDER(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.CLEAR_THUNDER_WEATHER_DURATION_PROVIDER = value.wrapperContained; }
// public static yarnwrap.util.math.intprovider.IntProvider CLEAR_THUNDER_WEATHER_DURATION_PROVIDER() { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.server.world.ServerWorld.CLEAR_THUNDER_WEATHER_DURATION_PROVIDER); }
// public static void CLEAR_THUNDER_WEATHER_DURATION_PROVIDER(yarnwrap.util.math.intprovider.IntProvider value, ) { net.minecraft.server.world.ServerWorld.CLEAR_THUNDER_WEATHER_DURATION_PROVIDER = value.wrapperContained; }

// public yarnwrap.util.math.intprovider.IntProvider CLEAR_WEATHER_DURATION_PROVIDER() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.CLEAR_WEATHER_DURATION_PROVIDER); }
// public void CLEAR_WEATHER_DURATION_PROVIDER(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.CLEAR_WEATHER_DURATION_PROVIDER = value.wrapperContained; }
public static yarnwrap.util.math.intprovider.IntProvider CLEAR_WEATHER_DURATION_PROVIDER() { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.server.world.ServerWorld.CLEAR_WEATHER_DURATION_PROVIDER); }
// public static void CLEAR_WEATHER_DURATION_PROVIDER(yarnwrap.util.math.intprovider.IntProvider value, ) { net.minecraft.server.world.ServerWorld.CLEAR_WEATHER_DURATION_PROVIDER = value.wrapperContained; }

// public yarnwrap.util.math.intprovider.IntProvider RAIN_WEATHER_DURATION_PROVIDER() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.RAIN_WEATHER_DURATION_PROVIDER); }
// public void RAIN_WEATHER_DURATION_PROVIDER(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.RAIN_WEATHER_DURATION_PROVIDER = value.wrapperContained; }
public static yarnwrap.util.math.intprovider.IntProvider RAIN_WEATHER_DURATION_PROVIDER() { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.server.world.ServerWorld.RAIN_WEATHER_DURATION_PROVIDER); }
// public static void RAIN_WEATHER_DURATION_PROVIDER(yarnwrap.util.math.intprovider.IntProvider value, ) { net.minecraft.server.world.ServerWorld.RAIN_WEATHER_DURATION_PROVIDER = value.wrapperContained; }

// public yarnwrap.util.math.intprovider.IntProvider THUNDER_WEATHER_DURATION_PROVIDER() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.THUNDER_WEATHER_DURATION_PROVIDER); }
// public void THUNDER_WEATHER_DURATION_PROVIDER(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.THUNDER_WEATHER_DURATION_PROVIDER = value.wrapperContained; }
public static yarnwrap.util.math.intprovider.IntProvider THUNDER_WEATHER_DURATION_PROVIDER() { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.server.world.ServerWorld.THUNDER_WEATHER_DURATION_PROVIDER); }
// public static void THUNDER_WEATHER_DURATION_PROVIDER(yarnwrap.util.math.intprovider.IntProvider value, ) { net.minecraft.server.world.ServerWorld.THUNDER_WEATHER_DURATION_PROVIDER = value.wrapperContained; }

// public yarnwrap.util.math.random.RandomSequencesState randomSequences() { return new yarnwrap.util.math.random.RandomSequencesState(wrapperContained.randomSequences); }
// public void randomSequences(yarnwrap.util.math.random.RandomSequencesState value) { wrapperContained.randomSequences = value.wrapperContained; }
// public static yarnwrap.util.math.random.RandomSequencesState randomSequences() { return new yarnwrap.util.math.random.RandomSequencesState(net.minecraft.server.world.ServerWorld.randomSequences); }
// public static void randomSequences(yarnwrap.util.math.random.RandomSequencesState value, ) { net.minecraft.server.world.ServerWorld.randomSequences = value.wrapperContained; }

// public int spawnChunkRadius() { return wrapperContained.spawnChunkRadius; }
// public void spawnChunkRadius(int value) { wrapperContained.spawnChunkRadius = value; }
// public static int spawnChunkRadius() { return net.minecraft.server.world.ServerWorld.spawnChunkRadius; }
// public static void spawnChunkRadius(int value, ) { net.minecraft.server.world.ServerWorld.spawnChunkRadius = value; }

// public yarnwrap.entity.ai.pathing.PathNodeTypeCache pathNodeTypeCache() { return new yarnwrap.entity.ai.pathing.PathNodeTypeCache(wrapperContained.pathNodeTypeCache); }
// public void pathNodeTypeCache(yarnwrap.entity.ai.pathing.PathNodeTypeCache value) { wrapperContained.pathNodeTypeCache = value.wrapperContained; }
// public static yarnwrap.entity.ai.pathing.PathNodeTypeCache pathNodeTypeCache() { return new yarnwrap.entity.ai.pathing.PathNodeTypeCache(net.minecraft.server.world.ServerWorld.pathNodeTypeCache); }
// public static void pathNodeTypeCache(yarnwrap.entity.ai.pathing.PathNodeTypeCache value, ) { net.minecraft.server.world.ServerWorld.pathNodeTypeCache = value.wrapperContained; }

// public yarnwrap.server.network.ServerWaypointHandler waypointHandler() { return new yarnwrap.server.network.ServerWaypointHandler(wrapperContained.waypointHandler); }
// public void waypointHandler(yarnwrap.server.network.ServerWaypointHandler value) { wrapperContained.waypointHandler = value.wrapperContained; }
// public static yarnwrap.server.network.ServerWaypointHandler waypointHandler() { return new yarnwrap.server.network.ServerWaypointHandler(net.minecraft.server.world.ServerWorld.waypointHandler); }
// public static void waypointHandler(yarnwrap.server.network.ServerWaypointHandler value, ) { net.minecraft.server.world.ServerWorld.waypointHandler = value.wrapperContained; }

// public ServerWorld(yarnwrap.server.MinecraftServer server,java.util.concurrent.Executor workerExecutor,Object session,yarnwrap.world.level.ServerWorldProperties properties,yarnwrap.registry.RegistryKey worldKey,yarnwrap.world.dimension.DimensionOptions dimensionOptions,yarnwrap.server.WorldGenerationProgressListener worldGenerationProgressListener,boolean debugWorld,long seed,java.util.List spawners,boolean shouldTickTime,yarnwrap.util.math.random.RandomSequencesState randomSequencesState) { this.wrapperContained = new net.minecraft.server.world.ServerWorld(server.wrapperContained,workerExecutor,session,properties.wrapperContained,worldKey.wrapperContained,dimensionOptions.wrapperContained,worldGenerationProgressListener.wrapperContained,debugWorld,seed,spawners,shouldTickTime,randomSequencesState.wrapperContained); }
public void updateSleepingPlayers() { wrapperContained.updateSleepingPlayers(); }
// public static void updateSleepingPlayers() { net.minecraft.server.world.ServerWorld.updateSleepingPlayers(); }
public yarnwrap.util.math.BlockPos locateStructure(yarnwrap.registry.tag.TagKey structureTag,yarnwrap.util.math.BlockPos pos,int radius,boolean skipReferencedStructures) { return new yarnwrap.util.math.BlockPos(wrapperContained.locateStructure(structureTag.wrapperContained,pos.wrapperContained,radius,skipReferencedStructures)); }
// public static yarnwrap.util.math.BlockPos locateStructure(yarnwrap.registry.tag.TagKey structureTag,yarnwrap.util.math.BlockPos pos,int radius,boolean skipReferencedStructures, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.server.world.ServerWorld.locateStructure(structureTag.wrapperContained,pos.wrapperContained,radius,skipReferencedStructures)); }
public void setSpawnPos(yarnwrap.util.math.BlockPos pos,float angle) { wrapperContained.setSpawnPos(pos.wrapperContained,angle); }
// public static void setSpawnPos(yarnwrap.util.math.BlockPos pos,float angle, ) { net.minecraft.server.world.ServerWorld.setSpawnPos(pos.wrapperContained,angle); }
public boolean spawnParticles(yarnwrap.server.network.ServerPlayerEntity viewer,yarnwrap.particle.ParticleEffect parameters,boolean force,boolean important,double x,double y,double z,int count,double offsetX,double offsetY,double offsetZ,double speed) { return wrapperContained.spawnParticles(viewer.wrapperContained,parameters.wrapperContained,force,important,x,y,z,count,offsetX,offsetY,offsetZ,speed); }
// public static boolean spawnParticles(yarnwrap.server.network.ServerPlayerEntity viewer,yarnwrap.particle.ParticleEffect parameters,boolean force,boolean important,double x,double y,double z,int count,double offsetX,double offsetY,double offsetZ,double speed, ) { return net.minecraft.server.world.ServerWorld.spawnParticles(viewer.wrapperContained,parameters.wrapperContained,force,important,x,y,z,count,offsetX,offsetY,offsetZ,speed); }
// public void tickFluid(yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.Fluid fluid) { wrapperContained.tickFluid(pos.wrapperContained,fluid.wrapperContained); }
// public static void tickFluid(yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.Fluid fluid, ) { net.minecraft.server.world.ServerWorld.tickFluid(pos.wrapperContained,fluid.wrapperContained); }
public yarnwrap.world.dimension.PortalForcer getPortalForcer() { return new yarnwrap.world.dimension.PortalForcer(wrapperContained.getPortalForcer()); }
// public static yarnwrap.world.dimension.PortalForcer getPortalForcer() { return new yarnwrap.world.dimension.PortalForcer(net.minecraft.server.world.ServerWorld.getPortalForcer()); }
// public boolean processBlockEvent(yarnwrap.server.world.BlockEvent event) { return wrapperContained.processBlockEvent(event.wrapperContained); }
// public static boolean processBlockEvent(yarnwrap.server.world.BlockEvent event, ) { return net.minecraft.server.world.ServerWorld.processBlockEvent(event.wrapperContained); }
// public boolean addEntity(yarnwrap.entity.Entity entity) { return wrapperContained.addEntity(entity.wrapperContained); }
// public static boolean addEntity(yarnwrap.entity.Entity entity, ) { return net.minecraft.server.world.ServerWorld.addEntity(entity.wrapperContained); }
public void save(yarnwrap.util.ProgressListener progressListener,boolean flush,boolean savingDisabled) { wrapperContained.save(progressListener.wrapperContained,flush,savingDisabled); }
// public static void save(yarnwrap.util.ProgressListener progressListener,boolean flush,boolean savingDisabled, ) { net.minecraft.server.world.ServerWorld.save(progressListener.wrapperContained,flush,savingDisabled); }
public boolean isInBlockTick() { return wrapperContained.isInBlockTick(); }
// public static boolean isInBlockTick() { return net.minecraft.server.world.ServerWorld.isInBlockTick(); }
public yarnwrap.structure.StructureTemplateManager getStructureTemplateManager() { return new yarnwrap.structure.StructureTemplateManager(wrapperContained.getStructureTemplateManager()); }
// public static yarnwrap.structure.StructureTemplateManager getStructureTemplateManager() { return new yarnwrap.structure.StructureTemplateManager(net.minecraft.server.world.ServerWorld.getStructureTemplateManager()); }
// public void savePersistentState(boolean flush) { wrapperContained.savePersistentState(flush); }
// public static void savePersistentState(boolean flush, ) { net.minecraft.server.world.ServerWorld.savePersistentState(flush); }
// public void tickBlock(yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block block) { wrapperContained.tickBlock(pos.wrapperContained,block.wrapperContained); }
// public static void tickBlock(yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block block, ) { net.minecraft.server.world.ServerWorld.tickBlock(pos.wrapperContained,block.wrapperContained); }
public boolean sendToPlayerIfNearby(yarnwrap.server.network.ServerPlayerEntity player,boolean force,double x,double y,double z,yarnwrap.network.packet.Packet packet) { return wrapperContained.sendToPlayerIfNearby(player.wrapperContained,force,x,y,z,packet.wrapperContained); }
// public static boolean sendToPlayerIfNearby(yarnwrap.server.network.ServerPlayerEntity player,boolean force,double x,double y,double z,yarnwrap.network.packet.Packet packet, ) { return net.minecraft.server.world.ServerWorld.sendToPlayerIfNearby(player.wrapperContained,force,x,y,z,packet.wrapperContained); }
// public void processSyncedBlockEvents() { wrapperContained.processSyncedBlockEvents(); }
// public static void processSyncedBlockEvents() { net.minecraft.server.world.ServerWorld.processSyncedBlockEvents(); }
public void resetWeather() { wrapperContained.resetWeather(); }
// public static void resetWeather() { net.minecraft.server.world.ServerWorld.resetWeather(); }
public void resetIdleTimeout() { wrapperContained.resetIdleTimeout(); }
// public static void resetIdleTimeout() { net.minecraft.server.world.ServerWorld.resetIdleTimeout(); }
public int spawnParticles(yarnwrap.particle.ParticleEffect parameters,boolean force,boolean important,double x,double y,double z,int count,double offsetX,double offsetY,double offsetZ,double speed) { return wrapperContained.spawnParticles(parameters.wrapperContained,force,important,x,y,z,count,offsetX,offsetY,offsetZ,speed); }
// public static int spawnParticles(yarnwrap.particle.ParticleEffect parameters,boolean force,boolean important,double x,double y,double z,int count,double offsetX,double offsetY,double offsetZ,double speed, ) { return net.minecraft.server.world.ServerWorld.spawnParticles(parameters.wrapperContained,force,important,x,y,z,count,offsetX,offsetY,offsetZ,speed); }
public yarnwrap.component.type.MapIdComponent increaseAndGetMapId() { return new yarnwrap.component.type.MapIdComponent(wrapperContained.increaseAndGetMapId()); }
// public static yarnwrap.component.type.MapIdComponent increaseAndGetMapId() { return new yarnwrap.component.type.MapIdComponent(net.minecraft.server.world.ServerWorld.increaseAndGetMapId()); }
public void putMapState(yarnwrap.component.type.MapIdComponent id,yarnwrap.item.map.MapState state) { wrapperContained.putMapState(id.wrapperContained,state.wrapperContained); }
// public static void putMapState(yarnwrap.component.type.MapIdComponent id,yarnwrap.item.map.MapState state, ) { net.minecraft.server.world.ServerWorld.putMapState(id.wrapperContained,state.wrapperContained); }
public yarnwrap.world.PersistentStateManager getPersistentStateManager() { return new yarnwrap.world.PersistentStateManager(wrapperContained.getPersistentStateManager()); }
// public static yarnwrap.world.PersistentStateManager getPersistentStateManager() { return new yarnwrap.world.PersistentStateManager(net.minecraft.server.world.ServerWorld.getPersistentStateManager()); }
public it.unimi.dsi.fastutil.longs.LongSet getForcedChunks() { return wrapperContained.getForcedChunks(); }
// public static it.unimi.dsi.fastutil.longs.LongSet getForcedChunks() { return net.minecraft.server.world.ServerWorld.getForcedChunks(); }
public boolean setChunkForced(int x,int z,boolean forced) { return wrapperContained.setChunkForced(x,z,forced); }
// public static boolean setChunkForced(int x,int z,boolean forced, ) { return net.minecraft.server.world.ServerWorld.setChunkForced(x,z,forced); }
public java.util.List getEntitiesByType(yarnwrap.util.TypeFilter filter,java.util.function.Predicate predicate) { return wrapperContained.getEntitiesByType(filter.wrapperContained,predicate); }
// public static java.util.List getEntitiesByType(yarnwrap.util.TypeFilter filter,java.util.function.Predicate predicate, ) { return net.minecraft.server.world.ServerWorld.getEntitiesByType(filter.wrapperContained,predicate); }
// public boolean method_18199(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_18199(entity.wrapperContained); }
// public static boolean method_18199(yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.server.world.ServerWorld.method_18199(entity.wrapperContained); }
public void tickChunk(yarnwrap.world.chunk.WorldChunk chunk,int randomTickSpeed) { wrapperContained.tickChunk(chunk.wrapperContained,randomTickSpeed); }
// public static void tickChunk(yarnwrap.world.chunk.WorldChunk chunk,int randomTickSpeed, ) { net.minecraft.server.world.ServerWorld.tickChunk(chunk.wrapperContained,randomTickSpeed); }
// public yarnwrap.util.math.BlockPos getLightningPos(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.getLightningPos(pos.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos getLightningPos(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.server.world.ServerWorld.getLightningPos(pos.wrapperContained)); }
public void onPlayerConnected(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.onPlayerConnected(player.wrapperContained); }
// public static void onPlayerConnected(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.world.ServerWorld.onPlayerConnected(player.wrapperContained); }
public void onPlayerRespawned(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.onPlayerRespawned(player.wrapperContained); }
// public static void onPlayerRespawned(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.world.ServerWorld.onPlayerRespawned(player.wrapperContained); }
public void tickEntity(yarnwrap.entity.Entity entity) { wrapperContained.tickEntity(entity.wrapperContained); }
// public static void tickEntity(yarnwrap.entity.Entity entity, ) { net.minecraft.server.world.ServerWorld.tickEntity(entity.wrapperContained); }
// public void tickPassenger(yarnwrap.entity.Entity vehicle,yarnwrap.entity.Entity passenger) { wrapperContained.tickPassenger(vehicle.wrapperContained,passenger.wrapperContained); }
// public static void tickPassenger(yarnwrap.entity.Entity vehicle,yarnwrap.entity.Entity passenger, ) { net.minecraft.server.world.ServerWorld.tickPassenger(vehicle.wrapperContained,passenger.wrapperContained); }
public void unloadEntities(yarnwrap.world.chunk.WorldChunk chunk) { wrapperContained.unloadEntities(chunk.wrapperContained); }
// public static void unloadEntities(yarnwrap.world.chunk.WorldChunk chunk, ) { net.minecraft.server.world.ServerWorld.unloadEntities(chunk.wrapperContained); }
public void tick(java.util.function.BooleanSupplier shouldKeepTicking) { wrapperContained.tick(shouldKeepTicking); }
// public static void tick(java.util.function.BooleanSupplier shouldKeepTicking, ) { net.minecraft.server.world.ServerWorld.tick(shouldKeepTicking); }
public java.util.List getPlayers(java.util.function.Predicate predicate) { return wrapperContained.getPlayers(predicate); }
// public static java.util.List getPlayers(java.util.function.Predicate predicate, ) { return net.minecraft.server.world.ServerWorld.getPlayers(predicate); }
public boolean tryLoadEntity(yarnwrap.entity.Entity entity) { return wrapperContained.tryLoadEntity(entity.wrapperContained); }
// public static boolean tryLoadEntity(yarnwrap.entity.Entity entity, ) { return net.minecraft.server.world.ServerWorld.tryLoadEntity(entity.wrapperContained); }
public void onDimensionChanged(yarnwrap.entity.Entity entity) { wrapperContained.onDimensionChanged(entity.wrapperContained); }
// public static void onDimensionChanged(yarnwrap.entity.Entity entity, ) { net.minecraft.server.world.ServerWorld.onDimensionChanged(entity.wrapperContained); }
// public void removePlayer(yarnwrap.server.network.ServerPlayerEntity player,Object reason) { wrapperContained.removePlayer(player.wrapperContained,reason); }
// public static void removePlayer(yarnwrap.server.network.ServerPlayerEntity player,Object reason, ) { net.minecraft.server.world.ServerWorld.removePlayer(player.wrapperContained,reason); }
// public void addPlayer(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.addPlayer(player.wrapperContained); }
// public static void addPlayer(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.world.ServerWorld.addPlayer(player.wrapperContained); }
// public void method_18773(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.method_18773(player.wrapperContained); }
// public static void method_18773(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.server.world.ServerWorld.method_18773(player.wrapperContained); }
public java.util.List getAliveEnderDragons() { return wrapperContained.getAliveEnderDragons(); }
// public static java.util.List getAliveEnderDragons() { return net.minecraft.server.world.ServerWorld.getAliveEnderDragons(); }
public yarnwrap.server.network.ServerPlayerEntity getRandomAlivePlayer() { return new yarnwrap.server.network.ServerPlayerEntity(wrapperContained.getRandomAlivePlayer()); }
// public static yarnwrap.server.network.ServerPlayerEntity getRandomAlivePlayer() { return new yarnwrap.server.network.ServerPlayerEntity(net.minecraft.server.world.ServerWorld.getRandomAlivePlayer()); }
public yarnwrap.world.poi.PointOfInterestStorage getPointOfInterestStorage() { return new yarnwrap.world.poi.PointOfInterestStorage(wrapperContained.getPointOfInterestStorage()); }
// public static yarnwrap.world.poi.PointOfInterestStorage getPointOfInterestStorage() { return new yarnwrap.world.poi.PointOfInterestStorage(net.minecraft.server.world.ServerWorld.getPointOfInterestStorage()); }
public yarnwrap.village.raid.RaidManager getRaidManager() { return new yarnwrap.village.raid.RaidManager(wrapperContained.getRaidManager()); }
// public static yarnwrap.village.raid.RaidManager getRaidManager() { return new yarnwrap.village.raid.RaidManager(net.minecraft.server.world.ServerWorld.getRaidManager()); }
public void handleInteraction(yarnwrap.entity.EntityInteraction interaction,yarnwrap.entity.Entity entity,yarnwrap.entity.InteractionObserver observer) { wrapperContained.handleInteraction(interaction.wrapperContained,entity.wrapperContained,observer.wrapperContained); }
// public static void handleInteraction(yarnwrap.entity.EntityInteraction interaction,yarnwrap.entity.Entity entity,yarnwrap.entity.InteractionObserver observer, ) { net.minecraft.server.world.ServerWorld.handleInteraction(interaction.wrapperContained,entity.wrapperContained,observer.wrapperContained); }
public boolean isNearOccupiedPointOfInterest(yarnwrap.util.math.BlockPos pos,int maxDistance) { return wrapperContained.isNearOccupiedPointOfInterest(pos.wrapperContained,maxDistance); }
// public static boolean isNearOccupiedPointOfInterest(yarnwrap.util.math.BlockPos pos,int maxDistance, ) { return net.minecraft.server.world.ServerWorld.isNearOccupiedPointOfInterest(pos.wrapperContained,maxDistance); }
public int getOccupiedPointOfInterestDistance(yarnwrap.util.math.ChunkSectionPos pos) { return wrapperContained.getOccupiedPointOfInterestDistance(pos.wrapperContained); }
// public static int getOccupiedPointOfInterestDistance(yarnwrap.util.math.ChunkSectionPos pos, ) { return net.minecraft.server.world.ServerWorld.getOccupiedPointOfInterestDistance(pos.wrapperContained); }
public boolean isNearOccupiedPointOfInterest(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isNearOccupiedPointOfInterest(pos.wrapperContained); }
// public static boolean isNearOccupiedPointOfInterest(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.server.world.ServerWorld.isNearOccupiedPointOfInterest(pos.wrapperContained); }
public yarnwrap.village.raid.Raid getRaidAt(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.village.raid.Raid(wrapperContained.getRaidAt(pos.wrapperContained)); }
// public static yarnwrap.village.raid.Raid getRaidAt(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.village.raid.Raid(net.minecraft.server.world.ServerWorld.getRaidAt(pos.wrapperContained)); }
public boolean hasRaidAt(yarnwrap.util.math.BlockPos pos) { return wrapperContained.hasRaidAt(pos.wrapperContained); }
// public static boolean hasRaidAt(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.server.world.ServerWorld.hasRaidAt(pos.wrapperContained); }
public boolean isNearOccupiedPointOfInterest(yarnwrap.util.math.ChunkSectionPos sectionPos) { return wrapperContained.isNearOccupiedPointOfInterest(sectionPos.wrapperContained); }
// public static boolean isNearOccupiedPointOfInterest(yarnwrap.util.math.ChunkSectionPos sectionPos, ) { return net.minecraft.server.world.ServerWorld.isNearOccupiedPointOfInterest(sectionPos.wrapperContained); }
// public void dumpEntities(java.io.Writer writer,java.lang.Iterable entities) { wrapperContained.dumpEntities(writer,entities); }
// public static void dumpEntities(java.io.Writer writer,java.lang.Iterable entities, ) { net.minecraft.server.world.ServerWorld.dumpEntities(writer,entities); }
// public void dump(java.nio.file.Path path) { wrapperContained.dump(path); }
// public static void dump(java.nio.file.Path path, ) { net.minecraft.server.world.ServerWorld.dump(path); }
// public void dumpBlockEntities(java.io.Writer writer) { wrapperContained.dumpBlockEntities(writer); }
// public static void dumpBlockEntities(java.io.Writer writer, ) { net.minecraft.server.world.ServerWorld.dumpBlockEntities(writer); }
public void clearUpdatesInArea(yarnwrap.util.math.BlockBox box) { wrapperContained.clearUpdatesInArea(box.wrapperContained); }
// public static void clearUpdatesInArea(yarnwrap.util.math.BlockBox box, ) { net.minecraft.server.world.ServerWorld.clearUpdatesInArea(box.wrapperContained); }
// public boolean method_23659(yarnwrap.util.math.BlockBox event) { return wrapperContained.method_23659(event.wrapperContained); }
// public static boolean method_23659(yarnwrap.util.math.BlockBox event, ) { return net.minecraft.server.world.ServerWorld.method_23659(event.wrapperContained); }
// public void wakeSleepingPlayers() { wrapperContained.wakeSleepingPlayers(); }
// public static void wakeSleepingPlayers() { net.minecraft.server.world.ServerWorld.wakeSleepingPlayers(); }
public yarnwrap.world.gen.StructureAccessor getStructureAccessor() { return new yarnwrap.world.gen.StructureAccessor(wrapperContained.getStructureAccessor()); }
// public static yarnwrap.world.gen.StructureAccessor getStructureAccessor() { return new yarnwrap.world.gen.StructureAccessor(net.minecraft.server.world.ServerWorld.getStructureAccessor()); }
public java.lang.Iterable iterateEntities() { return wrapperContained.iterateEntities(); }
// public static java.lang.Iterable iterateEntities() { return net.minecraft.server.world.ServerWorld.iterateEntities(); }
public void setWeather(int clearDuration,int rainDuration,boolean raining,boolean thundering) { wrapperContained.setWeather(clearDuration,rainDuration,raining,thundering); }
// public static void setWeather(int clearDuration,int rainDuration,boolean raining,boolean thundering, ) { net.minecraft.server.world.ServerWorld.setWeather(clearDuration,rainDuration,raining,thundering); }
public boolean isFlat() { return wrapperContained.isFlat(); }
// public static boolean isFlat() { return net.minecraft.server.world.ServerWorld.isFlat(); }
public yarnwrap.entity.boss.dragon.EnderDragonFight getEnderDragonFight() { return new yarnwrap.entity.boss.dragon.EnderDragonFight(wrapperContained.getEnderDragonFight()); }
// public static yarnwrap.entity.boss.dragon.EnderDragonFight getEnderDragonFight() { return new yarnwrap.entity.boss.dragon.EnderDragonFight(net.minecraft.server.world.ServerWorld.getEnderDragonFight()); }
public void setTimeOfDay(long timeOfDay) { wrapperContained.setTimeOfDay(timeOfDay); }
// public static void setTimeOfDay(long timeOfDay, ) { net.minecraft.server.world.ServerWorld.setTimeOfDay(timeOfDay); }
public void tickSpawners(boolean spawnMonsters,boolean spawnAnimals) { wrapperContained.tickSpawners(spawnMonsters,spawnAnimals); }
// public static void tickSpawners(boolean spawnMonsters,boolean spawnAnimals, ) { net.minecraft.server.world.ServerWorld.tickSpawners(spawnMonsters,spawnAnimals); }
// public void tickTime() { wrapperContained.tickTime(); }
// public static void tickTime() { net.minecraft.server.world.ServerWorld.tickTime(); }
public boolean spawnNewEntityAndPassengers(yarnwrap.entity.Entity entity) { return wrapperContained.spawnNewEntityAndPassengers(entity.wrapperContained); }
// public static boolean spawnNewEntityAndPassengers(yarnwrap.entity.Entity entity, ) { return net.minecraft.server.world.ServerWorld.spawnNewEntityAndPassengers(entity.wrapperContained); }
public java.lang.String getDebugString() { return wrapperContained.getDebugString(); }
// public static java.lang.String getDebugString() { return net.minecraft.server.world.ServerWorld.getDebugString(); }
// public java.lang.String getTopFive(java.lang.Iterable items,java.util.function.Function classifier) { return wrapperContained.getTopFive(items,classifier); }
// public static java.lang.String getTopFive(java.lang.Iterable items,java.util.function.Function classifier, ) { return net.minecraft.server.world.ServerWorld.getTopFive(items,classifier); }
// public java.util.Optional getLightningRodPos(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getLightningRodPos(pos.wrapperContained); }
// public static java.util.Optional getLightningRodPos(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.server.world.ServerWorld.getLightningRodPos(pos.wrapperContained); }
// public void method_31420(yarnwrap.world.tick.TickManager entity) { wrapperContained.method_31420(entity.wrapperContained); }
// public static void method_31420(yarnwrap.world.tick.TickManager entity, ) { net.minecraft.server.world.ServerWorld.method_31420(entity.wrapperContained); }
// public boolean method_31421(yarnwrap.registry.entry.RegistryEntry poiType) { return wrapperContained.method_31421(poiType.wrapperContained); }
// public static boolean method_31421(yarnwrap.registry.entry.RegistryEntry poiType, ) { return net.minecraft.server.world.ServerWorld.method_31421(poiType.wrapperContained); }
public void loadEntities(java.util.stream.Stream entities) { wrapperContained.loadEntities(entities); }
// public static void loadEntities(java.util.stream.Stream entities, ) { net.minecraft.server.world.ServerWorld.loadEntities(entities); }
public yarnwrap.entity.Entity getEntityOrDragonPart(int id) { return new yarnwrap.entity.Entity(wrapperContained.getEntityOrDragonPart(id)); }
// public static yarnwrap.entity.Entity getEntityOrDragonPart(int id, ) { return new yarnwrap.entity.Entity(net.minecraft.server.world.ServerWorld.getEntityOrDragonPart(id)); }
public void addEntities(java.util.stream.Stream entities) { wrapperContained.addEntities(entities); }
// public static void addEntities(java.util.stream.Stream entities, ) { net.minecraft.server.world.ServerWorld.addEntities(entities); }
// public java.lang.String method_31431(yarnwrap.entity.Entity entity) { return wrapperContained.method_31431(entity.wrapperContained); }
// public static java.lang.String method_31431(yarnwrap.entity.Entity entity, ) { return net.minecraft.server.world.ServerWorld.method_31431(entity.wrapperContained); }
public int getLogicalHeight() { return wrapperContained.getLogicalHeight(); }
// public static int getLogicalHeight() { return net.minecraft.server.world.ServerWorld.getLogicalHeight(); }
// public void sendSleepingStatus() { wrapperContained.sendSleepingStatus(); }
// public static void sendSleepingStatus() { net.minecraft.server.world.ServerWorld.sendSleepingStatus(); }
public boolean isSleepingEnabled() { return wrapperContained.isSleepingEnabled(); }
// public static boolean isSleepingEnabled() { return net.minecraft.server.world.ServerWorld.isSleepingEnabled(); }
// public yarnwrap.util.math.BlockPos method_34679(yarnwrap.util.math.BlockPos innerPos) { return new yarnwrap.util.math.BlockPos(wrapperContained.method_34679(innerPos.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos method_34679(yarnwrap.util.math.BlockPos innerPos, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.server.world.ServerWorld.method_34679(innerPos.wrapperContained)); }
// public boolean method_34680(yarnwrap.util.math.BlockPos innerPos) { return wrapperContained.method_34680(innerPos.wrapperContained); }
// public static boolean method_34680(yarnwrap.util.math.BlockPos innerPos, ) { return net.minecraft.server.world.ServerWorld.method_34680(innerPos.wrapperContained); }
public boolean isChunkLoaded(long chunkPos) { return wrapperContained.isChunkLoaded(chunkPos); }
// public static boolean isChunkLoaded(long chunkPos, ) { return net.minecraft.server.world.ServerWorld.isChunkLoaded(chunkPos); }
public boolean isTickingFutureReady(long chunkPos) { return wrapperContained.isTickingFutureReady(chunkPos); }
// public static boolean isTickingFutureReady(long chunkPos, ) { return net.minecraft.server.world.ServerWorld.isTickingFutureReady(chunkPos); }
public boolean shouldTickEntityAt(yarnwrap.util.math.BlockPos pos) { return wrapperContained.shouldTickEntityAt(pos.wrapperContained); }
// public static boolean shouldTickEntityAt(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.server.world.ServerWorld.shouldTickEntityAt(pos.wrapperContained); }
public void disableTickSchedulers(yarnwrap.world.chunk.WorldChunk chunk) { wrapperContained.disableTickSchedulers(chunk.wrapperContained); }
// public static void disableTickSchedulers(yarnwrap.world.chunk.WorldChunk chunk, ) { net.minecraft.server.world.ServerWorld.disableTickSchedulers(chunk.wrapperContained); }
// public void tickWeather() { wrapperContained.tickWeather(); }
// public static void tickWeather() { net.minecraft.server.world.ServerWorld.tickWeather(); }
public void cacheStructures(yarnwrap.world.chunk.Chunk chunk) { wrapperContained.cacheStructures(chunk.wrapperContained); }
// public static void cacheStructures(yarnwrap.world.chunk.Chunk chunk, ) { net.minecraft.server.world.ServerWorld.cacheStructures(chunk.wrapperContained); }
public com.mojang.datafixers.util.Pair locateBiome(java.util.function.Predicate predicate,yarnwrap.util.math.BlockPos pos,int radius,int horizontalBlockCheckInterval,int verticalBlockCheckInterval) { return wrapperContained.locateBiome(predicate,pos.wrapperContained,radius,horizontalBlockCheckInterval,verticalBlockCheckInterval); }
// public static com.mojang.datafixers.util.Pair locateBiome(java.util.function.Predicate predicate,yarnwrap.util.math.BlockPos pos,int radius,int horizontalBlockCheckInterval,int verticalBlockCheckInterval, ) { return net.minecraft.server.world.ServerWorld.locateBiome(predicate,pos.wrapperContained,radius,horizontalBlockCheckInterval,verticalBlockCheckInterval); }
public void collectEntitiesByType(yarnwrap.util.TypeFilter filter,java.util.function.Predicate predicate,java.util.List result) { wrapperContained.collectEntitiesByType(filter.wrapperContained,predicate,result); }
// public static void collectEntitiesByType(yarnwrap.util.TypeFilter filter,java.util.function.Predicate predicate,java.util.List result, ) { net.minecraft.server.world.ServerWorld.collectEntitiesByType(filter.wrapperContained,predicate,result); }
public void collectEntitiesByType(yarnwrap.util.TypeFilter filter,java.util.function.Predicate predicate,java.util.List result,int limit) { wrapperContained.collectEntitiesByType(filter.wrapperContained,predicate,result,limit); }
// public static void collectEntitiesByType(yarnwrap.util.TypeFilter filter,java.util.function.Predicate predicate,java.util.List result,int limit, ) { net.minecraft.server.world.ServerWorld.collectEntitiesByType(filter.wrapperContained,predicate,result,limit); }
public java.util.List getPlayers(java.util.function.Predicate predicate,int limit) { return wrapperContained.getPlayers(predicate,limit); }
// public static java.util.List getPlayers(java.util.function.Predicate predicate,int limit, ) { return net.minecraft.server.world.ServerWorld.getPlayers(predicate,limit); }
// public Object method_47541(java.util.function.Predicate entity) { return wrapperContained.method_47541(entity); }
// public static Object method_47541(java.util.function.Predicate entity, ) { return net.minecraft.server.world.ServerWorld.method_47541(entity); }
public yarnwrap.util.math.random.Random getOrCreateRandom(yarnwrap.util.Identifier id) { return new yarnwrap.util.math.random.Random(wrapperContained.getOrCreateRandom(id.wrapperContained)); }
// public static yarnwrap.util.math.random.Random getOrCreateRandom(yarnwrap.util.Identifier id, ) { return new yarnwrap.util.math.random.Random(net.minecraft.server.world.ServerWorld.getOrCreateRandom(id.wrapperContained)); }
public void setEnderDragonFight(yarnwrap.entity.boss.dragon.EnderDragonFight enderDragonFight) { wrapperContained.setEnderDragonFight(enderDragonFight.wrapperContained); }
// public static void setEnderDragonFight(yarnwrap.entity.boss.dragon.EnderDragonFight enderDragonFight, ) { net.minecraft.server.world.ServerWorld.setEnderDragonFight(enderDragonFight.wrapperContained); }
public yarnwrap.util.math.random.RandomSequencesState getRandomSequences() { return new yarnwrap.util.math.random.RandomSequencesState(wrapperContained.getRandomSequences()); }
// public static yarnwrap.util.math.random.RandomSequencesState getRandomSequences() { return new yarnwrap.util.math.random.RandomSequencesState(net.minecraft.server.world.ServerWorld.getRandomSequences()); }
public void tickIceAndSnow(yarnwrap.util.math.BlockPos pos) { wrapperContained.tickIceAndSnow(pos.wrapperContained); }
// public static void tickIceAndSnow(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.server.world.ServerWorld.tickIceAndSnow(pos.wrapperContained); }
public yarnwrap.entity.ai.pathing.PathNodeTypeCache getPathNodeTypeCache() { return new yarnwrap.entity.ai.pathing.PathNodeTypeCache(wrapperContained.getPathNodeTypeCache()); }
// public static yarnwrap.entity.ai.pathing.PathNodeTypeCache getPathNodeTypeCache() { return new yarnwrap.entity.ai.pathing.PathNodeTypeCache(net.minecraft.server.world.ServerWorld.getPathNodeTypeCache()); }
// public Object getDestructionType(Object decayRule) { return wrapperContained.getDestructionType(decayRule); }
// public static Object getDestructionType(Object decayRule, ) { return net.minecraft.server.world.ServerWorld.getDestructionType(decayRule); }
public yarnwrap.world.GameRules getGameRules() { return new yarnwrap.world.GameRules(wrapperContained.getGameRules()); }
// public static yarnwrap.world.GameRules getGameRules() { return new yarnwrap.world.GameRules(net.minecraft.server.world.ServerWorld.getGameRules()); }
// public void method_65057(yarnwrap.util.math.BlockPos player) { wrapperContained.method_65057(player.wrapperContained); }
// public static void method_65057(yarnwrap.util.math.BlockPos player, ) { net.minecraft.server.world.ServerWorld.method_65057(player.wrapperContained); }
public int spawnParticles(yarnwrap.particle.ParticleEffect parameters,double x,double y,double z,int count,double offsetX,double offsetY,double offsetZ,double speed) { return wrapperContained.spawnParticles(parameters.wrapperContained,x,y,z,count,offsetX,offsetY,offsetZ,speed); }
// public static int spawnParticles(yarnwrap.particle.ParticleEffect parameters,double x,double y,double z,int count,double offsetX,double offsetY,double offsetZ,double speed, ) { return net.minecraft.server.world.ServerWorld.spawnParticles(parameters.wrapperContained,x,y,z,count,offsetX,offsetY,offsetZ,speed); }
// public void method_66017(yarnwrap.util.math.BlockPos newPoiType) { wrapperContained.method_66017(newPoiType.wrapperContained); }
// public static void method_66017(yarnwrap.util.math.BlockPos newPoiType, ) { net.minecraft.server.world.ServerWorld.method_66017(newPoiType.wrapperContained); }
// public void method_66019(yarnwrap.util.math.BlockPos oldPoiType) { wrapperContained.method_66019(oldPoiType.wrapperContained); }
// public static void method_66019(yarnwrap.util.math.BlockPos oldPoiType, ) { net.minecraft.server.world.ServerWorld.method_66019(oldPoiType.wrapperContained); }
public boolean shouldTickTestAt(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.shouldTickTestAt(pos.wrapperContained); }
// public static boolean shouldTickTestAt(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.server.world.ServerWorld.shouldTickTestAt(pos.wrapperContained); }
public void tickThunder(yarnwrap.world.chunk.WorldChunk chunk) { wrapperContained.tickThunder(chunk.wrapperContained); }
// public static void tickThunder(yarnwrap.world.chunk.WorldChunk chunk, ) { net.minecraft.server.world.ServerWorld.tickThunder(chunk.wrapperContained); }
public boolean shouldTickChunkAt(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.shouldTickChunkAt(pos.wrapperContained); }
// public static boolean shouldTickChunkAt(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.server.world.ServerWorld.shouldTickChunkAt(pos.wrapperContained); }
public boolean canSpawnEntitiesAt(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.canSpawnEntitiesAt(pos.wrapperContained); }
// public static boolean canSpawnEntitiesAt(yarnwrap.util.math.ChunkPos pos, ) { return net.minecraft.server.world.ServerWorld.canSpawnEntitiesAt(pos.wrapperContained); }
public boolean shouldTickBlockAt(yarnwrap.util.math.BlockPos pos) { return wrapperContained.shouldTickBlockAt(pos.wrapperContained); }
// public static boolean shouldTickBlockAt(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.server.world.ServerWorld.shouldTickBlockAt(pos.wrapperContained); }
// public void onStateReplacedWithCommands(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState oldState) { wrapperContained.onStateReplacedWithCommands(pos.wrapperContained,oldState.wrapperContained); }
// public static void onStateReplacedWithCommands(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState oldState, ) { net.minecraft.server.world.ServerWorld.onStateReplacedWithCommands(pos.wrapperContained,oldState.wrapperContained); }
// public yarnwrap.server.network.ServerWaypointHandler getWaypointHandler() { return new yarnwrap.server.network.ServerWaypointHandler(wrapperContained.getWaypointHandler()); }
// public static yarnwrap.server.network.ServerWaypointHandler getWaypointHandler() { return new yarnwrap.server.network.ServerWaypointHandler(net.minecraft.server.world.ServerWorld.getWaypointHandler()); }

}