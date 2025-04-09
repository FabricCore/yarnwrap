package yarnwrap.entity.ai.brain.task;
public class LongJumpTask { public net.minecraft.entity.ai.brain.task.LongJumpTask wrapperContained; public LongJumpTask(net.minecraft.entity.ai.brain.task.LongJumpTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int RUN_TIME() { return wrapperContained.RUN_TIME; }
// public int MAX_COOLDOWN() { return wrapperContained.MAX_COOLDOWN; }
// public int TARGET_RETAIN_TIME() { return wrapperContained.TARGET_RETAIN_TIME; }
// public int PATHING_DISTANCE() { return wrapperContained.PATHING_DISTANCE; }
// public yarnwrap.util.math.intprovider.UniformIntProvider cooldownRange() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.cooldownRange); }
// public int verticalRange() { return wrapperContained.verticalRange; }
// public int horizontalRange() { return wrapperContained.horizontalRange; }
// public float maxRange() { return wrapperContained.maxRange; }
// public java.util.List targets() { return wrapperContained.targets; }
// public java.util.Optional lastPos() { return wrapperContained.lastPos; }
// public yarnwrap.util.math.Vec3d lastTarget() { return new yarnwrap.util.math.Vec3d(wrapperContained.lastTarget); }
// public int cooldown() { return wrapperContained.cooldown; }
// public long targetTime() { return wrapperContained.targetTime; }
// public java.util.function.Function entityToSound() { return wrapperContained.entityToSound; }
// public java.util.List RAM_RANGES() { return wrapperContained.RAM_RANGES; }
// public java.util.function.BiPredicate jumpToPredicate() { return wrapperContained.jumpToPredicate; }
// public yarnwrap.util.math.Vec3d getJumpingVelocity(yarnwrap.entity.mob.MobEntity entity,yarnwrap.util.math.Vec3d targetPos) { return new yarnwrap.util.math.Vec3d(wrapperContained.getJumpingVelocity(entity.wrapperContained,targetPos.wrapperContained)); }
// public java.util.Optional getTarget(yarnwrap.server.world.ServerWorld world) { return wrapperContained.getTarget(world.wrapperContained); }
// public boolean canJumpTo(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.mob.MobEntity entity,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canJumpTo(world.wrapperContained,entity.wrapperContained,pos.wrapperContained); }
// public void findTarget(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.mob.MobEntity entity,long time) { wrapperContained.findTarget(world.wrapperContained,entity.wrapperContained,time); }
public boolean shouldJumpTo(yarnwrap.entity.mob.MobEntity entity,yarnwrap.util.math.BlockPos pos) { return wrapperContained.shouldJumpTo(entity.wrapperContained,pos.wrapperContained); }

}