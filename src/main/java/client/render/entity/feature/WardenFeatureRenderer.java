package yarnwrap.client.render.entity.feature;
public class WardenFeatureRenderer { public net.minecraft.client.render.entity.feature.WardenFeatureRenderer wrapperContained; public WardenFeatureRenderer(net.minecraft.client.render.entity.feature.WardenFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(wrapperContained.texture); }
// public Object animationAngleAdjuster() { return wrapperContained.animationAngleAdjuster; }
// public Object modelPartVisibility() { return wrapperContained.modelPartVisibility; }
// public void updateModelPartVisibility() { wrapperContained.updateModelPartVisibility(); }
// public void unhideAllModelParts() { wrapperContained.unhideAllModelParts(); }

}