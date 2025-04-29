package yarnwrap.entity.ai.goal;
public class CreeperIgniteGoal { public net.minecraft.entity.ai.goal.CreeperIgniteGoal wrapperContained; public CreeperIgniteGoal(net.minecraft.entity.ai.goal.CreeperIgniteGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.mob.CreeperEntity creeper() { return new yarnwrap.entity.mob.CreeperEntity(wrapperContained.creeper); }
// public void creeper(yarnwrap.entity.mob.CreeperEntity value) { wrapperContained.creeper = value.wrapperContained; }
// public static yarnwrap.entity.mob.CreeperEntity creeper() { return new yarnwrap.entity.mob.CreeperEntity(net.minecraft.entity.ai.goal.CreeperIgniteGoal.creeper); }
// public static void creeper(yarnwrap.entity.mob.CreeperEntity value, ) { net.minecraft.entity.ai.goal.CreeperIgniteGoal.creeper = value.wrapperContained; }

// public yarnwrap.entity.LivingEntity target() { return new yarnwrap.entity.LivingEntity(wrapperContained.target); }
// public void target(yarnwrap.entity.LivingEntity value) { wrapperContained.target = value.wrapperContained; }
// public static yarnwrap.entity.LivingEntity target() { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.ai.goal.CreeperIgniteGoal.target); }
// public static void target(yarnwrap.entity.LivingEntity value, ) { net.minecraft.entity.ai.goal.CreeperIgniteGoal.target = value.wrapperContained; }

public CreeperIgniteGoal(yarnwrap.entity.mob.CreeperEntity creeper) { this.wrapperContained = new net.minecraft.entity.ai.goal.CreeperIgniteGoal(creeper.wrapperContained); }

}