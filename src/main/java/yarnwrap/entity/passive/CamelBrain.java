package yarnwrap.entity.passive;
public class CamelBrain { public net.minecraft.entity.passive.CamelBrain wrapperContained; public CamelBrain(net.minecraft.entity.passive.CamelBrain wrapperContained) { this.wrapperContained = wrapperContained; }

// public float WALK_SPEED() { return wrapperContained.WALK_SPEED; }
// public void WALK_SPEED(float value) { wrapperContained.WALK_SPEED = value; }
// public float BREED_SPEED() { return wrapperContained.BREED_SPEED; }
// public void BREED_SPEED(float value) { wrapperContained.BREED_SPEED = value; }
// public yarnwrap.util.math.intprovider.UniformIntProvider WALK_TOWARD_ADULT_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.WALK_TOWARD_ADULT_RANGE); }
// public void WALK_TOWARD_ADULT_RANGE(yarnwrap.util.math.intprovider.UniformIntProvider value) { wrapperContained.WALK_TOWARD_ADULT_RANGE = value.wrapperContained; }
// public com.google.common.collect.ImmutableList SENSORS() { return wrapperContained.SENSORS; }
// public void SENSORS(com.google.common.collect.ImmutableList value) { wrapperContained.SENSORS = value; }
// public com.google.common.collect.ImmutableList MEMORY_MODULES() { return wrapperContained.MEMORY_MODULES; }
// public void MEMORY_MODULES(com.google.common.collect.ImmutableList value) { wrapperContained.MEMORY_MODULES = value; }
public Object createProfile() { return wrapperContained.createProfile(); }
// public yarnwrap.entity.ai.brain.Brain create(yarnwrap.entity.ai.brain.Brain brain) { return new yarnwrap.entity.ai.brain.Brain(wrapperContained.create(brain.wrapperContained)); }
public void updateActivities(yarnwrap.entity.passive.CamelEntity camel) { wrapperContained.updateActivities(camel.wrapperContained); }
// public void initialize(yarnwrap.entity.passive.CamelEntity camel,yarnwrap.util.math.random.Random random) { wrapperContained.initialize(camel.wrapperContained,random.wrapperContained); }
public java.util.function.Predicate getTemptItemPredicate() { return wrapperContained.getTemptItemPredicate(); }
// public void addCoreActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addCoreActivities(brain.wrapperContained); }
// public void addIdleActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addIdleActivities(brain.wrapperContained); }

}