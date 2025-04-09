package yarnwrap.client.render.entity.model;
public class RabbitEntityModel { public net.minecraft.client.render.entity.model.RabbitEntityModel wrapperContained; public RabbitEntityModel(net.minecraft.client.render.entity.model.RabbitEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart leftHindLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftHindLeg); }
// public yarnwrap.client.model.ModelPart rightHindLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightHindLeg); }
// public yarnwrap.client.model.ModelPart leftHaunch() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftHaunch); }
// public yarnwrap.client.model.ModelPart rightHaunch() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightHaunch); }
// public yarnwrap.client.model.ModelPart leftFrontLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftFrontLeg); }
// public yarnwrap.client.model.ModelPart rightFrontLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightFrontLeg); }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public yarnwrap.client.model.ModelPart rightEar() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightEar); }
// public yarnwrap.client.model.ModelPart leftEar() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftEar); }
// public float HAUNCH_JUMP_PITCH_MULTIPLIER() { return wrapperContained.HAUNCH_JUMP_PITCH_MULTIPLIER; }
// public float FRONT_LEGS_JUMP_PITCH_MULTIPLIER() { return wrapperContained.FRONT_LEGS_JUMP_PITCH_MULTIPLIER; }
// public java.lang.String LEFT_HAUNCH() { return wrapperContained.LEFT_HAUNCH; }
// public java.lang.String RIGHT_HAUNCH() { return wrapperContained.RIGHT_HAUNCH; }
// public float SCALE() { return wrapperContained.SCALE; }
// public yarnwrap.client.model.ModelPart tail() { return new yarnwrap.client.model.ModelPart(wrapperContained.tail); }
// public yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(wrapperContained.body); }
// public yarnwrap.client.model.ModelPart nose() { return new yarnwrap.client.model.ModelPart(wrapperContained.nose); }
// public float jumpProgress() { return wrapperContained.jumpProgress; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}