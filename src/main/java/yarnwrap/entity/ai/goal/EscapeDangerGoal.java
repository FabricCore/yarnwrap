package yarnwrap.entity.ai.goal;
public class EscapeDangerGoal { public net.minecraft.entity.ai.goal.EscapeDangerGoal wrapperContained; public EscapeDangerGoal(net.minecraft.entity.ai.goal.EscapeDangerGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean active() { return wrapperContained.active; }
// public void active(boolean value) { wrapperContained.active = value; }
public int RANGE_Y() { return wrapperContained.RANGE_Y; }
// public void RANGE_Y(int value) { wrapperContained.RANGE_Y = value; }
// public java.util.function.Function entityToDangerousDamageTypes() { return wrapperContained.entityToDangerousDamageTypes; }
// public void entityToDangerousDamageTypes(java.util.function.Function value) { wrapperContained.entityToDangerousDamageTypes = value; }
// public double targetY() { return wrapperContained.targetY; }
// public void targetY(double value) { wrapperContained.targetY = value; }
// public double targetX() { return wrapperContained.targetX; }
// public void targetX(double value) { wrapperContained.targetX = value; }
// public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
// public yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.PathAwareEntity value) { wrapperContained.mob = value.wrapperContained; }
// public double targetZ() { return wrapperContained.targetZ; }
// public void targetZ(double value) { wrapperContained.targetZ = value; }
public boolean isActive() { return wrapperContained.isActive(); }
// public boolean isInDanger() { return wrapperContained.isInDanger(); }
// public yarnwrap.util.math.BlockPos locateClosestWater(yarnwrap.world.BlockView world,yarnwrap.entity.Entity entity,int rangeX) { return new yarnwrap.util.math.BlockPos(wrapperContained.locateClosestWater(world.wrapperContained,entity.wrapperContained,rangeX)); }
// public boolean findTarget() { return wrapperContained.findTarget(); }

}