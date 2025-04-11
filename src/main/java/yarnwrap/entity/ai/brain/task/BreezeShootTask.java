package yarnwrap.entity.ai.brain.task;
public class BreezeShootTask { public net.minecraft.entity.ai.brain.task.BreezeShootTask wrapperContained; public BreezeShootTask(net.minecraft.entity.ai.brain.task.BreezeShootTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MIN_SQUARED_RANGE() { return wrapperContained.MIN_SQUARED_RANGE; }
// public void MIN_SQUARED_RANGE(int value) { wrapperContained.MIN_SQUARED_RANGE = value; }
// public int MAX_SQUARED_RANGE() { return wrapperContained.MAX_SQUARED_RANGE; }
// public void MAX_SQUARED_RANGE(int value) { wrapperContained.MAX_SQUARED_RANGE = value; }
// public int BASE_PROJECTILE_DIVERGENCY() { return wrapperContained.BASE_PROJECTILE_DIVERGENCY; }
// public void BASE_PROJECTILE_DIVERGENCY(int value) { wrapperContained.BASE_PROJECTILE_DIVERGENCY = value; }
// public int PROJECTILE_DIVERGENCY_DIFFICULTY_MODIFIER() { return wrapperContained.PROJECTILE_DIVERGENCY_DIFFICULTY_MODIFIER; }
// public void PROJECTILE_DIVERGENCY_DIFFICULTY_MODIFIER(int value) { wrapperContained.PROJECTILE_DIVERGENCY_DIFFICULTY_MODIFIER = value; }
// public float PROJECTILE_SPEED() { return wrapperContained.PROJECTILE_SPEED; }
// public void PROJECTILE_SPEED(float value) { wrapperContained.PROJECTILE_SPEED = value; }
// public int SHOOT_CHARGING_EXPIRY() { return wrapperContained.SHOOT_CHARGING_EXPIRY; }
// public void SHOOT_CHARGING_EXPIRY(int value) { wrapperContained.SHOOT_CHARGING_EXPIRY = value; }
// public int RECOVER_EXPIRY() { return wrapperContained.RECOVER_EXPIRY; }
// public void RECOVER_EXPIRY(int value) { wrapperContained.RECOVER_EXPIRY = value; }
// public int SHOOT_COOLDOWN_EXPIRY() { return wrapperContained.SHOOT_COOLDOWN_EXPIRY; }
// public void SHOOT_COOLDOWN_EXPIRY(int value) { wrapperContained.SHOOT_COOLDOWN_EXPIRY = value; }
public boolean isFacingTarget(yarnwrap.entity.mob.BreezeEntity breeze,yarnwrap.entity.LivingEntity target) { return wrapperContained.isFacingTarget(breeze.wrapperContained,target.wrapperContained); }
// public java.lang.Boolean method_55039(yarnwrap.entity.mob.BreezeEntity withinRange) { return wrapperContained.method_55039(withinRange.wrapperContained); }
// public boolean isTargetWithinRange(yarnwrap.entity.mob.BreezeEntity breeze,yarnwrap.entity.LivingEntity target) { return wrapperContained.isTargetWithinRange(breeze.wrapperContained,target.wrapperContained); }
// public void method_55043(yarnwrap.entity.mob.BreezeEntity target) { wrapperContained.method_55043(target.wrapperContained); }
// public java.lang.Boolean method_55045(yarnwrap.entity.mob.BreezeEntity target) { return wrapperContained.method_55045(target.wrapperContained); }

}