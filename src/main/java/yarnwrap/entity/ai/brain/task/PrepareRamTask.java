package yarnwrap.entity.ai.brain.task;
public class PrepareRamTask { public net.minecraft.entity.ai.brain.task.PrepareRamTask wrapperContained; public PrepareRamTask(net.minecraft.entity.ai.brain.task.PrepareRamTask wrapperContained) { this.wrapperContained = wrapperContained; }

public int RUN_TIME() { return wrapperContained.RUN_TIME; }
// public void RUN_TIME(int value) { wrapperContained.RUN_TIME = value; }
// public java.util.function.ToIntFunction cooldownFactory() { return wrapperContained.cooldownFactory; }
// public void cooldownFactory(java.util.function.ToIntFunction value) { wrapperContained.cooldownFactory = value; }
// public int minRamDistance() { return wrapperContained.minRamDistance; }
// public void minRamDistance(int value) { wrapperContained.minRamDistance = value; }
// public int maxRamDistance() { return wrapperContained.maxRamDistance; }
// public void maxRamDistance(int value) { wrapperContained.maxRamDistance = value; }
// public float speed() { return wrapperContained.speed; }
// public void speed(float value) { wrapperContained.speed = value; }
// public yarnwrap.entity.ai.TargetPredicate targetPredicate() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.targetPredicate); }
// public void targetPredicate(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.targetPredicate = value.wrapperContained; }
// public int prepareTime() { return wrapperContained.prepareTime; }
// public void prepareTime(int value) { wrapperContained.prepareTime = value; }
// public java.util.function.Function soundFactory() { return wrapperContained.soundFactory; }
// public void soundFactory(java.util.function.Function value) { wrapperContained.soundFactory = value; }
// public java.util.Optional prepareStartTime() { return wrapperContained.prepareStartTime; }
// public void prepareStartTime(java.util.Optional value) { wrapperContained.prepareStartTime = value; }
// public java.util.Optional ram() { return wrapperContained.ram; }
// public void ram(java.util.Optional value) { wrapperContained.ram = value; }
// public java.util.Optional findRamStart(yarnwrap.entity.mob.PathAwareEntity entity,yarnwrap.entity.LivingEntity target) { return wrapperContained.findRamStart(entity.wrapperContained,target.wrapperContained); }
// public boolean canReach(yarnwrap.entity.mob.PathAwareEntity entity,yarnwrap.util.math.BlockPos target) { return wrapperContained.canReach(entity.wrapperContained,target.wrapperContained); }
// public yarnwrap.util.math.Vec3d calculateRamTarget(yarnwrap.util.math.BlockPos start,yarnwrap.util.math.BlockPos end) { return new yarnwrap.util.math.Vec3d(wrapperContained.calculateRamTarget(start.wrapperContained,end.wrapperContained)); }
// public void findRam(yarnwrap.entity.mob.PathAwareEntity entity,yarnwrap.entity.LivingEntity target) { wrapperContained.findRam(entity.wrapperContained,target.wrapperContained); }

}