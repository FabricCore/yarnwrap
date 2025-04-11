package yarnwrap.loot.condition;
public class RandomChanceWithEnchantedBonusLootCondition { public net.minecraft.loot.condition.RandomChanceWithEnchantedBonusLootCondition wrapperContained; public RandomChanceWithEnchantedBonusLootCondition(net.minecraft.loot.condition.RandomChanceWithEnchantedBonusLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_53425(Object instance) { return wrapperContained.method_53425(instance); }
// public Object builder(Object registryLookup,float base,float perLevelAboveFirst) { return wrapperContained.builder(registryLookup,base,perLevelAboveFirst); }
// public boolean test(java.lang.Object context) { return wrapperContained.test(context); }

}