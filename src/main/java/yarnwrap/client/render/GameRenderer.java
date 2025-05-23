package yarnwrap.client.render;
public class GameRenderer { public net.minecraft.client.render.GameRenderer wrapperContained; public GameRenderer(net.minecraft.client.render.GameRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.render.GameRenderer.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.render.GameRenderer.LOGGER = value; }

// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public static yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(net.minecraft.client.render.GameRenderer.random); }
// public static void random(yarnwrap.util.math.random.Random value, ) { net.minecraft.client.render.GameRenderer.random = value.wrapperContained; }

// public float lastSkyDarkness() { return wrapperContained.lastSkyDarkness; }
// public void lastSkyDarkness(float value) { wrapperContained.lastSkyDarkness = value; }
// public static float lastSkyDarkness() { return net.minecraft.client.render.GameRenderer.lastSkyDarkness; }
// public static void lastSkyDarkness(float value, ) { net.minecraft.client.render.GameRenderer.lastSkyDarkness = value; }

// public long lastWindowFocusedTime() { return wrapperContained.lastWindowFocusedTime; }
// public void lastWindowFocusedTime(long value) { wrapperContained.lastWindowFocusedTime = value; }
// public static long lastWindowFocusedTime() { return net.minecraft.client.render.GameRenderer.lastWindowFocusedTime; }
// public static void lastWindowFocusedTime(long value, ) { net.minecraft.client.render.GameRenderer.lastWindowFocusedTime = value; }

// public float lastFovMultiplier() { return wrapperContained.lastFovMultiplier; }
// public void lastFovMultiplier(float value) { wrapperContained.lastFovMultiplier = value; }
// public static float lastFovMultiplier() { return net.minecraft.client.render.GameRenderer.lastFovMultiplier; }
// public static void lastFovMultiplier(float value, ) { net.minecraft.client.render.GameRenderer.lastFovMultiplier = value; }

// public boolean renderingPanorama() { return wrapperContained.renderingPanorama; }
// public void renderingPanorama(boolean value) { wrapperContained.renderingPanorama = value; }
// public static boolean renderingPanorama() { return net.minecraft.client.render.GameRenderer.renderingPanorama; }
// public static void renderingPanorama(boolean value, ) { net.minecraft.client.render.GameRenderer.renderingPanorama = value; }

// public float skyDarkness() { return wrapperContained.skyDarkness; }
// public void skyDarkness(float value) { wrapperContained.skyDarkness = value; }
// public static float skyDarkness() { return net.minecraft.client.render.GameRenderer.skyDarkness; }
// public static void skyDarkness(float value, ) { net.minecraft.client.render.GameRenderer.skyDarkness = value; }

// public boolean blockOutlineEnabled() { return wrapperContained.blockOutlineEnabled; }
// public void blockOutlineEnabled(boolean value) { wrapperContained.blockOutlineEnabled = value; }
// public static boolean blockOutlineEnabled() { return net.minecraft.client.render.GameRenderer.blockOutlineEnabled; }
// public static void blockOutlineEnabled(boolean value, ) { net.minecraft.client.render.GameRenderer.blockOutlineEnabled = value; }

public yarnwrap.client.render.item.HeldItemRenderer firstPersonRenderer() { return new yarnwrap.client.render.item.HeldItemRenderer(wrapperContained.firstPersonRenderer); }
// public void firstPersonRenderer(yarnwrap.client.render.item.HeldItemRenderer value) { wrapperContained.firstPersonRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.item.HeldItemRenderer firstPersonRenderer() { return new yarnwrap.client.render.item.HeldItemRenderer(net.minecraft.client.render.GameRenderer.firstPersonRenderer); }
// public static void firstPersonRenderer(yarnwrap.client.render.item.HeldItemRenderer value, ) { net.minecraft.client.render.GameRenderer.firstPersonRenderer = value.wrapperContained; }

// public boolean postProcessorEnabled() { return wrapperContained.postProcessorEnabled; }
// public void postProcessorEnabled(boolean value) { wrapperContained.postProcessorEnabled = value; }
// public static boolean postProcessorEnabled() { return net.minecraft.client.render.GameRenderer.postProcessorEnabled; }
// public static void postProcessorEnabled(boolean value, ) { net.minecraft.client.render.GameRenderer.postProcessorEnabled = value; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.render.GameRenderer.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.render.GameRenderer.client = value.wrapperContained; }

// public long lastWorldIconUpdate() { return wrapperContained.lastWorldIconUpdate; }
// public void lastWorldIconUpdate(long value) { wrapperContained.lastWorldIconUpdate = value; }
// public static long lastWorldIconUpdate() { return net.minecraft.client.render.GameRenderer.lastWorldIconUpdate; }
// public static void lastWorldIconUpdate(long value, ) { net.minecraft.client.render.GameRenderer.lastWorldIconUpdate = value; }

// public float fovMultiplier() { return wrapperContained.fovMultiplier; }
// public void fovMultiplier(float value) { wrapperContained.fovMultiplier = value; }
// public static float fovMultiplier() { return net.minecraft.client.render.GameRenderer.fovMultiplier; }
// public static void fovMultiplier(float value, ) { net.minecraft.client.render.GameRenderer.fovMultiplier = value; }

// public float viewDistanceBlocks() { return wrapperContained.viewDistanceBlocks; }
// public void viewDistanceBlocks(float value) { wrapperContained.viewDistanceBlocks = value; }
// public static float viewDistanceBlocks() { return net.minecraft.client.render.GameRenderer.viewDistanceBlocks; }
// public static void viewDistanceBlocks(float value, ) { net.minecraft.client.render.GameRenderer.viewDistanceBlocks = value; }

// public yarnwrap.client.render.LightmapTextureManager lightmapTextureManager() { return new yarnwrap.client.render.LightmapTextureManager(wrapperContained.lightmapTextureManager); }
// public void lightmapTextureManager(yarnwrap.client.render.LightmapTextureManager value) { wrapperContained.lightmapTextureManager = value.wrapperContained; }
// public static yarnwrap.client.render.LightmapTextureManager lightmapTextureManager() { return new yarnwrap.client.render.LightmapTextureManager(net.minecraft.client.render.GameRenderer.lightmapTextureManager); }
// public static void lightmapTextureManager(yarnwrap.client.render.LightmapTextureManager value, ) { net.minecraft.client.render.GameRenderer.lightmapTextureManager = value.wrapperContained; }

// public yarnwrap.client.render.Camera camera() { return new yarnwrap.client.render.Camera(wrapperContained.camera); }
// public void camera(yarnwrap.client.render.Camera value) { wrapperContained.camera = value.wrapperContained; }
// public static yarnwrap.client.render.Camera camera() { return new yarnwrap.client.render.Camera(net.minecraft.client.render.GameRenderer.camera); }
// public static void camera(yarnwrap.client.render.Camera value, ) { net.minecraft.client.render.GameRenderer.camera = value.wrapperContained; }

// public yarnwrap.client.render.BufferBuilderStorage buffers() { return new yarnwrap.client.render.BufferBuilderStorage(wrapperContained.buffers); }
// public void buffers(yarnwrap.client.render.BufferBuilderStorage value) { wrapperContained.buffers = value.wrapperContained; }
// public static yarnwrap.client.render.BufferBuilderStorage buffers() { return new yarnwrap.client.render.BufferBuilderStorage(net.minecraft.client.render.GameRenderer.buffers); }
// public static void buffers(yarnwrap.client.render.BufferBuilderStorage value, ) { net.minecraft.client.render.GameRenderer.buffers = value.wrapperContained; }

// public yarnwrap.client.render.OverlayTexture overlayTexture() { return new yarnwrap.client.render.OverlayTexture(wrapperContained.overlayTexture); }
// public void overlayTexture(yarnwrap.client.render.OverlayTexture value) { wrapperContained.overlayTexture = value.wrapperContained; }
// public static yarnwrap.client.render.OverlayTexture overlayTexture() { return new yarnwrap.client.render.OverlayTexture(net.minecraft.client.render.GameRenderer.overlayTexture); }
// public static void overlayTexture(yarnwrap.client.render.OverlayTexture value, ) { net.minecraft.client.render.GameRenderer.overlayTexture = value.wrapperContained; }

// public float CAMERA_DEPTH() { return wrapperContained.CAMERA_DEPTH; }
// public void CAMERA_DEPTH(float value) { wrapperContained.CAMERA_DEPTH = value; }
public static float CAMERA_DEPTH() { return net.minecraft.client.render.GameRenderer.CAMERA_DEPTH; }
// public static void CAMERA_DEPTH(float value, ) { net.minecraft.client.render.GameRenderer.CAMERA_DEPTH = value; }

// public boolean hasWorldIcon() { return wrapperContained.hasWorldIcon; }
// public void hasWorldIcon(boolean value) { wrapperContained.hasWorldIcon = value; }
// public static boolean hasWorldIcon() { return net.minecraft.client.render.GameRenderer.hasWorldIcon; }
// public static void hasWorldIcon(boolean value, ) { net.minecraft.client.render.GameRenderer.hasWorldIcon = value; }

// public yarnwrap.client.util.Pool pool() { return new yarnwrap.client.util.Pool(wrapperContained.pool); }
// public void pool(yarnwrap.client.util.Pool value) { wrapperContained.pool = value.wrapperContained; }
// public static yarnwrap.client.util.Pool pool() { return new yarnwrap.client.util.Pool(net.minecraft.client.render.GameRenderer.pool); }
// public static void pool(yarnwrap.client.util.Pool value, ) { net.minecraft.client.render.GameRenderer.pool = value.wrapperContained; }

// public yarnwrap.util.Identifier postProcessorId() { return new yarnwrap.util.Identifier(wrapperContained.postProcessorId); }
// public void postProcessorId(yarnwrap.util.Identifier value) { wrapperContained.postProcessorId = value.wrapperContained; }
// public static yarnwrap.util.Identifier postProcessorId() { return new yarnwrap.util.Identifier(net.minecraft.client.render.GameRenderer.postProcessorId); }
// public static void postProcessorId(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.GameRenderer.postProcessorId = value.wrapperContained; }

// public yarnwrap.util.Identifier BLUR_ID() { return new yarnwrap.util.Identifier(wrapperContained.BLUR_ID); }
// public void BLUR_ID(yarnwrap.util.Identifier value) { wrapperContained.BLUR_ID = value.wrapperContained; }
// public static yarnwrap.util.Identifier BLUR_ID() { return new yarnwrap.util.Identifier(net.minecraft.client.render.GameRenderer.BLUR_ID); }
// public static void BLUR_ID(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.GameRenderer.BLUR_ID = value.wrapperContained; }

// public float nauseaEffectTime() { return wrapperContained.nauseaEffectTime; }
// public void nauseaEffectTime(float value) { wrapperContained.nauseaEffectTime = value; }
// public static float nauseaEffectTime() { return net.minecraft.client.render.GameRenderer.nauseaEffectTime; }
// public static void nauseaEffectTime(float value, ) { net.minecraft.client.render.GameRenderer.nauseaEffectTime = value; }

// public float nauseaEffectSpeed() { return wrapperContained.nauseaEffectSpeed; }
// public void nauseaEffectSpeed(float value) { wrapperContained.nauseaEffectSpeed = value; }
// public static float nauseaEffectSpeed() { return net.minecraft.client.render.GameRenderer.nauseaEffectSpeed; }
// public static void nauseaEffectSpeed(float value, ) { net.minecraft.client.render.GameRenderer.nauseaEffectSpeed = value; }

// public yarnwrap.client.gui.render.GuiRenderer guiRenderer() { return new yarnwrap.client.gui.render.GuiRenderer(wrapperContained.guiRenderer); }
// public void guiRenderer(yarnwrap.client.gui.render.GuiRenderer value) { wrapperContained.guiRenderer = value.wrapperContained; }
// public static yarnwrap.client.gui.render.GuiRenderer guiRenderer() { return new yarnwrap.client.gui.render.GuiRenderer(net.minecraft.client.render.GameRenderer.guiRenderer); }
// public static void guiRenderer(yarnwrap.client.gui.render.GuiRenderer value, ) { net.minecraft.client.render.GameRenderer.guiRenderer = value.wrapperContained; }

// public yarnwrap.client.gui.render.state.GuiRenderState guiState() { return new yarnwrap.client.gui.render.state.GuiRenderState(wrapperContained.guiState); }
// public void guiState(yarnwrap.client.gui.render.state.GuiRenderState value) { wrapperContained.guiState = value.wrapperContained; }
// public static yarnwrap.client.gui.render.state.GuiRenderState guiState() { return new yarnwrap.client.gui.render.state.GuiRenderState(net.minecraft.client.render.GameRenderer.guiState); }
// public static void guiState(yarnwrap.client.gui.render.state.GuiRenderState value, ) { net.minecraft.client.render.GameRenderer.guiState = value.wrapperContained; }

// public yarnwrap.client.gui.hud.InGameOverlayRenderer overlayRenderer() { return new yarnwrap.client.gui.hud.InGameOverlayRenderer(wrapperContained.overlayRenderer); }
// public void overlayRenderer(yarnwrap.client.gui.hud.InGameOverlayRenderer value) { wrapperContained.overlayRenderer = value.wrapperContained; }
// public static yarnwrap.client.gui.hud.InGameOverlayRenderer overlayRenderer() { return new yarnwrap.client.gui.hud.InGameOverlayRenderer(net.minecraft.client.render.GameRenderer.overlayRenderer); }
// public static void overlayRenderer(yarnwrap.client.gui.hud.InGameOverlayRenderer value, ) { net.minecraft.client.render.GameRenderer.overlayRenderer = value.wrapperContained; }

// public yarnwrap.client.render.DiffuseLighting diffuseLighting() { return new yarnwrap.client.render.DiffuseLighting(wrapperContained.diffuseLighting); }
// public void diffuseLighting(yarnwrap.client.render.DiffuseLighting value) { wrapperContained.diffuseLighting = value.wrapperContained; }
// public static yarnwrap.client.render.DiffuseLighting diffuseLighting() { return new yarnwrap.client.render.DiffuseLighting(net.minecraft.client.render.GameRenderer.diffuseLighting); }
// public static void diffuseLighting(yarnwrap.client.render.DiffuseLighting value, ) { net.minecraft.client.render.GameRenderer.diffuseLighting = value.wrapperContained; }

// public yarnwrap.client.gl.GlobalSettings globalSettings() { return new yarnwrap.client.gl.GlobalSettings(wrapperContained.globalSettings); }
// public void globalSettings(yarnwrap.client.gl.GlobalSettings value) { wrapperContained.globalSettings = value.wrapperContained; }
// public static yarnwrap.client.gl.GlobalSettings globalSettings() { return new yarnwrap.client.gl.GlobalSettings(net.minecraft.client.render.GameRenderer.globalSettings); }
// public static void globalSettings(yarnwrap.client.gl.GlobalSettings value, ) { net.minecraft.client.render.GameRenderer.globalSettings = value.wrapperContained; }

// public yarnwrap.client.render.RawProjectionMatrix worldProjectionMatrix() { return new yarnwrap.client.render.RawProjectionMatrix(wrapperContained.worldProjectionMatrix); }
// public void worldProjectionMatrix(yarnwrap.client.render.RawProjectionMatrix value) { wrapperContained.worldProjectionMatrix = value.wrapperContained; }
// public static yarnwrap.client.render.RawProjectionMatrix worldProjectionMatrix() { return new yarnwrap.client.render.RawProjectionMatrix(net.minecraft.client.render.GameRenderer.worldProjectionMatrix); }
// public static void worldProjectionMatrix(yarnwrap.client.render.RawProjectionMatrix value, ) { net.minecraft.client.render.GameRenderer.worldProjectionMatrix = value.wrapperContained; }

// public yarnwrap.client.render.ProjectionMatrix3 hudProjectionMatrix() { return new yarnwrap.client.render.ProjectionMatrix3(wrapperContained.hudProjectionMatrix); }
// public void hudProjectionMatrix(yarnwrap.client.render.ProjectionMatrix3 value) { wrapperContained.hudProjectionMatrix = value.wrapperContained; }
// public static yarnwrap.client.render.ProjectionMatrix3 hudProjectionMatrix() { return new yarnwrap.client.render.ProjectionMatrix3(net.minecraft.client.render.GameRenderer.hudProjectionMatrix); }
// public static void hudProjectionMatrix(yarnwrap.client.render.ProjectionMatrix3 value, ) { net.minecraft.client.render.GameRenderer.hudProjectionMatrix = value.wrapperContained; }

// public yarnwrap.client.gui.CubeMapRenderer panoramaRenderer() { return new yarnwrap.client.gui.CubeMapRenderer(wrapperContained.panoramaRenderer); }
// public void panoramaRenderer(yarnwrap.client.gui.CubeMapRenderer value) { wrapperContained.panoramaRenderer = value.wrapperContained; }
// public static yarnwrap.client.gui.CubeMapRenderer panoramaRenderer() { return new yarnwrap.client.gui.CubeMapRenderer(net.minecraft.client.render.GameRenderer.panoramaRenderer); }
// public static void panoramaRenderer(yarnwrap.client.gui.CubeMapRenderer value, ) { net.minecraft.client.render.GameRenderer.panoramaRenderer = value.wrapperContained; }

// public yarnwrap.client.gui.RotatingCubeMapRenderer rotatingPanoramaRenderer() { return new yarnwrap.client.gui.RotatingCubeMapRenderer(wrapperContained.rotatingPanoramaRenderer); }
// public void rotatingPanoramaRenderer(yarnwrap.client.gui.RotatingCubeMapRenderer value) { wrapperContained.rotatingPanoramaRenderer = value.wrapperContained; }
// public static yarnwrap.client.gui.RotatingCubeMapRenderer rotatingPanoramaRenderer() { return new yarnwrap.client.gui.RotatingCubeMapRenderer(net.minecraft.client.render.GameRenderer.rotatingPanoramaRenderer); }
// public static void rotatingPanoramaRenderer(yarnwrap.client.gui.RotatingCubeMapRenderer value, ) { net.minecraft.client.render.GameRenderer.rotatingPanoramaRenderer = value.wrapperContained; }

// public yarnwrap.client.render.fog.FogRenderer fogRenderer() { return new yarnwrap.client.render.fog.FogRenderer(wrapperContained.fogRenderer); }
// public void fogRenderer(yarnwrap.client.render.fog.FogRenderer value) { wrapperContained.fogRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.fog.FogRenderer fogRenderer() { return new yarnwrap.client.render.fog.FogRenderer(net.minecraft.client.render.GameRenderer.fogRenderer); }
// public static void fogRenderer(yarnwrap.client.render.fog.FogRenderer value, ) { net.minecraft.client.render.GameRenderer.fogRenderer = value.wrapperContained; }

// public GameRenderer(yarnwrap.client.MinecraftClient client,yarnwrap.client.render.item.HeldItemRenderer firstPersonHeldItemRenderer,yarnwrap.client.render.BufferBuilderStorage buffers) { this.wrapperContained = new net.minecraft.client.render.GameRenderer(client.wrapperContained,firstPersonHeldItemRenderer.wrapperContained,buffers.wrapperContained); }
public void onCameraEntitySet(yarnwrap.entity.Entity entity) { wrapperContained.onCameraEntitySet(entity.wrapperContained); }
// public static void onCameraEntitySet(yarnwrap.entity.Entity entity, ) { net.minecraft.client.render.GameRenderer.onCameraEntitySet(entity.wrapperContained); }
public void onResized(int width,int height) { wrapperContained.onResized(width,height); }
// public static void onResized(int width,int height, ) { net.minecraft.client.render.GameRenderer.onResized(width,height); }
// public void renderHand(float tickProgress,boolean sleeping,org.joml.Matrix4f positionMatrix) { wrapperContained.renderHand(tickProgress,sleeping,positionMatrix); }
// public static void renderHand(float tickProgress,boolean sleeping,org.joml.Matrix4f positionMatrix, ) { net.minecraft.client.render.GameRenderer.renderHand(tickProgress,sleeping,positionMatrix); }
// public float getNightVisionStrength(yarnwrap.entity.LivingEntity entity,float tickProgress) { return wrapperContained.getNightVisionStrength(entity.wrapperContained,tickProgress); }
// public static float getNightVisionStrength(yarnwrap.entity.LivingEntity entity,float tickProgress, ) { return net.minecraft.client.render.GameRenderer.getNightVisionStrength(entity.wrapperContained,tickProgress); }
// public void updateWorldIcon(java.nio.file.Path path) { wrapperContained.updateWorldIcon(path); }
// public static void updateWorldIcon(java.nio.file.Path path, ) { net.minecraft.client.render.GameRenderer.updateWorldIcon(path); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.client.render.GameRenderer.tick(); }
public void togglePostProcessorEnabled() { wrapperContained.togglePostProcessorEnabled(); }
// public static void togglePostProcessorEnabled() { net.minecraft.client.render.GameRenderer.togglePostProcessorEnabled(); }
// public void bobView(yarnwrap.client.util.math.MatrixStack matrices,float tickProgress) { wrapperContained.bobView(matrices.wrapperContained,tickProgress); }
// public static void bobView(yarnwrap.client.util.math.MatrixStack matrices,float tickProgress, ) { net.minecraft.client.render.GameRenderer.bobView(matrices.wrapperContained,tickProgress); }
public void renderWorld(yarnwrap.client.render.RenderTickCounter renderTickCounter) { wrapperContained.renderWorld(renderTickCounter.wrapperContained); }
// public static void renderWorld(yarnwrap.client.render.RenderTickCounter renderTickCounter, ) { net.minecraft.client.render.GameRenderer.renderWorld(renderTickCounter.wrapperContained); }
public void showFloatingItem(yarnwrap.item.ItemStack floatingItem) { wrapperContained.showFloatingItem(floatingItem.wrapperContained); }
// public static void showFloatingItem(yarnwrap.item.ItemStack floatingItem, ) { net.minecraft.client.render.GameRenderer.showFloatingItem(floatingItem.wrapperContained); }
public void updateCrosshairTarget(float tickProgress) { wrapperContained.updateCrosshairTarget(tickProgress); }
// public static void updateCrosshairTarget(float tickProgress, ) { net.minecraft.client.render.GameRenderer.updateCrosshairTarget(tickProgress); }
public void render(yarnwrap.client.render.RenderTickCounter tickCounter,boolean tick) { wrapperContained.render(tickCounter.wrapperContained,tick); }
// public static void render(yarnwrap.client.render.RenderTickCounter tickCounter,boolean tick, ) { net.minecraft.client.render.GameRenderer.render(tickCounter.wrapperContained,tick); }
public float getViewDistanceBlocks() { return wrapperContained.getViewDistanceBlocks(); }
// public static float getViewDistanceBlocks() { return net.minecraft.client.render.GameRenderer.getViewDistanceBlocks(); }
public float getSkyDarkness(float tickProgress) { return wrapperContained.getSkyDarkness(tickProgress); }
// public static float getSkyDarkness(float tickProgress, ) { return net.minecraft.client.render.GameRenderer.getSkyDarkness(tickProgress); }
// public float getFov(yarnwrap.client.render.Camera camera,float tickProgress,boolean changingFov) { return wrapperContained.getFov(camera.wrapperContained,tickProgress,changingFov); }
// public static float getFov(yarnwrap.client.render.Camera camera,float tickProgress,boolean changingFov, ) { return net.minecraft.client.render.GameRenderer.getFov(camera.wrapperContained,tickProgress,changingFov); }
// public void tiltViewWhenHurt(yarnwrap.client.util.math.MatrixStack matrices,float tickProgress) { wrapperContained.tiltViewWhenHurt(matrices.wrapperContained,tickProgress); }
// public static void tiltViewWhenHurt(yarnwrap.client.util.math.MatrixStack matrices,float tickProgress, ) { net.minecraft.client.render.GameRenderer.tiltViewWhenHurt(matrices.wrapperContained,tickProgress); }
// public void updateFovMultiplier() { wrapperContained.updateFovMultiplier(); }
// public static void updateFovMultiplier() { net.minecraft.client.render.GameRenderer.updateFovMultiplier(); }
// public boolean shouldRenderBlockOutline() { return wrapperContained.shouldRenderBlockOutline(); }
// public static boolean shouldRenderBlockOutline() { return net.minecraft.client.render.GameRenderer.shouldRenderBlockOutline(); }
public void reset() { wrapperContained.reset(); }
// public static void reset() { net.minecraft.client.render.GameRenderer.reset(); }
public yarnwrap.client.render.Camera getCamera() { return new yarnwrap.client.render.Camera(wrapperContained.getCamera()); }
// public static yarnwrap.client.render.Camera getCamera() { return new yarnwrap.client.render.Camera(net.minecraft.client.render.GameRenderer.getCamera()); }
public org.joml.Matrix4f getBasicProjectionMatrix(float fovDegrees) { return wrapperContained.getBasicProjectionMatrix(fovDegrees); }
// public static org.joml.Matrix4f getBasicProjectionMatrix(float fovDegrees, ) { return net.minecraft.client.render.GameRenderer.getBasicProjectionMatrix(fovDegrees); }
public yarnwrap.client.render.LightmapTextureManager getLightmapTextureManager() { return new yarnwrap.client.render.LightmapTextureManager(wrapperContained.getLightmapTextureManager()); }
// public static yarnwrap.client.render.LightmapTextureManager getLightmapTextureManager() { return new yarnwrap.client.render.LightmapTextureManager(net.minecraft.client.render.GameRenderer.getLightmapTextureManager()); }
public yarnwrap.client.render.OverlayTexture getOverlayTexture() { return new yarnwrap.client.render.OverlayTexture(wrapperContained.getOverlayTexture()); }
// public static yarnwrap.client.render.OverlayTexture getOverlayTexture() { return new yarnwrap.client.render.OverlayTexture(net.minecraft.client.render.GameRenderer.getOverlayTexture()); }
public float getFarPlaneDistance() { return wrapperContained.getFarPlaneDistance(); }
// public static float getFarPlaneDistance() { return net.minecraft.client.render.GameRenderer.getFarPlaneDistance(); }
public void preloadPrograms(yarnwrap.resource.ResourceFactory factory) { wrapperContained.preloadPrograms(factory.wrapperContained); }
// public static void preloadPrograms(yarnwrap.resource.ResourceFactory factory, ) { net.minecraft.client.render.GameRenderer.preloadPrograms(factory.wrapperContained); }
public boolean isRenderingPanorama() { return wrapperContained.isRenderingPanorama(); }
// public static boolean isRenderingPanorama() { return net.minecraft.client.render.GameRenderer.isRenderingPanorama(); }
public void setBlockOutlineEnabled(boolean blockOutlineEnabled) { wrapperContained.setBlockOutlineEnabled(blockOutlineEnabled); }
// public static void setBlockOutlineEnabled(boolean blockOutlineEnabled, ) { net.minecraft.client.render.GameRenderer.setBlockOutlineEnabled(blockOutlineEnabled); }
public void setRenderingPanorama(boolean renderingPanorama) { wrapperContained.setRenderingPanorama(renderingPanorama); }
// public static void setRenderingPanorama(boolean renderingPanorama, ) { net.minecraft.client.render.GameRenderer.setRenderingPanorama(renderingPanorama); }
public yarnwrap.client.MinecraftClient getClient() { return new yarnwrap.client.MinecraftClient(wrapperContained.getClient()); }
// public static yarnwrap.client.MinecraftClient getClient() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.render.GameRenderer.getClient()); }
// public void updateWorldIcon() { wrapperContained.updateWorldIcon(); }
// public static void updateWorldIcon() { net.minecraft.client.render.GameRenderer.updateWorldIcon(); }
// public void method_37474(java.nio.file.Path path) { wrapperContained.method_37474(path); }
// public static void method_37474(java.nio.file.Path path, ) { net.minecraft.client.render.GameRenderer.method_37474(path); }
// public yarnwrap.util.hit.HitResult findCrosshairTarget(yarnwrap.entity.Entity camera,double blockInteractionRange,double entityInteractionRange,float tickProgress) { return new yarnwrap.util.hit.HitResult(wrapperContained.findCrosshairTarget(camera.wrapperContained,blockInteractionRange,entityInteractionRange,tickProgress)); }
// public static yarnwrap.util.hit.HitResult findCrosshairTarget(yarnwrap.entity.Entity camera,double blockInteractionRange,double entityInteractionRange,float tickProgress, ) { return new yarnwrap.util.hit.HitResult(net.minecraft.client.render.GameRenderer.findCrosshairTarget(camera.wrapperContained,blockInteractionRange,entityInteractionRange,tickProgress)); }
// public yarnwrap.util.hit.HitResult ensureTargetInRange(yarnwrap.util.hit.HitResult hitResult,yarnwrap.util.math.Vec3d cameraPos,double interactionRange) { return new yarnwrap.util.hit.HitResult(wrapperContained.ensureTargetInRange(hitResult.wrapperContained,cameraPos.wrapperContained,interactionRange)); }
// public static yarnwrap.util.hit.HitResult ensureTargetInRange(yarnwrap.util.hit.HitResult hitResult,yarnwrap.util.math.Vec3d cameraPos,double interactionRange, ) { return new yarnwrap.util.hit.HitResult(net.minecraft.client.render.GameRenderer.ensureTargetInRange(hitResult.wrapperContained,cameraPos.wrapperContained,interactionRange)); }
public void renderBlur() { wrapperContained.renderBlur(); }
// public static void renderBlur() { net.minecraft.client.render.GameRenderer.renderBlur(); }
// public void setPostProcessor(yarnwrap.util.Identifier id) { wrapperContained.setPostProcessor(id.wrapperContained); }
// public static void setPostProcessor(yarnwrap.util.Identifier id, ) { net.minecraft.client.render.GameRenderer.setPostProcessor(id.wrapperContained); }
public void clearPostProcessor() { wrapperContained.clearPostProcessor(); }
// public static void clearPostProcessor() { net.minecraft.client.render.GameRenderer.clearPostProcessor(); }
public yarnwrap.util.Identifier getPostProcessorId() { return new yarnwrap.util.Identifier(wrapperContained.getPostProcessorId()); }
// public static yarnwrap.util.Identifier getPostProcessorId() { return new yarnwrap.util.Identifier(net.minecraft.client.render.GameRenderer.getPostProcessorId()); }
// public void method_68164(java.nio.file.Path screenshot) { wrapperContained.method_68164(screenshot); }
// public static void method_68164(java.nio.file.Path screenshot, ) { net.minecraft.client.render.GameRenderer.method_68164(screenshot); }
// public java.lang.String method_68479(yarnwrap.resource.ResourceFactory id,yarnwrap.util.Identifier type) { return wrapperContained.method_68479(id.wrapperContained,type.wrapperContained); }
// public static java.lang.String method_68479(yarnwrap.resource.ResourceFactory id,yarnwrap.util.Identifier type, ) { return net.minecraft.client.render.GameRenderer.method_68479(id.wrapperContained,type.wrapperContained); }
// public void setWorld(yarnwrap.client.world.ClientWorld world) { wrapperContained.setWorld(world.wrapperContained); }
// public static void setWorld(yarnwrap.client.world.ClientWorld world, ) { net.minecraft.client.render.GameRenderer.setWorld(world.wrapperContained); }
// public yarnwrap.client.gl.GlobalSettings getGlobalSettings() { return new yarnwrap.client.gl.GlobalSettings(wrapperContained.getGlobalSettings()); }
// public static yarnwrap.client.gl.GlobalSettings getGlobalSettings() { return new yarnwrap.client.gl.GlobalSettings(net.minecraft.client.render.GameRenderer.getGlobalSettings()); }
// public yarnwrap.client.render.DiffuseLighting getDiffuseLighting() { return new yarnwrap.client.render.DiffuseLighting(wrapperContained.getDiffuseLighting()); }
// public static yarnwrap.client.render.DiffuseLighting getDiffuseLighting() { return new yarnwrap.client.render.DiffuseLighting(net.minecraft.client.render.GameRenderer.getDiffuseLighting()); }
// public yarnwrap.client.gui.RotatingCubeMapRenderer getRotatingPanoramaRenderer() { return new yarnwrap.client.gui.RotatingCubeMapRenderer(wrapperContained.getRotatingPanoramaRenderer()); }
// public static yarnwrap.client.gui.RotatingCubeMapRenderer getRotatingPanoramaRenderer() { return new yarnwrap.client.gui.RotatingCubeMapRenderer(net.minecraft.client.render.GameRenderer.getRotatingPanoramaRenderer()); }

}