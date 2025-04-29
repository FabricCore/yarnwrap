package yarnwrap.loot.condition;
public class RandomChanceLootCondition { public net.minecraft.loot.condition.RandomChanceLootCondition wrapperContained; public RandomChanceLootCondition(net.minecraft.loot.condition.RandomChanceLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.condition.RandomChanceLootCondition.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.condition.RandomChanceLootCondition.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_53424(Object instance) { return wrapperContained.method_53424(instance); }
// public static com.mojang.datafixers.kinds.App method_53424(Object instance, ) { return net.minecraft.loot.condition.RandomChanceLootCondition.method_53424(instance); }
// public Object builder(yarnwrap.loot.provider.number.LootNumberProvider chance) { return wrapperContained.builder(chance.wrapperContained); }
// public static Object builder(yarnwrap.loot.provider.number.LootNumberProvider chance, ) { return net.minecraft.loot.condition.RandomChanceLootCondition.builder(chance.wrapperContained); }
// public Object builder(float chance) { return wrapperContained.builder(chance); }
// public static Object builder(float chance, ) { return net.minecraft.loot.condition.RandomChanceLootCondition.builder(chance); }
// public boolean test(java.lang.Object context) { return wrapperContained.test(context); }
// public static boolean test(java.lang.Object context, ) { return net.minecraft.loot.condition.RandomChanceLootCondition.test(context); }

}