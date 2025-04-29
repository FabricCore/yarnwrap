package yarnwrap.client.render.entity.feature;
public class SaddleFeatureRenderer { public net.minecraft.client.render.entity.feature.SaddleFeatureRenderer wrapperContained; public SaddleFeatureRenderer(net.minecraft.client.render.entity.feature.SaddleFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.EntityModel model() { return new yarnwrap.client.render.entity.model.EntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.EntityModel value) { wrapperContained.model = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.EntityModel model() { return new yarnwrap.client.render.entity.model.EntityModel(net.minecraft.client.render.entity.feature.SaddleFeatureRenderer.model); }
// public static void model(yarnwrap.client.render.entity.model.EntityModel value, ) { net.minecraft.client.render.entity.feature.SaddleFeatureRenderer.model = value.wrapperContained; }

// public yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(wrapperContained.texture); }
// public void texture(yarnwrap.util.Identifier value) { wrapperContained.texture = value.wrapperContained; }
// public static yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.feature.SaddleFeatureRenderer.texture); }
// public static void texture(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.feature.SaddleFeatureRenderer.texture = value.wrapperContained; }

public SaddleFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.entity.model.EntityModel model,yarnwrap.util.Identifier texture) { this.wrapperContained = new net.minecraft.client.render.entity.feature.SaddleFeatureRenderer(context.wrapperContained,model.wrapperContained,texture.wrapperContained); }

}