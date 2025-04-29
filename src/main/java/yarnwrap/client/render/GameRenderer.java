package yarnwrap.client.render;
public class GameRenderer { public net.minecraft.client.render.GameRenderer wrapperContained; public GameRenderer(net.minecraft.client.render.GameRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

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

// public yarnwrap.util.Identifier NAUSEA_OVERLAY() { return new yarnwrap.util.Identifier(wrapperContained.NAUSEA_OVERLAY); }
// public void NAUSEA_OVERLAY(yarnwrap.util.Identifier value) { wrapperContained.NAUSEA_OVERLAY = value.wrapperContained; }
// public static yarnwrap.util.Identifier NAUSEA_OVERLAY() { return new yarnwrap.util.Identifier(net.minecraft.client.render.GameRenderer.NAUSEA_OVERLAY); }
// public static void NAUSEA_OVERLAY(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.GameRenderer.NAUSEA_OVERLAY = value.wrapperContained; }

// public java.util.Map programs() { return wrapperContained.programs; }
// public void programs(java.util.Map value) { wrapperContained.programs = value; }
// public static java.util.Map programs() { return net.minecraft.client.render.GameRenderer.programs; }
// public static void programs(java.util.Map value, ) { net.minecraft.client.render.GameRenderer.programs = value; }

// public yarnwrap.client.gl.ShaderProgram positionProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.positionProgram); }
// public void positionProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.positionProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram positionProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.positionProgram); }
// public static void positionProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.positionProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram positionColorProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.positionColorProgram); }
// public void positionColorProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.positionColorProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram positionColorProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.positionColorProgram); }
// public static void positionColorProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.positionColorProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram positionTexProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.positionTexProgram); }
// public void positionTexProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.positionTexProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram positionTexProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.positionTexProgram); }
// public static void positionTexProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.positionTexProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram positionTexColorProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.positionTexColorProgram); }
// public void positionTexColorProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.positionTexColorProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram positionTexColorProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.positionTexColorProgram); }
// public static void positionTexColorProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.positionTexColorProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram particleProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.particleProgram); }
// public void particleProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.particleProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram particleProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.particleProgram); }
// public static void particleProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.particleProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram positionColorLightmapProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.positionColorLightmapProgram); }
// public void positionColorLightmapProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.positionColorLightmapProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram positionColorLightmapProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.positionColorLightmapProgram); }
// public static void positionColorLightmapProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.positionColorLightmapProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram positionColorTexLightmapProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.positionColorTexLightmapProgram); }
// public void positionColorTexLightmapProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.positionColorTexLightmapProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram positionColorTexLightmapProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.positionColorTexLightmapProgram); }
// public static void positionColorTexLightmapProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.positionColorTexLightmapProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeSolidProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeSolidProgram); }
// public void renderTypeSolidProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeSolidProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeSolidProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeSolidProgram); }
// public static void renderTypeSolidProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeSolidProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeCutoutMippedProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeCutoutMippedProgram); }
// public void renderTypeCutoutMippedProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeCutoutMippedProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeCutoutMippedProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeCutoutMippedProgram); }
// public static void renderTypeCutoutMippedProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeCutoutMippedProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeCutoutProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeCutoutProgram); }
// public void renderTypeCutoutProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeCutoutProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeCutoutProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeCutoutProgram); }
// public static void renderTypeCutoutProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeCutoutProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeTranslucentProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeTranslucentProgram); }
// public void renderTypeTranslucentProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeTranslucentProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeTranslucentProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeTranslucentProgram); }
// public static void renderTypeTranslucentProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeTranslucentProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeEntityGlintProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEntityGlintProgram); }
// public void renderTypeEntityGlintProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeEntityGlintProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeEntityGlintProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeEntityGlintProgram); }
// public static void renderTypeEntityGlintProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeEntityGlintProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeEntityGlintDirectProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEntityGlintDirectProgram); }
// public void renderTypeEntityGlintDirectProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeEntityGlintDirectProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeEntityGlintDirectProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeEntityGlintDirectProgram); }
// public static void renderTypeEntityGlintDirectProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeEntityGlintDirectProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeTextProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeTextProgram); }
// public void renderTypeTextProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeTextProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeTextProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeTextProgram); }
// public static void renderTypeTextProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeTextProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeTextSeeThroughProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeTextSeeThroughProgram); }
// public void renderTypeTextSeeThroughProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeTextSeeThroughProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeTextSeeThroughProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeTextSeeThroughProgram); }
// public static void renderTypeTextSeeThroughProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeTextSeeThroughProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeLightningProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeLightningProgram); }
// public void renderTypeLightningProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeLightningProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeLightningProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeLightningProgram); }
// public static void renderTypeLightningProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeLightningProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeTripwireProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeTripwireProgram); }
// public void renderTypeTripwireProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeTripwireProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeTripwireProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeTripwireProgram); }
// public static void renderTypeTripwireProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeTripwireProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeEndPortalProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEndPortalProgram); }
// public void renderTypeEndPortalProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeEndPortalProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeEndPortalProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeEndPortalProgram); }
// public static void renderTypeEndPortalProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeEndPortalProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeEndGatewayProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEndGatewayProgram); }
// public void renderTypeEndGatewayProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeEndGatewayProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeEndGatewayProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeEndGatewayProgram); }
// public static void renderTypeEndGatewayProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeEndGatewayProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeLinesProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeLinesProgram); }
// public void renderTypeLinesProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeLinesProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeLinesProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeLinesProgram); }
// public static void renderTypeLinesProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeLinesProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeCrumblingProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeCrumblingProgram); }
// public void renderTypeCrumblingProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeCrumblingProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeCrumblingProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeCrumblingProgram); }
// public static void renderTypeCrumblingProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeCrumblingProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeTranslucentMovingBlockProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeTranslucentMovingBlockProgram); }
// public void renderTypeTranslucentMovingBlockProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeTranslucentMovingBlockProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeTranslucentMovingBlockProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeTranslucentMovingBlockProgram); }
// public static void renderTypeTranslucentMovingBlockProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeTranslucentMovingBlockProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeArmorCutoutNoCullProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeArmorCutoutNoCullProgram); }
// public void renderTypeArmorCutoutNoCullProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeArmorCutoutNoCullProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeArmorCutoutNoCullProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeArmorCutoutNoCullProgram); }
// public static void renderTypeArmorCutoutNoCullProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeArmorCutoutNoCullProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeEntitySolidProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEntitySolidProgram); }
// public void renderTypeEntitySolidProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeEntitySolidProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeEntitySolidProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeEntitySolidProgram); }
// public static void renderTypeEntitySolidProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeEntitySolidProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeEntityCutoutProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEntityCutoutProgram); }
// public void renderTypeEntityCutoutProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeEntityCutoutProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeEntityCutoutProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeEntityCutoutProgram); }
// public static void renderTypeEntityCutoutProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeEntityCutoutProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeEntityCutoutNoNullProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEntityCutoutNoNullProgram); }
// public void renderTypeEntityCutoutNoNullProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeEntityCutoutNoNullProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeEntityCutoutNoNullProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeEntityCutoutNoNullProgram); }
// public static void renderTypeEntityCutoutNoNullProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeEntityCutoutNoNullProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeEntityCutoutNoNullZOffsetProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEntityCutoutNoNullZOffsetProgram); }
// public void renderTypeEntityCutoutNoNullZOffsetProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeEntityCutoutNoNullZOffsetProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeEntityCutoutNoNullZOffsetProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeEntityCutoutNoNullZOffsetProgram); }
// public static void renderTypeEntityCutoutNoNullZOffsetProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeEntityCutoutNoNullZOffsetProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeItemEntityTranslucentCullProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeItemEntityTranslucentCullProgram); }
// public void renderTypeItemEntityTranslucentCullProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeItemEntityTranslucentCullProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeItemEntityTranslucentCullProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeItemEntityTranslucentCullProgram); }
// public static void renderTypeItemEntityTranslucentCullProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeItemEntityTranslucentCullProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeEntityTranslucentCullProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEntityTranslucentCullProgram); }
// public void renderTypeEntityTranslucentCullProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeEntityTranslucentCullProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeEntityTranslucentCullProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeEntityTranslucentCullProgram); }
// public static void renderTypeEntityTranslucentCullProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeEntityTranslucentCullProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeEntityTranslucentProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEntityTranslucentProgram); }
// public void renderTypeEntityTranslucentProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeEntityTranslucentProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeEntityTranslucentProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeEntityTranslucentProgram); }
// public static void renderTypeEntityTranslucentProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeEntityTranslucentProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeEntitySmoothCutoutProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEntitySmoothCutoutProgram); }
// public void renderTypeEntitySmoothCutoutProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeEntitySmoothCutoutProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeEntitySmoothCutoutProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeEntitySmoothCutoutProgram); }
// public static void renderTypeEntitySmoothCutoutProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeEntitySmoothCutoutProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeBeaconBeamProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeBeaconBeamProgram); }
// public void renderTypeBeaconBeamProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeBeaconBeamProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeBeaconBeamProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeBeaconBeamProgram); }
// public static void renderTypeBeaconBeamProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeBeaconBeamProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeEntityDecalProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEntityDecalProgram); }
// public void renderTypeEntityDecalProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeEntityDecalProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeEntityDecalProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeEntityDecalProgram); }
// public static void renderTypeEntityDecalProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeEntityDecalProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeEntityNoOutlineProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEntityNoOutlineProgram); }
// public void renderTypeEntityNoOutlineProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeEntityNoOutlineProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeEntityNoOutlineProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeEntityNoOutlineProgram); }
// public static void renderTypeEntityNoOutlineProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeEntityNoOutlineProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeEntityShadowProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEntityShadowProgram); }
// public void renderTypeEntityShadowProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeEntityShadowProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeEntityShadowProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeEntityShadowProgram); }
// public static void renderTypeEntityShadowProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeEntityShadowProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeEntityAlphaProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEntityAlphaProgram); }
// public void renderTypeEntityAlphaProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeEntityAlphaProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeEntityAlphaProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeEntityAlphaProgram); }
// public static void renderTypeEntityAlphaProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeEntityAlphaProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeEyesProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEyesProgram); }
// public void renderTypeEyesProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeEyesProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeEyesProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeEyesProgram); }
// public static void renderTypeEyesProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeEyesProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeEnergySwirlProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEnergySwirlProgram); }
// public void renderTypeEnergySwirlProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeEnergySwirlProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeEnergySwirlProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeEnergySwirlProgram); }
// public static void renderTypeEnergySwirlProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeEnergySwirlProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeLeashProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeLeashProgram); }
// public void renderTypeLeashProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeLeashProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeLeashProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeLeashProgram); }
// public static void renderTypeLeashProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeLeashProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeWaterMaskProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeWaterMaskProgram); }
// public void renderTypeWaterMaskProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeWaterMaskProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeWaterMaskProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeWaterMaskProgram); }
// public static void renderTypeWaterMaskProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeWaterMaskProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeOutlineProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeOutlineProgram); }
// public void renderTypeOutlineProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeOutlineProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeOutlineProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeOutlineProgram); }
// public static void renderTypeOutlineProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeOutlineProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeArmorGlintProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeArmorGlintProgram); }
// public void renderTypeArmorGlintProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeArmorGlintProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeArmorGlintProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeArmorGlintProgram); }
// public static void renderTypeArmorGlintProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeArmorGlintProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeArmorEntityGlintProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeArmorEntityGlintProgram); }
// public void renderTypeArmorEntityGlintProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeArmorEntityGlintProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeArmorEntityGlintProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeArmorEntityGlintProgram); }
// public static void renderTypeArmorEntityGlintProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeArmorEntityGlintProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeGlintTranslucentProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeGlintTranslucentProgram); }
// public void renderTypeGlintTranslucentProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeGlintTranslucentProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeGlintTranslucentProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeGlintTranslucentProgram); }
// public static void renderTypeGlintTranslucentProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeGlintTranslucentProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeGlintProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeGlintProgram); }
// public void renderTypeGlintProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeGlintProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeGlintProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeGlintProgram); }
// public static void renderTypeGlintProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeGlintProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeGlintDirectProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeGlintDirectProgram); }
// public void renderTypeGlintDirectProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeGlintDirectProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeGlintDirectProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeGlintDirectProgram); }
// public static void renderTypeGlintDirectProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeGlintDirectProgram = value.wrapperContained; }

public yarnwrap.client.gl.ShaderProgram blitScreenProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.blitScreenProgram); }
public void blitScreenProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.blitScreenProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram blitScreenProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.blitScreenProgram); }
// public static void blitScreenProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.blitScreenProgram = value.wrapperContained; }

