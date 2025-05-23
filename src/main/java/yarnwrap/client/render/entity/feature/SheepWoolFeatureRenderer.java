package yarnwrap.client.render.entity.feature;
public class SheepWoolFeatureRenderer { public net.minecraft.client.render.entity.feature.SheepWoolFeatureRenderer wrapperContained; public SheepWoolFeatureRenderer(net.minecraft.client.render.entity.feature.SheepWoolFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.feature.SheepWoolFeatureRenderer.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.feature.SheepWoolFeatureRenderer.TEXTURE = value.wrapperContained; }

// public yarnwrap.client.render.entity.model.EntityModel woolModel() { return new yarnwrap.client.render.entity.model.EntityModel(wrapperContained.woolModel); }
// public void woolModel(yarnwrap.client.render.entity.model.EntityModel value) { wrapperContained.woolModel = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.EntityModel woolModel() { return new yarnwrap.client.render.entity.model.EntityModel(net.minecraft.client.render.entity.feature.SheepWoolFeatureRenderer.woolModel); }
// public static void woolModel(yarnwrap.client.render.entity.model.EntityModel value, ) { net.minecraft.client.render.entity.feature.SheepWoolFeatureRenderer.woolModel = value.wrapperContained; }

// public yarnwrap.client.render.entity.model.EntityModel babyWoolModel() { return new yarnwrap.client.render.entity.model.EntityModel(wrapperContained.babyWoolModel); }
// public void babyWoolModel(yarnwrap.client.render.entity.model.EntityModel value) { wrapperContained.babyWoolModel = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.EntityModel babyWoolModel() { return new yarnwrap.client.render.entity.model.EntityModel(net.minecraft.client.render.entity.feature.SheepWoolFeatureRenderer.babyWoolModel); }
// public static void babyWoolModel(yarnwrap.client.render.entity.model.EntityModel value, ) { net.minecraft.client.render.entity.feature.SheepWoolFeatureRenderer.babyWoolModel = value.wrapperContained; }

public SheepWoolFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.entity.model.LoadedEntityModels loader) { this.wrapperContained = new net.minecraft.client.render.entity.feature.SheepWoolFeatureRenderer(context.wrapperContained,loader.wrapperContained); }

}