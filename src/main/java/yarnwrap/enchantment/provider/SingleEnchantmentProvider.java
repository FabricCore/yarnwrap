package yarnwrap.enchantment.provider;
public class SingleEnchantmentProvider { public net.minecraft.enchantment.provider.SingleEnchantmentProvider wrapperContained; public SingleEnchantmentProvider(net.minecraft.enchantment.provider.SingleEnchantmentProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}