package yarnwrap.loot.condition;
public class AnyOfLootCondition { public net.minecraft.loot.condition.AnyOfLootCondition wrapperContained; public AnyOfLootCondition(net.minecraft.loot.condition.AnyOfLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public Object builder(Object[] terms) { return wrapperContained.builder(terms); }

}