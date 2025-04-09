package yarnwrap.client.render.entity.model;
public class BipedEntityModel { public net.minecraft.client.render.entity.model.BipedEntityModel wrapperContained; public BipedEntityModel(net.minecraft.client.render.entity.model.BipedEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.model.ModelPart leftArm() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftArm); }
// public float SPYGLASS_ARM_YAW_OFFSET() { return wrapperContained.SPYGLASS_ARM_YAW_OFFSET; }
// public float SPYGLASS_ARM_PITCH_OFFSET() { return wrapperContained.SPYGLASS_ARM_PITCH_OFFSET; }
// public float SPYGLASS_SNEAKING_ARM_PITCH_OFFSET() { return wrapperContained.SPYGLASS_SNEAKING_ARM_PITCH_OFFSET; }
public yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(wrapperContained.body); }
public yarnwrap.client.model.ModelPart rightLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightLeg); }
public yarnwrap.client.model.ModelPart hat() { return new yarnwrap.client.model.ModelPart(wrapperContained.hat); }
public Object rightArmPose() { return wrapperContained.rightArmPose; }
public float leaningPitch() { return wrapperContained.leaningPitch; }
public yarnwrap.client.model.ModelPart leftLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftLeg); }
public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
public Object leftArmPose() { return wrapperContained.leftArmPose; }
public boolean sneaking() { return wrapperContained.sneaking; }
public yarnwrap.client.model.ModelPart rightArm() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightArm); }
// public float lerpAngle(float angleOne,float angleTwo,float magnitude) { return wrapperContained.lerpAngle(angleOne,angleTwo,magnitude); }
public void setVisible(boolean visible) { wrapperContained.setVisible(visible); }
// public yarnwrap.util.Arm getPreferredArm(yarnwrap.entity.LivingEntity entity) { return new yarnwrap.util.Arm(wrapperContained.getPreferredArm(entity.wrapperContained)); }
// public yarnwrap.client.model.ModelPart getArm(yarnwrap.util.Arm arm) { return new yarnwrap.client.model.ModelPart(wrapperContained.getArm(arm.wrapperContained)); }
public void copyBipedStateTo(yarnwrap.client.render.entity.model.BipedEntityModel model) { wrapperContained.copyBipedStateTo(model.wrapperContained); }
// public void animateArms(yarnwrap.entity.LivingEntity entity,float animationProgress) { wrapperContained.animateArms(entity.wrapperContained,animationProgress); }
// public void positionRightArm(yarnwrap.entity.LivingEntity entity) { wrapperContained.positionRightArm(entity.wrapperContained); }
// public void positionLeftArm(yarnwrap.entity.LivingEntity entity) { wrapperContained.positionLeftArm(entity.wrapperContained); }
public yarnwrap.client.model.ModelData getModelData(yarnwrap.client.model.Dilation dilation,float pivotOffsetY) { return new yarnwrap.client.model.ModelData(wrapperContained.getModelData(dilation.wrapperContained,pivotOffsetY)); }
// public void positionBlockingArm(yarnwrap.client.model.ModelPart arm,boolean rightArm) { wrapperContained.positionBlockingArm(arm.wrapperContained,rightArm); }

}