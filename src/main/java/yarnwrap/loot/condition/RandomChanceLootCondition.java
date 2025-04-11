package yarnwrap.loot.condition;
public class RandomChanceLootCondition { public net.minecraft.loot.condition.RandomChanceLootCondition wrapperContained; public RandomChanceLootCondition(net.minecraft.loot.condition.RandomChanceLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public Object builder(yarnwrap.loot.provider.number.LootNumberProvider chance) { return wrapperContained.builder(chance.wrapperContained); }
public Object builder(float chance) { return wrapperContained.builder(chance); }

}