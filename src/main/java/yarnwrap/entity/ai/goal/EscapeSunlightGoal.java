package yarnwrap.entity.ai.goal;
public class EscapeSunlightGoal { public net.minecraft.entity.ai.goal.EscapeSunlightGoal wrapperContained; public EscapeSunlightGoal(net.minecraft.entity.ai.goal.EscapeSunlightGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public double targetZ() { return wrapperContained.targetZ; }
// public void targetZ(double value) { wrapperContained.targetZ = value; }
// public static double targetZ() { return net.minecraft.entity.ai.goal.EscapeSunlightGoal.targetZ; }
// public static void targetZ(double value, ) { net.minecraft.entity.ai.goal.EscapeSunlightGoal.targetZ = value; }

// public double targetY() { return wrapperContained.targetY; }
// public void targetY(double value) { wrapperContained.targetY = value; }
// public static double targetY() { return net.minecraft.entity.ai.goal.EscapeSunlightGoal.targetY; }
// public static void targetY(double value, ) { net.minecraft.entity.ai.goal.EscapeSunlightGoal.targetY = value; }

// public double targetX() { return wrapperContained.targetX; }
// public void targetX(double value) { wrapperContained.targetX = value; }
// public static double targetX() { return net.minecraft.entity.ai.goal.EscapeSunlightGoal.targetX; }
// public static void targetX(double value, ) { net.minecraft.entity.ai.goal.EscapeSunlightGoal.targetX = value; }

// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.World world() { return new yarnwrap.world.World(net.minecraft.entity.ai.goal.EscapeSunlightGoal.world); }
// public static void world(yarnwrap.world.World value, ) { net.minecraft.entity.ai.goal.EscapeSunlightGoal.world = value.wrapperContained; }

// public yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.PathAwareEntity value) { wrapperContained.mob = value.wrapperContained; }
// public static yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(net.minecraft.entity.ai.goal.EscapeSunlightGoal.mob); }
// public static void mob(yarnwrap.entity.mob.PathAwareEntity value, ) { net.minecraft.entity.ai.goal.EscapeSunlightGoal.mob = value.wrapperContained; }

// public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
// public static double speed() { return net.minecraft.entity.ai.goal.EscapeSunlightGoal.speed; }
// public static void speed(double value, ) { net.minecraft.entity.ai.goal.EscapeSunlightGoal.speed = value; }

public EscapeSunlightGoal(yarnwrap.entity.mob.PathAwareEntity mob,double speed) { this.wrapperContained = new net.minecraft.entity.ai.goal.EscapeSunlightGoal(mob.wrapperContained,speed); }
// public boolean targetShadedPos() { return wrapperContained.targetShadedPos(); }
// public static boolean targetShadedPos() { return net.minecraft.entity.ai.goal.EscapeSunlightGoal.targetShadedPos(); }
// public yarnwrap.util.math.Vec3d locateShadedPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.locateShadedPos()); }
// public static yarnwrap.util.math.Vec3d locateShadedPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.ai.goal.EscapeSunlightGoal.locateShadedPos()); }

}