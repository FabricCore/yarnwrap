package yarnwrap.entity.ai.goal;
public class EscapeDangerGoal { public net.minecraft.entity.ai.goal.EscapeDangerGoal wrapperContained; public EscapeDangerGoal(net.minecraft.entity.ai.goal.EscapeDangerGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean active() { return wrapperContained.active; }
public int RANGE_Y() { return wrapperContained.RANGE_Y; }
// public java.util.function.Function entityToDangerousDamageTypes() { return wrapperContained.entityToDangerousDamageTypes; }
// public double targetY() { return wrapperContained.targetY; }
// public double targetX() { return wrapperContained.targetX; }
// public double speed() { return wrapperContained.speed; }
// public yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(wrapperContained.mob); }
// public double targetZ() { return wrapperContained.targetZ; }
public boolean isActive() { return wrapperContained.isActive(); }
// public boolean isInDanger() { return wrapperContained.isInDanger(); }
// public yarnwrap.util.math.BlockPos locateClosestWater(yarnwrap.world.BlockView world,yarnwrap.entity.Entity entity,int rangeX) { return new yarnwrap.util.math.BlockPos(wrapperContained.locateClosestWater(world.wrapperContained,entity.wrapperContained,rangeX)); }
// public boolean findTarget() { return wrapperContained.findTarget(); }

}