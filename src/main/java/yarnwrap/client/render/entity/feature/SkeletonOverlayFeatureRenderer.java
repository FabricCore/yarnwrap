package yarnwrap.client.render.entity.feature;
public class SkeletonOverlayFeatureRenderer { public net.minecraft.client.render.entity.feature.SkeletonOverlayFeatureRenderer wrapperContained; public SkeletonOverlayFeatureRenderer(net.minecraft.client.render.entity.feature.SkeletonOverlayFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.SkeletonEntityModel model() { return new yarnwrap.client.render.entity.model.SkeletonEntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.SkeletonEntityModel value) { wrapperContained.model = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.SkeletonEntityModel model() { return new yarnwrap.client.render.entity.model.SkeletonEntityModel(net.minecraft.client.render.entity.feature.SkeletonOverlayFeatureRenderer.model); }
// public static void model(yarnwrap.client.render.entity.model.SkeletonEntityModel value, ) { net.minecraft.client.render.entity.feature.SkeletonOverlayFeatureRenderer.model = value.wrapperContained; }

// public yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(wrapperContained.texture); }
// public void texture(yarnwrap.util.Identifier value) { wrapperContained.texture = value.wrapperContained; }
// public static yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.feature.SkeletonOverlayFeatureRenderer.texture); }
// public static void texture(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.feature.SkeletonOverlayFeatureRenderer.texture = value.wrapperContained; }

public SkeletonOverlayFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.entity.model.LoadedEntityModels loader,yarnwrap.client.render.entity.model.EntityModelLayer layer,yarnwrap.util.Identifier texture) { this.wrapperContained = new net.minecraft.client.render.entity.feature.SkeletonOverlayFeatureRenderer(context.wrapperContained,loader.wrapperContained,layer.wrapperContained,texture.wrapperContained); }

}