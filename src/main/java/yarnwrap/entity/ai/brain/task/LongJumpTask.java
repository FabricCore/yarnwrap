package yarnwrap.entity.ai.brain.task;
public class LongJumpTask { public net.minecraft.entity.ai.brain.task.LongJumpTask wrapperContained; public LongJumpTask(net.minecraft.entity.ai.brain.task.LongJumpTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int RUN_TIME() { return wrapperContained.RUN_TIME; }
// public void RUN_TIME(int value) { wrapperContained.RUN_TIME = value; }
// public int MAX_COOLDOWN() { return wrapperContained.MAX_COOLDOWN; }
// public void MAX_COOLDOWN(int value) { wrapperContained.MAX_COOLDOWN = value; }
// public int TARGET_RETAIN_TIME() { return wrapperContained.TARGET_RETAIN_TIME; }
// public void TARGET_RETAIN_TIME(int value) { wrapperContained.TARGET_RETAIN_TIME = value; }
// public int PATHING_DISTANCE() { return wrapperContained.PATHING_DISTANCE; }
// public void PATHING_DISTANCE(int value) { wrapperContained.PATHING_DISTANCE = value; }
// public yarnwrap.util.math.intprovider.UniformIntProvider cooldownRange() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.cooldownRange); }
// public void cooldownRange(yarnwrap.util.math.intprovider.UniformIntProvider value) { wrapperContained.cooldownRange = value.wrapperContained; }
// public int verticalRange() { return wrapperContained.verticalRange; }
// public void verticalRange(int value) { wrapperContained.verticalRange = value; }
// public int horizontalRange() { return wrapperContained.horizontalRange; }
// public void horizontalRange(int value) { wrapperContained.horizontalRange = value; }
// public float maxRange() { return wrapperContained.maxRange; }
// public void maxRange(float value) { wrapperContained.maxRange = value; }
// public java.util.List targets() { return wrapperContained.targets; }
// public void targets(java.util.List value) { wrapperContained.targets = value; }
// public java.util.Optional lastPos() { return wrapperContained.lastPos; }
// public void lastPos(java.util.Optional value) { wrapperContained.lastPos = value; }
// public yarnwrap.util.math.Vec3d lastTarget() { return new yarnwrap.util.math.Vec3d(wrapperContained.lastTarget); }
// public void lastTarget(yarnwrap.util.math.Vec3d value) { wrapperContained.lastTarget = value.wrapperContained; }
// public int cooldown() { return wrapperContained.cooldown; }
// public void cooldown(int value) { wrapperContained.cooldown = value; }
// public long targetTime() { return wrapperContained.targetTime; }
// public void targetTime(long value) { wrapperContained.targetTime = value; }
// public java.util.function.Function entityToSound() { return wrapperContained.entityToSound; }
// public void entityToSound(java.util.function.Function value) { wrapperContained.entityToSound = value; }
// public java.util.List RAM_RANGES() { return wrapperContained.RAM_RANGES; }
// public void RAM_RANGES(java.util.List value) { wrapperContained.RAM_RANGES = value; }
// public java.util.function.BiPredicate jumpToPredicate() { return wrapperContained.jumpToPredicate; }
// public void jumpToPredicate(java.util.function.BiPredicate value) { wrapperContained.jumpToPredicate = value; }
public LongJumpTask(yarnwrap.util.math.intprovider.UniformIntProvider cooldownRange,int verticalRange,int horizontalRange,float maxRange,java.util.function.Function entityToSound) { this.wrapperContained = new net.minecraft.entity.ai.brain.task.LongJumpTask(cooldownRange.wrapperContained,verticalRange,horizontalRange,maxRange,entityToSound); }
public LongJumpTask(yarnwrap.util.math.intprovider.UniformIntProvider cooldownRange,int verticalRange,int horizontalRange,float maxRange,java.util.function.Function entityToSound,java.util.function.BiPredicate jumpToPredicate) { this.wrapperContained = new net.minecraft.entity.ai.brain.task.LongJumpTask(cooldownRange.wrapperContained,verticalRange,horizontalRange,maxRange,entityToSound,jumpToPredicate); }
// public yarnwrap.util.math.Vec3d getJumpingVelocity(yarnwrap.entity.mob.MobEntity entity,yarnwrap.util.math.Vec3d targetPos) { return new yarnwrap.util.math.Vec3d(wrapperContained.getJumpingVelocity(entity.wrapperContained,targetPos.wrapperContained)); }
// public java.util.Optional getTarget(yarnwrap.server.world.ServerWorld world) { return wrapperContained.getTarget(world.wrapperContained); }
// public boolean canJumpTo(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.mob.MobEntity entity,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canJumpTo(world.wrapperContained,entity.wrapperContained,pos.wrapperContained); }
// public void findTarget(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.mob.MobEntity entity,long time) { wrapperContained.findTarget(world.wrapperContained,entity.wrapperContained,time); }
public boolean shouldJumpTo(yarnwrap.entity.mob.MobEntity entity,yarnwrap.util.math.BlockPos pos) { return wrapperContained.shouldJumpTo(entity.wrapperContained,pos.wrapperContained); }

}