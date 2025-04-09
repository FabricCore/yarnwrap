package yarnwrap.client.world;
public class ClientWorld { public net.minecraft.client.world.ClientWorld wrapperContained; public ClientWorld(net.minecraft.client.world.ClientWorld wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map mapStates() { return wrapperContained.mapStates; }
// public yarnwrap.client.render.WorldRenderer worldRenderer() { return new yarnwrap.client.render.WorldRenderer(wrapperContained.worldRenderer); }
// public java.util.List players() { return wrapperContained.players; }
// public int lightningTicksLeft() { return wrapperContained.lightningTicksLeft; }
// public it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap colorCache() { return wrapperContained.colorCache; }
// public Object clientWorldProperties() { return wrapperContained.clientWorldProperties; }
// public yarnwrap.client.world.ClientChunkManager chunkManager() { return new yarnwrap.client.world.ClientChunkManager(wrapperContained.chunkManager); }
// public yarnwrap.client.render.DimensionEffects dimensionEffects() { return new yarnwrap.client.render.DimensionEffects(wrapperContained.dimensionEffects); }
// public yarnwrap.world.EntityList entityList() { return new yarnwrap.world.EntityList(wrapperContained.entityList); }
// public yarnwrap.world.entity.ClientEntityManager entityManager() { return new yarnwrap.world.entity.ClientEntityManager(wrapperContained.entityManager); }
// public double PARTICLE_Y_OFFSET() { return wrapperContained.PARTICLE_Y_OFFSET; }
// public java.util.Deque chunkUpdaters() { return wrapperContained.chunkUpdaters; }
// public int simulationDistance() { return wrapperContained.simulationDistance; }
// public java.util.Set BLOCK_MARKER_ITEMS() { return wrapperContained.BLOCK_MARKER_ITEMS; }
// public yarnwrap.client.network.ClientPlayNetworkHandler networkHandler() { return new yarnwrap.client.network.ClientPlayNetworkHandler(wrapperContained.networkHandler); }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public yarnwrap.client.network.PendingUpdateManager pendingUpdateManager() { return new yarnwrap.client.network.PendingUpdateManager(wrapperContained.pendingUpdateManager); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.world.tick.TickManager tickManager() { return new yarnwrap.world.tick.TickManager(wrapperContained.tickManager); }
public void unloadBlockEntities(yarnwrap.world.chunk.WorldChunk chunk) { wrapperContained.unloadBlockEntities(chunk.wrapperContained); }
public java.lang.Iterable getEntities() { return wrapperContained.getEntities(); }
public void scheduleBlockRenders(int x,int y,int z) { wrapperContained.scheduleBlockRenders(x,y,z); }
public void tickEntities() { wrapperContained.tickEntities(); }
public int getRegularEntityCount() { return wrapperContained.getRegularEntityCount(); }
public void tickEntity(yarnwrap.entity.Entity entity) { wrapperContained.tickEntity(entity.wrapperContained); }
// public void tickPassenger(yarnwrap.entity.Entity entity,yarnwrap.entity.Entity passenger) { wrapperContained.tickPassenger(entity.wrapperContained,passenger.wrapperContained); }
public yarnwrap.util.math.Vec3d getSkyColor(yarnwrap.util.math.Vec3d cameraPos,float tickDelta) { return new yarnwrap.util.math.Vec3d(wrapperContained.getSkyColor(cameraPos.wrapperContained,tickDelta)); }
public int calculateColor(yarnwrap.util.math.BlockPos pos,yarnwrap.world.biome.ColorResolver colorResolver) { return wrapperContained.calculateColor(pos.wrapperContained,colorResolver.wrapperContained); }
public void resetChunkColor(yarnwrap.util.math.ChunkPos chunkPos) { wrapperContained.resetChunkColor(chunkPos.wrapperContained); }
public float getSkyBrightness(float tickDelta) { return wrapperContained.getSkyBrightness(tickDelta); }
public void reloadColor() { wrapperContained.reloadColor(); }
public yarnwrap.util.math.Vec3d getCloudsColor(float tickDelta) { return new yarnwrap.util.math.Vec3d(wrapperContained.getCloudsColor(tickDelta)); }
public float getStarBrightness(float tickDelta) { return wrapperContained.getStarBrightness(tickDelta); }
public int getLightningTicksLeft() { return wrapperContained.getLightningTicksLeft(); }
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
// public yarnwrap.block.Block getBlockParticle() { return new yarnwrap.block.Block(wrapperContained.getBlockParticle()); }
// public void putMapStates(java.util.Map mapStates) { wrapperContained.putMapStates(mapStates); }
// public java.util.Map getMapStates() { return wrapperContained.getMapStates(); }
public void runQueuedChunkUpdates() { wrapperContained.runQueuedChunkUpdates(); }
public void enqueueChunkUpdate(java.lang.Runnable updater) { wrapperContained.enqueueChunkUpdate(updater); }
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