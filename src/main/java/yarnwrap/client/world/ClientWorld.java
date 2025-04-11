package yarnwrap.client.world;
public class ClientWorld { public net.minecraft.client.world.ClientWorld wrapperContained; public ClientWorld(net.minecraft.client.world.ClientWorld wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map mapStates() { return wrapperContained.mapStates; }
// public void mapStates(java.util.Map value) { wrapperContained.mapStates = value; }
// public yarnwrap.client.render.WorldRenderer worldRenderer() { return new yarnwrap.client.render.WorldRenderer(wrapperContained.worldRenderer); }
// public void worldRenderer(yarnwrap.client.render.WorldRenderer value) { wrapperContained.worldRenderer = value.wrapperContained; }
// public java.util.List players() { return wrapperContained.players; }
// public void players(java.util.List value) { wrapperContained.players = value; }
// public int lightningTicksLeft() { return wrapperContained.lightningTicksLeft; }
// public void lightningTicksLeft(int value) { wrapperContained.lightningTicksLeft = value; }
// public it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap colorCache() { return wrapperContained.colorCache; }
// public void colorCache(it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap value) { wrapperContained.colorCache = value; }
// public Object clientWorldProperties() { return wrapperContained.clientWorldProperties; }
// // public void clientWorldProperties(Object value) { wrapperContained.clientWorldProperties = value; }
// public yarnwrap.client.world.ClientChunkManager chunkManager() { return new yarnwrap.client.world.ClientChunkManager(wrapperContained.chunkManager); }
// public void chunkManager(yarnwrap.client.world.ClientChunkManager value) { wrapperContained.chunkManager = value.wrapperContained; }
// public yarnwrap.client.render.DimensionEffects dimensionEffects() { return new yarnwrap.client.render.DimensionEffects(wrapperContained.dimensionEffects); }
// public void dimensionEffects(yarnwrap.client.render.DimensionEffects value) { wrapperContained.dimensionEffects = value.wrapperContained; }
// public yarnwrap.world.EntityList entityList() { return new yarnwrap.world.EntityList(wrapperContained.entityList); }
// public void entityList(yarnwrap.world.EntityList value) { wrapperContained.entityList = value.wrapperContained; }
// public yarnwrap.world.entity.ClientEntityManager entityManager() { return new yarnwrap.world.entity.ClientEntityManager(wrapperContained.entityManager); }
// public void entityManager(yarnwrap.world.entity.ClientEntityManager value) { wrapperContained.entityManager = value.wrapperContained; }
// public double PARTICLE_Y_OFFSET() { return wrapperContained.PARTICLE_Y_OFFSET; }
// public void PARTICLE_Y_OFFSET(double value) { wrapperContained.PARTICLE_Y_OFFSET = value; }
// public java.util.Deque chunkUpdaters() { return wrapperContained.chunkUpdaters; }
// public void chunkUpdaters(java.util.Deque value) { wrapperContained.chunkUpdaters = value; }
// public int simulationDistance() { return wrapperContained.simulationDistance; }
// public void simulationDistance(int value) { wrapperContained.simulationDistance = value; }
// public java.util.Set BLOCK_MARKER_ITEMS() { return wrapperContained.BLOCK_MARKER_ITEMS; }
// public void BLOCK_MARKER_ITEMS(java.util.Set value) { wrapperContained.BLOCK_MARKER_ITEMS = value; }
// public yarnwrap.client.network.ClientPlayNetworkHandler networkHandler() { return new yarnwrap.client.network.ClientPlayNetworkHandler(wrapperContained.networkHandler); }
// public void networkHandler(yarnwrap.client.network.ClientPlayNetworkHandler value) { wrapperContained.networkHandler = value.wrapperContained; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public yarnwrap.client.network.PendingUpdateManager pendingUpdateManager() { return new yarnwrap.client.network.PendingUpdateManager(wrapperContained.pendingUpdateManager); }
// public void pendingUpdateManager(yarnwrap.client.network.PendingUpdateManager value) { wrapperContained.pendingUpdateManager = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.world.tick.TickManager tickManager() { return new yarnwrap.world.tick.TickManager(wrapperContained.tickManager); }
// public void tickManager(yarnwrap.world.tick.TickManager value) { wrapperContained.tickManager = value.wrapperContained; }
// public ClientWorld(yarnwrap.client.network.ClientPlayNetworkHandler networkHandler,Object properties,yarnwrap.registry.RegistryKey registryRef,yarnwrap.registry.entry.RegistryEntry dimensionTypeEntry,int loadDistance,int simulationDistance,java.util.function.Supplier profiler,yarnwrap.client.render.WorldRenderer worldRenderer,boolean debugWorld,long seed) { this.wrapperContained = new net.minecraft.client.world.ClientWorld(networkHandler.wrapperContained,properties,registryRef.wrapperContained,dimensionTypeEntry.wrapperContained,loadDistance,simulationDistance,profiler,worldRenderer.wrapperContained,debugWorld,seed); }
public void unloadBlockEntities(yarnwrap.world.chunk.WorldChunk chunk) { wrapperContained.unloadBlockEntities(chunk.wrapperContained); }
public java.lang.Iterable getEntities() { return wrapperContained.getEntities(); }
public void scheduleBlockRenders(int x,int y,int z) { wrapperContained.scheduleBlockRenders(x,y,z); }
public void tickEntities() { wrapperContained.tickEntities(); }
public int getRegularEntityCount() { return wrapperContained.getRegularEntityCount(); }
public void tickEntity(yarnwrap.entity.Entity entity) { wrapperContained.tickEntity(entity.wrapperContained); }
// public void tickPassenger(yarnwrap.entity.Entity entity,yarnwrap.entity.Entity passenger) { wrapperContained.tickPassenger(entity.wrapperContained,passenger.wrapperContained); }
public yarnwrap.util.math.Vec3d getSkyColor(yarnwrap.util.math.Vec3d cameraPos,float tickDelta) { return new yarnwrap.util.math.Vec3d(wrapperContained.getSkyColor(cameraPos.wrapperContained,tickDelta)); }
// public void method_23778(it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap map) { wrapperContained.method_23778(map); }
// public void method_23779(yarnwrap.world.biome.ColorResolver resolver,yarnwrap.client.world.BiomeColorCache cache) { wrapperContained.method_23779(resolver.wrapperContained,cache.wrapperContained); }
public int calculateColor(yarnwrap.util.math.BlockPos pos,yarnwrap.world.biome.ColorResolver colorResolver) { return wrapperContained.calculateColor(pos.wrapperContained,colorResolver.wrapperContained); }
public void resetChunkColor(yarnwrap.util.math.ChunkPos chunkPos) { wrapperContained.resetChunkColor(chunkPos.wrapperContained); }
public float getSkyBrightness(float tickDelta) { return wrapperContained.getSkyBrightness(tickDelta); }
public void reloadColor() { wrapperContained.reloadColor(); }
public yarnwrap.util.math.Vec3d getCloudsColor(float tickDelta) { return new yarnwrap.util.math.Vec3d(wrapperContained.getCloudsColor(tickDelta)); }
public float getStarBrightness(float tickDelta) { return wrapperContained.getStarBrightness(tickDelta); }
public int getLightningTicksLeft() { return wrapperContained.getLightningTicksLeft(); }
// public void method_24462(Object config) { wrapperContained.method_24462(config); }
public void setSpawnPos(yarnwrap.util.math.BlockPos pos,float angle) { wrapperContained.setSpawnPos(pos.wrapperContained,angle); }
public yarnwrap.client.render.DimensionEffects getDimensionEffects() { return new yarnwrap.client.render.DimensionEffects(wrapperContained.getDimensionEffects()); }
public void setTime(long time) { wrapperContained.setTime(time); }
// public void tickTime() { wrapperContained.tickTime(); }
// public void addParticle(double minX,double maxX,double minZ,double maxZ,double y,yarnwrap.particle.ParticleEffect parameters) { wrapperContained.addParticle(minX,maxX,minZ,maxZ,y,parameters.wrapperContained); }
// public void addParticle(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.particle.ParticleEffect parameters,boolean solidBelow) { wrapperContained.addParticle(pos.wrapperContained,state.wrapperContained,parameters.wrapperContained,solidBelow); }
public void doRandomBlockDisplayTicks(int centerX,int centerY,int centerZ) { wrapperContained.doRandomBlockDisplayTicks(centerX,centerY,centerZ); }
// public void randomBlockDisplayTick(int centerX,int centerY,int centerZ,int radius,yarnwrap.util.math.random.Random random,yarnwrap.block.Block block,Object pos) { wrapperContained.randomBlockDisplayTick(centerX,centerY,centerZ,radius,random.wrapperContained,block.wrapperContained,pos); }
// public void removeEntity(int entityId,Object removalReason) { wrapperContained.removeEntity(entityId,removalReason); }
// public void addParticle(yarnwrap.util.math.BlockPos pos,yarnwrap.particle.ParticleEffect parameters,yarnwrap.util.shape.VoxelShape shape,double y) { wrapperContained.addParticle(pos.wrapperContained,parameters.wrapperContained,shape.wrapperContained,y); }
// public void method_32121(yarnwrap.util.math.ChunkPos resolver,yarnwrap.world.biome.ColorResolver cache) { wrapperContained.method_32121(resolver.wrapperContained,cache.wrapperContained); }
// public void method_32124(yarnwrap.entity.Entity entity) { wrapperContained.method_32124(entity.wrapperContained); }
// public yarnwrap.util.math.Vec3d method_32689(yarnwrap.world.biome.source.BiomeAccess x,int y,int z) { return new yarnwrap.util.math.Vec3d(wrapperContained.method_32689(x.wrapperContained,y,z)); }
// public yarnwrap.block.Block getBlockParticle() { return new yarnwrap.block.Block(wrapperContained.getBlockParticle()); }
// public void putMapStates(java.util.Map mapStates) { wrapperContained.putMapStates(mapStates); }
// public java.util.Map getMapStates() { return wrapperContained.getMapStates(); }
public void runQueuedChunkUpdates() { wrapperContained.runQueuedChunkUpdates(); }
// public int method_38535(yarnwrap.util.math.BlockPos pos) { return wrapperContained.method_38535(pos.wrapperContained); }
public void enqueueChunkUpdate(java.lang.Runnable updater) { wrapperContained.enqueueChunkUpdate(updater); }
// public int method_38537(yarnwrap.util.math.BlockPos pos) { return wrapperContained.method_38537(pos.wrapperContained); }
// public int method_38538(yarnwrap.util.math.BlockPos pos) { return wrapperContained.method_38538(pos.wrapperContained); }
public boolean hasNoChunkUpdaters() { return wrapperContained.hasNoChunkUpdaters(); }
public void setSimulationDistance(int simulationDistance) { wrapperContained.setSimulationDistance(simulationDistance); }
public int getSimulationDistance() { return wrapperContained.getSimulationDistance(); }
// public yarnwrap.client.network.PendingUpdateManager getPendingUpdateManager() { return new yarnwrap.client.network.PendingUpdateManager(wrapperContained.getPendingUpdateManager()); }
public void processPendingUpdate(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.util.math.Vec3d playerPos) { wrapperContained.processPendingUpdate(pos.wrapperContained,state.wrapperContained,playerPos.wrapperContained); }
public void handlePlayerActionResponse(int sequence) { wrapperContained.handlePlayerActionResponse(sequence); }
public void handleBlockUpdate(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,int flags) { wrapperContained.handleBlockUpdate(pos.wrapperContained,state.wrapperContained,flags); }
// public void playSound(double x,double y,double z,yarnwrap.sound.SoundEvent event,yarnwrap.sound.SoundCategory category,float volume,float pitch,boolean useDistance,long seed) { wrapperContained.playSound(x,y,z,event.wrapperContained,category.wrapperContained,volume,pitch,useDistance,seed); }
public void putClientsideMapState(yarnwrap.component.type.MapIdComponent id,yarnwrap.item.map.MapState state) { wrapperContained.putClientsideMapState(id.wrapperContained,state.wrapperContained); }
public void addEntity(yarnwrap.entity.Entity entity) { wrapperContained.addEntity(entity.wrapperContained); }
public void setTimeOfDay(long timeOfDay) { wrapperContained.setTimeOfDay(timeOfDay); }
public void tick(java.util.function.BooleanSupplier shouldKeepTicking) { wrapperContained.tick(shouldKeepTicking); }

}