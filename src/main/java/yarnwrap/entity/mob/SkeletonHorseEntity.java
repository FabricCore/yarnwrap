package yarnwrap.entity.mob;
public class SkeletonHorseEntity { public net.minecraft.entity.mob.SkeletonHorseEntity wrapperContained; public SkeletonHorseEntity(net.minecraft.entity.mob.SkeletonHorseEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DESPAWN_AGE() { return wrapperContained.DESPAWN_AGE; }
// public void DESPAWN_AGE(int value) { wrapperContained.DESPAWN_AGE = value; }
// public yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.BABY_BASE_DIMENSIONS); }
// public void BABY_BASE_DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.BABY_BASE_DIMENSIONS = value.wrapperContained; }
// public yarnwrap.entity.ai.goal.SkeletonHorseTrapTriggerGoal trapTriggerGoal() { return new yarnwrap.entity.ai.goal.SkeletonHorseTrapTriggerGoal(wrapperContained.trapTriggerGoal); }
// public void trapTriggerGoal(yarnwrap.entity.ai.goal.SkeletonHorseTrapTriggerGoal value) { wrapperContained.trapTriggerGoal = value.wrapperContained; }
// public int trapTime() { return wrapperContained.trapTime; }
// public void trapTime(int value) { wrapperContained.trapTime = value; }
// public boolean trapped() { return wrapperContained.trapped; }
// public void trapped(boolean value) { wrapperContained.trapped = value; }
public Object createSkeletonHorseAttributes() { return wrapperContained.createSkeletonHorseAttributes(); }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason reason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,reason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public boolean isTrapped() { return wrapperContained.isTrapped(); }
public void setTrapped(boolean trapped) { wrapperContained.setTrapped(trapped); }

}