// public float CAMERA_DEPTH() { return wrapperContained.CAMERA_DEPTH; }
// public void CAMERA_DEPTH(float value) { wrapperContained.CAMERA_DEPTH = value; }
public static float CAMERA_DEPTH() { return net.minecraft.client.render.GameRenderer.CAMERA_DEPTH; }
// public static void CAMERA_DEPTH(float value, ) { net.minecraft.client.render.GameRenderer.CAMERA_DEPTH = value; }

// public yarnwrap.client.gl.ShaderProgram renderTypeTextIntensityProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeTextIntensityProgram); }
// public void renderTypeTextIntensityProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeTextIntensityProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeTextIntensityProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeTextIntensityProgram); }
// public static void renderTypeTextIntensityProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeTextIntensityProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeTextIntensitySeeThroughProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeTextIntensitySeeThroughProgram); }
// public void renderTypeTextIntensitySeeThroughProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeTextIntensitySeeThroughProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeTextIntensitySeeThroughProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeTextIntensitySeeThroughProgram); }
// public static void renderTypeTextIntensitySeeThroughProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeTextIntensitySeeThroughProgram = value.wrapperContained; }

// public boolean hasWorldIcon() { return wrapperContained.hasWorldIcon; }
// public void hasWorldIcon(boolean value) { wrapperContained.hasWorldIcon = value; }
// public static boolean hasWorldIcon() { return net.minecraft.client.render.GameRenderer.hasWorldIcon; }
// public static void hasWorldIcon(boolean value, ) { net.minecraft.client.render.GameRenderer.hasWorldIcon = value; }

