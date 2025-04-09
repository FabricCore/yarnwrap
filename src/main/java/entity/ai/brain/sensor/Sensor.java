package yarnwrap.entity.ai.brain.sensor;
public class Sensor { public net.minecraft.entity.ai.brain.sensor.Sensor wrapperContained; public Sensor(net.minecraft.entity.ai.brain.sensor.Sensor wrapperContained) { this.wrapperContained = wrapperContained; }

// public long lastSenseTime() { return wrapperContained.lastSenseTime; }
// public int senseInterval() { return wrapperContained.senseInterval; }
// public yarnwrap.util.math.random.Random RANDOM() { return new yarnwrap.util.math.random.Random(wrapperContained.RANDOM); }
// public yarnwrap.entity.ai.TargetPredicate TARGET_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.TARGET_PREDICATE); }
// public yarnwrap.entity.ai.TargetPredicate TARGET_PREDICATE_IGNORE_DISTANCE_SCALING() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.TARGET_PREDICATE_IGNORE_DISTANCE_SCALING); }
// public int BASE_MAX_DISTANCE() { return wrapperContained.BASE_MAX_DISTANCE; }
// public int DEFAULT_RUN_TIME() { return wrapperContained.DEFAULT_RUN_TIME; }
// public yarnwrap.entity.ai.TargetPredicate ATTACKABLE_TARGET_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.ATTACKABLE_TARGET_PREDICATE); }
// public yarnwrap.entity.ai.TargetPredicate ATTACKABLE_TARGET_PREDICATE_IGNORE_DISTANCE_SCALING() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.ATTACKABLE_TARGET_PREDICATE_IGNORE_DISTANCE_SCALING); }
// public yarnwrap.entity.ai.TargetPredicate ATTACKABLE_TARGET_PREDICATE_IGNORE_VISIBILITY() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.ATTACKABLE_TARGET_PREDICATE_IGNORE_VISIBILITY); }
// public yarnwrap.entity.ai.TargetPredicate ATTACKABLE_TARGET_PREDICATE_IGNORE_VISIBILITY_OR_DISTANCE_SCALING() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.ATTACKABLE_TARGET_PREDICATE_IGNORE_VISIBILITY_OR_DISTANCE_SCALING); }
public java.util.Set getOutputMemoryModules() { return wrapperContained.getOutputMemoryModules(); }
public void tick(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity) { wrapperContained.tick(world.wrapperContained,entity.wrapperContained); }
// public void sense(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity) { wrapperContained.sense(world.wrapperContained,entity.wrapperContained); }
public boolean testTargetPredicate(yarnwrap.entity.LivingEntity entity,yarnwrap.entity.LivingEntity target) { return wrapperContained.testTargetPredicate(entity.wrapperContained,target.wrapperContained); }
public boolean testAttackableTargetPredicate(yarnwrap.entity.LivingEntity entity,yarnwrap.entity.LivingEntity target) { return wrapperContained.testAttackableTargetPredicate(entity.wrapperContained,target.wrapperContained); }
public boolean testAttackableTargetPredicateIgnoreVisibility(yarnwrap.entity.LivingEntity entity,yarnwrap.entity.LivingEntity target) { return wrapperContained.testAttackableTargetPredicateIgnoreVisibility(entity.wrapperContained,target.wrapperContained); }

}