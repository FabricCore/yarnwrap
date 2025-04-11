package yarnwrap.enchantment.provider;
public class SingleEnchantmentProvider { public net.minecraft.enchantment.provider.SingleEnchantmentProvider wrapperContained; public SingleEnchantmentProvider(net.minecraft.enchantment.provider.SingleEnchantmentProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_60270(Object instance) { return wrapperContained.method_60270(instance); }

}