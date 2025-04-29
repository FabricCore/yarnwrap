package yarnwrap.client.render.entity.feature;
public class CreeperChargeFeatureRenderer { public net.minecraft.client.render.entity.feature.CreeperChargeFeatureRenderer wrapperContained; public CreeperChargeFeatureRenderer(net.minecraft.client.render.entity.feature.CreeperChargeFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier SKIN() { return new yarnwrap.util.Identifier(wrapperContained.SKIN); }
// public void SKIN(yarnwrap.util.Identifier value) { wrapperContained.SKIN = value.wrapperContained; }
// public static yarnwrap.util.Identifier SKIN() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.feature.CreeperChargeFeatureRenderer.SKIN); }
// public static void SKIN(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.feature.CreeperChargeFeatureRenderer.SKIN = value.wrapperContained; }

// public yarnwrap.client.render.entity.model.CreeperEntityModel model() { return new yarnwrap.client.render.entity.model.CreeperEntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.CreeperEntityModel value) { wrapperContained.model = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.CreeperEntityModel model() { return new yarnwrap.client.render.entity.model.CreeperEntityModel(net.minecraft.client.render.entity.feature.CreeperChargeFeatureRenderer.model); }
// public static void model(yarnwrap.client.render.entity.model.CreeperEntityModel value, ) { net.minecraft.client.render.entity.feature.CreeperChargeFeatureRenderer.model = value.wrapperContained; }

public CreeperChargeFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.entity.model.EntityModelLoader loader) { this.wrapperContained = new net.minecraft.client.render.entity.feature.CreeperChargeFeatureRenderer(context.wrapperContained,loader.wrapperContained); }

}