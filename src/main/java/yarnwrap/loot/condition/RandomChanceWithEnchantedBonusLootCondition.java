package yarnwrap.loot.condition;
public class RandomChanceWithEnchantedBonusLootCondition { public net.minecraft.loot.condition.RandomChanceWithEnchantedBonusLootCondition wrapperContained; public RandomChanceWithEnchantedBonusLootCondition(net.minecraft.loot.condition.RandomChanceWithEnchantedBonusLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.condition.RandomChanceWithEnchantedBonusLootCondition.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.condition.RandomChanceWithEnchantedBonusLootCondition.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_53425(Object instance) { return wrapperContained.method_53425(instance); }
// public static com.mojang.datafixers.kinds.App method_53425(Object instance, ) { return net.minecraft.loot.condition.RandomChanceWithEnchantedBonusLootCondition.method_53425(instance); }
// public Object builder(Object registryLookup,float base,float perLevelAboveFirst) { return wrapperContained.builder(registryLookup,base,perLevelAboveFirst); }
// public static Object builder(Object registryLookup,float base,float perLevelAboveFirst, ) { return net.minecraft.loot.condition.RandomChanceWithEnchantedBonusLootCondition.builder(registryLookup,base,perLevelAboveFirst); }
// public boolean test(java.lang.Object context) { return wrapperContained.test(context); }
// public static boolean test(java.lang.Object context, ) { return net.minecraft.loot.condition.RandomChanceWithEnchantedBonusLootCondition.test(context); }

}