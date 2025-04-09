package yarnwrap.entity.mob;
public class EvokerFangsEntity { public net.minecraft.entity.mob.EvokerFangsEntity wrapperContained; public EvokerFangsEntity(net.minecraft.entity.mob.EvokerFangsEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.LivingEntity owner() { return new yarnwrap.entity.LivingEntity(wrapperContained.owner); }
// public java.util.UUID ownerUuid() { return wrapperContained.ownerUuid; }
// public int ticksLeft() { return wrapperContained.ticksLeft; }
// public boolean playingAnimation() { return wrapperContained.playingAnimation; }
// public int warmup() { return wrapperContained.warmup; }
// public boolean startedAttack() { return wrapperContained.startedAttack; }
// public void damage(yarnwrap.entity.LivingEntity target) { wrapperContained.damage(target.wrapperContained); }
public float getAnimationProgress(float tickDelta) { return wrapperContained.getAnimationProgress(tickDelta); }
public void setOwner(yarnwrap.entity.LivingEntity owner) { wrapperContained.setOwner(owner.wrapperContained); }

}