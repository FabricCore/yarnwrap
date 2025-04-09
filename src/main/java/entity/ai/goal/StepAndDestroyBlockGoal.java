package yarnwrap.entity.ai.goal;
public class StepAndDestroyBlockGoal { public net.minecraft.entity.ai.goal.StepAndDestroyBlockGoal wrapperContained; public StepAndDestroyBlockGoal(net.minecraft.entity.ai.goal.StepAndDestroyBlockGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_COOLDOWN() { return wrapperContained.MAX_COOLDOWN; }
// public yarnwrap.block.Block targetBlock() { return new yarnwrap.block.Block(wrapperContained.targetBlock); }
// public int counter() { return wrapperContained.counter; }
// public yarnwrap.entity.mob.MobEntity stepAndDestroyMob() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.stepAndDestroyMob); }
public void tickStepping(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { wrapperContained.tickStepping(world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.util.math.BlockPos tweakToProperPos(yarnwrap.util.math.BlockPos pos,yarnwrap.world.BlockView world) { return new yarnwrap.util.math.BlockPos(wrapperContained.tweakToProperPos(pos.wrapperContained,world.wrapperContained)); }
public void onDestroyBlock(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.onDestroyBlock(world.wrapperContained,pos.wrapperContained); }

}