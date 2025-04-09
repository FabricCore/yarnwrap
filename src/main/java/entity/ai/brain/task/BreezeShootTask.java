package yarnwrap.entity.ai.brain.task;
public class BreezeShootTask { public net.minecraft.entity.ai.brain.task.BreezeShootTask wrapperContained; public BreezeShootTask(net.minecraft.entity.ai.brain.task.BreezeShootTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MIN_SQUARED_RANGE() { return wrapperContained.MIN_SQUARED_RANGE; }
// public int MAX_SQUARED_RANGE() { return wrapperContained.MAX_SQUARED_RANGE; }
// public int BASE_PROJECTILE_DIVERGENCY() { return wrapperContained.BASE_PROJECTILE_DIVERGENCY; }
// public int PROJECTILE_DIVERGENCY_DIFFICULTY_MODIFIER() { return wrapperContained.PROJECTILE_DIVERGENCY_DIFFICULTY_MODIFIER; }
// public float PROJECTILE_SPEED() { return wrapperContained.PROJECTILE_SPEED; }
// public int SHOOT_CHARGING_EXPIRY() { return wrapperContained.SHOOT_CHARGING_EXPIRY; }
// public int RECOVER_EXPIRY() { return wrapperContained.RECOVER_EXPIRY; }
// public int SHOOT_COOLDOWN_EXPIRY() { return wrapperContained.SHOOT_COOLDOWN_EXPIRY; }
public boolean isFacingTarget(yarnwrap.entity.mob.BreezeEntity breeze,yarnwrap.entity.LivingEntity target) { return wrapperContained.isFacingTarget(breeze.wrapperContained,target.wrapperContained); }
// public boolean isTargetWithinRange(yarnwrap.entity.mob.BreezeEntity breeze,yarnwrap.entity.LivingEntity target) { return wrapperContained.isTargetWithinRange(breeze.wrapperContained,target.wrapperContained); }

}