package yarnwrap.entity.mob;
public class EvokerFangsEntity { public net.minecraft.entity.mob.EvokerFangsEntity wrapperContained; public EvokerFangsEntity(net.minecraft.entity.mob.EvokerFangsEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.LivingEntity owner() { return new yarnwrap.entity.LivingEntity(wrapperContained.owner); }
// public void owner(yarnwrap.entity.LivingEntity value) { wrapperContained.owner = value.wrapperContained; }
// public java.util.UUID ownerUuid() { return wrapperContained.ownerUuid; }
// public void ownerUuid(java.util.UUID value) { wrapperContained.ownerUuid = value; }
// public int ticksLeft() { return wrapperContained.ticksLeft; }
// public void ticksLeft(int value) { wrapperContained.ticksLeft = value; }
// public boolean playingAnimation() { return wrapperContained.playingAnimation; }
// public void playingAnimation(boolean value) { wrapperContained.playingAnimation = value; }
// public int warmup() { return wrapperContained.warmup; }
// public void warmup(int value) { wrapperContained.warmup = value; }
// public boolean startedAttack() { return wrapperContained.startedAttack; }
// public void startedAttack(boolean value) { wrapperContained.startedAttack = value; }
// public void damage(yarnwrap.entity.LivingEntity target) { wrapperContained.damage(target.wrapperContained); }
public float getAnimationProgress(float tickDelta) { return wrapperContained.getAnimationProgress(tickDelta); }
public void setOwner(yarnwrap.entity.LivingEntity owner) { wrapperContained.setOwner(owner.wrapperContained); }

}