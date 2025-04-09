package yarnwrap.predicate.entity;
public class LootContextPredicate { public net.minecraft.predicate.entity.LootContextPredicate wrapperContained; public LootContextPredicate(net.minecraft.predicate.entity.LootContextPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List conditions() { return wrapperContained.conditions; }
// public java.util.function.Predicate combinedCondition() { return wrapperContained.combinedCondition; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public boolean test(yarnwrap.loot.context.LootContext context) { return wrapperContained.test(context.wrapperContained); }
public yarnwrap.predicate.entity.LootContextPredicate create(net.minecraft.loot.condition.LootCondition[] conditions) { return new yarnwrap.predicate.entity.LootContextPredicate(wrapperContained.create(conditions)); }
public void validateConditions(yarnwrap.loot.LootTableReporter reporter) { wrapperContained.validateConditions(reporter.wrapperContained); }

}