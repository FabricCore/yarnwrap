package yarnwrap.predicate.entity;
public class LootContextPredicate { public net.minecraft.predicate.entity.LootContextPredicate wrapperContained; public LootContextPredicate(net.minecraft.predicate.entity.LootContextPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List conditions() { return wrapperContained.conditions; }
// public void conditions(java.util.List value) { wrapperContained.conditions = value; }
// public java.util.function.Predicate combinedCondition() { return wrapperContained.combinedCondition; }
// public void combinedCondition(java.util.function.Predicate value) { wrapperContained.combinedCondition = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public LootContextPredicate(java.util.List conditions) { this.wrapperContained = new net.minecraft.predicate.entity.LootContextPredicate(conditions); }
public boolean test(yarnwrap.loot.context.LootContext context) { return wrapperContained.test(context.wrapperContained); }
public yarnwrap.predicate.entity.LootContextPredicate create(net.minecraft.loot.condition.LootCondition[] conditions) { return new yarnwrap.predicate.entity.LootContextPredicate(wrapperContained.create(conditions)); }
// public java.util.List method_54958(yarnwrap.predicate.entity.LootContextPredicate lootContextPredicate) { return wrapperContained.method_54958(lootContextPredicate.wrapperContained); }
public void validateConditions(yarnwrap.loot.LootTableReporter reporter) { wrapperContained.validateConditions(reporter.wrapperContained); }

}