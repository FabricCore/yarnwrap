package yarnwrap.entity.ai.brain;
public class LivingTargetCache { public net.minecraft.entity.ai.brain.LivingTargetCache wrapperContained; public LivingTargetCache(net.minecraft.entity.ai.brain.LivingTargetCache wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.brain.LivingTargetCache EMPTY() { return new yarnwrap.entity.ai.brain.LivingTargetCache(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.entity.ai.brain.LivingTargetCache value) { wrapperContained.EMPTY = value.wrapperContained; }
// public static yarnwrap.entity.ai.brain.LivingTargetCache EMPTY() { return new yarnwrap.entity.ai.brain.LivingTargetCache(net.minecraft.entity.ai.brain.LivingTargetCache.EMPTY); }
// public static void EMPTY(yarnwrap.entity.ai.brain.LivingTargetCache value, ) { net.minecraft.entity.ai.brain.LivingTargetCache.EMPTY = value.wrapperContained; }

// public java.util.List entities() { return wrapperContained.entities; }
// public void entities(java.util.List value) { wrapperContained.entities = value; }
// public static java.util.List entities() { return net.minecraft.entity.ai.brain.LivingTargetCache.entities; }
// public static void entities(java.util.List value, ) { net.minecraft.entity.ai.brain.LivingTargetCache.entities = value; }

// public java.util.function.Predicate targetPredicate() { return wrapperContained.targetPredicate; }
// public void targetPredicate(java.util.function.Predicate value) { wrapperContained.targetPredicate = value; }
// public static java.util.function.Predicate targetPredicate() { return net.minecraft.entity.ai.brain.LivingTargetCache.targetPredicate; }
// public static void targetPredicate(java.util.function.Predicate value, ) { net.minecraft.entity.ai.brain.LivingTargetCache.targetPredicate = value; }

public LivingTargetCache(yarnwrap.entity.LivingEntity owner,java.util.List entities) { this.wrapperContained = new net.minecraft.entity.ai.brain.LivingTargetCache(owner.wrapperContained,entities); }
// public yarnwrap.entity.ai.brain.LivingTargetCache empty() { return new yarnwrap.entity.ai.brain.LivingTargetCache(wrapperContained.empty()); }
public static yarnwrap.entity.ai.brain.LivingTargetCache empty() { return new yarnwrap.entity.ai.brain.LivingTargetCache(net.minecraft.entity.ai.brain.LivingTargetCache.empty()); }
public boolean contains(yarnwrap.entity.LivingEntity entity) { return wrapperContained.contains(entity.wrapperContained); }
// public static boolean contains(yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.entity.ai.brain.LivingTargetCache.contains(entity.wrapperContained); }
// public boolean method_38973(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_38973(entity.wrapperContained); }
// public static boolean method_38973(yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.entity.ai.brain.LivingTargetCache.method_38973(entity.wrapperContained); }
// public boolean method_38974(it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap entity) { return wrapperContained.method_38974(entity); }
// public static boolean method_38974(it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap entity, ) { return net.minecraft.entity.ai.brain.LivingTargetCache.method_38974(entity); }
public java.util.Optional findFirst(java.util.function.Predicate predicate) { return wrapperContained.findFirst(predicate); }
// public static java.util.Optional findFirst(java.util.function.Predicate predicate, ) { return net.minecraft.entity.ai.brain.LivingTargetCache.findFirst(predicate); }
// public boolean method_38976(java.util.function.Predicate entity) { return wrapperContained.method_38976(entity); }
// public static boolean method_38976(java.util.function.Predicate entity, ) { return net.minecraft.entity.ai.brain.LivingTargetCache.method_38976(entity); }
// public boolean method_38977(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_38977(entity.wrapperContained); }
// public static boolean method_38977(yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.entity.ai.brain.LivingTargetCache.method_38977(entity.wrapperContained); }
public java.lang.Iterable iterate(java.util.function.Predicate predicate) { return wrapperContained.iterate(predicate); }
// public static java.lang.Iterable iterate(java.util.function.Predicate predicate, ) { return net.minecraft.entity.ai.brain.LivingTargetCache.iterate(predicate); }
// public boolean method_38979(java.util.function.Predicate entity) { return wrapperContained.method_38979(entity); }
// public static boolean method_38979(java.util.function.Predicate entity, ) { return net.minecraft.entity.ai.brain.LivingTargetCache.method_38979(entity); }
public java.util.stream.Stream stream(java.util.function.Predicate predicate) { return wrapperContained.stream(predicate); }
// public static java.util.stream.Stream stream(java.util.function.Predicate predicate, ) { return net.minecraft.entity.ai.brain.LivingTargetCache.stream(predicate); }
public boolean anyMatch(java.util.function.Predicate predicate) { return wrapperContained.anyMatch(predicate); }
// public static boolean anyMatch(java.util.function.Predicate predicate, ) { return net.minecraft.entity.ai.brain.LivingTargetCache.anyMatch(predicate); }

}