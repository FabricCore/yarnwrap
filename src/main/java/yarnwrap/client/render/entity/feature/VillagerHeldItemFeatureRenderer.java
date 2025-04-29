package yarnwrap.client.render.entity.feature;
public class VillagerHeldItemFeatureRenderer { public net.minecraft.client.render.entity.feature.VillagerHeldItemFeatureRenderer wrapperContained; public VillagerHeldItemFeatureRenderer(net.minecraft.client.render.entity.feature.VillagerHeldItemFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.item.HeldItemRenderer heldItemRenderer() { return new yarnwrap.client.render.item.HeldItemRenderer(wrapperContained.heldItemRenderer); }
// public void heldItemRenderer(yarnwrap.client.render.item.HeldItemRenderer value) { wrapperContained.heldItemRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.item.HeldItemRenderer heldItemRenderer() { return new yarnwrap.client.render.item.HeldItemRenderer(net.minecraft.client.render.entity.feature.VillagerHeldItemFeatureRenderer.heldItemRenderer); }
// public static void heldItemRenderer(yarnwrap.client.render.item.HeldItemRenderer value, ) { net.minecraft.client.render.entity.feature.VillagerHeldItemFeatureRenderer.heldItemRenderer = value.wrapperContained; }

public VillagerHeldItemFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.item.HeldItemRenderer heldItemRenderer) { this.wrapperContained = new net.minecraft.client.render.entity.feature.VillagerHeldItemFeatureRenderer(context.wrapperContained,heldItemRenderer.wrapperContained); }

}