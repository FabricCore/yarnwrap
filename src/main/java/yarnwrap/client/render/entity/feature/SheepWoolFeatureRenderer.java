package yarnwrap.client.render.entity.feature;
public class SheepWoolFeatureRenderer { public net.minecraft.client.render.entity.feature.SheepWoolFeatureRenderer wrapperContained; public SheepWoolFeatureRenderer(net.minecraft.client.render.entity.feature.SheepWoolFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.SheepWoolEntityModel model() { return new yarnwrap.client.render.entity.model.SheepWoolEntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.SheepWoolEntityModel value) { wrapperContained.model = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.SheepWoolEntityModel model() { return new yarnwrap.client.render.entity.model.SheepWoolEntityModel(net.minecraft.client.render.entity.feature.SheepWoolFeatureRenderer.model); }
// public static void model(yarnwrap.client.render.entity.model.SheepWoolEntityModel value, ) { net.minecraft.client.render.entity.feature.SheepWoolFeatureRenderer.model = value.wrapperContained; }

// public yarnwrap.util.Identifier SKIN() { return new yarnwrap.util.Identifier(wrapperContained.SKIN); }
// public void SKIN(yarnwrap.util.Identifier value) { wrapperContained.SKIN = value.wrapperContained; }
// public static yarnwrap.util.Identifier SKIN() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.feature.SheepWoolFeatureRenderer.SKIN); }
// public static void SKIN(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.feature.SheepWoolFeatureRenderer.SKIN = value.wrapperContained; }

public SheepWoolFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.entity.model.EntityModelLoader loader) { this.wrapperContained = new net.minecraft.client.render.entity.feature.SheepWoolFeatureRenderer(context.wrapperContained,loader.wrapperContained); }

}