// public yarnwrap.client.gl.ShaderProgram renderTypeEntityTranslucentEmissiveProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeEntityTranslucentEmissiveProgram); }
// public void renderTypeEntityTranslucentEmissiveProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeEntityTranslucentEmissiveProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeEntityTranslucentEmissiveProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeEntityTranslucentEmissiveProgram); }
// public static void renderTypeEntityTranslucentEmissiveProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeEntityTranslucentEmissiveProgram = value.wrapperContained; }

// public float zoomX() { return wrapperContained.zoomX; }
// public void zoomX(float value) { wrapperContained.zoomX = value; }
// public static float zoomX() { return net.minecraft.client.render.GameRenderer.zoomX; }
// public static void zoomX(float value, ) { net.minecraft.client.render.GameRenderer.zoomX = value; }

// public boolean renderHand() { return wrapperContained.renderHand; }
// public void renderHand(boolean value) { wrapperContained.renderHand = value; }
// public static boolean renderHand() { return net.minecraft.client.render.GameRenderer.renderHand; }
// public static void renderHand(boolean value, ) { net.minecraft.client.render.GameRenderer.renderHand = value; }

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

// public float floatingItemHeight() { return wrapperContained.floatingItemHeight; }
// public void floatingItemHeight(float value) { wrapperContained.floatingItemHeight = value; }
// public static float floatingItemHeight() { return net.minecraft.client.render.GameRenderer.floatingItemHeight; }
// public static void floatingItemHeight(float value, ) { net.minecraft.client.render.GameRenderer.floatingItemHeight = value; }

// public float zoomY() { return wrapperContained.zoomY; }
// public void zoomY(float value) { wrapperContained.zoomY = value; }
// public static float zoomY() { return net.minecraft.client.render.GameRenderer.zoomY; }
// public static void zoomY(float value, ) { net.minecraft.client.render.GameRenderer.zoomY = value; }

// public float zoom() { return wrapperContained.zoom; }
// public void zoom(float value) { wrapperContained.zoom = value; }
// public static float zoom() { return net.minecraft.client.render.GameRenderer.zoom; }
// public static void zoom(float value, ) { net.minecraft.client.render.GameRenderer.zoom = value; }

// public yarnwrap.item.ItemStack floatingItem() { return new yarnwrap.item.ItemStack(wrapperContained.floatingItem); }
// public void floatingItem(yarnwrap.item.ItemStack value) { wrapperContained.floatingItem = value.wrapperContained; }
// public static yarnwrap.item.ItemStack floatingItem() { return new yarnwrap.item.ItemStack(net.minecraft.client.render.GameRenderer.floatingItem); }
// public static void floatingItem(yarnwrap.item.ItemStack value, ) { net.minecraft.client.render.GameRenderer.floatingItem = value.wrapperContained; }

// public int floatingItemTimeLeft() { return wrapperContained.floatingItemTimeLeft; }
// public void floatingItemTimeLeft(int value) { wrapperContained.floatingItemTimeLeft = value; }
// public static int floatingItemTimeLeft() { return net.minecraft.client.render.GameRenderer.floatingItemTimeLeft; }
// public static void floatingItemTimeLeft(int value, ) { net.minecraft.client.render.GameRenderer.floatingItemTimeLeft = value; }

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

// public yarnwrap.resource.ResourceManager resourceManager() { return new yarnwrap.resource.ResourceManager(wrapperContained.resourceManager); }
// public void resourceManager(yarnwrap.resource.ResourceManager value) { wrapperContained.resourceManager = value.wrapperContained; }
// public static yarnwrap.resource.ResourceManager resourceManager() { return new yarnwrap.resource.ResourceManager(net.minecraft.client.render.GameRenderer.resourceManager); }
// public static void resourceManager(yarnwrap.resource.ResourceManager value, ) { net.minecraft.client.render.GameRenderer.resourceManager = value.wrapperContained; }

// public float fovMultiplier() { return wrapperContained.fovMultiplier; }
// public void fovMultiplier(float value) { wrapperContained.fovMultiplier = value; }
// public static float fovMultiplier() { return net.minecraft.client.render.GameRenderer.fovMultiplier; }
// public static void fovMultiplier(float value, ) { net.minecraft.client.render.GameRenderer.fovMultiplier = value; }

// public yarnwrap.client.gl.PostEffectProcessor postProcessor() { return new yarnwrap.client.gl.PostEffectProcessor(wrapperContained.postProcessor); }
// public void postProcessor(yarnwrap.client.gl.PostEffectProcessor value) { wrapperContained.postProcessor = value.wrapperContained; }
// public static yarnwrap.client.gl.PostEffectProcessor postProcessor() { return new yarnwrap.client.gl.PostEffectProcessor(net.minecraft.client.render.GameRenderer.postProcessor); }
// public static void postProcessor(yarnwrap.client.gl.PostEffectProcessor value, ) { net.minecraft.client.render.GameRenderer.postProcessor = value.wrapperContained; }

// public float viewDistance() { return wrapperContained.viewDistance; }
// public void viewDistance(float value) { wrapperContained.viewDistance = value; }
// public static float viewDistance() { return net.minecraft.client.render.GameRenderer.viewDistance; }
// public static void viewDistance(float value, ) { net.minecraft.client.render.GameRenderer.viewDistance = value; }

// public yarnwrap.client.render.MapRenderer mapRenderer() { return new yarnwrap.client.render.MapRenderer(wrapperContained.mapRenderer); }
// public void mapRenderer(yarnwrap.client.render.MapRenderer value) { wrapperContained.mapRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.MapRenderer mapRenderer() { return new yarnwrap.client.render.MapRenderer(net.minecraft.client.render.GameRenderer.mapRenderer); }
// public static void mapRenderer(yarnwrap.client.render.MapRenderer value, ) { net.minecraft.client.render.GameRenderer.mapRenderer = value.wrapperContained; }

// public yarnwrap.client.render.LightmapTextureManager lightmapTextureManager() { return new yarnwrap.client.render.LightmapTextureManager(wrapperContained.lightmapTextureManager); }
// public void lightmapTextureManager(yarnwrap.client.render.LightmapTextureManager value) { wrapperContained.lightmapTextureManager = value.wrapperContained; }
// public static yarnwrap.client.render.LightmapTextureManager lightmapTextureManager() { return new yarnwrap.client.render.LightmapTextureManager(net.minecraft.client.render.GameRenderer.lightmapTextureManager); }
// public static void lightmapTextureManager(yarnwrap.client.render.LightmapTextureManager value, ) { net.minecraft.client.render.GameRenderer.lightmapTextureManager = value.wrapperContained; }

