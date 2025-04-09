package yarnwrap.enchantment.effect.entity;
public class IgniteEnchantmentEffect { public net.minecraft.enchantment.effect.entity.IgniteEnchantmentEffect wrapperContained; public IgniteEnchantmentEffect(net.minecraft.enchantment.effect.entity.IgniteEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}