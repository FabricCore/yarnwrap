package yarnwrap.client.render;
public class WorldRenderer { public net.minecraft.client.render.WorldRenderer wrapperContained; public WorldRenderer(net.minecraft.client.render.WorldRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int rainSoundCounter() { return wrapperContained.rainSoundCounter; }
// public float[] NORMAL_LINE_DX() { return wrapperContained.NORMAL_LINE_DX; }
// public float[] NORMAL_LINE_DZ() { return wrapperContained.NORMAL_LINE_DZ; }
// public yarnwrap.util.Identifier RAIN() { return new yarnwrap.util.Identifier(wrapperContained.RAIN); }
// public yarnwrap.util.Identifier SNOW() { return new yarnwrap.util.Identifier(wrapperContained.SNOW); }
// public it.unimi.dsi.fastutil.longs.Long2ObjectMap blockBreakingProgressions() { return wrapperContained.blockBreakingProgressions; }
// public yarnwrap.client.render.BufferBuilderStorage bufferBuilders() { return new yarnwrap.client.render.BufferBuilderStorage(wrapperContained.bufferBuilders); }
// public yarnwrap.client.render.FpsSmoother chunkUpdateSmoother() { return new yarnwrap.client.render.FpsSmoother(wrapperContained.chunkUpdateSmoother); }
// public yarnwrap.client.gl.Framebuffer translucentFramebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.translucentFramebuffer); }
// public yarnwrap.client.gl.Framebuffer entityFramebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.entityFramebuffer); }
// public yarnwrap.client.gl.Framebuffer particlesFramebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.particlesFramebuffer); }
// public yarnwrap.client.gl.Framebuffer weatherFramebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.weatherFramebuffer); }
// public yarnwrap.client.gl.Framebuffer cloudsFramebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.cloudsFramebuffer); }
// public yarnwrap.client.gl.PostEffectProcessor transparencyPostProcessor() { return new yarnwrap.client.gl.PostEffectProcessor(wrapperContained.transparencyPostProcessor); }
// public yarnwrap.client.render.Frustum frustum() { return new yarnwrap.client.render.Frustum(wrapperContained.frustum); }
// public yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher blockEntityRenderDispatcher() { return new yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher(wrapperContained.blockEntityRenderDispatcher); }
// public java.util.Set noCullingBlockEntities() { return wrapperContained.noCullingBlockEntities; }
// public yarnwrap.client.render.Frustum capturedFrustum() { return new yarnwrap.client.render.Frustum(wrapperContained.capturedFrustum); }
// public it.unimi.dsi.fastutil.ints.Int2ObjectMap blockBreakingInfos() { return wrapperContained.blockBreakingInfos; }
// public yarnwrap.client.gl.PostEffectProcessor entityOutlinePostProcessor() { return new yarnwrap.client.gl.PostEffectProcessor(wrapperContained.entityOutlinePostProcessor); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.util.Identifier END_SKY() { return new yarnwrap.util.Identifier(wrapperContained.END_SKY); }
// public int viewDistance() { return wrapperContained.viewDistance; }
// public double lastCameraYaw() { return wrapperContained.lastCameraYaw; }
// public org.joml.Vector4f[] capturedFrustumOrientation() { return wrapperContained.capturedFrustumOrientation; }
// public double lastCameraX() { return wrapperContained.lastCameraX; }
// public yarnwrap.util.Identifier FORCEFIELD() { return new yarnwrap.util.Identifier(wrapperContained.FORCEFIELD); }
// public yarnwrap.util.math.Vec3d lastCloudsColor() { return new yarnwrap.util.math.Vec3d(wrapperContained.lastCloudsColor); }
// public int ticks() { return wrapperContained.ticks; }
// public yarnwrap.client.option.CloudRenderMode lastCloudRenderMode() { return new yarnwrap.client.option.CloudRenderMode(wrapperContained.lastCloudRenderMode); }
// public double lastCameraY() { return wrapperContained.lastCameraY; }
// public int lastCloudsBlockX() { return wrapperContained.lastCloudsBlockX; }
// public double lastTranslucentSortX() { return wrapperContained.lastTranslucentSortX; }
// public int cameraChunkX() { return wrapperContained.cameraChunkX; }
// public yarnwrap.client.world.ClientWorld world() { return new yarnwrap.client.world.ClientWorld(wrapperContained.world); }
// public yarnwrap.client.gl.VertexBuffer lightSkyBuffer() { return new yarnwrap.client.gl.VertexBuffer(wrapperContained.lightSkyBuffer); }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public int regularEntityCount() { return wrapperContained.regularEntityCount; }
// public boolean shouldCaptureFrustum() { return wrapperContained.shouldCaptureFrustum; }
// public org.joml.Vector3d capturedFrustumPosition() { return wrapperContained.capturedFrustumPosition; }
// public yarnwrap.client.gl.VertexBuffer cloudsBuffer() { return new yarnwrap.client.gl.VertexBuffer(wrapperContained.cloudsBuffer); }
public net.minecraft.util.math.Direction[] DIRECTIONS() { return wrapperContained.DIRECTIONS; }
// public double lastCameraZ() { return wrapperContained.lastCameraZ; }
// public int lastCloudsBlockY() { return wrapperContained.lastCloudsBlockY; }
// public yarnwrap.util.Identifier MOON_PHASES() { return new yarnwrap.util.Identifier(wrapperContained.MOON_PHASES); }
// public yarnwrap.client.gl.Framebuffer entityOutlinesFramebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.entityOutlinesFramebuffer); }
// public yarnwrap.client.gl.VertexBuffer darkSkyBuffer() { return new yarnwrap.client.gl.VertexBuffer(wrapperContained.darkSkyBuffer); }
// public double lastTranslucentSortY() { return wrapperContained.lastTranslucentSortY; }
// public int cameraChunkY() { return wrapperContained.cameraChunkY; }
// public boolean cloudsDirty() { return wrapperContained.cloudsDirty; }
// public yarnwrap.util.Identifier CLOUDS() { return new yarnwrap.util.Identifier(wrapperContained.CLOUDS); }
// public yarnwrap.client.render.entity.EntityRenderDispatcher entityRenderDispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(wrapperContained.entityRenderDispatcher); }
// public int blockEntityCount() { return wrapperContained.blockEntityCount; }
// public yarnwrap.util.Identifier SUN() { return new yarnwrap.util.Identifier(wrapperContained.SUN); }
// public yarnwrap.client.render.BuiltChunkStorage chunks() { return new yarnwrap.client.render.BuiltChunkStorage(wrapperContained.chunks); }
// public yarnwrap.client.gl.VertexBuffer starsBuffer() { return new yarnwrap.client.gl.VertexBuffer(wrapperContained.starsBuffer); }
// public double lastCameraPitch() { return wrapperContained.lastCameraPitch; }
// public int lastCloudsBlockZ() { return wrapperContained.lastCloudsBlockZ; }
// public double lastTranslucentSortZ() { return wrapperContained.lastTranslucentSortZ; }
// public java.util.Map playingSongs() { return wrapperContained.playingSongs; }
// public int cameraChunkZ() { return wrapperContained.cameraChunkZ; }
// public yarnwrap.client.render.chunk.ChunkBuilder chunkBuilder() { return new yarnwrap.client.render.chunk.ChunkBuilder(wrapperContained.chunkBuilder); }
// public yarnwrap.client.render.ChunkRenderingDataPreparer chunkRenderingDataPreparer() { return new yarnwrap.client.render.ChunkRenderingDataPreparer(wrapperContained.chunkRenderingDataPreparer); }
// public it.unimi.dsi.fastutil.objects.ObjectArrayList builtChunks() { return wrapperContained.builtChunks; }
// public void scheduleSectionRender(yarnwrap.util.math.BlockPos pos,boolean important) { wrapperContained.scheduleSectionRender(pos.wrapperContained,important); }
public void scheduleBlockRenders(int x,int y,int z) { wrapperContained.scheduleBlockRenders(x,y,z); }
public void scheduleBlockRenders(int minX,int minY,int minZ,int maxX,int maxY,int maxZ) { wrapperContained.scheduleBlockRenders(minX,minY,minZ,maxX,maxY,maxZ); }
public void scheduleBlockRerenderIfNeeded(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState old,yarnwrap.block.BlockState updated) { wrapperContained.scheduleBlockRerenderIfNeeded(pos.wrapperContained,old.wrapperContained,updated.wrapperContained); }
// public void render(yarnwrap.client.render.RenderTickCounter tickCounter,boolean renderBlockOutline,yarnwrap.client.render.Camera camera,yarnwrap.client.render.GameRenderer gameRenderer,yarnwrap.client.render.LightmapTextureManager lightmapTextureManager) { wrapperContained.render(tickCounter.wrapperContained,renderBlockOutline,camera.wrapperContained,gameRenderer.wrapperContained,lightmapTextureManager.wrapperContained); }
// public void drawBlockOutline(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.entity.Entity entity,double cameraX,double cameraY,double cameraZ,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.drawBlockOutline(matrices.wrapperContained,vertexConsumer.wrapperContained,entity.wrapperContained,cameraX,cameraY,cameraZ,pos.wrapperContained,state.wrapperContained); }
public void tickRainSplashing(yarnwrap.client.render.Camera camera) { wrapperContained.tickRainSplashing(camera.wrapperContained); }
// public void renderWeather(yarnwrap.client.render.LightmapTextureManager manager,float tickDelta,double cameraX,double cameraY,double cameraZ) { wrapperContained.renderWeather(manager.wrapperContained,tickDelta,cameraX,cameraY,cameraZ); }
// public void renderEntity(yarnwrap.entity.Entity entity,double cameraX,double cameraY,double cameraZ,float tickDelta,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers) { wrapperContained.renderEntity(entity.wrapperContained,cameraX,cameraY,cameraZ,tickDelta,matrices.wrapperContained,vertexConsumers.wrapperContained); }
// public void checkEmpty(yarnwrap.client.util.math.MatrixStack matrices) { wrapperContained.checkEmpty(matrices.wrapperContained); }
public void drawBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,double x1,double y1,double z1,double x2,double y2,double z2,float red,float green,float blue,float alpha) { wrapperContained.drawBox(matrices.wrapperContained,vertexConsumer.wrapperContained,x1,y1,z1,x2,y2,z2,red,green,blue,alpha); }
public void drawBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,double x1,double y1,double z1,double x2,double y2,double z2,float red,float green,float blue,float alpha,float xAxisRed,float yAxisGreen,float zAxisBlue) { wrapperContained.drawBox(matrices.wrapperContained,vertexConsumer.wrapperContained,x1,y1,z1,x2,y2,z2,red,green,blue,alpha,xAxisRed,yAxisGreen,zAxisBlue); }
public void drawBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.util.math.Box box,float red,float green,float blue,float alpha) { wrapperContained.drawBox(matrices.wrapperContained,vertexConsumer.wrapperContained,box.wrapperContained,red,green,blue,alpha); }
public void drawShapeOutline(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.util.shape.VoxelShape shape,double offsetX,double offsetY,double offsetZ,float red,float green,float blue,float alpha,boolean colorize) { wrapperContained.drawShapeOutline(matrices.wrapperContained,vertexConsumer.wrapperContained,shape.wrapperContained,offsetX,offsetY,offsetZ,red,green,blue,alpha,colorize); }
// public void renderCapturedFrustumVertex(yarnwrap.client.render.VertexConsumer vertexConsumer,org.joml.Matrix4f planeNum) { wrapperContained.renderCapturedFrustumVertex(vertexConsumer.wrapperContained,planeNum); }
// public void renderCapturedFrustumFace(yarnwrap.client.render.VertexConsumer vertexConsumer,org.joml.Matrix4f plane0,int plane1,int plane2,int plane3,int r,int g,int b) { wrapperContained.renderCapturedFrustumFace(vertexConsumer.wrapperContained,plane0,plane1,plane2,plane3,r,g,b); }
// public void removeBlockBreakingInfo(yarnwrap.entity.player.BlockBreakingInfo info) { wrapperContained.removeBlockBreakingInfo(info.wrapperContained); }
// public void renderChunkDebugInfo(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.client.render.Camera camera) { wrapperContained.renderChunkDebugInfo(matrices.wrapperContained,vertexConsumers.wrapperContained,camera.wrapperContained); }
public yarnwrap.client.gl.Framebuffer getEntityOutlinesFramebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.getEntityOutlinesFramebuffer()); }
public int getLightmapCoordinates(yarnwrap.world.BlockRenderView world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getLightmapCoordinates(world.wrapperContained,state.wrapperContained,pos.wrapperContained); }
public int getLightmapCoordinates(yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getLightmapCoordinates(world.wrapperContained,pos.wrapperContained); }
public yarnwrap.client.gl.Framebuffer getTranslucentFramebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.getTranslucentFramebuffer()); }
public yarnwrap.client.gl.Framebuffer getEntityFramebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.getEntityFramebuffer()); }
public yarnwrap.client.gl.Framebuffer getParticlesFramebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.getParticlesFramebuffer()); }
public yarnwrap.client.gl.Framebuffer getWeatherFramebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.getWeatherFramebuffer()); }
public yarnwrap.client.gl.Framebuffer getCloudsFramebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.getCloudsFramebuffer()); }
// public void loadTransparencyPostProcessor() { wrapperContained.loadTransparencyPostProcessor(); }
// public void resetTransparencyPostProcessor() { wrapperContained.resetTransparencyPostProcessor(); }
// public void setupFrustum() { wrapperContained.setupFrustum(); }
// public yarnwrap.client.render.BuiltBuffer buildCloudsBuffer(yarnwrap.client.render.Tessellator x,double y,double z,double color) { return new yarnwrap.client.render.BuiltBuffer(wrapperContained.buildCloudsBuffer(x.wrapperContained,y,z,color)); }
public void onResized(int width,int height) { wrapperContained.onResized(width,height); }
// public void renderWorldBorder(yarnwrap.client.render.Camera camera) { wrapperContained.renderWorldBorder(camera.wrapperContained); }
public void setWorld(yarnwrap.client.world.ClientWorld world) { wrapperContained.setWorld(world.wrapperContained); }
public void updateNoCullingBlockEntities(java.util.Collection removed,java.util.Collection added) { wrapperContained.updateNoCullingBlockEntities(removed,added); }
public int getCompletedChunkCount() { return wrapperContained.getCompletedChunkCount(); }
// public void updateEntitiesForSong(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean playing) { wrapperContained.updateEntitiesForSong(world.wrapperContained,pos.wrapperContained,playing); }
// public void renderEndSky(yarnwrap.client.util.math.MatrixStack matrices) { wrapperContained.renderEndSky(matrices.wrapperContained); }
// public void renderLayer(yarnwrap.client.render.RenderLayer renderLayer,double x,double y,double z,org.joml.Matrix4f positionMatrix) { wrapperContained.renderLayer(renderLayer.wrapperContained,x,y,z,positionMatrix); }
public void tick() { wrapperContained.tick(); }
public void drawEntityOutlinesFramebuffer() { wrapperContained.drawEntityOutlinesFramebuffer(); }
// public yarnwrap.client.render.BuiltBuffer buildStarsBuffer() { return new yarnwrap.client.render.BuiltBuffer(wrapperContained.buildStarsBuffer()); }
// public void renderSky(org.joml.Matrix4f projectionMatrix,org.joml.Matrix4f tickDelta,float camera,yarnwrap.client.render.Camera thickFog,boolean fogCallback) { wrapperContained.renderSky(projectionMatrix,tickDelta,camera,thickFog.wrapperContained,fogCallback); }
public void renderFilledBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,double minX,double minY,double minZ,double maxX,double maxY,double maxZ,float red,float green,float blue,float alpha) { wrapperContained.renderFilledBox(matrices.wrapperContained,vertexConsumer.wrapperContained,minX,minY,minZ,maxX,maxY,maxZ,red,green,blue,alpha); }
// public void renderClouds(yarnwrap.client.util.math.MatrixStack matrices,org.joml.Matrix4f tickDelta,org.joml.Matrix4f cameraX,float cameraY,double cameraZ) { wrapperContained.renderClouds(matrices.wrapperContained,tickDelta,cameraX,cameraY,cameraZ); }
// public void renderDarkSky() { wrapperContained.renderDarkSky(); }
public void cleanUp() { wrapperContained.cleanUp(); }
// public yarnwrap.client.option.ParticlesMode getRandomParticleSpawnChance(boolean canSpawnOnMinimal) { return new yarnwrap.client.option.ParticlesMode(wrapperContained.getRandomParticleSpawnChance(canSpawnOnMinimal)); }
// public void updateChunks(yarnwrap.client.render.Camera camera) { wrapperContained.updateChunks(camera.wrapperContained); }
// public boolean canDrawEntityOutlines() { return wrapperContained.canDrawEntityOutlines(); }
public java.lang.String getEntitiesDebugString() { return wrapperContained.getEntitiesDebugString(); }
// public void setupTerrain(yarnwrap.client.render.Camera camera,yarnwrap.client.render.Frustum frustum,boolean hasForcedFrustum,boolean spectator) { wrapperContained.setupTerrain(camera.wrapperContained,frustum.wrapperContained,hasForcedFrustum,spectator); }
// public void captureFrustum(org.joml.Matrix4f positionMatrix,org.joml.Matrix4f projectionMatrix,double x,double y,double z,yarnwrap.client.render.Frustum frustum) { wrapperContained.captureFrustum(positionMatrix,projectionMatrix,x,y,z,frustum.wrapperContained); }
// public void addParticle(yarnwrap.particle.ParticleEffect parameters,double x,double y,double z,double velocityX,double velocityY,double velocityZ) { wrapperContained.addParticle(parameters.wrapperContained,x,y,z,velocityX,velocityY,velocityZ); }
// public void renderLightSky() { wrapperContained.renderLightSky(); }
public void reload() { wrapperContained.reload(); }
public boolean isTerrainRenderComplete() { return wrapperContained.isTerrainRenderComplete(); }
// public yarnwrap.client.particle.Particle spawnParticle(yarnwrap.particle.ParticleEffect parameters,boolean alwaysSpawn,double x,double y,double z,double velocityX,double velocityY,double velocityZ) { return new yarnwrap.client.particle.Particle(wrapperContained.spawnParticle(parameters.wrapperContained,alwaysSpawn,x,y,z,velocityX,velocityY,velocityZ)); }
// public yarnwrap.client.particle.Particle spawnParticle(yarnwrap.particle.ParticleEffect parameters,boolean alwaysSpawn,boolean canSpawnOnMinimal,double x,double y,double z,double velocityX,double velocityY,double velocityZ) { return new yarnwrap.client.particle.Particle(wrapperContained.spawnParticle(parameters.wrapperContained,alwaysSpawn,canSpawnOnMinimal,x,y,z,velocityX,velocityY,velocityZ)); }
public java.lang.String getChunksDebugString() { return wrapperContained.getChunksDebugString(); }
// public void drawCuboidShapeOutline(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.util.shape.VoxelShape shape,double offsetX,double offsetY,double offsetZ,float red,float green,float blue,float alpha) { wrapperContained.drawCuboidShapeOutline(matrices.wrapperContained,vertexConsumer.wrapperContained,shape.wrapperContained,offsetX,offsetY,offsetZ,red,green,blue,alpha); }
public void scheduleTerrainUpdate() { wrapperContained.scheduleTerrainUpdate(); }
// public void renderStars() { wrapperContained.renderStars(); }
// public void scheduleChunkRender(int x,int y,int z,boolean important) { wrapperContained.scheduleChunkRender(x,y,z,important); }
public void loadEntityOutlinePostProcessor() { wrapperContained.loadEntityOutlinePostProcessor(); }
// public yarnwrap.client.render.BuiltBuffer buildSkyBuffer() { return new yarnwrap.client.render.BuiltBuffer(wrapperContained.buildSkyBuffer()); }
public yarnwrap.client.render.chunk.ChunkBuilder getChunkBuilder() { return new yarnwrap.client.render.chunk.ChunkBuilder(wrapperContained.getChunkBuilder()); }
public double getChunkCount() { return wrapperContained.getChunkCount(); }
public double getViewDistance() { return wrapperContained.getViewDistance(); }
public void drawBox(yarnwrap.client.render.VertexConsumer vertexConsumer,double x1,double y1,double z1,double x2,double y2,double z2,float red,float green,float blue,float alpha) { wrapperContained.drawBox(vertexConsumer.wrapperContained,x1,y1,z1,x2,y2,z2,red,green,blue,alpha); }
public void reloadTransparencyPostProcessor() { wrapperContained.reloadTransparencyPostProcessor(); }
public void captureFrustum() { wrapperContained.captureFrustum(); }
public void killFrustum() { wrapperContained.killFrustum(); }
// public void addBuiltChunk(Object chunk) { wrapperContained.addBuiltChunk(chunk); }
// public void applyFrustum(yarnwrap.client.render.Frustum frustum) { wrapperContained.applyFrustum(frustum.wrapperContained); }
public boolean isRenderingReady(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isRenderingReady(pos.wrapperContained); }
// public boolean hasBlindnessOrDarkness(yarnwrap.client.render.Camera camera) { return wrapperContained.hasBlindnessOrDarkness(camera.wrapperContained); }
public void renderFilledBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,float minX,float minY,float minZ,float maxX,float maxY,float maxZ,float red,float green,float blue,float alpha) { wrapperContained.renderFilledBox(matrices.wrapperContained,vertexConsumer.wrapperContained,minX,minY,minZ,maxX,maxY,maxZ,red,green,blue,alpha); }
// public yarnwrap.util.math.Vec3d getMaxIntensityColor(float hue) { return new yarnwrap.util.math.Vec3d(wrapperContained.getMaxIntensityColor(hue)); }
// public yarnwrap.util.math.Vec3d shiftHue(float red,float green,float blue,float hueOffset) { return new yarnwrap.util.math.Vec3d(wrapperContained.shiftHue(red,green,blue,hueOffset)); }
// public void shootParticles(int direction,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,yarnwrap.particle.SimpleParticleType particleType) { wrapperContained.shootParticles(direction,pos.wrapperContained,random.wrapperContained,particleType.wrapperContained); }
public void stopJukeboxSongAndUpdate(yarnwrap.util.math.BlockPos jukeboxPos) { wrapperContained.stopJukeboxSongAndUpdate(jukeboxPos.wrapperContained); }
public void playJukeboxSong(yarnwrap.registry.entry.RegistryEntry song,yarnwrap.util.math.BlockPos jukeboxPos) { wrapperContained.playJukeboxSong(song.wrapperContained,jukeboxPos.wrapperContained); }
// public void stopJukeboxSong(yarnwrap.util.math.BlockPos jukeboxPos) { wrapperContained.stopJukeboxSong(jukeboxPos.wrapperContained); }
public void renderFilledBoxFace(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.util.math.Direction face,float minX,float minY,float minZ,float maxX,float maxY,float maxZ,float red,float green,float blue,float alpha) { wrapperContained.renderFilledBoxFace(matrices.wrapperContained,vertexConsumer.wrapperContained,face.wrapperContained,minX,minY,minZ,maxX,maxY,maxZ,red,green,blue,alpha); }
public void addParticle(yarnwrap.particle.ParticleEffect parameters,boolean shouldAlwaysSpawn,boolean important,double x,double y,double z,double velocityX,double velocityY,double velocityZ) { wrapperContained.addParticle(parameters.wrapperContained,shouldAlwaysSpawn,important,x,y,z,velocityX,velocityY,velocityZ); }
public void processGlobalEvent(int eventId,yarnwrap.util.math.BlockPos pos,int data) { wrapperContained.processGlobalEvent(eventId,pos.wrapperContained,data); }
public void processWorldEvent(int eventId,yarnwrap.util.math.BlockPos pos,int data) { wrapperContained.processWorldEvent(eventId,pos.wrapperContained,data); }
public void addParticle(yarnwrap.particle.ParticleEffect parameters,boolean shouldAlwaysSpawn,double x,double y,double z,double velocityX,double velocityY,double velocityZ) { wrapperContained.addParticle(parameters.wrapperContained,shouldAlwaysSpawn,x,y,z,velocityX,velocityY,velocityZ); }
public void setBlockBreakingInfo(int entityId,yarnwrap.util.math.BlockPos pos,int stage) { wrapperContained.setBlockBreakingInfo(entityId,pos.wrapperContained,stage); }
public void updateBlock(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState oldState,yarnwrap.block.BlockState newState,int flags) { wrapperContained.updateBlock(world.wrapperContained,pos.wrapperContained,oldState.wrapperContained,newState.wrapperContained,flags); }
public void scheduleBlockRender(int x,int y,int z) { wrapperContained.scheduleBlockRender(x,y,z); }

}