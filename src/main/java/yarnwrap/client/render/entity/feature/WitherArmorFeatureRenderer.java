package yarnwrap.client.render.entity.feature;
public class WitherArmorFeatureRenderer { public net.minecraft.client.render.entity.feature.WitherArmorFeatureRenderer wrapperContained; public WitherArmorFeatureRenderer(net.minecraft.client.render.entity.feature.WitherArmorFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.WitherEntityModel model() { return new yarnwrap.client.render.entity.model.WitherEntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.WitherEntityModel value) { wrapperContained.model = value.wrapperContained; }
// public yarnwrap.util.Identifier SKIN() { return new yarnwrap.util.Identifier(wrapperContained.SKIN); }
// public void SKIN(yarnwrap.util.Identifier value) { wrapperContained.SKIN = value.wrapperContained; }
public WitherArmorFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.entity.model.EntityModelLoader loader) { this.wrapperContained = new net.minecraft.client.render.entity.feature.WitherArmorFeatureRenderer(context.wrapperContained,loader.wrapperContained); }

}