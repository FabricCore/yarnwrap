package yarnwrap.entity.passive;
public class GoatBrain { public net.minecraft.entity.passive.GoatBrain wrapperContained; public GoatBrain(net.minecraft.entity.passive.GoatBrain wrapperContained) { this.wrapperContained = wrapperContained; }

// public float FOLLOWING_TARGET_WALK_SPEED() { return wrapperContained.FOLLOWING_TARGET_WALK_SPEED; }
// public yarnwrap.util.math.intprovider.UniformIntProvider WALKING_SPEED() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.WALKING_SPEED); }
// public float TEMPTED_WALK_SPEED() { return wrapperContained.TEMPTED_WALK_SPEED; }
// public float FOLLOW_ADULT_WALK_SPEED() { return wrapperContained.FOLLOW_ADULT_WALK_SPEED; }
// public float NORMAL_WALK_SPEED() { return wrapperContained.NORMAL_WALK_SPEED; }
// public yarnwrap.util.math.intprovider.UniformIntProvider LONG_JUMP_COOLDOWN_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.LONG_JUMP_COOLDOWN_RANGE); }
public int PREPARE_RAM_DURATION() { return wrapperContained.PREPARE_RAM_DURATION; }
public int MAX_RAM_TARGET_DISTANCE() { return wrapperContained.MAX_RAM_TARGET_DISTANCE; }
public int LONG_JUMP_VERTICAL_RANGE() { return wrapperContained.LONG_JUMP_VERTICAL_RANGE; }
public int LONG_JUMP_HORIZONTAL_RANGE() { return wrapperContained.LONG_JUMP_HORIZONTAL_RANGE; }
public int MIN_RAM_TARGET_DISTANCE() { return wrapperContained.MIN_RAM_TARGET_DISTANCE; }
public float ADULT_RAM_STRENGTH_MULTIPLIER() { return wrapperContained.ADULT_RAM_STRENGTH_MULTIPLIER; }
public float BABY_RAM_STRENGTH_MULTIPLIER() { return wrapperContained.BABY_RAM_STRENGTH_MULTIPLIER; }
// public float PREPARING_RAM_WALK_SPEED() { return wrapperContained.PREPARING_RAM_WALK_SPEED; }
// public yarnwrap.util.math.intprovider.UniformIntProvider RAM_COOLDOWN_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.RAM_COOLDOWN_RANGE); }
// public yarnwrap.entity.ai.TargetPredicate RAM_TARGET_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.RAM_TARGET_PREDICATE); }
// public float RAM_SPEED() { return wrapperContained.RAM_SPEED; }
// public yarnwrap.util.math.intprovider.UniformIntProvider SCREAMING_RAM_COOLDOWN_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.SCREAMING_RAM_COOLDOWN_RANGE); }
public java.util.function.Predicate getTemptItemPredicate() { return wrapperContained.getTemptItemPredicate(); }
// public yarnwrap.entity.ai.brain.Brain create(yarnwrap.entity.ai.brain.Brain brain) { return new yarnwrap.entity.ai.brain.Brain(wrapperContained.create(brain.wrapperContained)); }
// public void resetLongJumpCooldown(yarnwrap.entity.passive.GoatEntity goat,yarnwrap.util.math.random.Random random) { wrapperContained.resetLongJumpCooldown(goat.wrapperContained,random.wrapperContained); }
// public void addCoreActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addCoreActivities(brain.wrapperContained); }
public void updateActivities(yarnwrap.entity.passive.GoatEntity goat) { wrapperContained.updateActivities(goat.wrapperContained); }
// public void addIdleActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addIdleActivities(brain.wrapperContained); }
// public void addLongJumpActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addLongJumpActivities(brain.wrapperContained); }
// public void addRamActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addRamActivities(brain.wrapperContained); }

}