package yarnwrap.entity.mob;
public class SkeletonHorseEntity { public net.minecraft.entity.mob.SkeletonHorseEntity wrapperContained; public SkeletonHorseEntity(net.minecraft.entity.mob.SkeletonHorseEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DESPAWN_AGE() { return wrapperContained.DESPAWN_AGE; }
// public yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.BABY_BASE_DIMENSIONS); }
// public yarnwrap.entity.ai.goal.SkeletonHorseTrapTriggerGoal trapTriggerGoal() { return new yarnwrap.entity.ai.goal.SkeletonHorseTrapTriggerGoal(wrapperContained.trapTriggerGoal); }
// public int trapTime() { return wrapperContained.trapTime; }
// public boolean trapped() { return wrapperContained.trapped; }
public Object createSkeletonHorseAttributes() { return wrapperContained.createSkeletonHorseAttributes(); }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason reason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,reason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public boolean isTrapped() { return wrapperContained.isTrapped(); }
public void setTrapped(boolean trapped) { wrapperContained.setTrapped(trapped); }

}