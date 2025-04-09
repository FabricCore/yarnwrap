package yarnwrap.enchantment.provider;
public class ByCostWithDifficultyEnchantmentProvider { public net.minecraft.enchantment.provider.ByCostWithDifficultyEnchantmentProvider wrapperContained; public ByCostWithDifficultyEnchantmentProvider(net.minecraft.enchantment.provider.ByCostWithDifficultyEnchantmentProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public int MAX_COST() { return wrapperContained.MAX_COST; }

}