package yarnwrap.client.render.entity.feature;
public class HeadFeatureRenderer { public net.minecraft.client.render.entity.feature.HeadFeatureRenderer wrapperContained; public HeadFeatureRenderer(net.minecraft.client.render.entity.feature.HeadFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public float scaleX() { return wrapperContained.scaleX; }
// public float scaleY() { return wrapperContained.scaleY; }
// public float scaleZ() { return wrapperContained.scaleZ; }
// public java.util.Map headModels() { return wrapperContained.headModels; }
// public yarnwrap.client.render.item.HeldItemRenderer heldItemRenderer() { return new yarnwrap.client.render.item.HeldItemRenderer(wrapperContained.heldItemRenderer); }
public void translate(yarnwrap.client.util.math.MatrixStack matrices,boolean villager) { wrapperContained.translate(matrices.wrapperContained,villager); }

}