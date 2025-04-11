package yarnwrap.entity.ai.brain.task;
public class FrogEatEntityTask { public net.minecraft.entity.ai.brain.task.FrogEatEntityTask wrapperContained; public FrogEatEntityTask(net.minecraft.entity.ai.brain.task.FrogEatEntityTask wrapperContained) { this.wrapperContained = wrapperContained; }

public int RUN_TIME() { return wrapperContained.RUN_TIME; }
// public void RUN_TIME(int value) { wrapperContained.RUN_TIME = value; }
public int EAT_DURATION() { return wrapperContained.EAT_DURATION; }
// public void EAT_DURATION(int value) { wrapperContained.EAT_DURATION = value; }
// public float MAX_DISTANCE() { return wrapperContained.MAX_DISTANCE; }
// public void MAX_DISTANCE(float value) { wrapperContained.MAX_DISTANCE = value; }
// public float VELOCITY_MULTIPLIER() { return wrapperContained.VELOCITY_MULTIPLIER; }
// public void VELOCITY_MULTIPLIER(float value) { wrapperContained.VELOCITY_MULTIPLIER = value; }
// public int eatTick() { return wrapperContained.eatTick; }
// public void eatTick(int value) { wrapperContained.eatTick = value; }
// public int moveToTargetTick() { return wrapperContained.moveToTargetTick; }
// public void moveToTargetTick(int value) { wrapperContained.moveToTargetTick = value; }
// public yarnwrap.sound.SoundEvent tongueSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.tongueSound); }
// public void tongueSound(yarnwrap.sound.SoundEvent value) { wrapperContained.tongueSound = value.wrapperContained; }
// public yarnwrap.sound.SoundEvent eatSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.eatSound); }
// public void eatSound(yarnwrap.sound.SoundEvent value) { wrapperContained.eatSound = value.wrapperContained; }
// public yarnwrap.util.math.Vec3d targetPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.targetPos); }
// public void targetPos(yarnwrap.util.math.Vec3d value) { wrapperContained.targetPos = value.wrapperContained; }
// public Object phase() { return wrapperContained.phase; }
// // public void phase(Object value) { wrapperContained.phase = value; }
public int CATCH_DURATION() { return wrapperContained.CATCH_DURATION; }
// public void CATCH_DURATION(int value) { wrapperContained.CATCH_DURATION = value; }
public int UNREACHABLE_TONGUE_TARGETS_START_TIME() { return wrapperContained.UNREACHABLE_TONGUE_TARGETS_START_TIME; }
// public void UNREACHABLE_TONGUE_TARGETS_START_TIME(int value) { wrapperContained.UNREACHABLE_TONGUE_TARGETS_START_TIME = value; }
public int MAX_UNREACHABLE_TONGUE_TARGETS() { return wrapperContained.MAX_UNREACHABLE_TONGUE_TARGETS; }
// public void MAX_UNREACHABLE_TONGUE_TARGETS(int value) { wrapperContained.MAX_UNREACHABLE_TONGUE_TARGETS = value; }
// public void eat(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.passive.FrogEntity frog) { wrapperContained.eat(world.wrapperContained,frog.wrapperContained); }
// public boolean isTargetReachable(yarnwrap.entity.passive.FrogEntity entity,yarnwrap.entity.LivingEntity target) { return wrapperContained.isTargetReachable(entity.wrapperContained,target.wrapperContained); }
// public void markTargetAsUnreachable(yarnwrap.entity.passive.FrogEntity entity,yarnwrap.entity.LivingEntity target) { wrapperContained.markTargetAsUnreachable(entity.wrapperContained,target.wrapperContained); }

}