// public float floatingItemWidth() { return wrapperContained.floatingItemWidth; }
// public void floatingItemWidth(float value) { wrapperContained.floatingItemWidth = value; }
// public static float floatingItemWidth() { return net.minecraft.client.render.GameRenderer.floatingItemWidth; }
// public static void floatingItemWidth(float value, ) { net.minecraft.client.render.GameRenderer.floatingItemWidth = value; }

// public yarnwrap.client.gl.ShaderProgram renderTypeTextBackgroundProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeTextBackgroundProgram); }
// public void renderTypeTextBackgroundProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeTextBackgroundProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeTextBackgroundProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeTextBackgroundProgram); }
// public static void renderTypeTextBackgroundProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeTextBackgroundProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeTextBackgroundSeeThroughProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeTextBackgroundSeeThroughProgram); }
// public void renderTypeTextBackgroundSeeThroughProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeTextBackgroundSeeThroughProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeTextBackgroundSeeThroughProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeTextBackgroundSeeThroughProgram); }
// public static void renderTypeTextBackgroundSeeThroughProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeTextBackgroundSeeThroughProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeGuiProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeGuiProgram); }
// public void renderTypeGuiProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeGuiProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeGuiProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeGuiProgram); }
// public static void renderTypeGuiProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeGuiProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeGuiOverlayProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeGuiOverlayProgram); }
// public void renderTypeGuiOverlayProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeGuiOverlayProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeGuiOverlayProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeGuiOverlayProgram); }
// public static void renderTypeGuiOverlayProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeGuiOverlayProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeGuiTextHighlightProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeGuiTextHighlightProgram); }
// public void renderTypeGuiTextHighlightProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeGuiTextHighlightProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeGuiTextHighlightProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeGuiTextHighlightProgram); }
// public static void renderTypeGuiTextHighlightProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeGuiTextHighlightProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeGuiGhostRecipeOverlayProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeGuiGhostRecipeOverlayProgram); }
// public void renderTypeGuiGhostRecipeOverlayProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeGuiGhostRecipeOverlayProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeGuiGhostRecipeOverlayProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeGuiGhostRecipeOverlayProgram); }
// public static void renderTypeGuiGhostRecipeOverlayProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeGuiGhostRecipeOverlayProgram = value.wrapperContained; }

// public int ticks() { return wrapperContained.ticks; }
// public void ticks(int value) { wrapperContained.ticks = value; }
// public static int ticks() { return net.minecraft.client.render.GameRenderer.ticks; }
// public static void ticks(int value, ) { net.minecraft.client.render.GameRenderer.ticks = value; }

// public yarnwrap.client.gl.ShaderProgram renderTypeBreezeWindProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeBreezeWindProgram); }
// public void renderTypeBreezeWindProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeBreezeWindProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeBreezeWindProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeBreezeWindProgram); }
// public static void renderTypeBreezeWindProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeBreezeWindProgram = value.wrapperContained; }

// public yarnwrap.client.gl.ShaderProgram renderTypeCloudsProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.renderTypeCloudsProgram); }
// public void renderTypeCloudsProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.renderTypeCloudsProgram = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgram renderTypeCloudsProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.renderTypeCloudsProgram); }
// public static void renderTypeCloudsProgram(yarnwrap.client.gl.ShaderProgram value, ) { net.minecraft.client.render.GameRenderer.renderTypeCloudsProgram = value.wrapperContained; }

// public yarnwrap.client.gl.PostEffectProcessor blurPostProcessor() { return new yarnwrap.client.gl.PostEffectProcessor(wrapperContained.blurPostProcessor); }
// public void blurPostProcessor(yarnwrap.client.gl.PostEffectProcessor value) { wrapperContained.blurPostProcessor = value.wrapperContained; }
// public static yarnwrap.client.gl.PostEffectProcessor blurPostProcessor() { return new yarnwrap.client.gl.PostEffectProcessor(net.minecraft.client.render.GameRenderer.blurPostProcessor); }
// public static void blurPostProcessor(yarnwrap.client.gl.PostEffectProcessor value, ) { net.minecraft.client.render.GameRenderer.blurPostProcessor = value.wrapperContained; }

// public yarnwrap.util.Identifier BLUR_PROCESSOR() { return new yarnwrap.util.Identifier(wrapperContained.BLUR_PROCESSOR); }
// public void BLUR_PROCESSOR(yarnwrap.util.Identifier value) { wrapperContained.BLUR_PROCESSOR = value.wrapperContained; }
// public static yarnwrap.util.Identifier BLUR_PROCESSOR() { return new yarnwrap.util.Identifier(net.minecraft.client.render.GameRenderer.BLUR_PROCESSOR); }
// public static void BLUR_PROCESSOR(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.GameRenderer.BLUR_PROCESSOR = value.wrapperContained; }

