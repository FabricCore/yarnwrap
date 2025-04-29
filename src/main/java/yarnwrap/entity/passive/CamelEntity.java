package yarnwrap.entity.passive;
public class CamelEntity { public net.minecraft.entity.passive.CamelEntity wrapperContained; public CamelEntity(net.minecraft.entity.passive.CamelEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EntityDimensions SITTING_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.SITTING_DIMENSIONS); }
// public void SITTING_DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.SITTING_DIMENSIONS = value.wrapperContained; }
// public static yarnwrap.entity.EntityDimensions SITTING_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(net.minecraft.entity.passive.CamelEntity.SITTING_DIMENSIONS); }
// public static void SITTING_DIMENSIONS(yarnwrap.entity.EntityDimensions value, ) { net.minecraft.entity.passive.CamelEntity.SITTING_DIMENSIONS = value.wrapperContained; }

// public int dashCooldown() { return wrapperContained.dashCooldown; }
// public void dashCooldown(int value) { wrapperContained.dashCooldown = value; }
// public static int dashCooldown() { return net.minecraft.entity.passive.CamelEntity.dashCooldown; }
// public static void dashCooldown(int value, ) { net.minecraft.entity.passive.CamelEntity.dashCooldown = value; }

// public int idleAnimationCooldown() { return wrapperContained.idleAnimationCooldown; }
// public void idleAnimationCooldown(int value) { wrapperContained.idleAnimationCooldown = value; }
// public static int idleAnimationCooldown() { return net.minecraft.entity.passive.CamelEntity.idleAnimationCooldown; }
// public static void idleAnimationCooldown(int value, ) { net.minecraft.entity.passive.CamelEntity.idleAnimationCooldown = value; }

// public yarnwrap.entity.data.TrackedData DASHING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.DASHING); }
// public void DASHING(yarnwrap.entity.data.TrackedData value) { wrapperContained.DASHING = value.wrapperContained; }
public static yarnwrap.entity.data.TrackedData DASHING() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.CamelEntity.DASHING); }
// public static void DASHING(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.CamelEntity.DASHING = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData LAST_POSE_TICK() { return new yarnwrap.entity.data.TrackedData(wrapperContained.LAST_POSE_TICK); }
// public void LAST_POSE_TICK(yarnwrap.entity.data.TrackedData value) { wrapperContained.LAST_POSE_TICK = value.wrapperContained; }
public static yarnwrap.entity.data.TrackedData LAST_POSE_TICK() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.CamelEntity.LAST_POSE_TICK); }
// public static void LAST_POSE_TICK(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.CamelEntity.LAST_POSE_TICK = value.wrapperContained; }

public yarnwrap.entity.AnimationState sittingTransitionAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.sittingTransitionAnimationState); }
// public void sittingTransitionAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.sittingTransitionAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState sittingTransitionAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.entity.passive.CamelEntity.sittingTransitionAnimationState); }
// public static void sittingTransitionAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.entity.passive.CamelEntity.sittingTransitionAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState standingTransitionAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.standingTransitionAnimationState); }
// public void standingTransitionAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.standingTransitionAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState standingTransitionAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.entity.passive.CamelEntity.standingTransitionAnimationState); }
// public static void standingTransitionAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.entity.passive.CamelEntity.standingTransitionAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState idlingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.idlingAnimationState); }
// public void idlingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.idlingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState idlingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.entity.passive.CamelEntity.idlingAnimationState); }
// public static void idlingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.entity.passive.CamelEntity.idlingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState dashingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.dashingAnimationState); }
// public void dashingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.dashingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState dashingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.entity.passive.CamelEntity.dashingAnimationState); }
// public static void dashingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.entity.passive.CamelEntity.dashingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState sittingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.sittingAnimationState); }
// public void sittingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.sittingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState sittingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.entity.passive.CamelEntity.sittingAnimationState); }
// public static void sittingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.entity.passive.CamelEntity.sittingAnimationState = value.wrapperContained; }

