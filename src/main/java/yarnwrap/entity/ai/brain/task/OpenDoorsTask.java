package yarnwrap.entity.ai.brain.task;
public class OpenDoorsTask { public net.minecraft.entity.ai.brain.task.OpenDoorsTask wrapperContained; public OpenDoorsTask(net.minecraft.entity.ai.brain.task.OpenDoorsTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int RUN_TIME() { return wrapperContained.RUN_TIME; }
// public void RUN_TIME(int value) { wrapperContained.RUN_TIME = value; }
// public static int RUN_TIME() { return net.minecraft.entity.ai.brain.task.OpenDoorsTask.RUN_TIME; }
// public static void RUN_TIME(int value, ) { net.minecraft.entity.ai.brain.task.OpenDoorsTask.RUN_TIME = value; }

// public double PATHING_DISTANCE() { return wrapperContained.PATHING_DISTANCE; }
// public void PATHING_DISTANCE(double value) { wrapperContained.PATHING_DISTANCE = value; }
// public static double PATHING_DISTANCE() { return net.minecraft.entity.ai.brain.task.OpenDoorsTask.PATHING_DISTANCE; }
// public static void PATHING_DISTANCE(double value, ) { net.minecraft.entity.ai.brain.task.OpenDoorsTask.PATHING_DISTANCE = value; }

// public double REACH_DISTANCE() { return wrapperContained.REACH_DISTANCE; }
// public void REACH_DISTANCE(double value) { wrapperContained.REACH_DISTANCE = value; }
// public static double REACH_DISTANCE() { return net.minecraft.entity.ai.brain.task.OpenDoorsTask.REACH_DISTANCE; }
// public static void REACH_DISTANCE(double value, ) { net.minecraft.entity.ai.brain.task.OpenDoorsTask.REACH_DISTANCE = value; }

// public void pathToDoor(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,yarnwrap.entity.ai.pathing.PathNode lastNode,yarnwrap.entity.ai.pathing.PathNode currentNode,java.util.Set doors,java.util.Optional otherMobs) { wrapperContained.pathToDoor(world.wrapperContained,entity.wrapperContained,lastNode.wrapperContained,currentNode.wrapperContained,doors,otherMobs); }
// public static void pathToDoor(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,yarnwrap.entity.ai.pathing.PathNode lastNode,yarnwrap.entity.ai.pathing.PathNode currentNode,java.util.Set doors,java.util.Optional otherMobs, ) { net.minecraft.entity.ai.brain.task.OpenDoorsTask.pathToDoor(world.wrapperContained,entity.wrapperContained,lastNode.wrapperContained,currentNode.wrapperContained,doors,otherMobs); }
// public boolean hasOtherMobReachedDoor(yarnwrap.entity.LivingEntity entity,yarnwrap.util.math.BlockPos pos,java.util.Optional otherMobs) { return wrapperContained.hasOtherMobReachedDoor(entity.wrapperContained,pos.wrapperContained,otherMobs); }
// public static boolean hasOtherMobReachedDoor(yarnwrap.entity.LivingEntity entity,yarnwrap.util.math.BlockPos pos,java.util.Optional otherMobs, ) { return net.minecraft.entity.ai.brain.task.OpenDoorsTask.hasOtherMobReachedDoor(entity.wrapperContained,pos.wrapperContained,otherMobs); }
// public boolean cannotReachDoor(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,yarnwrap.util.math.GlobalPos doorPos) { return wrapperContained.cannotReachDoor(world.wrapperContained,entity.wrapperContained,doorPos.wrapperContained); }
// public static boolean cannotReachDoor(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,yarnwrap.util.math.GlobalPos doorPos, ) { return net.minecraft.entity.ai.brain.task.OpenDoorsTask.cannotReachDoor(world.wrapperContained,entity.wrapperContained,doorPos.wrapperContained); }
// public boolean method_30764(yarnwrap.entity.LivingEntity mob) { return wrapperContained.method_30764(mob.wrapperContained); }
// public static boolean method_30764(yarnwrap.entity.LivingEntity mob, ) { return net.minecraft.entity.ai.brain.task.OpenDoorsTask.method_30764(mob.wrapperContained); }
// public boolean method_30765(yarnwrap.util.math.BlockPos mob) { return wrapperContained.method_30765(mob.wrapperContained); }
// public static boolean method_30765(yarnwrap.util.math.BlockPos mob, ) { return net.minecraft.entity.ai.brain.task.OpenDoorsTask.method_30765(mob.wrapperContained); }
// public boolean hasReached(yarnwrap.entity.ai.brain.Brain brain,yarnwrap.util.math.BlockPos pos) { return wrapperContained.hasReached(brain.wrapperContained,pos.wrapperContained); }
// public static boolean hasReached(yarnwrap.entity.ai.brain.Brain brain,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.entity.ai.brain.task.OpenDoorsTask.hasReached(brain.wrapperContained,pos.wrapperContained); }
// public boolean method_40002(Object state) { return wrapperContained.method_40002(state); }
// public static boolean method_40002(Object state, ) { return net.minecraft.entity.ai.brain.task.OpenDoorsTask.method_40002(state); }
// public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }
public static yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(net.minecraft.entity.ai.brain.task.OpenDoorsTask.create()); }
// public void method_46965(yarnwrap.server.world.ServerWorld doors) { wrapperContained.method_46965(doors.wrapperContained); }
// public static void method_46965(yarnwrap.server.world.ServerWorld doors, ) { net.minecraft.entity.ai.brain.task.OpenDoorsTask.method_46965(doors.wrapperContained); }
// public boolean method_46966(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,yarnwrap.entity.ai.brain.MemoryQueryResult time) { return wrapperContained.method_46966(world,entity.wrapperContained,time.wrapperContained); }
// public static boolean method_46966(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,yarnwrap.entity.ai.brain.MemoryQueryResult time, ) { return net.minecraft.entity.ai.brain.task.OpenDoorsTask.method_46966(world,entity.wrapperContained,time.wrapperContained); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_46967(Object path,org.apache.commons.lang3.mutable.MutableObject doorsToClose,org.apache.commons.lang3.mutable.MutableInt mobs) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_46967(path,doorsToClose,mobs)); }
// public static yarnwrap.entity.ai.brain.task.TaskRunnable method_46967(Object path,org.apache.commons.lang3.mutable.MutableObject doorsToClose,org.apache.commons.lang3.mutable.MutableInt mobs, ) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(net.minecraft.entity.ai.brain.task.OpenDoorsTask.method_46967(path,doorsToClose,mobs)); }
// public java.util.Optional storePos(yarnwrap.entity.ai.brain.MemoryQueryResult queryResult,java.util.Optional doors,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.storePos(queryResult.wrapperContained,doors,world.wrapperContained,pos.wrapperContained); }
// public static java.util.Optional storePos(yarnwrap.entity.ai.brain.MemoryQueryResult queryResult,java.util.Optional doors,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.entity.ai.brain.task.OpenDoorsTask.storePos(queryResult.wrapperContained,doors,world.wrapperContained,pos.wrapperContained); }
// public boolean method_46970(yarnwrap.util.math.BlockPos mob) { return wrapperContained.method_46970(mob.wrapperContained); }
// public static boolean method_46970(yarnwrap.util.math.BlockPos mob, ) { return net.minecraft.entity.ai.brain.task.OpenDoorsTask.method_46970(mob.wrapperContained); }
// public java.util.Set method_46971(yarnwrap.util.math.GlobalPos doorSet) { return wrapperContained.method_46971(doorSet.wrapperContained); }
// public static java.util.Set method_46971(yarnwrap.util.math.GlobalPos doorSet, ) { return net.minecraft.entity.ai.brain.task.OpenDoorsTask.method_46971(doorSet.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_46972(org.apache.commons.lang3.mutable.MutableObject context) { return wrapperContained.method_46972(context); }
// public static com.mojang.datafixers.kinds.App method_46972(org.apache.commons.lang3.mutable.MutableObject context, ) { return net.minecraft.entity.ai.brain.task.OpenDoorsTask.method_46972(context); }
// public boolean method_46973(Object state) { return wrapperContained.method_46973(state); }
// public static boolean method_46973(Object state, ) { return net.minecraft.entity.ai.brain.task.OpenDoorsTask.method_46973(state); }
// public boolean method_46974(Object state) { return wrapperContained.method_46974(state); }
// public static boolean method_46974(Object state, ) { return net.minecraft.entity.ai.brain.task.OpenDoorsTask.method_46974(state); }

}