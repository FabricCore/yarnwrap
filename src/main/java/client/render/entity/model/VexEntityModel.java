package yarnwrap.client.render.entity.model;
public class VexEntityModel { public net.minecraft.client.render.entity.model.VexEntityModel wrapperContained; public VexEntityModel(net.minecraft.client.render.entity.model.VexEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart leftWing() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftWing); }
// public yarnwrap.client.model.ModelPart rightWing() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightWing); }
// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(wrapperContained.body); }
// public yarnwrap.client.model.ModelPart rightArm() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightArm); }
// public yarnwrap.client.model.ModelPart leftArm() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftArm); }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
// public void translateForHand(yarnwrap.client.util.math.MatrixStack matrices,boolean mainHand) { wrapperContained.translateForHand(matrices.wrapperContained,mainHand); }
// public void setChargingArmAngles(yarnwrap.item.ItemStack mainHandStack,yarnwrap.item.ItemStack offHandStack) { wrapperContained.setChargingArmAngles(mainHandStack.wrapperContained,offHandStack.wrapperContained); }

}