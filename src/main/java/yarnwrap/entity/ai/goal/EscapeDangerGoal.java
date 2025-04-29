package yarnwrap.entity.ai.goal;
public class EscapeDangerGoal { public net.minecraft.entity.ai.goal.EscapeDangerGoal wrapperContained; public EscapeDangerGoal(net.minecraft.entity.ai.goal.EscapeDangerGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean active() { return wrapperContained.active; }
// public void active(boolean value) { wrapperContained.active = value; }
// public static boolean active() { return net.minecraft.entity.ai.goal.EscapeDangerGoal.active; }
// public static void active(boolean value, ) { net.minecraft.entity.ai.goal.EscapeDangerGoal.active = value; }

// public int RANGE_Y() { return wrapperContained.RANGE_Y; }
// public void RANGE_Y(int value) { wrapperContained.RANGE_Y = value; }
public static int RANGE_Y() { return net.minecraft.entity.ai.goal.EscapeDangerGoal.RANGE_Y; }
// public static void RANGE_Y(int value, ) { net.minecraft.entity.ai.goal.EscapeDangerGoal.RANGE_Y = value; }

// public java.util.function.Function entityToDangerousDamageTypes() { return wrapperContained.entityToDangerousDamageTypes; }
// public void entityToDangerousDamageTypes(java.util.function.Function value) { wrapperContained.entityToDangerousDamageTypes = value; }
// public static java.util.function.Function entityToDangerousDamageTypes() { return net.minecraft.entity.ai.goal.EscapeDangerGoal.entityToDangerousDamageTypes; }
// public static void entityToDangerousDamageTypes(java.util.function.Function value, ) { net.minecraft.entity.ai.goal.EscapeDangerGoal.entityToDangerousDamageTypes = value; }

// public double targetY() { return wrapperContained.targetY; }
// public void targetY(double value) { wrapperContained.targetY = value; }
// public static double targetY() { return net.minecraft.entity.ai.goal.EscapeDangerGoal.targetY; }
// public static void targetY(double value, ) { net.minecraft.entity.ai.goal.EscapeDangerGoal.targetY = value; }

// public double targetX() { return wrapperContained.targetX; }
// public void targetX(double value) { wrapperContained.targetX = value; }
// public static double targetX() { return net.minecraft.entity.ai.goal.EscapeDangerGoal.targetX; }
// public static void targetX(double value, ) { net.minecraft.entity.ai.goal.EscapeDangerGoal.targetX = value; }

// public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
// public static double speed() { return net.minecraft.entity.ai.goal.EscapeDangerGoal.speed; }
// public static void speed(double value, ) { net.minecraft.entity.ai.goal.EscapeDangerGoal.speed = value; }

// public yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.PathAwareEntity value) { wrapperContained.mob = value.wrapperContained; }
// public static yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(net.minecraft.entity.ai.goal.EscapeDangerGoal.mob); }
// public static void mob(yarnwrap.entity.mob.PathAwareEntity value, ) { net.minecraft.entity.ai.goal.EscapeDangerGoal.mob = value.wrapperContained; }

// public double targetZ() { return wrapperContained.targetZ; }
// public void targetZ(double value) { wrapperContained.targetZ = value; }
// public static double targetZ() { return net.minecraft.entity.ai.goal.EscapeDangerGoal.targetZ; }
// public static void targetZ(double value, ) { net.minecraft.entity.ai.goal.EscapeDangerGoal.targetZ = value; }

public EscapeDangerGoal(yarnwrap.entity.mob.PathAwareEntity mob,double speed) { this.wrapperContained = new net.minecraft.entity.ai.goal.EscapeDangerGoal(mob.wrapperContained,speed); }
public EscapeDangerGoal(yarnwrap.entity.mob.PathAwareEntity mob,double speed,java.util.function.Function entityToDangerousDamageTypes) { this.wrapperContained = new net.minecraft.entity.ai.goal.EscapeDangerGoal(mob.wrapperContained,speed,entityToDangerousDamageTypes); }
public EscapeDangerGoal(yarnwrap.entity.mob.PathAwareEntity mob,double speed,yarnwrap.registry.tag.TagKey dangerousDamageTypes) { this.wrapperContained = new net.minecraft.entity.ai.goal.EscapeDangerGoal(mob.wrapperContained,speed,dangerousDamageTypes.wrapperContained); }
public boolean isActive() { return wrapperContained.isActive(); }
// public static boolean isActive() { return net.minecraft.entity.ai.goal.EscapeDangerGoal.isActive(); }
// public boolean method_39764(yarnwrap.world.BlockView pos) { return wrapperContained.method_39764(pos.wrapperContained); }
// public static boolean method_39764(yarnwrap.world.BlockView pos, ) { return net.minecraft.entity.ai.goal.EscapeDangerGoal.method_39764(pos.wrapperContained); }
// public boolean isInDanger() { return wrapperContained.isInDanger(); }
// public static boolean isInDanger() { return net.minecraft.entity.ai.goal.EscapeDangerGoal.isInDanger(); }
// public yarnwrap.registry.tag.TagKey method_60722(yarnwrap.registry.tag.TagKey entity) { return new yarnwrap.registry.tag.TagKey(wrapperContained.method_60722(entity.wrapperContained)); }
// public static yarnwrap.registry.tag.TagKey method_60722(yarnwrap.registry.tag.TagKey entity, ) { return new yarnwrap.registry.tag.TagKey(net.minecraft.entity.ai.goal.EscapeDangerGoal.method_60722(entity.wrapperContained)); }
// public yarnwrap.util.math.BlockPos locateClosestWater(yarnwrap.world.BlockView world,yarnwrap.entity.Entity entity,int rangeX) { return new yarnwrap.util.math.BlockPos(wrapperContained.locateClosestWater(world.wrapperContained,entity.wrapperContained,rangeX)); }
// public static yarnwrap.util.math.BlockPos locateClosestWater(yarnwrap.world.BlockView world,yarnwrap.entity.Entity entity,int rangeX, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.ai.goal.EscapeDangerGoal.locateClosestWater(world.wrapperContained,entity.wrapperContained,rangeX)); }
// public boolean findTarget() { return wrapperContained.findTarget(); }
// public static boolean findTarget() { return net.minecraft.entity.ai.goal.EscapeDangerGoal.findTarget(); }

}