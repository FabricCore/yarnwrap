package yarnwrap.client.render.entity.model;
public class ArmorStandEntityModel { public net.minecraft.client.render.entity.model.ArmorStandEntityModel wrapperContained; public ArmorStandEntityModel(net.minecraft.client.render.entity.model.ArmorStandEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart rightBodyStick() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightBodyStick); }
// public void rightBodyStick(yarnwrap.client.model.ModelPart value) { wrapperContained.rightBodyStick = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftBodyStick() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftBodyStick); }
// public void leftBodyStick(yarnwrap.client.model.ModelPart value) { wrapperContained.leftBodyStick = value.wrapperContained; }
// public java.lang.String RIGHT_BODY_STICK() { return wrapperContained.RIGHT_BODY_STICK; }
// public void RIGHT_BODY_STICK(java.lang.String value) { wrapperContained.RIGHT_BODY_STICK = value; }
// public java.lang.String LEFT_BODY_STICK() { return wrapperContained.LEFT_BODY_STICK; }
// public void LEFT_BODY_STICK(java.lang.String value) { wrapperContained.LEFT_BODY_STICK = value; }
// public java.lang.String SHOULDER_STICK() { return wrapperContained.SHOULDER_STICK; }
// public void SHOULDER_STICK(java.lang.String value) { wrapperContained.SHOULDER_STICK = value; }
// public java.lang.String BASE_PLATE() { return wrapperContained.BASE_PLATE; }
// public void BASE_PLATE(java.lang.String value) { wrapperContained.BASE_PLATE = value; }
// public yarnwrap.client.model.ModelPart basePlate() { return new yarnwrap.client.model.ModelPart(wrapperContained.basePlate); }
// public void basePlate(yarnwrap.client.model.ModelPart value) { wrapperContained.basePlate = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart shoulderStick() { return new yarnwrap.client.model.ModelPart(wrapperContained.shoulderStick); }
// public void shoulderStick(yarnwrap.client.model.ModelPart value) { wrapperContained.shoulderStick = value.wrapperContained; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}