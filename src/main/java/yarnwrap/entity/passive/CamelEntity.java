package yarnwrap.entity.passive;
public class CamelEntity { public net.minecraft.entity.passive.CamelEntity wrapperContained; public CamelEntity(net.minecraft.entity.passive.CamelEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EntityDimensions SITTING_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.SITTING_DIMENSIONS); }
// public void SITTING_DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.SITTING_DIMENSIONS = value.wrapperContained; }
// public int dashCooldown() { return wrapperContained.dashCooldown; }
// public void dashCooldown(int value) { wrapperContained.dashCooldown = value; }
// public int idleAnimationCooldown() { return wrapperContained.idleAnimationCooldown; }
// public void idleAnimationCooldown(int value) { wrapperContained.idleAnimationCooldown = value; }
public yarnwrap.entity.data.TrackedData DASHING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.DASHING); }
// public void DASHING(yarnwrap.entity.data.TrackedData value) { wrapperContained.DASHING = value.wrapperContained; }
public yarnwrap.entity.data.TrackedData LAST_POSE_TICK() { return new yarnwrap.entity.data.TrackedData(wrapperContained.LAST_POSE_TICK); }
// public void LAST_POSE_TICK(yarnwrap.entity.data.TrackedData value) { wrapperContained.LAST_POSE_TICK = value.wrapperContained; }
public yarnwrap.entity.AnimationState sittingTransitionAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.sittingTransitionAnimationState); }
// public void sittingTransitionAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.sittingTransitionAnimationState = value.wrapperContained; }
public yarnwrap.entity.AnimationState standingTransitionAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.standingTransitionAnimationState); }
// public void standingTransitionAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.standingTransitionAnimationState = value.wrapperContained; }
public yarnwrap.entity.AnimationState idlingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.idlingAnimationState); }
// public void idlingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.idlingAnimationState = value.wrapperContained; }
public yarnwrap.entity.AnimationState dashingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.dashingAnimationState); }
// public void dashingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.dashingAnimationState = value.wrapperContained; }
public yarnwrap.entity.AnimationState sittingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.sittingAnimationState); }
// public void sittingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.sittingAnimationState = value.wrapperContained; }
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