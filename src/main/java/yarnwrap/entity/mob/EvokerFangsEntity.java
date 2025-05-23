package yarnwrap.entity.mob;
public class EvokerFangsEntity { public net.minecraft.entity.mob.EvokerFangsEntity wrapperContained; public EvokerFangsEntity(net.minecraft.entity.mob.EvokerFangsEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// // public yarnwrap.entity.LazyEntityReference owner() { return new yarnwrap.entity.LazyEntityReference(wrapperContained.owner); }
// // public void owner(yarnwrap.entity.LazyEntityReference value) { wrapperContained.owner = value.wrapperContained; }
// // public static yarnwrap.entity.LazyEntityReference owner() { return new yarnwrap.entity.LazyEntityReference(net.minecraft.entity.mob.EvokerFangsEntity.owner); }
// // public static void owner(yarnwrap.entity.LazyEntityReference value, ) { net.minecraft.entity.mob.EvokerFangsEntity.owner = value.wrapperContained; }

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

// public int DEFAULT_WARMUP() { return wrapperContained.DEFAULT_WARMUP; }
// public void DEFAULT_WARMUP(int value) { wrapperContained.DEFAULT_WARMUP = value; }
// public static int DEFAULT_WARMUP() { return net.minecraft.entity.mob.EvokerFangsEntity.DEFAULT_WARMUP; }
// public static void DEFAULT_WARMUP(int value, ) { net.minecraft.entity.mob.EvokerFangsEntity.DEFAULT_WARMUP = value; }

public EvokerFangsEntity(yarnwrap.world.World world,double x,double y,double z,float yaw,int warmup,yarnwrap.entity.LivingEntity owner) { this.wrapperContained = new net.minecraft.entity.mob.EvokerFangsEntity(world.wrapperContained,x,y,z,yaw,warmup,owner.wrapperContained); }
// public void damage(yarnwrap.entity.LivingEntity target) { wrapperContained.damage(target.wrapperContained); }
// public static void damage(yarnwrap.entity.LivingEntity target, ) { net.minecraft.entity.mob.EvokerFangsEntity.damage(target.wrapperContained); }
public float getAnimationProgress(float tickProgress) { return wrapperContained.getAnimationProgress(tickProgress); }
// public static float getAnimationProgress(float tickProgress, ) { return net.minecraft.entity.mob.EvokerFangsEntity.getAnimationProgress(tickProgress); }
public void setOwner(yarnwrap.entity.LivingEntity owner) { wrapperContained.setOwner(owner.wrapperContained); }
// public static void setOwner(yarnwrap.entity.LivingEntity owner, ) { net.minecraft.entity.mob.EvokerFangsEntity.setOwner(owner.wrapperContained); }

}