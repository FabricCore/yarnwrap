package yarnwrap.client.render.entity;
public class LivingEntityRenderer { public net.minecraft.client.render.entity.LivingEntityRenderer wrapperContained; public LivingEntityRenderer(net.minecraft.client.render.entity.LivingEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.client.render.entity.model.EntityModel model() { return new yarnwrap.client.render.entity.model.EntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.EntityModel value) { wrapperContained.model = value.wrapperContained; }
// public java.util.List features() { return wrapperContained.features; }
// public void features(java.util.List value) { wrapperContained.features = value; }
// public float getYaw(yarnwrap.util.math.Direction direction) { return wrapperContained.getYaw(direction.wrapperContained); }
// public float getAnimationCounter(yarnwrap.entity.LivingEntity entity,float tickDelta) { return wrapperContained.getAnimationCounter(entity.wrapperContained,tickDelta); }
public int getOverlay(yarnwrap.entity.LivingEntity entity,float whiteOverlayProgress) { return wrapperContained.getOverlay(entity.wrapperContained,whiteOverlayProgress); }
// public yarnwrap.client.render.RenderLayer getRenderLayer(yarnwrap.entity.LivingEntity entity,boolean showBody,boolean translucent,boolean showOutline) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getRenderLayer(entity.wrapperContained,showBody,translucent,showOutline)); }
// public boolean isShaking(yarnwrap.entity.LivingEntity entity) { return wrapperContained.isShaking(entity.wrapperContained); }
public boolean shouldFlipUpsideDown(yarnwrap.entity.LivingEntity entity) { return wrapperContained.shouldFlipUpsideDown(entity.wrapperContained); }
// public float getLyingAngle(yarnwrap.entity.LivingEntity entity) { return wrapperContained.getLyingAngle(entity.wrapperContained); }
// public void scale(yarnwrap.entity.LivingEntity entity,yarnwrap.client.util.math.MatrixStack matrices,float amount) { wrapperContained.scale(entity.wrapperContained,matrices.wrapperContained,amount); }
// public float getHandSwingProgress(yarnwrap.entity.LivingEntity entity,float tickDelta) { return wrapperContained.getHandSwingProgress(entity.wrapperContained,tickDelta); }
// public float getAnimationProgress(yarnwrap.entity.LivingEntity entity,float tickDelta) { return wrapperContained.getAnimationProgress(entity.wrapperContained,tickDelta); }
// public boolean addFeature(yarnwrap.client.render.entity.feature.FeatureRenderer feature) { return wrapperContained.addFeature(feature.wrapperContained); }
// public boolean isVisible(yarnwrap.entity.LivingEntity entity) { return wrapperContained.isVisible(entity.wrapperContained); }
// public void setupTransforms(yarnwrap.entity.LivingEntity entity,yarnwrap.client.util.math.MatrixStack matrices,float animationProgress,float bodyYaw,float tickDelta,float scale) { wrapperContained.setupTransforms(entity.wrapperContained,matrices.wrapperContained,animationProgress,bodyYaw,tickDelta,scale); }

}