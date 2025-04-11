package yarnwrap.client.render.entity.model;
public class HoglinEntityModel { public net.minecraft.client.render.entity.model.HoglinEntityModel wrapperContained; public HoglinEntityModel(net.minecraft.client.render.entity.model.HoglinEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightEar() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightEar); }
// public void rightEar(yarnwrap.client.model.ModelPart value) { wrapperContained.rightEar = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftEar() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftEar); }
// public void leftEar(yarnwrap.client.model.ModelPart value) { wrapperContained.leftEar = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(wrapperContained.body); }
// public void body(yarnwrap.client.model.ModelPart value) { wrapperContained.body = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart mane() { return new yarnwrap.client.model.ModelPart(wrapperContained.mane); }
// public void mane(yarnwrap.client.model.ModelPart value) { wrapperContained.mane = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightFrontLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightFrontLeg); }
// public void rightFrontLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.rightFrontLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftFrontLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftFrontLeg); }
// public void leftFrontLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.leftFrontLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightHindLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightHindLeg); }
// public void rightHindLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.rightHindLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftHindLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftHindLeg); }
// public void leftHindLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.leftHindLeg = value.wrapperContained; }
// public float HEAD_PITCH_START() { return wrapperContained.HEAD_PITCH_START; }
// public void HEAD_PITCH_START(float value) { wrapperContained.HEAD_PITCH_START = value; }
// public float HEAD_PITCH_END() { return wrapperContained.HEAD_PITCH_END; }
// public void HEAD_PITCH_END(float value) { wrapperContained.HEAD_PITCH_END = value; }
public HoglinEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.HoglinEntityModel(root.wrapperContained); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}