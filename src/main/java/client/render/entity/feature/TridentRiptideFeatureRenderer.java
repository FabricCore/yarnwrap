package yarnwrap.client.render.entity.feature;
public class TridentRiptideFeatureRenderer { public net.minecraft.client.render.entity.feature.TridentRiptideFeatureRenderer wrapperContained; public TridentRiptideFeatureRenderer(net.minecraft.client.render.entity.feature.TridentRiptideFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart aura() { return new yarnwrap.client.model.ModelPart(wrapperContained.aura); }
public java.lang.String BOX() { return wrapperContained.BOX; }
public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}