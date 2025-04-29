package yarnwrap.client.render.entity.feature;
public class HorseArmorFeatureRenderer { public net.minecraft.client.render.entity.feature.HorseArmorFeatureRenderer wrapperContained; public HorseArmorFeatureRenderer(net.minecraft.client.render.entity.feature.HorseArmorFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.entity.model.HorseEntityModel model() { return new yarnwrap.client.render.entity.model.HorseEntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.HorseEntityModel value) { wrapperContained.model = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.HorseEntityModel model() { return new yarnwrap.client.render.entity.model.HorseEntityModel(net.minecraft.client.render.entity.feature.HorseArmorFeatureRenderer.model); }
// public static void model(yarnwrap.client.render.entity.model.HorseEntityModel value, ) { net.minecraft.client.render.entity.feature.HorseArmorFeatureRenderer.model = value.wrapperContained; }

public HorseArmorFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.entity.model.EntityModelLoader loader) { this.wrapperContained = new net.minecraft.client.render.entity.feature.HorseArmorFeatureRenderer(context.wrapperContained,loader.wrapperContained); }

}