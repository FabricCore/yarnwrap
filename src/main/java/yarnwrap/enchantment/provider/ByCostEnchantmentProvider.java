package yarnwrap.enchantment.provider;
public class ByCostEnchantmentProvider { public net.minecraft.enchantment.provider.ByCostEnchantmentProvider wrapperContained; public ByCostEnchantmentProvider(net.minecraft.enchantment.provider.ByCostEnchantmentProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.enchantment.provider.ByCostEnchantmentProvider.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.enchantment.provider.ByCostEnchantmentProvider.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_60268(Object instance) { return wrapperContained.method_60268(instance); }
// public static com.mojang.datafixers.kinds.App method_60268(Object instance, ) { return net.minecraft.enchantment.provider.ByCostEnchantmentProvider.method_60268(instance); }

}