package yarnwrap.entity.passive;
public class ArmadilloEntity { public net.minecraft.entity.passive.ArmadilloEntity wrapperContained; public ArmadilloEntity(net.minecraft.entity.passive.ArmadilloEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData STATE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.STATE); }
// public long currentStateTicks() { return wrapperContained.currentStateTicks; }
// public int nextScuteShedCooldown() { return wrapperContained.nextScuteShedCooldown; }
public yarnwrap.entity.AnimationState unrollingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.unrollingAnimationState); }
public yarnwrap.entity.AnimationState rollingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.rollingAnimationState); }
public yarnwrap.entity.AnimationState scaredAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.scaredAnimationState); }
// public boolean peeking() { return wrapperContained.peeking; }
public boolean isRolledUp() { return wrapperContained.isRolledUp(); }
// public void setState(Object state) { wrapperContained.setState(state); }
public boolean shouldSwitchToScaredState() { return wrapperContained.shouldSwitchToScaredState(); }
public void startRolling() { wrapperContained.startRolling(); }
public boolean brushScute() { return wrapperContained.brushScute(); }
public boolean canRollUp() { return wrapperContained.canRollUp(); }
public Object getState() { return wrapperContained.getState(); }
// public int getNextScuteShedCooldown() { return wrapperContained.getNextScuteShedCooldown(); }
// public void updateAnimationStates() { wrapperContained.updateAnimationStates(); }
public boolean isEntityThreatening(yarnwrap.entity.LivingEntity entity) { return wrapperContained.isEntityThreatening(entity.wrapperContained); }
public Object createArmadilloAttributes() { return wrapperContained.createArmadilloAttributes(); }
public boolean isNotIdle() { return wrapperContained.isNotIdle(); }
public void unroll() { wrapperContained.unroll(); }
public boolean canSpawn(yarnwrap.entity.EntityType entityType,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(entityType.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }

}