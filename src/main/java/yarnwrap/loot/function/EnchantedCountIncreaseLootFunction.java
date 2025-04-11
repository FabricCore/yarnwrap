package yarnwrap.loot.function;
public class EnchantedCountIncreaseLootFunction { public net.minecraft.loot.function.EnchantedCountIncreaseLootFunction wrapperContained; public EnchantedCountIncreaseLootFunction(net.minecraft.loot.function.EnchantedCountIncreaseLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.provider.number.LootNumberProvider count() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.count); }
// public void count(yarnwrap.loot.provider.number.LootNumberProvider value) { wrapperContained.count = value.wrapperContained; }
// public int limit() { return wrapperContained.limit; }
// public void limit(int value) { wrapperContained.limit = value; }
public int DEFAULT_LIMIT() { return wrapperContained.DEFAULT_LIMIT; }
// public void DEFAULT_LIMIT(int value) { wrapperContained.DEFAULT_LIMIT = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.registry.entry.RegistryEntry enchantment() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.enchantment); }
// public void enchantment(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.enchantment = value.wrapperContained; }
// public Object builder(Object registryLookup,yarnwrap.loot.provider.number.LootNumberProvider count) { return wrapperContained.builder(registryLookup,count.wrapperContained); }
// public boolean hasLimit() { return wrapperContained.hasLimit(); }

}