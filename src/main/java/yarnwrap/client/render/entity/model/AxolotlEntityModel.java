package yarnwrap.client.render.entity.model;
public class AxolotlEntityModel { public net.minecraft.client.render.entity.model.AxolotlEntityModel wrapperContained; public AxolotlEntityModel(net.minecraft.client.render.entity.model.AxolotlEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart tail() { return new yarnwrap.client.model.ModelPart(wrapperContained.tail); }
// public void tail(yarnwrap.client.model.ModelPart value) { wrapperContained.tail = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftHindLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftHindLeg); }
// public void leftHindLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.leftHindLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightHindLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightHindLeg); }
// public void rightHindLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.rightHindLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftFrontLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftFrontLeg); }
// public void leftFrontLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.leftFrontLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightFrontLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightFrontLeg); }
// public void rightFrontLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.rightFrontLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(wrapperContained.body); }
// public void body(yarnwrap.client.model.ModelPart value) { wrapperContained.body = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart topGills() { return new yarnwrap.client.model.ModelPart(wrapperContained.topGills); }
// public void topGills(yarnwrap.client.model.ModelPart value) { wrapperContained.topGills = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftGills() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftGills); }
// public void leftGills(yarnwrap.client.model.ModelPart value) { wrapperContained.leftGills = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightGills() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightGills); }
// public void rightGills(yarnwrap.client.model.ModelPart value) { wrapperContained.rightGills = value.wrapperContained; }
public float MOVING_IN_WATER_LEG_PITCH() { return wrapperContained.MOVING_IN_WATER_LEG_PITCH; }
// public void MOVING_IN_WATER_LEG_PITCH(float value) { wrapperContained.MOVING_IN_WATER_LEG_PITCH = value; }
public AxolotlEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.AxolotlEntityModel(root.wrapperContained); }
// public void setStandingOnGroundAngles(float animationProgress,float headYaw) { wrapperContained.setStandingOnGroundAngles(animationProgress,headYaw); }
// public void resetAngles(yarnwrap.entity.passive.AxolotlEntity axolotl,float headYaw,float headPitch) { wrapperContained.resetAngles(axolotl.wrapperContained,headYaw,headPitch); }
// public void setMovingOnGroundAngles(float animationProgress,float headYaw) { wrapperContained.setMovingOnGroundAngles(animationProgress,headYaw); }
// public void setMovingInWaterAngles(float animationProgress,float headPitch) { wrapperContained.setMovingInWaterAngles(animationProgress,headPitch); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
// public void setStandingInWaterAngles(float animationProgress) { wrapperContained.setStandingInWaterAngles(animationProgress); }
// public void setPlayingDeadAngles(float headYaw) { wrapperContained.setPlayingDeadAngles(headYaw); }
// public void copyLegAngles() { wrapperContained.copyLegAngles(); }
// public float lerpAngleDegrees(float start,float end) { return wrapperContained.lerpAngleDegrees(start,end); }
// public float lerpAngleDegrees(float delta,float start,float end) { return wrapperContained.lerpAngleDegrees(delta,start,end); }
// public void updateAnglesCache(yarnwrap.entity.passive.AxolotlEntity axolotl) { wrapperContained.updateAnglesCache(axolotl.wrapperContained); }
// public org.joml.Vector3f getAngles(yarnwrap.client.model.ModelPart part) { return wrapperContained.getAngles(part.wrapperContained); }
// public void setAngles(yarnwrap.client.model.ModelPart part,float pitch,float yaw,float roll) { wrapperContained.setAngles(part.wrapperContained,pitch,yaw,roll); }
// public void setAngles(yarnwrap.client.model.ModelPart part,org.joml.Vector3f angles) { wrapperContained.setAngles(part.wrapperContained,angles); }

}