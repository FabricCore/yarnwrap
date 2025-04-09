package yarnwrap.client.render.entity.model;
public class BeeEntityModel { public net.minecraft.client.render.entity.model.BeeEntityModel wrapperContained; public BeeEntityModel(net.minecraft.client.render.entity.model.BeeEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart bone() { return new yarnwrap.client.model.ModelPart(wrapperContained.bone); }
// public yarnwrap.client.model.ModelPart rightWing() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightWing); }
// public yarnwrap.client.model.ModelPart leftWing() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftWing); }
// public yarnwrap.client.model.ModelPart frontLegs() { return new yarnwrap.client.model.ModelPart(wrapperContained.frontLegs); }
// public yarnwrap.client.model.ModelPart middleLegs() { return new yarnwrap.client.model.ModelPart(wrapperContained.middleLegs); }
// public yarnwrap.client.model.ModelPart backLegs() { return new yarnwrap.client.model.ModelPart(wrapperContained.backLegs); }
// public yarnwrap.client.model.ModelPart stinger() { return new yarnwrap.client.model.ModelPart(wrapperContained.stinger); }
// public yarnwrap.client.model.ModelPart leftAntenna() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftAntenna); }
// public yarnwrap.client.model.ModelPart rightAntenna() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightAntenna); }
// public float bodyPitch() { return wrapperContained.bodyPitch; }
// public float BONE_BASE_Y_PIVOT() { return wrapperContained.BONE_BASE_Y_PIVOT; }
// public java.lang.String BONE() { return wrapperContained.BONE; }
// public java.lang.String STINGER() { return wrapperContained.STINGER; }
// public java.lang.String LEFT_ANTENNA() { return wrapperContained.LEFT_ANTENNA; }
// public java.lang.String RIGHT_ANTENNA() { return wrapperContained.RIGHT_ANTENNA; }
// public java.lang.String FRONT_LEGS() { return wrapperContained.FRONT_LEGS; }
// public java.lang.String MIDDLE_LEGS() { return wrapperContained.MIDDLE_LEGS; }
// public java.lang.String BACK_LEGS() { return wrapperContained.BACK_LEGS; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}