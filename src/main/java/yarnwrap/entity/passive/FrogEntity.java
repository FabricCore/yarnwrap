package yarnwrap.entity.passive;
public class FrogEntity { public net.minecraft.entity.passive.FrogEntity wrapperContained; public FrogEntity(net.minecraft.entity.passive.FrogEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.collect.ImmutableList SENSORS() { return wrapperContained.SENSORS; }
// public void SENSORS(com.google.common.collect.ImmutableList value) { wrapperContained.SENSORS = value; }
// public com.google.common.collect.ImmutableList MEMORY_MODULES() { return wrapperContained.MEMORY_MODULES; }
// public void MEMORY_MODULES(com.google.common.collect.ImmutableList value) { wrapperContained.MEMORY_MODULES = value; }
public yarnwrap.entity.AnimationState longJumpingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.longJumpingAnimationState); }
// public void longJumpingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.longJumpingAnimationState = value.wrapperContained; }
public yarnwrap.entity.AnimationState croakingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.croakingAnimationState); }
// public void croakingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.croakingAnimationState = value.wrapperContained; }
public yarnwrap.entity.AnimationState usingTongueAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.usingTongueAnimationState); }
// public void usingTongueAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.usingTongueAnimationState = value.wrapperContained; }
public yarnwrap.entity.AnimationState idlingInWaterAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.idlingInWaterAnimationState); }
// public void idlingInWaterAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.idlingInWaterAnimationState = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VARIANT); }
// public void VARIANT(yarnwrap.entity.data.TrackedData value) { wrapperContained.VARIANT = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData TARGET() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TARGET); }
// public void TARGET(yarnwrap.entity.data.TrackedData value) { wrapperContained.TARGET = value.wrapperContained; }
public java.lang.String VARIANT_KEY() { return wrapperContained.VARIANT_KEY; }
// public void VARIANT_KEY(java.lang.String value) { wrapperContained.VARIANT_KEY = value; }
// public yarnwrap.registry.RegistryKey DEFAULT_VARIANT_KEY() { return new yarnwrap.registry.RegistryKey(wrapperContained.DEFAULT_VARIANT_KEY); }
// public void DEFAULT_VARIANT_KEY(yarnwrap.registry.RegistryKey value) { wrapperContained.DEFAULT_VARIANT_KEY = value.wrapperContained; }
public void setFrogTarget(yarnwrap.entity.Entity entity) { wrapperContained.setFrogTarget(entity.wrapperContained); }
public Object createFrogAttributes() { return wrapperContained.createFrogAttributes(); }
public boolean isValidFrogFood(yarnwrap.entity.LivingEntity entity) { return wrapperContained.isValidFrogFood(entity.wrapperContained); }
public void clearFrogTarget() { wrapperContained.clearFrogTarget(); }
public java.util.Optional getFrogTarget() { return wrapperContained.getFrogTarget(); }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason reason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,reason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public yarnwrap.registry.RegistryKey method_58389(yarnwrap.util.Identifier variant) { return new yarnwrap.registry.RegistryKey(wrapperContained.method_58389(variant.wrapperContained)); }

}