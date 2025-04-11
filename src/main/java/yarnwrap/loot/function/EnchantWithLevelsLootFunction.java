package yarnwrap.loot.function;
public class EnchantWithLevelsLootFunction { public net.minecraft.loot.function.EnchantWithLevelsLootFunction wrapperContained; public EnchantWithLevelsLootFunction(net.minecraft.loot.function.EnchantWithLevelsLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.provider.number.LootNumberProvider levels() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.levels); }
// public void levels(yarnwrap.loot.provider.number.LootNumberProvider value) { wrapperContained.levels = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public java.util.Optional options() { return wrapperContained.options; }
// public void options(java.util.Optional value) { wrapperContained.options = value; }
// public Object builder(Object registryLookup,yarnwrap.loot.provider.number.LootNumberProvider levels) { return wrapperContained.builder(registryLookup,levels.wrapperContained); }

}