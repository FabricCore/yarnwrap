package yarnwrap.entity.ai.pathing;
public class PathNodeNavigator { public net.minecraft.entity.ai.pathing.PathNodeNavigator wrapperContained; public PathNodeNavigator(net.minecraft.entity.ai.pathing.PathNodeNavigator wrapperContained) { this.wrapperContained = wrapperContained; }

// public int range() { return wrapperContained.range; }
// public float TARGET_DISTANCE_MULTIPLIER() { return wrapperContained.TARGET_DISTANCE_MULTIPLIER; }
// public net.minecraft.entity.ai.pathing.PathNode[] successors() { return wrapperContained.successors; }
// public yarnwrap.entity.ai.pathing.PathNodeMaker pathNodeMaker() { return new yarnwrap.entity.ai.pathing.PathNodeMaker(wrapperContained.pathNodeMaker); }
// public yarnwrap.entity.ai.pathing.PathMinHeap minHeap() { return new yarnwrap.entity.ai.pathing.PathMinHeap(wrapperContained.minHeap); }
// public float calculateDistances(yarnwrap.entity.ai.pathing.PathNode node,java.util.Set targets) { return wrapperContained.calculateDistances(node.wrapperContained,targets); }
// public float getDistance(yarnwrap.entity.ai.pathing.PathNode a,yarnwrap.entity.ai.pathing.PathNode b) { return wrapperContained.getDistance(a.wrapperContained,b.wrapperContained); }
public yarnwrap.entity.ai.pathing.Path findPathToAny(yarnwrap.world.chunk.ChunkCache world,yarnwrap.entity.mob.MobEntity mob,java.util.Set positions,float followRange,int distance,float rangeMultiplier) { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.findPathToAny(world.wrapperContained,mob.wrapperContained,positions,followRange,distance,rangeMultiplier)); }
// public yarnwrap.entity.ai.pathing.Path findPathToAny(yarnwrap.util.profiler.Profiler profiler,yarnwrap.entity.ai.pathing.PathNode startNode,java.util.Map positions,float followRange,int distance,float rangeMultiplier) { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.findPathToAny(profiler.wrapperContained,startNode.wrapperContained,positions,followRange,distance,rangeMultiplier)); }
// public yarnwrap.entity.ai.pathing.Path createPath(yarnwrap.entity.ai.pathing.PathNode endNode,yarnwrap.util.math.BlockPos target,boolean reachesTarget) { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.createPath(endNode.wrapperContained,target.wrapperContained,reachesTarget)); }

}