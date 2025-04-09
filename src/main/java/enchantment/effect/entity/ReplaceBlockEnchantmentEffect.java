package yarnwrap.enchantment.effect.entity;
public class ReplaceBlockEnchantmentEffect { public net.minecraft.enchantment.effect.entity.ReplaceBlockEnchantmentEffect wrapperContained; public ReplaceBlockEnchantmentEffect(net.minecraft.enchantment.effect.entity.ReplaceBlockEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}