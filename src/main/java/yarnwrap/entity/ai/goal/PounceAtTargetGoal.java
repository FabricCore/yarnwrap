package yarnwrap.entity.ai.goal;
public class PounceAtTargetGoal { public net.minecraft.entity.ai.goal.PounceAtTargetGoal wrapperContained; public PounceAtTargetGoal(net.minecraft.entity.ai.goal.PounceAtTargetGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public float velocity() { return wrapperContained.velocity; }
// public void velocity(float value) { wrapperContained.velocity = value; }
// public static float velocity() { return net.minecraft.entity.ai.goal.PounceAtTargetGoal.velocity; }
// public static void velocity(float value, ) { net.minecraft.entity.ai.goal.PounceAtTargetGoal.velocity = value; }

// public yarnwrap.entity.mob.MobEntity mob() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.MobEntity value) { wrapperContained.mob = value.wrapperContained; }
// public static yarnwrap.entity.mob.MobEntity mob() { return new yarnwrap.entity.mob.MobEntity(net.minecraft.entity.ai.goal.PounceAtTargetGoal.mob); }
// public static void mob(yarnwrap.entity.mob.MobEntity value, ) { net.minecraft.entity.ai.goal.PounceAtTargetGoal.mob = value.wrapperContained; }

// public yarnwrap.entity.LivingEntity target() { return new yarnwrap.entity.LivingEntity(wrapperContained.target); }
// public void target(yarnwrap.entity.LivingEntity value) { wrapperContained.target = value.wrapperContained; }
// public static yarnwrap.entity.LivingEntity target() { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.ai.goal.PounceAtTargetGoal.target); }
// public static void target(yarnwrap.entity.LivingEntity value, ) { net.minecraft.entity.ai.goal.PounceAtTargetGoal.target = value.wrapperContained; }

public PounceAtTargetGoal(yarnwrap.entity.mob.MobEntity mob,float velocity) { this.wrapperContained = new net.minecraft.entity.ai.goal.PounceAtTargetGoal(mob.wrapperContained,velocity); }

}