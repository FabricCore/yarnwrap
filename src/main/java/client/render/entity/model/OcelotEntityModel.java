package yarnwrap.client.render.entity.model;
public class OcelotEntityModel { public net.minecraft.client.render.entity.model.OcelotEntityModel wrapperContained; public OcelotEntityModel(net.minecraft.client.render.entity.model.OcelotEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart leftHindLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftHindLeg); }
// public yarnwrap.client.model.ModelPart rightHindLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightHindLeg); }
// public yarnwrap.client.model.ModelPart leftFrontLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftFrontLeg); }
// public yarnwrap.client.model.ModelPart rightFrontLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightFrontLeg); }
// public float BODY_PIVOT_Z() { return wrapperContained.BODY_PIVOT_Z; }
// public float UPPER_TAIL_PIVOT_Y() { return wrapperContained.UPPER_TAIL_PIVOT_Y; }
// public float UPPER_TAIL_PIVOT_Z() { return wrapperContained.UPPER_TAIL_PIVOT_Z; }
// public float LOWER_TAIL_PIVOT_Y() { return wrapperContained.LOWER_TAIL_PIVOT_Y; }
// public float LOWER_TAIL_PIVOT_Z() { return wrapperContained.LOWER_TAIL_PIVOT_Z; }
// public float FRONT_LEG_PIVOT_Z() { return wrapperContained.FRONT_LEG_PIVOT_Z; }
// public java.lang.String TAIL1() { return wrapperContained.TAIL1; }
// public java.lang.String TAIL2() { return wrapperContained.TAIL2; }
// public int SITTING_ANIMATION_STATE() { return wrapperContained.SITTING_ANIMATION_STATE; }
// public float HIND_LEG_PIVOT_Y() { return wrapperContained.HIND_LEG_PIVOT_Y; }
// public float HIND_LEG_PIVOT_Z() { return wrapperContained.HIND_LEG_PIVOT_Z; }
// public float FRONT_LEG_PIVOT_Y() { return wrapperContained.FRONT_LEG_PIVOT_Y; }
// public int SNEAKING_ANIMATION_STATE() { return wrapperContained.SNEAKING_ANIMATION_STATE; }
// public int STANDING_ANIMATION_STATE() { return wrapperContained.STANDING_ANIMATION_STATE; }
// public int SPRINTING_ANIMATION_STATE() { return wrapperContained.SPRINTING_ANIMATION_STATE; }
// public float BODY_SIZE_Y() { return wrapperContained.BODY_SIZE_Y; }
// public float HEAD_PIVOT_Y() { return wrapperContained.HEAD_PIVOT_Y; }
// public float HEAD_PIVOT_Z() { return wrapperContained.HEAD_PIVOT_Z; }
// public float BODY_PIVOT_Y() { return wrapperContained.BODY_PIVOT_Y; }
// public int animationState() { return wrapperContained.animationState; }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public yarnwrap.client.model.ModelPart upperTail() { return new yarnwrap.client.model.ModelPart(wrapperContained.upperTail); }
// public yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(wrapperContained.body); }
// public yarnwrap.client.model.ModelPart lowerTail() { return new yarnwrap.client.model.ModelPart(wrapperContained.lowerTail); }
public yarnwrap.client.model.ModelData getModelData(yarnwrap.client.model.Dilation dilation) { return new yarnwrap.client.model.ModelData(wrapperContained.getModelData(dilation.wrapperContained)); }

}