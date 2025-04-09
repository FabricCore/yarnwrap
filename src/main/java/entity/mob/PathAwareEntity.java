package yarnwrap.entity.mob;
public class PathAwareEntity { public net.minecraft.entity.mob.PathAwareEntity wrapperContained; public PathAwareEntity(net.minecraft.entity.mob.PathAwareEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public float DEFAULT_PATHFINDING_FAVOR() { return wrapperContained.DEFAULT_PATHFINDING_FAVOR; }
// public boolean shouldFollowLeash() { return wrapperContained.shouldFollowLeash(); }
public boolean isPanicking() { return wrapperContained.isPanicking(); }
public float getPathfindingFavor(yarnwrap.util.math.BlockPos pos,yarnwrap.world.WorldView world) { return wrapperContained.getPathfindingFavor(pos.wrapperContained,world.wrapperContained); }
// public double getFollowLeashSpeed() { return wrapperContained.getFollowLeashSpeed(); }
public float getPathfindingFavor(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getPathfindingFavor(pos.wrapperContained); }
public boolean isNavigating() { return wrapperContained.isNavigating(); }

}