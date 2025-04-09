package yarnwrap.client.render.entity.model;
public class HoglinEntityModel { public net.minecraft.client.render.entity.model.HoglinEntityModel wrapperContained; public HoglinEntityModel(net.minecraft.client.render.entity.model.HoglinEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public yarnwrap.client.model.ModelPart rightEar() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightEar); }
// public yarnwrap.client.model.ModelPart leftEar() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftEar); }
// public yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(wrapperContained.body); }
// public yarnwrap.client.model.ModelPart mane() { return new yarnwrap.client.model.ModelPart(wrapperContained.mane); }
// public yarnwrap.client.model.ModelPart rightFrontLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightFrontLeg); }
// public yarnwrap.client.model.ModelPart leftFrontLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftFrontLeg); }
// public yarnwrap.client.model.ModelPart rightHindLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightHindLeg); }
// public yarnwrap.client.model.ModelPart leftHindLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftHindLeg); }
// public float HEAD_PITCH_START() { return wrapperContained.HEAD_PITCH_START; }
// public float HEAD_PITCH_END() { return wrapperContained.HEAD_PITCH_END; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}