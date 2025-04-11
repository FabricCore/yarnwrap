package yarnwrap.loot.condition;
public class ValueCheckLootCondition { public net.minecraft.loot.condition.ValueCheckLootCondition wrapperContained; public ValueCheckLootCondition(net.minecraft.loot.condition.ValueCheckLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.provider.number.LootNumberProvider value() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.value); }
// public void value(yarnwrap.loot.provider.number.LootNumberProvider value) { wrapperContained.value = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.loot.provider.number.LootNumberProvider value() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.value()); }
public Object builder(yarnwrap.loot.provider.number.LootNumberProvider value,yarnwrap.loot.operator.BoundedIntUnaryOperator range) { return wrapperContained.builder(value.wrapperContained,range.wrapperContained); }

}