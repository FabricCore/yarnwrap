package yarnwrap.client.render;
public class GameRenderer { public net.minecraft.client.render.GameRenderer wrapperContained; public GameRenderer(net.minecraft.client.render.GameRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.Camera camera() { return new yarnwrap.client.render.Camera(wrapperContained.camera); }
// public yarnwrap.client.render.BufferBuilderStorage buffers() { return new yarnwrap.client.render.BufferBuilderStorage(wrapperContained.buffers); }
// public yarnwrap.client.render.OverlayTexture overlayTexture() { return new yarnwrap.client.render.OverlayTexture(wrapperContained.overlayTexture); }
// public yarnwrap.util.Identifier NAUSEA_OVERLAY() { return new yarnwrap.util.Identifier(wrapperContained.NAUSEA_OVERLAY); }
// public java.util.Map programs() { return wrapperContained.programs; }
// public yarnwrap.client.gl.ShaderProgram positionProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.positionProgram); }
// public yarnwrap.client.gl.ShaderProgram positionColorProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.positionColorProgram); }
// public yarnwrap.client.gl.ShaderProgram positionTexProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.positionTexProgram); }
// public yarnwrap.client.gl.ShaderProgram positionTexColorProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.positionTexColorProgram); }
// public yarnwrap.client.gl.ShaderProgram particleProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.particleProgram); }
// public yarnwrap.client.gl.ShaderProgram positionColorLightmapProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.positionColorLightmapProgram); }
// public yarnwrap.client.gl.ShaderProgram positionColorTexLightmapProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.positionColorTexLightmapProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeSolidProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeSolidProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeCutoutMippedProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeCutoutMippedProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeCutoutProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeCutoutProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeTranslucentProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeTranslucentProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeEntityGlintProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEntityGlintProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeEntityGlintDirectProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEntityGlintDirectProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeTextProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeTextProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeTextSeeThroughProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeTextSeeThroughProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeLightningProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeLightningProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeTripwireProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeTripwireProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeEndPortalProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEndPortalProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeEndGatewayProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEndGatewayProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeLinesProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeLinesProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeCrumblingProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeCrumblingProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeTranslucentMovingBlockProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeTranslucentMovingBlockProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeArmorCutoutNoCullProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeArmorCutoutNoCullProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeEntitySolidProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEntitySolidProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeEntityCutoutProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEntityCutoutProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeEntityCutoutNoNullProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEntityCutoutNoNullProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeEntityCutoutNoNullZOffsetProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEntityCutoutNoNullZOffsetProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeItemEntityTranslucentCullProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeItemEntityTranslucentCullProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeEntityTranslucentCullProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEntityTranslucentCullProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeEntityTranslucentProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEntityTranslucentProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeEntitySmoothCutoutProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEntitySmoothCutoutProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeBeaconBeamProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeBeaconBeamProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeEntityDecalProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEntityDecalProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeEntityNoOutlineProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEntityNoOutlineProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeEntityShadowProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEntityShadowProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeEntityAlphaProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEntityAlphaProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeEyesProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEyesProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeEnergySwirlProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEnergySwirlProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeLeashProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeLeashProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeWaterMaskProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeWaterMaskProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeOutlineProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeOutlineProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeArmorGlintProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeArmorGlintProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeArmorEntityGlintProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeArmorEntityGlintProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeGlintTranslucentProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeGlintTranslucentProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeGlintProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeGlintProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeGlintDirectProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeGlintDirectProgram); }
public yarnwrap.client.gl.ShaderProgram blitScreenProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.blitScreenProgram); }
public float CAMERA_DEPTH() { return wrapperContained.CAMERA_DEPTH; }
// public yarnwrap.client.gl.ShaderProgram renderTypeTextIntensityProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeTextIntensityProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeTextIntensitySeeThroughProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeTextIntensitySeeThroughProgram); }
// public boolean hasWorldIcon() { return wrapperContained.hasWorldIcon; }
// public yarnwrap.client.gl.ShaderProgram renderTypeEntityTranslucentEmissiveProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEntityTranslucentEmissiveProgram); }
// public float zoomX() { return wrapperContained.zoomX; }
// public boolean renderHand() { return wrapperContained.renderHand; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public float lastSkyDarkness() { return wrapperContained.lastSkyDarkness; }
// public long lastWindowFocusedTime() { return wrapperContained.lastWindowFocusedTime; }
// public float lastFovMultiplier() { return wrapperContained.lastFovMultiplier; }
// public boolean renderingPanorama() { return wrapperContained.renderingPanorama; }
// public float skyDarkness() { return wrapperContained.skyDarkness; }
// public float floatingItemHeight() { return wrapperContained.floatingItemHeight; }
// public float zoomY() { return wrapperContained.zoomY; }
// public float zoom() { return wrapperContained.zoom; }
// public yarnwrap.item.ItemStack floatingItem() { return new yarnwrap.item.ItemStack(wrapperContained.floatingItem); }
// public int floatingItemTimeLeft() { return wrapperContained.floatingItemTimeLeft; }
// public boolean blockOutlineEnabled() { return wrapperContained.blockOutlineEnabled; }
public yarnwrap.client.render.item.HeldItemRenderer firstPersonRenderer() { return new yarnwrap.client.render.item.HeldItemRenderer(wrapperContained.firstPersonRenderer); }
// public boolean postProcessorEnabled() { return wrapperContained.postProcessorEnabled; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public long lastWorldIconUpdate() { return wrapperContained.lastWorldIconUpdate; }
// public yarnwrap.resource.ResourceManager resourceManager() { return new yarnwrap.resource.ResourceManager(wrapperContained.resourceManager); }
// public float fovMultiplier() { return wrapperContained.fovMultiplier; }
// public yarnwrap.client.gl.PostEffectProcessor postProcessor() { return new yarnwrap.client.gl.PostEffectProcessor(wrapperContained.postProcessor); }
// public float viewDistance() { return wrapperContained.viewDistance; }
// public yarnwrap.client.render.MapRenderer mapRenderer() { return new yarnwrap.client.render.MapRenderer(wrapperContained.mapRenderer); }
// public yarnwrap.client.render.LightmapTextureManager lightmapTextureManager() { return new yarnwrap.client.render.LightmapTextureManager(wrapperContained.lightmapTextureManager); }
// public float floatingItemWidth() { return wrapperContained.floatingItemWidth; }
// public yarnwrap.client.gl.ShaderProgram renderTypeTextBackgroundProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeTextBackgroundProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeTextBackgroundSeeThroughProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeTextBackgroundSeeThroughProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeGuiProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeGuiProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeGuiOverlayProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeGuiOverlayProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeGuiTextHighlightProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeGuiTextHighlightProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeGuiGhostRecipeOverlayProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeGuiGhostRecipeOverlayProgram); }
// public int ticks() { return wrapperContained.ticks; }
// public yarnwrap.client.gl.ShaderProgram renderTypeBreezeWindProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeBreezeWindProgram); }
// public yarnwrap.client.gl.ShaderProgram renderTypeCloudsProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeCloudsProgram); }
// public yarnwrap.client.gl.PostEffectProcessor blurPostProcessor() { return new yarnwrap.client.gl.PostEffectProcessor(wrapperContained.blurPostProcessor); }
// public yarnwrap.util.Identifier BLUR_PROCESSOR() { return new yarnwrap.util.Identifier(wrapperContained.BLUR_PROCESSOR); }
public yarnwrap.client.render.Camera getCamera() { return new yarnwrap.client.render.Camera(wrapperContained.getCamera()); }
public void loadProjectionMatrix(org.joml.Matrix4f projectionMatrix) { wrapperContained.loadProjectionMatrix(projectionMatrix); }
public org.joml.Matrix4f getBasicProjectionMatrix(double fov) { return wrapperContained.getBasicProjectionMatrix(fov); }
public yarnwrap.client.render.LightmapTextureManager getLightmapTextureManager() { return new yarnwrap.client.render.LightmapTextureManager(wrapperContained.getLightmapTextureManager()); }
public yarnwrap.client.render.OverlayTexture getOverlayTexture() { return new yarnwrap.client.render.OverlayTexture(wrapperContained.getOverlayTexture()); }
// public void renderNausea(yarnwrap.client.gui.DrawContext context,float distortionStrength) { wrapperContained.renderNausea(context.wrapperContained,distortionStrength); }
public void onCameraEntitySet(yarnwrap.entity.Entity entity) { wrapperContained.onCameraEntitySet(entity.wrapperContained); }
// public void loadPostProcessor(yarnwrap.util.Identifier id) { wrapperContained.loadPostProcessor(id.wrapperContained); }
public void onResized(int width,int height) { wrapperContained.onResized(width,height); }
// public void renderFloatingItem(yarnwrap.client.gui.DrawContext context,float tickDelta) { wrapperContained.renderFloatingItem(context.wrapperContained,tickDelta); }
// public void renderHand(yarnwrap.client.render.Camera camera,float tickDelta) { wrapperContained.renderHand(camera.wrapperContained,tickDelta); }
public float getNightVisionStrength(yarnwrap.entity.LivingEntity entity,float tickDelta) { return wrapperContained.getNightVisionStrength(entity.wrapperContained,tickDelta); }
// public void updateWorldIcon(java.nio.file.Path path) { wrapperContained.updateWorldIcon(path); }
public void tick() { wrapperContained.tick(); }
public yarnwrap.client.gl.PostEffectProcessor getPostProcessor() { return new yarnwrap.client.gl.PostEffectProcessor(wrapperContained.getPostProcessor()); }
public void togglePostProcessorEnabled() { wrapperContained.togglePostProcessorEnabled(); }
// public void bobView(yarnwrap.client.util.math.MatrixStack matrices,float tickDelta) { wrapperContained.bobView(matrices.wrapperContained,tickDelta); }
public void renderWorld(yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderWorld(tickCounter.wrapperContained); }
public void showFloatingItem(yarnwrap.item.ItemStack floatingItem) { wrapperContained.showFloatingItem(floatingItem.wrapperContained); }
public void updateCrosshairTarget(float tickDelta) { wrapperContained.updateCrosshairTarget(tickDelta); }
public void render(yarnwrap.client.render.RenderTickCounter tickCounter,boolean tick) { wrapperContained.render(tickCounter.wrapperContained,tick); }
public float getViewDistance() { return wrapperContained.getViewDistance(); }
public yarnwrap.client.render.MapRenderer getMapRenderer() { return new yarnwrap.client.render.MapRenderer(wrapperContained.getMapRenderer()); }
public float getSkyDarkness(float tickDelta) { return wrapperContained.getSkyDarkness(tickDelta); }
// public double getFov(yarnwrap.client.render.Camera camera,float tickDelta,boolean changingFov) { return wrapperContained.getFov(camera.wrapperContained,tickDelta,changingFov); }
// public void tiltViewWhenHurt(yarnwrap.client.util.math.MatrixStack matrices,float tickDelta) { wrapperContained.tiltViewWhenHurt(matrices.wrapperContained,tickDelta); }
// public void updateFovMultiplier() { wrapperContained.updateFovMultiplier(); }
// public boolean shouldRenderBlockOutline() { return wrapperContained.shouldRenderBlockOutline(); }
public void reset() { wrapperContained.reset(); }
public void disablePostProcessor() { wrapperContained.disablePostProcessor(); }
public float getFarPlaneDistance() { return wrapperContained.getFarPlaneDistance(); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeSolidProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeSolidProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeCutoutMippedProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeCutoutMippedProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeCutoutProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeCutoutProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeTranslucentProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeTranslucentProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeTranslucentMovingBlockProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeTranslucentMovingBlockProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeArmorCutoutNoCullProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeArmorCutoutNoCullProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeEntitySolidProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEntitySolidProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeEntityCutoutProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEntityCutoutProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeEntityCutoutNoNullProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEntityCutoutNoNullProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeEntityCutoutNoNullZOffsetProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEntityCutoutNoNullZOffsetProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeItemEntityTranslucentCullProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeItemEntityTranslucentCullProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeEntityTranslucentCullProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEntityTranslucentCullProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeEntityTranslucentProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEntityTranslucentProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeEntitySmoothCutoutProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEntitySmoothCutoutProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeBeaconBeamProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeBeaconBeamProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeEntityDecalProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEntityDecalProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeEntityNoOutlineProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEntityNoOutlineProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeEntityShadowProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEntityShadowProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeEntityAlphaProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEntityAlphaProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeEyesProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEyesProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeEnergySwirlProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEnergySwirlProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeLeashProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeLeashProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeWaterMaskProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeWaterMaskProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeOutlineProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeOutlineProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeArmorGlintProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeArmorGlintProgram()); }
public void preloadPrograms(yarnwrap.resource.ResourceFactory factory) { wrapperContained.preloadPrograms(factory.wrapperContained); }
// public yarnwrap.client.gl.ShaderProgram preloadProgram(yarnwrap.resource.ResourceFactory factory,java.lang.String name,yarnwrap.client.render.VertexFormat format) { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.preloadProgram(factory.wrapperContained,name,format.wrapperContained)); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeArmorEntityGlintProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeArmorEntityGlintProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeGlintTranslucentProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeGlintTranslucentProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeGlintProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeGlintProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeGlintDirectProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeGlintDirectProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeEntityGlintProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEntityGlintProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeEntityGlintDirectProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEntityGlintDirectProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeTextProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeTextProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeTextSeeThroughProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeTextSeeThroughProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeLightningProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeLightningProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeTripwireProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeTripwireProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeEndPortalProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEndPortalProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeEndGatewayProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEndGatewayProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeLinesProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeLinesProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeCrumblingProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeCrumblingProgram()); }
// public void clearPrograms() { wrapperContained.clearPrograms(); }
// public void loadPrograms(yarnwrap.resource.ResourceFactory factory) { wrapperContained.loadPrograms(factory.wrapperContained); }
public yarnwrap.client.gl.ShaderProgram getPositionProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getPositionProgram()); }
public yarnwrap.client.gl.ShaderProgram getPositionColorProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getPositionColorProgram()); }
public yarnwrap.client.gl.ShaderProgram getPositionTexProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getPositionTexProgram()); }
public yarnwrap.client.gl.ShaderProgram getPositionTexColorProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getPositionTexColorProgram()); }
public yarnwrap.client.gl.ShaderProgram getParticleProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getParticleProgram()); }
public yarnwrap.client.gl.ShaderProgram getPositionColorLightmapProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getPositionColorLightmapProgram()); }
public yarnwrap.client.gl.ShaderProgram getPositionColorTexLightmapProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getPositionColorTexLightmapProgram()); }
public boolean isRenderingPanorama() { return wrapperContained.isRenderingPanorama(); }
public void renderWithZoom(float zoom,float zoomX,float zoomY) { wrapperContained.renderWithZoom(zoom,zoomX,zoomY); }
public yarnwrap.client.gl.ShaderProgram getProgram(java.lang.String name) { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getProgram(name)); }
public void setRenderHand(boolean renderHand) { wrapperContained.setRenderHand(renderHand); }
public void setBlockOutlineEnabled(boolean blockOutlineEnabled) { wrapperContained.setBlockOutlineEnabled(blockOutlineEnabled); }
public void setRenderingPanorama(boolean renderingPanorama) { wrapperContained.setRenderingPanorama(renderingPanorama); }
public yarnwrap.client.MinecraftClient getClient() { return new yarnwrap.client.MinecraftClient(wrapperContained.getClient()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeTextIntensityProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeTextIntensityProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeTextIntensitySeeThroughProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeTextIntensitySeeThroughProgram()); }
// public void updateWorldIcon() { wrapperContained.updateWorldIcon(); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeEntityTranslucentEmissiveProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEntityTranslucentEmissiveProgram()); }
public yarnwrap.resource.ResourceReloader createProgramReloader() { return new yarnwrap.resource.ResourceReloader(wrapperContained.createProgramReloader()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeTextBackgroundProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeTextBackgroundProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeTextBackgroundSeeThroughProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeTextBackgroundSeeThroughProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeGuiProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeGuiProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeGuiOverlayProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeGuiOverlayProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeGuiTextHighlightProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeGuiTextHighlightProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeGuiGhostRecipeOverlayProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeGuiGhostRecipeOverlayProgram()); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeBreezeWindProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeBreezeWindProgram()); }
// public yarnwrap.util.hit.HitResult findCrosshairTarget(yarnwrap.entity.Entity camera,double blockInteractionRange,double entityInteractionRange,float tickDelta) { return new yarnwrap.util.hit.HitResult(wrapperContained.findCrosshairTarget(camera.wrapperContained,blockInteractionRange,entityInteractionRange,tickDelta)); }
// public yarnwrap.util.hit.HitResult ensureTargetInRange(yarnwrap.util.hit.HitResult hitResult,yarnwrap.util.math.Vec3d cameraPos,double interactionRange) { return new yarnwrap.util.hit.HitResult(wrapperContained.ensureTargetInRange(hitResult.wrapperContained,cameraPos.wrapperContained,interactionRange)); }
public yarnwrap.client.gl.ShaderProgram getRenderTypeCloudsProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeCloudsProgram()); }
public void renderBlur(float delta) { wrapperContained.renderBlur(delta); }
// public void loadBlurPostProcessor(yarnwrap.resource.ResourceFactory resourceFactory) { wrapperContained.loadBlurPostProcessor(resourceFactory.wrapperContained); }

}