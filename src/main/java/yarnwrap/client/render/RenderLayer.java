package yarnwrap.client.render;
public class RenderLayer { public net.minecraft.client.render.RenderLayer wrapperContained; public RenderLayer(net.minecraft.client.render.RenderLayer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int expectedBufferSize() { return wrapperContained.expectedBufferSize; }
// public void expectedBufferSize(int value) { wrapperContained.expectedBufferSize = value; }
// public yarnwrap.client.render.VertexFormat vertexFormat() { return new yarnwrap.client.render.VertexFormat(wrapperContained.vertexFormat); }
// public void vertexFormat(yarnwrap.client.render.VertexFormat value) { wrapperContained.vertexFormat = value.wrapperContained; }
// public Object drawMode() { return wrapperContained.drawMode; }
// // public void drawMode(Object value) { wrapperContained.drawMode = value; }
// public boolean hasCrumbling() { return wrapperContained.hasCrumbling; }
// public void hasCrumbling(boolean value) { wrapperContained.hasCrumbling = value; }
// public boolean translucent() { return wrapperContained.translucent; }
// public void translucent(boolean value) { wrapperContained.translucent = value; }
// public yarnwrap.client.render.RenderLayer DIRECT_ENTITY_GLINT() { return new yarnwrap.client.render.RenderLayer(wrapperContained.DIRECT_ENTITY_GLINT); }
// public void DIRECT_ENTITY_GLINT(yarnwrap.client.render.RenderLayer value) { wrapperContained.DIRECT_ENTITY_GLINT = value.wrapperContained; }
// public java.util.function.Function ARMOR_CUTOUT_NO_CULL() { return wrapperContained.ARMOR_CUTOUT_NO_CULL; }
// public void ARMOR_CUTOUT_NO_CULL(java.util.function.Function value) { wrapperContained.ARMOR_CUTOUT_NO_CULL = value; }
// public java.util.function.Function ENTITY_SOLID() { return wrapperContained.ENTITY_SOLID; }
// public void ENTITY_SOLID(java.util.function.Function value) { wrapperContained.ENTITY_SOLID = value; }
// public java.util.function.Function ENTITY_CUTOUT() { return wrapperContained.ENTITY_CUTOUT; }
// public void ENTITY_CUTOUT(java.util.function.Function value) { wrapperContained.ENTITY_CUTOUT = value; }
// public java.util.function.BiFunction ENTITY_CUTOUT_NO_CULL() { return wrapperContained.ENTITY_CUTOUT_NO_CULL; }
// public void ENTITY_CUTOUT_NO_CULL(java.util.function.BiFunction value) { wrapperContained.ENTITY_CUTOUT_NO_CULL = value; }
// public java.util.function.BiFunction ENTITY_CUTOUT_NO_CULL_Z_OFFSET() { return wrapperContained.ENTITY_CUTOUT_NO_CULL_Z_OFFSET; }
// public void ENTITY_CUTOUT_NO_CULL_Z_OFFSET(java.util.function.BiFunction value) { wrapperContained.ENTITY_CUTOUT_NO_CULL_Z_OFFSET = value; }
// public java.util.function.Function ITEM_ENTITY_TRANSLUCENT_CULL() { return wrapperContained.ITEM_ENTITY_TRANSLUCENT_CULL; }
// public void ITEM_ENTITY_TRANSLUCENT_CULL(java.util.function.Function value) { wrapperContained.ITEM_ENTITY_TRANSLUCENT_CULL = value; }
// public java.util.function.Function ENTITY_TRANSLUCENT_CULL() { return wrapperContained.ENTITY_TRANSLUCENT_CULL; }
// public void ENTITY_TRANSLUCENT_CULL(java.util.function.Function value) { wrapperContained.ENTITY_TRANSLUCENT_CULL = value; }
// public java.util.function.BiFunction ENTITY_TRANSLUCENT() { return wrapperContained.ENTITY_TRANSLUCENT; }
// public void ENTITY_TRANSLUCENT(java.util.function.BiFunction value) { wrapperContained.ENTITY_TRANSLUCENT = value; }
// public java.util.function.Function ENTITY_SMOOTH_CUTOUT() { return wrapperContained.ENTITY_SMOOTH_CUTOUT; }
// public void ENTITY_SMOOTH_CUTOUT(java.util.function.Function value) { wrapperContained.ENTITY_SMOOTH_CUTOUT = value; }
// public java.util.function.BiFunction BEACON_BEAM() { return wrapperContained.BEACON_BEAM; }
// public void BEACON_BEAM(java.util.function.BiFunction value) { wrapperContained.BEACON_BEAM = value; }
// public java.util.function.Function ENTITY_DECAL() { return wrapperContained.ENTITY_DECAL; }
// public void ENTITY_DECAL(java.util.function.Function value) { wrapperContained.ENTITY_DECAL = value; }
// public java.util.function.Function ENTITY_NO_OUTLINE() { return wrapperContained.ENTITY_NO_OUTLINE; }
// public void ENTITY_NO_OUTLINE(java.util.function.Function value) { wrapperContained.ENTITY_NO_OUTLINE = value; }
// public java.util.function.Function ENTITY_SHADOW() { return wrapperContained.ENTITY_SHADOW; }
// public void ENTITY_SHADOW(java.util.function.Function value) { wrapperContained.ENTITY_SHADOW = value; }
// public java.util.function.Function ENTITY_ALPHA() { return wrapperContained.ENTITY_ALPHA; }
// public void ENTITY_ALPHA(java.util.function.Function value) { wrapperContained.ENTITY_ALPHA = value; }
// public java.util.function.BiFunction EYES() { return wrapperContained.EYES; }
// public void EYES(java.util.function.BiFunction value) { wrapperContained.EYES = value; }
// public java.util.function.Function CRUMBLING() { return wrapperContained.CRUMBLING; }
// public void CRUMBLING(java.util.function.Function value) { wrapperContained.CRUMBLING = value; }
// public java.util.function.Function TEXT() { return wrapperContained.TEXT; }
// public void TEXT(java.util.function.Function value) { wrapperContained.TEXT = value; }
// public java.util.function.Function TEXT_SEE_THROUGH() { return wrapperContained.TEXT_SEE_THROUGH; }
// public void TEXT_SEE_THROUGH(java.util.function.Function value) { wrapperContained.TEXT_SEE_THROUGH = value; }
public int SOLID_BUFFER_SIZE() { return wrapperContained.SOLID_BUFFER_SIZE; }
// public void SOLID_BUFFER_SIZE(int value) { wrapperContained.SOLID_BUFFER_SIZE = value; }
public int CUTOUT_BUFFER_SIZE() { return wrapperContained.CUTOUT_BUFFER_SIZE; }
// public void CUTOUT_BUFFER_SIZE(int value) { wrapperContained.CUTOUT_BUFFER_SIZE = value; }
public int DEFAULT_BUFFER_SIZE() { return wrapperContained.DEFAULT_BUFFER_SIZE; }
// public void DEFAULT_BUFFER_SIZE(int value) { wrapperContained.DEFAULT_BUFFER_SIZE = value; }
// public java.util.function.Function TEXT_INTENSITY() { return wrapperContained.TEXT_INTENSITY; }
// public void TEXT_INTENSITY(java.util.function.Function value) { wrapperContained.TEXT_INTENSITY = value; }
// public java.util.function.Function TEXT_INTENSITY_SEE_THROUGH() { return wrapperContained.TEXT_INTENSITY_SEE_THROUGH; }
// public void TEXT_INTENSITY_SEE_THROUGH(java.util.function.Function value) { wrapperContained.TEXT_INTENSITY_SEE_THROUGH = value; }
// public java.util.function.Function TEXT_POLYGON_OFFSET() { return wrapperContained.TEXT_POLYGON_OFFSET; }
// public void TEXT_POLYGON_OFFSET(java.util.function.Function value) { wrapperContained.TEXT_POLYGON_OFFSET = value; }
// public java.util.function.Function TEXT_INTENSITY_POLYGON_OFFSET() { return wrapperContained.TEXT_INTENSITY_POLYGON_OFFSET; }
// public void TEXT_INTENSITY_POLYGON_OFFSET(java.util.function.Function value) { wrapperContained.TEXT_INTENSITY_POLYGON_OFFSET = value; }
// public java.util.function.BiFunction ENTITY_TRANSLUCENT_EMISSIVE() { return wrapperContained.ENTITY_TRANSLUCENT_EMISSIVE; }
// public void ENTITY_TRANSLUCENT_EMISSIVE(java.util.function.BiFunction value) { wrapperContained.ENTITY_TRANSLUCENT_EMISSIVE = value; }
// public com.google.common.collect.ImmutableList BLOCK_LAYERS() { return wrapperContained.BLOCK_LAYERS; }
// public void BLOCK_LAYERS(com.google.common.collect.ImmutableList value) { wrapperContained.BLOCK_LAYERS = value; }
// public java.util.function.Function DEBUG_LINE_STRIP() { return wrapperContained.DEBUG_LINE_STRIP; }
// public void DEBUG_LINE_STRIP(java.util.function.Function value) { wrapperContained.DEBUG_LINE_STRIP = value; }
// public yarnwrap.client.render.RenderLayer FAST_CLOUDS() { return new yarnwrap.client.render.RenderLayer(wrapperContained.FAST_CLOUDS); }
// public void FAST_CLOUDS(yarnwrap.client.render.RenderLayer value) { wrapperContained.FAST_CLOUDS = value.wrapperContained; }
// public yarnwrap.client.render.RenderLayer FANCY_CLOUDS() { return new yarnwrap.client.render.RenderLayer(wrapperContained.FANCY_CLOUDS); }
// public void FANCY_CLOUDS(yarnwrap.client.render.RenderLayer value) { wrapperContained.FANCY_CLOUDS = value.wrapperContained; }
public java.util.List getBlockLayers() { return wrapperContained.getBlockLayers(); }
public int getExpectedBufferSize() { return wrapperContained.getExpectedBufferSize(); }
public yarnwrap.client.render.RenderLayer getEnergySwirl(yarnwrap.util.Identifier texture,float x,float y) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getEnergySwirl(texture.wrapperContained,x,y)); }
public yarnwrap.client.render.RenderLayer getEyes(yarnwrap.util.Identifier texture) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getEyes(texture.wrapperContained)); }
public yarnwrap.client.render.RenderLayer getText(yarnwrap.util.Identifier texture) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getText(texture.wrapperContained)); }
public yarnwrap.client.render.RenderLayer getTextSeeThrough(yarnwrap.util.Identifier texture) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getTextSeeThrough(texture.wrapperContained)); }
public yarnwrap.client.render.VertexFormat getVertexFormat() { return new yarnwrap.client.render.VertexFormat(wrapperContained.getVertexFormat()); }
public Object getDrawMode() { return wrapperContained.getDrawMode(); }
// public boolean hasCrumbling() { return wrapperContained.hasCrumbling(); }
public yarnwrap.client.render.RenderLayer getOutline(yarnwrap.util.Identifier texture) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getOutline(texture.wrapperContained)); }
public java.util.Optional getAffectedOutline() { return wrapperContained.getAffectedOutline(); }
public yarnwrap.client.render.RenderLayer getBlockBreaking(yarnwrap.util.Identifier texture) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getBlockBreaking(texture.wrapperContained)); }
public yarnwrap.client.render.RenderLayer getEntitySolid(yarnwrap.util.Identifier texture) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getEntitySolid(texture.wrapperContained)); }
public yarnwrap.client.render.RenderLayer getEntityAlpha(yarnwrap.util.Identifier texture) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getEntityAlpha(texture.wrapperContained)); }
public yarnwrap.client.render.RenderLayer getEndPortal() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getEndPortal()); }
public yarnwrap.client.render.RenderLayer getEntityCutout(yarnwrap.util.Identifier texture) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getEntityCutout(texture.wrapperContained)); }
public yarnwrap.client.render.RenderLayer getSolid() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getSolid()); }
public yarnwrap.client.render.RenderLayer getEntityCutoutNoCull(yarnwrap.util.Identifier texture) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getEntityCutoutNoCull(texture.wrapperContained)); }
public yarnwrap.client.render.RenderLayer getCutoutMipped() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getCutoutMipped()); }
public yarnwrap.client.render.RenderLayer getEntityTranslucent(yarnwrap.util.Identifier texture) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getEntityTranslucent(texture.wrapperContained)); }
public yarnwrap.client.render.RenderLayer getCutout() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getCutout()); }
public yarnwrap.client.render.RenderLayer getTranslucent() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getTranslucent()); }
public yarnwrap.client.render.RenderLayer getEntitySmoothCutout(yarnwrap.util.Identifier texture) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getEntitySmoothCutout(texture.wrapperContained)); }
public yarnwrap.client.render.RenderLayer getEntityDecal(yarnwrap.util.Identifier texture) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getEntityDecal(texture.wrapperContained)); }
public yarnwrap.client.render.RenderLayer getLeash() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getLeash()); }
public yarnwrap.client.render.RenderLayer getEntityNoOutline(yarnwrap.util.Identifier texture) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getEntityNoOutline(texture.wrapperContained)); }
public yarnwrap.client.render.RenderLayer getWaterMask() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getWaterMask()); }
public yarnwrap.client.render.RenderLayer getGlint() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getGlint()); }
public yarnwrap.client.render.RenderLayer getEntityGlint() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getEntityGlint()); }
public yarnwrap.client.render.RenderLayer getBeaconBeam(yarnwrap.util.Identifier texture,boolean translucent) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getBeaconBeam(texture.wrapperContained,translucent)); }
public yarnwrap.client.render.RenderLayer getLightning() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getLightning()); }
public yarnwrap.client.render.RenderLayer getLines() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getLines()); }
public yarnwrap.client.render.RenderLayer getEntityTranslucentCull(yarnwrap.util.Identifier texture) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getEntityTranslucentCull(texture.wrapperContained)); }
// public Object of(java.lang.String name,yarnwrap.client.render.VertexFormat vertexFormat,Object drawMode,int expectedBufferSize,Object phaseData) { return wrapperContained.of(name,vertexFormat.wrapperContained,drawMode,expectedBufferSize,phaseData); }
// public Object of(java.lang.String name,yarnwrap.client.render.VertexFormat vertexFormat,Object drawMode,int expectedBufferSize,boolean hasCrumbling,boolean translucent,Object phases) { return wrapperContained.of(name,vertexFormat.wrapperContained,drawMode,expectedBufferSize,hasCrumbling,translucent,phases); }
public yarnwrap.client.render.RenderLayer getEntityCutoutNoCull(yarnwrap.util.Identifier texture,boolean affectsOutline) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getEntityCutoutNoCull(texture.wrapperContained,affectsOutline)); }
public yarnwrap.client.render.RenderLayer getEntityTranslucent(yarnwrap.util.Identifier texture,boolean affectsOutline) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getEntityTranslucent(texture.wrapperContained,affectsOutline)); }
public boolean isOutline() { return wrapperContained.isOutline(); }
public yarnwrap.client.render.RenderLayer getEntityShadow(yarnwrap.util.Identifier texture) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getEntityShadow(texture.wrapperContained)); }
public yarnwrap.client.render.RenderLayer getArmorCutoutNoCull(yarnwrap.util.Identifier texture) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getArmorCutoutNoCull(texture.wrapperContained)); }
public yarnwrap.client.render.RenderLayer getArmorEntityGlint() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getArmorEntityGlint()); }
public yarnwrap.client.render.RenderLayer getEntityCutoutNoCullZOffset(yarnwrap.util.Identifier texture,boolean affectsOutline) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getEntityCutoutNoCullZOffset(texture.wrapperContained,affectsOutline)); }
public yarnwrap.client.render.RenderLayer getEntityCutoutNoCullZOffset(yarnwrap.util.Identifier texture) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getEntityCutoutNoCullZOffset(texture.wrapperContained)); }
public yarnwrap.client.render.RenderLayer getItemEntityTranslucentCull(yarnwrap.util.Identifier texture) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getItemEntityTranslucentCull(texture.wrapperContained)); }
public yarnwrap.client.render.RenderLayer getTranslucentMovingBlock() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getTranslucentMovingBlock()); }
// public Object getItemPhaseData() { return wrapperContained.getItemPhaseData(); }
public yarnwrap.client.render.RenderLayer getDirectEntityGlint() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getDirectEntityGlint()); }
// public Object getTripwirePhaseData() { return wrapperContained.getTripwirePhaseData(); }
public yarnwrap.client.render.RenderLayer getTripwire() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getTripwire()); }
public yarnwrap.client.render.RenderLayer getGlintTranslucent() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getGlintTranslucent()); }
// public Object of(Object program) { return wrapperContained.of(program); }
public yarnwrap.client.render.RenderLayer getEndGateway() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getEndGateway()); }
public yarnwrap.client.render.RenderLayer getLineStrip() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getLineStrip()); }
public yarnwrap.client.render.RenderLayer getTextIntensity(yarnwrap.util.Identifier texture) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getTextIntensity(texture.wrapperContained)); }
public yarnwrap.client.render.RenderLayer getTextIntensitySeeThrough(yarnwrap.util.Identifier texture) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getTextIntensitySeeThrough(texture.wrapperContained)); }
public yarnwrap.client.render.RenderLayer getTextPolygonOffset(yarnwrap.util.Identifier texture) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getTextPolygonOffset(texture.wrapperContained)); }
public yarnwrap.client.render.RenderLayer getTextIntensityPolygonOffset(yarnwrap.util.Identifier texture) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getTextIntensityPolygonOffset(texture.wrapperContained)); }
public yarnwrap.client.render.RenderLayer getEntityTranslucentEmissive(yarnwrap.util.Identifier texture,boolean affectsOutline) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getEntityTranslucentEmissive(texture.wrapperContained,affectsOutline)); }
public yarnwrap.client.render.RenderLayer getEntityTranslucentEmissive(yarnwrap.util.Identifier texture) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getEntityTranslucentEmissive(texture.wrapperContained)); }
public boolean areVerticesNotShared() { return wrapperContained.areVerticesNotShared(); }
public yarnwrap.client.render.RenderLayer getDebugQuads() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getDebugQuads()); }
public yarnwrap.client.render.RenderLayer getDebugLineStrip(double lineWidth) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getDebugLineStrip(lineWidth)); }
public yarnwrap.client.render.RenderLayer getTextBackground() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getTextBackground()); }
public yarnwrap.client.render.RenderLayer getTextBackgroundSeeThrough() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getTextBackgroundSeeThrough()); }
public yarnwrap.client.render.RenderLayer getDebugFilledBox() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getDebugFilledBox()); }
public yarnwrap.client.render.RenderLayer getDebugSectionQuads() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getDebugSectionQuads()); }
public yarnwrap.client.render.RenderLayer getGui() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getGui()); }
public yarnwrap.client.render.RenderLayer getGuiOverlay() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getGuiOverlay()); }
public yarnwrap.client.render.RenderLayer getGuiTextHighlight() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getGuiTextHighlight()); }
public yarnwrap.client.render.RenderLayer getGuiGhostRecipeOverlay() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getGuiGhostRecipeOverlay()); }
// public Object createArmorCutoutNoCull(java.lang.String name,yarnwrap.util.Identifier texture,boolean decal) { return wrapperContained.createArmorCutoutNoCull(name,texture.wrapperContained,decal); }
public yarnwrap.client.render.RenderLayer createArmorDecalCutoutNoCull(yarnwrap.util.Identifier texture) { return new yarnwrap.client.render.RenderLayer(wrapperContained.createArmorDecalCutoutNoCull(texture.wrapperContained)); }
public yarnwrap.client.render.RenderLayer getBreezeWind(yarnwrap.util.Identifier texture,float x,float y) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getBreezeWind(texture.wrapperContained,x,y)); }
public yarnwrap.client.render.RenderLayer getEntityTranslucentEmissiveNoOutline(yarnwrap.util.Identifier texture) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getEntityTranslucentEmissiveNoOutline(texture.wrapperContained)); }
// public Object getClouds(boolean fancy) { return wrapperContained.getClouds(fancy); }
public yarnwrap.client.render.RenderLayer getFastClouds() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getFastClouds()); }
public yarnwrap.client.render.RenderLayer getFancyClouds() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getFancyClouds()); }
public boolean isTranslucent() { return wrapperContained.isTranslucent(); }
public void draw(yarnwrap.client.render.BuiltBuffer buffer) { wrapperContained.draw(buffer.wrapperContained); }
public yarnwrap.client.render.RenderLayer getDebugStructureQuads() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getDebugStructureQuads()); }
public yarnwrap.client.render.RenderLayer getDragonRays() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getDragonRays()); }
public yarnwrap.client.render.RenderLayer getDragonRaysDepth() { return new yarnwrap.client.render.RenderLayer(wrapperContained.getDragonRaysDepth()); }

}