package yarnwrap.entity.passive;
public class ArmadilloBrain { public net.minecraft.entity.passive.ArmadilloBrain wrapperContained; public ArmadilloBrain(net.minecraft.entity.passive.ArmadilloBrain wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.intprovider.UniformIntProvider WALK_TOWARDS_CLOSEST_ADULT_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.WALK_TOWARDS_CLOSEST_ADULT_RANGE); }
// public com.google.common.collect.ImmutableList SENSOR_TYPES() { return wrapperContained.SENSOR_TYPES; }
// public com.google.common.collect.ImmutableList MEMORY_MODULE_TYPES() { return wrapperContained.MEMORY_MODULE_TYPES; }
// public yarnwrap.entity.ai.brain.task.SingleTickTask UNROLL_TASK() { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.UNROLL_TASK); }
public Object createBrainProfile() { return wrapperContained.createBrainProfile(); }
// public yarnwrap.entity.ai.brain.Brain create(yarnwrap.entity.ai.brain.Brain brain) { return new yarnwrap.entity.ai.brain.Brain(wrapperContained.create(brain.wrapperContained)); }
public void updateActivities(yarnwrap.entity.passive.ArmadilloEntity armadillo) { wrapperContained.updateActivities(armadillo.wrapperContained); }
public java.util.function.Predicate getTemptItemPredicate() { return wrapperContained.getTemptItemPredicate(); }
// public void addCoreActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addCoreActivities(brain.wrapperContained); }
// public void addIdleActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addIdleActivities(brain.wrapperContained); }
// public void addPanicActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addPanicActivities(brain.wrapperContained); }

}