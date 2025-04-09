package yarnwrap.loot.function;
public class EnchantedCountIncreaseLootFunction { public net.minecraft.loot.function.EnchantedCountIncreaseLootFunction wrapperContained; public EnchantedCountIncreaseLootFunction(net.minecraft.loot.function.EnchantedCountIncreaseLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.provider.number.LootNumberProvider count() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.count); }
// public int limit() { return wrapperContained.limit; }
public int DEFAULT_LIMIT() { return wrapperContained.DEFAULT_LIMIT; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.registry.entry.RegistryEntry enchantment() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.enchantment); }
// public Object builder(Object registryLookup,yarnwrap.loot.provider.number.LootNumberProvider count) { return wrapperContained.builder(registryLookup,count.wrapperContained); }
// public boolean hasLimit() { return wrapperContained.hasLimit(); }

}