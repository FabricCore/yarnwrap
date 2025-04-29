package yarnwrap.client.render.entity.feature;
public class ElytraFeatureRenderer { public net.minecraft.client.render.entity.feature.ElytraFeatureRenderer wrapperContained; public ElytraFeatureRenderer(net.minecraft.client.render.entity.feature.ElytraFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier SKIN() { return new yarnwrap.util.Identifier(wrapperContained.SKIN); }
// public void SKIN(yarnwrap.util.Identifier value) { wrapperContained.SKIN = value.wrapperContained; }
// public static yarnwrap.util.Identifier SKIN() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.feature.ElytraFeatureRenderer.SKIN); }
// public static void SKIN(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.feature.ElytraFeatureRenderer.SKIN = value.wrapperContained; }

// public yarnwrap.client.render.entity.model.ElytraEntityModel elytra() { return new yarnwrap.client.render.entity.model.ElytraEntityModel(wrapperContained.elytra); }
// public void elytra(yarnwrap.client.render.entity.model.ElytraEntityModel value) { wrapperContained.elytra = value.wrapperContained; }
// public static yarnwrap.client.render.entity.model.ElytraEntityModel elytra() { return new yarnwrap.client.render.entity.model.ElytraEntityModel(net.minecraft.client.render.entity.feature.ElytraFeatureRenderer.elytra); }
// public static void elytra(yarnwrap.client.render.entity.model.ElytraEntityModel value, ) { net.minecraft.client.render.entity.feature.ElytraFeatureRenderer.elytra = value.wrapperContained; }

public ElytraFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.entity.model.EntityModelLoader loader) { this.wrapperContained = new net.minecraft.client.render.entity.feature.ElytraFeatureRenderer(context.wrapperContained,loader.wrapperContained); }

}