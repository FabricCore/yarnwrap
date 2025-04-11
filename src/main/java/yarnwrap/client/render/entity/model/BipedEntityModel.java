package yarnwrap.client.render.entity.model;
public class BipedEntityModel { public net.minecraft.client.render.entity.model.BipedEntityModel wrapperContained; public BipedEntityModel(net.minecraft.client.render.entity.model.BipedEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.model.ModelPart leftArm() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftArm); }
// public void leftArm(yarnwrap.client.model.ModelPart value) { wrapperContained.leftArm = value.wrapperContained; }
// public float SPYGLASS_ARM_YAW_OFFSET() { return wrapperContained.SPYGLASS_ARM_YAW_OFFSET; }
// public void SPYGLASS_ARM_YAW_OFFSET(float value) { wrapperContained.SPYGLASS_ARM_YAW_OFFSET = value; }
// public float SPYGLASS_ARM_PITCH_OFFSET() { return wrapperContained.SPYGLASS_ARM_PITCH_OFFSET; }
// public void SPYGLASS_ARM_PITCH_OFFSET(float value) { wrapperContained.SPYGLASS_ARM_PITCH_OFFSET = value; }
// public float SPYGLASS_SNEAKING_ARM_PITCH_OFFSET() { return wrapperContained.SPYGLASS_SNEAKING_ARM_PITCH_OFFSET; }
// public void SPYGLASS_SNEAKING_ARM_PITCH_OFFSET(float value) { wrapperContained.SPYGLASS_SNEAKING_ARM_PITCH_OFFSET = value; }
public yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(wrapperContained.body); }
// public void body(yarnwrap.client.model.ModelPart value) { wrapperContained.body = value.wrapperContained; }
public yarnwrap.client.model.ModelPart rightLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightLeg); }
// public void rightLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.rightLeg = value.wrapperContained; }
public yarnwrap.client.model.ModelPart hat() { return new yarnwrap.client.model.ModelPart(wrapperContained.hat); }
// public void hat(yarnwrap.client.model.ModelPart value) { wrapperContained.hat = value.wrapperContained; }
public Object rightArmPose() { return wrapperContained.rightArmPose; }
// public void rightArmPose(Object value) { wrapperContained.rightArmPose = value; }
public float leaningPitch() { return wrapperContained.leaningPitch; }
public void leaningPitch(float value) { wrapperContained.leaningPitch = value; }
public yarnwrap.client.model.ModelPart leftLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftLeg); }
// public void leftLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.leftLeg = value.wrapperContained; }
public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
public Object leftArmPose() { return wrapperContained.leftArmPose; }
// public void leftArmPose(Object value) { wrapperContained.leftArmPose = value; }
public boolean sneaking() { return wrapperContained.sneaking; }
public void sneaking(boolean value) { wrapperContained.sneaking = value; }
public yarnwrap.client.model.ModelPart rightArm() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightArm); }
// public void rightArm(yarnwrap.client.model.ModelPart value) { wrapperContained.rightArm = value.wrapperContained; }
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