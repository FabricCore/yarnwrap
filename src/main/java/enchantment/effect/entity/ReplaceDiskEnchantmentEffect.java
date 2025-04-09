package yarnwrap.enchantment.effect.entity;
public class ReplaceDiskEnchantmentEffect { public net.minecraft.enchantment.effect.entity.ReplaceDiskEnchantmentEffect wrapperContained; public ReplaceDiskEnchantmentEffect(net.minecraft.enchantment.effect.entity.ReplaceDiskEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}