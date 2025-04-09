package yarnwrap.entity.decoration;
public class DisplayEntity { public net.minecraft.entity.decoration.DisplayEntity wrapperContained; public DisplayEntity(net.minecraft.entity.decoration.DisplayEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData RIGHT_ROTATION() { return new yarnwrap.entity.data.TrackedData(wrapperContained.RIGHT_ROTATION); }
// public yarnwrap.entity.data.TrackedData BILLBOARD() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BILLBOARD); }
// public yarnwrap.entity.data.TrackedData BRIGHTNESS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BRIGHTNESS); }
// public yarnwrap.entity.data.TrackedData VIEW_RANGE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VIEW_RANGE); }
// public yarnwrap.entity.data.TrackedData SHADOW_RADIUS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SHADOW_RADIUS); }
// public yarnwrap.entity.data.TrackedData SHADOW_STRENGTH() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SHADOW_STRENGTH); }
// public yarnwrap.entity.data.TrackedData WIDTH() { return new yarnwrap.entity.data.TrackedData(wrapperContained.WIDTH); }
// public yarnwrap.entity.data.TrackedData HEIGHT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.HEIGHT); }
// public yarnwrap.entity.data.TrackedData GLOW_COLOR_OVERRIDE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.GLOW_COLOR_OVERRIDE); }
// public yarnwrap.util.math.Box visibilityBoundingBox() { return new yarnwrap.util.math.Box(wrapperContained.visibilityBoundingBox); }
public java.lang.String TRANSFORMATION_NBT_KEY() { return wrapperContained.TRANSFORMATION_NBT_KEY; }
public java.lang.String BILLBOARD_NBT_KEY() { return wrapperContained.BILLBOARD_NBT_KEY; }
public java.lang.String BRIGHTNESS_NBT_KEY() { return wrapperContained.BRIGHTNESS_NBT_KEY; }
public java.lang.String VIEW_RANGE_NBT_KEY() { return wrapperContained.VIEW_RANGE_NBT_KEY; }
public java.lang.String SHADOW_RADIUS_NBT_KEY() { return wrapperContained.SHADOW_RADIUS_NBT_KEY; }
public java.lang.String SHADOW_STRENGTH_NBT_KEY() { return wrapperContained.SHADOW_STRENGTH_NBT_KEY; }
public java.lang.String WIDTH_NBT_KEY() { return wrapperContained.WIDTH_NBT_KEY; }
public java.lang.String HEIGHT_NBT_KEY() { return wrapperContained.HEIGHT_NBT_KEY; }
public java.lang.String GLOW_COLOR_OVERRIDE_NBT_KEY() { return wrapperContained.GLOW_COLOR_OVERRIDE_NBT_KEY; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.entity.data.TrackedData TRANSLATION() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TRANSLATION); }
// public yarnwrap.entity.data.TrackedData SCALE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SCALE); }
// public yarnwrap.entity.data.TrackedData LEFT_ROTATION() { return new yarnwrap.entity.data.TrackedData(wrapperContained.LEFT_ROTATION); }
// public long interpolationStart() { return wrapperContained.interpolationStart; }
// public float lerpProgress() { return wrapperContained.lerpProgress; }
// public it.unimi.dsi.fastutil.ints.IntSet RENDERING_DATA_IDS() { return wrapperContained.RENDERING_DATA_IDS; }
// public int interpolationDuration() { return wrapperContained.interpolationDuration; }
// public boolean startInterpolationSet() { return wrapperContained.startInterpolationSet; }
// public boolean interpolationDurationSet() { return wrapperContained.interpolationDurationSet; }
// public Object renderState() { return wrapperContained.renderState; }
// public boolean renderingDataSet() { return wrapperContained.renderingDataSet; }
// public Object interpolationTarget() { return wrapperContained.interpolationTarget; }
public java.lang.String TELEPORT_DURATION_KEY() { return wrapperContained.TELEPORT_DURATION_KEY; }
public java.lang.String INTERPOLATION_DURATION_KEY() { return wrapperContained.INTERPOLATION_DURATION_KEY; }
public java.lang.String START_INTERPOLATION_KEY() { return wrapperContained.START_INTERPOLATION_KEY; }
// public yarnwrap.entity.data.TrackedData START_INTERPOLATION() { return new yarnwrap.entity.data.TrackedData(wrapperContained.START_INTERPOLATION); }
// public yarnwrap.entity.data.TrackedData INTERPOLATION_DURATION() { return new yarnwrap.entity.data.TrackedData(wrapperContained.INTERPOLATION_DURATION); }
// public yarnwrap.entity.data.TrackedData TELEPORT_DURATION() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TELEPORT_DURATION); }
public float getLerpProgress(float delta) { return wrapperContained.getLerpProgress(delta); }
// public yarnwrap.util.math.AffineTransformation getTransformation(yarnwrap.entity.data.DataTracker dataTracker) { return new yarnwrap.util.math.AffineTransformation(wrapperContained.getTransformation(dataTracker.wrapperContained)); }
// public void setBrightness(yarnwrap.entity.decoration.Brightness brightness) { wrapperContained.setBrightness(brightness.wrapperContained); }
// public void setBillboardMode(Object billboardMode) { wrapperContained.setBillboardMode(billboardMode); }
// public void setTransformation(yarnwrap.util.math.AffineTransformation transformation) { wrapperContained.setTransformation(transformation.wrapperContained); }
// public void setGlowColorOverride(int glowColorOverride) { wrapperContained.setGlowColorOverride(glowColorOverride); }
// public void setViewRange(float viewRange) { wrapperContained.setViewRange(viewRange); }
// public void setShadowRadius(float shadowRadius) { wrapperContained.setShadowRadius(shadowRadius); }
// public Object getBillboardMode() { return wrapperContained.getBillboardMode(); }
// public int getBrightness() { return wrapperContained.getBrightness(); }
// public yarnwrap.entity.decoration.Brightness getBrightnessUnpacked() { return new yarnwrap.entity.decoration.Brightness(wrapperContained.getBrightnessUnpacked()); }
// public float getViewRange() { return wrapperContained.getViewRange(); }
// public float getShadowRadius() { return wrapperContained.getShadowRadius(); }
// public float getShadowStrength() { return wrapperContained.getShadowStrength(); }
// public void setShadowStrength(float shadowStrength) { wrapperContained.setShadowStrength(shadowStrength); }
// public void setDisplayWidth(float width) { wrapperContained.setDisplayWidth(width); }
// public float getDisplayWidth() { return wrapperContained.getDisplayWidth(); }
// public void setDisplayHeight(float height) { wrapperContained.setDisplayHeight(height); }
// public int getGlowColorOverride() { return wrapperContained.getGlowColorOverride(); }
// public float getDisplayHeight() { return wrapperContained.getDisplayHeight(); }
// public void updateVisibilityBoundingBox() { wrapperContained.updateVisibilityBoundingBox(); }
// public Object copyRenderState() { return wrapperContained.copyRenderState(); }
// public Object getLerpedRenderState(Object state,float lerpProgress) { return wrapperContained.getLerpedRenderState(state,lerpProgress); }
// public void refreshData(boolean shouldLerp,float lerpProgress) { wrapperContained.refreshData(shouldLerp,lerpProgress); }
public Object getRenderState() { return wrapperContained.getRenderState(); }
// public void setInterpolationDuration(int interpolationDuration) { wrapperContained.setInterpolationDuration(interpolationDuration); }
// public void setStartInterpolation(int startInterpolation) { wrapperContained.setStartInterpolation(startInterpolation); }
// public void setTeleportDuration(int teleportDuration) { wrapperContained.setTeleportDuration(teleportDuration); }
// public int getInterpolationDuration() { return wrapperContained.getInterpolationDuration(); }
// public int getStartInterpolation() { return wrapperContained.getStartInterpolation(); }
// public int getTeleportDuration() { return wrapperContained.getTeleportDuration(); }

}