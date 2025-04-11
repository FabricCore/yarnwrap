package yarnwrap.entity.ai.brain.task;
public class RamImpactTask { public net.minecraft.entity.ai.brain.task.RamImpactTask wrapperContained; public RamImpactTask(net.minecraft.entity.ai.brain.task.RamImpactTask wrapperContained) { this.wrapperContained = wrapperContained; }

public int RUN_TIME() { return wrapperContained.RUN_TIME; }
// public void RUN_TIME(int value) { wrapperContained.RUN_TIME = value; }
public float SPEED_STRENGTH_MULTIPLIER() { return wrapperContained.SPEED_STRENGTH_MULTIPLIER; }
// public void SPEED_STRENGTH_MULTIPLIER(float value) { wrapperContained.SPEED_STRENGTH_MULTIPLIER = value; }
// public java.util.function.Function cooldownRangeFactory() { return wrapperContained.cooldownRangeFactory; }
// public void cooldownRangeFactory(java.util.function.Function value) { wrapperContained.cooldownRangeFactory = value; }
// public yarnwrap.entity.ai.TargetPredicate targetPredicate() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.targetPredicate); }
// public void targetPredicate(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.targetPredicate = value.wrapperContained; }
// public float speed() { return wrapperContained.speed; }
// public void speed(float value) { wrapperContained.speed = value; }
// public java.util.function.ToDoubleFunction strengthMultiplierFactory() { return wrapperContained.strengthMultiplierFactory; }
// public void strengthMultiplierFactory(java.util.function.ToDoubleFunction value) { wrapperContained.strengthMultiplierFactory = value; }
// public yarnwrap.util.math.Vec3d direction() { return new yarnwrap.util.math.Vec3d(wrapperContained.direction); }
// public void direction(yarnwrap.util.math.Vec3d value) { wrapperContained.direction = value.wrapperContained; }
// public java.util.function.Function impactSoundFactory() { return wrapperContained.impactSoundFactory; }
// public void impactSoundFactory(java.util.function.Function value) { wrapperContained.impactSoundFactory = value; }
// public java.util.function.Function hornBreakSoundFactory() { return wrapperContained.hornBreakSoundFactory; }
// public void hornBreakSoundFactory(java.util.function.Function value) { wrapperContained.hornBreakSoundFactory = value; }
public RamImpactTask(java.util.function.Function cooldownRangeFactory,yarnwrap.entity.ai.TargetPredicate targetPredicate,float speed,java.util.function.ToDoubleFunction strengthMultiplierFactory,java.util.function.Function impactSoundFactory,java.util.function.Function hornBreakSoundFactory) { this.wrapperContained = new net.minecraft.entity.ai.brain.task.RamImpactTask(cooldownRangeFactory,targetPredicate.wrapperContained,speed,strengthMultiplierFactory,impactSoundFactory,hornBreakSoundFactory); }
// public void finishRam(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.passive.GoatEntity goat) { wrapperContained.finishRam(world.wrapperContained,goat.wrapperContained); }
// public boolean shouldSnapHorn(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.passive.GoatEntity goat) { return wrapperContained.shouldSnapHorn(world.wrapperContained,goat.wrapperContained); }

}