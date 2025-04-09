package yarnwrap.entity.ai;
public class NavigationConditions { public net.minecraft.entity.ai.NavigationConditions wrapperContained; public NavigationConditions(net.minecraft.entity.ai.NavigationConditions wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean hasMobNavigation(yarnwrap.entity.mob.MobEntity entity) { return wrapperContained.hasMobNavigation(entity.wrapperContained); }
public boolean isPositionTargetInRange(yarnwrap.entity.mob.PathAwareEntity entity,int extraDistance) { return wrapperContained.isPositionTargetInRange(entity.wrapperContained,extraDistance); }
public boolean isWaterAt(yarnwrap.entity.mob.PathAwareEntity entity,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isWaterAt(entity.wrapperContained,pos.wrapperContained); }
public boolean isInvalidPosition(yarnwrap.entity.ai.pathing.EntityNavigation navigation,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isInvalidPosition(navigation.wrapperContained,pos.wrapperContained); }
public boolean isHeightInvalid(yarnwrap.util.math.BlockPos pos,yarnwrap.entity.mob.PathAwareEntity entity) { return wrapperContained.isHeightInvalid(pos.wrapperContained,entity.wrapperContained); }
public boolean isPositionTargetOutOfWalkRange(boolean posTargetInRange,yarnwrap.entity.mob.PathAwareEntity entity,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isPositionTargetOutOfWalkRange(posTargetInRange,entity.wrapperContained,pos.wrapperContained); }
public boolean hasPathfindingPenalty(yarnwrap.entity.mob.PathAwareEntity entity,yarnwrap.util.math.BlockPos pos) { return wrapperContained.hasPathfindingPenalty(entity.wrapperContained,pos.wrapperContained); }
public boolean isSolidAt(yarnwrap.entity.mob.PathAwareEntity entity,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isSolidAt(entity.wrapperContained,pos.wrapperContained); }

}