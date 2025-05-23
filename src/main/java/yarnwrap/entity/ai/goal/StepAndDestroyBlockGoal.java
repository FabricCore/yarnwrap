package yarnwrap.entity.ai.goal;
public class StepAndDestroyBlockGoal { public net.minecraft.entity.ai.goal.StepAndDestroyBlockGoal wrapperContained; public StepAndDestroyBlockGoal(net.minecraft.entity.ai.goal.StepAndDestroyBlockGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block targetBlock() { return new yarnwrap.block.Block(wrapperContained.targetBlock); }
// public void targetBlock(yarnwrap.block.Block value) { wrapperContained.targetBlock = value.wrapperContained; }
// public static yarnwrap.block.Block targetBlock() { return new yarnwrap.block.Block(net.minecraft.entity.ai.goal.StepAndDestroyBlockGoal.targetBlock); }
// public static void targetBlock(yarnwrap.block.Block value, ) { net.minecraft.entity.ai.goal.StepAndDestroyBlockGoal.targetBlock = value.wrapperContained; }

// public int counter() { return wrapperContained.counter; }
// public void counter(int value) { wrapperContained.counter = value; }
// public static int counter() { return net.minecraft.entity.ai.goal.StepAndDestroyBlockGoal.counter; }
// public static void counter(int value, ) { net.minecraft.entity.ai.goal.StepAndDestroyBlockGoal.counter = value; }

// public yarnwrap.entity.mob.MobEntity stepAndDestroyMob() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.stepAndDestroyMob); }
// public void stepAndDestroyMob(yarnwrap.entity.mob.MobEntity value) { wrapperContained.stepAndDestroyMob = value.wrapperContained; }
// public static yarnwrap.entity.mob.MobEntity stepAndDestroyMob() { return new yarnwrap.entity.mob.MobEntity(net.minecraft.entity.ai.goal.StepAndDestroyBlockGoal.stepAndDestroyMob); }
// public static void stepAndDestroyMob(yarnwrap.entity.mob.MobEntity value, ) { net.minecraft.entity.ai.goal.StepAndDestroyBlockGoal.stepAndDestroyMob = value.wrapperContained; }

// public int MAX_COOLDOWN() { return wrapperContained.MAX_COOLDOWN; }
// public void MAX_COOLDOWN(int value) { wrapperContained.MAX_COOLDOWN = value; }
// public static int MAX_COOLDOWN() { return net.minecraft.entity.ai.goal.StepAndDestroyBlockGoal.MAX_COOLDOWN; }
// public static void MAX_COOLDOWN(int value, ) { net.minecraft.entity.ai.goal.StepAndDestroyBlockGoal.MAX_COOLDOWN = value; }

public StepAndDestroyBlockGoal(yarnwrap.block.Block targetBlock,yarnwrap.entity.mob.PathAwareEntity mob,double speed,int maxYDifference) { this.wrapperContained = new net.minecraft.entity.ai.goal.StepAndDestroyBlockGoal(targetBlock.wrapperContained,mob.wrapperContained,speed,maxYDifference); }
public void tickStepping(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { wrapperContained.tickStepping(world.wrapperContained,pos.wrapperContained); }
// public static void tickStepping(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.entity.ai.goal.StepAndDestroyBlockGoal.tickStepping(world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.util.math.BlockPos tweakToProperPos(yarnwrap.util.math.BlockPos pos,yarnwrap.world.BlockView world) { return new yarnwrap.util.math.BlockPos(wrapperContained.tweakToProperPos(pos.wrapperContained,world.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos tweakToProperPos(yarnwrap.util.math.BlockPos pos,yarnwrap.world.BlockView world, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.ai.goal.StepAndDestroyBlockGoal.tweakToProperPos(pos.wrapperContained,world.wrapperContained)); }
public void onDestroyBlock(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.onDestroyBlock(world.wrapperContained,pos.wrapperContained); }
// public static void onDestroyBlock(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.entity.ai.goal.StepAndDestroyBlockGoal.onDestroyBlock(world.wrapperContained,pos.wrapperContained); }

}