package yarnwrap.entity.ai.brain.task;
public class OpenDoorsTask { public net.minecraft.entity.ai.brain.task.OpenDoorsTask wrapperContained; public OpenDoorsTask(net.minecraft.entity.ai.brain.task.OpenDoorsTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int RUN_TIME() { return wrapperContained.RUN_TIME; }
// public void RUN_TIME(int value) { wrapperContained.RUN_TIME = value; }
// public double PATHING_DISTANCE() { return wrapperContained.PATHING_DISTANCE; }
// public void PATHING_DISTANCE(double value) { wrapperContained.PATHING_DISTANCE = value; }
// public double REACH_DISTANCE() { return wrapperContained.REACH_DISTANCE; }
// public void REACH_DISTANCE(double value) { wrapperContained.REACH_DISTANCE = value; }
public void pathToDoor(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,yarnwrap.entity.ai.pathing.PathNode lastNode,yarnwrap.entity.ai.pathing.PathNode currentNode,java.util.Set doors,java.util.Optional otherMobs) { wrapperContained.pathToDoor(world.wrapperContained,entity.wrapperContained,lastNode.wrapperContained,currentNode.wrapperContained,doors,otherMobs); }
// public boolean hasOtherMobReachedDoor(yarnwrap.entity.LivingEntity entity,yarnwrap.util.math.BlockPos pos,java.util.Optional otherMobs) { return wrapperContained.hasOtherMobReachedDoor(entity.wrapperContained,pos.wrapperContained,otherMobs); }
// public boolean cannotReachDoor(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,yarnwrap.util.math.GlobalPos doorPos) { return wrapperContained.cannotReachDoor(world.wrapperContained,entity.wrapperContained,doorPos.wrapperContained); }
// public boolean hasReached(yarnwrap.entity.ai.brain.Brain brain,yarnwrap.util.math.BlockPos pos) { return wrapperContained.hasReached(brain.wrapperContained,pos.wrapperContained); }
public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }
// public java.util.Optional storePos(yarnwrap.entity.ai.brain.MemoryQueryResult queryResult,java.util.Optional doors,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.storePos(queryResult.wrapperContained,doors,world.wrapperContained,pos.wrapperContained); }

}