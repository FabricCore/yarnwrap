package yarnwrap.loot.provider.number;
public class EnchantmentLevelLootNumberProvider { public net.minecraft.loot.provider.number.EnchantmentLevelLootNumberProvider wrapperContained; public EnchantmentLevelLootNumberProvider(net.minecraft.loot.provider.number.EnchantmentLevelLootNumberProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_60312(Object instance) { return wrapperContained.method_60312(instance); }
public yarnwrap.loot.provider.number.EnchantmentLevelLootNumberProvider create(yarnwrap.enchantment.EnchantmentLevelBasedValue amount) { return new yarnwrap.loot.provider.number.EnchantmentLevelLootNumberProvider(wrapperContained.create(amount.wrapperContained)); }

}