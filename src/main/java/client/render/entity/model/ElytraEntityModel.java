package yarnwrap.client.render.entity.model;
public class ElytraEntityModel { public net.minecraft.client.render.entity.model.ElytraEntityModel wrapperContained; public ElytraEntityModel(net.minecraft.client.render.entity.model.ElytraEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart rightWing() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightWing); }
// public yarnwrap.client.model.ModelPart leftWing() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftWing); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}