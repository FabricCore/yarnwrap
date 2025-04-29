package yarnwrap.client.render.entity.feature;
public class SlimeOverlayFeatureRenderer { public net.minecraft.client.render.entity.feature.SlimeOverlayFeatureRenderer wrapperContained; public SlimeOverlayFeatureRenderer(net.minecraft.client.render.entity.feature.SlimeOverlayFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.EntityModel model() { return new yarnwrap.client.render.entity.model.EntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.EntityModel value) { wrapperContained.model = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.EntityModel model() { return new yarnwrap.client.render.entity.model.EntityModel(net.minecraft.client.render.entity.feature.SlimeOverlayFeatureRenderer.model); }
// public static void model(yarnwrap.client.render.entity.model.EntityModel value, ) { net.minecraft.client.render.entity.feature.SlimeOverlayFeatureRenderer.model = value.wrapperContained; }

public SlimeOverlayFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.entity.model.EntityModelLoader loader) { this.wrapperContained = new net.minecraft.client.render.entity.feature.SlimeOverlayFeatureRenderer(context.wrapperContained,loader.wrapperContained); }

}