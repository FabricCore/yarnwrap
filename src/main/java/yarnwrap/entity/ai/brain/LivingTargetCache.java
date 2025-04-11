package yarnwrap.entity.ai.brain;
public class LivingTargetCache { public net.minecraft.entity.ai.brain.LivingTargetCache wrapperContained; public LivingTargetCache(net.minecraft.entity.ai.brain.LivingTargetCache wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.brain.LivingTargetCache EMPTY() { return new yarnwrap.entity.ai.brain.LivingTargetCache(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.entity.ai.brain.LivingTargetCache value) { wrapperContained.EMPTY = value.wrapperContained; }
// public java.util.List entities() { return wrapperContained.entities; }
// public void entities(java.util.List value) { wrapperContained.entities = value; }
// public java.util.function.Predicate targetPredicate() { return wrapperContained.targetPredicate; }
// public void targetPredicate(java.util.function.Predicate value) { wrapperContained.targetPredicate = value; }
public yarnwrap.entity.ai.brain.LivingTargetCache empty() { return new yarnwrap.entity.ai.brain.LivingTargetCache(wrapperContained.empty()); }
public boolean contains(yarnwrap.entity.LivingEntity entity) { return wrapperContained.contains(entity.wrapperContained); }
public java.util.Optional findFirst(java.util.function.Predicate predicate) { return wrapperContained.findFirst(predicate); }
public java.lang.Iterable iterate(java.util.function.Predicate predicate) { return wrapperContained.iterate(predicate); }
public java.util.stream.Stream stream(java.util.function.Predicate predicate) { return wrapperContained.stream(predicate); }
public boolean anyMatch(java.util.function.Predicate predicate) { return wrapperContained.anyMatch(predicate); }

}