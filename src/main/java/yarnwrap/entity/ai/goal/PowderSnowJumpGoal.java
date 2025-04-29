package yarnwrap.entity.ai.goal;
public class PowderSnowJumpGoal { public net.minecraft.entity.ai.goal.PowderSnowJumpGoal wrapperContained; public PowderSnowJumpGoal(net.minecraft.entity.ai.goal.PowderSnowJumpGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.mob.MobEntity entity() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.mob.MobEntity value) { wrapperContained.entity = value.wrapperContained; }
// public static yarnwrap.entity.mob.MobEntity entity() { return new yarnwrap.entity.mob.MobEntity(net.minecraft.entity.ai.goal.PowderSnowJumpGoal.entity); }
// public static void entity(yarnwrap.entity.mob.MobEntity value, ) { net.minecraft.entity.ai.goal.PowderSnowJumpGoal.entity = value.wrapperContained; }

// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.World world() { return new yarnwrap.world.World(net.minecraft.entity.ai.goal.PowderSnowJumpGoal.world); }
// public static void world(yarnwrap.world.World value, ) { net.minecraft.entity.ai.goal.PowderSnowJumpGoal.world = value.wrapperContained; }

public PowderSnowJumpGoal(yarnwrap.entity.mob.MobEntity entity,yarnwrap.world.World world) { this.wrapperContained = new net.minecraft.entity.ai.goal.PowderSnowJumpGoal(entity.wrapperContained,world.wrapperContained); }

}