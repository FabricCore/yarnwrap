package yarnwrap.entity.ai.brain.task;
public class FarmerVillagerTask { public net.minecraft.entity.ai.brain.task.FarmerVillagerTask wrapperContained; public FarmerVillagerTask(net.minecraft.entity.ai.brain.task.FarmerVillagerTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos currentTarget() { return new yarnwrap.util.math.BlockPos(wrapperContained.currentTarget); }
// public long nextResponseTime() { return wrapperContained.nextResponseTime; }
// public int ticksRan() { return wrapperContained.ticksRan; }
// public java.util.List targetPositions() { return wrapperContained.targetPositions; }
public float WALK_SPEED() { return wrapperContained.WALK_SPEED; }
// public int MAX_RUN_TIME() { return wrapperContained.MAX_RUN_TIME; }
// public boolean isSuitableTarget(yarnwrap.util.math.BlockPos pos,yarnwrap.server.world.ServerWorld world) { return wrapperContained.isSuitableTarget(pos.wrapperContained,world.wrapperContained); }
// public yarnwrap.util.math.BlockPos chooseRandomTarget(yarnwrap.server.world.ServerWorld world) { return new yarnwrap.util.math.BlockPos(wrapperContained.chooseRandomTarget(world.wrapperContained)); }

}