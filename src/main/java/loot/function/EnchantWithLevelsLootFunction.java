package yarnwrap.loot.function;
public class EnchantWithLevelsLootFunction { public net.minecraft.loot.function.EnchantWithLevelsLootFunction wrapperContained; public EnchantWithLevelsLootFunction(net.minecraft.loot.function.EnchantWithLevelsLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.provider.number.LootNumberProvider levels() { return new yarnwrap.loot.provider.number.LootNumberProvider(wrapperContained.levels); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public java.util.Optional options() { return wrapperContained.options; }
// public Object builder(Object registryLookup,yarnwrap.loot.provider.number.LootNumberProvider levels) { return wrapperContained.builder(registryLookup,levels.wrapperContained); }

}