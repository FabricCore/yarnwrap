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
public EscapeDangerGoal(yarnwrap.entity.mob.PathAwareEntity mob,double speed) { this.wrapperContained = new net.minecraft.entity.ai.goal.EscapeDangerGoal(mob.wrapperContained,speed); }
public EscapeDangerGoal(yarnwrap.entity.mob.PathAwareEntity mob,double speed,java.util.function.Function entityToDangerousDamageTypes) { this.wrapperContained = new net.minecraft.entity.ai.goal.EscapeDangerGoal(mob.wrapperContained,speed,entityToDangerousDamageTypes); }
public EscapeDangerGoal(yarnwrap.entity.mob.PathAwareEntity mob,double speed,yarnwrap.registry.tag.TagKey dangerousDamageTypes) { this.wrapperContained = new net.minecraft.entity.ai.goal.EscapeDangerGoal(mob.wrapperContained,speed,dangerousDamageTypes.wrapperContained); }
public boolean isActive() { return wrapperContained.isActive(); }
// public boolean method_39764(yarnwrap.world.BlockView pos) { return wrapperContained.method_39764(pos.wrapperContained); }
// public boolean isInDanger() { return wrapperContained.isInDanger(); }
// public yarnwrap.registry.tag.TagKey method_60722(yarnwrap.registry.tag.TagKey entity) { return new yarnwrap.registry.tag.TagKey(wrapperContained.method_60722(entity.wrapperContained)); }
// public yarnwrap.util.math.BlockPos locateClosestWater(yarnwrap.world.BlockView world,yarnwrap.entity.Entity entity,int rangeX) { return new yarnwrap.util.math.BlockPos(wrapperContained.locateClosestWater(world.wrapperContained,entity.wrapperContained,rangeX)); }
// public boolean findTarget() { return wrapperContained.findTarget(); }

}