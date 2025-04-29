package yarnwrap.client.render;
public class WorldRenderer { public net.minecraft.client.render.WorldRenderer wrapperContained; public WorldRenderer(net.minecraft.client.render.WorldRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int rainSoundCounter() { return wrapperContained.rainSoundCounter; }
// public void rainSoundCounter(int value) { wrapperContained.rainSoundCounter = value; }
// public static int rainSoundCounter() { return net.minecraft.client.render.WorldRenderer.rainSoundCounter; }
// public static void rainSoundCounter(int value, ) { net.minecraft.client.render.WorldRenderer.rainSoundCounter = value; }

// public float[] NORMAL_LINE_DX() { return wrapperContained.NORMAL_LINE_DX; }
// public void NORMAL_LINE_DX(float[] value) { wrapperContained.NORMAL_LINE_DX = value; }
// public static float[] NORMAL_LINE_DX() { return net.minecraft.client.render.WorldRenderer.NORMAL_LINE_DX; }
// public static void NORMAL_LINE_DX(float[] value, ) { net.minecraft.client.render.WorldRenderer.NORMAL_LINE_DX = value; }

// public float[] NORMAL_LINE_DZ() { return wrapperContained.NORMAL_LINE_DZ; }
// public void NORMAL_LINE_DZ(float[] value) { wrapperContained.NORMAL_LINE_DZ = value; }
// public static float[] NORMAL_LINE_DZ() { return net.minecraft.client.render.WorldRenderer.NORMAL_LINE_DZ; }
// public static void NORMAL_LINE_DZ(float[] value, ) { net.minecraft.client.render.WorldRenderer.NORMAL_LINE_DZ = value; }

// public yarnwrap.util.Identifier RAIN() { return new yarnwrap.util.Identifier(wrapperContained.RAIN); }
// public void RAIN(yarnwrap.util.Identifier value) { wrapperContained.RAIN = value.wrapperContained; }
// public static yarnwrap.util.Identifier RAIN() { return new yarnwrap.util.Identifier(net.minecraft.client.render.WorldRenderer.RAIN); }
// public static void RAIN(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.WorldRenderer.RAIN = value.wrapperContained; }

// public yarnwrap.util.Identifier SNOW() { return new yarnwrap.util.Identifier(wrapperContained.SNOW); }
// public void SNOW(yarnwrap.util.Identifier value) { wrapperContained.SNOW = value.wrapperContained; }
// public static yarnwrap.util.Identifier SNOW() { return new yarnwrap.util.Identifier(net.minecraft.client.render.WorldRenderer.SNOW); }
// public static void SNOW(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.WorldRenderer.SNOW = value.wrapperContained; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectMap blockBreakingProgressions() { return wrapperContained.blockBreakingProgressions; }
// public void blockBreakingProgressions(it.unimi.dsi.fastutil.longs.Long2ObjectMap value) { wrapperContained.blockBreakingProgressions = value; }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectMap blockBreakingProgressions() { return net.minecraft.client.render.WorldRenderer.blockBreakingProgressions; }
// public static void blockBreakingProgressions(it.unimi.dsi.fastutil.longs.Long2ObjectMap value, ) { net.minecraft.client.render.WorldRenderer.blockBreakingProgressions = value; }

// public yarnwrap.client.render.BufferBuilderStorage bufferBuilders() { return new yarnwrap.client.render.BufferBuilderStorage(wrapperContained.bufferBuilders); }
// public void bufferBuilders(yarnwrap.client.render.BufferBuilderStorage value) { wrapperContained.bufferBuilders = value.wrapperContained; }
// public static yarnwrap.client.render.BufferBuilderStorage bufferBuilders() { return new yarnwrap.client.render.BufferBuilderStorage(net.minecraft.client.render.WorldRenderer.bufferBuilders); }
// public static void bufferBuilders(yarnwrap.client.render.BufferBuilderStorage value, ) { net.minecraft.client.render.WorldRenderer.bufferBuilders = value.wrapperContained; }

// public yarnwrap.client.render.FpsSmoother chunkUpdateSmoother() { return new yarnwrap.client.render.FpsSmoother(wrapperContained.chunkUpdateSmoother); }
// public void chunkUpdateSmoother(yarnwrap.client.render.FpsSmoother value) { wrapperContained.chunkUpdateSmoother = value.wrapperContained; }
// public static yarnwrap.client.render.FpsSmoother chunkUpdateSmoother() { return new yarnwrap.client.render.FpsSmoother(net.minecraft.client.render.WorldRenderer.chunkUpdateSmoother); }
// public static void chunkUpdateSmoother(yarnwrap.client.render.FpsSmoother value, ) { net.minecraft.client.render.WorldRenderer.chunkUpdateSmoother = value.wrapperContained; }

// public yarnwrap.client.gl.Framebuffer translucentFramebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.translucentFramebuffer); }
// public void translucentFramebuffer(yarnwrap.client.gl.Framebuffer value) { wrapperContained.translucentFramebuffer = value.wrapperContained; }
// public static yarnwrap.client.gl.Framebuffer translucentFramebuffer() { return new yarnwrap.client.gl.Framebuffer(net.minecraft.client.render.WorldRenderer.translucentFramebuffer); }
// public static void translucentFramebuffer(yarnwrap.client.gl.Framebuffer value, ) { net.minecraft.client.render.WorldRenderer.translucentFramebuffer = value.wrapperContained; }

// public yarnwrap.client.gl.Framebuffer entityFramebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.entityFramebuffer); }
// public void entityFramebuffer(yarnwrap.client.gl.Framebuffer value) { wrapperContained.entityFramebuffer = value.wrapperContained; }
// public static yarnwrap.client.gl.Framebuffer entityFramebuffer() { return new yarnwrap.client.gl.Framebuffer(net.minecraft.client.render.WorldRenderer.entityFramebuffer); }
// public static void entityFramebuffer(yarnwrap.client.gl.Framebuffer value, ) { net.minecraft.client.render.WorldRenderer.entityFramebuffer = value.wrapperContained; }

// public yarnwrap.client.gl.Framebuffer particlesFramebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.particlesFramebuffer); }
// public void particlesFramebuffer(yarnwrap.client.gl.Framebuffer value) { wrapperContained.particlesFramebuffer = value.wrapperContained; }
// public static yarnwrap.client.gl.Framebuffer particlesFramebuffer() { return new yarnwrap.client.gl.Framebuffer(net.minecraft.client.render.WorldRenderer.particlesFramebuffer); }
// public static void particlesFramebuffer(yarnwrap.client.gl.Framebuffer value, ) { net.minecraft.client.render.WorldRenderer.particlesFramebuffer = value.wrapperContained; }

// public yarnwrap.client.gl.Framebuffer weatherFramebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.weatherFramebuffer); }
// public void weatherFramebuffer(yarnwrap.client.gl.Framebuffer value) { wrapperContained.weatherFramebuffer = value.wrapperContained; }
// public static yarnwrap.client.gl.Framebuffer weatherFramebuffer() { return new yarnwrap.client.gl.Framebuffer(net.minecraft.client.render.WorldRenderer.weatherFramebuffer); }
// public static void weatherFramebuffer(yarnwrap.client.gl.Framebuffer value, ) { net.minecraft.client.render.WorldRenderer.weatherFramebuffer = value.wrapperContained; }

// public yarnwrap.client.gl.Framebuffer cloudsFramebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.cloudsFramebuffer); }
// public void cloudsFramebuffer(yarnwrap.client.gl.Framebuffer value) { wrapperContained.cloudsFramebuffer = value.wrapperContained; }
// public static yarnwrap.client.gl.Framebuffer cloudsFramebuffer() { return new yarnwrap.client.gl.Framebuffer(net.minecraft.client.render.WorldRenderer.cloudsFramebuffer); }
// public static void cloudsFramebuffer(yarnwrap.client.gl.Framebuffer value, ) { net.minecraft.client.render.WorldRenderer.cloudsFramebuffer = value.wrapperContained; }

// public yarnwrap.client.gl.PostEffectProcessor transparencyPostProcessor() { return new yarnwrap.client.gl.PostEffectProcessor(wrapperContained.transparencyPostProcessor); }
// public void transparencyPostProcessor(yarnwrap.client.gl.PostEffectProcessor value) { wrapperContained.transparencyPostProcessor = value.wrapperContained; }
// public static yarnwrap.client.gl.PostEffectProcessor transparencyPostProcessor() { return new yarnwrap.client.gl.PostEffectProcessor(net.minecraft.client.render.WorldRenderer.transparencyPostProcessor); }
// public static void transparencyPostProcessor(yarnwrap.client.gl.PostEffectProcessor value, ) { net.minecraft.client.render.WorldRenderer.transparencyPostProcessor = value.wrapperContained; }

// public yarnwrap.client.render.Frustum frustum() { return new yarnwrap.client.render.Frustum(wrapperContained.frustum); }
// public void frustum(yarnwrap.client.render.Frustum value) { wrapperContained.frustum = value.wrapperContained; }
// public static yarnwrap.client.render.Frustum frustum() { return new yarnwrap.client.render.Frustum(net.minecraft.client.render.WorldRenderer.frustum); }
// public static void frustum(yarnwrap.client.render.Frustum value, ) { net.minecraft.client.render.WorldRenderer.frustum = value.wrapperContained; }

// public yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher blockEntityRenderDispatcher() { return new yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher(wrapperContained.blockEntityRenderDispatcher); }
// public void blockEntityRenderDispatcher(yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher value) { wrapperContained.blockEntityRenderDispatcher = value.wrapperContained; }
// public static yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher blockEntityRenderDispatcher() { return new yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher(net.minecraft.client.render.WorldRenderer.blockEntityRenderDispatcher); }
// public static void blockEntityRenderDispatcher(yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher value, ) { net.minecraft.client.render.WorldRenderer.blockEntityRenderDispatcher = value.wrapperContained; }

// public java.util.Set noCullingBlockEntities() { return wrapperContained.noCullingBlockEntities; }
// public void noCullingBlockEntities(java.util.Set value) { wrapperContained.noCullingBlockEntities = value; }
// public static java.util.Set noCullingBlockEntities() { return net.minecraft.client.render.WorldRenderer.noCullingBlockEntities; }
// public static void noCullingBlockEntities(java.util.Set value, ) { net.minecraft.client.render.WorldRenderer.noCullingBlockEntities = value; }

// public yarnwrap.client.render.Frustum capturedFrustum() { return new yarnwrap.client.render.Frustum(wrapperContained.capturedFrustum); }
// public void capturedFrustum(yarnwrap.client.render.Frustum value) { wrapperContained.capturedFrustum = value.wrapperContained; }
// public static yarnwrap.client.render.Frustum capturedFrustum() { return new yarnwrap.client.render.Frustum(net.minecraft.client.render.WorldRenderer.capturedFrustum); }
// public static void capturedFrustum(yarnwrap.client.render.Frustum value, ) { net.minecraft.client.render.WorldRenderer.capturedFrustum = value.wrapperContained; }

// public it.unimi.dsi.fastutil.ints.Int2ObjectMap blockBreakingInfos() { return wrapperContained.blockBreakingInfos; }
// public void blockBreakingInfos(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.blockBreakingInfos = value; }
// public static it.unimi.dsi.fastutil.ints.Int2ObjectMap blockBreakingInfos() { return net.minecraft.client.render.WorldRenderer.blockBreakingInfos; }
// public static void blockBreakingInfos(it.unimi.dsi.fastutil.ints.Int2ObjectMap value, ) { net.minecraft.client.render.WorldRenderer.blockBreakingInfos = value; }

// public yarnwrap.client.gl.PostEffectProcessor entityOutlinePostProcessor() { return new yarnwrap.client.gl.PostEffectProcessor(wrapperContained.entityOutlinePostProcessor); }
// public void entityOutlinePostProcessor(yarnwrap.client.gl.PostEffectProcessor value) { wrapperContained.entityOutlinePostProcessor = value.wrapperContained; }
// public static yarnwrap.client.gl.PostEffectProcessor entityOutlinePostProcessor() { return new yarnwrap.client.gl.PostEffectProcessor(net.minecraft.client.render.WorldRenderer.entityOutlinePostProcessor); }
// public static void entityOutlinePostProcessor(yarnwrap.client.gl.PostEffectProcessor value, ) { net.minecraft.client.render.WorldRenderer.entityOutlinePostProcessor = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.render.WorldRenderer.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.render.WorldRenderer.LOGGER = value; }

// public yarnwrap.util.Identifier END_SKY() { return new yarnwrap.util.Identifier(wrapperContained.END_SKY); }
// public void END_SKY(yarnwrap.util.Identifier value) { wrapperContained.END_SKY = value.wrapperContained; }
// public static yarnwrap.util.Identifier END_SKY() { return new yarnwrap.util.Identifier(net.minecraft.client.render.WorldRenderer.END_SKY); }
// public static void END_SKY(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.WorldRenderer.END_SKY = value.wrapperContained; }

// public int viewDistance() { return wrapperContained.viewDistance; }
// public void viewDistance(int value) { wrapperContained.viewDistance = value; }
// public static int viewDistance() { return net.minecraft.client.render.WorldRenderer.viewDistance; }
// public static void viewDistance(int value, ) { net.minecraft.client.render.WorldRenderer.viewDistance = value; }

// public double lastCameraYaw() { return wrapperContained.lastCameraYaw; }
// public void lastCameraYaw(double value) { wrapperContained.lastCameraYaw = value; }
// public static double lastCameraYaw() { return net.minecraft.client.render.WorldRenderer.lastCameraYaw; }
// public static void lastCameraYaw(double value, ) { net.minecraft.client.render.WorldRenderer.lastCameraYaw = value; }

// public org.joml.Vector4f[] capturedFrustumOrientation() { return wrapperContained.capturedFrustumOrientation; }
// public void capturedFrustumOrientation(org.joml.Vector4f[] value) { wrapperContained.capturedFrustumOrientation = value; }
// public static org.joml.Vector4f[] capturedFrustumOrientation() { return net.minecraft.client.render.WorldRenderer.capturedFrustumOrientation; }
// public static void capturedFrustumOrientation(org.joml.Vector4f[] value, ) { net.minecraft.client.render.WorldRenderer.capturedFrustumOrientation = value; }

// public double lastCameraX() { return wrapperContained.lastCameraX; }
// public void lastCameraX(double value) { wrapperContained.lastCameraX = value; }
// public static double lastCameraX() { return net.minecraft.client.render.WorldRenderer.lastCameraX; }
// public static void lastCameraX(double value, ) { net.minecraft.client.render.WorldRenderer.lastCameraX = value; }

// public yarnwrap.util.Identifier FORCEFIELD() { return new yarnwrap.util.Identifier(wrapperContained.FORCEFIELD); }
// public void FORCEFIELD(yarnwrap.util.Identifier value) { wrapperContained.FORCEFIELD = value.wrapperContained; }
// public static yarnwrap.util.Identifier FORCEFIELD() { return new yarnwrap.util.Identifier(net.minecraft.client.render.WorldRenderer.FORCEFIELD); }
// public static void FORCEFIELD(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.WorldRenderer.FORCEFIELD = value.wrapperContained; }

// public yarnwrap.util.math.Vec3d lastCloudsColor() { return new yarnwrap.util.math.Vec3d(wrapperContained.lastCloudsColor); }
// public void lastCloudsColor(yarnwrap.util.math.Vec3d value) { wrapperContained.lastCloudsColor = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d lastCloudsColor() { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.WorldRenderer.lastCloudsColor); }
// public static void lastCloudsColor(yarnwrap.util.math.Vec3d value, ) { net.minecraft.client.render.WorldRenderer.lastCloudsColor = value.wrapperContained; }

// public int ticks() { return wrapperContained.ticks; }
// public void ticks(int value) { wrapperContained.ticks = value; }
// public static int ticks() { return net.minecraft.client.render.WorldRenderer.ticks; }
// public static void ticks(int value, ) { net.minecraft.client.render.WorldRenderer.ticks = value; }

// public yarnwrap.client.option.CloudRenderMode lastCloudRenderMode() { return new yarnwrap.client.option.CloudRenderMode(wrapperContained.lastCloudRenderMode); }
// public void lastCloudRenderMode(yarnwrap.client.option.CloudRenderMode value) { wrapperContained.lastCloudRenderMode = value.wrapperContained; }
// public static yarnwrap.client.option.CloudRenderMode lastCloudRenderMode() { return new yarnwrap.client.option.CloudRenderMode(net.minecraft.client.render.WorldRenderer.lastCloudRenderMode); }
// public static void lastCloudRenderMode(yarnwrap.client.option.CloudRenderMode value, ) { net.minecraft.client.render.WorldRenderer.lastCloudRenderMode = value.wrapperContained; }

// public double lastCameraY() { return wrapperContained.lastCameraY; }
// public void lastCameraY(double value) { wrapperContained.lastCameraY = value; }
// public static double lastCameraY() { return net.minecraft.client.render.WorldRenderer.lastCameraY; }
// public static void lastCameraY(double value, ) { net.minecraft.client.render.WorldRenderer.lastCameraY = value; }

// public int lastCloudsBlockX() { return wrapperContained.lastCloudsBlockX; }
// public void lastCloudsBlockX(int value) { wrapperContained.lastCloudsBlockX = value; }
// public static int lastCloudsBlockX() { return net.minecraft.client.render.WorldRenderer.lastCloudsBlockX; }
// public static void lastCloudsBlockX(int value, ) { net.minecraft.client.render.WorldRenderer.lastCloudsBlockX = value; }

// public double lastTranslucentSortX() { return wrapperContained.lastTranslucentSortX; }
// public void lastTranslucentSortX(double value) { wrapperContained.lastTranslucentSortX = value; }
// public static double lastTranslucentSortX() { return net.minecraft.client.render.WorldRenderer.lastTranslucentSortX; }
// public static void lastTranslucentSortX(double value, ) { net.minecraft.client.render.WorldRenderer.lastTranslucentSortX = value; }

// public int cameraChunkX() { return wrapperContained.cameraChunkX; }
// public void cameraChunkX(int value) { wrapperContained.cameraChunkX = value; }
// public static int cameraChunkX() { return net.minecraft.client.render.WorldRenderer.cameraChunkX; }
// public static void cameraChunkX(int value, ) { net.minecraft.client.render.WorldRenderer.cameraChunkX = value; }

// public yarnwrap.client.world.ClientWorld world() { return new yarnwrap.client.world.ClientWorld(wrapperContained.world); }
// public void world(yarnwrap.client.world.ClientWorld value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.client.world.ClientWorld world() { return new yarnwrap.client.world.ClientWorld(net.minecraft.client.render.WorldRenderer.world); }
// public static void world(yarnwrap.client.world.ClientWorld value, ) { net.minecraft.client.render.WorldRenderer.world = value.wrapperContained; }

// public yarnwrap.client.gl.VertexBuffer lightSkyBuffer() { return new yarnwrap.client.gl.VertexBuffer(wrapperContained.lightSkyBuffer); }
// public void lightSkyBuffer(yarnwrap.client.gl.VertexBuffer value) { wrapperContained.lightSkyBuffer = value.wrapperContained; }
// public static yarnwrap.client.gl.VertexBuffer lightSkyBuffer() { return new yarnwrap.client.gl.VertexBuffer(net.minecraft.client.render.WorldRenderer.lightSkyBuffer); }
// public static void lightSkyBuffer(yarnwrap.client.gl.VertexBuffer value, ) { net.minecraft.client.render.WorldRenderer.lightSkyBuffer = value.wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.render.WorldRenderer.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.render.WorldRenderer.client = value.wrapperContained; }

// public int regularEntityCount() { return wrapperContained.regularEntityCount; }
// public void regularEntityCount(int value) { wrapperContained.regularEntityCount = value; }
// public static int regularEntityCount() { return net.minecraft.client.render.WorldRenderer.regularEntityCount; }
// public static void regularEntityCount(int value, ) { net.minecraft.client.render.WorldRenderer.regularEntityCount = value; }

// public boolean shouldCaptureFrustum() { return wrapperContained.shouldCaptureFrustum; }
// public void shouldCaptureFrustum(boolean value) { wrapperContained.shouldCaptureFrustum = value; }
// public static boolean shouldCaptureFrustum() { return net.minecraft.client.render.WorldRenderer.shouldCaptureFrustum; }
// public static void shouldCaptureFrustum(boolean value, ) { net.minecraft.client.render.WorldRenderer.shouldCaptureFrustum = value; }

// public org.joml.Vector3d capturedFrustumPosition() { return wrapperContained.capturedFrustumPosition; }
// public void capturedFrustumPosition(org.joml.Vector3d value) { wrapperContained.capturedFrustumPosition = value; }
// public static org.joml.Vector3d capturedFrustumPosition() { return net.minecraft.client.render.WorldRenderer.capturedFrustumPosition; }
// public static void capturedFrustumPosition(org.joml.Vector3d value, ) { net.minecraft.client.render.WorldRenderer.capturedFrustumPosition = value; }

// public yarnwrap.client.gl.VertexBuffer cloudsBuffer() { return new yarnwrap.client.gl.VertexBuffer(wrapperContained.cloudsBuffer); }
// public void cloudsBuffer(yarnwrap.client.gl.VertexBuffer value) { wrapperContained.cloudsBuffer = value.wrapperContained; }
// public static yarnwrap.client.gl.VertexBuffer cloudsBuffer() { return new yarnwrap.client.gl.VertexBuffer(net.minecraft.client.render.WorldRenderer.cloudsBuffer); }
// public static void cloudsBuffer(yarnwrap.client.gl.VertexBuffer value, ) { net.minecraft.client.render.WorldRenderer.cloudsBuffer = value.wrapperContained; }

// public net.minecraft.util.math.Direction[] DIRECTIONS() { return wrapperContained.DIRECTIONS; }
// public void DIRECTIONS(net.minecraft.util.math.Direction[] value) { wrapperContained.DIRECTIONS = value; }
public static net.minecraft.util.math.Direction[] DIRECTIONS() { return net.minecraft.client.render.WorldRenderer.DIRECTIONS; }
// public static void DIRECTIONS(net.minecraft.util.math.Direction[] value, ) { net.minecraft.client.render.WorldRenderer.DIRECTIONS = value; }

// public double lastCameraZ() { return wrapperContained.lastCameraZ; }
// public void lastCameraZ(double value) { wrapperContained.lastCameraZ = value; }
// public static double lastCameraZ() { return net.minecraft.client.render.WorldRenderer.lastCameraZ; }
// public static void lastCameraZ(double value, ) { net.minecraft.client.render.WorldRenderer.lastCameraZ = value; }

// public int lastCloudsBlockY() { return wrapperContained.lastCloudsBlockY; }
// public void lastCloudsBlockY(int value) { wrapperContained.lastCloudsBlockY = value; }
// public static int lastCloudsBlockY() { return net.minecraft.client.render.WorldRenderer.lastCloudsBlockY; }
// public static void lastCloudsBlockY(int value, ) { net.minecraft.client.render.WorldRenderer.lastCloudsBlockY = value; }

// public yarnwrap.util.Identifier MOON_PHASES() { return new yarnwrap.util.Identifier(wrapperContained.MOON_PHASES); }
// public void MOON_PHASES(yarnwrap.util.Identifier value) { wrapperContained.MOON_PHASES = value.wrapperContained; }
// public static yarnwrap.util.Identifier MOON_PHASES() { return new yarnwrap.util.Identifier(net.minecraft.client.render.WorldRenderer.MOON_PHASES); }
// public static void MOON_PHASES(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.WorldRenderer.MOON_PHASES = value.wrapperContained; }

// public yarnwrap.client.gl.Framebuffer entityOutlinesFramebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.entityOutlinesFramebuffer); }
// public void entityOutlinesFramebuffer(yarnwrap.client.gl.Framebuffer value) { wrapperContained.entityOutlinesFramebuffer = value.wrapperContained; }
// public static yarnwrap.client.gl.Framebuffer entityOutlinesFramebuffer() { return new yarnwrap.client.gl.Framebuffer(net.minecraft.client.render.WorldRenderer.entityOutlinesFramebuffer); }
// public static void entityOutlinesFramebuffer(yarnwrap.client.gl.Framebuffer value, ) { net.minecraft.client.render.WorldRenderer.entityOutlinesFramebuffer = value.wrapperContained; }

// public yarnwrap.client.gl.VertexBuffer darkSkyBuffer() { return new yarnwrap.client.gl.VertexBuffer(wrapperContained.darkSkyBuffer); }
// public void darkSkyBuffer(yarnwrap.client.gl.VertexBuffer value) { wrapperContained.darkSkyBuffer = value.wrapperContained; }
// public static yarnwrap.client.gl.VertexBuffer darkSkyBuffer() { return new yarnwrap.client.gl.VertexBuffer(net.minecraft.client.render.WorldRenderer.darkSkyBuffer); }
// public static void darkSkyBuffer(yarnwrap.client.gl.VertexBuffer value, ) { net.minecraft.client.render.WorldRenderer.darkSkyBuffer = value.wrapperContained; }

// public double lastTranslucentSortY() { return wrapperContained.lastTranslucentSortY; }
// public void lastTranslucentSortY(double value) { wrapperContained.lastTranslucentSortY = value; }
// public static double lastTranslucentSortY() { return net.minecraft.client.render.WorldRenderer.lastTranslucentSortY; }
// public static void lastTranslucentSortY(double value, ) { net.minecraft.client.render.WorldRenderer.lastTranslucentSortY = value; }

// public int cameraChunkY() { return wrapperContained.cameraChunkY; }
// public void cameraChunkY(int value) { wrapperContained.cameraChunkY = value; }
// public static int cameraChunkY() { return net.minecraft.client.render.WorldRenderer.cameraChunkY; }
// public static void cameraChunkY(int value, ) { net.minecraft.client.render.WorldRenderer.cameraChunkY = value; }

// public boolean cloudsDirty() { return wrapperContained.cloudsDirty; }
// public void cloudsDirty(boolean value) { wrapperContained.cloudsDirty = value; }
// public static boolean cloudsDirty() { return net.minecraft.client.render.WorldRenderer.cloudsDirty; }
// public static void cloudsDirty(boolean value, ) { net.minecraft.client.render.WorldRenderer.cloudsDirty = value; }

// public yarnwrap.util.Identifier CLOUDS() { return new yarnwrap.util.Identifier(wrapperContained.CLOUDS); }
// public void CLOUDS(yarnwrap.util.Identifier value) { wrapperContained.CLOUDS = value.wrapperContained; }
// public static yarnwrap.util.Identifier CLOUDS() { return new yarnwrap.util.Identifier(net.minecraft.client.render.WorldRenderer.CLOUDS); }
// public static void CLOUDS(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.WorldRenderer.CLOUDS = value.wrapperContained; }

// public yarnwrap.client.render.entity.EntityRenderDispatcher entityRenderDispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(wrapperContained.entityRenderDispatcher); }
// public void entityRenderDispatcher(yarnwrap.client.render.entity.EntityRenderDispatcher value) { wrapperContained.entityRenderDispatcher = value.wrapperContained; }
// public static yarnwrap.client.render.entity.EntityRenderDispatcher entityRenderDispatcher() { return new yarnwrap.client.render.entity.EntityRenderDispatcher(net.minecraft.client.render.WorldRenderer.entityRenderDispatcher); }
// public static void entityRenderDispatcher(yarnwrap.client.render.entity.EntityRenderDispatcher value, ) { net.minecraft.client.render.WorldRenderer.entityRenderDispatcher = value.wrapperContained; }

// public int blockEntityCount() { return wrapperContained.blockEntityCount; }
// public void blockEntityCount(int value) { wrapperContained.blockEntityCount = value; }
// public static int blockEntityCount() { return net.minecraft.client.render.WorldRenderer.blockEntityCount; }
// public static void blockEntityCount(int value, ) { net.minecraft.client.render.WorldRenderer.blockEntityCount = value; }

// public yarnwrap.util.Identifier SUN() { return new yarnwrap.util.Identifier(wrapperContained.SUN); }
// public void SUN(yarnwrap.util.Identifier value) { wrapperContained.SUN = value.wrapperContained; }
// public static yarnwrap.util.Identifier SUN() { return new yarnwrap.util.Identifier(net.minecraft.client.render.WorldRenderer.SUN); }
// public static void SUN(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.WorldRenderer.SUN = value.wrapperContained; }

// public yarnwrap.client.render.BuiltChunkStorage chunks() { return new yarnwrap.client.render.BuiltChunkStorage(wrapperContained.chunks); }
// public void chunks(yarnwrap.client.render.BuiltChunkStorage value) { wrapperContained.chunks = value.wrapperContained; }
// public static yarnwrap.client.render.BuiltChunkStorage chunks() { return new yarnwrap.client.render.BuiltChunkStorage(net.minecraft.client.render.WorldRenderer.chunks); }
// public static void chunks(yarnwrap.client.render.BuiltChunkStorage value, ) { net.minecraft.client.render.WorldRenderer.chunks = value.wrapperContained; }

// public yarnwrap.client.gl.VertexBuffer starsBuffer() { return new yarnwrap.client.gl.VertexBuffer(wrapperContained.starsBuffer); }
// public void starsBuffer(yarnwrap.client.gl.VertexBuffer value) { wrapperContained.starsBuffer = value.wrapperContained; }
// public static yarnwrap.client.gl.VertexBuffer starsBuffer() { return new yarnwrap.client.gl.VertexBuffer(net.minecraft.client.render.WorldRenderer.starsBuffer); }
// public static void starsBuffer(yarnwrap.client.gl.VertexBuffer value, ) { net.minecraft.client.render.WorldRenderer.starsBuffer = value.wrapperContained; }

// public double lastCameraPitch() { return wrapperContained.lastCameraPitch; }
// public void lastCameraPitch(double value) { wrapperContained.lastCameraPitch = value; }
// public static double lastCameraPitch() { return net.minecraft.client.render.WorldRenderer.lastCameraPitch; }
// public static void lastCameraPitch(double value, ) { net.minecraft.client.render.WorldRenderer.lastCameraPitch = value; }

// public int lastCloudsBlockZ() { return wrapperContained.lastCloudsBlockZ; }
// public void lastCloudsBlockZ(int value) { wrapperContained.lastCloudsBlockZ = value; }
// public static int lastCloudsBlockZ() { return net.minecraft.client.render.WorldRenderer.lastCloudsBlockZ; }
// public static void lastCloudsBlockZ(int value, ) { net.minecraft.client.render.WorldRenderer.lastCloudsBlockZ = value; }

// public double lastTranslucentSortZ() { return wrapperContained.lastTranslucentSortZ; }
// public void lastTranslucentSortZ(double value) { wrapperContained.lastTranslucentSortZ = value; }
// public static double lastTranslucentSortZ() { return net.minecraft.client.render.WorldRenderer.lastTranslucentSortZ; }
// public static void lastTranslucentSortZ(double value, ) { net.minecraft.client.render.WorldRenderer.lastTranslucentSortZ = value; }

// public java.util.Map playingSongs() { return wrapperContained.playingSongs; }
// public void playingSongs(java.util.Map value) { wrapperContained.playingSongs = value; }
// public static java.util.Map playingSongs() { return net.minecraft.client.render.WorldRenderer.playingSongs; }
// public static void playingSongs(java.util.Map value, ) { net.minecraft.client.render.WorldRenderer.playingSongs = value; }

// public int cameraChunkZ() { return wrapperContained.cameraChunkZ; }
// public void cameraChunkZ(int value) { wrapperContained.cameraChunkZ = value; }
// public static int cameraChunkZ() { return net.minecraft.client.render.WorldRenderer.cameraChunkZ; }
// public static void cameraChunkZ(int value, ) { net.minecraft.client.render.WorldRenderer.cameraChunkZ = value; }

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

public WorldRenderer(yarnwrap.client.MinecraftClient client,yarnwrap.client.render.entity.EntityRenderDispatcher entityRenderDispatcher,yarnwrap.client.render.block.entity.BlockEntityRenderDispatcher blockEntityRenderDispatcher,yarnwrap.client.render.BufferBuilderStorage bufferBuilders) { this.wrapperContained = new net.minecraft.client.render.WorldRenderer(client.wrapperContained,entityRenderDispatcher.wrapperContained,blockEntityRenderDispatcher.wrapperContained,bufferBuilders.wrapperContained); }
// public void scheduleSectionRender(yarnwrap.util.math.BlockPos pos,boolean important) { wrapperContained.scheduleSectionRender(pos.wrapperContained,important); }
// public static void scheduleSectionRender(yarnwrap.util.math.BlockPos pos,boolean important, ) { net.minecraft.client.render.WorldRenderer.scheduleSectionRender(pos.wrapperContained,important); }
public void scheduleBlockRenders(int x,int y,int z) { wrapperContained.scheduleBlockRenders(x,y,z); }
// public static void scheduleBlockRenders(int x,int y,int z, ) { net.minecraft.client.render.WorldRenderer.scheduleBlockRenders(x,y,z); }
public void scheduleBlockRenders(int minX,int minY,int minZ,int maxX,int maxY,int maxZ) { wrapperContained.scheduleBlockRenders(minX,minY,minZ,maxX,maxY,maxZ); }
// public static void scheduleBlockRenders(int minX,int minY,int minZ,int maxX,int maxY,int maxZ, ) { net.minecraft.client.render.WorldRenderer.scheduleBlockRenders(minX,minY,minZ,maxX,maxY,maxZ); }
public void scheduleBlockRerenderIfNeeded(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState old,yarnwrap.block.BlockState updated) { wrapperContained.scheduleBlockRerenderIfNeeded(pos.wrapperContained,old.wrapperContained,updated.wrapperContained); }
// public static void scheduleBlockRerenderIfNeeded(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState old,yarnwrap.block.BlockState updated, ) { net.minecraft.client.render.WorldRenderer.scheduleBlockRerenderIfNeeded(pos.wrapperContained,old.wrapperContained,updated.wrapperContained); }
// public void render(yarnwrap.client.render.RenderTickCounter tickCounter,boolean renderBlockOutline,yarnwrap.client.render.Camera camera,yarnwrap.client.render.GameRenderer gameRenderer,yarnwrap.client.render.LightmapTextureManager lightmapTextureManager) { wrapperContained.render(tickCounter.wrapperContained,renderBlockOutline,camera.wrapperContained,gameRenderer.wrapperContained,lightmapTextureManager.wrapperContained); }
// public static void render(yarnwrap.client.render.RenderTickCounter tickCounter,boolean renderBlockOutline,yarnwrap.client.render.Camera camera,yarnwrap.client.render.GameRenderer gameRenderer,yarnwrap.client.render.LightmapTextureManager lightmapTextureManager, ) { net.minecraft.client.render.WorldRenderer.render(tickCounter.wrapperContained,renderBlockOutline,camera.wrapperContained,gameRenderer.wrapperContained,lightmapTextureManager.wrapperContained); }
// public void drawBlockOutline(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.entity.Entity entity,double cameraX,double cameraY,double cameraZ,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.drawBlockOutline(matrices.wrapperContained,vertexConsumer.wrapperContained,entity.wrapperContained,cameraX,cameraY,cameraZ,pos.wrapperContained,state.wrapperContained); }
// public static void drawBlockOutline(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.entity.Entity entity,double cameraX,double cameraY,double cameraZ,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.client.render.WorldRenderer.drawBlockOutline(matrices.wrapperContained,vertexConsumer.wrapperContained,entity.wrapperContained,cameraX,cameraY,cameraZ,pos.wrapperContained,state.wrapperContained); }
public void tickRainSplashing(yarnwrap.client.render.Camera camera) { wrapperContained.tickRainSplashing(camera.wrapperContained); }
// public static void tickRainSplashing(yarnwrap.client.render.Camera camera, ) { net.minecraft.client.render.WorldRenderer.tickRainSplashing(camera.wrapperContained); }
// public void renderWeather(yarnwrap.client.render.LightmapTextureManager manager,float tickDelta,double cameraX,double cameraY,double cameraZ) { wrapperContained.renderWeather(manager.wrapperContained,tickDelta,cameraX,cameraY,cameraZ); }
// public static void renderWeather(yarnwrap.client.render.LightmapTextureManager manager,float tickDelta,double cameraX,double cameraY,double cameraZ, ) { net.minecraft.client.render.WorldRenderer.renderWeather(manager.wrapperContained,tickDelta,cameraX,cameraY,cameraZ); }
// public void renderEntity(yarnwrap.entity.Entity entity,double cameraX,double cameraY,double cameraZ,float tickDelta,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers) { wrapperContained.renderEntity(entity.wrapperContained,cameraX,cameraY,cameraZ,tickDelta,matrices.wrapperContained,vertexConsumers.wrapperContained); }
// public static void renderEntity(yarnwrap.entity.Entity entity,double cameraX,double cameraY,double cameraZ,float tickDelta,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers, ) { net.minecraft.client.render.WorldRenderer.renderEntity(entity.wrapperContained,cameraX,cameraY,cameraZ,tickDelta,matrices.wrapperContained,vertexConsumers.wrapperContained); }
// public void checkEmpty(yarnwrap.client.util.math.MatrixStack matrices) { wrapperContained.checkEmpty(matrices.wrapperContained); }
// public static void checkEmpty(yarnwrap.client.util.math.MatrixStack matrices, ) { net.minecraft.client.render.WorldRenderer.checkEmpty(matrices.wrapperContained); }
// public void drawBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,double x1,double y1,double z1,double x2,double y2,double z2,float red,float green,float blue,float alpha) { wrapperContained.drawBox(matrices.wrapperContained,vertexConsumer.wrapperContained,x1,y1,z1,x2,y2,z2,red,green,blue,alpha); }
// public static void drawBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,double x1,double y1,double z1,double x2,double y2,double z2,float red,float green,float blue,float alpha, ) { net.minecraft.client.render.WorldRenderer.drawBox(matrices.wrapperContained,vertexConsumer.wrapperContained,x1,y1,z1,x2,y2,z2,red,green,blue,alpha); }
// public void drawBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,double x1,double y1,double z1,double x2,double y2,double z2,float red,float green,float blue,float alpha,float xAxisRed,float yAxisGreen,float zAxisBlue) { wrapperContained.drawBox(matrices.wrapperContained,vertexConsumer.wrapperContained,x1,y1,z1,x2,y2,z2,red,green,blue,alpha,xAxisRed,yAxisGreen,zAxisBlue); }
// public static void drawBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,double x1,double y1,double z1,double x2,double y2,double z2,float red,float green,float blue,float alpha,float xAxisRed,float yAxisGreen,float zAxisBlue, ) { net.minecraft.client.render.WorldRenderer.drawBox(matrices.wrapperContained,vertexConsumer.wrapperContained,x1,y1,z1,x2,y2,z2,red,green,blue,alpha,xAxisRed,yAxisGreen,zAxisBlue); }
// public void drawBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.util.math.Box box,float red,float green,float blue,float alpha) { wrapperContained.drawBox(matrices.wrapperContained,vertexConsumer.wrapperContained,box.wrapperContained,red,green,blue,alpha); }
// public static void drawBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.util.math.Box box,float red,float green,float blue,float alpha, ) { net.minecraft.client.render.WorldRenderer.drawBox(matrices.wrapperContained,vertexConsumer.wrapperContained,box.wrapperContained,red,green,blue,alpha); }
// public void drawShapeOutline(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.util.shape.VoxelShape shape,double offsetX,double offsetY,double offsetZ,float red,float green,float blue,float alpha,boolean colorize) { wrapperContained.drawShapeOutline(matrices.wrapperContained,vertexConsumer.wrapperContained,shape.wrapperContained,offsetX,offsetY,offsetZ,red,green,blue,alpha,colorize); }
// public static void drawShapeOutline(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.util.shape.VoxelShape shape,double offsetX,double offsetY,double offsetZ,float red,float green,float blue,float alpha,boolean colorize, ) { net.minecraft.client.render.WorldRenderer.drawShapeOutline(matrices.wrapperContained,vertexConsumer.wrapperContained,shape.wrapperContained,offsetX,offsetY,offsetZ,red,green,blue,alpha,colorize); }
// public void renderCapturedFrustumVertex(yarnwrap.client.render.VertexConsumer vertexConsumer,org.joml.Matrix4f planeNum) { wrapperContained.renderCapturedFrustumVertex(vertexConsumer.wrapperContained,planeNum); }
// public static void renderCapturedFrustumVertex(yarnwrap.client.render.VertexConsumer vertexConsumer,org.joml.Matrix4f planeNum, ) { net.minecraft.client.render.WorldRenderer.renderCapturedFrustumVertex(vertexConsumer.wrapperContained,planeNum); }
// public void renderCapturedFrustumFace(yarnwrap.client.render.VertexConsumer vertexConsumer,org.joml.Matrix4f plane0,int plane1,int plane2,int plane3,int r,int g,int b) { wrapperContained.renderCapturedFrustumFace(vertexConsumer.wrapperContained,plane0,plane1,plane2,plane3,r,g,b); }
// public static void renderCapturedFrustumFace(yarnwrap.client.render.VertexConsumer vertexConsumer,org.joml.Matrix4f plane0,int plane1,int plane2,int plane3,int r,int g,int b, ) { net.minecraft.client.render.WorldRenderer.renderCapturedFrustumFace(vertexConsumer.wrapperContained,plane0,plane1,plane2,plane3,r,g,b); }
// public yarnwrap.client.render.VertexConsumer method_22986(Object renderLayer) { return new yarnwrap.client.render.VertexConsumer(wrapperContained.method_22986(renderLayer)); }
// public static yarnwrap.client.render.VertexConsumer method_22986(Object renderLayer, ) { return new yarnwrap.client.render.VertexConsumer(net.minecraft.client.render.WorldRenderer.method_22986(renderLayer)); }
// public void removeBlockBreakingInfo(yarnwrap.entity.player.BlockBreakingInfo info) { wrapperContained.removeBlockBreakingInfo(info.wrapperContained); }
// public static void removeBlockBreakingInfo(yarnwrap.entity.player.BlockBreakingInfo info, ) { net.minecraft.client.render.WorldRenderer.removeBlockBreakingInfo(info.wrapperContained); }
// public void renderChunkDebugInfo(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.client.render.Camera camera) { wrapperContained.renderChunkDebugInfo(matrices.wrapperContained,vertexConsumers.wrapperContained,camera.wrapperContained); }
// public static void renderChunkDebugInfo(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.client.render.Camera camera, ) { net.minecraft.client.render.WorldRenderer.renderChunkDebugInfo(matrices.wrapperContained,vertexConsumers.wrapperContained,camera.wrapperContained); }
public yarnwrap.client.gl.Framebuffer getEntityOutlinesFramebuffer() { return new yarnwrap.client.gl.Framebuffer(wrapperContained.getEntityOutlinesFramebuffer()); }
// public static yarnwrap.client.gl.Framebuffer getEntityOutlinesFramebuffer() { return new yarnwrap.client.gl.Framebuffer(net.minecraft.client.render.WorldRenderer.getEntityOutlinesFramebuffer()); }
// public int getLightmapCoordinates(yarnwrap.world.BlockRenderView world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getLightmapCoordinates(world.wrapperContained,state.wrapperContained,pos.wrapperContained); }
// public static int getLightmapCoordinates(yarnwrap.world.BlockRenderView world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.client.render.WorldRenderer.getLightmapCoordinates(world.wrapperContained,state.wrapperContained,pos.wrapperContained); }
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
// public void loadTransparencyPostProcessor() { wrapperContained.loadTransparencyPostProcessor(); }
// public static void loadTransparencyPostProcessor() { net.minecraft.client.render.WorldRenderer.loadTransparencyPostProcessor(); }
// public void resetTransparencyPostProcessor() { wrapperContained.resetTransparencyPostProcessor(); }
// public static void resetTransparencyPostProcessor() { net.minecraft.client.render.WorldRenderer.resetTransparencyPostProcessor(); }
// public void setupFrustum() { wrapperContained.setupFrustum(); }
// public static void setupFrustum() { net.minecraft.client.render.WorldRenderer.setupFrustum(); }
// public yarnwrap.client.render.BuiltBuffer buildCloudsBuffer(yarnwrap.client.render.Tessellator x,double y,double z,double color) { return new yarnwrap.client.render.BuiltBuffer(wrapperContained.buildCloudsBuffer(x.wrapperContained,y,z,color)); }
// public static yarnwrap.client.render.BuiltBuffer buildCloudsBuffer(yarnwrap.client.render.Tessellator x,double y,double z,double color, ) { return new yarnwrap.client.render.BuiltBuffer(net.minecraft.client.render.WorldRenderer.buildCloudsBuffer(x.wrapperContained,y,z,color)); }
public void onResized(int width,int height) { wrapperContained.onResized(width,height); }
// public static void onResized(int width,int height, ) { net.minecraft.client.render.WorldRenderer.onResized(width,height); }
// public void renderWorldBorder(yarnwrap.client.render.Camera camera) { wrapperContained.renderWorldBorder(camera.wrapperContained); }
// public static void renderWorldBorder(yarnwrap.client.render.Camera camera, ) { net.minecraft.client.render.WorldRenderer.renderWorldBorder(camera.wrapperContained); }
public void setWorld(yarnwrap.client.world.ClientWorld world) { wrapperContained.setWorld(world.wrapperContained); }
// public static void setWorld(yarnwrap.client.world.ClientWorld world, ) { net.minecraft.client.render.WorldRenderer.setWorld(world.wrapperContained); }
public void updateNoCullingBlockEntities(java.util.Collection removed,java.util.Collection added) { wrapperContained.updateNoCullingBlockEntities(removed,added); }
// public static void updateNoCullingBlockEntities(java.util.Collection removed,java.util.Collection added, ) { net.minecraft.client.render.WorldRenderer.updateNoCullingBlockEntities(removed,added); }
public int getCompletedChunkCount() { return wrapperContained.getCompletedChunkCount(); }
// public static int getCompletedChunkCount() { return net.minecraft.client.render.WorldRenderer.getCompletedChunkCount(); }
// public void updateEntitiesForSong(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean playing) { wrapperContained.updateEntitiesForSong(world.wrapperContained,pos.wrapperContained,playing); }
// public static void updateEntitiesForSong(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean playing, ) { net.minecraft.client.render.WorldRenderer.updateEntitiesForSong(world.wrapperContained,pos.wrapperContained,playing); }
// public void renderEndSky(yarnwrap.client.util.math.MatrixStack matrices) { wrapperContained.renderEndSky(matrices.wrapperContained); }
// public static void renderEndSky(yarnwrap.client.util.math.MatrixStack matrices, ) { net.minecraft.client.render.WorldRenderer.renderEndSky(matrices.wrapperContained); }
// public void renderLayer(yarnwrap.client.render.RenderLayer renderLayer,double x,double y,double z,org.joml.Matrix4f positionMatrix) { wrapperContained.renderLayer(renderLayer.wrapperContained,x,y,z,positionMatrix); }
// public static void renderLayer(yarnwrap.client.render.RenderLayer renderLayer,double x,double y,double z,org.joml.Matrix4f positionMatrix, ) { net.minecraft.client.render.WorldRenderer.renderLayer(renderLayer.wrapperContained,x,y,z,positionMatrix); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.client.render.WorldRenderer.tick(); }
public void drawEntityOutlinesFramebuffer() { wrapperContained.drawEntityOutlinesFramebuffer(); }
// public static void drawEntityOutlinesFramebuffer() { net.minecraft.client.render.WorldRenderer.drawEntityOutlinesFramebuffer(); }
// public yarnwrap.client.render.BuiltBuffer buildStarsBuffer() { return new yarnwrap.client.render.BuiltBuffer(wrapperContained.buildStarsBuffer()); }
// public static yarnwrap.client.render.BuiltBuffer buildStarsBuffer() { return new yarnwrap.client.render.BuiltBuffer(net.minecraft.client.render.WorldRenderer.buildStarsBuffer()); }
// public void renderSky(org.joml.Matrix4f projectionMatrix,org.joml.Matrix4f tickDelta,float camera,yarnwrap.client.render.Camera thickFog,boolean fogCallback) { wrapperContained.renderSky(projectionMatrix,tickDelta,camera,thickFog.wrapperContained,fogCallback); }
// public static void renderSky(org.joml.Matrix4f projectionMatrix,org.joml.Matrix4f tickDelta,float camera,yarnwrap.client.render.Camera thickFog,boolean fogCallback, ) { net.minecraft.client.render.WorldRenderer.renderSky(projectionMatrix,tickDelta,camera,thickFog.wrapperContained,fogCallback); }
// public void renderFilledBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,double minX,double minY,double minZ,double maxX,double maxY,double maxZ,float red,float green,float blue,float alpha) { wrapperContained.renderFilledBox(matrices.wrapperContained,vertexConsumer.wrapperContained,minX,minY,minZ,maxX,maxY,maxZ,red,green,blue,alpha); }
// public static void renderFilledBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,double minX,double minY,double minZ,double maxX,double maxY,double maxZ,float red,float green,float blue,float alpha, ) { net.minecraft.client.render.WorldRenderer.renderFilledBox(matrices.wrapperContained,vertexConsumer.wrapperContained,minX,minY,minZ,maxX,maxY,maxZ,red,green,blue,alpha); }
// public void renderClouds(yarnwrap.client.util.math.MatrixStack matrices,org.joml.Matrix4f tickDelta,org.joml.Matrix4f cameraX,float cameraY,double cameraZ) { wrapperContained.renderClouds(matrices.wrapperContained,tickDelta,cameraX,cameraY,cameraZ); }
// public static void renderClouds(yarnwrap.client.util.math.MatrixStack matrices,org.joml.Matrix4f tickDelta,org.joml.Matrix4f cameraX,float cameraY,double cameraZ, ) { net.minecraft.client.render.WorldRenderer.renderClouds(matrices.wrapperContained,tickDelta,cameraX,cameraY,cameraZ); }
// public void renderDarkSky() { wrapperContained.renderDarkSky(); }
// public static void renderDarkSky() { net.minecraft.client.render.WorldRenderer.renderDarkSky(); }
public void cleanUp() { wrapperContained.cleanUp(); }
// public static void cleanUp() { net.minecraft.client.render.WorldRenderer.cleanUp(); }
// public yarnwrap.client.option.ParticlesMode getRandomParticleSpawnChance(boolean canSpawnOnMinimal) { return new yarnwrap.client.option.ParticlesMode(wrapperContained.getRandomParticleSpawnChance(canSpawnOnMinimal)); }
// public static yarnwrap.client.option.ParticlesMode getRandomParticleSpawnChance(boolean canSpawnOnMinimal, ) { return new yarnwrap.client.option.ParticlesMode(net.minecraft.client.render.WorldRenderer.getRandomParticleSpawnChance(canSpawnOnMinimal)); }
// public void updateChunks(yarnwrap.client.render.Camera camera) { wrapperContained.updateChunks(camera.wrapperContained); }
// public static void updateChunks(yarnwrap.client.render.Camera camera, ) { net.minecraft.client.render.WorldRenderer.updateChunks(camera.wrapperContained); }
// public boolean canDrawEntityOutlines() { return wrapperContained.canDrawEntityOutlines(); }
// public static boolean canDrawEntityOutlines() { return net.minecraft.client.render.WorldRenderer.canDrawEntityOutlines(); }
public java.lang.String getEntitiesDebugString() { return wrapperContained.getEntitiesDebugString(); }
// public static java.lang.String getEntitiesDebugString() { return net.minecraft.client.render.WorldRenderer.getEntitiesDebugString(); }
// public void setupTerrain(yarnwrap.client.render.Camera camera,yarnwrap.client.render.Frustum frustum,boolean hasForcedFrustum,boolean spectator) { wrapperContained.setupTerrain(camera.wrapperContained,frustum.wrapperContained,hasForcedFrustum,spectator); }
// public static void setupTerrain(yarnwrap.client.render.Camera camera,yarnwrap.client.render.Frustum frustum,boolean hasForcedFrustum,boolean spectator, ) { net.minecraft.client.render.WorldRenderer.setupTerrain(camera.wrapperContained,frustum.wrapperContained,hasForcedFrustum,spectator); }
// public void captureFrustum(org.joml.Matrix4f positionMatrix,org.joml.Matrix4f projectionMatrix,double x,double y,double z,yarnwrap.client.render.Frustum frustum) { wrapperContained.captureFrustum(positionMatrix,projectionMatrix,x,y,z,frustum.wrapperContained); }
// public static void captureFrustum(org.joml.Matrix4f positionMatrix,org.joml.Matrix4f projectionMatrix,double x,double y,double z,yarnwrap.client.render.Frustum frustum, ) { net.minecraft.client.render.WorldRenderer.captureFrustum(positionMatrix,projectionMatrix,x,y,z,frustum.wrapperContained); }
// public void addParticle(yarnwrap.particle.ParticleEffect parameters,double x,double y,double z,double velocityX,double velocityY,double velocityZ) { wrapperContained.addParticle(parameters.wrapperContained,x,y,z,velocityX,velocityY,velocityZ); }
// public static void addParticle(yarnwrap.particle.ParticleEffect parameters,double x,double y,double z,double velocityX,double velocityY,double velocityZ, ) { net.minecraft.client.render.WorldRenderer.addParticle(parameters.wrapperContained,x,y,z,velocityX,velocityY,velocityZ); }
// public void renderLightSky() { wrapperContained.renderLightSky(); }
// public static void renderLightSky() { net.minecraft.client.render.WorldRenderer.renderLightSky(); }
// public void method_3278(yarnwrap.client.render.VertexConsumer minX,Object minY,double minZ,double maxX,double maxY,float maxZ) { wrapperContained.method_3278(minX.wrapperContained,minY,minZ,maxX,maxY,maxZ); }
// public static void method_3278(yarnwrap.client.render.VertexConsumer minX,Object minY,double minZ,double maxX,double maxY,float maxZ, ) { net.minecraft.client.render.WorldRenderer.method_3278(minX.wrapperContained,minY,minZ,maxX,maxY,maxZ); }
public void reload() { wrapperContained.reload(); }
// public static void reload() { net.minecraft.client.render.WorldRenderer.reload(); }
public boolean isTerrainRenderComplete() { return wrapperContained.isTerrainRenderComplete(); }
// public static boolean isTerrainRenderComplete() { return net.minecraft.client.render.WorldRenderer.isTerrainRenderComplete(); }
// public yarnwrap.client.particle.Particle spawnParticle(yarnwrap.particle.ParticleEffect parameters,boolean alwaysSpawn,double x,double y,double z,double velocityX,double velocityY,double velocityZ) { return new yarnwrap.client.particle.Particle(wrapperContained.spawnParticle(parameters.wrapperContained,alwaysSpawn,x,y,z,velocityX,velocityY,velocityZ)); }
// public static yarnwrap.client.particle.Particle spawnParticle(yarnwrap.particle.ParticleEffect parameters,boolean alwaysSpawn,double x,double y,double z,double velocityX,double velocityY,double velocityZ, ) { return new yarnwrap.client.particle.Particle(net.minecraft.client.render.WorldRenderer.spawnParticle(parameters.wrapperContained,alwaysSpawn,x,y,z,velocityX,velocityY,velocityZ)); }
// public yarnwrap.client.particle.Particle spawnParticle(yarnwrap.particle.ParticleEffect parameters,boolean alwaysSpawn,boolean canSpawnOnMinimal,double x,double y,double z,double velocityX,double velocityY,double velocityZ) { return new yarnwrap.client.particle.Particle(wrapperContained.spawnParticle(parameters.wrapperContained,alwaysSpawn,canSpawnOnMinimal,x,y,z,velocityX,velocityY,velocityZ)); }
// public static yarnwrap.client.particle.Particle spawnParticle(yarnwrap.particle.ParticleEffect parameters,boolean alwaysSpawn,boolean canSpawnOnMinimal,double x,double y,double z,double velocityX,double velocityY,double velocityZ, ) { return new yarnwrap.client.particle.Particle(net.minecraft.client.render.WorldRenderer.spawnParticle(parameters.wrapperContained,alwaysSpawn,canSpawnOnMinimal,x,y,z,velocityX,velocityY,velocityZ)); }
public java.lang.String getChunksDebugString() { return wrapperContained.getChunksDebugString(); }
// public static java.lang.String getChunksDebugString() { return net.minecraft.client.render.WorldRenderer.getChunksDebugString(); }
// public void drawCuboidShapeOutline(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.util.shape.VoxelShape shape,double offsetX,double offsetY,double offsetZ,float red,float green,float blue,float alpha) { wrapperContained.drawCuboidShapeOutline(matrices.wrapperContained,vertexConsumer.wrapperContained,shape.wrapperContained,offsetX,offsetY,offsetZ,red,green,blue,alpha); }
// public static void drawCuboidShapeOutline(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.util.shape.VoxelShape shape,double offsetX,double offsetY,double offsetZ,float red,float green,float blue,float alpha, ) { net.minecraft.client.render.WorldRenderer.drawCuboidShapeOutline(matrices.wrapperContained,vertexConsumer.wrapperContained,shape.wrapperContained,offsetX,offsetY,offsetZ,red,green,blue,alpha); }
public void scheduleTerrainUpdate() { wrapperContained.scheduleTerrainUpdate(); }
// public static void scheduleTerrainUpdate() { net.minecraft.client.render.WorldRenderer.scheduleTerrainUpdate(); }
// public void renderStars() { wrapperContained.renderStars(); }
// public static void renderStars() { net.minecraft.client.render.WorldRenderer.renderStars(); }
// public void scheduleChunkRender(int x,int y,int z,boolean important) { wrapperContained.scheduleChunkRender(x,y,z,important); }
// public static void scheduleChunkRender(int x,int y,int z,boolean important, ) { net.minecraft.client.render.WorldRenderer.scheduleChunkRender(x,y,z,important); }
public void loadEntityOutlinePostProcessor() { wrapperContained.loadEntityOutlinePostProcessor(); }
// public static void loadEntityOutlinePostProcessor() { net.minecraft.client.render.WorldRenderer.loadEntityOutlinePostProcessor(); }
// public yarnwrap.client.render.BuiltBuffer buildSkyBuffer() { return new yarnwrap.client.render.BuiltBuffer(wrapperContained.buildSkyBuffer()); }
// public static yarnwrap.client.render.BuiltBuffer buildSkyBuffer() { return new yarnwrap.client.render.BuiltBuffer(net.minecraft.client.render.WorldRenderer.buildSkyBuffer()); }
public yarnwrap.client.render.chunk.ChunkBuilder getChunkBuilder() { return new yarnwrap.client.render.chunk.ChunkBuilder(wrapperContained.getChunkBuilder()); }
// public static yarnwrap.client.render.chunk.ChunkBuilder getChunkBuilder() { return new yarnwrap.client.render.chunk.ChunkBuilder(net.minecraft.client.render.WorldRenderer.getChunkBuilder()); }
public double getChunkCount() { return wrapperContained.getChunkCount(); }
// public static double getChunkCount() { return net.minecraft.client.render.WorldRenderer.getChunkCount(); }
public double getViewDistance() { return wrapperContained.getViewDistance(); }
// public static double getViewDistance() { return net.minecraft.client.render.WorldRenderer.getViewDistance(); }
// public void drawBox(yarnwrap.client.render.VertexConsumer vertexConsumer,double x1,double y1,double z1,double x2,double y2,double z2,float red,float green,float blue,float alpha) { wrapperContained.drawBox(vertexConsumer.wrapperContained,x1,y1,z1,x2,y2,z2,red,green,blue,alpha); }
// public static void drawBox(yarnwrap.client.render.VertexConsumer vertexConsumer,double x1,double y1,double z1,double x2,double y2,double z2,float red,float green,float blue,float alpha, ) { net.minecraft.client.render.WorldRenderer.drawBox(vertexConsumer.wrapperContained,x1,y1,z1,x2,y2,z2,red,green,blue,alpha); }
public void reloadTransparencyPostProcessor() { wrapperContained.reloadTransparencyPostProcessor(); }
// public static void reloadTransparencyPostProcessor() { net.minecraft.client.render.WorldRenderer.reloadTransparencyPostProcessor(); }
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
// public void renderFilledBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,float minX,float minY,float minZ,float maxX,float maxY,float maxZ,float red,float green,float blue,float alpha) { wrapperContained.renderFilledBox(matrices.wrapperContained,vertexConsumer.wrapperContained,minX,minY,minZ,maxX,maxY,maxZ,red,green,blue,alpha); }
// public static void renderFilledBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,float minX,float minY,float minZ,float maxX,float maxY,float maxZ,float red,float green,float blue,float alpha, ) { net.minecraft.client.render.WorldRenderer.renderFilledBox(matrices.wrapperContained,vertexConsumer.wrapperContained,minX,minY,minZ,maxX,maxY,maxZ,red,green,blue,alpha); }
// public yarnwrap.util.math.Vec3d getMaxIntensityColor(float hue) { return new yarnwrap.util.math.Vec3d(wrapperContained.getMaxIntensityColor(hue)); }
// public static yarnwrap.util.math.Vec3d getMaxIntensityColor(float hue, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.WorldRenderer.getMaxIntensityColor(hue)); }
// public yarnwrap.util.math.Vec3d shiftHue(float red,float green,float blue,float hueOffset) { return new yarnwrap.util.math.Vec3d(wrapperContained.shiftHue(red,green,blue,hueOffset)); }
// public static yarnwrap.util.math.Vec3d shiftHue(float red,float green,float blue,float hueOffset, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.WorldRenderer.shiftHue(red,green,blue,hueOffset)); }
// public void shootParticles(int direction,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,yarnwrap.particle.SimpleParticleType particleType) { wrapperContained.shootParticles(direction,pos.wrapperContained,random.wrapperContained,particleType.wrapperContained); }
// public static void shootParticles(int direction,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,yarnwrap.particle.SimpleParticleType particleType, ) { net.minecraft.client.render.WorldRenderer.shootParticles(direction,pos.wrapperContained,random.wrapperContained,particleType.wrapperContained); }
public void stopJukeboxSongAndUpdate(yarnwrap.util.math.BlockPos jukeboxPos) { wrapperContained.stopJukeboxSongAndUpdate(jukeboxPos.wrapperContained); }
// public static void stopJukeboxSongAndUpdate(yarnwrap.util.math.BlockPos jukeboxPos, ) { net.minecraft.client.render.WorldRenderer.stopJukeboxSongAndUpdate(jukeboxPos.wrapperContained); }
public void playJukeboxSong(yarnwrap.registry.entry.RegistryEntry song,yarnwrap.util.math.BlockPos jukeboxPos) { wrapperContained.playJukeboxSong(song.wrapperContained,jukeboxPos.wrapperContained); }
// public static void playJukeboxSong(yarnwrap.registry.entry.RegistryEntry song,yarnwrap.util.math.BlockPos jukeboxPos, ) { net.minecraft.client.render.WorldRenderer.playJukeboxSong(song.wrapperContained,jukeboxPos.wrapperContained); }
// public void stopJukeboxSong(yarnwrap.util.math.BlockPos jukeboxPos) { wrapperContained.stopJukeboxSong(jukeboxPos.wrapperContained); }
// public static void stopJukeboxSong(yarnwrap.util.math.BlockPos jukeboxPos, ) { net.minecraft.client.render.WorldRenderer.stopJukeboxSong(jukeboxPos.wrapperContained); }
// public void renderFilledBoxFace(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.util.math.Direction face,float minX,float minY,float minZ,float maxX,float maxY,float maxZ,float red,float green,float blue,float alpha) { wrapperContained.renderFilledBoxFace(matrices.wrapperContained,vertexConsumer.wrapperContained,face.wrapperContained,minX,minY,minZ,maxX,maxY,maxZ,red,green,blue,alpha); }
// public static void renderFilledBoxFace(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.util.math.Direction face,float minX,float minY,float minZ,float maxX,float maxY,float maxZ,float red,float green,float blue,float alpha, ) { net.minecraft.client.render.WorldRenderer.renderFilledBoxFace(matrices.wrapperContained,vertexConsumer.wrapperContained,face.wrapperContained,minX,minY,minZ,maxX,maxY,maxZ,red,green,blue,alpha); }
public void addParticle(yarnwrap.particle.ParticleEffect parameters,boolean shouldAlwaysSpawn,boolean important,double x,double y,double z,double velocityX,double velocityY,double velocityZ) { wrapperContained.addParticle(parameters.wrapperContained,shouldAlwaysSpawn,important,x,y,z,velocityX,velocityY,velocityZ); }
// public static void addParticle(yarnwrap.particle.ParticleEffect parameters,boolean shouldAlwaysSpawn,boolean important,double x,double y,double z,double velocityX,double velocityY,double velocityZ, ) { net.minecraft.client.render.WorldRenderer.addParticle(parameters.wrapperContained,shouldAlwaysSpawn,important,x,y,z,velocityX,velocityY,velocityZ); }
public void processGlobalEvent(int eventId,yarnwrap.util.math.BlockPos pos,int data) { wrapperContained.processGlobalEvent(eventId,pos.wrapperContained,data); }
// public static void processGlobalEvent(int eventId,yarnwrap.util.math.BlockPos pos,int data, ) { net.minecraft.client.render.WorldRenderer.processGlobalEvent(eventId,pos.wrapperContained,data); }
public void processWorldEvent(int eventId,yarnwrap.util.math.BlockPos pos,int data) { wrapperContained.processWorldEvent(eventId,pos.wrapperContained,data); }
// public static void processWorldEvent(int eventId,yarnwrap.util.math.BlockPos pos,int data, ) { net.minecraft.client.render.WorldRenderer.processWorldEvent(eventId,pos.wrapperContained,data); }
public void addParticle(yarnwrap.particle.ParticleEffect parameters,boolean shouldAlwaysSpawn,double x,double y,double z,double velocityX,double velocityY,double velocityZ) { wrapperContained.addParticle(parameters.wrapperContained,shouldAlwaysSpawn,x,y,z,velocityX,velocityY,velocityZ); }
// public static void addParticle(yarnwrap.particle.ParticleEffect parameters,boolean shouldAlwaysSpawn,double x,double y,double z,double velocityX,double velocityY,double velocityZ, ) { net.minecraft.client.render.WorldRenderer.addParticle(parameters.wrapperContained,shouldAlwaysSpawn,x,y,z,velocityX,velocityY,velocityZ); }
public void setBlockBreakingInfo(int entityId,yarnwrap.util.math.BlockPos pos,int stage) { wrapperContained.setBlockBreakingInfo(entityId,pos.wrapperContained,stage); }
// public static void setBlockBreakingInfo(int entityId,yarnwrap.util.math.BlockPos pos,int stage, ) { net.minecraft.client.render.WorldRenderer.setBlockBreakingInfo(entityId,pos.wrapperContained,stage); }
public void updateBlock(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState oldState,yarnwrap.block.BlockState newState,int flags) { wrapperContained.updateBlock(world.wrapperContained,pos.wrapperContained,oldState.wrapperContained,newState.wrapperContained,flags); }
// public static void updateBlock(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState oldState,yarnwrap.block.BlockState newState,int flags, ) { net.minecraft.client.render.WorldRenderer.updateBlock(world.wrapperContained,pos.wrapperContained,oldState.wrapperContained,newState.wrapperContained,flags); }
public void scheduleBlockRender(int x,int y,int z) { wrapperContained.scheduleBlockRender(x,y,z); }
// public static void scheduleBlockRender(int x,int y,int z, ) { net.minecraft.client.render.WorldRenderer.scheduleBlockRender(x,y,z); }

}