package yarnwrap.entity.passive;
public class GoatBrain { public net.minecraft.entity.passive.GoatBrain wrapperContained; public GoatBrain(net.minecraft.entity.passive.GoatBrain wrapperContained) { this.wrapperContained = wrapperContained; }

// public float FOLLOWING_TARGET_WALK_SPEED() { return wrapperContained.FOLLOWING_TARGET_WALK_SPEED; }
// public void FOLLOWING_TARGET_WALK_SPEED(float value) { wrapperContained.FOLLOWING_TARGET_WALK_SPEED = value; }
// public yarnwrap.util.math.intprovider.UniformIntProvider WALKING_SPEED() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.WALKING_SPEED); }
// public void WALKING_SPEED(yarnwrap.util.math.intprovider.UniformIntProvider value) { wrapperContained.WALKING_SPEED = value.wrapperContained; }
// public float TEMPTED_WALK_SPEED() { return wrapperContained.TEMPTED_WALK_SPEED; }
// public void TEMPTED_WALK_SPEED(float value) { wrapperContained.TEMPTED_WALK_SPEED = value; }
// public float FOLLOW_ADULT_WALK_SPEED() { return wrapperContained.FOLLOW_ADULT_WALK_SPEED; }
// public void FOLLOW_ADULT_WALK_SPEED(float value) { wrapperContained.FOLLOW_ADULT_WALK_SPEED = value; }
// public float NORMAL_WALK_SPEED() { return wrapperContained.NORMAL_WALK_SPEED; }
// public void NORMAL_WALK_SPEED(float value) { wrapperContained.NORMAL_WALK_SPEED = value; }
// public yarnwrap.util.math.intprovider.UniformIntProvider LONG_JUMP_COOLDOWN_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.LONG_JUMP_COOLDOWN_RANGE); }
// public void LONG_JUMP_COOLDOWN_RANGE(yarnwrap.util.math.intprovider.UniformIntProvider value) { wrapperContained.LONG_JUMP_COOLDOWN_RANGE = value.wrapperContained; }
public int PREPARE_RAM_DURATION() { return wrapperContained.PREPARE_RAM_DURATION; }
// public void PREPARE_RAM_DURATION(int value) { wrapperContained.PREPARE_RAM_DURATION = value; }
public int MAX_RAM_TARGET_DISTANCE() { return wrapperContained.MAX_RAM_TARGET_DISTANCE; }
// public void MAX_RAM_TARGET_DISTANCE(int value) { wrapperContained.MAX_RAM_TARGET_DISTANCE = value; }
public int LONG_JUMP_VERTICAL_RANGE() { return wrapperContained.LONG_JUMP_VERTICAL_RANGE; }
// public void LONG_JUMP_VERTICAL_RANGE(int value) { wrapperContained.LONG_JUMP_VERTICAL_RANGE = value; }
public int LONG_JUMP_HORIZONTAL_RANGE() { return wrapperContained.LONG_JUMP_HORIZONTAL_RANGE; }
// public void LONG_JUMP_HORIZONTAL_RANGE(int value) { wrapperContained.LONG_JUMP_HORIZONTAL_RANGE = value; }
public int MIN_RAM_TARGET_DISTANCE() { return wrapperContained.MIN_RAM_TARGET_DISTANCE; }
// public void MIN_RAM_TARGET_DISTANCE(int value) { wrapperContained.MIN_RAM_TARGET_DISTANCE = value; }
public float ADULT_RAM_STRENGTH_MULTIPLIER() { return wrapperContained.ADULT_RAM_STRENGTH_MULTIPLIER; }
// public void ADULT_RAM_STRENGTH_MULTIPLIER(float value) { wrapperContained.ADULT_RAM_STRENGTH_MULTIPLIER = value; }
public float BABY_RAM_STRENGTH_MULTIPLIER() { return wrapperContained.BABY_RAM_STRENGTH_MULTIPLIER; }
// public void BABY_RAM_STRENGTH_MULTIPLIER(float value) { wrapperContained.BABY_RAM_STRENGTH_MULTIPLIER = value; }
// public float PREPARING_RAM_WALK_SPEED() { return wrapperContained.PREPARING_RAM_WALK_SPEED; }
// public void PREPARING_RAM_WALK_SPEED(float value) { wrapperContained.PREPARING_RAM_WALK_SPEED = value; }
// public yarnwrap.util.math.intprovider.UniformIntProvider RAM_COOLDOWN_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.RAM_COOLDOWN_RANGE); }
// public void RAM_COOLDOWN_RANGE(yarnwrap.util.math.intprovider.UniformIntProvider value) { wrapperContained.RAM_COOLDOWN_RANGE = value.wrapperContained; }
// public yarnwrap.entity.ai.TargetPredicate RAM_TARGET_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.RAM_TARGET_PREDICATE); }
// public void RAM_TARGET_PREDICATE(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.RAM_TARGET_PREDICATE = value.wrapperContained; }
// public float RAM_SPEED() { return wrapperContained.RAM_SPEED; }
// public void RAM_SPEED(float value) { wrapperContained.RAM_SPEED = value; }
// public yarnwrap.util.math.intprovider.UniformIntProvider SCREAMING_RAM_COOLDOWN_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.SCREAMING_RAM_COOLDOWN_RANGE); }
// public void SCREAMING_RAM_COOLDOWN_RANGE(yarnwrap.util.math.intprovider.UniformIntProvider value) { wrapperContained.SCREAMING_RAM_COOLDOWN_RANGE = value.wrapperContained; }
public java.util.function.Predicate getTemptItemPredicate() { return wrapperContained.getTemptItemPredicate(); }
// public yarnwrap.entity.ai.brain.Brain create(yarnwrap.entity.ai.brain.Brain brain) { return new yarnwrap.entity.ai.brain.Brain(wrapperContained.create(brain.wrapperContained)); }
// public void resetLongJumpCooldown(yarnwrap.entity.passive.GoatEntity goat,yarnwrap.util.math.random.Random random) { wrapperContained.resetLongJumpCooldown(goat.wrapperContained,random.wrapperContained); }
// public void addCoreActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addCoreActivities(brain.wrapperContained); }
public void updateActivities(yarnwrap.entity.passive.GoatEntity goat) { wrapperContained.updateActivities(goat.wrapperContained); }
// public void addIdleActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addIdleActivities(brain.wrapperContained); }
// public void addLongJumpActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addLongJumpActivities(brain.wrapperContained); }
// public void addRamActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addRamActivities(brain.wrapperContained); }

}