package yarnwrap.client.render.entity.feature;
public class CatCollarFeatureRenderer { public net.minecraft.client.render.entity.feature.CatCollarFeatureRenderer wrapperContained; public CatCollarFeatureRenderer(net.minecraft.client.render.entity.feature.CatCollarFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier SKIN() { return new yarnwrap.util.Identifier(wrapperContained.SKIN); }
// public void SKIN(yarnwrap.util.Identifier value) { wrapperContained.SKIN = value.wrapperContained; }
// public static yarnwrap.util.Identifier SKIN() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.feature.CatCollarFeatureRenderer.SKIN); }
// public static void SKIN(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.feature.CatCollarFeatureRenderer.SKIN = value.wrapperContained; }

// public yarnwrap.client.render.entity.model.CatEntityModel model() { return new yarnwrap.client.render.entity.model.CatEntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.CatEntityModel value) { wrapperContained.model = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.CatEntityModel model() { return new yarnwrap.client.render.entity.model.CatEntityModel(net.minecraft.client.render.entity.feature.CatCollarFeatureRenderer.model); }
// public static void model(yarnwrap.client.render.entity.model.CatEntityModel value, ) { net.minecraft.client.render.entity.feature.CatCollarFeatureRenderer.model = value.wrapperContained; }

// public yarnwrap.client.render.entity.model.CatEntityModel babyModel() { return new yarnwrap.client.render.entity.model.CatEntityModel(wrapperContained.babyModel); }
// public void babyModel(yarnwrap.client.render.entity.model.CatEntityModel value) { wrapperContained.babyModel = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.CatEntityModel babyModel() { return new yarnwrap.client.render.entity.model.CatEntityModel(net.minecraft.client.render.entity.feature.CatCollarFeatureRenderer.babyModel); }
// public static void babyModel(yarnwrap.client.render.entity.model.CatEntityModel value, ) { net.minecraft.client.render.entity.feature.CatCollarFeatureRenderer.babyModel = value.wrapperContained; }

public CatCollarFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.entity.model.LoadedEntityModels loader) { this.wrapperContained = new net.minecraft.client.render.entity.feature.CatCollarFeatureRenderer(context.wrapperContained,loader.wrapperContained); }

}