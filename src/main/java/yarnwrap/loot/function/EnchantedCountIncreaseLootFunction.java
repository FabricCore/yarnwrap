package yarnwrap.loot.function;
public class EnchantedCountIncreaseLootFunction { public net.minecraft.loot.function.EnchantedCountIncreaseLootFunction wrapperContained; public EnchantedCountIncreaseLootFunction(net.minecraft.loot.function.EnchantedCountIncreaseLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.provider.number.LootNumberProvider count() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.count); }
// public void count(yarnwrap.loot.provider.number.LootNumberProvider value) { wrapperContained.count = value.wrapperContained; }
// public static yarnwrap.loot.provider.number.LootNumberProvider count() { return new yarnwrap.loot.provider.number.LootNumberProvider(net.minecraft.loot.function.EnchantedCountIncreaseLootFunction.count); }
// public static void count(yarnwrap.loot.provider.number.LootNumberProvider value, ) { net.minecraft.loot.function.EnchantedCountIncreaseLootFunction.count = value.wrapperContained; }

// public int limit() { return wrapperContained.limit; }
// public void limit(int value) { wrapperContained.limit = value; }
// public static int limit() { return net.minecraft.loot.function.EnchantedCountIncreaseLootFunction.limit; }
// public static void limit(int value, ) { net.minecraft.loot.function.EnchantedCountIncreaseLootFunction.limit = value; }

// public int DEFAULT_LIMIT() { return wrapperContained.DEFAULT_LIMIT; }
// public void DEFAULT_LIMIT(int value) { wrapperContained.DEFAULT_LIMIT = value; }
public static int DEFAULT_LIMIT() { return net.minecraft.loot.function.EnchantedCountIncreaseLootFunction.DEFAULT_LIMIT; }
// public static void DEFAULT_LIMIT(int value, ) { net.minecraft.loot.function.EnchantedCountIncreaseLootFunction.DEFAULT_LIMIT = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.function.EnchantedCountIncreaseLootFunction.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.function.EnchantedCountIncreaseLootFunction.CODEC = value; }

// public yarnwrap.registry.entry.RegistryEntry enchantment() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.enchantment); }
// public void enchantment(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.enchantment = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry enchantment() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.loot.function.EnchantedCountIncreaseLootFunction.enchantment); }
// public static void enchantment(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.loot.function.EnchantedCountIncreaseLootFunction.enchantment = value.wrapperContained; }

// public EnchantedCountIncreaseLootFunction(java.util.List conditions,yarnwrap.registry.entry.RegistryEntry enchantment,yarnwrap.loot.provider.number.LootNumberProvider count,int limit) { this.wrapperContained = new net.minecraft.loot.function.EnchantedCountIncreaseLootFunction(conditions,enchantment.wrapperContained,count.wrapperContained,limit); }
// public Object builder(Object registries,yarnwrap.loot.provider.number.LootNumberProvider count) { return wrapperContained.builder(registries,count.wrapperContained); }
// public static Object builder(Object registries,yarnwrap.loot.provider.number.LootNumberProvider count, ) { return net.minecraft.loot.function.EnchantedCountIncreaseLootFunction.builder(registries,count.wrapperContained); }
// public boolean hasLimit() { return wrapperContained.hasLimit(); }
// public static boolean hasLimit() { return net.minecraft.loot.function.EnchantedCountIncreaseLootFunction.hasLimit(); }
// public java.lang.Integer method_53348(yarnwrap.loot.function.EnchantedCountIncreaseLootFunction function) { return wrapperContained.method_53348(function.wrapperContained); }
// public static java.lang.Integer method_53348(yarnwrap.loot.function.EnchantedCountIncreaseLootFunction function, ) { return net.minecraft.loot.function.EnchantedCountIncreaseLootFunction.method_53348(function.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53349(Object instance) { return wrapperContained.method_53349(instance); }
// public static com.mojang.datafixers.kinds.App method_53349(Object instance, ) { return net.minecraft.loot.function.EnchantedCountIncreaseLootFunction.method_53349(instance); }
// public yarnwrap.loot.provider.number.LootNumberProvider method_53350(yarnwrap.loot.function.EnchantedCountIncreaseLootFunction function) { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.method_53350(function.wrapperContained)); }
// public static yarnwrap.loot.provider.number.LootNumberProvider method_53350(yarnwrap.loot.function.EnchantedCountIncreaseLootFunction function, ) { return new yarnwrap.loot.provider.number.LootNumberProvider(net.minecraft.loot.function.EnchantedCountIncreaseLootFunction.method_53350(function.wrapperContained)); }
// public yarnwrap.registry.entry.RegistryEntry method_60296(yarnwrap.loot.function.EnchantedCountIncreaseLootFunction function) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_60296(function.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntry method_60296(yarnwrap.loot.function.EnchantedCountIncreaseLootFunction function, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.loot.function.EnchantedCountIncreaseLootFunction.method_60296(function.wrapperContained)); }

}