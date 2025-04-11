package yarnwrap.client.render.entity.model;
public class WardenEntityModel { public net.minecraft.client.render.entity.model.WardenEntityModel wrapperContained; public WardenEntityModel(net.minecraft.client.render.entity.model.WardenEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart bone() { return new yarnwrap.client.model.ModelPart(wrapperContained.bone); }
// public void bone(yarnwrap.client.model.ModelPart value) { wrapperContained.bone = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(wrapperContained.body); }
// public void body(yarnwrap.client.model.ModelPart value) { wrapperContained.body = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public void head(yarnwrap.client.model.ModelPart value) { wrapperContained.head = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightTendril() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightTendril); }
// public void rightTendril(yarnwrap.client.model.ModelPart value) { wrapperContained.rightTendril = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftTendril() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftTendril); }
// public void leftTendril(yarnwrap.client.model.ModelPart value) { wrapperContained.leftTendril = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftLeg); }
// public void leftLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.leftLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftArm() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftArm); }
// public void leftArm(yarnwrap.client.model.ModelPart value) { wrapperContained.leftArm = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightArm() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightArm); }
// public void rightArm(yarnwrap.client.model.ModelPart value) { wrapperContained.rightArm = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightLeg); }
// public void rightLeg(yarnwrap.client.model.ModelPart value) { wrapperContained.rightLeg = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart leftRibcage() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftRibcage); }
// public void leftRibcage(yarnwrap.client.model.ModelPart value) { wrapperContained.leftRibcage = value.wrapperContained; }
// public yarnwrap.client.model.ModelPart rightRibcage() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightRibcage); }
// public void rightRibcage(yarnwrap.client.model.ModelPart value) { wrapperContained.rightRibcage = value.wrapperContained; }
// public java.util.List tendrils() { return wrapperContained.tendrils; }
// public void tendrils(java.util.List value) { wrapperContained.tendrils = value; }
// public java.util.List justBody() { return wrapperContained.justBody; }
// public void justBody(java.util.List value) { wrapperContained.justBody = value; }
// public java.util.List headAndLimbs() { return wrapperContained.headAndLimbs; }
// public void headAndLimbs(java.util.List value) { wrapperContained.headAndLimbs = value; }
// public java.util.List bodyHeadAndLimbs() { return wrapperContained.bodyHeadAndLimbs; }
// public void bodyHeadAndLimbs(java.util.List value) { wrapperContained.bodyHeadAndLimbs = value; }
public WardenEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.WardenEntityModel(root.wrapperContained); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
// public void setHeadAndBodyAngles(float animationProgress) { wrapperContained.setHeadAndBodyAngles(animationProgress); }
// public void setHeadAngle(float yaw,float pitch) { wrapperContained.setHeadAngle(yaw,pitch); }
// public void setTendrilPitches(yarnwrap.entity.mob.WardenEntity warden,float animationProgress,float tickDelta) { wrapperContained.setTendrilPitches(warden.wrapperContained,animationProgress,tickDelta); }
// public void setLimbAngles(float angle,float distance) { wrapperContained.setLimbAngles(angle,distance); }
public java.util.List getTendrils() { return wrapperContained.getTendrils(); }
public java.util.List getBody() { return wrapperContained.getBody(); }
public java.util.List getHeadAndLimbs() { return wrapperContained.getHeadAndLimbs(); }
public java.util.List getBodyHeadAndLimbs() { return wrapperContained.getBodyHeadAndLimbs(); }
// public void setArmPivots() { wrapperContained.setArmPivots(); }

}