package yarnwrap.enchantment.effect.entity;
public class DamageEntityEnchantmentEffect { public net.minecraft.enchantment.effect.entity.DamageEntityEnchantmentEffect wrapperContained; public DamageEntityEnchantmentEffect(net.minecraft.enchantment.effect.entity.DamageEntityEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}