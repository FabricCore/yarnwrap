package yarnwrap.client.render.entity.model;
public class FrogEntityModel { public net.minecraft.client.render.entity.model.FrogEntityModel wrapperContained; public FrogEntityModel(net.minecraft.client.render.entity.model.FrogEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(wrapperContained.body); }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public yarnwrap.client.model.ModelPart eyes() { return new yarnwrap.client.model.ModelPart(wrapperContained.eyes); }
// public yarnwrap.client.model.ModelPart tongue() { return new yarnwrap.client.model.ModelPart(wrapperContained.tongue); }
// public yarnwrap.client.model.ModelPart leftArm() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftArm); }
// public yarnwrap.client.model.ModelPart rightArm() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightArm); }
// public yarnwrap.client.model.ModelPart leftLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftLeg); }
// public yarnwrap.client.model.ModelPart rightLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightLeg); }
// public yarnwrap.client.model.ModelPart croakingBody() { return new yarnwrap.client.model.ModelPart(wrapperContained.croakingBody); }
// public float WALKING_LIMB_ANGLE_SCALE() { return wrapperContained.WALKING_LIMB_ANGLE_SCALE; }
// public float SWIMMING_LIMB_ANGLE_SCALE() { return wrapperContained.SWIMMING_LIMB_ANGLE_SCALE; }
// public float LIMB_DISTANCE_SCALE() { return wrapperContained.LIMB_DISTANCE_SCALE; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}