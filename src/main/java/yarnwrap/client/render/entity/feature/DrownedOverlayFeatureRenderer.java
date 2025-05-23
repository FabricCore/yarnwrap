package yarnwrap.client.render.entity.feature;
public class DrownedOverlayFeatureRenderer { public net.minecraft.client.render.entity.feature.DrownedOverlayFeatureRenderer wrapperContained; public DrownedOverlayFeatureRenderer(net.minecraft.client.render.entity.feature.DrownedOverlayFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier SKIN() { return new yarnwrap.util.Identifier(wrapperContained.SKIN); }
// public void SKIN(yarnwrap.util.Identifier value) { wrapperContained.SKIN = value.wrapperContained; }
// public static yarnwrap.util.Identifier SKIN() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.feature.DrownedOverlayFeatureRenderer.SKIN); }
// public static void SKIN(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.feature.DrownedOverlayFeatureRenderer.SKIN = value.wrapperContained; }

// public yarnwrap.client.render.entity.model.DrownedEntityModel model() { return new yarnwrap.client.render.entity.model.DrownedEntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.DrownedEntityModel value) { wrapperContained.model = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.DrownedEntityModel model() { return new yarnwrap.client.render.entity.model.DrownedEntityModel(net.minecraft.client.render.entity.feature.DrownedOverlayFeatureRenderer.model); }
// public static void model(yarnwrap.client.render.entity.model.DrownedEntityModel value, ) { net.minecraft.client.render.entity.feature.DrownedOverlayFeatureRenderer.model = value.wrapperContained; }

// public yarnwrap.client.render.entity.model.DrownedEntityModel babyModel() { return new yarnwrap.client.render.entity.model.DrownedEntityModel(wrapperContained.babyModel); }
// public void babyModel(yarnwrap.client.render.entity.model.DrownedEntityModel value) { wrapperContained.babyModel = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.DrownedEntityModel babyModel() { return new yarnwrap.client.render.entity.model.DrownedEntityModel(net.minecraft.client.render.entity.feature.DrownedOverlayFeatureRenderer.babyModel); }
// public static void babyModel(yarnwrap.client.render.entity.model.DrownedEntityModel value, ) { net.minecraft.client.render.entity.feature.DrownedOverlayFeatureRenderer.babyModel = value.wrapperContained; }

public DrownedOverlayFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.entity.model.LoadedEntityModels loader) { this.wrapperContained = new net.minecraft.client.render.entity.feature.DrownedOverlayFeatureRenderer(context.wrapperContained,loader.wrapperContained); }

}