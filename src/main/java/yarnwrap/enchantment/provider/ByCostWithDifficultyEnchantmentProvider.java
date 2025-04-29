package yarnwrap.enchantment.provider;
public class ByCostWithDifficultyEnchantmentProvider { public net.minecraft.enchantment.provider.ByCostWithDifficultyEnchantmentProvider wrapperContained; public ByCostWithDifficultyEnchantmentProvider(net.minecraft.enchantment.provider.ByCostWithDifficultyEnchantmentProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.enchantment.provider.ByCostWithDifficultyEnchantmentProvider.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.enchantment.provider.ByCostWithDifficultyEnchantmentProvider.CODEC = value; }

// public int MAX_COST() { return wrapperContained.MAX_COST; }
// public void MAX_COST(int value) { wrapperContained.MAX_COST = value; }
public static int MAX_COST() { return net.minecraft.enchantment.provider.ByCostWithDifficultyEnchantmentProvider.MAX_COST; }
// public static void MAX_COST(int value, ) { net.minecraft.enchantment.provider.ByCostWithDifficultyEnchantmentProvider.MAX_COST = value; }

// public com.mojang.datafixers.kinds.App method_60269(Object instance) { return wrapperContained.method_60269(instance); }
// public static com.mojang.datafixers.kinds.App method_60269(Object instance, ) { return net.minecraft.enchantment.provider.ByCostWithDifficultyEnchantmentProvider.method_60269(instance); }

}