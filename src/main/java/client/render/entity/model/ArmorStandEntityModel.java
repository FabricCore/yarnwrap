package yarnwrap.client.render.entity.model;
public class ArmorStandEntityModel { public net.minecraft.client.render.entity.model.ArmorStandEntityModel wrapperContained; public ArmorStandEntityModel(net.minecraft.client.render.entity.model.ArmorStandEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart rightBodyStick() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightBodyStick); }
// public yarnwrap.client.model.ModelPart leftBodyStick() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftBodyStick); }
// public java.lang.String RIGHT_BODY_STICK() { return wrapperContained.RIGHT_BODY_STICK; }
// public java.lang.String LEFT_BODY_STICK() { return wrapperContained.LEFT_BODY_STICK; }
// public java.lang.String SHOULDER_STICK() { return wrapperContained.SHOULDER_STICK; }
// public java.lang.String BASE_PLATE() { return wrapperContained.BASE_PLATE; }
// public yarnwrap.client.model.ModelPart basePlate() { return new yarnwrap.client.model.ModelPart(wrapperContained.basePlate); }
// public yarnwrap.client.model.ModelPart shoulderStick() { return new yarnwrap.client.model.ModelPart(wrapperContained.shoulderStick); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }

}