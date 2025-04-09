package yarnwrap.client.render.entity.model;
public class FoxEntityModel { public net.minecraft.client.render.entity.model.FoxEntityModel wrapperContained; public FoxEntityModel(net.minecraft.client.render.entity.model.FoxEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(wrapperContained.body); }
// public yarnwrap.client.model.ModelPart tail() { return new yarnwrap.client.model.ModelPart(wrapperContained.tail); }
// public float legPitchModifier() { return wrapperContained.legPitchModifier; }
// public yarnwrap.client.model.ModelPart rightHindLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightHindLeg); }
// public yarnwrap.client.model.ModelPart leftHindLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftHindLeg); }
// public yarnwrap.client.model.ModelPart rightFrontLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightFrontLeg); }
// public yarnwrap.client.model.ModelPart leftFrontLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftFrontLeg); }
// public float HEAD_Y_PIVOT() { return wrapperContained.HEAD_Y_PIVOT; }
// public float LEG_Y_PIVOT() { return wrapperContained.LEG_Y_PIVOT; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}