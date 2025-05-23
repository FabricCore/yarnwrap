package yarnwrap.client.world;
public class ClientWorld { public net.minecraft.client.world.ClientWorld wrapperContained; public ClientWorld(net.minecraft.client.world.ClientWorld wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.network.ClientPlayNetworkHandler networkHandler() { return new yarnwrap.client.network.ClientPlayNetworkHandler(wrapperContained.networkHandler); }
// public void networkHandler(yarnwrap.client.network.ClientPlayNetworkHandler value) { wrapperContained.networkHandler = value.wrapperContained; }
// public static yarnwrap.client.network.ClientPlayNetworkHandler networkHandler() { return new yarnwrap.client.network.ClientPlayNetworkHandler(net.minecraft.client.world.ClientWorld.networkHandler); }
// public static void networkHandler(yarnwrap.client.network.ClientPlayNetworkHandler value, ) { net.minecraft.client.world.ClientWorld.networkHandler = value.wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.world.ClientWorld.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.world.ClientWorld.client = value.wrapperContained; }

// public java.util.Map mapStates() { return wrapperContained.mapStates; }
// public void mapStates(java.util.Map value) { wrapperContained.mapStates = value; }
// public static java.util.Map mapStates() { return net.minecraft.client.world.ClientWorld.mapStates; }
// public static void mapStates(java.util.Map value, ) { net.minecraft.client.world.ClientWorld.mapStates = value; }

// public yarnwrap.client.render.WorldRenderer worldRenderer() { return new yarnwrap.client.render.WorldRenderer(wrapperContained.worldRenderer); }
// public void worldRenderer(yarnwrap.client.render.WorldRenderer value) { wrapperContained.worldRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.WorldRenderer worldRenderer() { return new yarnwrap.client.render.WorldRenderer(net.minecraft.client.world.ClientWorld.worldRenderer); }
// public static void worldRenderer(yarnwrap.client.render.WorldRenderer value, ) { net.minecraft.client.world.ClientWorld.worldRenderer = value.wrapperContained; }

// public java.util.List players() { return wrapperContained.players; }
// public void players(java.util.List value) { wrapperContained.players = value; }
// public static java.util.List players() { return net.minecraft.client.world.ClientWorld.players; }
// public static void players(java.util.List value, ) { net.minecraft.client.world.ClientWorld.players = value; }

// public int lightningTicksLeft() { return wrapperContained.lightningTicksLeft; }
// public void lightningTicksLeft(int value) { wrapperContained.lightningTicksLeft = value; }
// public static int lightningTicksLeft() { return net.minecraft.client.world.ClientWorld.lightningTicksLeft; }
// public static void lightningTicksLeft(int value, ) { net.minecraft.client.world.ClientWorld.lightningTicksLeft = value; }

// public it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap colorCache() { return wrapperContained.colorCache; }
// public void colorCache(it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap value) { wrapperContained.colorCache = value; }
// public static it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap colorCache() { return net.minecraft.client.world.ClientWorld.colorCache; }
// public static void colorCache(it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap value, ) { net.minecraft.client.world.ClientWorld.colorCache = value; }

// public Object clientWorldProperties() { return wrapperContained.clientWorldProperties; }
// // public void clientWorldProperties(Object value) { wrapperContained.clientWorldProperties = value; }
// // public static Object clientWorldProperties() { return net.minecraft.client.world.ClientWorld.clientWorldProperties; }
// // public static void clientWorldProperties(Object value, ) { net.minecraft.client.world.ClientWorld.clientWorldProperties = value; }

// public yarnwrap.client.world.ClientChunkManager chunkManager() { return new yarnwrap.client.world.ClientChunkManager(wrapperContained.chunkManager); }
// public void chunkManager(yarnwrap.client.world.ClientChunkManager value) { wrapperContained.chunkManager = value.wrapperContained; }
// public static yarnwrap.client.world.ClientChunkManager chunkManager() { return new yarnwrap.client.world.ClientChunkManager(net.minecraft.client.world.ClientWorld.chunkManager); }
// public static void chunkManager(yarnwrap.client.world.ClientChunkManager value, ) { net.minecraft.client.world.ClientWorld.chunkManager = value.wrapperContained; }

// public yarnwrap.client.render.DimensionEffects dimensionEffects() { return new yarnwrap.client.render.DimensionEffects(wrapperContained.dimensionEffects); }
// public void dimensionEffects(yarnwrap.client.render.DimensionEffects value) { wrapperContained.dimensionEffects = value.wrapperContained; }
// public static yarnwrap.client.render.DimensionEffects dimensionEffects() { return new yarnwrap.client.render.DimensionEffects(net.minecraft.client.world.ClientWorld.dimensionEffects); }
// public static void dimensionEffects(yarnwrap.client.render.DimensionEffects value, ) { net.minecraft.client.world.ClientWorld.dimensionEffects = value.wrapperContained; }

// public yarnwrap.world.EntityList entityList() { return new yarnwrap.world.EntityList(wrapperContained.entityList); }
// public void entityList(yarnwrap.world.EntityList value) { wrapperContained.entityList = value.wrapperContained; }
// public static yarnwrap.world.EntityList entityList() { return new yarnwrap.world.EntityList(net.minecraft.client.world.ClientWorld.entityList); }
// public static void entityList(yarnwrap.world.EntityList value, ) { net.minecraft.client.world.ClientWorld.entityList = value.wrapperContained; }

// public yarnwrap.world.entity.ClientEntityManager entityManager() { return new yarnwrap.world.entity.ClientEntityManager(wrapperContained.entityManager); }
// public void entityManager(yarnwrap.world.entity.ClientEntityManager value) { wrapperContained.entityManager = value.wrapperContained; }
// public static yarnwrap.world.entity.ClientEntityManager entityManager() { return new yarnwrap.world.entity.ClientEntityManager(net.minecraft.client.world.ClientWorld.entityManager); }
// public static void entityManager(yarnwrap.world.entity.ClientEntityManager value, ) { net.minecraft.client.world.ClientWorld.entityManager = value.wrapperContained; }

// public double PARTICLE_Y_OFFSET() { return wrapperContained.PARTICLE_Y_OFFSET; }
// public void PARTICLE_Y_OFFSET(double value) { wrapperContained.PARTICLE_Y_OFFSET = value; }
// public static double PARTICLE_Y_OFFSET() { return net.minecraft.client.world.ClientWorld.PARTICLE_Y_OFFSET; }
// public static void PARTICLE_Y_OFFSET(double value, ) { net.minecraft.client.world.ClientWorld.PARTICLE_Y_OFFSET = value; }

// public java.util.Deque chunkUpdaters() { return wrapperContained.chunkUpdaters; }
// public void chunkUpdaters(java.util.Deque value) { wrapperContained.chunkUpdaters = value; }
// public static java.util.Deque chunkUpdaters() { return net.minecraft.client.world.ClientWorld.chunkUpdaters; }
// public static void chunkUpdaters(java.util.Deque value, ) { net.minecraft.client.world.ClientWorld.chunkUpdaters = value; }

// public int simulationDistance() { return wrapperContained.simulationDistance; }
// public void simulationDistance(int value) { wrapperContained.simulationDistance = value; }
// public static int simulationDistance() { return net.minecraft.client.world.ClientWorld.simulationDistance; }
// public static void simulationDistance(int value, ) { net.minecraft.client.world.ClientWorld.simulationDistance = value; }

// public java.util.Set BLOCK_MARKER_ITEMS() { return wrapperContained.BLOCK_MARKER_ITEMS; }
// public void BLOCK_MARKER_ITEMS(java.util.Set value) { wrapperContained.BLOCK_MARKER_ITEMS = value; }
// public static java.util.Set BLOCK_MARKER_ITEMS() { return net.minecraft.client.world.ClientWorld.BLOCK_MARKER_ITEMS; }
// public static void BLOCK_MARKER_ITEMS(java.util.Set value, ) { net.minecraft.client.world.ClientWorld.BLOCK_MARKER_ITEMS = value; }

// public yarnwrap.client.network.PendingUpdateManager pendingUpdateManager() { return new yarnwrap.client.network.PendingUpdateManager(wrapperContained.pendingUpdateManager); }
// public void pendingUpdateManager(yarnwrap.client.network.PendingUpdateManager value) { wrapperContained.pendingUpdateManager = value.wrapperContained; }
// public static yarnwrap.client.network.PendingUpdateManager pendingUpdateManager() { return new yarnwrap.client.network.PendingUpdateManager(net.minecraft.client.world.ClientWorld.pendingUpdateManager); }
// public static void pendingUpdateManager(yarnwrap.client.network.PendingUpdateManager value, ) { net.minecraft.client.world.ClientWorld.pendingUpdateManager = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.world.ClientWorld.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.world.ClientWorld.LOGGER = value; }

// public yarnwrap.world.tick.TickManager tickManager() { return new yarnwrap.world.tick.TickManager(wrapperContained.tickManager); }
// public void tickManager(yarnwrap.world.tick.TickManager value) { wrapperContained.tickManager = value.wrapperContained; }
// public static yarnwrap.world.tick.TickManager tickManager() { return new yarnwrap.world.tick.TickManager(net.minecraft.client.world.ClientWorld.tickManager); }
// public static void tickManager(yarnwrap.world.tick.TickManager value, ) { net.minecraft.client.world.ClientWorld.tickManager = value.wrapperContained; }

// public yarnwrap.client.world.WorldEventHandler worldEventHandler() { return new yarnwrap.client.world.WorldEventHandler(wrapperContained.worldEventHandler); }
// public void worldEventHandler(yarnwrap.client.world.WorldEventHandler value) { wrapperContained.worldEventHandler = value.wrapperContained; }
// public static yarnwrap.client.world.WorldEventHandler worldEventHandler() { return new yarnwrap.client.world.WorldEventHandler(net.minecraft.client.world.ClientWorld.worldEventHandler); }
// public static void worldEventHandler(yarnwrap.client.world.WorldEventHandler value, ) { net.minecraft.client.world.ClientWorld.worldEventHandler = value.wrapperContained; }

// public int seaLevel() { return wrapperContained.seaLevel; }
// public void seaLevel(int value) { wrapperContained.seaLevel = value; }
// public static int seaLevel() { return net.minecraft.client.world.ClientWorld.seaLevel; }
// public static void seaLevel(int value, ) { net.minecraft.client.world.ClientWorld.seaLevel = value; }

// public boolean shouldTickTimeOfDay() { return wrapperContained.shouldTickTimeOfDay; }
// public void shouldTickTimeOfDay(boolean value) { wrapperContained.shouldTickTimeOfDay = value; }
// public static boolean shouldTickTimeOfDay() { return net.minecraft.client.world.ClientWorld.shouldTickTimeOfDay; }
// public static void shouldTickTimeOfDay(boolean value, ) { net.minecraft.client.world.ClientWorld.shouldTickTimeOfDay = value; }

// public java.util.List enderDragonParts() { return wrapperContained.enderDragonParts; }
// public void enderDragonParts(java.util.List value) { wrapperContained.enderDragonParts = value; }
// public static java.util.List enderDragonParts() { return net.minecraft.client.world.ClientWorld.enderDragonParts; }
// public static void enderDragonParts(java.util.List value, ) { net.minecraft.client.world.ClientWorld.enderDragonParts = value; }

// public ClientWorld(yarnwrap.client.network.ClientPlayNetworkHandler properties,Object registryRef,yarnwrap.registry.RegistryKey dimensionType,yarnwrap.registry.entry.RegistryEntry loadDistance,int simulationDistance,int worldRenderer,yarnwrap.client.render.WorldRenderer debugWorld,boolean seed,long seaLevel) { this.wrapperContained = new net.minecraft.client.world.ClientWorld(properties.wrapperContained,registryRef,dimensionType.wrapperContained,loadDistance.wrapperContained,simulationDistance,worldRenderer,debugWorld.wrapperContained,seed,seaLevel); }
// public void addParticle(double minX,double maxX,double minZ,double maxZ,double y,yarnwrap.particle.ParticleEffect parameters) { wrapperContained.addParticle(minX,maxX,minZ,maxZ,y,parameters.wrapperContained); }
// public static void addParticle(double minX,double maxX,double minZ,double maxZ,double y,yarnwrap.particle.ParticleEffect parameters, ) { net.minecraft.client.world.ClientWorld.addParticle(minX,maxX,minZ,maxZ,y,parameters.wrapperContained); }
// public void addParticle(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.particle.ParticleEffect parameters,boolean solidBelow) { wrapperContained.addParticle(pos.wrapperContained,state.wrapperContained,parameters.wrapperContained,solidBelow); }
// public static void addParticle(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.particle.ParticleEffect parameters,boolean solidBelow, ) { net.minecraft.client.world.ClientWorld.addParticle(pos.wrapperContained,state.wrapperContained,parameters.wrapperContained,solidBelow); }
public void doRandomBlockDisplayTicks(int centerX,int centerY,int centerZ) { wrapperContained.doRandomBlockDisplayTicks(centerX,centerY,centerZ); }
// public static void doRandomBlockDisplayTicks(int centerX,int centerY,int centerZ, ) { net.minecraft.client.world.ClientWorld.doRandomBlockDisplayTicks(centerX,centerY,centerZ); }
// public void randomBlockDisplayTick(int centerX,int centerY,int centerZ,int radius,yarnwrap.util.math.random.Random random,yarnwrap.block.Block block,Object pos) { wrapperContained.randomBlockDisplayTick(centerX,centerY,centerZ,radius,random.wrapperContained,block.wrapperContained,pos); }
// public static void randomBlockDisplayTick(int centerX,int centerY,int centerZ,int radius,yarnwrap.util.math.random.Random random,yarnwrap.block.Block block,Object pos, ) { net.minecraft.client.world.ClientWorld.randomBlockDisplayTick(centerX,centerY,centerZ,radius,random.wrapperContained,block.wrapperContained,pos); }
// public void removeEntity(int entityId,Object removalReason) { wrapperContained.removeEntity(entityId,removalReason); }
// public static void removeEntity(int entityId,Object removalReason, ) { net.minecraft.client.world.ClientWorld.removeEntity(entityId,removalReason); }
// public void addParticle(yarnwrap.util.math.BlockPos pos,yarnwrap.particle.ParticleEffect parameters,yarnwrap.util.shape.VoxelShape shape,double y) { wrapperContained.addParticle(pos.wrapperContained,parameters.wrapperContained,shape.wrapperContained,y); }
// public static void addParticle(yarnwrap.util.math.BlockPos pos,yarnwrap.particle.ParticleEffect parameters,yarnwrap.util.shape.VoxelShape shape,double y, ) { net.minecraft.client.world.ClientWorld.addParticle(pos.wrapperContained,parameters.wrapperContained,shape.wrapperContained,y); }
public void tick(java.util.function.BooleanSupplier shouldKeepTicking) { wrapperContained.tick(shouldKeepTicking); }
// public static void tick(java.util.function.BooleanSupplier shouldKeepTicking, ) { net.minecraft.client.world.ClientWorld.tick(shouldKeepTicking); }
public void unloadBlockEntities(yarnwrap.world.chunk.WorldChunk chunk) { wrapperContained.unloadBlockEntities(chunk.wrapperContained); }
// public static void unloadBlockEntities(yarnwrap.world.chunk.WorldChunk chunk, ) { net.minecraft.client.world.ClientWorld.unloadBlockEntities(chunk.wrapperContained); }
public java.lang.Iterable getEntities() { return wrapperContained.getEntities(); }
// public static java.lang.Iterable getEntities() { return net.minecraft.client.world.ClientWorld.getEntities(); }
public void scheduleBlockRenders(int x,int y,int z) { wrapperContained.scheduleBlockRenders(x,y,z); }
// public static void scheduleBlockRenders(int x,int y,int z, ) { net.minecraft.client.world.ClientWorld.scheduleBlockRenders(x,y,z); }
public void tickEntities() { wrapperContained.tickEntities(); }
// public static void tickEntities() { net.minecraft.client.world.ClientWorld.tickEntities(); }
public int getRegularEntityCount() { return wrapperContained.getRegularEntityCount(); }
// public static int getRegularEntityCount() { return net.minecraft.client.world.ClientWorld.getRegularEntityCount(); }
public void tickEntity(yarnwrap.entity.Entity entity) { wrapperContained.tickEntity(entity.wrapperContained); }
// public static void tickEntity(yarnwrap.entity.Entity entity, ) { net.minecraft.client.world.ClientWorld.tickEntity(entity.wrapperContained); }
// public void tickPassenger(yarnwrap.entity.Entity entity,yarnwrap.entity.Entity passenger) { wrapperContained.tickPassenger(entity.wrapperContained,passenger.wrapperContained); }
// public static void tickPassenger(yarnwrap.entity.Entity entity,yarnwrap.entity.Entity passenger, ) { net.minecraft.client.world.ClientWorld.tickPassenger(entity.wrapperContained,passenger.wrapperContained); }
public int getSkyColor(yarnwrap.util.math.Vec3d cameraPos,float tickProgress) { return wrapperContained.getSkyColor(cameraPos.wrapperContained,tickProgress); }
// public static int getSkyColor(yarnwrap.util.math.Vec3d cameraPos,float tickProgress, ) { return net.minecraft.client.world.ClientWorld.getSkyColor(cameraPos.wrapperContained,tickProgress); }
// public void method_23778(it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap map) { wrapperContained.method_23778(map); }
// public static void method_23778(it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap map, ) { net.minecraft.client.world.ClientWorld.method_23778(map); }
// public void method_23779(yarnwrap.world.biome.ColorResolver resolver,yarnwrap.client.world.BiomeColorCache cache) { wrapperContained.method_23779(resolver.wrapperContained,cache.wrapperContained); }
// public static void method_23779(yarnwrap.world.biome.ColorResolver resolver,yarnwrap.client.world.BiomeColorCache cache, ) { net.minecraft.client.world.ClientWorld.method_23779(resolver.wrapperContained,cache.wrapperContained); }
public int calculateColor(yarnwrap.util.math.BlockPos pos,yarnwrap.world.biome.ColorResolver colorResolver) { return wrapperContained.calculateColor(pos.wrapperContained,colorResolver.wrapperContained); }
// public static int calculateColor(yarnwrap.util.math.BlockPos pos,yarnwrap.world.biome.ColorResolver colorResolver, ) { return net.minecraft.client.world.ClientWorld.calculateColor(pos.wrapperContained,colorResolver.wrapperContained); }
public void resetChunkColor(yarnwrap.util.math.ChunkPos chunkPos) { wrapperContained.resetChunkColor(chunkPos.wrapperContained); }
// public static void resetChunkColor(yarnwrap.util.math.ChunkPos chunkPos, ) { net.minecraft.client.world.ClientWorld.resetChunkColor(chunkPos.wrapperContained); }
public float getSkyBrightness(float tickProgress) { return wrapperContained.getSkyBrightness(tickProgress); }
// public static float getSkyBrightness(float tickProgress, ) { return net.minecraft.client.world.ClientWorld.getSkyBrightness(tickProgress); }
public void reloadColor() { wrapperContained.reloadColor(); }
// public static void reloadColor() { net.minecraft.client.world.ClientWorld.reloadColor(); }
public int getCloudsColor(float tickProgress) { return wrapperContained.getCloudsColor(tickProgress); }
// public static int getCloudsColor(float tickProgress, ) { return net.minecraft.client.world.ClientWorld.getCloudsColor(tickProgress); }
public float getStarBrightness(float tickProgress) { return wrapperContained.getStarBrightness(tickProgress); }
// public static float getStarBrightness(float tickProgress, ) { return net.minecraft.client.world.ClientWorld.getStarBrightness(tickProgress); }
public int getLightningTicksLeft() { return wrapperContained.getLightningTicksLeft(); }
// public static int getLightningTicksLeft() { return net.minecraft.client.world.ClientWorld.getLightningTicksLeft(); }
// public void method_24462(Object config) { wrapperContained.method_24462(config); }
// public static void method_24462(Object config, ) { net.minecraft.client.world.ClientWorld.method_24462(config); }
public void setSpawnPos(yarnwrap.util.math.BlockPos pos,float angle) { wrapperContained.setSpawnPos(pos.wrapperContained,angle); }
// public static void setSpawnPos(yarnwrap.util.math.BlockPos pos,float angle, ) { net.minecraft.client.world.ClientWorld.setSpawnPos(pos.wrapperContained,angle); }
public yarnwrap.client.render.DimensionEffects getDimensionEffects() { return new yarnwrap.client.render.DimensionEffects(wrapperContained.getDimensionEffects()); }
// public static yarnwrap.client.render.DimensionEffects getDimensionEffects() { return new yarnwrap.client.render.DimensionEffects(net.minecraft.client.world.ClientWorld.getDimensionEffects()); }
public void setTime(long time,long timeOfDay,boolean shouldTickTimeOfDay) { wrapperContained.setTime(time,timeOfDay,shouldTickTimeOfDay); }
// public static void setTime(long time,long timeOfDay,boolean shouldTickTimeOfDay, ) { net.minecraft.client.world.ClientWorld.setTime(time,timeOfDay,shouldTickTimeOfDay); }
// public void tickTime() { wrapperContained.tickTime(); }
// public static void tickTime() { net.minecraft.client.world.ClientWorld.tickTime(); }
// public void method_32121(yarnwrap.util.math.ChunkPos resolver,yarnwrap.world.biome.ColorResolver cache) { wrapperContained.method_32121(resolver.wrapperContained,cache.wrapperContained); }
// public static void method_32121(yarnwrap.util.math.ChunkPos resolver,yarnwrap.world.biome.ColorResolver cache, ) { net.minecraft.client.world.ClientWorld.method_32121(resolver.wrapperContained,cache.wrapperContained); }
// public void method_32124(yarnwrap.entity.Entity entity) { wrapperContained.method_32124(entity.wrapperContained); }
// public static void method_32124(yarnwrap.entity.Entity entity, ) { net.minecraft.client.world.ClientWorld.method_32124(entity.wrapperContained); }
// public yarnwrap.util.math.Vec3d method_32689(int x,int y,int z) { return new yarnwrap.util.math.Vec3d(wrapperContained.method_32689(x,y,z)); }
// public static yarnwrap.util.math.Vec3d method_32689(int x,int y,int z, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.client.world.ClientWorld.method_32689(x,y,z)); }
// public yarnwrap.block.Block getBlockParticle() { return new yarnwrap.block.Block(wrapperContained.getBlockParticle()); }
// public static yarnwrap.block.Block getBlockParticle() { return new yarnwrap.block.Block(net.minecraft.client.world.ClientWorld.getBlockParticle()); }
// public void putMapStates(java.util.Map mapStates) { wrapperContained.putMapStates(mapStates); }
// public static void putMapStates(java.util.Map mapStates, ) { net.minecraft.client.world.ClientWorld.putMapStates(mapStates); }
// public java.util.Map getMapStates() { return wrapperContained.getMapStates(); }
// public static java.util.Map getMapStates() { return net.minecraft.client.world.ClientWorld.getMapStates(); }
public void runQueuedChunkUpdates() { wrapperContained.runQueuedChunkUpdates(); }
// public static void runQueuedChunkUpdates() { net.minecraft.client.world.ClientWorld.runQueuedChunkUpdates(); }
// public int method_38535(yarnwrap.util.math.BlockPos pos) { return wrapperContained.method_38535(pos.wrapperContained); }
// public static int method_38535(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.client.world.ClientWorld.method_38535(pos.wrapperContained); }
public void enqueueChunkUpdate(java.lang.Runnable updater) { wrapperContained.enqueueChunkUpdate(updater); }
// public static void enqueueChunkUpdate(java.lang.Runnable updater, ) { net.minecraft.client.world.ClientWorld.enqueueChunkUpdate(updater); }
// public int method_38537(yarnwrap.util.math.BlockPos pos) { return wrapperContained.method_38537(pos.wrapperContained); }
// public static int method_38537(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.client.world.ClientWorld.method_38537(pos.wrapperContained); }
// public int method_38538(yarnwrap.util.math.BlockPos pos) { return wrapperContained.method_38538(pos.wrapperContained); }
// public static int method_38538(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.client.world.ClientWorld.method_38538(pos.wrapperContained); }
public void setSimulationDistance(int simulationDistance) { wrapperContained.setSimulationDistance(simulationDistance); }
// public static void setSimulationDistance(int simulationDistance, ) { net.minecraft.client.world.ClientWorld.setSimulationDistance(simulationDistance); }
public int getSimulationDistance() { return wrapperContained.getSimulationDistance(); }
// public static int getSimulationDistance() { return net.minecraft.client.world.ClientWorld.getSimulationDistance(); }
// public yarnwrap.client.network.PendingUpdateManager getPendingUpdateManager() { return new yarnwrap.client.network.PendingUpdateManager(wrapperContained.getPendingUpdateManager()); }
// public static yarnwrap.client.network.PendingUpdateManager getPendingUpdateManager() { return new yarnwrap.client.network.PendingUpdateManager(net.minecraft.client.world.ClientWorld.getPendingUpdateManager()); }
public void processPendingUpdate(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.util.math.Vec3d playerPos) { wrapperContained.processPendingUpdate(pos.wrapperContained,state.wrapperContained,playerPos.wrapperContained); }
// public static void processPendingUpdate(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.util.math.Vec3d playerPos, ) { net.minecraft.client.world.ClientWorld.processPendingUpdate(pos.wrapperContained,state.wrapperContained,playerPos.wrapperContained); }
public void handlePlayerActionResponse(int sequence) { wrapperContained.handlePlayerActionResponse(sequence); }
// public static void handlePlayerActionResponse(int sequence, ) { net.minecraft.client.world.ClientWorld.handlePlayerActionResponse(sequence); }
public void handleBlockUpdate(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,int flags) { wrapperContained.handleBlockUpdate(pos.wrapperContained,state.wrapperContained,flags); }
// public static void handleBlockUpdate(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,int flags, ) { net.minecraft.client.world.ClientWorld.handleBlockUpdate(pos.wrapperContained,state.wrapperContained,flags); }
// public void playSound(double x,double y,double z,yarnwrap.sound.SoundEvent event,yarnwrap.sound.SoundCategory category,float volume,float pitch,boolean useDistance,long seed) { wrapperContained.playSound(x,y,z,event.wrapperContained,category.wrapperContained,volume,pitch,useDistance,seed); }
// public static void playSound(double x,double y,double z,yarnwrap.sound.SoundEvent event,yarnwrap.sound.SoundCategory category,float volume,float pitch,boolean useDistance,long seed, ) { net.minecraft.client.world.ClientWorld.playSound(x,y,z,event.wrapperContained,category.wrapperContained,volume,pitch,useDistance,seed); }
public void putClientsideMapState(yarnwrap.component.type.MapIdComponent id,yarnwrap.item.map.MapState state) { wrapperContained.putClientsideMapState(id.wrapperContained,state.wrapperContained); }
// public static void putClientsideMapState(yarnwrap.component.type.MapIdComponent id,yarnwrap.item.map.MapState state, ) { net.minecraft.client.world.ClientWorld.putClientsideMapState(id.wrapperContained,state.wrapperContained); }
public void addEntity(yarnwrap.entity.Entity entity) { wrapperContained.addEntity(entity.wrapperContained); }
// public static void addEntity(yarnwrap.entity.Entity entity, ) { net.minecraft.client.world.ClientWorld.addEntity(entity.wrapperContained); }
public boolean hasEntity(yarnwrap.entity.Entity entity) { return wrapperContained.hasEntity(entity.wrapperContained); }
// public static boolean hasEntity(yarnwrap.entity.Entity entity, ) { return net.minecraft.client.world.ClientWorld.hasEntity(entity.wrapperContained); }
public void scheduleChunkRenders(int minX,int minY,int minZ,int maxX,int maxY,int maxZ) { wrapperContained.scheduleChunkRenders(minX,minY,minZ,maxX,maxY,maxZ); }
// public static void scheduleChunkRenders(int minX,int minY,int minZ,int maxX,int maxY,int maxZ, ) { net.minecraft.client.world.ClientWorld.scheduleChunkRenders(minX,minY,minZ,maxX,maxY,maxZ); }
public void onChunkUnload(long sectionPos) { wrapperContained.onChunkUnload(sectionPos); }
// public static void onChunkUnload(long sectionPos, ) { net.minecraft.client.world.ClientWorld.onChunkUnload(sectionPos); }
// public int method_68160(yarnwrap.util.math.BlockPos pos) { return wrapperContained.method_68160(pos.wrapperContained); }
// public static int method_68160(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.client.world.ClientWorld.method_68160(pos.wrapperContained); }

}