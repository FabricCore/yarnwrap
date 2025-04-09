package yarnwrap.client.render.entity.model;
public class HorseEntityModel { public net.minecraft.client.render.entity.model.HorseEntityModel wrapperContained; public HorseEntityModel(net.minecraft.client.render.entity.model.HorseEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart rightHindLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightHindLeg); }
// public yarnwrap.client.model.ModelPart leftHindLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftHindLeg); }
// public yarnwrap.client.model.ModelPart rightFrontLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightFrontLeg); }
// public yarnwrap.client.model.ModelPart leftFrontLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftFrontLeg); }
// public yarnwrap.client.model.ModelPart rightHindBabyLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightHindBabyLeg); }
// public yarnwrap.client.model.ModelPart leftHindBabyLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftHindBabyLeg); }
// public yarnwrap.client.model.ModelPart rightFrontBabyLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightFrontBabyLeg); }
// public yarnwrap.client.model.ModelPart leftFrontBabyLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftFrontBabyLeg); }
// public java.lang.String HEAD_PARTS() { return wrapperContained.HEAD_PARTS; }
// public float EATING_GRASS_ANIMATION_HEAD_BASE_PITCH() { return wrapperContained.EATING_GRASS_ANIMATION_HEAD_BASE_PITCH; }
// public float ANGRY_ANIMATION_FRONT_LEG_PITCH_MULTIPLIER() { return wrapperContained.ANGRY_ANIMATION_FRONT_LEG_PITCH_MULTIPLIER; }
// public float ANGRY_ANIMATION_BODY_PITCH_MULTIPLIER() { return wrapperContained.ANGRY_ANIMATION_BODY_PITCH_MULTIPLIER; }
// public float HEAD_TAIL_BASE_PITCH() { return wrapperContained.HEAD_TAIL_BASE_PITCH; }
// public float ANGRY_ANIMATION_HIND_LEG_PITCH_MULTIPLIER() { return wrapperContained.ANGRY_ANIMATION_HIND_LEG_PITCH_MULTIPLIER; }
// public java.lang.String LEFT_HIND_BABY_LEG() { return wrapperContained.LEFT_HIND_BABY_LEG; }
// public java.lang.String RIGHT_HIND_BABY_LEG() { return wrapperContained.RIGHT_HIND_BABY_LEG; }
// public java.lang.String LEFT_FRONT_BABY_LEG() { return wrapperContained.LEFT_FRONT_BABY_LEG; }
// public java.lang.String RIGHT_FRONT_BABY_LEG() { return wrapperContained.RIGHT_FRONT_BABY_LEG; }
// public java.lang.String SADDLE() { return wrapperContained.SADDLE; }
// public java.lang.String LEFT_SADDLE_MOUTH() { return wrapperContained.LEFT_SADDLE_MOUTH; }
// public java.lang.String LEFT_SADDLE_LINE() { return wrapperContained.LEFT_SADDLE_LINE; }
// public java.lang.String RIGHT_SADDLE_MOUTH() { return wrapperContained.RIGHT_SADDLE_MOUTH; }
// public java.lang.String RIGHT_SADDLE_LINE() { return wrapperContained.RIGHT_SADDLE_LINE; }
// public java.lang.String HEAD_SADDLE() { return wrapperContained.HEAD_SADDLE; }
// public java.lang.String MOUTH_SADDLE_WRAP() { return wrapperContained.MOUTH_SADDLE_WRAP; }
// public yarnwrap.client.model.ModelPart tail() { return new yarnwrap.client.model.ModelPart(wrapperContained.tail); }
// public net.minecraft.client.model.ModelPart[] straps() { return wrapperContained.straps; }
// public net.minecraft.client.model.ModelPart[] saddle() { return wrapperContained.saddle; }
// public yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(wrapperContained.body); }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
public yarnwrap.client.model.ModelData getModelData(yarnwrap.client.model.Dilation dilation) { return new yarnwrap.client.model.ModelData(wrapperContained.getModelData(dilation.wrapperContained)); }

}