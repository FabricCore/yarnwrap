package yarnwrap.entity.mob;
public class CreakingEntity { public net.minecraft.entity.mob.CreakingEntity wrapperContained; public CreakingEntity(net.minecraft.entity.mob.CreakingEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.AnimationState attackAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.attackAnimationState); }
// public void attackAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.attackAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState attackAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.entity.mob.CreakingEntity.attackAnimationState); }
// public static void attackAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.entity.mob.CreakingEntity.attackAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState invulnerableAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.invulnerableAnimationState); }
// public void invulnerableAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.invulnerableAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState invulnerableAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.entity.mob.CreakingEntity.invulnerableAnimationState); }
// public static void invulnerableAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.entity.mob.CreakingEntity.invulnerableAnimationState = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData UNROOTED() { return new yarnwrap.entity.data.TrackedData(wrapperContained.UNROOTED); }
// public void UNROOTED(yarnwrap.entity.data.TrackedData value) { wrapperContained.UNROOTED = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData UNROOTED() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.mob.CreakingEntity.UNROOTED); }
// public static void UNROOTED(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.mob.CreakingEntity.UNROOTED = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData ACTIVE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ACTIVE); }
// public void ACTIVE(yarnwrap.entity.data.TrackedData value) { wrapperContained.ACTIVE = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData ACTIVE() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.mob.CreakingEntity.ACTIVE); }
// public static void ACTIVE(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.mob.CreakingEntity.ACTIVE = value.wrapperContained; }

// public float ATTACK_DAMAGE() { return wrapperContained.ATTACK_DAMAGE; }
// public void ATTACK_DAMAGE(float value) { wrapperContained.ATTACK_DAMAGE = value; }
// public static float ATTACK_DAMAGE() { return net.minecraft.entity.mob.CreakingEntity.ATTACK_DAMAGE; }
// public static void ATTACK_DAMAGE(float value, ) { net.minecraft.entity.mob.CreakingEntity.ATTACK_DAMAGE = value; }

// public int attackAnimationTimer() { return wrapperContained.attackAnimationTimer; }
// public void attackAnimationTimer(int value) { wrapperContained.attackAnimationTimer = value; }
// public static int attackAnimationTimer() { return net.minecraft.entity.mob.CreakingEntity.attackAnimationTimer; }
// public static void attackAnimationTimer(int value, ) { net.minecraft.entity.mob.CreakingEntity.attackAnimationTimer = value; }

public yarnwrap.entity.AnimationState crumblingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.crumblingAnimationState); }
// public void crumblingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.crumblingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState crumblingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.entity.mob.CreakingEntity.crumblingAnimationState); }
// public static void crumblingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.entity.mob.CreakingEntity.crumblingAnimationState = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData CRUMBLING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CRUMBLING); }
// public void CRUMBLING(yarnwrap.entity.data.TrackedData value) { wrapperContained.CRUMBLING = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData CRUMBLING() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.mob.CreakingEntity.CRUMBLING); }
// public static void CRUMBLING(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.mob.CreakingEntity.CRUMBLING = value.wrapperContained; }

// public int invulnerableAnimationTimer() { return wrapperContained.invulnerableAnimationTimer; }
// public void invulnerableAnimationTimer(int value) { wrapperContained.invulnerableAnimationTimer = value; }
// public static int invulnerableAnimationTimer() { return net.minecraft.entity.mob.CreakingEntity.invulnerableAnimationTimer; }
// public static void invulnerableAnimationTimer(int value, ) { net.minecraft.entity.mob.CreakingEntity.invulnerableAnimationTimer = value; }

// public boolean glowingEyesWhileCrumbling() { return wrapperContained.glowingEyesWhileCrumbling; }
// public void glowingEyesWhileCrumbling(boolean value) { wrapperContained.glowingEyesWhileCrumbling = value; }
// public static boolean glowingEyesWhileCrumbling() { return net.minecraft.entity.mob.CreakingEntity.glowingEyesWhileCrumbling; }
// public static void glowingEyesWhileCrumbling(boolean value, ) { net.minecraft.entity.mob.CreakingEntity.glowingEyesWhileCrumbling = value; }

// public int nextEyeFlickerTime() { return wrapperContained.nextEyeFlickerTime; }
// public void nextEyeFlickerTime(int value) { wrapperContained.nextEyeFlickerTime = value; }
// public static int nextEyeFlickerTime() { return net.minecraft.entity.mob.CreakingEntity.nextEyeFlickerTime; }
// public static void nextEyeFlickerTime(int value, ) { net.minecraft.entity.mob.CreakingEntity.nextEyeFlickerTime = value; }

// public int playerIntersectionTimer() { return wrapperContained.playerIntersectionTimer; }
// public void playerIntersectionTimer(int value) { wrapperContained.playerIntersectionTimer = value; }
// public static int playerIntersectionTimer() { return net.minecraft.entity.mob.CreakingEntity.playerIntersectionTimer; }
// public static void playerIntersectionTimer(int value, ) { net.minecraft.entity.mob.CreakingEntity.playerIntersectionTimer = value; }

