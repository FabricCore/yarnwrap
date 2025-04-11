package yarnwrap.loot.condition;
public class LootConditionConsumingBuilder { public net.minecraft.loot.condition.LootConditionConsumingBuilder wrapperContained; public LootConditionConsumingBuilder(net.minecraft.loot.condition.LootConditionConsumingBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.loot.condition.LootConditionConsumingBuilder conditionally(java.lang.Iterable conditions,java.util.function.Function toBuilderFunction) { return new yarnwrap.loot.condition.LootConditionConsumingBuilder(wrapperContained.conditionally(conditions,toBuilderFunction)); }
public yarnwrap.loot.condition.LootConditionConsumingBuilder getThisConditionConsumingBuilder() { return new yarnwrap.loot.condition.LootConditionConsumingBuilder(wrapperContained.getThisConditionConsumingBuilder()); }
// public yarnwrap.loot.condition.LootConditionConsumingBuilder conditionally(Object condition) { return new yarnwrap.loot.condition.LootConditionConsumingBuilder(wrapperContained.conditionally(condition)); }

}