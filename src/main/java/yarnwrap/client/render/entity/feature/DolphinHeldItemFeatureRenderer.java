package yarnwrap.client.render.entity.feature;
public class DolphinHeldItemFeatureRenderer { public net.minecraft.client.render.entity.feature.DolphinHeldItemFeatureRenderer wrapperContained; public DolphinHeldItemFeatureRenderer(net.minecraft.client.render.entity.feature.DolphinHeldItemFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.item.HeldItemRenderer heldItemRenderer() { return new yarnwrap.client.render.item.HeldItemRenderer(wrapperContained.heldItemRenderer); }
// public void heldItemRenderer(yarnwrap.client.render.item.HeldItemRenderer value) { wrapperContained.heldItemRenderer = value.wrapperContained; }
public DolphinHeldItemFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.item.HeldItemRenderer heldItemRenderer) { this.wrapperContained = new net.minecraft.client.render.entity.feature.DolphinHeldItemFeatureRenderer(context.wrapperContained,heldItemRenderer.wrapperContained); }

}