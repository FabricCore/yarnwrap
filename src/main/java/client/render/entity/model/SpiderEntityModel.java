package yarnwrap.client.render.entity.model;
public class SpiderEntityModel { public net.minecraft.client.render.entity.model.SpiderEntityModel wrapperContained; public SpiderEntityModel(net.minecraft.client.render.entity.model.SpiderEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public yarnwrap.client.model.ModelPart rightHindLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightHindLeg); }
// public yarnwrap.client.model.ModelPart leftHindLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftHindLeg); }
// public yarnwrap.client.model.ModelPart rightMiddleLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightMiddleLeg); }
// public yarnwrap.client.model.ModelPart leftMiddleLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftMiddleLeg); }
// public yarnwrap.client.model.ModelPart rightMiddleFrontLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightMiddleFrontLeg); }
// public yarnwrap.client.model.ModelPart leftMiddleFrontLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftMiddleFrontLeg); }
// public yarnwrap.client.model.ModelPart rightFrontLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightFrontLeg); }
// public yarnwrap.client.model.ModelPart leftFrontLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftFrontLeg); }
// public java.lang.String BODY0() { return wrapperContained.BODY0; }
// public java.lang.String BODY1() { return wrapperContained.BODY1; }
// public java.lang.String RIGHT_MIDDLE_FRONT_LEG() { return wrapperContained.RIGHT_MIDDLE_FRONT_LEG; }
// public java.lang.String LEFT_MIDDLE_FRONT_LEG() { return wrapperContained.LEFT_MIDDLE_FRONT_LEG; }
// public java.lang.String RIGHT_MIDDLE_HIND_LEG() { return wrapperContained.RIGHT_MIDDLE_HIND_LEG; }
// public java.lang.String LEFT_MIDDLE_HIND_LEG() { return wrapperContained.LEFT_MIDDLE_HIND_LEG; }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}