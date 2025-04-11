package yarnwrap.enchantment.provider;
public class ByCostEnchantmentProvider { public net.minecraft.enchantment.provider.ByCostEnchantmentProvider wrapperContained; public ByCostEnchantmentProvider(net.minecraft.enchantment.provider.ByCostEnchantmentProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}