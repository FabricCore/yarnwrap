package yarnwrap.client.render.entity.feature;
public class SkeletonOverlayFeatureRenderer { public net.minecraft.client.render.entity.feature.SkeletonOverlayFeatureRenderer wrapperContained; public SkeletonOverlayFeatureRenderer(net.minecraft.client.render.entity.feature.SkeletonOverlayFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.SkeletonEntityModel model() { return new yarnwrap.client.render.entity.model.SkeletonEntityModel(wrapperContained.model); }
// public yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(wrapperContained.texture); }

}