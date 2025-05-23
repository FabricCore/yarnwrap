package yarnwrap.entity.mob;
public class SkeletonHorseEntity { public net.minecraft.entity.mob.SkeletonHorseEntity wrapperContained; public SkeletonHorseEntity(net.minecraft.entity.mob.SkeletonHorseEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.goal.SkeletonHorseTrapTriggerGoal trapTriggerGoal() { return new yarnwrap.entity.ai.goal.SkeletonHorseTrapTriggerGoal(wrapperContained.trapTriggerGoal); }
// public void trapTriggerGoal(yarnwrap.entity.ai.goal.SkeletonHorseTrapTriggerGoal value) { wrapperContained.trapTriggerGoal = value.wrapperContained; }
// public static yarnwrap.entity.ai.goal.SkeletonHorseTrapTriggerGoal trapTriggerGoal() { return new yarnwrap.entity.ai.goal.SkeletonHorseTrapTriggerGoal(net.minecraft.entity.mob.SkeletonHorseEntity.trapTriggerGoal); }
// public static void trapTriggerGoal(yarnwrap.entity.ai.goal.SkeletonHorseTrapTriggerGoal value, ) { net.minecraft.entity.mob.SkeletonHorseEntity.trapTriggerGoal = value.wrapperContained; }

// public int trapTime() { return wrapperContained.trapTime; }
// public void trapTime(int value) { wrapperContained.trapTime = value; }
// public static int trapTime() { return net.minecraft.entity.mob.SkeletonHorseEntity.trapTime; }
// public static void trapTime(int value, ) { net.minecraft.entity.mob.SkeletonHorseEntity.trapTime = value; }

// public boolean trapped() { return wrapperContained.trapped; }
// public void trapped(boolean value) { wrapperContained.trapped = value; }
// public static boolean trapped() { return net.minecraft.entity.mob.SkeletonHorseEntity.trapped; }
// public static void trapped(boolean value, ) { net.minecraft.entity.mob.SkeletonHorseEntity.trapped = value; }

// public int DESPAWN_AGE() { return wrapperContained.DESPAWN_AGE; }
// public void DESPAWN_AGE(int value) { wrapperContained.DESPAWN_AGE = value; }
// public static int DESPAWN_AGE() { return net.minecraft.entity.mob.SkeletonHorseEntity.DESPAWN_AGE; }
// public static void DESPAWN_AGE(int value, ) { net.minecraft.entity.mob.SkeletonHorseEntity.DESPAWN_AGE = value; }

// public yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.BABY_BASE_DIMENSIONS); }
// public void BABY_BASE_DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.BABY_BASE_DIMENSIONS = value.wrapperContained; }
// public static yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(net.minecraft.entity.mob.SkeletonHorseEntity.BABY_BASE_DIMENSIONS); }
// public static void BABY_BASE_DIMENSIONS(yarnwrap.entity.EntityDimensions value, ) { net.minecraft.entity.mob.SkeletonHorseEntity.BABY_BASE_DIMENSIONS = value.wrapperContained; }

// public boolean DEFAULT_TRAPPED() { return wrapperContained.DEFAULT_TRAPPED; }
// public void DEFAULT_TRAPPED(boolean value) { wrapperContained.DEFAULT_TRAPPED = value; }
// public static boolean DEFAULT_TRAPPED() { return net.minecraft.entity.mob.SkeletonHorseEntity.DEFAULT_TRAPPED; }
// public static void DEFAULT_TRAPPED(boolean value, ) { net.minecraft.entity.mob.SkeletonHorseEntity.DEFAULT_TRAPPED = value; }

// public int DEFAULT_TRAP_TIME() { return wrapperContained.DEFAULT_TRAP_TIME; }
// public void DEFAULT_TRAP_TIME(int value) { wrapperContained.DEFAULT_TRAP_TIME = value; }
// public static int DEFAULT_TRAP_TIME() { return net.minecraft.entity.mob.SkeletonHorseEntity.DEFAULT_TRAP_TIME; }
// public static void DEFAULT_TRAP_TIME(int value, ) { net.minecraft.entity.mob.SkeletonHorseEntity.DEFAULT_TRAP_TIME = value; }

public boolean isTrapped() { return wrapperContained.isTrapped(); }
// public static boolean isTrapped() { return net.minecraft.entity.mob.SkeletonHorseEntity.isTrapped(); }
public void setTrapped(boolean trapped) { wrapperContained.setTrapped(trapped); }
// public static void setTrapped(boolean trapped, ) { net.minecraft.entity.mob.SkeletonHorseEntity.setTrapped(trapped); }
// public Object createSkeletonHorseAttributes() { return wrapperContained.createSkeletonHorseAttributes(); }
public static Object createSkeletonHorseAttributes() { return net.minecraft.entity.mob.SkeletonHorseEntity.createSkeletonHorseAttributes(); }
// public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason reason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,reason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason reason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.mob.SkeletonHorseEntity.canSpawn(type.wrapperContained,world.wrapperContained,reason.wrapperContained,pos.wrapperContained,random.wrapperContained); }

}