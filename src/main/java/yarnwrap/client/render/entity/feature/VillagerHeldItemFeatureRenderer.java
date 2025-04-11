package yarnwrap.client.render.entity.feature;
public class VillagerHeldItemFeatureRenderer { public net.minecraft.client.render.entity.feature.VillagerHeldItemFeatureRenderer wrapperContained; public VillagerHeldItemFeatureRenderer(net.minecraft.client.render.entity.feature.VillagerHeldItemFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.item.HeldItemRenderer heldItemRenderer() { return new yarnwrap.client.render.item.HeldItemRenderer(wrapperContained.heldItemRenderer); }
// public void heldItemRenderer(yarnwrap.client.render.item.HeldItemRenderer value) { wrapperContained.heldItemRenderer = value.wrapperContained; }

}