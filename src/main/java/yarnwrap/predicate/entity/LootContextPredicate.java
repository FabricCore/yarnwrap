package yarnwrap.predicate.entity;
public class LootContextPredicate { public net.minecraft.predicate.entity.LootContextPredicate wrapperContained; public LootContextPredicate(net.minecraft.predicate.entity.LootContextPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List conditions() { return wrapperContained.conditions; }
// public void conditions(java.util.List value) { wrapperContained.conditions = value; }
// public java.util.function.Predicate combinedCondition() { return wrapperContained.combinedCondition; }
// public void combinedCondition(java.util.function.Predicate value) { wrapperContained.combinedCondition = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public boolean test(yarnwrap.loot.context.LootContext context) { return wrapperContained.test(context.wrapperContained); }
public yarnwrap.predicate.entity.LootContextPredicate create(net.minecraft.loot.condition.LootCondition[] conditions) { return new yarnwrap.predicate.entity.LootContextPredicate(wrapperContained.create(conditions)); }
public void validateConditions(yarnwrap.loot.LootTableReporter reporter) { wrapperContained.validateConditions(reporter.wrapperContained); }

}