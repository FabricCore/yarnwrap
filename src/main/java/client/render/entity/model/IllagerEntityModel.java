package yarnwrap.client.render.entity.model;
public class IllagerEntityModel { public net.minecraft.client.render.entity.model.IllagerEntityModel wrapperContained; public IllagerEntityModel(net.minecraft.client.render.entity.model.IllagerEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public yarnwrap.client.model.ModelPart leftArm() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftArm); }
// public yarnwrap.client.model.ModelPart rightLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightLeg); }
// public yarnwrap.client.model.ModelPart hat() { return new yarnwrap.client.model.ModelPart(wrapperContained.hat); }
// public yarnwrap.client.model.ModelPart leftLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftLeg); }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public yarnwrap.client.model.ModelPart arms() { return new yarnwrap.client.model.ModelPart(wrapperContained.arms); }
// public yarnwrap.client.model.ModelPart rightArm() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightArm); }
public yarnwrap.client.model.ModelPart getHat() { return new yarnwrap.client.model.ModelPart(wrapperContained.getHat()); }
// public yarnwrap.client.model.ModelPart getAttackingArm(yarnwrap.util.Arm arm) { return new yarnwrap.client.model.ModelPart(wrapperContained.getAttackingArm(arm.wrapperContained)); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}