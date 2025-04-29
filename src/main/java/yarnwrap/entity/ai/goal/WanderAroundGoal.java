package yarnwrap.entity.ai.goal;
public class WanderAroundGoal { public net.minecraft.entity.ai.goal.WanderAroundGoal wrapperContained; public WanderAroundGoal(net.minecraft.entity.ai.goal.WanderAroundGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean canDespawn() { return wrapperContained.canDespawn; }
// public void canDespawn(boolean value) { wrapperContained.canDespawn = value; }
// public static boolean canDespawn() { return net.minecraft.entity.ai.goal.WanderAroundGoal.canDespawn; }
// public static void canDespawn(boolean value, ) { net.minecraft.entity.ai.goal.WanderAroundGoal.canDespawn = value; }

// public int DEFAULT_CHANCE() { return wrapperContained.DEFAULT_CHANCE; }
// public void DEFAULT_CHANCE(int value) { wrapperContained.DEFAULT_CHANCE = value; }
public static int DEFAULT_CHANCE() { return net.minecraft.entity.ai.goal.WanderAroundGoal.DEFAULT_CHANCE; }
// public static void DEFAULT_CHANCE(int value, ) { net.minecraft.entity.ai.goal.WanderAroundGoal.DEFAULT_CHANCE = value; }

// public double targetZ() { return wrapperContained.targetZ; }
// public void targetZ(double value) { wrapperContained.targetZ = value; }
// public static double targetZ() { return net.minecraft.entity.ai.goal.WanderAroundGoal.targetZ; }
// public static void targetZ(double value, ) { net.minecraft.entity.ai.goal.WanderAroundGoal.targetZ = value; }

// public double targetY() { return wrapperContained.targetY; }
// public void targetY(double value) { wrapperContained.targetY = value; }
// public static double targetY() { return net.minecraft.entity.ai.goal.WanderAroundGoal.targetY; }
// public static void targetY(double value, ) { net.minecraft.entity.ai.goal.WanderAroundGoal.targetY = value; }

// public double targetX() { return wrapperContained.targetX; }
// public void targetX(double value) { wrapperContained.targetX = value; }
// public static double targetX() { return net.minecraft.entity.ai.goal.WanderAroundGoal.targetX; }
// public static void targetX(double value, ) { net.minecraft.entity.ai.goal.WanderAroundGoal.targetX = value; }

// public int chance() { return wrapperContained.chance; }
// public void chance(int value) { wrapperContained.chance = value; }
// public static int chance() { return net.minecraft.entity.ai.goal.WanderAroundGoal.chance; }
// public static void chance(int value, ) { net.minecraft.entity.ai.goal.WanderAroundGoal.chance = value; }

// public boolean ignoringChance() { return wrapperContained.ignoringChance; }
// public void ignoringChance(boolean value) { wrapperContained.ignoringChance = value; }
// public static boolean ignoringChance() { return net.minecraft.entity.ai.goal.WanderAroundGoal.ignoringChance; }
// public static void ignoringChance(boolean value, ) { net.minecraft.entity.ai.goal.WanderAroundGoal.ignoringChance = value; }

// public yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.PathAwareEntity value) { wrapperContained.mob = value.wrapperContained; }
// public static yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(net.minecraft.entity.ai.goal.WanderAroundGoal.mob); }
// public static void mob(yarnwrap.entity.mob.PathAwareEntity value, ) { net.minecraft.entity.ai.goal.WanderAroundGoal.mob = value.wrapperContained; }

// public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
// public static double speed() { return net.minecraft.entity.ai.goal.WanderAroundGoal.speed; }
// public static void speed(double value, ) { net.minecraft.entity.ai.goal.WanderAroundGoal.speed = value; }

public WanderAroundGoal(yarnwrap.entity.mob.PathAwareEntity mob,double speed) { this.wrapperContained = new net.minecraft.entity.ai.goal.WanderAroundGoal(mob.wrapperContained,speed); }
public WanderAroundGoal(yarnwrap.entity.mob.PathAwareEntity mob,double speed,int chance) { this.wrapperContained = new net.minecraft.entity.ai.goal.WanderAroundGoal(mob.wrapperContained,speed,chance); }
public WanderAroundGoal(yarnwrap.entity.mob.PathAwareEntity entity,double speed,int chance,boolean canDespawn) { this.wrapperContained = new net.minecraft.entity.ai.goal.WanderAroundGoal(entity.wrapperContained,speed,chance,canDespawn); }
// public yarnwrap.util.math.Vec3d getWanderTarget() { return new yarnwrap.util.math.Vec3d(wrapperContained.getWanderTarget()); }
// public static yarnwrap.util.math.Vec3d getWanderTarget() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.ai.goal.WanderAroundGoal.getWanderTarget()); }
public void setChance(int chance) { wrapperContained.setChance(chance); }
// public static void setChance(int chance, ) { net.minecraft.entity.ai.goal.WanderAroundGoal.setChance(chance); }
public void ignoreChanceOnce() { wrapperContained.ignoreChanceOnce(); }
// public static void ignoreChanceOnce() { net.minecraft.entity.ai.goal.WanderAroundGoal.ignoreChanceOnce(); }

}