public void setLastPoseTick(long lastPoseTick) { wrapperContained.setLastPoseTick(lastPoseTick); }
// public static void setLastPoseTick(long lastPoseTick, ) { net.minecraft.entity.passive.CamelEntity.setLastPoseTick(lastPoseTick); }
// public double getPassengerAttachmentY(boolean primaryPassenger,float tickDelta,yarnwrap.entity.EntityDimensions dimensions,float scaleFactor) { return wrapperContained.getPassengerAttachmentY(primaryPassenger,tickDelta,dimensions.wrapperContained,scaleFactor); }
// public static double getPassengerAttachmentY(boolean primaryPassenger,float tickDelta,yarnwrap.entity.EntityDimensions dimensions,float scaleFactor, ) { return net.minecraft.entity.passive.CamelEntity.getPassengerAttachmentY(primaryPassenger,tickDelta,dimensions.wrapperContained,scaleFactor); }
public boolean isSitting() { return wrapperContained.isSitting(); }
// public static boolean isSitting() { return net.minecraft.entity.passive.CamelEntity.isSitting(); }
public boolean isChangingPose() { return wrapperContained.isChangingPose(); }
// public static boolean isChangingPose() { return net.minecraft.entity.passive.CamelEntity.isChangingPose(); }
public void startSitting() { wrapperContained.startSitting(); }
// public static void startSitting() { net.minecraft.entity.passive.CamelEntity.startSitting(); }
public void startStanding() { wrapperContained.startStanding(); }
// public static void startStanding() { net.minecraft.entity.passive.CamelEntity.startStanding(); }
public void setStanding() { wrapperContained.setStanding(); }
// public static void setStanding() { net.minecraft.entity.passive.CamelEntity.setStanding(); }
public long getLastPoseTickDelta() { return wrapperContained.getLastPoseTickDelta(); }
// public static long getLastPoseTickDelta() { return net.minecraft.entity.passive.CamelEntity.getLastPoseTickDelta(); }
// public void updateAnimations() { wrapperContained.updateAnimations(); }
// public static void updateAnimations() { net.minecraft.entity.passive.CamelEntity.updateAnimations(); }
public boolean isStationary() { return wrapperContained.isStationary(); }
// public static boolean isStationary() { return net.minecraft.entity.passive.CamelEntity.isStationary(); }
// public Object createCamelAttributes() { return wrapperContained.createCamelAttributes(); }
public static Object createCamelAttributes() { return net.minecraft.entity.passive.CamelEntity.createCamelAttributes(); }
public boolean isDashing() { return wrapperContained.isDashing(); }
// public static boolean isDashing() { return net.minecraft.entity.passive.CamelEntity.isDashing(); }
public void setDashing(boolean dashing) { wrapperContained.setDashing(dashing); }
// public static void setDashing(boolean dashing, ) { net.minecraft.entity.passive.CamelEntity.setDashing(dashing); }
// public boolean shouldPlaySittingTransitionAnimation() { return wrapperContained.shouldPlaySittingTransitionAnimation(); }
// public static boolean shouldPlaySittingTransitionAnimation() { return net.minecraft.entity.passive.CamelEntity.shouldPlaySittingTransitionAnimation(); }
// public void initLastPoseTick(long time) { wrapperContained.initLastPoseTick(time); }
// public static void initLastPoseTick(long time, ) { net.minecraft.entity.passive.CamelEntity.initLastPoseTick(time); }
public boolean shouldUpdateSittingAnimations() { return wrapperContained.shouldUpdateSittingAnimations(); }
// public static boolean shouldUpdateSittingAnimations() { return net.minecraft.entity.passive.CamelEntity.shouldUpdateSittingAnimations(); }
public boolean canChangePose() { return wrapperContained.canChangePose(); }
// public static boolean canChangePose() { return net.minecraft.entity.passive.CamelEntity.canChangePose(); }

}