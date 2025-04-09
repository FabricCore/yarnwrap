package yarnwrap.enchantment.effect.entity;
public class DamageItemEnchantmentEffect { public net.minecraft.enchantment.effect.entity.DamageItemEnchantmentEffect wrapperContained; public DamageItemEnchantmentEffect(net.minecraft.enchantment.effect.entity.DamageItemEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}