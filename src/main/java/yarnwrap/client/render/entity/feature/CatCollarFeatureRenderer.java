package yarnwrap.client.render.entity.feature;
public class CatCollarFeatureRenderer { public net.minecraft.client.render.entity.feature.CatCollarFeatureRenderer wrapperContained; public CatCollarFeatureRenderer(net.minecraft.client.render.entity.feature.CatCollarFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier SKIN() { return new yarnwrap.util.Identifier(wrapperContained.SKIN); }
// public void SKIN(yarnwrap.util.Identifier value) { wrapperContained.SKIN = value.wrapperContained; }
// public yarnwrap.client.render.entity.model.CatEntityModel model() { return new yarnwrap.client.render.entity.model.CatEntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.CatEntityModel value) { wrapperContained.model = value.wrapperContained; }
public CatCollarFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.entity.model.EntityModelLoader loader) { this.wrapperContained = new net.minecraft.client.render.entity.feature.CatCollarFeatureRenderer(context.wrapperContained,loader.wrapperContained); }

}