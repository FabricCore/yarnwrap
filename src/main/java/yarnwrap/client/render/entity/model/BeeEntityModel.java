package yarnwrap.client.render.entity.model;
public class BeeEntityModel { public net.minecraft.client.render.entity.model.BeeEntityModel wrapperContained; public BeeEntityModel(net.minecraft.client.render.entity.model.BeeEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart bone() { return new yarnwrap.client.model.ModelPart(wrapperContained.bone); }
// public void bone(yarnwrap.client.model.ModelPart value) { wrapperContained.bone = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightWing() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightWing); }
// public void rightWing(yarnwrap.client.model.ModelPart value) { wrapperContained.rightWing = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftWing() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftWing); }
// public void leftWing(yarnwrap.client.model.ModelPart value) { wrapperContained.leftWing = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart frontLegs() { return new yarnwrap.client.model.ModelPart(wrapperContained.frontLegs); }
// public void frontLegs(yarnwrap.client.model.ModelPart value) { wrapperContained.frontLegs = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart middleLegs() { return new yarnwrap.client.model.ModelPart(wrapperContained.middleLegs); }
// public void middleLegs(yarnwrap.client.model.ModelPart value) { wrapperContained.middleLegs = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart backLegs() { return new yarnwrap.client.model.ModelPart(wrapperContained.backLegs); }
// public void backLegs(yarnwrap.client.model.ModelPart value) { wrapperContained.backLegs = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart stinger() { return new yarnwrap.client.model.ModelPart(wrapperContained.stinger); }
// public void stinger(yarnwrap.client.model.ModelPart value) { wrapperContained.stinger = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftAntenna() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftAntenna); }
// public void leftAntenna(yarnwrap.client.model.ModelPart value) { wrapperContained.leftAntenna = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightAntenna() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightAntenna); }
// public void rightAntenna(yarnwrap.client.model.ModelPart value) { wrapperContained.rightAntenna = value.wrapperContained; }
// public float bodyPitch() { return wrapperContained.bodyPitch; }
// public void bodyPitch(float value) { wrapperContained.bodyPitch = value; }
// public float BONE_BASE_Y_PIVOT() { return wrapperContained.BONE_BASE_Y_PIVOT; }
// public void BONE_BASE_Y_PIVOT(float value) { wrapperContained.BONE_BASE_Y_PIVOT = value; }
// public java.lang.String BONE() { return wrapperContained.BONE; }
// public void BONE(java.lang.String value) { wrapperContained.BONE = value; }
// public java.lang.String STINGER() { return wrapperContained.STINGER; }
// public void STINGER(java.lang.String value) { wrapperContained.STINGER = value; }
// public java.lang.String LEFT_ANTENNA() { return wrapperContained.LEFT_ANTENNA; }
// public void LEFT_ANTENNA(java.lang.String value) { wrapperContained.LEFT_ANTENNA = value; }
// public java.lang.String RIGHT_ANTENNA() { return wrapperContained.RIGHT_ANTENNA; }
// public void RIGHT_ANTENNA(java.lang.String value) { wrapperContained.RIGHT_ANTENNA = value; }
// public java.lang.String FRONT_LEGS() { return wrapperContained.FRONT_LEGS; }
// public void FRONT_LEGS(java.lang.String value) { wrapperContained.FRONT_LEGS = value; }
// public java.lang.String MIDDLE_LEGS() { return wrapperContained.MIDDLE_LEGS; }
// public void MIDDLE_LEGS(java.lang.String value) { wrapperContained.MIDDLE_LEGS = value; }
// public java.lang.String BACK_LEGS() { return wrapperContained.BACK_LEGS; }
// public void BACK_LEGS(java.lang.String value) { wrapperContained.BACK_LEGS = value; }
public BeeEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.BeeEntityModel(root.wrapperContained); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}