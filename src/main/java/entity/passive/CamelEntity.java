package yarnwrap.entity.passive;
public class CamelEntity { public net.minecraft.entity.passive.CamelEntity wrapperContained; public CamelEntity(net.minecraft.entity.passive.CamelEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EntityDimensions SITTING_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.SITTING_DIMENSIONS); }
// public int dashCooldown() { return wrapperContained.dashCooldown; }
// public int idleAnimationCooldown() { return wrapperContained.idleAnimationCooldown; }
public yarnwrap.entity.data.TrackedData DASHING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.DASHING); }
public yarnwrap.entity.data.TrackedData LAST_POSE_TICK() { return new yarnwrap.entity.data.TrackedData(wrapperContained.LAST_POSE_TICK); }
public yarnwrap.entity.AnimationState sittingTransitionAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.sittingTransitionAnimationState); }
public yarnwrap.entity.AnimationState standingTransitionAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.standingTransitionAnimationState); }
public yarnwrap.entity.AnimationState idlingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.idlingAnimationState); }
public yarnwrap.entity.AnimationState dashingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.dashingAnimationState); }
public yarnwrap.entity.AnimationState sittingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.sittingAnimationState); }
public void setLastPoseTick(long lastPoseTick) { wrapperContained.setLastPoseTick(lastPoseTick); }
// public double getPassengerAttachmentY(boolean primaryPassenger,float tickDelta,yarnwrap.entity.EntityDimensions dimensions,float scaleFactor) { return wrapperContained.getPassengerAttachmentY(primaryPassenger,tickDelta,dimensions.wrapperContained,scaleFactor); }
public boolean isSitting() { return wrapperContained.isSitting(); }
public boolean isChangingPose() { return wrapperContained.isChangingPose(); }
public void startSitting() { wrapperContained.startSitting(); }
public void startStanding() { wrapperContained.startStanding(); }
public void setStanding() { wrapperContained.setStanding(); }
public long getLastPoseTickDelta() { return wrapperContained.getLastPoseTickDelta(); }
// public void updateAnimations() { wrapperContained.updateAnimations(); }
public boolean isStationary() { return wrapperContained.isStationary(); }
public Object createCamelAttributes() { return wrapperContained.createCamelAttributes(); }
public boolean isDashing() { return wrapperContained.isDashing(); }
public void setDashing(boolean dashing) { wrapperContained.setDashing(dashing); }
// public boolean shouldPlaySittingTransitionAnimation() { return wrapperContained.shouldPlaySittingTransitionAnimation(); }
// public void initLastPoseTick(long time) { wrapperContained.initLastPoseTick(time); }
public boolean shouldUpdateSittingAnimations() { return wrapperContained.shouldUpdateSittingAnimations(); }
public boolean canChangePose() { return wrapperContained.canChangePose(); }

}