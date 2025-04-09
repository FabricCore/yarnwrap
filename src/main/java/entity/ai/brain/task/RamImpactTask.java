package yarnwrap.entity.ai.brain.task;
public class RamImpactTask { public net.minecraft.entity.ai.brain.task.RamImpactTask wrapperContained; public RamImpactTask(net.minecraft.entity.ai.brain.task.RamImpactTask wrapperContained) { this.wrapperContained = wrapperContained; }

public int RUN_TIME() { return wrapperContained.RUN_TIME; }
public float SPEED_STRENGTH_MULTIPLIER() { return wrapperContained.SPEED_STRENGTH_MULTIPLIER; }
// public java.util.function.Function cooldownRangeFactory() { return wrapperContained.cooldownRangeFactory; }
// public yarnwrap.entity.ai.TargetPredicate targetPredicate() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.targetPredicate); }
// public float speed() { return wrapperContained.speed; }
// public java.util.function.ToDoubleFunction strengthMultiplierFactory() { return wrapperContained.strengthMultiplierFactory; }
// public yarnwrap.util.math.Vec3d direction() { return new yarnwrap.util.math.Vec3d(wrapperContained.direction); }
// public java.util.function.Function impactSoundFactory() { return wrapperContained.impactSoundFactory; }
// public java.util.function.Function hornBreakSoundFactory() { return wrapperContained.hornBreakSoundFactory; }
// public void finishRam(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.passive.GoatEntity goat) { wrapperContained.finishRam(world.wrapperContained,goat.wrapperContained); }
// public boolean shouldSnapHorn(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.passive.GoatEntity goat) { return wrapperContained.shouldSnapHorn(world.wrapperContained,goat.wrapperContained); }

}