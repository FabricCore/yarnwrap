package yarnwrap.entity.mob;
public class PathAwareEntity { public net.minecraft.entity.mob.PathAwareEntity wrapperContained; public PathAwareEntity(net.minecraft.entity.mob.PathAwareEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public float DEFAULT_PATHFINDING_FAVOR() { return wrapperContained.DEFAULT_PATHFINDING_FAVOR; }
// public void DEFAULT_PATHFINDING_FAVOR(float value) { wrapperContained.DEFAULT_PATHFINDING_FAVOR = value; }
// public static float DEFAULT_PATHFINDING_FAVOR() { return net.minecraft.entity.mob.PathAwareEntity.DEFAULT_PATHFINDING_FAVOR; }
// public static void DEFAULT_PATHFINDING_FAVOR(float value, ) { net.minecraft.entity.mob.PathAwareEntity.DEFAULT_PATHFINDING_FAVOR = value; }

public float getPathfindingFavor(yarnwrap.util.math.BlockPos pos,yarnwrap.world.WorldView world) { return wrapperContained.getPathfindingFavor(pos.wrapperContained,world.wrapperContained); }
// public static float getPathfindingFavor(yarnwrap.util.math.BlockPos pos,yarnwrap.world.WorldView world, ) { return net.minecraft.entity.mob.PathAwareEntity.getPathfindingFavor(pos.wrapperContained,world.wrapperContained); }
// public double getFollowLeashSpeed() { return wrapperContained.getFollowLeashSpeed(); }
// public static double getFollowLeashSpeed() { return net.minecraft.entity.mob.PathAwareEntity.getFollowLeashSpeed(); }
public float getPathfindingFavor(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getPathfindingFavor(pos.wrapperContained); }
// public static float getPathfindingFavor(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.entity.mob.PathAwareEntity.getPathfindingFavor(pos.wrapperContained); }
public boolean isNavigating() { return wrapperContained.isNavigating(); }
// public static boolean isNavigating() { return net.minecraft.entity.mob.PathAwareEntity.isNavigating(); }
// public boolean shouldFollowLeash() { return wrapperContained.shouldFollowLeash(); }
// public static boolean shouldFollowLeash() { return net.minecraft.entity.mob.PathAwareEntity.shouldFollowLeash(); }
public boolean isPanicking() { return wrapperContained.isPanicking(); }
// public static boolean isPanicking() { return net.minecraft.entity.mob.PathAwareEntity.isPanicking(); }

}