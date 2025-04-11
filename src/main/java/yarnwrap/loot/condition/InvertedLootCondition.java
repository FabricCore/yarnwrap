package yarnwrap.loot.condition;
public class InvertedLootCondition { public net.minecraft.loot.condition.InvertedLootCondition wrapperContained; public InvertedLootCondition(net.minecraft.loot.condition.InvertedLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public Object builder(Object term) { return wrapperContained.builder(term); }

}