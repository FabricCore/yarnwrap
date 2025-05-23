package yarnwrap.client.render;
public class WorldRenderer { public net.minecraft.client.render.WorldRenderer wrapperContained; public WorldRenderer(net.minecraft.client.render.WorldRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.Frustum capturedFrustum() { return new yarnwrap.client.render.Frustum(wrapperContained.capturedFrustum); }
// public void capturedFrustum(yarnwrap.client.render.Frustum value) { wrapperContained.capturedFrustum = value.wrapperContained; }
// public static yarnwrap.client.render.Frustum capturedFrustum() { return new yarnwrap.client.render.Frustum(net.minecraft.client.render.WorldRenderer.capturedFrustum); }
// public static void capturedFrustum(yarnwrap.client.render.Frustum value, ) { net.minecraft.client.render.WorldRenderer.capturedFrustum = value.wrapperContained; }

// public it.unimi.dsi.fastutil.ints.Int2ObjectMap blockBreakingInfos() { return wrapperContained.blockBreakingInfos; }
// public void blockBreakingInfos(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.blockBreakingInfos = value; }
// public static it.unimi.dsi.fastutil.ints.Int2ObjectMap blockBreakingInfos() { return net.minecraft.client.render.WorldRenderer.blockBreakingInfos; }
// public static void blockBreakingInfos(it.unimi.dsi.fastutil.ints.Int2ObjectMap value, ) { net.minecraft.client.render.WorldRenderer.blockBreakingInfos = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.render.WorldRenderer.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.render.WorldRenderer.LOGGER = value; }

// public int viewDistance() { return wrapperContained.viewDistance; }
// public void viewDistance(int value) { wrapperContained.viewDistance = value; }
// public static int viewDistance() { return net.minecraft.client.render.WorldRenderer.viewDistance; }
// public static void viewDistance(int value, ) { net.minecraft.client.render.WorldRenderer.viewDistance = value; }

// public double lastCameraYaw() { return wrapperContained.lastCameraYaw; }
// public void lastCameraYaw(double value) { wrapperContained.lastCameraYaw = value; }
// public static double lastCameraYaw() { return net.minecraft.client.render.WorldRenderer.lastCameraYaw; }
// public static void lastCameraYaw(double value, ) { net.minecraft.client.render.WorldRenderer.lastCameraYaw = value; }

// public double lastCameraX() { return wrapperContained.lastCameraX; }
// public void lastCameraX(double value) { wrapperContained.lastCameraX = value; }
// public static double lastCameraX() { return net.minecraft.client.render.WorldRenderer.lastCameraX; }
// public static void lastCameraX(double value, ) { net.minecraft.client.render.WorldRenderer.lastCameraX = value; }

// public int ticks() { return wrapperContained.ticks; }
// public void ticks(int value) { wrapperContained.ticks = value; }
// public static int ticks() { return net.minecraft.client.render.WorldRenderer.ticks; }
// public static void ticks(int value, ) { net.minecraft.client.render.WorldRenderer.ticks = value; }

// public double lastCameraY() { return wrapperContained.lastCameraY; }
// public void lastCameraY(double value) { wrapperContained.lastCameraY = value; }
// public static double lastCameraY() { return net.minecraft.client.render.WorldRenderer.lastCameraY; }
// public static void lastCameraY(double value, ) { net.minecraft.client.render.WorldRenderer.lastCameraY = value; }

// public int cameraChunkX() { return wrapperContained.cameraChunkX; }
// public void cameraChunkX(int value) { wrapperContained.cameraChunkX = value; }
// public static int cameraChunkX() { return net.minecraft.client.render.WorldRenderer.cameraChunkX; }
// public static void cameraChunkX(int value, ) { net.minecraft.client.render.WorldRenderer.cameraChunkX = value; }

// public yarnwrap.client.world.ClientWorld world() { return new yarnwrap.client.world.ClientWorld(wrapperContained.world); }
// public void world(yarnwrap.client.world.ClientWorld value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.client.world.ClientWorld world() { return new yarnwrap.client.world.ClientWorld(net.minecraft.client.render.WorldRenderer.world); }
// public static void world(yarnwrap.client.world.ClientWorld value, ) { net.minecraft.client.render.WorldRenderer.world = value.wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.render.WorldRenderer.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.render.WorldRenderer.client = value.wrapperContained; }

// public boolean shouldCaptureFrustum() { return wrapperContained.shouldCaptureFrustum; }
// public void shouldCaptureFrustum(boolean value) { wrapperContained.shouldCaptureFrustum = value; }
// public static boolean shouldCaptureFrustum() { return net.minecraft.client.render.WorldRenderer.shouldCaptureFrustum; }
// public static void shouldCaptureFrustum(boolean value, ) { net.minecraft.client.render.WorldRenderer.shouldCaptureFrustum = value; }

// public double lastCameraZ() { return wrapperContained.lastCameraZ; }
// public void lastCameraZ(double value) { wrapperContained.lastCameraZ = value; }
// public static double lastCameraZ() { return net.minecraft.client.render.WorldRenderer.lastCameraZ; }
// public static void lastCameraZ(double value, ) { net.minecraft.client.render.WorldRenderer.lastCameraZ = value; }

// public int cameraChunkY() { return wrapperContained.cameraChunkY; }
// public void cameraChunkY(int value) { wrapperContained.cameraChunkY = value; }
// public static int cameraChunkY() { return net.minecraft.client.render.WorldRenderer.cameraChunkY; }
// public static void cameraChunkY(int value, ) { net.minecraft.client.render.WorldRenderer.cameraChunkY = value; }

// public yarnwrap.client.render.entity.EntityRenderDispatcher entityRenderDispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(wrapperContained.entityRenderDispatcher); }
// public void entityRenderDispatcher(yarnwrap.client.render.entity.EntityRenderDispatcher value) { wrapperContained.entityRenderDispatcher = value.wrapperContained; }
// public static yarnwrap.client.render.entity.EntityRenderDispatcher entityRenderDispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(net.minecraft.client.render.WorldRenderer.entityRenderDispatcher); }
// public static void entityRenderDispatcher(yarnwrap.client.render.entity.EntityRenderDispatcher value, ) { net.minecraft.client.render.WorldRenderer.entityRenderDispatcher = value.wrapperContained; }

// public yarnwrap.client.render.BuiltChunkStorage chunks() { return new yarnwrap.client.render.BuiltChunkStorage(wrapperContained.chunks); }
// public void chunks(yarnwrap.client.render.BuiltChunkStorage value) { wrapperContained.chunks = value.wrapperContained; }
// public static yarnwrap.client.render.BuiltChunkStorage chunks() { return new yarnwrap.client.render.BuiltChunkStorage(net.minecraft.client.render.WorldRenderer.chunks); }
// public static void chunks(yarnwrap.client.render.BuiltChunkStorage value, ) { net.minecraft.client.render.WorldRenderer.chunks = value.wrapperContained; }

// public double lastCameraPitch() { return wrapperContained.lastCameraPitch; }
// public void lastCameraPitch(double value) { wrapperContained.lastCameraPitch = value; }
// public static double lastCameraPitch() { return net.minecraft.client.render.WorldRenderer.lastCameraPitch; }
// public static void lastCameraPitch(double value, ) { net.minecraft.client.render.WorldRenderer.lastCameraPitch = value; }

// public int cameraChunkZ() { return wrapperContained.cameraChunkZ; }
// public void cameraChunkZ(int value) { wrapperContained.cameraChunkZ = value; }
// public static int cameraChunkZ() { return net.minecraft.client.render.WorldRenderer.cameraChunkZ; }
// public static void cameraChunkZ(int value, ) { net.minecraft.client.render.WorldRenderer.cameraChunkZ = value; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectMap blockBreakingProgressions() { return wrapperContained.blockBreakingProgressions; }
// public void blockBreakingProgressions(it.unimi.dsi.fastutil.longs.Long2ObjectMap value) { wrapperContained.blockBreakingProgressions = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectMap blockBreakingProgressions() { return net.minecraft.client.render.WorldRenderer.blockBreakingProgressions; }
// public static void blockBreakingProgressions(it.unimi.dsi.fastutil.longs.Long2ObjectMap value, ) { net.minecraft.client.render.WorldRenderer.blockBreakingProgressions = value; }

// public yarnwrap.client.render.BufferBuilderStorage bufferBuilders() { return new yarnwrap.client.render.BufferBuilderStorage(wrapperContained.bufferBuilders); }
// public void bufferBuilders(yarnwrap.client.render.BufferBuilderStorage value) { wrapperContained.bufferBuilders = value.wrapperContained; }
// public static yarnwrap.client.render.BufferBuilderStorage bufferBuilders() { return new yarnwrap.client.render.BufferBuilderStorage(net.minecraft.client.render.WorldRenderer.bufferBuilders); }
// public static void bufferBuilders(yarnwrap.client.render.BufferBuilderStorage value, ) { net.minecraft.client.render.WorldRenderer.bufferBuilders = value.wrapperContained; }

// public yarnwrap.client.render.Frustum frustum() { return new yarnwrap.client.render.Frustum(wrapperContained.frustum); }
// public void frustum(yarnwrap.client.render.Frustum value) { wrapperContained.frustum = value.wrapperContained; }
// public static yarnwrap.client.render.Frustum frustum() { return new yarnwrap.client.render.Frustum(net.minecraft.client.render.WorldRenderer.frustum); }
// public static void frustum(yarnwrap.client.render.Frustum value, ) { net.minecraft.client.render.WorldRenderer.frustum = value.wrapperContained; }

// public yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher blockEntityRenderDispatcher() { return new yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher(wrapperContained.blockEntityRenderDispatcher); }
// public void blockEntityRenderDispatcher(yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher value) { wrapperContained.blockEntityRenderDispatcher = value.wrapperContained; }
// public static yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher blockEntityRenderDispatcher() { return new yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher(net.minecraft.client.render.WorldRenderer.blockEntityRenderDispatcher); }
// public static void blockEntityRenderDispatcher(yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher value, ) { net.minecraft.client.render.WorldRenderer.blockEntityRenderDispatcher = value.wrapperContained; }

// public yarnwrap.client.render.chunk.ChunkBuilder chunkBuilder() { return new yarnwrap.client.render.chunk.ChunkBuilder(wrapperContained.chunkBuilder); }
// public void chunkBuilder(yarnwrap.client.render.chunk.ChunkBuilder value) { wrapperContained.chunkBuilder = value.wrapperContained; }
// public static yarnwrap.client.render.chunk.ChunkBuilder chunkBuilder() { return new yarnwrap.client.render.chunk.ChunkBuilder(net.minecraft.client.render.WorldRenderer.chunkBuilder); }
// public static void chunkBuilder(yarnwrap.client.render.chunk.ChunkBuilder value, ) { net.minecraft.client.render.WorldRenderer.chunkBuilder = value.wrapperContained; }

// public yarnwrap.client.render.ChunkRenderingDataPreparer chunkRenderingDataPreparer() { return new yarnwrap.client.render.ChunkRenderingDataPreparer(wrapperContained.chunkRenderingDataPreparer); }
// public void chunkRenderingDataPreparer(yarnwrap.client.render.ChunkRenderingDataPreparer value) { wrapperContained.chunkRenderingDataPreparer = value.wrapperContained; }
// public static yarnwrap.client.render.ChunkRenderingDataPreparer chunkRenderingDataPreparer() { return new yarnwrap.client.render.ChunkRenderingDataPreparer(net.minecraft.client.render.WorldRenderer.chunkRenderingDataPreparer); }
// public static void chunkRenderingDataPreparer(yarnwrap.client.render.ChunkRenderingDataPreparer value, ) { net.minecraft.client.render.WorldRenderer.chunkRenderingDataPreparer = value.wrapperContained; }

// public it.unimi.dsi.fastutil.objects.ObjectArrayList builtChunks() { return wrapperContained.builtChunks; }
// public void builtChunks(it.unimi.dsi.fastutil.objects.ObjectArrayList value) { wrapperContained.builtChunks = value; }
// public static it.unimi.dsi.fastutil.objects.ObjectArrayList builtChunks() { return net.minecraft.client.render.WorldRenderer.builtChunks; }
// public static void builtChunks(it.unimi.dsi.fastutil.objects.ObjectArrayList value, ) { net.minecraft.client.render.WorldRenderer.builtChunks = value; }

// public java.util.List renderedEntities() { return wrapperContained.renderedEntities; }
// public void renderedEntities(java.util.List value) { wrapperContained.renderedEntities = value; }
// public static java.util.List renderedEntities() { return net.minecraft.client.render.WorldRenderer.renderedEntities; }
// public static void renderedEntities(java.util.List value, ) { net.minecraft.client.render.WorldRenderer.renderedEntities = value; }

// public int renderedEntitiesCount() { return wrapperContained.renderedEntitiesCount; }
// public void renderedEntitiesCount(int value) { wrapperContained.renderedEntitiesCount = value; }
// public static int renderedEntitiesCount() { return net.minecraft.client.render.WorldRenderer.renderedEntitiesCount; }
// public static void renderedEntitiesCount(int value, ) { net.minecraft.client.render.WorldRenderer.renderedEntitiesCount = value; }

// public yarnwrap.client.render.SkyRendering skyRendering() { return new yarnwrap.client.render.SkyRendering(wrapperContained.skyRendering); }
// public void skyRendering(yarnwrap.client.render.SkyRendering value) { wrapperContained.skyRendering = value.wrapperContained; }
// public static yarnwrap.client.render.SkyRendering skyRendering() { return new yarnwrap.client.render.SkyRendering(net.minecraft.client.render.WorldRenderer.skyRendering); }
// public static void skyRendering(yarnwrap.client.render.SkyRendering value, ) { net.minecraft.client.render.WorldRenderer.skyRendering = value.wrapperContained; }

// public yarnwrap.client.render.CloudRenderer cloudRenderer() { return new yarnwrap.client.render.CloudRenderer(wrapperContained.cloudRenderer); }
// public void cloudRenderer(yarnwrap.client.render.CloudRenderer value) { wrapperContained.cloudRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.CloudRenderer cloudRenderer() { return new yarnwrap.client.render.CloudRenderer(net.minecraft.client.render.WorldRenderer.cloudRenderer); }
// public static void cloudRenderer(yarnwrap.client.render.CloudRenderer value, ) { net.minecraft.client.render.WorldRenderer.cloudRenderer = value.wrapperContained; }

// public yarnwrap.client.render.WorldBorderRendering worldBorderRendering() { return new yarnwrap.client.render.WorldBorderRendering(wrapperContained.worldBorderRendering); }
// public void worldBorderRendering(yarnwrap.client.render.WorldBorderRendering value) { wrapperContained.worldBorderRendering = value.wrapperContained; }
// public static yarnwrap.client.render.WorldBorderRendering worldBorderRendering() { return new yarnwrap.client.render.WorldBorderRendering(net.minecraft.client.render.WorldRenderer.worldBorderRendering); }
// public static void worldBorderRendering(yarnwrap.client.render.WorldBorderRendering value, ) { net.minecraft.client.render.WorldRenderer.worldBorderRendering = value.wrapperContained; }

// public yarnwrap.client.render.WeatherRendering weatherRendering() { return new yarnwrap.client.render.WeatherRendering(wrapperContained.weatherRendering); }
// public void weatherRendering(yarnwrap.client.render.WeatherRendering value) { wrapperContained.weatherRendering = value.wrapperContained; }
// public static yarnwrap.client.render.WeatherRendering weatherRendering() { return new yarnwrap.client.render.WeatherRendering(net.minecraft.client.render.WorldRenderer.weatherRendering); }
// public static void weatherRendering(yarnwrap.client.render.WeatherRendering value, ) { net.minecraft.client.render.WorldRenderer.weatherRendering = value.wrapperContained; }

// public yarnwrap.client.gl.Framebuffer entityOutlineFramebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.entityOutlineFramebuffer); }
// public void entityOutlineFramebuffer(yarnwrap.client.gl.Framebuffer value) { wrapperContained.entityOutlineFramebuffer = value.wrapperContained; }
// public static yarnwrap.client.gl.Framebuffer entityOutlineFramebuffer() { return new yarnwrap.client.gl.Framebuffer(net.minecraft.client.render.WorldRenderer.entityOutlineFramebuffer); }
// public static void entityOutlineFramebuffer(yarnwrap.client.gl.Framebuffer value, ) { net.minecraft.client.render.WorldRenderer.entityOutlineFramebuffer = value.wrapperContained; }

// public yarnwrap.client.render.DefaultFramebufferSet framebufferSet() { return new yarnwrap.client.render.DefaultFramebufferSet(wrapperContained.framebufferSet); }
// public void framebufferSet(yarnwrap.client.render.DefaultFramebufferSet value) { wrapperContained.framebufferSet = value.wrapperContained; }
// public static yarnwrap.client.render.DefaultFramebufferSet framebufferSet() { return new yarnwrap.client.render.DefaultFramebufferSet(net.minecraft.client.render.WorldRenderer.framebufferSet); }
// public static void framebufferSet(yarnwrap.client.render.DefaultFramebufferSet value, ) { net.minecraft.client.render.WorldRenderer.framebufferSet = value.wrapperContained; }

// public yarnwrap.util.Identifier TRANSPARENCY() { return new yarnwrap.util.Identifier(wrapperContained.TRANSPARENCY); }
// public void TRANSPARENCY(yarnwrap.util.Identifier value) { wrapperContained.TRANSPARENCY = value.wrapperContained; }
// public static yarnwrap.util.Identifier TRANSPARENCY() { return new yarnwrap.util.Identifier(net.minecraft.client.render.WorldRenderer.TRANSPARENCY); }
// public static void TRANSPARENCY(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.WorldRenderer.TRANSPARENCY = value.wrapperContained; }

// public yarnwrap.util.Identifier ENTITY_OUTLINE() { return new yarnwrap.util.Identifier(wrapperContained.ENTITY_OUTLINE); }
// public void ENTITY_OUTLINE(yarnwrap.util.Identifier value) { wrapperContained.ENTITY_OUTLINE = value.wrapperContained; }
// public static yarnwrap.util.Identifier ENTITY_OUTLINE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.WorldRenderer.ENTITY_OUTLINE); }
// public static void ENTITY_OUTLINE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.WorldRenderer.ENTITY_OUTLINE = value.wrapperContained; }

// public yarnwrap.util.math.BlockPos lastTranslucencySortCameraPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.lastTranslucencySortCameraPos); }
// public void lastTranslucencySortCameraPos(yarnwrap.util.math.BlockPos value) { wrapperContained.lastTranslucencySortCameraPos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos lastTranslucencySortCameraPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.client.render.WorldRenderer.lastTranslucencySortCameraPos); }
// public static void lastTranslucencySortCameraPos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.client.render.WorldRenderer.lastTranslucencySortCameraPos = value.wrapperContained; }

// public int chunkIndex() { return wrapperContained.chunkIndex; }
// public void chunkIndex(int value) { wrapperContained.chunkIndex = value; }
// public static int chunkIndex() { return net.minecraft.client.render.WorldRenderer.chunkIndex; }
// public static void chunkIndex(int value, ) { net.minecraft.client.render.WorldRenderer.chunkIndex = value; }

// public it.unimi.dsi.fastutil.objects.ObjectArrayList nearbyChunks() { return wrapperContained.nearbyChunks; }
// public void nearbyChunks(it.unimi.dsi.fastutil.objects.ObjectArrayList value) { wrapperContained.nearbyChunks = value; }
// public static it.unimi.dsi.fastutil.objects.ObjectArrayList nearbyChunks() { return net.minecraft.client.render.WorldRenderer.nearbyChunks; }
// public static void nearbyChunks(it.unimi.dsi.fastutil.objects.ObjectArrayList value, ) { net.minecraft.client.render.WorldRenderer.nearbyChunks = value; }

public WorldRenderer(yarnwrap.client.MinecraftClient client,yarnwrap.client.render.entity.EntityRenderDispatcher entityRenderDispatcher,yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher blockEntityRenderDispatcher,yarnwrap.client.render.BufferBuilderStorage bufferBuilders) { this.wrapperContained = new net.minecraft.client.render.WorldRenderer(client.wrapperContained,entityRenderDispatcher.wrapperContained,blockEntityRenderDispatcher.wrapperContained,bufferBuilders.wrapperContained); }
public void onResized(int width,int height) { wrapperContained.onResized(width,height); }
// public static void onResized(int width,int height, ) { net.minecraft.client.render.WorldRenderer.onResized(width,height); }
public void setWorld(yarnwrap.client.world.ClientWorld world) { wrapperContained.setWorld(world.wrapperContained); }
// public static void setWorld(yarnwrap.client.world.ClientWorld world, ) { net.minecraft.client.render.WorldRenderer.setWorld(world.wrapperContained); }
public int getCompletedChunkCount() { return wrapperContained.getCompletedChunkCount(); }
// public static int getCompletedChunkCount() { return net.minecraft.client.render.WorldRenderer.getCompletedChunkCount(); }
// public void renderLayer() { wrapperContained.renderLayer(); }
// public static void renderLayer() { net.minecraft.client.render.WorldRenderer.renderLayer(); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.client.render.WorldRenderer.tick(); }
public void drawEntityOutlinesFramebuffer() { wrapperContained.drawEntityOutlinesFramebuffer(); }
// public static void drawEntityOutlinesFramebuffer() { net.minecraft.client.render.WorldRenderer.drawEntityOutlinesFramebuffer(); }
// public yarnwrap.particle.ParticlesMode getRandomParticleSpawnChance(boolean canSpawnOnMinimal) { return new yarnwrap.particle.ParticlesMode(wrapperContained.getRandomParticleSpawnChance(canSpawnOnMinimal)); }
// public static yarnwrap.particle.ParticlesMode getRandomParticleSpawnChance(boolean canSpawnOnMinimal, ) { return new yarnwrap.particle.ParticlesMode(net.minecraft.client.render.WorldRenderer.getRandomParticleSpawnChance(canSpawnOnMinimal)); }
// public void updateChunks(yarnwrap.client.render.Camera camera) { wrapperContained.updateChunks(camera.wrapperContained); }
// public static void updateChunks(yarnwrap.client.render.Camera camera, ) { net.minecraft.client.render.WorldRenderer.updateChunks(camera.wrapperContained); }
// public boolean canDrawEntityOutlines() { return wrapperContained.canDrawEntityOutlines(); }
// public static boolean canDrawEntityOutlines() { return net.minecraft.client.render.WorldRenderer.canDrawEntityOutlines(); }
public java.lang.String getEntitiesDebugString() { return wrapperContained.getEntitiesDebugString(); }
// public static java.lang.String getEntitiesDebugString() { return net.minecraft.client.render.WorldRenderer.getEntitiesDebugString(); }
// public void setupTerrain(yarnwrap.client.render.Camera camera,yarnwrap.client.render.Frustum frustum,boolean hasForcedFrustum,boolean spectator) { wrapperContained.setupTerrain(camera.wrapperContained,frustum.wrapperContained,hasForcedFrustum,spectator); }
// public static void setupTerrain(yarnwrap.client.render.Camera camera,yarnwrap.client.render.Frustum frustum,boolean hasForcedFrustum,boolean spectator, ) { net.minecraft.client.render.WorldRenderer.setupTerrain(camera.wrapperContained,frustum.wrapperContained,hasForcedFrustum,spectator); }
public void addParticle(yarnwrap.particle.ParticleEffect parameters,double x,double y,double z,double velocityX,double velocityY,double velocityZ) { wrapperContained.addParticle(parameters.wrapperContained,x,y,z,velocityX,velocityY,velocityZ); }
// public static void addParticle(yarnwrap.particle.ParticleEffect parameters,double x,double y,double z,double velocityX,double velocityY,double velocityZ, ) { net.minecraft.client.render.WorldRenderer.addParticle(parameters.wrapperContained,x,y,z,velocityX,velocityY,velocityZ); }
public void reload() { wrapperContained.reload(); }
// public static void reload() { net.minecraft.client.render.WorldRenderer.reload(); }
public boolean isTerrainRenderComplete() { return wrapperContained.isTerrainRenderComplete(); }
// public static boolean isTerrainRenderComplete() { return net.minecraft.client.render.WorldRenderer.isTerrainRenderComplete(); }
// public yarnwrap.client.particle.Particle spawnParticle(yarnwrap.particle.ParticleEffect parameters,boolean force,double x,double y,double z,double velocityX,double velocityY,double velocityZ) { return new yarnwrap.client.particle.Particle(wrapperContained.spawnParticle(parameters.wrapperContained,force,x,y,z,velocityX,velocityY,velocityZ)); }
// public static yarnwrap.client.particle.Particle spawnParticle(yarnwrap.particle.ParticleEffect parameters,boolean force,double x,double y,double z,double velocityX,double velocityY,double velocityZ, ) { return new yarnwrap.client.particle.Particle(net.minecraft.client.render.WorldRenderer.spawnParticle(parameters.wrapperContained,force,x,y,z,velocityX,velocityY,velocityZ)); }
// public yarnwrap.client.particle.Particle spawnParticle(yarnwrap.particle.ParticleEffect parameters,boolean force,boolean canSpawnOnMinimal,double x,double y,double z,double velocityX,double velocityY,double velocityZ) { return new yarnwrap.client.particle.Particle(wrapperContained.spawnParticle(parameters.wrapperContained,force,canSpawnOnMinimal,x,y,z,velocityX,velocityY,velocityZ)); }
// public static yarnwrap.client.particle.Particle spawnParticle(yarnwrap.particle.ParticleEffect parameters,boolean force,boolean canSpawnOnMinimal,double x,double y,double z,double velocityX,double velocityY,double velocityZ, ) { return new yarnwrap.client.particle.Particle(net.minecraft.client.render.WorldRenderer.spawnParticle(parameters.wrapperContained,force,canSpawnOnMinimal,x,y,z,velocityX,velocityY,velocityZ)); }
public java.lang.String getChunksDebugString() { return wrapperContained.getChunksDebugString(); }
// public static java.lang.String getChunksDebugString() { return net.minecraft.client.render.WorldRenderer.getChunksDebugString(); }
public void scheduleTerrainUpdate() { wrapperContained.scheduleTerrainUpdate(); }
// public static void scheduleTerrainUpdate() { net.minecraft.client.render.WorldRenderer.scheduleTerrainUpdate(); }
// public void scheduleChunkRender(int x,int y,int z,boolean important) { wrapperContained.scheduleChunkRender(x,y,z,important); }
// public static void scheduleChunkRender(int x,int y,int z,boolean important, ) { net.minecraft.client.render.WorldRenderer.scheduleChunkRender(x,y,z,important); }
public void loadEntityOutlinePostProcessor() { wrapperContained.loadEntityOutlinePostProcessor(); }
// public static void loadEntityOutlinePostProcessor() { net.minecraft.client.render.WorldRenderer.loadEntityOutlinePostProcessor(); }
public void addParticle(yarnwrap.particle.ParticleEffect parameters,boolean force,boolean canSpawnOnMinimal,double x,double y,double z,double velocityX,double velocityY,double velocityZ) { wrapperContained.addParticle(parameters.wrapperContained,force,canSpawnOnMinimal,x,y,z,velocityX,velocityY,velocityZ); }
// public static void addParticle(yarnwrap.particle.ParticleEffect parameters,boolean force,boolean canSpawnOnMinimal,double x,double y,double z,double velocityX,double velocityY,double velocityZ, ) { net.minecraft.client.render.WorldRenderer.addParticle(parameters.wrapperContained,force,canSpawnOnMinimal,x,y,z,velocityX,velocityY,velocityZ); }
public void addParticle(yarnwrap.particle.ParticleEffect parameters,boolean force,double x,double y,double z,double velocityX,double velocityY,double velocityZ) { wrapperContained.addParticle(parameters.wrapperContained,force,x,y,z,velocityX,velocityY,velocityZ); }
// public static void addParticle(yarnwrap.particle.ParticleEffect parameters,boolean force,double x,double y,double z,double velocityX,double velocityY,double velocityZ, ) { net.minecraft.client.render.WorldRenderer.addParticle(parameters.wrapperContained,force,x,y,z,velocityX,velocityY,velocityZ); }
public void setBlockBreakingInfo(int entityId,yarnwrap.util.math.BlockPos pos,int stage) { wrapperContained.setBlockBreakingInfo(entityId,pos.wrapperContained,stage); }
// public static void setBlockBreakingInfo(int entityId,yarnwrap.util.math.BlockPos pos,int stage, ) { net.minecraft.client.render.WorldRenderer.setBlockBreakingInfo(entityId,pos.wrapperContained,stage); }
public void updateBlock(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState oldState,yarnwrap.block.BlockState newState,int flags) { wrapperContained.updateBlock(world.wrapperContained,pos.wrapperContained,oldState.wrapperContained,newState.wrapperContained,flags); }
// public static void updateBlock(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState oldState,yarnwrap.block.BlockState newState,int flags, ) { net.minecraft.client.render.WorldRenderer.updateBlock(world.wrapperContained,pos.wrapperContained,oldState.wrapperContained,newState.wrapperContained,flags); }
public void scheduleChunkRender(int chunkX,int chunkY,int chunkZ) { wrapperContained.scheduleChunkRender(chunkX,chunkY,chunkZ); }
// public static void scheduleChunkRender(int chunkX,int chunkY,int chunkZ, ) { net.minecraft.client.render.WorldRenderer.scheduleChunkRender(chunkX,chunkY,chunkZ); }
// public void scheduleSectionRender(yarnwrap.util.math.BlockPos pos,boolean important) { wrapperContained.scheduleSectionRender(pos.wrapperContained,important); }
// public static void scheduleSectionRender(yarnwrap.util.math.BlockPos pos,boolean important, ) { net.minecraft.client.render.WorldRenderer.scheduleSectionRender(pos.wrapperContained,important); }
public void scheduleChunkRenders3x3x3(int x,int y,int z) { wrapperContained.scheduleChunkRenders3x3x3(x,y,z); }
// public static void scheduleChunkRenders3x3x3(int x,int y,int z, ) { net.minecraft.client.render.WorldRenderer.scheduleChunkRenders3x3x3(x,y,z); }
public void scheduleBlockRenders(int minX,int minY,int minZ,int maxX,int maxY,int maxZ) { wrapperContained.scheduleBlockRenders(minX,minY,minZ,maxX,maxY,maxZ); }
// public static void scheduleBlockRenders(int minX,int minY,int minZ,int maxX,int maxY,int maxZ, ) { net.minecraft.client.render.WorldRenderer.scheduleBlockRenders(minX,minY,minZ,maxX,maxY,maxZ); }
public void scheduleBlockRerenderIfNeeded(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState old,yarnwrap.block.BlockState updated) { wrapperContained.scheduleBlockRerenderIfNeeded(pos.wrapperContained,old.wrapperContained,updated.wrapperContained); }
// public static void scheduleBlockRerenderIfNeeded(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState old,yarnwrap.block.BlockState updated, ) { net.minecraft.client.render.WorldRenderer.scheduleBlockRerenderIfNeeded(pos.wrapperContained,old.wrapperContained,updated.wrapperContained); }
// public void render(yarnwrap.client.util.ObjectAllocator allocator,yarnwrap.client.render.RenderTickCounter tickCounter,boolean renderBlockOutline,yarnwrap.client.render.Camera camera,org.joml.Matrix4f positionMatrix,org.joml.Matrix4f projectionMatrix,com.mojang.blaze3d.buffers.GpuBufferSlice fog,org.joml.Vector4f fogColor,boolean shouldRenderSky) { wrapperContained.render(allocator.wrapperContained,tickCounter.wrapperContained,renderBlockOutline,camera.wrapperContained,positionMatrix,projectionMatrix,fog,fogColor,shouldRenderSky); }
// public static void render(yarnwrap.client.util.ObjectAllocator allocator,yarnwrap.client.render.RenderTickCounter tickCounter,boolean renderBlockOutline,yarnwrap.client.render.Camera camera,org.joml.Matrix4f positionMatrix,org.joml.Matrix4f projectionMatrix,com.mojang.blaze3d.buffers.GpuBufferSlice fog,org.joml.Vector4f fogColor,boolean shouldRenderSky, ) { net.minecraft.client.render.WorldRenderer.render(allocator.wrapperContained,tickCounter.wrapperContained,renderBlockOutline,camera.wrapperContained,positionMatrix,projectionMatrix,fog,fogColor,shouldRenderSky); }
// public void drawBlockOutline(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.entity.Entity entity,double cameraX,double cameraY,double cameraZ,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,int color) { wrapperContained.drawBlockOutline(matrices.wrapperContained,vertexConsumer.wrapperContained,entity.wrapperContained,cameraX,cameraY,cameraZ,pos.wrapperContained,state.wrapperContained,color); }
// public static void drawBlockOutline(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.entity.Entity entity,double cameraX,double cameraY,double cameraZ,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,int color, ) { net.minecraft.client.render.WorldRenderer.drawBlockOutline(matrices.wrapperContained,vertexConsumer.wrapperContained,entity.wrapperContained,cameraX,cameraY,cameraZ,pos.wrapperContained,state.wrapperContained,color); }
// public void renderEntity(yarnwrap.entity.Entity entity,double cameraX,double cameraY,double cameraZ,float tickProgress,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers) { wrapperContained.renderEntity(entity.wrapperContained,cameraX,cameraY,cameraZ,tickProgress,matrices.wrapperContained,vertexConsumers.wrapperContained); }
// public static void renderEntity(yarnwrap.entity.Entity entity,double cameraX,double cameraY,double cameraZ,float tickProgress,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers, ) { net.minecraft.client.render.WorldRenderer.renderEntity(entity.wrapperContained,cameraX,cameraY,cameraZ,tickProgress,matrices.wrapperContained,vertexConsumers.wrapperContained); }
// public void checkEmpty(yarnwrap.client.util.math.MatrixStack matrices) { wrapperContained.checkEmpty(matrices.wrapperContained); }
// public static void checkEmpty(yarnwrap.client.util.math.MatrixStack matrices, ) { net.minecraft.client.render.WorldRenderer.checkEmpty(matrices.wrapperContained); }
// public void removeBlockBreakingInfo(yarnwrap.entity.player.BlockBreakingInfo info) { wrapperContained.removeBlockBreakingInfo(info.wrapperContained); }
// public static void removeBlockBreakingInfo(yarnwrap.entity.player.BlockBreakingInfo info, ) { net.minecraft.client.render.WorldRenderer.removeBlockBreakingInfo(info.wrapperContained); }
public yarnwrap.client.gl.Framebuffer getEntityOutlinesFramebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.getEntityOutlinesFramebuffer()); }
// public static yarnwrap.client.gl.Framebuffer getEntityOutlinesFramebuffer() { return new yarnwrap.client.gl.Framebuffer(net.minecraft.client.render.WorldRenderer.getEntityOutlinesFramebuffer()); }
// public int getLightmapCoordinates(Object brightnessGetter,yarnwrap.world.BlockRenderView world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getLightmapCoordinates(brightnessGetter,world.wrapperContained,state.wrapperContained,pos.wrapperContained); }
// public static int getLightmapCoordinates(Object brightnessGetter,yarnwrap.world.BlockRenderView world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.client.render.WorldRenderer.getLightmapCoordinates(brightnessGetter,world.wrapperContained,state.wrapperContained,pos.wrapperContained); }
// public int getLightmapCoordinates(yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getLightmapCoordinates(world.wrapperContained,pos.wrapperContained); }
// public static int getLightmapCoordinates(yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.client.render.WorldRenderer.getLightmapCoordinates(world.wrapperContained,pos.wrapperContained); }
public yarnwrap.client.gl.Framebuffer getTranslucentFramebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.getTranslucentFramebuffer()); }
// public static yarnwrap.client.gl.Framebuffer getTranslucentFramebuffer() { return new yarnwrap.client.gl.Framebuffer(net.minecraft.client.render.WorldRenderer.getTranslucentFramebuffer()); }
public yarnwrap.client.gl.Framebuffer getEntityFramebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.getEntityFramebuffer()); }
// public static yarnwrap.client.gl.Framebuffer getEntityFramebuffer() { return new yarnwrap.client.gl.Framebuffer(net.minecraft.client.render.WorldRenderer.getEntityFramebuffer()); }
public yarnwrap.client.gl.Framebuffer getParticlesFramebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.getParticlesFramebuffer()); }
// public static yarnwrap.client.gl.Framebuffer getParticlesFramebuffer() { return new yarnwrap.client.gl.Framebuffer(net.minecraft.client.render.WorldRenderer.getParticlesFramebuffer()); }
public yarnwrap.client.gl.Framebuffer getWeatherFramebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.getWeatherFramebuffer()); }
// public static yarnwrap.client.gl.Framebuffer getWeatherFramebuffer() { return new yarnwrap.client.gl.Framebuffer(net.minecraft.client.render.WorldRenderer.getWeatherFramebuffer()); }
public yarnwrap.client.gl.Framebuffer getCloudsFramebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.getCloudsFramebuffer()); }
// public static yarnwrap.client.gl.Framebuffer getCloudsFramebuffer() { return new yarnwrap.client.gl.Framebuffer(net.minecraft.client.render.WorldRenderer.getCloudsFramebuffer()); }
public void setupFrustum(yarnwrap.util.math.Vec3d pos,org.joml.Matrix4f positionMatrix,org.joml.Matrix4f projectionMatrix) { wrapperContained.setupFrustum(pos.wrapperContained,positionMatrix,projectionMatrix); }
// public static void setupFrustum(yarnwrap.util.math.Vec3d pos,org.joml.Matrix4f positionMatrix,org.joml.Matrix4f projectionMatrix, ) { net.minecraft.client.render.WorldRenderer.setupFrustum(pos.wrapperContained,positionMatrix,projectionMatrix); }
public yarnwrap.client.render.chunk.ChunkBuilder getChunkBuilder() { return new yarnwrap.client.render.chunk.ChunkBuilder(wrapperContained.getChunkBuilder()); }
// public static yarnwrap.client.render.chunk.ChunkBuilder getChunkBuilder() { return new yarnwrap.client.render.chunk.ChunkBuilder(net.minecraft.client.render.WorldRenderer.getChunkBuilder()); }
public double getChunkCount() { return wrapperContained.getChunkCount(); }
// public static double getChunkCount() { return net.minecraft.client.render.WorldRenderer.getChunkCount(); }
public double getViewDistance() { return wrapperContained.getViewDistance(); }
// public static double getViewDistance() { return net.minecraft.client.render.WorldRenderer.getViewDistance(); }
public void captureFrustum() { wrapperContained.captureFrustum(); }
// public static void captureFrustum() { net.minecraft.client.render.WorldRenderer.captureFrustum(); }
public void killFrustum() { wrapperContained.killFrustum(); }
// public static void killFrustum() { net.minecraft.client.render.WorldRenderer.killFrustum(); }
// public void addBuiltChunk(Object chunk) { wrapperContained.addBuiltChunk(chunk); }
// public static void addBuiltChunk(Object chunk, ) { net.minecraft.client.render.WorldRenderer.addBuiltChunk(chunk); }
// public void applyFrustum(yarnwrap.client.render.Frustum frustum) { wrapperContained.applyFrustum(frustum.wrapperContained); }
// public static void applyFrustum(yarnwrap.client.render.Frustum frustum, ) { net.minecraft.client.render.WorldRenderer.applyFrustum(frustum.wrapperContained); }
public boolean isRenderingReady(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isRenderingReady(pos.wrapperContained); }
// public static boolean isRenderingReady(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.client.render.WorldRenderer.isRenderingReady(pos.wrapperContained); }
// public boolean hasBlindnessOrDarkness(yarnwrap.client.render.Camera camera) { return wrapperContained.hasBlindnessOrDarkness(camera.wrapperContained); }
// public static boolean hasBlindnessOrDarkness(yarnwrap.client.render.Camera camera, ) { return net.minecraft.client.render.WorldRenderer.hasBlindnessOrDarkness(camera.wrapperContained); }
// public yarnwrap.client.render.Frustum offsetFrustum(yarnwrap.client.render.Frustum frustum) { return new yarnwrap.client.render.Frustum(wrapperContained.offsetFrustum(frustum.wrapperContained)); }
// public static yarnwrap.client.render.Frustum offsetFrustum(yarnwrap.client.render.Frustum frustum, ) { return new yarnwrap.client.render.Frustum(net.minecraft.client.render.WorldRenderer.offsetFrustum(frustum.wrapperContained)); }
public yarnwrap.client.render.CloudRenderer getCloudRenderer() { return new yarnwrap.client.render.CloudRenderer(wrapperContained.getCloudRenderer()); }
// public static yarnwrap.client.render.CloudRenderer getCloudRenderer() { return new yarnwrap.client.render.CloudRenderer(net.minecraft.client.render.WorldRenderer.getCloudRenderer()); }
// public boolean isSkyDark(float tickProgress) { return wrapperContained.isSkyDark(tickProgress); }
// public static boolean isSkyDark(float tickProgress, ) { return net.minecraft.client.render.WorldRenderer.isSkyDark(tickProgress); }
// public void translucencySort(yarnwrap.util.math.Vec3d cameraPos) { wrapperContained.translucencySort(cameraPos.wrapperContained); }
// public static void translucencySort(yarnwrap.util.math.Vec3d cameraPos, ) { net.minecraft.client.render.WorldRenderer.translucencySort(cameraPos.wrapperContained); }
// public void renderLateDebug(yarnwrap.client.render.FrameGraphBuilder frameGraphBuilder,yarnwrap.util.math.Vec3d pos,com.mojang.blaze3d.buffers.GpuBufferSlice fog) { wrapperContained.renderLateDebug(frameGraphBuilder.wrapperContained,pos.wrapperContained,fog); }
// // public static void renderLateDebug(yarnwrap.client.render.FrameGraphBuilder frameGraphBuilder,yarnwrap.util.math.Vec3d pos,com.mojang.blaze3d.buffers.GpuBufferSlice fog, ) { net.minecraft.client.render.WorldRenderer.renderLateDebug(frameGraphBuilder.wrapperContained,pos.wrapperContained,fog); }
// public void renderSky(yarnwrap.client.render.FrameGraphBuilder frameGraphBuilder,yarnwrap.client.render.Camera camera,float tickProgress,com.mojang.blaze3d.buffers.GpuBufferSlice fog) { wrapperContained.renderSky(frameGraphBuilder.wrapperContained,camera.wrapperContained,tickProgress,fog); }
// // public static void renderSky(yarnwrap.client.render.FrameGraphBuilder frameGraphBuilder,yarnwrap.client.render.Camera camera,float tickProgress,com.mojang.blaze3d.buffers.GpuBufferSlice fog, ) { net.minecraft.client.render.WorldRenderer.renderSky(frameGraphBuilder.wrapperContained,camera.wrapperContained,tickProgress,fog); }
// public void renderParticles(yarnwrap.client.render.FrameGraphBuilder frameGraphBuilder,yarnwrap.client.render.Camera camera,float tickProgress,com.mojang.blaze3d.buffers.GpuBufferSlice fog) { wrapperContained.renderParticles(frameGraphBuilder.wrapperContained,camera.wrapperContained,tickProgress,fog); }
// // public static void renderParticles(yarnwrap.client.render.FrameGraphBuilder frameGraphBuilder,yarnwrap.client.render.Camera camera,float tickProgress,com.mojang.blaze3d.buffers.GpuBufferSlice fog, ) { net.minecraft.client.render.WorldRenderer.renderParticles(frameGraphBuilder.wrapperContained,camera.wrapperContained,tickProgress,fog); }
// public void renderMain(yarnwrap.client.render.FrameGraphBuilder frameGraphBuilder,yarnwrap.client.render.Frustum frustum,yarnwrap.client.render.Camera camera,org.joml.Matrix4f positionMatrix,com.mojang.blaze3d.buffers.GpuBufferSlice fog,boolean renderBlockOutline,boolean renderEntityOutline,yarnwrap.client.render.RenderTickCounter tickCounter,yarnwrap.util.profiler.Profiler profiler) { wrapperContained.renderMain(frameGraphBuilder.wrapperContained,frustum.wrapperContained,camera.wrapperContained,positionMatrix,fog,renderBlockOutline,renderEntityOutline,tickCounter.wrapperContained,profiler.wrapperContained); }
// public static void renderMain(yarnwrap.client.render.FrameGraphBuilder frameGraphBuilder,yarnwrap.client.render.Frustum frustum,yarnwrap.client.render.Camera camera,org.joml.Matrix4f positionMatrix,com.mojang.blaze3d.buffers.GpuBufferSlice fog,boolean renderBlockOutline,boolean renderEntityOutline,yarnwrap.client.render.RenderTickCounter tickCounter,yarnwrap.util.profiler.Profiler profiler, ) { net.minecraft.client.render.WorldRenderer.renderMain(frameGraphBuilder.wrapperContained,frustum.wrapperContained,camera.wrapperContained,positionMatrix,fog,renderBlockOutline,renderEntityOutline,tickCounter.wrapperContained,profiler.wrapperContained); }
// public void renderWeather(yarnwrap.client.render.FrameGraphBuilder frameGraphBuilder,yarnwrap.util.math.Vec3d cameraPos,float tickProgress,com.mojang.blaze3d.buffers.GpuBufferSlice fog) { wrapperContained.renderWeather(frameGraphBuilder.wrapperContained,cameraPos.wrapperContained,tickProgress,fog); }
// // public static void renderWeather(yarnwrap.client.render.FrameGraphBuilder frameGraphBuilder,yarnwrap.util.math.Vec3d cameraPos,float tickProgress,com.mojang.blaze3d.buffers.GpuBufferSlice fog, ) { net.minecraft.client.render.WorldRenderer.renderWeather(frameGraphBuilder.wrapperContained,cameraPos.wrapperContained,tickProgress,fog); }
// public void renderClouds(yarnwrap.client.render.FrameGraphBuilder frameGraphBuilder,yarnwrap.client.option.CloudRenderMode mode,yarnwrap.util.math.Vec3d cameraPos,float color,int cloudHeight) { wrapperContained.renderClouds(frameGraphBuilder.wrapperContained,mode.wrapperContained,cameraPos.wrapperContained,color,cloudHeight); }
// public static void renderClouds(yarnwrap.client.render.FrameGraphBuilder frameGraphBuilder,yarnwrap.client.option.CloudRenderMode mode,yarnwrap.util.math.Vec3d cameraPos,float color,int cloudHeight, ) { net.minecraft.client.render.WorldRenderer.renderClouds(frameGraphBuilder.wrapperContained,mode.wrapperContained,cameraPos.wrapperContained,color,cloudHeight); }
// public void renderBlockDamage(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.Camera camera,Object vertexConsumers) { wrapperContained.renderBlockDamage(matrices.wrapperContained,camera.wrapperContained,vertexConsumers); }
// public static void renderBlockDamage(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.Camera camera,Object vertexConsumers, ) { net.minecraft.client.render.WorldRenderer.renderBlockDamage(matrices.wrapperContained,camera.wrapperContained,vertexConsumers); }
// public void renderEntities(yarnwrap.client.util.math.MatrixStack matrices,Object vertexConsumers,yarnwrap.client.render.Camera camera,yarnwrap.client.render.RenderTickCounter tickCounter,java.util.List entities) { wrapperContained.renderEntities(matrices.wrapperContained,vertexConsumers,camera.wrapperContained,tickCounter.wrapperContained,entities); }
// public static void renderEntities(yarnwrap.client.util.math.MatrixStack matrices,Object vertexConsumers,yarnwrap.client.render.Camera camera,yarnwrap.client.render.RenderTickCounter tickCounter,java.util.List entities, ) { net.minecraft.client.render.WorldRenderer.renderEntities(matrices.wrapperContained,vertexConsumers,camera.wrapperContained,tickCounter.wrapperContained,entities); }
// public void renderBlockEntities(yarnwrap.client.util.math.MatrixStack matrices,Object entityVertexConsumers,Object effectVertexConsumers,yarnwrap.client.render.Camera camera,float tickProgress) { wrapperContained.renderBlockEntities(matrices.wrapperContained,entityVertexConsumers,effectVertexConsumers,camera.wrapperContained,tickProgress); }
// public static void renderBlockEntities(yarnwrap.client.util.math.MatrixStack matrices,Object entityVertexConsumers,Object effectVertexConsumers,yarnwrap.client.render.Camera camera,float tickProgress, ) { net.minecraft.client.render.WorldRenderer.renderBlockEntities(matrices.wrapperContained,entityVertexConsumers,effectVertexConsumers,camera.wrapperContained,tickProgress); }
public void addWeatherParticlesAndSound(yarnwrap.client.render.Camera camera) { wrapperContained.addWeatherParticlesAndSound(camera.wrapperContained); }
// public static void addWeatherParticlesAndSound(yarnwrap.client.render.Camera camera, ) { net.minecraft.client.render.WorldRenderer.addWeatherParticlesAndSound(camera.wrapperContained); }
// public void renderTargetBlockOutline(yarnwrap.client.render.Camera camera,Object vertexConsumers,yarnwrap.client.util.math.MatrixStack matrices,boolean translucent) { wrapperContained.renderTargetBlockOutline(camera.wrapperContained,vertexConsumers,matrices.wrapperContained,translucent); }
// public static void renderTargetBlockOutline(yarnwrap.client.render.Camera camera,Object vertexConsumers,yarnwrap.client.util.math.MatrixStack matrices,boolean translucent, ) { net.minecraft.client.render.WorldRenderer.renderTargetBlockOutline(camera.wrapperContained,vertexConsumers,matrices.wrapperContained,translucent); }
// public boolean getEntitiesToRender(yarnwrap.client.render.Camera camera,yarnwrap.client.render.Frustum frustum,java.util.List output) { return wrapperContained.getEntitiesToRender(camera.wrapperContained,frustum.wrapperContained,output); }
// public static boolean getEntitiesToRender(yarnwrap.client.render.Camera camera,yarnwrap.client.render.Frustum frustum,java.util.List output, ) { return net.minecraft.client.render.WorldRenderer.getEntitiesToRender(camera.wrapperContained,frustum.wrapperContained,output); }
// public yarnwrap.client.render.VertexConsumer method_62217(Object renderLayer) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.method_62217(renderLayer)); }
// public static yarnwrap.client.render.VertexConsumer method_62217(Object renderLayer, ) { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.render.WorldRenderer.method_62217(renderLayer)); }
public void scheduleChunkRenders(int minX,int minY,int minZ,int maxX,int maxY,int maxZ) { wrapperContained.scheduleChunkRenders(minX,minY,minZ,maxX,maxY,maxZ); }
// public static void scheduleChunkRenders(int minX,int minY,int minZ,int maxX,int maxY,int maxZ, ) { net.minecraft.client.render.WorldRenderer.scheduleChunkRenders(minX,minY,minZ,maxX,maxY,maxZ); }
public it.unimi.dsi.fastutil.objects.ObjectArrayList getBuiltChunks() { return wrapperContained.getBuiltChunks(); }
// public static it.unimi.dsi.fastutil.objects.ObjectArrayList getBuiltChunks() { return net.minecraft.client.render.WorldRenderer.getBuiltChunks(); }
public yarnwrap.client.render.ChunkRenderingDataPreparer getChunkRenderingDataPreparer() { return new yarnwrap.client.render.ChunkRenderingDataPreparer(wrapperContained.getChunkRenderingDataPreparer()); }
// public static yarnwrap.client.render.ChunkRenderingDataPreparer getChunkRenderingDataPreparer() { return new yarnwrap.client.render.ChunkRenderingDataPreparer(net.minecraft.client.render.WorldRenderer.getChunkRenderingDataPreparer()); }
public yarnwrap.client.render.Frustum getCapturedFrustum() { return new yarnwrap.client.render.Frustum(wrapperContained.getCapturedFrustum()); }
// public static yarnwrap.client.render.Frustum getCapturedFrustum() { return new yarnwrap.client.render.Frustum(net.minecraft.client.render.WorldRenderer.getCapturedFrustum()); }
// public yarnwrap.client.gl.PostEffectProcessor getTransparencyPostEffectProcessor() { return new yarnwrap.client.gl.PostEffectProcessor(wrapperContained.getTransparencyPostEffectProcessor()); }
// public static yarnwrap.client.gl.PostEffectProcessor getTransparencyPostEffectProcessor() { return new yarnwrap.client.gl.PostEffectProcessor(net.minecraft.client.render.WorldRenderer.getTransparencyPostEffectProcessor()); }
public void onChunkUnload(long sectionPos) { wrapperContained.onChunkUnload(sectionPos); }
// public static void onChunkUnload(long sectionPos, ) { net.minecraft.client.render.WorldRenderer.onChunkUnload(sectionPos); }
// public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.client.render.WorldRenderer.clear(); }
// public void scheduleChunkTranslucencySort(Object chunk,yarnwrap.client.render.chunk.NormalizedRelativePos relativePos,yarnwrap.util.math.Vec3d cameraPos,boolean needsUpdate,boolean ignoreCameraAlignment) { wrapperContained.scheduleChunkTranslucencySort(chunk,relativePos.wrapperContained,cameraPos.wrapperContained,needsUpdate,ignoreCameraAlignment); }
// public static void scheduleChunkTranslucencySort(Object chunk,yarnwrap.client.render.chunk.NormalizedRelativePos relativePos,yarnwrap.util.math.Vec3d cameraPos,boolean needsUpdate,boolean ignoreCameraAlignment, ) { net.minecraft.client.render.WorldRenderer.scheduleChunkTranslucencySort(chunk,relativePos.wrapperContained,cameraPos.wrapperContained,needsUpdate,ignoreCameraAlignment); }
public void scheduleNeighborUpdates(yarnwrap.util.math.ChunkPos chunkPos) { wrapperContained.scheduleNeighborUpdates(chunkPos.wrapperContained); }
// public static void scheduleNeighborUpdates(yarnwrap.util.math.ChunkPos chunkPos, ) { net.minecraft.client.render.WorldRenderer.scheduleNeighborUpdates(chunkPos.wrapperContained); }
// public void rotate() { wrapperContained.rotate(); }
// public static void rotate() { net.minecraft.client.render.WorldRenderer.rotate(); }

}