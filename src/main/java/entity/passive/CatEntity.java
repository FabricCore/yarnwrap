package yarnwrap.entity.passive;
public class CatEntity { public net.minecraft.entity.passive.CatEntity wrapperContained; public CatEntity(net.minecraft.entity.passive.CatEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData IN_SLEEPING_POSE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.IN_SLEEPING_POSE); }
// public yarnwrap.entity.data.TrackedData COLLAR_COLOR() { return new yarnwrap.entity.data.TrackedData(wrapperContained.COLLAR_COLOR); }
// public float headDownAnimation() { return wrapperContained.headDownAnimation; }
// public float prevHeadDownAnimation() { return wrapperContained.prevHeadDownAnimation; }
// public float tailCurlAnimation() { return wrapperContained.tailCurlAnimation; }
// public float prevTailCurlAnimation() { return wrapperContained.prevTailCurlAnimation; }
// public float sleepAnimation() { return wrapperContained.sleepAnimation; }
// public float prevSleepAnimation() { return wrapperContained.prevSleepAnimation; }
// public yarnwrap.entity.data.TrackedData HEAD_DOWN() { return new yarnwrap.entity.data.TrackedData(wrapperContained.HEAD_DOWN); }
public double CROUCHING_SPEED() { return wrapperContained.CROUCHING_SPEED; }
public double NORMAL_SPEED() { return wrapperContained.NORMAL_SPEED; }
public double SPRINTING_SPEED() { return wrapperContained.SPRINTING_SPEED; }
// public yarnwrap.registry.RegistryKey DEFAULT_VARIANT() { return new yarnwrap.registry.RegistryKey(wrapperContained.DEFAULT_VARIANT); }
// public Object fleeGoal() { return wrapperContained.fleeGoal; }
// public yarnwrap.entity.ai.goal.TemptGoal temptGoal() { return new yarnwrap.entity.ai.goal.TemptGoal(wrapperContained.temptGoal); }
// public yarnwrap.entity.data.TrackedData CAT_VARIANT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CAT_VARIANT); }
public float getSleepAnimation(float tickDelta) { return wrapperContained.getSleepAnimation(tickDelta); }
// public void updateHeadDownAnimation() { wrapperContained.updateHeadDownAnimation(); }
// public void updateAnimations() { wrapperContained.updateAnimations(); }
public boolean isInSleepingPose() { return wrapperContained.isInSleepingPose(); }
// public void setHeadDown(boolean headDown) { wrapperContained.setHeadDown(headDown); }
public void setInSleepingPose(boolean sleeping) { wrapperContained.setInSleepingPose(sleeping); }
public void hiss() { wrapperContained.hiss(); }
// public void updateSleepAnimation() { wrapperContained.updateSleepAnimation(); }
public float getTailCurlAnimation(float tickDelta) { return wrapperContained.getTailCurlAnimation(tickDelta); }
public yarnwrap.util.Identifier getTexture() { return new yarnwrap.util.Identifier(wrapperContained.getTexture()); }
// public boolean isHeadDown() { return wrapperContained.isHeadDown(); }
// public void setCollarColor(yarnwrap.util.DyeColor color) { wrapperContained.setCollarColor(color.wrapperContained); }
public float getHeadDownAnimation(float tickDelta) { return wrapperContained.getHeadDownAnimation(tickDelta); }
public yarnwrap.util.DyeColor getCollarColor() { return new yarnwrap.util.DyeColor(wrapperContained.getCollarColor()); }
public Object createCatAttributes() { return wrapperContained.createCatAttributes(); }
// public void tryTame(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.tryTame(player.wrapperContained); }
// public void onTamedChanged() { wrapperContained.onTamedChanged(); }

}