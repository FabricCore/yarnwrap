package yarnwrap.client.render.entity.feature;
public class HeadFeatureRenderer { public net.minecraft.client.render.entity.feature.HeadFeatureRenderer wrapperContained; public HeadFeatureRenderer(net.minecraft.client.render.entity.feature.HeadFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public float scaleX() { return wrapperContained.scaleX; }
// public void scaleX(float value) { wrapperContained.scaleX = value; }
// public static float scaleX() { return net.minecraft.client.render.entity.feature.HeadFeatureRenderer.scaleX; }
// public static void scaleX(float value, ) { net.minecraft.client.render.entity.feature.HeadFeatureRenderer.scaleX = value; }

// public float scaleY() { return wrapperContained.scaleY; }
// public void scaleY(float value) { wrapperContained.scaleY = value; }
// public static float scaleY() { return net.minecraft.client.render.entity.feature.HeadFeatureRenderer.scaleY; }
// public static void scaleY(float value, ) { net.minecraft.client.render.entity.feature.HeadFeatureRenderer.scaleY = value; }

// public float scaleZ() { return wrapperContained.scaleZ; }
// public void scaleZ(float value) { wrapperContained.scaleZ = value; }
// public static float scaleZ() { return net.minecraft.client.render.entity.feature.HeadFeatureRenderer.scaleZ; }
// public static void scaleZ(float value, ) { net.minecraft.client.render.entity.feature.HeadFeatureRenderer.scaleZ = value; }

// public java.util.Map headModels() { return wrapperContained.headModels; }
// public void headModels(java.util.Map value) { wrapperContained.headModels = value; }
// public static java.util.Map headModels() { return net.minecraft.client.render.entity.feature.HeadFeatureRenderer.headModels; }
// public static void headModels(java.util.Map value, ) { net.minecraft.client.render.entity.feature.HeadFeatureRenderer.headModels = value; }

// public yarnwrap.client.render.item.HeldItemRenderer heldItemRenderer() { return new yarnwrap.client.render.item.HeldItemRenderer(wrapperContained.heldItemRenderer); }
// public void heldItemRenderer(yarnwrap.client.render.item.HeldItemRenderer value) { wrapperContained.heldItemRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.item.HeldItemRenderer heldItemRenderer() { return new yarnwrap.client.render.item.HeldItemRenderer(net.minecraft.client.render.entity.feature.HeadFeatureRenderer.heldItemRenderer); }
// public static void heldItemRenderer(yarnwrap.client.render.item.HeldItemRenderer value, ) { net.minecraft.client.render.entity.feature.HeadFeatureRenderer.heldItemRenderer = value.wrapperContained; }

public HeadFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.entity.model.EntityModelLoader loader,float scaleX,float scaleY,float scaleZ,yarnwrap.client.render.item.HeldItemRenderer heldItemRenderer) { this.wrapperContained = new net.minecraft.client.render.entity.feature.HeadFeatureRenderer(context.wrapperContained,loader.wrapperContained,scaleX,scaleY,scaleZ,heldItemRenderer.wrapperContained); }
public HeadFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.entity.model.EntityModelLoader loader,yarnwrap.client.render.item.HeldItemRenderer heldItemRenderer) { this.wrapperContained = new net.minecraft.client.render.entity.feature.HeadFeatureRenderer(context.wrapperContained,loader.wrapperContained,heldItemRenderer.wrapperContained); }
// public void translate(yarnwrap.client.util.math.MatrixStack matrices,boolean villager) { wrapperContained.translate(matrices.wrapperContained,villager); }
// public static void translate(yarnwrap.client.util.math.MatrixStack matrices,boolean villager, ) { net.minecraft.client.render.entity.feature.HeadFeatureRenderer.translate(matrices.wrapperContained,villager); }

}