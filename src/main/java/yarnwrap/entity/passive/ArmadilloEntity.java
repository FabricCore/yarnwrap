package yarnwrap.entity.passive;
public class ArmadilloEntity { public net.minecraft.entity.passive.ArmadilloEntity wrapperContained; public ArmadilloEntity(net.minecraft.entity.passive.ArmadilloEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData STATE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.STATE); }
// public void STATE(yarnwrap.entity.data.TrackedData value) { wrapperContained.STATE = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData STATE() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.ArmadilloEntity.STATE); }
// public static void STATE(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.ArmadilloEntity.STATE = value.wrapperContained; }

// public long currentStateTicks() { return wrapperContained.currentStateTicks; }
// public void currentStateTicks(long value) { wrapperContained.currentStateTicks = value; }
// public static long currentStateTicks() { return net.minecraft.entity.passive.ArmadilloEntity.currentStateTicks; }
// public static void currentStateTicks(long value, ) { net.minecraft.entity.passive.ArmadilloEntity.currentStateTicks = value; }

// public int nextScuteShedCooldown() { return wrapperContained.nextScuteShedCooldown; }
// public void nextScuteShedCooldown(int value) { wrapperContained.nextScuteShedCooldown = value; }
// public static int nextScuteShedCooldown() { return net.minecraft.entity.passive.ArmadilloEntity.nextScuteShedCooldown; }
// public static void nextScuteShedCooldown(int value, ) { net.minecraft.entity.passive.ArmadilloEntity.nextScuteShedCooldown = value; }

public yarnwrap.entity.AnimationState unrollingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.unrollingAnimationState); }
// public void unrollingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.unrollingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState unrollingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.entity.passive.ArmadilloEntity.unrollingAnimationState); }
// public static void unrollingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.entity.passive.ArmadilloEntity.unrollingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState rollingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.rollingAnimationState); }
// public void rollingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.rollingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState rollingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.entity.passive.ArmadilloEntity.rollingAnimationState); }
// public static void rollingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.entity.passive.ArmadilloEntity.rollingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState scaredAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.scaredAnimationState); }
// public void scaredAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.scaredAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState scaredAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.entity.passive.ArmadilloEntity.scaredAnimationState); }
// public static void scaredAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.entity.passive.ArmadilloEntity.scaredAnimationState = value.wrapperContained; }

// public boolean peeking() { return wrapperContained.peeking; }
// public void peeking(boolean value) { wrapperContained.peeking = value; }
// public static boolean peeking() { return net.minecraft.entity.passive.ArmadilloEntity.peeking; }
// public static void peeking(boolean value, ) { net.minecraft.entity.passive.ArmadilloEntity.peeking = value; }

public boolean isRolledUp() { return wrapperContained.isRolledUp(); }
// public static boolean isRolledUp() { return net.minecraft.entity.passive.ArmadilloEntity.isRolledUp(); }
// public void setState(Object state) { wrapperContained.setState(state); }
// public static void setState(Object state, ) { net.minecraft.entity.passive.ArmadilloEntity.setState(state); }
public boolean shouldSwitchToScaredState() { return wrapperContained.shouldSwitchToScaredState(); }
// public static boolean shouldSwitchToScaredState() { return net.minecraft.entity.passive.ArmadilloEntity.shouldSwitchToScaredState(); }
public void startRolling() { wrapperContained.startRolling(); }
// public static void startRolling() { net.minecraft.entity.passive.ArmadilloEntity.startRolling(); }
public boolean brushScute() { return wrapperContained.brushScute(); }
// public static boolean brushScute() { return net.minecraft.entity.passive.ArmadilloEntity.brushScute(); }
public boolean canRollUp() { return wrapperContained.canRollUp(); }
// public static boolean canRollUp() { return net.minecraft.entity.passive.ArmadilloEntity.canRollUp(); }
public Object getState() { return wrapperContained.getState(); }
// public static Object getState() { return net.minecraft.entity.passive.ArmadilloEntity.getState(); }
// public int getNextScuteShedCooldown() { return wrapperContained.getNextScuteShedCooldown(); }
// public static int getNextScuteShedCooldown() { return net.minecraft.entity.passive.ArmadilloEntity.getNextScuteShedCooldown(); }
// public void updateAnimationStates() { wrapperContained.updateAnimationStates(); }
// public static void updateAnimationStates() { net.minecraft.entity.passive.ArmadilloEntity.updateAnimationStates(); }
public boolean isEntityThreatening(yarnwrap.entity.LivingEntity entity) { return wrapperContained.isEntityThreatening(entity.wrapperContained); }
// public static boolean isEntityThreatening(yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.entity.passive.ArmadilloEntity.isEntityThreatening(entity.wrapperContained); }
// public Object createArmadilloAttributes() { return wrapperContained.createArmadilloAttributes(); }
public static Object createArmadilloAttributes() { return net.minecraft.entity.passive.ArmadilloEntity.createArmadilloAttributes(); }
public boolean isNotIdle() { return wrapperContained.isNotIdle(); }
// public static boolean isNotIdle() { return net.minecraft.entity.passive.ArmadilloEntity.isNotIdle(); }
public void unroll() { wrapperContained.unroll(); }
// public static void unroll() { net.minecraft.entity.passive.ArmadilloEntity.unroll(); }
// public boolean canSpawn(yarnwrap.entity.EntityType entityType,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(entityType.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean canSpawn(yarnwrap.entity.EntityType entityType,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.passive.ArmadilloEntity.canSpawn(entityType.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }

}