public GameRenderer(yarnwrap.client.MinecraftClient client,yarnwrap.client.render.item.HeldItemRenderer heldItemRenderer,yarnwrap.resource.ResourceManager resourceManager,yarnwrap.client.render.BufferBuilderStorage buffers) { this.wrapperContained = new net.minecraft.client.render.GameRenderer(client.wrapperContained,heldItemRenderer.wrapperContained,resourceManager.wrapperContained,buffers.wrapperContained); }
// public boolean method_18144(yarnwrap.entity.Entity entity) { return wrapperContained.method_18144(entity.wrapperContained); }
// public static boolean method_18144(yarnwrap.entity.Entity entity, ) { return net.minecraft.client.render.GameRenderer.method_18144(entity.wrapperContained); }
public yarnwrap.client.render.Camera getCamera() { return new yarnwrap.client.render.Camera(wrapperContained.getCamera()); }
// public static yarnwrap.client.render.Camera getCamera() { return new yarnwrap.client.render.Camera(net.minecraft.client.render.GameRenderer.getCamera()); }
public void loadProjectionMatrix(org.joml.Matrix4f projectionMatrix) { wrapperContained.loadProjectionMatrix(projectionMatrix); }
// public static void loadProjectionMatrix(org.joml.Matrix4f projectionMatrix, ) { net.minecraft.client.render.GameRenderer.loadProjectionMatrix(projectionMatrix); }
public org.joml.Matrix4f getBasicProjectionMatrix(double fov) { return wrapperContained.getBasicProjectionMatrix(fov); }
// public static org.joml.Matrix4f getBasicProjectionMatrix(double fov, ) { return net.minecraft.client.render.GameRenderer.getBasicProjectionMatrix(fov); }
public yarnwrap.client.render.LightmapTextureManager getLightmapTextureManager() { return new yarnwrap.client.render.LightmapTextureManager(wrapperContained.getLightmapTextureManager()); }
// public static yarnwrap.client.render.LightmapTextureManager getLightmapTextureManager() { return new yarnwrap.client.render.LightmapTextureManager(net.minecraft.client.render.GameRenderer.getLightmapTextureManager()); }
public yarnwrap.client.render.OverlayTexture getOverlayTexture() { return new yarnwrap.client.render.OverlayTexture(wrapperContained.getOverlayTexture()); }
// public static yarnwrap.client.render.OverlayTexture getOverlayTexture() { return new yarnwrap.client.render.OverlayTexture(net.minecraft.client.render.GameRenderer.getOverlayTexture()); }
// public void renderNausea(yarnwrap.client.gui.DrawContext context,float distortionStrength) { wrapperContained.renderNausea(context.wrapperContained,distortionStrength); }
// public static void renderNausea(yarnwrap.client.gui.DrawContext context,float distortionStrength, ) { net.minecraft.client.render.GameRenderer.renderNausea(context.wrapperContained,distortionStrength); }
public void onCameraEntitySet(yarnwrap.entity.Entity entity) { wrapperContained.onCameraEntitySet(entity.wrapperContained); }
// public static void onCameraEntitySet(yarnwrap.entity.Entity entity, ) { net.minecraft.client.render.GameRenderer.onCameraEntitySet(entity.wrapperContained); }
// public void loadPostProcessor(yarnwrap.util.Identifier id) { wrapperContained.loadPostProcessor(id.wrapperContained); }
// public static void loadPostProcessor(yarnwrap.util.Identifier id, ) { net.minecraft.client.render.GameRenderer.loadPostProcessor(id.wrapperContained); }
public void onResized(int width,int height) { wrapperContained.onResized(width,height); }
// public static void onResized(int width,int height, ) { net.minecraft.client.render.GameRenderer.onResized(width,height); }
// public void renderFloatingItem(yarnwrap.client.gui.DrawContext context,float tickDelta) { wrapperContained.renderFloatingItem(context.wrapperContained,tickDelta); }
// public static void renderFloatingItem(yarnwrap.client.gui.DrawContext context,float tickDelta, ) { net.minecraft.client.render.GameRenderer.renderFloatingItem(context.wrapperContained,tickDelta); }
// public void renderHand(yarnwrap.client.render.Camera camera,float tickDelta) { wrapperContained.renderHand(camera.wrapperContained,tickDelta); }
// public static void renderHand(yarnwrap.client.render.Camera camera,float tickDelta, ) { net.minecraft.client.render.GameRenderer.renderHand(camera.wrapperContained,tickDelta); }
// public float getNightVisionStrength(yarnwrap.entity.LivingEntity entity,float tickDelta) { return wrapperContained.getNightVisionStrength(entity.wrapperContained,tickDelta); }
// public static float getNightVisionStrength(yarnwrap.entity.LivingEntity entity,float tickDelta, ) { return net.minecraft.client.render.GameRenderer.getNightVisionStrength(entity.wrapperContained,tickDelta); }
// public void updateWorldIcon(java.nio.file.Path path) { wrapperContained.updateWorldIcon(path); }
// public static void updateWorldIcon(java.nio.file.Path path, ) { net.minecraft.client.render.GameRenderer.updateWorldIcon(path); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.client.render.GameRenderer.tick(); }
public yarnwrap.client.gl.PostEffectProcessor getPostProcessor() { return new yarnwrap.client.gl.PostEffectProcessor(wrapperContained.getPostProcessor()); }
// public static yarnwrap.client.gl.PostEffectProcessor getPostProcessor() { return new yarnwrap.client.gl.PostEffectProcessor(net.minecraft.client.render.GameRenderer.getPostProcessor()); }
public void togglePostProcessorEnabled() { wrapperContained.togglePostProcessorEnabled(); }
// public static void togglePostProcessorEnabled() { net.minecraft.client.render.GameRenderer.togglePostProcessorEnabled(); }
// public void bobView(yarnwrap.client.util.math.MatrixStack matrices,float tickDelta) { wrapperContained.bobView(matrices.wrapperContained,tickDelta); }
// public static void bobView(yarnwrap.client.util.math.MatrixStack matrices,float tickDelta, ) { net.minecraft.client.render.GameRenderer.bobView(matrices.wrapperContained,tickDelta); }
public void renderWorld(yarnwrap.client.render.RenderTickCounter tickCounter) { wrapperContained.renderWorld(tickCounter.wrapperContained); }
// public static void renderWorld(yarnwrap.client.render.RenderTickCounter tickCounter, ) { net.minecraft.client.render.GameRenderer.renderWorld(tickCounter.wrapperContained); }
public void showFloatingItem(yarnwrap.item.ItemStack floatingItem) { wrapperContained.showFloatingItem(floatingItem.wrapperContained); }
// public static void showFloatingItem(yarnwrap.item.ItemStack floatingItem, ) { net.minecraft.client.render.GameRenderer.showFloatingItem(floatingItem.wrapperContained); }
public void updateCrosshairTarget(float tickDelta) { wrapperContained.updateCrosshairTarget(tickDelta); }
// public static void updateCrosshairTarget(float tickDelta, ) { net.minecraft.client.render.GameRenderer.updateCrosshairTarget(tickDelta); }
public void render(yarnwrap.client.render.RenderTickCounter tickCounter,boolean tick) { wrapperContained.render(tickCounter.wrapperContained,tick); }
// public static void render(yarnwrap.client.render.RenderTickCounter tickCounter,boolean tick, ) { net.minecraft.client.render.GameRenderer.render(tickCounter.wrapperContained,tick); }
public float getViewDistance() { return wrapperContained.getViewDistance(); }
// public static float getViewDistance() { return net.minecraft.client.render.GameRenderer.getViewDistance(); }
public yarnwrap.client.render.MapRenderer getMapRenderer() { return new yarnwrap.client.render.MapRenderer(wrapperContained.getMapRenderer()); }
// public static yarnwrap.client.render.MapRenderer getMapRenderer() { return new yarnwrap.client.render.MapRenderer(net.minecraft.client.render.GameRenderer.getMapRenderer()); }
public float getSkyDarkness(float tickDelta) { return wrapperContained.getSkyDarkness(tickDelta); }
// public static float getSkyDarkness(float tickDelta, ) { return net.minecraft.client.render.GameRenderer.getSkyDarkness(tickDelta); }
// public double getFov(yarnwrap.client.render.Camera camera,float tickDelta,boolean changingFov) { return wrapperContained.getFov(camera.wrapperContained,tickDelta,changingFov); }
// public static double getFov(yarnwrap.client.render.Camera camera,float tickDelta,boolean changingFov, ) { return net.minecraft.client.render.GameRenderer.getFov(camera.wrapperContained,tickDelta,changingFov); }
// public void tiltViewWhenHurt(yarnwrap.client.util.math.MatrixStack matrices,float tickDelta) { wrapperContained.tiltViewWhenHurt(matrices.wrapperContained,tickDelta); }
// public static void tiltViewWhenHurt(yarnwrap.client.util.math.MatrixStack matrices,float tickDelta, ) { net.minecraft.client.render.GameRenderer.tiltViewWhenHurt(matrices.wrapperContained,tickDelta); }
// public void updateFovMultiplier() { wrapperContained.updateFovMultiplier(); }
// public static void updateFovMultiplier() { net.minecraft.client.render.GameRenderer.updateFovMultiplier(); }
// public boolean shouldRenderBlockOutline() { return wrapperContained.shouldRenderBlockOutline(); }
// public static boolean shouldRenderBlockOutline() { return net.minecraft.client.render.GameRenderer.shouldRenderBlockOutline(); }
public void reset() { wrapperContained.reset(); }
// public static void reset() { net.minecraft.client.render.GameRenderer.reset(); }
public void disablePostProcessor() { wrapperContained.disablePostProcessor(); }
// public static void disablePostProcessor() { net.minecraft.client.render.GameRenderer.disablePostProcessor(); }
public float getFarPlaneDistance() { return wrapperContained.getFarPlaneDistance(); }
// public static float getFarPlaneDistance() { return net.minecraft.client.render.GameRenderer.getFarPlaneDistance(); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeSolidProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeSolidProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeSolidProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeSolidProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeCutoutMippedProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeCutoutMippedProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeCutoutMippedProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeCutoutMippedProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeCutoutProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeCutoutProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeCutoutProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeCutoutProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeTranslucentProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeTranslucentProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeTranslucentProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeTranslucentProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeTranslucentMovingBlockProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeTranslucentMovingBlockProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeTranslucentMovingBlockProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeTranslucentMovingBlockProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeArmorCutoutNoCullProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeArmorCutoutNoCullProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeArmorCutoutNoCullProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeArmorCutoutNoCullProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeEntitySolidProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEntitySolidProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeEntitySolidProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeEntitySolidProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeEntityCutoutProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEntityCutoutProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeEntityCutoutProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeEntityCutoutProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeEntityCutoutNoNullProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEntityCutoutNoNullProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeEntityCutoutNoNullProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeEntityCutoutNoNullProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeEntityCutoutNoNullZOffsetProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEntityCutoutNoNullZOffsetProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeEntityCutoutNoNullZOffsetProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeEntityCutoutNoNullZOffsetProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeItemEntityTranslucentCullProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeItemEntityTranslucentCullProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeItemEntityTranslucentCullProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeItemEntityTranslucentCullProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeEntityTranslucentCullProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEntityTranslucentCullProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeEntityTranslucentCullProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeEntityTranslucentCullProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeEntityTranslucentProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEntityTranslucentProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeEntityTranslucentProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeEntityTranslucentProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeEntitySmoothCutoutProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEntitySmoothCutoutProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeEntitySmoothCutoutProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeEntitySmoothCutoutProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeBeaconBeamProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeBeaconBeamProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeBeaconBeamProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeBeaconBeamProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeEntityDecalProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEntityDecalProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeEntityDecalProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeEntityDecalProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeEntityNoOutlineProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEntityNoOutlineProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeEntityNoOutlineProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeEntityNoOutlineProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeEntityShadowProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEntityShadowProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeEntityShadowProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeEntityShadowProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeEntityAlphaProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEntityAlphaProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeEntityAlphaProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeEntityAlphaProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeEyesProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEyesProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeEyesProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeEyesProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeEnergySwirlProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEnergySwirlProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeEnergySwirlProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeEnergySwirlProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeLeashProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeLeashProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeLeashProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeLeashProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeWaterMaskProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeWaterMaskProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeWaterMaskProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeWaterMaskProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeOutlineProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeOutlineProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeOutlineProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeOutlineProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeArmorGlintProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeArmorGlintProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeArmorGlintProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeArmorGlintProgram()); }
public void preloadPrograms(yarnwrap.resource.ResourceFactory factory) { wrapperContained.preloadPrograms(factory.wrapperContained); }
// public static void preloadPrograms(yarnwrap.resource.ResourceFactory factory, ) { net.minecraft.client.render.GameRenderer.preloadPrograms(factory.wrapperContained); }
// public yarnwrap.client.gl.ShaderProgram preloadProgram(yarnwrap.resource.ResourceFactory factory,java.lang.String name,yarnwrap.client.render.VertexFormat format) { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.preloadProgram(factory.wrapperContained,name,format.wrapperContained)); }
// public static yarnwrap.client.gl.ShaderProgram preloadProgram(yarnwrap.resource.ResourceFactory factory,java.lang.String name,yarnwrap.client.render.VertexFormat format, ) { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.preloadProgram(factory.wrapperContained,name,format.wrapperContained)); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeArmorEntityGlintProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeArmorEntityGlintProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeArmorEntityGlintProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeArmorEntityGlintProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeGlintTranslucentProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeGlintTranslucentProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeGlintTranslucentProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeGlintTranslucentProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeGlintProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeGlintProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeGlintProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeGlintProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeGlintDirectProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeGlintDirectProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeGlintDirectProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeGlintDirectProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeEntityGlintProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEntityGlintProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeEntityGlintProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeEntityGlintProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeEntityGlintDirectProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEntityGlintDirectProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeEntityGlintDirectProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeEntityGlintDirectProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeTextProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeTextProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeTextProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeTextProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeTextSeeThroughProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeTextSeeThroughProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeTextSeeThroughProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeTextSeeThroughProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeLightningProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeLightningProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeLightningProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeLightningProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeTripwireProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeTripwireProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeTripwireProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeTripwireProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeEndPortalProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEndPortalProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeEndPortalProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeEndPortalProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeEndGatewayProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEndGatewayProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeEndGatewayProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeEndGatewayProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeLinesProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeLinesProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeLinesProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeLinesProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeCrumblingProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeCrumblingProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeCrumblingProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeCrumblingProgram()); }
// public void clearPrograms() { wrapperContained.clearPrograms(); }
// public static void clearPrograms() { net.minecraft.client.render.GameRenderer.clearPrograms(); }
// public void loadPrograms(yarnwrap.resource.ResourceFactory factory) { wrapperContained.loadPrograms(factory.wrapperContained); }
// public static void loadPrograms(yarnwrap.resource.ResourceFactory factory, ) { net.minecraft.client.render.GameRenderer.loadPrograms(factory.wrapperContained); }
// public yarnwrap.client.gl.ShaderProgram getPositionProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getPositionProgram()); }
public static yarnwrap.client.gl.ShaderProgram getPositionProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getPositionProgram()); }
// public yarnwrap.client.gl.ShaderProgram getPositionColorProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getPositionColorProgram()); }
public static yarnwrap.client.gl.ShaderProgram getPositionColorProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getPositionColorProgram()); }
// public yarnwrap.client.gl.ShaderProgram getPositionTexProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getPositionTexProgram()); }
public static yarnwrap.client.gl.ShaderProgram getPositionTexProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getPositionTexProgram()); }
// public yarnwrap.client.gl.ShaderProgram getPositionTexColorProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getPositionTexColorProgram()); }
public static yarnwrap.client.gl.ShaderProgram getPositionTexColorProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getPositionTexColorProgram()); }
// public yarnwrap.client.gl.ShaderProgram getParticleProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getParticleProgram()); }
public static yarnwrap.client.gl.ShaderProgram getParticleProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getParticleProgram()); }
// public yarnwrap.client.gl.ShaderProgram getPositionColorLightmapProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getPositionColorLightmapProgram()); }
public static yarnwrap.client.gl.ShaderProgram getPositionColorLightmapProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getPositionColorLightmapProgram()); }
// public yarnwrap.client.gl.ShaderProgram getPositionColorTexLightmapProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getPositionColorTexLightmapProgram()); }
public static yarnwrap.client.gl.ShaderProgram getPositionColorTexLightmapProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getPositionColorTexLightmapProgram()); }
public boolean isRenderingPanorama() { return wrapperContained.isRenderingPanorama(); }
// public static boolean isRenderingPanorama() { return net.minecraft.client.render.GameRenderer.isRenderingPanorama(); }
public void renderWithZoom(float zoom,float zoomX,float zoomY) { wrapperContained.renderWithZoom(zoom,zoomX,zoomY); }
// public static void renderWithZoom(float zoom,float zoomX,float zoomY, ) { net.minecraft.client.render.GameRenderer.renderWithZoom(zoom,zoomX,zoomY); }
public yarnwrap.client.gl.ShaderProgram getProgram(java.lang.String name) { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getProgram(name)); }
// public static yarnwrap.client.gl.ShaderProgram getProgram(java.lang.String name, ) { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getProgram(name)); }
public void setRenderHand(boolean renderHand) { wrapperContained.setRenderHand(renderHand); }
// public static void setRenderHand(boolean renderHand, ) { net.minecraft.client.render.GameRenderer.setRenderHand(renderHand); }
public void setBlockOutlineEnabled(boolean blockOutlineEnabled) { wrapperContained.setBlockOutlineEnabled(blockOutlineEnabled); }
// public static void setBlockOutlineEnabled(boolean blockOutlineEnabled, ) { net.minecraft.client.render.GameRenderer.setBlockOutlineEnabled(blockOutlineEnabled); }
public void setRenderingPanorama(boolean renderingPanorama) { wrapperContained.setRenderingPanorama(renderingPanorama); }
// public static void setRenderingPanorama(boolean renderingPanorama, ) { net.minecraft.client.render.GameRenderer.setRenderingPanorama(renderingPanorama); }
public yarnwrap.client.MinecraftClient getClient() { return new yarnwrap.client.MinecraftClient(wrapperContained.getClient()); }
// public static yarnwrap.client.MinecraftClient getClient() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.render.GameRenderer.getClient()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeTextIntensityProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeTextIntensityProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeTextIntensityProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeTextIntensityProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeTextIntensitySeeThroughProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeTextIntensitySeeThroughProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeTextIntensitySeeThroughProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeTextIntensitySeeThroughProgram()); }
// public void method_36486(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36486(program.wrapperContained); }
// public static void method_36486(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36486(program.wrapperContained); }
// public void method_36487(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36487(program.wrapperContained); }
// public static void method_36487(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36487(program.wrapperContained); }
// public void method_36488(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36488(program.wrapperContained); }
// public static void method_36488(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36488(program.wrapperContained); }
// public void method_36489(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36489(program.wrapperContained); }
// public static void method_36489(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36489(program.wrapperContained); }
// public void method_36492(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36492(program.wrapperContained); }
// public static void method_36492(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36492(program.wrapperContained); }
// public void method_36493(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36493(program.wrapperContained); }
// public static void method_36493(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36493(program.wrapperContained); }
// public void method_36494(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36494(program.wrapperContained); }
// public static void method_36494(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36494(program.wrapperContained); }
// public void method_36495(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36495(program.wrapperContained); }
// public static void method_36495(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36495(program.wrapperContained); }
// public void method_36496(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36496(program.wrapperContained); }
// public static void method_36496(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36496(program.wrapperContained); }
// public void method_36497(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36497(program.wrapperContained); }
// public static void method_36497(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36497(program.wrapperContained); }
// public void method_36498(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36498(program.wrapperContained); }
// public static void method_36498(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36498(program.wrapperContained); }
// public void method_36499(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36499(program.wrapperContained); }
// public static void method_36499(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36499(program.wrapperContained); }
// public void method_36502(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36502(program.wrapperContained); }
// public static void method_36502(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36502(program.wrapperContained); }
// public void method_36504(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36504(program.wrapperContained); }
// public static void method_36504(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36504(program.wrapperContained); }
// public void method_36505(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36505(program.wrapperContained); }
// public static void method_36505(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36505(program.wrapperContained); }
// public void method_36506(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36506(program.wrapperContained); }
// public static void method_36506(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36506(program.wrapperContained); }
// public void method_36507(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36507(program.wrapperContained); }
// public static void method_36507(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36507(program.wrapperContained); }
// public void method_36508(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36508(program.wrapperContained); }
// public static void method_36508(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36508(program.wrapperContained); }
// public void method_36509(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36509(program.wrapperContained); }
// public static void method_36509(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36509(program.wrapperContained); }
// public void method_36510(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36510(program.wrapperContained); }
// public static void method_36510(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36510(program.wrapperContained); }
// public void method_36511(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36511(program.wrapperContained); }
// public static void method_36511(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36511(program.wrapperContained); }
// public void method_36512(com.mojang.datafixers.util.Pair pair) { wrapperContained.method_36512(pair); }
// public static void method_36512(com.mojang.datafixers.util.Pair pair, ) { net.minecraft.client.render.GameRenderer.method_36512(pair); }
// public void method_36513(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36513(program.wrapperContained); }
// public static void method_36513(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36513(program.wrapperContained); }
// public void method_36516(com.mojang.datafixers.util.Pair pair) { wrapperContained.method_36516(pair); }
// public static void method_36516(com.mojang.datafixers.util.Pair pair, ) { net.minecraft.client.render.GameRenderer.method_36516(pair); }
// public void method_36517(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36517(program.wrapperContained); }
// public static void method_36517(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36517(program.wrapperContained); }
// public void method_36518(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36518(program.wrapperContained); }
// public static void method_36518(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36518(program.wrapperContained); }
// public void method_36519(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36519(program.wrapperContained); }
// public static void method_36519(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36519(program.wrapperContained); }
// public void method_36520(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36520(program.wrapperContained); }
// public static void method_36520(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36520(program.wrapperContained); }
// public void method_36521(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36521(program.wrapperContained); }
// public static void method_36521(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36521(program.wrapperContained); }
// public void method_36522(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36522(program.wrapperContained); }
// public static void method_36522(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36522(program.wrapperContained); }
// public void method_36523(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36523(program.wrapperContained); }
// public static void method_36523(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36523(program.wrapperContained); }
// public void method_36524(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36524(program.wrapperContained); }
// public static void method_36524(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36524(program.wrapperContained); }
// public void method_36525(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36525(program.wrapperContained); }
// public static void method_36525(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36525(program.wrapperContained); }
// public void method_36526(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36526(program.wrapperContained); }
// public static void method_36526(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36526(program.wrapperContained); }
// public void method_36527(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36527(program.wrapperContained); }
// public static void method_36527(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36527(program.wrapperContained); }
// public void method_36529(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36529(program.wrapperContained); }
// public static void method_36529(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36529(program.wrapperContained); }
// public void method_36530(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36530(program.wrapperContained); }
// public static void method_36530(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36530(program.wrapperContained); }
// public void method_36531(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36531(program.wrapperContained); }
// public static void method_36531(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36531(program.wrapperContained); }
// public void method_36533(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36533(program.wrapperContained); }
// public static void method_36533(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36533(program.wrapperContained); }
// public void method_36534(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36534(program.wrapperContained); }
// public static void method_36534(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36534(program.wrapperContained); }
// public void method_36535(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36535(program.wrapperContained); }
// public static void method_36535(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36535(program.wrapperContained); }
// public void method_36536(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36536(program.wrapperContained); }
// public static void method_36536(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36536(program.wrapperContained); }
// public void method_36537(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36537(program.wrapperContained); }
// public static void method_36537(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36537(program.wrapperContained); }
// public void method_36538(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36538(program.wrapperContained); }
// public static void method_36538(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36538(program.wrapperContained); }
// public void method_36539(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36539(program.wrapperContained); }
// public static void method_36539(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36539(program.wrapperContained); }
// public void method_36540(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36540(program.wrapperContained); }
// public static void method_36540(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36540(program.wrapperContained); }
// public void method_36541(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_36541(program.wrapperContained); }
// public static void method_36541(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_36541(program.wrapperContained); }
// public void updateWorldIcon() { wrapperContained.updateWorldIcon(); }
// public static void updateWorldIcon() { net.minecraft.client.render.GameRenderer.updateWorldIcon(); }
// public void method_37474(java.nio.file.Path path) { wrapperContained.method_37474(path); }
// public static void method_37474(java.nio.file.Path path, ) { net.minecraft.client.render.GameRenderer.method_37474(path); }
// public void method_42594(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_42594(program.wrapperContained); }
// public static void method_42594(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_42594(program.wrapperContained); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeEntityTranslucentEmissiveProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeEntityTranslucentEmissiveProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeEntityTranslucentEmissiveProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeEntityTranslucentEmissiveProgram()); }
public yarnwrap.resource.ResourceReloader createProgramReloader() { return new yarnwrap.resource.ResourceReloader(wrapperContained.createProgramReloader()); }
// public static yarnwrap.resource.ResourceReloader createProgramReloader() { return new yarnwrap.resource.ResourceReloader(net.minecraft.client.render.GameRenderer.createProgramReloader()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeTextBackgroundProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeTextBackgroundProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeTextBackgroundProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeTextBackgroundProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeTextBackgroundSeeThroughProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeTextBackgroundSeeThroughProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeTextBackgroundSeeThroughProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeTextBackgroundSeeThroughProgram()); }
// public void method_49039(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_49039(program.wrapperContained); }
// public static void method_49039(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_49039(program.wrapperContained); }
// public void method_49040(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_49040(program.wrapperContained); }
// public static void method_49040(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_49040(program.wrapperContained); }
// public void method_51770(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_51770(program.wrapperContained); }
// public static void method_51770(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_51770(program.wrapperContained); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeGuiProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeGuiProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeGuiProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeGuiProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeGuiOverlayProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeGuiOverlayProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeGuiOverlayProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeGuiOverlayProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeGuiTextHighlightProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeGuiTextHighlightProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeGuiTextHighlightProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeGuiTextHighlightProgram()); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeGuiGhostRecipeOverlayProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeGuiGhostRecipeOverlayProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeGuiGhostRecipeOverlayProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeGuiGhostRecipeOverlayProgram()); }
// public void method_51775(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_51775(program.wrapperContained); }
// public static void method_51775(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_51775(program.wrapperContained); }
// public void method_51776(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_51776(program.wrapperContained); }
// public static void method_51776(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_51776(program.wrapperContained); }
// public void method_51777(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_51777(program.wrapperContained); }
// public static void method_51777(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_51777(program.wrapperContained); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeBreezeWindProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeBreezeWindProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeBreezeWindProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeBreezeWindProgram()); }
// public void method_55250(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_55250(program.wrapperContained); }
// public static void method_55250(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_55250(program.wrapperContained); }
// public yarnwrap.util.hit.HitResult findCrosshairTarget(yarnwrap.entity.Entity camera,double blockInteractionRange,double entityInteractionRange,float tickDelta) { return new yarnwrap.util.hit.HitResult(wrapperContained.findCrosshairTarget(camera.wrapperContained,blockInteractionRange,entityInteractionRange,tickDelta)); }
// public static yarnwrap.util.hit.HitResult findCrosshairTarget(yarnwrap.entity.Entity camera,double blockInteractionRange,double entityInteractionRange,float tickDelta, ) { return new yarnwrap.util.hit.HitResult(net.minecraft.client.render.GameRenderer.findCrosshairTarget(camera.wrapperContained,blockInteractionRange,entityInteractionRange,tickDelta)); }
// public yarnwrap.util.hit.HitResult ensureTargetInRange(yarnwrap.util.hit.HitResult hitResult,yarnwrap.util.math.Vec3d cameraPos,double interactionRange) { return new yarnwrap.util.hit.HitResult(wrapperContained.ensureTargetInRange(hitResult.wrapperContained,cameraPos.wrapperContained,interactionRange)); }
// public static yarnwrap.util.hit.HitResult ensureTargetInRange(yarnwrap.util.hit.HitResult hitResult,yarnwrap.util.math.Vec3d cameraPos,double interactionRange, ) { return new yarnwrap.util.hit.HitResult(net.minecraft.client.render.GameRenderer.ensureTargetInRange(hitResult.wrapperContained,cameraPos.wrapperContained,interactionRange)); }
// public void method_56845(yarnwrap.client.gl.ShaderProgram program) { wrapperContained.method_56845(program.wrapperContained); }
// public static void method_56845(yarnwrap.client.gl.ShaderProgram program, ) { net.minecraft.client.render.GameRenderer.method_56845(program.wrapperContained); }
// public yarnwrap.client.gl.ShaderProgram getRenderTypeCloudsProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.getRenderTypeCloudsProgram()); }
public static yarnwrap.client.gl.ShaderProgram getRenderTypeCloudsProgram() { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.render.GameRenderer.getRenderTypeCloudsProgram()); }
public void renderBlur(float delta) { wrapperContained.renderBlur(delta); }
// public static void renderBlur(float delta, ) { net.minecraft.client.render.GameRenderer.renderBlur(delta); }
// public void loadBlurPostProcessor(yarnwrap.resource.ResourceFactory resourceFactory) { wrapperContained.loadBlurPostProcessor(resourceFactory.wrapperContained); }
// public static void loadBlurPostProcessor(yarnwrap.resource.ResourceFactory resourceFactory, ) { net.minecraft.client.render.GameRenderer.loadBlurPostProcessor(resourceFactory.wrapperContained); }

}