// public yarnwrap.entity.data.TrackedData HOME_POS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.HOME_POS); }
// public void HOME_POS(yarnwrap.entity.data.TrackedData value) { wrapperContained.HOME_POS = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData HOME_POS() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.mob.CreakingEntity.HOME_POS); }
// public static void HOME_POS(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.mob.CreakingEntity.HOME_POS = value.wrapperContained; }

// public void tickAttackAnimation() { wrapperContained.tickAttackAnimation(); }
// public static void tickAttackAnimation() { net.minecraft.entity.mob.CreakingEntity.tickAttackAnimation(); }
// public Object createCreakingAttributes() { return wrapperContained.createCreakingAttributes(); }
public static Object createCreakingAttributes() { return net.minecraft.entity.mob.CreakingEntity.createCreakingAttributes(); }
public boolean isUnrooted() { return wrapperContained.isUnrooted(); }
// public static boolean isUnrooted() { return net.minecraft.entity.mob.CreakingEntity.isUnrooted(); }
public boolean shouldBeUnrooted() { return wrapperContained.shouldBeUnrooted(); }
// public static boolean shouldBeUnrooted() { return net.minecraft.entity.mob.CreakingEntity.shouldBeUnrooted(); }
public boolean isActive() { return wrapperContained.isActive(); }
// public static boolean isActive() { return net.minecraft.entity.mob.CreakingEntity.isActive(); }
public void setActive(boolean active) { wrapperContained.setActive(active); }
// public static void setActive(boolean active, ) { net.minecraft.entity.mob.CreakingEntity.setActive(active); }
public void activate(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.activate(player.wrapperContained); }
// public static void activate(yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.entity.mob.CreakingEntity.activate(player.wrapperContained); }
public void deactivate() { wrapperContained.deactivate(); }
// public static void deactivate() { net.minecraft.entity.mob.CreakingEntity.deactivate(); }
public boolean isStuckWithPlayer() { return wrapperContained.isStuckWithPlayer(); }
// public static boolean isStuckWithPlayer() { return net.minecraft.entity.mob.CreakingEntity.isStuckWithPlayer(); }
public void setCrumbling() { wrapperContained.setCrumbling(); }
// public static void setCrumbling() { net.minecraft.entity.mob.CreakingEntity.setCrumbling(); }
public boolean isCrumbling() { return wrapperContained.isCrumbling(); }
// public static boolean isCrumbling() { return net.minecraft.entity.mob.CreakingEntity.isCrumbling(); }
public boolean hasGlowingEyesWhileCrumbling() { return wrapperContained.hasGlowingEyesWhileCrumbling(); }
// public static boolean hasGlowingEyesWhileCrumbling() { return net.minecraft.entity.mob.CreakingEntity.hasGlowingEyesWhileCrumbling(); }
public void updateCrumblingEyeFlicker() { wrapperContained.updateCrumblingEyeFlicker(); }
// public static void updateCrumblingEyeFlicker() { net.minecraft.entity.mob.CreakingEntity.updateCrumblingEyeFlicker(); }
public void initHomePos(yarnwrap.util.math.BlockPos homePos) { wrapperContained.initHomePos(homePos.wrapperContained); }
// public static void initHomePos(yarnwrap.util.math.BlockPos homePos, ) { net.minecraft.entity.mob.CreakingEntity.initHomePos(homePos.wrapperContained); }
public yarnwrap.entity.player.PlayerEntity becomeAngryAndGetPlayer(yarnwrap.entity.damage.DamageSource damageSource) { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.becomeAngryAndGetPlayer(damageSource.wrapperContained)); }
// public static yarnwrap.entity.player.PlayerEntity becomeAngryAndGetPlayer(yarnwrap.entity.damage.DamageSource damageSource, ) { return new yarnwrap.entity.player.PlayerEntity(net.minecraft.entity.mob.CreakingEntity.becomeAngryAndGetPlayer(damageSource.wrapperContained)); }
public void killFromHeart(yarnwrap.entity.damage.DamageSource damageSource) { wrapperContained.killFromHeart(damageSource.wrapperContained); }
// public static void killFromHeart(yarnwrap.entity.damage.DamageSource damageSource, ) { net.minecraft.entity.mob.CreakingEntity.killFromHeart(damageSource.wrapperContained); }
public void finishCrumbling() { wrapperContained.finishCrumbling(); }
// public static void finishCrumbling() { net.minecraft.entity.mob.CreakingEntity.finishCrumbling(); }
public yarnwrap.util.math.BlockPos getHomePos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getHomePos()); }
// public static yarnwrap.util.math.BlockPos getHomePos() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.mob.CreakingEntity.getHomePos()); }
public void setHomePos(yarnwrap.util.math.BlockPos pos) { wrapperContained.setHomePos(pos.wrapperContained); }
// public static void setHomePos(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.entity.mob.CreakingEntity.setHomePos(pos.wrapperContained); }
public boolean isTransient() { return wrapperContained.isTransient(); }
// public static boolean isTransient() { return net.minecraft.entity.mob.CreakingEntity.isTransient(); }

}