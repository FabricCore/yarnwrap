package yarnwrap.client.render.entity.model;
public class IllagerEntityModel { public net.minecraft.client.render.entity.model.IllagerEntityModel wrapperContained; public IllagerEntityModel(net.minecraft.client.render.entity.model.IllagerEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftArm() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftArm); }
// public void leftArm(yarnwrap.client.model.ModelPart value) { wrapperContained.leftArm = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightLeg); }
// public void rightLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.rightLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart hat() { return new yarnwrap.client.model.ModelPart(wrapperContained.hat); }
// public void hat(yarnwrap.client.model.ModelPart value) { wrapperContained.hat = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftLeg); }
// public void leftLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.leftLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart arms() { return new yarnwrap.client.model.ModelPart(wrapperContained.arms); }
// public void arms(yarnwrap.client.model.ModelPart value) { wrapperContained.arms = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightArm() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightArm); }
// public void rightArm(yarnwrap.client.model.ModelPart value) { wrapperContained.rightArm = value.wrapperContained; }
public IllagerEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.IllagerEntityModel(root.wrapperContained); }
public yarnwrap.client.model.ModelPart getHat() { return new yarnwrap.client.model.ModelPart(wrapperContained.getHat()); }
// public yarnwrap.client.model.ModelPart getAttackingArm(yarnwrap.util.Arm arm) { return new yarnwrap.client.model.ModelPart(wrapperContained.getAttackingArm(arm.wrapperContained)); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}