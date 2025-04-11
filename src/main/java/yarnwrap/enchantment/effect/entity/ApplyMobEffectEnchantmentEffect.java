package yarnwrap.enchantment.effect.entity;
public class ApplyMobEffectEnchantmentEffect { public net.minecraft.enchantment.effect.entity.ApplyMobEffectEnchantmentEffect wrapperContained; public ApplyMobEffectEnchantmentEffect(net.minecraft.enchantment.effect.entity.ApplyMobEffectEnchantmentEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}