package yarnwrap.entity.mob;
public class EvokerFangsEntity { public net.minecraft.entity.mob.EvokerFangsEntity wrapperContained; public EvokerFangsEntity(net.minecraft.entity.mob.EvokerFangsEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.LivingEntity owner() { return new yarnwrap.entity.LivingEntity(wrapperContained.owner); }
// public void owner(yarnwrap.entity.LivingEntity value) { wrapperContained.owner = value.wrapperContained; }
// public static yarnwrap.entity.LivingEntity owner() { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.mob.EvokerFangsEntity.owner); }
// public static void owner(yarnwrap.entity.LivingEntity value, ) { net.minecraft.entity.mob.EvokerFangsEntity.owner = value.wrapperContained; }

// public java.util.UUID ownerUuid() { return wrapperContained.ownerUuid; }
// public void ownerUuid(java.util.UUID value) { wrapperContained.ownerUuid = value; }
// public static java.util.UUID ownerUuid() { return net.minecraft.entity.mob.EvokerFangsEntity.ownerUuid; }
// public static void ownerUuid(java.util.UUID value, ) { net.minecraft.entity.mob.EvokerFangsEntity.ownerUuid = value; }

// public int ticksLeft() { return wrapperContained.ticksLeft; }
// public void ticksLeft(int value) { wrapperContained.ticksLeft = value; }
// public static int ticksLeft() { return net.minecraft.entity.mob.EvokerFangsEntity.ticksLeft; }
// public static void ticksLeft(int value, ) { net.minecraft.entity.mob.EvokerFangsEntity.ticksLeft = value; }

// public boolean playingAnimation() { return wrapperContained.playingAnimation; }
// public void playingAnimation(boolean value) { wrapperContained.playingAnimation = value; }
// public static boolean playingAnimation() { return net.minecraft.entity.mob.EvokerFangsEntity.playingAnimation; }
// public static void playingAnimation(boolean value, ) { net.minecraft.entity.mob.EvokerFangsEntity.playingAnimation = value; }

// public int warmup() { return wrapperContained.warmup; }
// public void warmup(int value) { wrapperContained.warmup = value; }
// public static int warmup() { return net.minecraft.entity.mob.EvokerFangsEntity.warmup; }
// public static void warmup(int value, ) { net.minecraft.entity.mob.EvokerFangsEntity.warmup = value; }

// public boolean startedAttack() { return wrapperContained.startedAttack; }
// public void startedAttack(boolean value) { wrapperContained.startedAttack = value; }
// public static boolean startedAttack() { return net.minecraft.entity.mob.EvokerFangsEntity.startedAttack; }
// public static void startedAttack(boolean value, ) { net.minecraft.entity.mob.EvokerFangsEntity.startedAttack = value; }

public EvokerFangsEntity(yarnwrap.world.World world,double x,double y,double z,float yaw,int warmup,yarnwrap.entity.LivingEntity owner) { this.wrapperContained = new net.minecraft.entity.mob.EvokerFangsEntity(world.wrapperContained,x,y,z,yaw,warmup,owner.wrapperContained); }
// public void damage(yarnwrap.entity.LivingEntity target) { wrapperContained.damage(target.wrapperContained); }
// public static void damage(yarnwrap.entity.LivingEntity target, ) { net.minecraft.entity.mob.EvokerFangsEntity.damage(target.wrapperContained); }
public float getAnimationProgress(float tickDelta) { return wrapperContained.getAnimationProgress(tickDelta); }
// public static float getAnimationProgress(float tickDelta, ) { return net.minecraft.entity.mob.EvokerFangsEntity.getAnimationProgress(tickDelta); }
public void setOwner(yarnwrap.entity.LivingEntity owner) { wrapperContained.setOwner(owner.wrapperContained); }
// public static void setOwner(yarnwrap.entity.LivingEntity owner, ) { net.minecraft.entity.mob.EvokerFangsEntity.setOwner(owner.wrapperContained); }

}