package yarnwrap.client.render.entity.model;
public class ElytraEntityModel { public net.minecraft.client.render.entity.model.ElytraEntityModel wrapperContained; public ElytraEntityModel(net.minecraft.client.render.entity.model.ElytraEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart rightWing() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightWing); }
// public void rightWing(yarnwrap.client.model.ModelPart value) { wrapperContained.rightWing = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftWing() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftWing); }
// public void leftWing(yarnwrap.client.model.ModelPart value) { wrapperContained.leftWing = value.wrapperContained; }
public ElytraEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.ElytraEntityModel(root.wrapperContained); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}