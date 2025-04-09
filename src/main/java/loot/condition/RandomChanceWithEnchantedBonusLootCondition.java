package yarnwrap.loot.condition;
public class RandomChanceWithEnchantedBonusLootCondition { public net.minecraft.loot.condition.RandomChanceWithEnchantedBonusLootCondition wrapperContained; public RandomChanceWithEnchantedBonusLootCondition(net.minecraft.loot.condition.RandomChanceWithEnchantedBonusLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public Object builder(Object registryLookup,float base,float perLevelAboveFirst) { return wrapperContained.builder(registryLookup,base,perLevelAboveFirst); }

}