package yarnwrap.client.render.entity.feature;
public class PandaHeldItemFeatureRenderer { public net.minecraft.client.render.entity.feature.PandaHeldItemFeatureRenderer wrapperContained; public PandaHeldItemFeatureRenderer(net.minecraft.client.render.entity.feature.PandaHeldItemFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.item.HeldItemRenderer heldItemRenderer() { return new yarnwrap.client.render.item.HeldItemRenderer(wrapperContained.heldItemRenderer); }
// public void heldItemRenderer(yarnwrap.client.render.item.HeldItemRenderer value) { wrapperContained.heldItemRenderer = value.wrapperContained; }
public PandaHeldItemFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.item.HeldItemRenderer heldItemRenderer) { this.wrapperContained = new net.minecraft.client.render.entity.feature.PandaHeldItemFeatureRenderer(context.wrapperContained,heldItemRenderer.wrapperContained); }

}