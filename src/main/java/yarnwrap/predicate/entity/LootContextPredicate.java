package yarnwrap.predicate.entity;
public class LootContextPredicate { public net.minecraft.predicate.entity.LootContextPredicate wrapperContained; public LootContextPredicate(net.minecraft.predicate.entity.LootContextPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List conditions() { return wrapperContained.conditions; }
// public void conditions(java.util.List value) { wrapperContained.conditions = value; }
// public static java.util.List conditions() { return net.minecraft.predicate.entity.LootContextPredicate.conditions; }
// public static void conditions(java.util.List value, ) { net.minecraft.predicate.entity.LootContextPredicate.conditions = value; }

// public java.util.function.Predicate combinedCondition() { return wrapperContained.combinedCondition; }
// public void combinedCondition(java.util.function.Predicate value) { wrapperContained.combinedCondition = value; }
// public static java.util.function.Predicate combinedCondition() { return net.minecraft.predicate.entity.LootContextPredicate.combinedCondition; }
// public static void combinedCondition(java.util.function.Predicate value, ) { net.minecraft.predicate.entity.LootContextPredicate.combinedCondition = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.entity.LootContextPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.entity.LootContextPredicate.CODEC = value; }

// public LootContextPredicate(java.util.List conditions) { this.wrapperContained = new net.minecraft.predicate.entity.LootContextPredicate(conditions); }
public boolean test(yarnwrap.loot.context.LootContext context) { return wrapperContained.test(context.wrapperContained); }
// public static boolean test(yarnwrap.loot.context.LootContext context, ) { return net.minecraft.predicate.entity.LootContextPredicate.test(context.wrapperContained); }
// public yarnwrap.predicate.entity.LootContextPredicate create(net.minecraft.loot.condition.LootCondition[] conditions) { return new yarnwrap.predicate.entity.LootContextPredicate(wrapperContained.create(conditions)); }
// public static yarnwrap.predicate.entity.LootContextPredicate create(net.minecraft.loot.condition.LootCondition[] conditions, ) { return new yarnwrap.predicate.entity.LootContextPredicate(net.minecraft.predicate.entity.LootContextPredicate.create(conditions)); }
// public java.util.List method_54958(yarnwrap.predicate.entity.LootContextPredicate lootContextPredicate) { return wrapperContained.method_54958(lootContextPredicate.wrapperContained); }
// public static java.util.List method_54958(yarnwrap.predicate.entity.LootContextPredicate lootContextPredicate, ) { return net.minecraft.predicate.entity.LootContextPredicate.method_54958(lootContextPredicate.wrapperContained); }
public void validateConditions(yarnwrap.loot.LootTableReporter reporter) { wrapperContained.validateConditions(reporter.wrapperContained); }
// public static void validateConditions(yarnwrap.loot.LootTableReporter reporter, ) { net.minecraft.predicate.entity.LootContextPredicate.validateConditions(reporter.wrapperContained); }

}