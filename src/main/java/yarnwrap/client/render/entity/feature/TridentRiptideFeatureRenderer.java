package yarnwrap.client.render.entity.feature;
public class TridentRiptideFeatureRenderer { public net.minecraft.client.render.entity.feature.TridentRiptideFeatureRenderer wrapperContained; public TridentRiptideFeatureRenderer(net.minecraft.client.render.entity.feature.TridentRiptideFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart aura() { return new yarnwrap.client.model.ModelPart(wrapperContained.aura); }
// public void aura(yarnwrap.client.model.ModelPart value) { wrapperContained.aura = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart aura() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.feature.TridentRiptideFeatureRenderer.aura); }
// public static void aura(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.feature.TridentRiptideFeatureRenderer.aura = value.wrapperContained; }

// public java.lang.String BOX() { return wrapperContained.BOX; }
// public void BOX(java.lang.String value) { wrapperContained.BOX = value; }
public static java.lang.String BOX() { return net.minecraft.client.render.entity.feature.TridentRiptideFeatureRenderer.BOX; }
// public static void BOX(java.lang.String value, ) { net.minecraft.client.render.entity.feature.TridentRiptideFeatureRenderer.BOX = value; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.feature.TridentRiptideFeatureRenderer.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.feature.TridentRiptideFeatureRenderer.TEXTURE = value.wrapperContained; }

public TridentRiptideFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.entity.model.EntityModelLoader loader) { this.wrapperContained = new net.minecraft.client.render.entity.feature.TridentRiptideFeatureRenderer(context.wrapperContained,loader.wrapperContained); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.feature.TridentRiptideFeatureRenderer.getTexturedModelData()); }

}