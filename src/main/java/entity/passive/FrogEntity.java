package yarnwrap.entity.passive;
public class FrogEntity { public net.minecraft.entity.passive.FrogEntity wrapperContained; public FrogEntity(net.minecraft.entity.passive.FrogEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.collect.ImmutableList SENSORS() { return wrapperContained.SENSORS; }
// public com.google.common.collect.ImmutableList MEMORY_MODULES() { return wrapperContained.MEMORY_MODULES; }
public yarnwrap.entity.AnimationState longJumpingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.longJumpingAnimationState); }
public yarnwrap.entity.AnimationState croakingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.croakingAnimationState); }
public yarnwrap.entity.AnimationState usingTongueAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.usingTongueAnimationState); }
public yarnwrap.entity.AnimationState idlingInWaterAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.idlingInWaterAnimationState); }
// public yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VARIANT); }
// public yarnwrap.entity.data.TrackedData TARGET() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TARGET); }
public java.lang.String VARIANT_KEY() { return wrapperContained.VARIANT_KEY; }
// public yarnwrap.registry.RegistryKey DEFAULT_VARIANT_KEY() { return new yarnwrap.registry.RegistryKey(wrapperContained.DEFAULT_VARIANT_KEY); }
public void setFrogTarget(yarnwrap.entity.Entity entity) { wrapperContained.setFrogTarget(entity.wrapperContained); }
public Object createFrogAttributes() { return wrapperContained.createFrogAttributes(); }
public boolean isValidFrogFood(yarnwrap.entity.LivingEntity entity) { return wrapperContained.isValidFrogFood(entity.wrapperContained); }
public void clearFrogTarget() { wrapperContained.clearFrogTarget(); }
public java.util.Optional getFrogTarget() { return wrapperContained.getFrogTarget(); }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason reason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,reason.wrapperContained,pos.wrapperContained,random.wrapperContained); }

}