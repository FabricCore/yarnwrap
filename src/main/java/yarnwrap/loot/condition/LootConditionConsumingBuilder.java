package yarnwrap.loot.condition;
public class LootConditionConsumingBuilder { public net.minecraft.loot.condition.LootConditionConsumingBuilder wrapperContained; public LootConditionConsumingBuilder(net.minecraft.loot.condition.LootConditionConsumingBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.loot.condition.LootConditionConsumingBuilder getThisConditionConsumingBuilder() { return new yarnwrap.loot.condition.LootConditionConsumingBuilder(wrapperContained.getThisConditionConsumingBuilder()); }
// public static yarnwrap.loot.condition.LootConditionConsumingBuilder getThisConditionConsumingBuilder() { return new yarnwrap.loot.condition.LootConditionConsumingBuilder(net.minecraft.loot.condition.LootConditionConsumingBuilder.getThisConditionConsumingBuilder()); }
// public yarnwrap.loot.condition.LootConditionConsumingBuilder conditionally(Object condition) { return new yarnwrap.loot.condition.LootConditionConsumingBuilder(wrapperContained.conditionally(condition)); }
// public static yarnwrap.loot.condition.LootConditionConsumingBuilder conditionally(Object condition, ) { return new yarnwrap.loot.condition.LootConditionConsumingBuilder(net.minecraft.loot.condition.LootConditionConsumingBuilder.conditionally(condition)); }
public yarnwrap.loot.condition.LootConditionConsumingBuilder conditionally(java.lang.Iterable conditions,java.util.function.Function toBuilderFunction) { return new yarnwrap.loot.condition.LootConditionConsumingBuilder(wrapperContained.conditionally(conditions,toBuilderFunction)); }
// public static yarnwrap.loot.condition.LootConditionConsumingBuilder conditionally(java.lang.Iterable conditions,java.util.function.Function toBuilderFunction, ) { return new yarnwrap.loot.condition.LootConditionConsumingBuilder(net.minecraft.loot.condition.LootConditionConsumingBuilder.conditionally(conditions,toBuilderFunction)); }

}