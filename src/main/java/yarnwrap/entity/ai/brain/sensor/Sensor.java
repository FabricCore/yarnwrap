package yarnwrap.entity.ai.brain.sensor;
public class Sensor { public net.minecraft.entity.ai.brain.sensor.Sensor wrapperContained; public Sensor(net.minecraft.entity.ai.brain.sensor.Sensor wrapperContained) { this.wrapperContained = wrapperContained; }

// public long lastSenseTime() { return wrapperContained.lastSenseTime; }
// public void lastSenseTime(long value) { wrapperContained.lastSenseTime = value; }
// public int senseInterval() { return wrapperContained.senseInterval; }
// public void senseInterval(int value) { wrapperContained.senseInterval = value; }
// public yarnwrap.util.math.random.Random RANDOM() { return new yarnwrap.util.math.random.Random(wrapperContained.RANDOM); }
// public void RANDOM(yarnwrap.util.math.random.Random value) { wrapperContained.RANDOM = value.wrapperContained; }
// public yarnwrap.entity.ai.TargetPredicate TARGET_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.TARGET_PREDICATE); }
// public void TARGET_PREDICATE(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.TARGET_PREDICATE = value.wrapperContained; }
// public yarnwrap.entity.ai.TargetPredicate TARGET_PREDICATE_IGNORE_DISTANCE_SCALING() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.TARGET_PREDICATE_IGNORE_DISTANCE_SCALING); }
// public void TARGET_PREDICATE_IGNORE_DISTANCE_SCALING(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.TARGET_PREDICATE_IGNORE_DISTANCE_SCALING = value.wrapperContained; }
// public int BASE_MAX_DISTANCE() { return wrapperContained.BASE_MAX_DISTANCE; }
// public void BASE_MAX_DISTANCE(int value) { wrapperContained.BASE_MAX_DISTANCE = value; }
// public int DEFAULT_RUN_TIME() { return wrapperContained.DEFAULT_RUN_TIME; }
// public void DEFAULT_RUN_TIME(int value) { wrapperContained.DEFAULT_RUN_TIME = value; }
// public yarnwrap.entity.ai.TargetPredicate ATTACKABLE_TARGET_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.ATTACKABLE_TARGET_PREDICATE); }
// public void ATTACKABLE_TARGET_PREDICATE(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.ATTACKABLE_TARGET_PREDICATE = value.wrapperContained; }
// public yarnwrap.entity.ai.TargetPredicate ATTACKABLE_TARGET_PREDICATE_IGNORE_DISTANCE_SCALING() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.ATTACKABLE_TARGET_PREDICATE_IGNORE_DISTANCE_SCALING); }
// public void ATTACKABLE_TARGET_PREDICATE_IGNORE_DISTANCE_SCALING(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.ATTACKABLE_TARGET_PREDICATE_IGNORE_DISTANCE_SCALING = value.wrapperContained; }
// public yarnwrap.entity.ai.TargetPredicate ATTACKABLE_TARGET_PREDICATE_IGNORE_VISIBILITY() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.ATTACKABLE_TARGET_PREDICATE_IGNORE_VISIBILITY); }
// public void ATTACKABLE_TARGET_PREDICATE_IGNORE_VISIBILITY(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.ATTACKABLE_TARGET_PREDICATE_IGNORE_VISIBILITY = value.wrapperContained; }
// public yarnwrap.entity.ai.TargetPredicate ATTACKABLE_TARGET_PREDICATE_IGNORE_VISIBILITY_OR_DISTANCE_SCALING() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.ATTACKABLE_TARGET_PREDICATE_IGNORE_VISIBILITY_OR_DISTANCE_SCALING); }
// public void ATTACKABLE_TARGET_PREDICATE_IGNORE_VISIBILITY_OR_DISTANCE_SCALING(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.ATTACKABLE_TARGET_PREDICATE_IGNORE_VISIBILITY_OR_DISTANCE_SCALING = value.wrapperContained; }
public java.util.Set getOutputMemoryModules() { return wrapperContained.getOutputMemoryModules(); }
public void tick(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity) { wrapperContained.tick(world.wrapperContained,entity.wrapperContained); }
// public void sense(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity) { wrapperContained.sense(world.wrapperContained,entity.wrapperContained); }
public boolean testTargetPredicate(yarnwrap.entity.LivingEntity entity,yarnwrap.entity.LivingEntity target) { return wrapperContained.testTargetPredicate(entity.wrapperContained,target.wrapperContained); }
public boolean testAttackableTargetPredicate(yarnwrap.entity.LivingEntity entity,yarnwrap.entity.LivingEntity target) { return wrapperContained.testAttackableTargetPredicate(entity.wrapperContained,target.wrapperContained); }
public boolean testAttackableTargetPredicateIgnoreVisibility(yarnwrap.entity.LivingEntity entity,yarnwrap.entity.LivingEntity target) { return wrapperContained.testAttackableTargetPredicateIgnoreVisibility(entity.wrapperContained,target.wrapperContained); }

}