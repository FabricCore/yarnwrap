package yarnwrap.client.render.entity.model;
public class FrogEntityModel { public net.minecraft.client.render.entity.model.FrogEntityModel wrapperContained; public FrogEntityModel(net.minecraft.client.render.entity.model.FrogEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(wrapperContained.body); }
// public void body(yarnwrap.client.model.ModelPart value) { wrapperContained.body = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart eyes() { return new yarnwrap.client.model.ModelPart(wrapperContained.eyes); }
// public void eyes(yarnwrap.client.model.ModelPart value) { wrapperContained.eyes = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart tongue() { return new yarnwrap.client.model.ModelPart(wrapperContained.tongue); }
// public void tongue(yarnwrap.client.model.ModelPart value) { wrapperContained.tongue = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftArm() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftArm); }
// public void leftArm(yarnwrap.client.model.ModelPart value) { wrapperContained.leftArm = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightArm() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightArm); }
// public void rightArm(yarnwrap.client.model.ModelPart value) { wrapperContained.rightArm = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftLeg); }
// public void leftLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.leftLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightLeg); }
// public void rightLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.rightLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart croakingBody() { return new yarnwrap.client.model.ModelPart(wrapperContained.croakingBody); }
// public void croakingBody(yarnwrap.client.model.ModelPart value) { wrapperContained.croakingBody = value.wrapperContained; }
// public float WALKING_LIMB_ANGLE_SCALE() { return wrapperContained.WALKING_LIMB_ANGLE_SCALE; }
// public void WALKING_LIMB_ANGLE_SCALE(float value) { wrapperContained.WALKING_LIMB_ANGLE_SCALE = value; }
// public float SWIMMING_LIMB_ANGLE_SCALE() { return wrapperContained.SWIMMING_LIMB_ANGLE_SCALE; }
// public void SWIMMING_LIMB_ANGLE_SCALE(float value) { wrapperContained.SWIMMING_LIMB_ANGLE_SCALE = value; }
// public float LIMB_DISTANCE_SCALE() { return wrapperContained.LIMB_DISTANCE_SCALE; }
// public void LIMB_DISTANCE_SCALE(float value) { wrapperContained.LIMB_DISTANCE_SCALE = value; }
public FrogEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.FrogEntityModel(root.wrapperContained); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}