package yarnwrap.entity.ai.brain.task;
public class FrogEatEntityTask { public net.minecraft.entity.ai.brain.task.FrogEatEntityTask wrapperContained; public FrogEatEntityTask(net.minecraft.entity.ai.brain.task.FrogEatEntityTask wrapperContained) { this.wrapperContained = wrapperContained; }

public int RUN_TIME() { return wrapperContained.RUN_TIME; }
public int EAT_DURATION() { return wrapperContained.EAT_DURATION; }
// public float MAX_DISTANCE() { return wrapperContained.MAX_DISTANCE; }
// public float VELOCITY_MULTIPLIER() { return wrapperContained.VELOCITY_MULTIPLIER; }
// public int eatTick() { return wrapperContained.eatTick; }
// public int moveToTargetTick() { return wrapperContained.moveToTargetTick; }
// public yarnwrap.sound.SoundEvent tongueSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.tongueSound); }
// public yarnwrap.sound.SoundEvent eatSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.eatSound); }
// public yarnwrap.util.math.Vec3d targetPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.targetPos); }
// public Object phase() { return wrapperContained.phase; }
public int CATCH_DURATION() { return wrapperContained.CATCH_DURATION; }
public int UNREACHABLE_TONGUE_TARGETS_START_TIME() { return wrapperContained.UNREACHABLE_TONGUE_TARGETS_START_TIME; }
public int MAX_UNREACHABLE_TONGUE_TARGETS() { return wrapperContained.MAX_UNREACHABLE_TONGUE_TARGETS; }
// public void eat(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.passive.FrogEntity frog) { wrapperContained.eat(world.wrapperContained,frog.wrapperContained); }
// public boolean isTargetReachable(yarnwrap.entity.passive.FrogEntity entity,yarnwrap.entity.LivingEntity target) { return wrapperContained.isTargetReachable(entity.wrapperContained,target.wrapperContained); }
// public void markTargetAsUnreachable(yarnwrap.entity.passive.FrogEntity entity,yarnwrap.entity.LivingEntity target) { wrapperContained.markTargetAsUnreachable(entity.wrapperContained,target.wrapperContained); }

}