package yarnwrap.client.render.entity;
public class LivingEntityRenderer { public net.minecraft.client.render.entity.LivingEntityRenderer wrapperContained; public LivingEntityRenderer(net.minecraft.client.render.entity.LivingEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.EntityModel model() { return new yarnwrap.client.render.entity.model.EntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.EntityModel value) { wrapperContained.model = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.EntityModel model() { return new yarnwrap.client.render.entity.model.EntityModel(net.minecraft.client.render.entity.LivingEntityRenderer.model); }
// public static void model(yarnwrap.client.render.entity.model.EntityModel value, ) { net.minecraft.client.render.entity.LivingEntityRenderer.model = value.wrapperContained; }

// public java.util.List features() { return wrapperContained.features; }
// public void features(java.util.List value) { wrapperContained.features = value; }
// public static java.util.List features() { return net.minecraft.client.render.entity.LivingEntityRenderer.features; }
// public static void features(java.util.List value, ) { net.minecraft.client.render.entity.LivingEntityRenderer.features = value; }

// public yarnwrap.client.item.ItemModelManager itemModelResolver() { return new yarnwrap.client.item.ItemModelManager(wrapperContained.itemModelResolver); }
// public void itemModelResolver(yarnwrap.client.item.ItemModelManager value) { wrapperContained.itemModelResolver = value.wrapperContained; }
// public static yarnwrap.client.item.ItemModelManager itemModelResolver() { return new yarnwrap.client.item.ItemModelManager(net.minecraft.client.render.entity.LivingEntityRenderer.itemModelResolver); }
// public static void itemModelResolver(yarnwrap.client.item.ItemModelManager value, ) { net.minecraft.client.render.entity.LivingEntityRenderer.itemModelResolver = value.wrapperContained; }

// public LivingEntityRenderer(Object ctx,yarnwrap.client.render.entity.model.EntityModel model,float shadowRadius) { this.wrapperContained = new net.minecraft.client.render.entity.LivingEntityRenderer(ctx,model.wrapperContained,shadowRadius); }
public yarnwrap.util.Identifier getTexture(yarnwrap.client.render.entity.state.LivingEntityRenderState state) { return new yarnwrap.util.Identifier(wrapperContained.getTexture(state.wrapperContained)); }
// public static yarnwrap.util.Identifier getTexture(yarnwrap.client.render.entity.state.LivingEntityRenderState state, ) { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.LivingEntityRenderer.getTexture(state.wrapperContained)); }
// public float getLyingPositionRotationDegrees() { return wrapperContained.getLyingPositionRotationDegrees(); }
// public static float getLyingPositionRotationDegrees() { return net.minecraft.client.render.entity.LivingEntityRenderer.getLyingPositionRotationDegrees(); }
// public void scale(yarnwrap.client.render.entity.state.LivingEntityRenderState state,yarnwrap.client.util.math.MatrixStack matrices) { wrapperContained.scale(state.wrapperContained,matrices.wrapperContained); }
// public static void scale(yarnwrap.client.render.entity.state.LivingEntityRenderState state,yarnwrap.client.util.math.MatrixStack matrices, ) { net.minecraft.client.render.entity.LivingEntityRenderer.scale(state.wrapperContained,matrices.wrapperContained); }
// public boolean addFeature(yarnwrap.client.render.entity.feature.FeatureRenderer feature) { return wrapperContained.addFeature(feature.wrapperContained); }
// public static boolean addFeature(yarnwrap.client.render.entity.feature.FeatureRenderer feature, ) { return net.minecraft.client.render.entity.LivingEntityRenderer.addFeature(feature.wrapperContained); }
// public boolean isVisible(yarnwrap.client.render.entity.state.LivingEntityRenderState state) { return wrapperContained.isVisible(state.wrapperContained); }
// public static boolean isVisible(yarnwrap.client.render.entity.state.LivingEntityRenderState state, ) { return net.minecraft.client.render.entity.LivingEntityRenderer.isVisible(state.wrapperContained); }
// public void setupTransforms(yarnwrap.client.render.entity.state.LivingEntityRenderState state,yarnwrap.client.util.math.MatrixStack matrices,float bodyYaw,float baseHeight) { wrapperContained.setupTransforms(state.wrapperContained,matrices.wrapperContained,bodyYaw,baseHeight); }
// public static void setupTransforms(yarnwrap.client.render.entity.state.LivingEntityRenderState state,yarnwrap.client.util.math.MatrixStack matrices,float bodyYaw,float baseHeight, ) { net.minecraft.client.render.entity.LivingEntityRenderer.setupTransforms(state.wrapperContained,matrices.wrapperContained,bodyYaw,baseHeight); }
// public float getYaw(yarnwrap.util.math.Direction direction) { return wrapperContained.getYaw(direction.wrapperContained); }
// public static float getYaw(yarnwrap.util.math.Direction direction, ) { return net.minecraft.client.render.entity.LivingEntityRenderer.getYaw(direction.wrapperContained); }
// public float getAnimationCounter(yarnwrap.client.render.entity.state.LivingEntityRenderState state) { return wrapperContained.getAnimationCounter(state.wrapperContained); }
// public static float getAnimationCounter(yarnwrap.client.render.entity.state.LivingEntityRenderState state, ) { return net.minecraft.client.render.entity.LivingEntityRenderer.getAnimationCounter(state.wrapperContained); }
// public int getOverlay(yarnwrap.client.render.entity.state.LivingEntityRenderState state,float whiteOverlayProgress) { return wrapperContained.getOverlay(state.wrapperContained,whiteOverlayProgress); }
// public static int getOverlay(yarnwrap.client.render.entity.state.LivingEntityRenderState state,float whiteOverlayProgress, ) { return net.minecraft.client.render.entity.LivingEntityRenderer.getOverlay(state.wrapperContained,whiteOverlayProgress); }
// public yarnwrap.client.render.RenderLayer getRenderLayer(yarnwrap.client.render.entity.state.LivingEntityRenderState state,boolean showBody,boolean translucent,boolean showOutline) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getRenderLayer(state.wrapperContained,showBody,translucent,showOutline)); }
// public static yarnwrap.client.render.RenderLayer getRenderLayer(yarnwrap.client.render.entity.state.LivingEntityRenderState state,boolean showBody,boolean translucent,boolean showOutline, ) { return new yarnwrap.client.render.RenderLayer(net.minecraft.client.render.entity.LivingEntityRenderer.getRenderLayer(state.wrapperContained,showBody,translucent,showOutline)); }
// public boolean isShaking(yarnwrap.client.render.entity.state.LivingEntityRenderState state) { return wrapperContained.isShaking(state.wrapperContained); }
// public static boolean isShaking(yarnwrap.client.render.entity.state.LivingEntityRenderState state, ) { return net.minecraft.client.render.entity.LivingEntityRenderer.isShaking(state.wrapperContained); }
// public boolean shouldFlipUpsideDown(yarnwrap.entity.LivingEntity entity) { return wrapperContained.shouldFlipUpsideDown(entity.wrapperContained); }
// public static boolean shouldFlipUpsideDown(yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.client.render.entity.LivingEntityRenderer.shouldFlipUpsideDown(entity.wrapperContained); }
// public float clampBodyYaw(yarnwrap.entity.LivingEntity entity,float degrees,float tickProgress) { return wrapperContained.clampBodyYaw(entity.wrapperContained,degrees,tickProgress); }
// public static float clampBodyYaw(yarnwrap.entity.LivingEntity entity,float degrees,float tickProgress, ) { return net.minecraft.client.render.entity.LivingEntityRenderer.clampBodyYaw(entity.wrapperContained,degrees,tickProgress); }
// public boolean shouldRenderFeatures(yarnwrap.client.render.entity.state.LivingEntityRenderState state) { return wrapperContained.shouldRenderFeatures(state.wrapperContained); }
// public static boolean shouldRenderFeatures(yarnwrap.client.render.entity.state.LivingEntityRenderState state, ) { return net.minecraft.client.render.entity.LivingEntityRenderer.shouldRenderFeatures(state.wrapperContained); }
// public int getMixColor(yarnwrap.client.render.entity.state.LivingEntityRenderState state) { return wrapperContained.getMixColor(state.wrapperContained); }
// public static int getMixColor(yarnwrap.client.render.entity.state.LivingEntityRenderState state, ) { return net.minecraft.client.render.entity.LivingEntityRenderer.getMixColor(state.wrapperContained); }

}