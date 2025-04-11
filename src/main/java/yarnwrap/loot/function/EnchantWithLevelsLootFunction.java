package yarnwrap.loot.function;
public class EnchantWithLevelsLootFunction { public net.minecraft.loot.function.EnchantWithLevelsLootFunction wrapperContained; public EnchantWithLevelsLootFunction(net.minecraft.loot.function.EnchantWithLevelsLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.provider.number.LootNumberProvider levels() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.levels); }
// public void levels(yarnwrap.loot.provider.number.LootNumberProvider value) { wrapperContained.levels = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public java.util.Optional options() { return wrapperContained.options; }
// public void options(java.util.Optional value) { wrapperContained.options = value; }
// public EnchantWithLevelsLootFunction(java.util.List conditions,yarnwrap.loot.provider.number.LootNumberProvider levels,java.util.Optional options) { this.wrapperContained = new net.minecraft.loot.function.EnchantWithLevelsLootFunction(conditions,levels.wrapperContained,options); }
// public Object builder(Object registryLookup,yarnwrap.loot.provider.number.LootNumberProvider levels) { return wrapperContained.builder(registryLookup,levels.wrapperContained); }
// public java.util.Optional method_53329(yarnwrap.loot.function.EnchantWithLevelsLootFunction function) { return wrapperContained.method_53329(function.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53330(Object instance) { return wrapperContained.method_53330(instance); }
// public yarnwrap.loot.provider.number.LootNumberProvider method_53331(yarnwrap.loot.function.EnchantWithLevelsLootFunction function) { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.method_53331(function.wrapperContained)); }

}