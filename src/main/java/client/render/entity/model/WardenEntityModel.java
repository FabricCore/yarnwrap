package yarnwrap.client.render.entity.model;
public class WardenEntityModel { public net.minecraft.client.render.entity.model.WardenEntityModel wrapperContained; public WardenEntityModel(net.minecraft.client.render.entity.model.WardenEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart bone() { return new yarnwrap.client.model.ModelPart(wrapperContained.bone); }
// public yarnwrap.client.model.ModelPart body() { return new yarnwrap.client.model.ModelPart(wrapperContained.body); }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public yarnwrap.client.model.ModelPart rightTendril() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightTendril); }
// public yarnwrap.client.model.ModelPart leftTendril() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftTendril); }
// public yarnwrap.client.model.ModelPart leftLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftLeg); }
// public yarnwrap.client.model.ModelPart leftArm() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftArm); }
// public yarnwrap.client.model.ModelPart rightArm() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightArm); }
// public yarnwrap.client.model.ModelPart rightLeg() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightLeg); }
// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public yarnwrap.client.model.ModelPart leftRibcage() { return new yarnwrap.client.model.ModelPart(wrapperContained.leftRibcage); }
// public yarnwrap.client.model.ModelPart rightRibcage() { return new yarnwrap.client.model.ModelPart(wrapperContained.rightRibcage); }
// public java.util.List tendrils() { return wrapperContained.tendrils; }
// public java.util.List justBody() { return wrapperContained.justBody; }
// public java.util.List headAndLimbs() { return wrapperContained.headAndLimbs; }
// public java.util.List bodyHeadAndLimbs() { return wrapperContained.bodyHeadAndLimbs; }
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