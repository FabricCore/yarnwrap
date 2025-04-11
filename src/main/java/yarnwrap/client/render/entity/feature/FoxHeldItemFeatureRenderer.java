package yarnwrap.client.render.entity.feature;
public class FoxHeldItemFeatureRenderer { public net.minecraft.client.render.entity.feature.FoxHeldItemFeatureRenderer wrapperContained; public FoxHeldItemFeatureRenderer(net.minecraft.client.render.entity.feature.FoxHeldItemFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.item.HeldItemRenderer heldItemRenderer() { return new yarnwrap.client.render.item.HeldItemRenderer(wrapperContained.heldItemRenderer); }
// public void heldItemRenderer(yarnwrap.client.render.item.HeldItemRenderer value) { wrapperContained.heldItemRenderer = value.wrapperContained; }
public FoxHeldItemFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.item.HeldItemRenderer heldItemRenderer) { this.wrapperContained = new net.minecraft.client.render.entity.feature.FoxHeldItemFeatureRenderer(context.wrapperContained,heldItemRenderer.wrapperContained); }

}