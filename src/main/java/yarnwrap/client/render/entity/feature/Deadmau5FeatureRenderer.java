package yarnwrap.client.render.entity.feature;
public class Deadmau5FeatureRenderer { public net.minecraft.client.render.entity.feature.Deadmau5FeatureRenderer wrapperContained; public Deadmau5FeatureRenderer(net.minecraft.client.render.entity.feature.Deadmau5FeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.BipedEntityModel model() { return new yarnwrap.client.render.entity.model.BipedEntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.BipedEntityModel value) { wrapperContained.model = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.BipedEntityModel model() { return new yarnwrap.client.render.entity.model.BipedEntityModel(net.minecraft.client.render.entity.feature.Deadmau5FeatureRenderer.model); }
// public static void model(yarnwrap.client.render.entity.model.BipedEntityModel value, ) { net.minecraft.client.render.entity.feature.Deadmau5FeatureRenderer.model = value.wrapperContained; }

public Deadmau5FeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.entity.model.LoadedEntityModels entityModels) { this.wrapperContained = new net.minecraft.client.render.entity.feature.Deadmau5FeatureRenderer(context.wrapperContained,entityModels.wrapperContained); }

}