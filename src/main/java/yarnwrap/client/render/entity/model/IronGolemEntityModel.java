package yarnwrap.client.render.entity.model;
public class IronGolemEntityModel { public net.minecraft.client.render.entity.model.IronGolemEntityModel wrapperContained; public IronGolemEntityModel(net.minecraft.client.render.entity.model.IronGolemEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightArm() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightArm); }
// public void rightArm(yarnwrap.client.model.ModelPart value) { wrapperContained.rightArm = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftArm() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftArm); }
// public void leftArm(yarnwrap.client.model.ModelPart value) { wrapperContained.leftArm = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightLeg); }
// public void rightLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.rightLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftLeg); }
// public void leftLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.leftLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
public IronGolemEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.IronGolemEntityModel(root.wrapperContained); }
public yarnwrap.client.model.ModelPart getRightArm() { return new yarnwrap.client.model.ModelPart(wrapperContained.getRightArm()); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}